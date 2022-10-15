package pl.niepracuj.model.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "advertisements")
public class Advertisement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDateTime publishDate;
    private LocalDateTime expireDate;
    private Long salaryFrom;
    private Long salaryTo;
    private String description;

    @ManyToOne
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    private Company company;

    @ManyToOne
    private City city;

    @ManyToOne
    private Technology technology;

    @ManyToOne
    private Seniority seniority;
    @ManyToMany
    @JoinTable(
            name = "adv_skills",
            joinColumns = @JoinColumn(name = "skill_id"),
            inverseJoinColumns = @JoinColumn(name = "adv_id")
    )
    Set<Skill> skills;
}
