package cl.kemolinaj.ms.consumidor.ubicaciones.vehiculos.models.mappers;

import cl.kemolinaj.ms.consumidor.ubicaciones.vehiculos.models.dtos.UbicacionRqDto;
import cl.kemolinaj.ms.consumidor.ubicaciones.vehiculos.models.dtos.UbicacionRsDto;
import cl.kemolinaj.ms.consumidor.ubicaciones.vehiculos.models.entities.UbicacionEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",
        uses = {VehiculoMapper.class})
public interface UbicacionMapper {
    UbicacionEntity dtoToUbicacionEntity(UbicacionRqDto dtoRq);
    UbicacionRsDto entityToUbicacionRsDto(UbicacionEntity entity);
}
