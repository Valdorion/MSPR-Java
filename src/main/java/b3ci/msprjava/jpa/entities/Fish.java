package b3ci.msprjava.jpa.entities;

import javax.persistence.*;

@Entity
@Table(name = "Fish")
public class Fish extends Animal{
    @Column(name = "livingEnv")
    private String livingEnv;
}
