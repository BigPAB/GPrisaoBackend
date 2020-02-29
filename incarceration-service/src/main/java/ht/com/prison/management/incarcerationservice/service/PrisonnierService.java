package ht.com.prison.management.incarcerationservice.service;

import ht.com.prison.management.incarcerationservice.model.Prisonier;

import java.util.List;

public interface PrisonnierService {

    List<Prisonier> listPrisonnier ();

    Prisonier getPrisonnierById(Integer id);

    String savePrisonnier(Prisonier prisonier);
}
