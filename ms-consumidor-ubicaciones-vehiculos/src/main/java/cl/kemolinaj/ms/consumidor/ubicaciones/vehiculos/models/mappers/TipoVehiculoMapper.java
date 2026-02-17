package cl.kemolinaj.ms.consumidor.ubicaciones.vehiculos.models.mappers;

import cl.kemolinaj.ms.consumidor.ubicaciones.vehiculos.models.dtos.TipoVehiculoRsDto;
import cl.kemolinaj.ms.consumidor.ubicaciones.vehiculos.models.entities.TipoVehiculoEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TipoVehiculoMapper {
    TipoVehiculoRsDto tipoVehiculoToTipoVehiculoRsDto(TipoVehiculoEntity entity);
}
