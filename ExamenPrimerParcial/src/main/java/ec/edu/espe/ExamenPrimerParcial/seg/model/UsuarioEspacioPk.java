package ec.edu.espe.ExamenPrimerParcial.seg.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
public class UsuarioEspacioPk implements Serializable {

    @Column(name = "COD_ESPACIO", nullable = false)
    private Number codespacio;

    @Column(name = "COD_USER", nullable = false)
    private Number coduser;

}
