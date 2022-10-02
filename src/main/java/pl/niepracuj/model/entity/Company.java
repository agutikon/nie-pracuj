package pl.niepracuj.model.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "companies")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String address;
    private int size;

//@OneToMany
//    @JoinTable(
//            name = "advertisements",
//            joinColumns = @JoinColumn( name = "advertisement_id"),
//
//    )
}
