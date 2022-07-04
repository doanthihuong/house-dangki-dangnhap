package com.example.airbnb.service;

import com.example.airbnb.model.House;

public interface IHouseService extends IGeneralService<House>{
    Iterable<House> findAllByNameContaining(String name);
}
