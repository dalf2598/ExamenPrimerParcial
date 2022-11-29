package ec.edu.espe.ExamenPrimerParcial.seg.service;

import ec.edu.espe.ExamenPrimerParcial.seg.model.User;

import java.util.List;

public interface UserService {
    List<User> listByStatus(String status);

    Object insertUser(User user);
    Object readUser(Number codUser);
    Object updateUser(User user);
    void deleteUser(User user);
}
