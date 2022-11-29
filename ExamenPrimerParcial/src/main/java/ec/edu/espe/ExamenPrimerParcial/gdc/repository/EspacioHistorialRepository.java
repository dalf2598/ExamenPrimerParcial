package ec.edu.espe.ExamenPrimerParcial.gdc.repository;

import ec.edu.espe.ExamenPrimerParcial.gdc.model.EspacioHistorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspacioHistorialRepository extends JpaRepository<EspacioHistorial, Number> {

}
