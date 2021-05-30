package com.asz.FinalProject.entities;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "client")
@Getter
@Setter
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToOne(mappedBy = "clientEntity", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private AddressEntity addressEntity;

    @OneToMany(mappedBy = "clientEntity")
    private Set<OrdersEntity> ordersEntities;
}
