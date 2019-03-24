package com.api.demo.service;

import com.api.demo.model.ListResult;
import com.api.demo.model.PageResult;
import com.api.demo.model.Pet;

public interface IPetService {

    ListResult selectByPrimaryKey(int primaryKey);

    void updateByPrimaryKey(Pet pet);

    void insert(Pet pet);
    void deleteByPrimaryKey(int primaryKey);
}
