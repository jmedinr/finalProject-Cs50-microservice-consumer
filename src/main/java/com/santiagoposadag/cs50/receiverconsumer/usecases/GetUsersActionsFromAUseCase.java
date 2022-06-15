package com.santiagoposadag.cs50.receiverconsumer.usecases;

import com.santiagoposadag.cs50.receiverconsumer.dto.UserCurrencyDto;
import com.santiagoposadag.cs50.receiverconsumer.helpers.CryptoCurrencyMappers;
import com.santiagoposadag.cs50.receiverconsumer.repository.UserActionRepository;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Flux;

import java.util.function.Function;

@Service
@Validated
public class GetUsersActionsFromAUseCase implements Function<String, Flux<UserCurrencyDto>> {

    private UserActionRepository repository;
    private CryptoCurrencyMappers mapper;

    public GetUsersActionsFromAUseCase(UserActionRepository repository, CryptoCurrencyMappers mapper){
        this.mapper = mapper;
        this.repository = repository;
    }

    @Override
    public Flux<UserCurrencyDto> apply(String userId) {
        return repository.findAllByUserId(userId).map(mapper.fromUserEntityToDto());
    }
}
