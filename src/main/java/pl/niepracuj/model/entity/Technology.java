package pl.niepracuj.model.entity;


import lombok.*;
import pl.niepracuj.model.enums.TechnologyEnum;

import javax.persistence.*;
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "technologies")
public class Technology {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private TechnologyEnum name;


}
