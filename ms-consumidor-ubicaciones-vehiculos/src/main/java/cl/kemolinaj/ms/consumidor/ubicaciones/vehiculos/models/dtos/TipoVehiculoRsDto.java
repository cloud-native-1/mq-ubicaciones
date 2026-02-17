package cl.kemolinaj.ms.consumidor.ubicaciones.vehiculos.models.dtos;

import io.soabase.recordbuilder.core.RecordBuilder;
import tools.jackson.databind.PropertyNamingStrategies;
import tools.jackson.databind.annotation.JsonNaming;

@RecordBuilder
@JsonNaming(PropertyNamingStrategies.LowerCamelCaseStrategy.class)
public record TipoVehiculoRsDto(
        Long id,
        String tipoVehiculo
) {
}
