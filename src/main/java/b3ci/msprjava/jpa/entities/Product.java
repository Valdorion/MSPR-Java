package b3ci.msprjava.jpa.entities;

import javax.persistence.*;

@Entity
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "code")
    private String code;
    @Column(name = "label")
    private String label;
    @Column(name = "price")
    private Double price;
    @Column(name = "type")
    private ProdType ProdType;
    public Product() {}

    public Product(String code, String label, double price, b3ci.msprjava.jpa.entities.ProdType type) {
        this.code = code;
        this.label = label;
        this.price = price;
        this.ProdType = type;
    }
}
