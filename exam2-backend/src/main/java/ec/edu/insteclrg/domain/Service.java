package ec.edu.insteclrg.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "servicio")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;

    @Column(unique = true, nullable = false)
    private String description;
}
