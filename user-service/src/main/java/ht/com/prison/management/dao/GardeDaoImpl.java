package ht.com.prison.management.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ht.com.prison.management.model.Garde;

@Repository
public class GardeDaoImpl implements GardeDao {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Garde> listGarde (){
		List<Garde> gardes = new ArrayList<>();
		try{
			gardes = entityManager.createQuery("from Garde").getResultList();
		}catch (Exception e){
			e.printStackTrace();
		}finally {
			entityManager.close();
		}

		return gardes;
	}

	@Override
	public String saveGarde(Garde garde){
		String retorno= "Garde enregistré avec succès!";
		
		Session session = entityManager.unwrap(Session.class);
		Transaction tx = session.beginTransaction();
		session.persist(garde);
		tx.commit();
		session.close();
		System.out.println("Saved");
		return retorno;
	}

	@Override
	public Garde getGardeById(Integer id){
		Garde garde = null;
	        try {
	            garde = entityManager.find(Garde.class, id);
	        } catch (Exception e) {
	        	e.printStackTrace();
	        }
	        return garde;
	}
}
