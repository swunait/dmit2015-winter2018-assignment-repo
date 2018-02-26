package dmit2015.hr.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import dmit2015.hr.entity.Job;
import dmit2015.hr.service.HumanResourceService;

@Named
@ViewScoped
public class JobController implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private HumanResourceService hrService;
	
	public List<Job> retreiveAllJobs() {
		return hrService.findAllJobs();
	}
	
}
