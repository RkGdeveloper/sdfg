package com.cg.app.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cg.app.dto.ApplicantBean;


@Repository
@Transactional
public class ApplicationDaoImpl implements IApplicationDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public ApplicantBean insertApplicant(ApplicantBean apBean) {
		if(apBean != null){
			entityManager.persist(apBean);
			entityManager.flush();
		}
		
		return apBean;
	}
	

}
