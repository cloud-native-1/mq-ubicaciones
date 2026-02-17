package cl.kemolinaj.ms.consumidor.ubicaciones.vehiculos.models.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "UBICACION")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UbicacionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_UBICACION")
    @SequenceGenerator(
            name = "SEQ_UBICACION",
            sequenceName = "SEQ_UBICACION",
            allocationSize = 1
    )
    @Column(name = "id_ubicacion")
    private Long idUbicacion;

    @Column(name = "latitud")
    @NotNull(message = "Latitud no puede ser nula")
    private Integer latitud;

    @Column(name = "longitud")
    @NotNull(message = "Longitud no puede ser nula")
    private Integer longitud;

    @Column(name = "velocidad")
    @NotNull(message = "Velocidad no puede ser nula")
    private Integer velocidad;

    @Column(name = "fecha_hora")
    @NotNull(message = "Fecha y hora no pueden ser nulas")
    private LocalDate fechaHora;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "patente")
    @NotNull(message = "Patente no puede ser nula")
    private VehiculoEntity vehiculo;
}
