package peaksoft.entities;

import javax.persistence.*;

/**
 * @author Beksultan
 */
@Entity
@Table(name = "superheroes")
public class SuperHero {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "superhero_id_gen"
    )
    @SequenceGenerator(
            name = "superhero_id_gen",
            sequenceName = "superhero_id_seq",
            allocationSize = 1
    )
    private Long id;

    private String name;

    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
