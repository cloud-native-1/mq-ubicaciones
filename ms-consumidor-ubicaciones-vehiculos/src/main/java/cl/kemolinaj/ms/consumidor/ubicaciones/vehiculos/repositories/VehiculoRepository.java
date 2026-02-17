package cl.kemolinaj.ms.consumidor.ubicaciones.vehiculos.repositories;

import cl.kemolinaj.ms.consumidor.ubicaciones.vehiculos.models.entities.VehiculoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("vehiculoRepository")
public interface VehiculoRepository extends CrudRepository<VehiculoEntity, String> {
}
