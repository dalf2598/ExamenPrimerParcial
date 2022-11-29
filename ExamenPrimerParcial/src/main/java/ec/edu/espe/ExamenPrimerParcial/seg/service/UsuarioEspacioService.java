package ec.edu.espe.ExamenPrimerParcial.seg.service;

import ec.edu.espe.ExamenPrimerParcial.seg.model.User;
import ec.edu.espe.ExamenPrimerParcial.seg.model.UsuarioEspacio;
import ec.edu.espe.ExamenPrimerParcial.seg.model.UsuarioEspacioPk;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UsuarioEspacioService {

    List<UsuarioEspacio> listBySpaceCode(Number codespacio);
    Object insertUsuarioEspacio(UsuarioEspacio usuarioEspacio);
    Object readUsuarioEspacio(UsuarioEspacioPk pk);
    Object updateUsuarioEspacio(UsuarioEspacio usuarioEspacio);
    void deleteUsuarioEspacio(UsuarioEspacio usuarioEspacio);
}
