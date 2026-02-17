package cl.kemolinaj.ms.productor.ubicaciones.vehiculos.services.impl;

import cl.kemolinaj.ms.productor.ubicaciones.vehiculos.config.RabbitMqConfig;
import cl.kemolinaj.ms.productor.ubicaciones.vehiculos.dtos.UbicacionRqDto;
import cl.kemolinaj.ms.productor.ubicaciones.vehiculos.services.MqService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service("mqService")
@RequiredArgsConstructor
public class MqServiceImpl implements MqService {
    private final RabbitTemplate rabbitTemplate;

    @Override
    public void send(UbicacionRqDto rqDto) {
        rabbitTemplate.convertAndSend(RabbitMqConfig.EXCHANGE, RabbitMqConfig.KEY, rqDto);
    }
}
