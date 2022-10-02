package pl.niepracuj.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "seniority")
public class Seniority {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private  Long id;
private String name;
}
