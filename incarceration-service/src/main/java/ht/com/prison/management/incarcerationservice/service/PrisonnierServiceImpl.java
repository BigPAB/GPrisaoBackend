package ht.com.prison.management.incarcerationservice.service;

import ht.com.prison.management.incarcerationservice.dao.PrisonnierDao;
import ht.com.prison.management.incarcerationservice.model.Prisonier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PrisonnierServiceImpl implements PrisonnierService {

	@Autowired
	private PrisonnierDao prisonnierDao;

	@Override
	public List<Prisonier> listPrisonnier (){
		return prisonnierDao.listPrisonnier();
	}

	@Override
	public Prisonier getPrisonnierById (Integer id){
		return prisonnierDao.getPrisonnierById(id);
	}

	@Transactional
	@Override
	public String savePrisonnier(Prisonier prisonier){
		return prisonnierDao.savePrisonnier(prisonier);
	}

}
