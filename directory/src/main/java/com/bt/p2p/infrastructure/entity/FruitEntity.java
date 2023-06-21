package com.bt.p2p.infrastructure.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;

@Entity
@Table(name = "fruit", schema = "dbo")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FruitEntity {
    @Id
    @Column(name = "ID", columnDefinition = "NUMERIC(18,0)")
    private BigInteger idFruit;

    private String name;
}
