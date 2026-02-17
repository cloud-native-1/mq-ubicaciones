package cl.kemolinaj.ms.consumidor.ubicaciones.vehiculos.models.dtos;

import io.soabase.recordbuilder.core.RecordBuilder;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.PropertyNamingStrategies;
import tools.jackson.databind.annotation.JsonNaming;

@RecordBuilder
@JsonNaming(PropertyNamingStrategies.LowerCamelCaseStrategy.class)
public record UbicacionRqDto(
        @NotNull(message = "Latitud no puede ser nula")
        Integer latitud,

        @NotNull(message = "Longitud no puede ser nula")
        Integer longitud,

        @NotNull(message = "Velocidad no puede ser nula")
        Integer velocidad,

        @NotNull(message = "Patente no puede ser nula")
        String patente
) {
}
