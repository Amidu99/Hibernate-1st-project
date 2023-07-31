package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import java.util.List;

@Entity
public class Mobile {
    @Id
    private String id;
    private String brand;
    private String model;
    @ManyToMany(mappedBy = "mobiles")
    private List<Customer> customers;

    public Mobile(){}

    public Mobile(String id, String brand, String model, List<Customer> customers) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.customers = customers;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<Customer> getStudents() {
        return customers;
    }

    public void setStudents(List<Customer> customers) {
        this.customers = customers;
    }
}