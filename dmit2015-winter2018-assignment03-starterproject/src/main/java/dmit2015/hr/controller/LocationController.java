package dmit2015.hr.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import dmit2015.hr.entity.Location;
import dmit2015.hr.service.HumanResourceService;

@Named
@ViewScoped
public class LocationController implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private HumanResourceService hrService;
	
	public List<Location> retreiveAllLocations() {
		System.out.println("retreiving all Locations");
		return hrService.findAllLocations();
	}
	
	
}
