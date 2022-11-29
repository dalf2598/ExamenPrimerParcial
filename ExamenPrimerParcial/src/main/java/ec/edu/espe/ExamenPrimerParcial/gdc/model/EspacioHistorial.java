package ec.edu.espe.ExamenPrimerParcial.gdc.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "GDC_ESPACIO_HISTORIAL")
public class EspacioHistorial {
    @Id
    @Column(name = "COD_ESPACIO_HISTORIAL", nullable = false)
    private Number codEspacioHistorial;

    @ManyToOne
    @JoinColumn(name = "COD_ESPACIO")
    Espacio espacio;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA", nullable = false)
    private Date fecha;

    @Column(name = "ACCION", length = 8, nullable = false)
    private String accion;

    @Column(name = "USERNAME", length = 32, nullable = false)
    private String username;

    @Column(name = "DESCRIPCION", length = 128, nullable = false)
    private String descripcion;
}
