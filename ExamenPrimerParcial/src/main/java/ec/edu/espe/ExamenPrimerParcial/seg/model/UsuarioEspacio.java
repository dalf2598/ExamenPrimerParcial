package ec.edu.espe.ExamenPrimerParcial.seg.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name = "SEG_USUARIO_ESPACIO")
public class UsuarioEspacio {

    @EmbeddedId
    private UsuarioEspacioPk pk;

    @Column(name = "ROL", length = 3, nullable = false)
    private String rol;

    @Column(name = "ESTADO", length = 3, nullable = false)
    private String estado;
}
