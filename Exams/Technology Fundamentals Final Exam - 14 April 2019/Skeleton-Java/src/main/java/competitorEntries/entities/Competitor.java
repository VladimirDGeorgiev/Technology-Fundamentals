package competitorEntries.entities;

import javax.persistence.*;

@Entity
@Table(name = "competitors")
public class Competitor {
   private Integer id;
   private String name;
   private Integer age;
   private String team;
   private String category;

    public Competitor() {
    }

    public Competitor(String name, Integer age, String team, String category) {
        this.name = name;
        this.age = age;
        this.team = team;
        this.category = category;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    @Column(nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Column(nullable = false)
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    @Column(nullable = false)
    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
    @Column(nullable = false)
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
