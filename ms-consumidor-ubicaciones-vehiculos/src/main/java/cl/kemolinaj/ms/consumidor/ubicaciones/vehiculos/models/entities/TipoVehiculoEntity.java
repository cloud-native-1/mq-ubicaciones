package cl.kemolinaj.ms.consumidor.ubicaciones.vehiculos.models.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TIPO_VEHICULO")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TipoVehiculoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_TIPO_VEHICULO")
    @SequenceGenerator(
            name = "SEQ_TIPO_VEHICULO",
            sequenceName = "SEQ_TIPO_VEHICULO",
            allocationSize = 1
    )
    @Column(name = "id_tipo_veh")
    private Long id;

    @Column(name = "tipo_vehiculo")
    @NotNull(message = "Tipo de Vehiculo no puede ser nulo")
    @Size(min = 5, max = 30, message = "Tipo de Vehiculo debe tener entre 5 y 30 caracteres")
    private String tipoVehiculo;
}
