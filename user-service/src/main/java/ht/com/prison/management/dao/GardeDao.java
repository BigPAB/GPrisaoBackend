package ht.com.prison.management.dao;

import ht.com.prison.management.model.Garde;

import java.util.List;

public interface GardeDao {

    List<Garde> listGarde ();

    Garde getGardeById(Integer id);

    String saveGarde(Garde garde);
}
