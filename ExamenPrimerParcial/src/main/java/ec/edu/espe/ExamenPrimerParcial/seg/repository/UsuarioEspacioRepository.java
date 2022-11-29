package ec.edu.espe.ExamenPrimerParcial.seg.repository;

import ec.edu.espe.ExamenPrimerParcial.seg.model.UsuarioEspacio;
import ec.edu.espe.ExamenPrimerParcial.seg.model.UsuarioEspacioPk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioEspacioRepository extends JpaRepository<UsuarioEspacio, UsuarioEspacioPk> {

    List<UsuarioEspacio> findByPkCodespacio(Number codespacio);

}
