package b3ci.msprjava.jpa.entities;

import javax.persistence.*;

@Entity
@Table(name = "Cat")
public class Cat extends Animal{
    @Column(name = "chipId")
    private String chipId;
}
