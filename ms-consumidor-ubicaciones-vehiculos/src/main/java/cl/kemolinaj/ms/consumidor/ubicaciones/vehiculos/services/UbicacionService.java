package cl.kemolinaj.ms.consumidor.ubicaciones.vehiculos.services;

import cl.kemolinaj.ms.consumidor.ubicaciones.vehiculos.models.dtos.UbicacionRqDto;
import cl.kemolinaj.ms.consumidor.ubicaciones.vehiculos.models.dtos.UbicacionRsDto;
import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;

import java.io.IOException;

public interface UbicacionService {
    void escucharCola(UbicacionRqDto rqDto, Message message, Channel channel) throws IOException;
}
