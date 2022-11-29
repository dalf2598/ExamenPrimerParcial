package ec.edu.espe.ExamenPrimerParcial.gdc.service;

import ec.edu.espe.ExamenPrimerParcial.gdc.model.Espacio;

import java.util.Date;
import java.util.List;

public interface EspacioService {
    List<Espacio> greaterThanDate(Date date);
}
