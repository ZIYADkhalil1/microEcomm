package com.zzo.ecomm.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "counters")
public class Counter {
    @Id
    private String id;  // sequence name
    private long seq;

}