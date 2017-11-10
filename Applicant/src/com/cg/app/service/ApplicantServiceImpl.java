package com.cg.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.app.dao.IApplicationDao;
import com.cg.app.dto.ApplicantBean;


@Service
public class ApplicantServiceImpl implements IApplicationService {

	@Autowired
	private IApplicationDao daoRef;
	
	@Override
	public ApplicantBean insertApplicant(ApplicantBean apBean) {
		return daoRef.insertApplicant(apBean);
	}
	

}
