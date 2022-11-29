package ec.edu.espe.ExamenPrimerParcial.seg.service;

import ec.edu.espe.ExamenPrimerParcial.seg.model.UsuarioEspacio;
import ec.edu.espe.ExamenPrimerParcial.seg.model.UsuarioEspacioPk;
import ec.edu.espe.ExamenPrimerParcial.seg.repository.UsuarioEspacioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioEspacioImpl implements UsuarioEspacioService{

    final UsuarioEspacioRepository usuarioEspacioRepository;

    public UsuarioEspacioImpl(UsuarioEspacioRepository usuarioEspacioRepository) {
        this.usuarioEspacioRepository = usuarioEspacioRepository;
    }

    @Override
    public List<UsuarioEspacio> listBySpaceCode(Number codespacio){
        return usuarioEspacioRepository.findByPkCodespacio(codespacio);
    }
    @Override
    public Object insertUsuarioEspacio(UsuarioEspacio usuarioEspacio){
        return usuarioEspacioRepository.save(usuarioEspacio);
    }
    @Override
    public Object readUsuarioEspacio(UsuarioEspacioPk pk){
        return usuarioEspacioRepository.findById(pk);
    }
    @Override
    public Object updateUsuarioEspacio(UsuarioEspacio usuarioEspacio){
        return usuarioEspacioRepository.save(usuarioEspacio);
    }
    @Override
    public void deleteUsuarioEspacio(UsuarioEspacio usuarioEspacio){
        usuarioEspacioRepository.delete(usuarioEspacio);
    }

}
