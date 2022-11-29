package ec.edu.espe.ExamenPrimerParcial.gdc.service;

import ec.edu.espe.ExamenPrimerParcial.gdc.model.Espacio;
import ec.edu.espe.ExamenPrimerParcial.gdc.model.EspacioHistorial;

public interface EspacioHistorialService {
    Object insertEspacioHistorial(EspacioHistorial espacio);
    Object readEspacioHistorial(Number codespaciohistorial);
    Object updateEspacioHistorial(EspacioHistorial espacio);
    void deleteEspacioHistorial(EspacioHistorial espacio);
}
