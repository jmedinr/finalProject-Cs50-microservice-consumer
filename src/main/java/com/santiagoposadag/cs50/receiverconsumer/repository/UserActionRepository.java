package com.santiagoposadag.cs50.receiverconsumer.repository;

import com.santiagoposadag.cs50.receiverconsumer.dto.UserCurrencyDto;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface UserActionRepository  extends ReactiveCrudRepository<UserCurrencyDto, String> {
    Flux<UserCurrencyDto> findAllByUserId(String userId);
}
