package Edu.Entity;

import lombok.Data;

import javax.persistence.*;
import java.lang.annotation.Target;

@Entity
@Data
//We can also change the name of the table
public class Review {
    @Id

    private int id;

    @ManyToOne
    private Product product;

    //We can use optionally the join key here

    @Column(name="Comment", updatable = false)
    private String commnet;
}
