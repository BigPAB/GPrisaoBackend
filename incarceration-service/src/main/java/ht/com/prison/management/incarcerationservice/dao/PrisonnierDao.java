package ht.com.prison.management.incarcerationservice.dao;

import ht.com.prison.management.incarcerationservice.model.Prisonier;

import java.util.List;

public interface PrisonnierDao {

    List<Prisonier> listPrisonnier ();

    Prisonier getPrisonnierById(Integer id);

    String savePrisonnier(Prisonier prisonier);
}
