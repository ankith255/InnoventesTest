package com.innoventes.InnoventesTest.designation;
import java.util.List;
import java.util.Optional;

public interface DesignationService {

	void addDesignation(Designation designation);
	Optional<Designation> getDesignation(Integer designationId);
	List<Designation> getDesignations();
	void updateDesignation(Integer designationId, Designation designation);
	void deleteDesignation(Integer designationId);
}