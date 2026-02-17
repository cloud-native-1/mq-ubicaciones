package cl.kemolinaj.ms.consumidor.ubicaciones.vehiculos.models.dtos;

import io.soabase.recordbuilder.core.RecordBuilder;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import tools.jackson.databind.PropertyNamingStrategies;
import tools.jackson.databind.annotation.JsonNaming;

@RecordBuilder
@JsonNaming(PropertyNamingStrategies.LowerCamelCaseStrategy.class)
public record VehiculoFindRqDto (
        @NotNull(message = "Patente no puede ser nula")
        @Size(min = 6, max = 6, message = "Patente debe tener 6 caracteres")
        String patente
) {
}
