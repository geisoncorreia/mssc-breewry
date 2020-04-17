package com.example.msscbrewery.service;

import com.example.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto findById(UUID uuid) {
        return BeerDto.builder()
                .beerName("Itaipava Premium")
                .beerStyle("Puro malte")
                .id(UUID.randomUUID())
                .build();
    }
}
