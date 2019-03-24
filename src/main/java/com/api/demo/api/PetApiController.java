package com.api.demo.api;

import com.api.demo.model.BaseResult;
import com.api.demo.model.ListResult;
import com.api.demo.model.PageResult;
import com.api.demo.service.IPetService;
import com.api.demo.model.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-24T00:40:57.163Z")

@Controller
public class PetApiController implements com.api.demo.api.PetApi {


        @Autowired
    private IPetService petService;

    private static final Logger log = LoggerFactory.getLogger(PetApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PetApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }
    @Override
    public ResponseEntity<BaseResult> addPet(@ApiParam(value = "Pet object that needs to be added to the store" ,required=true )  @Valid @RequestBody Pet body) {
        String accept = request.getHeader("Accept");
        try {
            petService.insert(body);
            return new ResponseEntity<BaseResult>(new BaseResult(),HttpStatus.NOT_IMPLEMENTED);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<BaseResult>(HttpStatus.NOT_IMPLEMENTED);
    }
    @Override
    public ResponseEntity<BaseResult> deletePet(@ApiParam(value = "Pet id to delete",required=true) @PathVariable("petId") Integer petId,@ApiParam(value = "" ) @RequestHeader(value="api_key", required=false) String apiKey) {
        String accept = request.getHeader("Accept");
        try {
            petService.deleteByPrimaryKey(petId);
            return new ResponseEntity<BaseResult>(new BaseResult(),HttpStatus.NOT_IMPLEMENTED);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<BaseResult>(HttpStatus.NOT_IMPLEMENTED);
    }


    @Override
    public ResponseEntity<ListResult> getPetById(@ApiParam(value = "ID of pet to return",required=true) @PathVariable("petId") Integer petId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
                ListResult<Pet> product=petService.selectByPrimaryKey(petId);
                System.out.println(product);
                return new ResponseEntity<ListResult>(product, HttpStatus.NOT_IMPLEMENTED);
        }

        return new ResponseEntity<ListResult>(HttpStatus.NOT_IMPLEMENTED);
    }
    @Override
    public ResponseEntity<BaseResult> updatePet(@ApiParam(value = "Pet object that needs to be added to the store" ,required=true )  @Valid @RequestBody Pet body) {
        String accept = request.getHeader("Accept");
        try {
            petService.updateByPrimaryKey(body);
            return new ResponseEntity<BaseResult>(new BaseResult(),HttpStatus.NOT_IMPLEMENTED);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<BaseResult>(HttpStatus.NOT_IMPLEMENTED);
    }


}
