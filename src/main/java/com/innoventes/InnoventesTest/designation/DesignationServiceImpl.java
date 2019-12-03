package com.innoventes.InnoventesTest.designation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DesignationServiceImpl implements DesignationService {

	@Autowired
	private DesignationRepository designationRepository;
	
	@Override
	public void addDesignation(Designation designation) {
		designationRepository.save(designation);
	}

	@Override
	public Optional<Designation> getDesignation(Integer designationId) {
		
		return designationRepository.findById(designationId);
	}

	@Override
	public List<Designation> getDesignations() {
		
		return (List<Designation>) designationRepository.findAll();
	}

	@Override
	public void updateDesignation(Integer designationId, Designation designation) {
		designationRepository.save(designation);
	}

	@Override
	public void deleteDesignation(Integer designationId) {
		designationRepository.deleteById(designationId);
	}

}
