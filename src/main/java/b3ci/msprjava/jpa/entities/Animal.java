package b3ci.msprjava.jpa.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Animal")
public class Animal {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    @Column(name ="birth")
    private Date birth;
    @Column(name = "couleur")
    private String couleur;
    public Animal() {}

    @ManyToOne
    private PetStore petStore;

    public Animal(Date birth, String couleur) {
        this.birth = birth;
        this.couleur = couleur;
    }

    public void setPetStore(PetStore petStore) {
        this.petStore = petStore;
    }
}
