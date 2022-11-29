package ec.edu.espe.ExamenPrimerParcial.seg.service;

import ec.edu.espe.ExamenPrimerParcial.seg.model.User;

import java.util.List;

public interface UserService {
    List<User> listByStatus(String status);
}
