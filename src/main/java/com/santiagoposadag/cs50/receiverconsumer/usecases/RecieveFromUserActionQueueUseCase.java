package com.santiagoposadag.cs50.receiverconsumer.usecases;

import com.google.gson.Gson;
import com.santiagoposadag.cs50.receiverconsumer.dto.UserCurrencyDto;
import com.santiagoposadag.cs50.receiverconsumer.repository.UserActionRepository;
import org.springframework.stereotype.Component;

@Component
public class RecieveFromUserActionQueueUseCase {

    private Gson gson = new Gson();
    private UserActionRepository repository;

    public RecieveFromUserActionQueueUseCase(UserActionRepository repository){
        this.repository = repository;
    }

    public void receiveMessage(String message){
        UserCurrencyDto user = gson.fromJson(message, UserCurrencyDto.class);
        repository.save(user).subscribe();
    }

}
