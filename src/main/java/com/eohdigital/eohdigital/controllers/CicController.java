package com.eohdigital.eohdigital.controllers;

import com.eohdigital.eohdigital.entities.Cic;
import com.eohdigital.eohdigital.services.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/eoh/")
public class CicController {

    @Autowired
    private EntityService service;

    @PostMapping
    public Cic registerCic (@RequestBody final Cic cic){
        return service.registerEntity(cic);
    }

    @GetMapping("{id}") //localhost:8080/eoh/{id}
    public Cic retrieveCic(@PathVariable final Long id){
        return service.retrieveCic(id);
    }

    @GetMapping
    public List<Cic> retrieveCics(){
        return service.retrieveCics();
    }

}
