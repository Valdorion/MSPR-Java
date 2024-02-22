package b3ci.msprjava.jpa.entities;

import javax.persistence.*;

@Entity
@Table(name = "Address")
public class Address {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "street")
    private String street;
    @Column(name = "number")
    private String number;
    @Column(name = "zipCode")
    private String zipCode;
    @Column(name = "city")
    private String city;
    public Address() {}

    @OneToOne
    private PetStore petStore;

    public Address(String street, String number, String zipCode, String city) {
        this.street = street;
        this.number = number;
        this.zipCode = zipCode;
        this.city = city;
    }

    public void setPetStore(PetStore petStore) {
        this.petStore = petStore;
    }
}
