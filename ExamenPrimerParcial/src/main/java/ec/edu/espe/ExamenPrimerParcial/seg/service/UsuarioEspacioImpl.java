package ec.edu.espe.ExamenPrimerParcial.seg.service;

import ec.edu.espe.ExamenPrimerParcial.seg.model.UsuarioEspacio;
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

}
