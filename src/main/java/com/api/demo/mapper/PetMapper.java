package com.api.demo.mapper;

import com.api.demo.model.Pet;
import io.swagger.models.auth.In;

public interface PetMapper {
    Pet selectByPrimaryKey(Integer petId);

    void updateByPrimaryKey(Pet pet);
    void insert(Pet pet);
    void deleteByPrimaryKey(Integer petId);
}
