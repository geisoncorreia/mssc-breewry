package com.example.msscbrewery.service;

import com.example.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {

    BeerDto findById(UUID uuid);
}
