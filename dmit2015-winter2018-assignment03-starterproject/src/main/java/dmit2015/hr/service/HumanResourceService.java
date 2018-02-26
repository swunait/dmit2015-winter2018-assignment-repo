package dmit2015.hr.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import dmit2015.hr.entity.Country;
import dmit2015.hr.entity.Employee;
import dmit2015.hr.entity.Job;
import dmit2015.hr.entity.Location;

@Stateless
public class HumanResourceService {

	@Inject
	private EntityManager entityManager;
	
	public Job findOneJob(String jobId) {
		return entityManager.find(Job.class, jobId);
	}
	
	public List<Job> findAllJobs() {
		return entityManager.createQuery(
			"SELECT j FROM Job j ORDER BY j.jobTitle", Job.class
			).getResultList();
	}
	
	
	public Location findOneLocation(long locationId) {
		return entityManager.find(Location.class, locationId);
	}
	
	public List<Location> findAllLocations() {
		return entityManager.createQuery(
			"SELECT l FROM Location l ", Location.class
			).getResultList();
	}
	
	
	public Country findOneCountry(String countryId) {
		return entityManager.find(Country.class, countryId);
	}
	
	public List<Country> findAllCountries() {
		return entityManager.createQuery(
			"SELECT c FROM Country c ORDER BY c.countryName ", Country.class
			).getResultList();
	}
	
	
	public Employee findOneEmployee(long employeeId) {
		return entityManager.find(Employee.class, employeeId);
	}
	
	
	public List<Employee> findAllEmployees() {
		return entityManager.createQuery(
			"SELECT e FROM Employee e ORDER BY e.lastName, e.firstName ",
			Employee.class).getResultList();
	}
}
