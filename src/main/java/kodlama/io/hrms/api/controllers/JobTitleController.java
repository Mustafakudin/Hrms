package kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.JobTitleService;
import kodlama.io.hrms.entities.concretes.JobTitle;

@RestController
@RequestMapping("/api/jobtitle")
public class JobTitleController {

	@Autowired
	private JobTitleService jobTitleService;
	
	@GetMapping("/getall")
	public List<JobTitle> getAll(){
		return this.jobTitleService.getAll();
		
	}
	
	
}
