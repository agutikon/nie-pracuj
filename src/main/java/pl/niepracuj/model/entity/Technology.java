package pl.niepracuj.model.entity;


import javax.persistence.*;

@Entity
@Table
public class Technology {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;


}
