package ec.edu.espe.ExamenPrimerParcial.gdc.service;

import ec.edu.espe.ExamenPrimerParcial.gdc.model.EspacioHistorial;
import ec.edu.espe.ExamenPrimerParcial.gdc.repository.EspacioHistorialRepository;
import org.springframework.stereotype.Service;

@Service
public class EspacioHistorialServiceImpl implements EspacioHistorialService{

    final
    EspacioHistorialRepository espacioHistorialRepository;

    public EspacioHistorialServiceImpl(EspacioHistorialRepository espacioHistorialRepository) {
        this.espacioHistorialRepository = espacioHistorialRepository;
    }

    @Override
    public Object insertEspacioHistorial(EspacioHistorial espacio){
        return espacioHistorialRepository.save(espacio);
    }
    @Override
    public Object readEspacioHistorial(Number codespaciohistorial){
        return espacioHistorialRepository.findById(codespaciohistorial);
    }
    @Override
    public Object updateEspacioHistorial(EspacioHistorial espacio){
        return espacioHistorialRepository.save(espacio);
    }
    @Override
    public void deleteEspacioHistorial(EspacioHistorial espacio){
        espacioHistorialRepository.delete(espacio);
    }
}
