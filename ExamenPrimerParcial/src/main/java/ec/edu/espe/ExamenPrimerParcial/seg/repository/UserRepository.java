package ec.edu.espe.ExamenPrimerParcial.seg.repository;

import ec.edu.espe.ExamenPrimerParcial.seg.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Number> {
    List<User> findAllByStatus(String status);
}
