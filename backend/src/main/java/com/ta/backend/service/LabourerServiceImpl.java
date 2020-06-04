
package com.ta.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta.backend.dao.LabourerDao;
import com.ta.backend.entity.Labourer;

@Service
public class LabourerServiceImpl implements LabourerService {

	@Autowired
	LabourerDao lDao;
	
	@Override
	public Labourer addLabourer(Labourer labourer) {
		return lDao.save(labourer) ;
	}
	
	

}
