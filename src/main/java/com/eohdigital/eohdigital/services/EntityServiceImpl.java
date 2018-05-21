package com.eohdigital.eohdigital.services;

import com.eohdigital.eohdigital.entities.Cic;
import com.eohdigital.eohdigital.repository.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EntityServiceImpl implements EntityService {

    @Autowired
    private EntityRepository repository;

    @Override
    public Cic registerEntity(Cic cic) {
        cic.setCicTimeStamp(new Date());
        return repository.save(cic);
    }

    @Override
    public Cic retrieveCic(Long cicId) {
        return repository.getOne(cicId);
    }

    @Override
    public List<Cic> retrieveCics() {
        return repository.findAll();
    }
}
