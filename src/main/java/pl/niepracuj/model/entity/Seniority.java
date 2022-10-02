package pl.niepracuj.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.niepracuj.model.enums.SeniorityEnum;

import javax.persistence.*;
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "seniority")
public class Seniority {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private  Long id;

@Enumerated(EnumType.STRING)
private SeniorityEnum name;
}
