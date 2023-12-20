package com.inn.cafe.POJO;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "bill")
public class Bill implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    private String uuid;
    private String name;
    private String email;
    private String contactNumber;
    private String paymentMethod;
    private Integer total;

    // Adjust the annotation for MongoDB JSON storage
    private String productDetails;

    private String createdBy;

    // Getters and setters
    // Add your getters and setters here
}
