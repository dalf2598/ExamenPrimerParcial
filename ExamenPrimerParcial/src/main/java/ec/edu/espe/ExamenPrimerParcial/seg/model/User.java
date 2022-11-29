package ec.edu.espe.ExamenPrimerParcial.seg.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "SEG_USER")
public class User {

    @Id
    @Column(name = "COD_USER", nullable = false)
    private Number codUser;

    @Column(name = "USERNAME", length = 32, nullable = false)
    private String username;

    @Column(name = "NAME", length = 128, nullable = false)
    private String name;

    @Column(name = "EMAIL", length = 128, nullable = false)
    private String email;

    @Column(name = "STATUS", length = 3, nullable = false)
    private String status;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATION_DATE", nullable = false)
    private Date creationDate;
}
