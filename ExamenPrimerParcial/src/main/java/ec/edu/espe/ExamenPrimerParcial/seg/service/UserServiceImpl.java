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

    @Override
    public Object insertUser(User user){
        return userRepository.save(user);
    }

    @Override
    public Object readUser(Number codUser){
        return userRepository.findById(codUser);
    }
    @Override
    public Object updateUser(User user){
        return userRepository.save(user);
    }
    @Override
    public void deleteUser(User user){
        userRepository.delete(user);
    }
}
