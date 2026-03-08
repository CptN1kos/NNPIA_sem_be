package org.example.entity;

import lombok.*;
import org.example.enums.ProcedureValidity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Procedure {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column(unique = true)
    private String name;

    @NotNull
    @Column
    private String description;

    @NotNull
    @Column
    private Double length;

    @NotNull
    @Column
    private Integer price;

    @NotNull
    @Enumerated(EnumType.STRING)
    @ColumnDefault("'INACTIVE'")
    private ProcedureValidity status;

}
