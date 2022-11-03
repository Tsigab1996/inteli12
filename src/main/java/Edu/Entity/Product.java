   package Edu.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity // This helps for creating a table
public class Product {

    @Id
    private int id;
    private String name;
    private double price;
    private String description;

    //@JoinColumn when they are bidirectional related then we dont need this annotation
    @OneToMany(mappedBy = "product")

    //The mappedBy is not annotation but it is just the variable of the one to many relationship


    private List<Review> reviews;

}
