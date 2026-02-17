package cl.kemolinaj.ms.consumidor.ubicaciones.vehiculos.repositories;

import cl.kemolinaj.ms.consumidor.ubicaciones.vehiculos.models.entities.UbicacionEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("unicacionRepository")
public interface UbicacionRepository extends CrudRepository<UbicacionEntity, Long> {
}
