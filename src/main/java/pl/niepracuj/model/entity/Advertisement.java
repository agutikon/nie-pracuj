package pl.niepracuj.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


@Getter
@Setter@NoArgsConstructor
@Entity
@Table(name = "advertisements")
public class Advertisement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long companyId;
    private Long seniorityId;
    private Timestamp publishDate;
    private Timestamp expireDate;
    private Long salaryFrom;
    private String description;
    private Long cityId;

@ManyToMany
@JoinTable(
                name = "adv_skills",
                joinColumns = @JoinColumn(name = "skill_id"),
                inverseJoinColumns = @JoinColumn(name = "adv_id")
        )
Set<Skill> skills;
}
