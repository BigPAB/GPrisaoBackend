package ht.com.prison.management.service;

import java.util.List;

import ht.com.prison.management.dao.GardeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ht.com.prison.management.model.Garde;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GardeServiceImpl implements GardeService {

	@Autowired
	private GardeDao gardeDao;

	@Override
	public List<Garde> listGarde (){
		return gardeDao.listGarde();
	}

	@Override
	public Garde getGardeById (Integer id){
		return gardeDao.getGardeById(id);
	}

	@Transactional
	@Override
	public String saveGarde(Garde garde){
		return gardeDao.saveGarde(garde);
	}

}
