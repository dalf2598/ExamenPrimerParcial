package ec.edu.espe.ExamenPrimerParcial.gdc.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "GDC_ESPACIO")
public class Espacio {

    @Id
    @Column(name = "COD_ESPACIO", nullable = false)
    private Number codEspacio;

    @Column(name = "NOMBRE", length = 128, nullable = false)
    private String nombre;

    @Column(name = "DESCRIPCION", length = 500, nullable = false)
    private String descripcion ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_CREACION", nullable = false)
    private Date fechaCreacion;

    @Column(name = "VISIBILIDAD", length = 3, nullable = false)
    private String visibilidad;
}
