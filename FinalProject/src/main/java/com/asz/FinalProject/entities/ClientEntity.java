package com.asz.FinalProject.entities;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "client")
@Data
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
