package ec.edu.espe.ExamenPrimerParcial.seg.service;

import ec.edu.espe.ExamenPrimerParcial.seg.model.User;
import ec.edu.espe.ExamenPrimerParcial.seg.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> listByStatus(String status){
        return userRepository.findAllByStatus(status);
    }
}
