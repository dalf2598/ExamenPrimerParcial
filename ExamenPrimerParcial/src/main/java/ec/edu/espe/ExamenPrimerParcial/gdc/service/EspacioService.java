package ec.edu.espe.ExamenPrimerParcial.gdc.service;

import ec.edu.espe.ExamenPrimerParcial.gdc.model.Espacio;
import ec.edu.espe.ExamenPrimerParcial.seg.model.UsuarioEspacio;
import ec.edu.espe.ExamenPrimerParcial.seg.model.UsuarioEspacioPk;

import java.util.Date;
import java.util.List;

public interface EspacioService {
    List<Espacio> greaterThanDate(Date date);

    Object insertEspacio(Espacio espacio);
    Object readEspacio(Number codespacio);
    Object updateEspacio(Espacio espacio);
    void deleteEspacio(Espacio espacio);
}
