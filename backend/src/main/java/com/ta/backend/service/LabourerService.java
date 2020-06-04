package com.ta.backend.service;

import org.springframework.stereotype.Service;

import com.ta.backend.entity.Labourer;

@Service
public interface LabourerService {
	
	public Labourer addLabourer(Labourer labourer);

}
