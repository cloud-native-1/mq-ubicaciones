package cl.kemolinaj.ms.productor.ubicaciones.vehiculos.services;

import cl.kemolinaj.ms.productor.ubicaciones.vehiculos.dtos.UbicacionRqDto;

public interface MqService {
    void send(UbicacionRqDto message);
}
