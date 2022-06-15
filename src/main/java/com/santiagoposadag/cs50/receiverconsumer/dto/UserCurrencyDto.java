package com.santiagoposadag.cs50.receiverconsumer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserCurrencyDto {

    private String userId;
    private String name;
    private String lastname;
    private String dni;
    private String routingKey;

}
