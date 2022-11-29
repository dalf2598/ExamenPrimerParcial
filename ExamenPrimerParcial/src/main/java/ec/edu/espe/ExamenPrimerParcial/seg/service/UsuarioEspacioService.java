package ec.edu.espe.ExamenPrimerParcial.seg.service;

import ec.edu.espe.ExamenPrimerParcial.seg.model.UsuarioEspacio;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UsuarioEspacioService {

    List<UsuarioEspacio> listBySpaceCode(Number codespacio);
}
