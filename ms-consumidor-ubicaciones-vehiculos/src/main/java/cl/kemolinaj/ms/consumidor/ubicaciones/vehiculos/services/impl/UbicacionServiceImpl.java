package cl.kemolinaj.ms.consumidor.ubicaciones.vehiculos.services.impl;

import cl.kemolinaj.ms.consumidor.ubicaciones.vehiculos.config.RabbitMqConfig;
import cl.kemolinaj.ms.consumidor.ubicaciones.vehiculos.models.dtos.UbicacionRqDto;
import cl.kemolinaj.ms.consumidor.ubicaciones.vehiculos.models.dtos.UbicacionRsDto;
import cl.kemolinaj.ms.consumidor.ubicaciones.vehiculos.models.dtos.VehiculoFindRqDto;
import cl.kemolinaj.ms.consumidor.ubicaciones.vehiculos.models.entities.UbicacionEntity;
import cl.kemolinaj.ms.consumidor.ubicaciones.vehiculos.models.entities.VehiculoEntity;
import cl.kemolinaj.ms.consumidor.ubicaciones.vehiculos.models.mappers.UbicacionMapper;
import cl.kemolinaj.ms.consumidor.ubicaciones.vehiculos.repositories.UbicacionRepository;
import cl.kemolinaj.ms.consumidor.ubicaciones.vehiculos.repositories.VehiculoRepository;
import cl.kemolinaj.ms.consumidor.ubicaciones.vehiculos.services.UbicacionService;
import com.rabbitmq.client.Channel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;

@Slf4j
@Service("ubicacionService")
@RequiredArgsConstructor
public class UbicacionServiceImpl implements UbicacionService {

    private final UbicacionRepository repository;
    private final UbicacionMapper mapper;

    private final VehiculoRepository vehiculoRepository;

    @RabbitListener(queues = RabbitMqConfig.QUEUE_NAME, ackMode = "MANUAL")
    @Override
    public void escucharCola(UbicacionRqDto rqDto, Message message, Channel channel) throws IOException {
        log.info("Service - Ingresando una nueva ubicacion");
        Optional<VehiculoEntity> vehiculoEntity = vehiculoRepository.findById(rqDto.patente());
        if (vehiculoEntity.isPresent()) {
            channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
            log.info("Acknowledge OK enviado");
        }
        UbicacionEntity entity = mapper.dtoToUbicacionEntity(rqDto);
        entity.setVehiculo(vehiculoEntity.get());
        entity.setFechaHora(LocalDateTime.now());
        mapper.entityToUbicacionRsDto(repository.save(entity));
        log.info("Service - Ubicacion ingresada");
    }
}
