package com.zzo.ecomm.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "product_specs")
public class Products {

    @Id
    private String _id;  // MongoDB ObjectId (default)

    private long productId;     // Auto-incremented product ID
    private String description;
    private String category;
}
