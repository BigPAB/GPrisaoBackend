package ht.com.prison.management.incarcerationservice.dao;

import ht.com.prison.management.incarcerationservice.model.Prisonier;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PrisonnierDaoImpl implements PrisonnierDao {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Prisonier> listPrisonnier (){
		List<Prisonier> prisoniers = new ArrayList<>();
		try{
			prisoniers = entityManager.createQuery("from Prisonier").getResultList();
		}catch (Exception e){
			e.printStackTrace();
		}finally {
			entityManager.close();
		}

		return prisoniers;
	}

	@Override
	public Prisonier getPrisonnierById(Integer id){
		Prisonier prisonier = null;
	        try {
	            prisonier = entityManager.find(Prisonier.class, id);
	        } catch (Exception e) {
	        	e.printStackTrace();
	        }
	        return prisonier;   
	}

	@Override
	public String savePrisonnier(Prisonier prisonier){
		String retorno= "Prisonier atualizado com sucesso!";

		Session session = entityManager.unwrap(Session.class);
		Transaction tx = session.beginTransaction();
		session.persist(prisonier);
		tx.commit();
		session.close();
		System.out.println("Saved");
		return retorno;
	}
}
