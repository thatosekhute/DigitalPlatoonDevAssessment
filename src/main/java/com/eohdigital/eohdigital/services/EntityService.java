package com.eohdigital.eohdigital.services;

import com.eohdigital.eohdigital.entities.Cic;

import java.util.List;

public interface EntityService {
    Cic registerEntity (Cic cic);
    Cic retrieveCic(Long cicId);
    List<Cic> retrieveCics();
}
