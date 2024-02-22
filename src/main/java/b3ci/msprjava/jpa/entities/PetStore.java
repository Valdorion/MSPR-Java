package b3ci.msprjava.jpa.entities;

import javax.persistence.*;

@Entity
@Table(name = "PetStore")
public class PetStore {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "managerName")
    private String managerName;
    public PetStore() {}

    @OneToOne
    private Address address;

    public PetStore(String petStore, String managerName) {
        this.name = petStore;
        this.managerName = managerName;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
