package ec.edu.espe.ExamenPrimerParcial.gdc.repository;

import ec.edu.espe.ExamenPrimerParcial.gdc.model.Espacio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface EspacioRepository extends JpaRepository<Espacio, Number> {
    List<Espacio> findByStartGreaterThan(Date date);
}
