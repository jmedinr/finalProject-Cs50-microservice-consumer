package com.santiagoposadag.cs50.receiverconsumer.collections;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class UserCurrency implements Serializable {
    @Id
    private String userId;

    private String name;
    private String lastname;
    private String dni;
    private String routingKey;
}
