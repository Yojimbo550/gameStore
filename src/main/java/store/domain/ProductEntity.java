package store.domain;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class ProductEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "productName")
    private String productName;

    @Column(name = "cost")
    private int cost;

    @Column(name = "category")
    private String category;



    @Column(name = "weight")
    private String weight;



    @Column(name = "quantity")
    private String quantity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }



    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }



    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ProductEntity{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", cost=" + cost +
                ", category='" + category + '\'' +
                ", weight='" + weight + '\'' +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}
