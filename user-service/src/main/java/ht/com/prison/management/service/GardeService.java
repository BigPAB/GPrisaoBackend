package ht.com.prison.management.service;

import ht.com.prison.management.model.Garde;

import java.util.List;

public interface GardeService {

    List<Garde> listGarde ();

    Garde getGardeById(Integer id);

    String saveGarde(Garde garde);
}
