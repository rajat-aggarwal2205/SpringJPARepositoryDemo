package com.example.service;

import com.example.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service("beerService")
public class BeerServiceImpl implements BeerService{
    @Override
    public BeerDto getBeer() {
        return BeerDto.builder().uid(UUID.randomUUID())
                .type("strong")
                .price(230).build();
    }
}
