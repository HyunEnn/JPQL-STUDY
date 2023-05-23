package hellojpq;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Member {

    @Id @GeneratedValue
    private Long id;
    private String username;
    private int age;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

    @Override
    public String toString() {
        return "Member{" +
                "id= " + id +
                ", username = " + username + '\'' +
                ", age = " + age +
                ", team = " + team +
                '}';
    }
}
