package com.api.demo.service.impl;

import com.api.demo.mapper.PetMapper;
import com.api.demo.model.ListResult;
import com.api.demo.model.PageResult;
import com.api.demo.model.Pet;
import com.api.demo.service.IPetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PetServiceImpl implements IPetService {
    @Autowired
    private PetMapper petMapper;

    @Override
    public void deleteByPrimaryKey(int primaryKey) {
        petMapper.deleteByPrimaryKey( primaryKey);
    }

    @Override
    public void insert(Pet pet) {

        petMapper.insert(pet);
    }

    @Override
    public ListResult selectByPrimaryKey(int primaryKey) {
        Pet pet= petMapper.selectByPrimaryKey(primaryKey);
        ListResult listResult=new ListResult();
        if(pet!=null){
            listResult.getData().add(pet);
            listResult.setCount(1);
        }else {
            listResult.setCount(0);
        }


        return listResult;
    }

    @Override
    public void updateByPrimaryKey(Pet pet) {
        petMapper.updateByPrimaryKey(pet);
    }
}
