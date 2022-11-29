package ec.edu.espe.ExamenPrimerParcial.gdc.service;

import ec.edu.espe.ExamenPrimerParcial.gdc.model.Espacio;
import ec.edu.espe.ExamenPrimerParcial.gdc.repository.EspacioRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EspacioServiceImpl implements EspacioService{

    final EspacioRepository espacioRepository;

    public EspacioServiceImpl(EspacioRepository espacioRepository) {
        this.espacioRepository = espacioRepository;
    }

    @Override
    public List<Espacio> greaterThanDate(Date date){
        return espacioRepository.findByStartGreaterThan(date);
    }
}
