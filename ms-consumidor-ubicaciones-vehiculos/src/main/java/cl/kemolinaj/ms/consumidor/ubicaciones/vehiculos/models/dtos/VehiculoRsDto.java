package cl.kemolinaj.ms.consumidor.ubicaciones.vehiculos.models.dtos;

import io.soabase.recordbuilder.core.RecordBuilder;
import tools.jackson.databind.PropertyNamingStrategies;
import tools.jackson.databind.annotation.JsonNaming;

import java.util.List;

@RecordBuilder
@JsonNaming(PropertyNamingStrategies.LowerCamelCaseStrategy.class)
public record VehiculoRsDto(
        String patente,
        String marca,
        TipoVehiculoRsDto tipoVehiculo
) {
}
