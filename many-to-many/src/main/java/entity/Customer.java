package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import java.util.List;

@Entity
public class Customer {
    @Id
    private String id;
    private String name;
    private String address;
    @ManyToMany
    private List<Mobile> mobiles;

    public Customer(){}

    public Customer(String id, String name, String address, List<Mobile> mobiles) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.mobiles = mobiles;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Mobile> getLaptops() {
        return mobiles;
    }

    public void setLaptops(List<Mobile> mobiles) {
        this.mobiles = mobiles;
    }
}