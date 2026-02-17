package cl.kemolinaj.ms.consumidor.ubicaciones.vehiculos.models.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "VEHICULO")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VehiculoEntity {
    @Id
    @Column(name = "patente")
    @Size(min = 6, max = 6, message = "Patente debe tener 6 caracteres")
    private String patente;

    @Column(name = "marca")
    @NotNull(message = "Marca no puede ser nula")
    private String marca;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_tipo_veh")
    @NotNull(message = "Tipo de Vehiculo no puede ser nulo")
    private TipoVehiculoEntity tipoVehiculo;
}
