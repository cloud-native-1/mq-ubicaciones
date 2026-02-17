package cl.kemolinaj.ms.consumidor.ubicaciones.vehiculos.models.mappers;

import cl.kemolinaj.ms.consumidor.ubicaciones.vehiculos.models.dtos.VehiculoRsDto;
import cl.kemolinaj.ms.consumidor.ubicaciones.vehiculos.models.entities.VehiculoEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {TipoVehiculoMapper.class})
public interface VehiculoMapper {
    VehiculoRsDto vehiculoToVehiculoRsDto(VehiculoEntity entity);
}
