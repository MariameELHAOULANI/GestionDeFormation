package com.bankend.springboot.controller;

 
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bankend.springboot.exception.*;
import com.bankend.springboot.model.Formateur;
import com.bankend.springboot.model.FormateurPrevJobs;
import com.bankend.springboot.model.Formation;
import com.bankend.springboot.model.FormationsBenificaire;
import com.bankend.springboot.model.PlanFormation;
import com.bankend.springboot.model.User;
import com.bankend.springboot.model.UserRet;
import com.bankend.springboot.repository.FormateurPrevJobsRepository;
import com.bankend.springboot.repository.FormateurRepository;
import com.bankend.springboot.repository.FormationBenificaire;
import com.bankend.springboot.repository.FormationRepository;
import com.bankend.springboot.repository.PlanFormationRepository;
import com.bankend.springboot.repository.UserRepository;
import com.bankend.springboot.service.UserDetailsDemo;



import com.bankend.springboot.model.Greeting;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/angularfront")
public class MainController {   
	
	@Autowired
	private UserRepository repo; 
	@Autowired
	private FormationRepository repof; 
	@Autowired
	private PlanFormationRepository repoPlanFormation; 
	@Autowired
	private FormateurRepository repoFormateur; 
	@Autowired
	private FormateurPrevJobsRepository repoFormateurPrevJobs; 
	@Autowired
	private FormationBenificaire repoFormationsBenificaire;
	
    @RequestMapping("/basicauth") 
	public User Home(String name) {   
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (principal instanceof UserDetailsDemo) {
		  Boolean isFormateur = ((UserDetailsDemo) principal).getFormateur();
		  String firstName = ((UserDetailsDemo) principal).getFirstName();
		  String lastName = ((UserDetailsDemo) principal).getLastName();
			  return new User(0, "", "", firstName, lastName, "", isFormateur, null);
		} else {
		  return new User();
		}
	}
    
	@RequestMapping("/login")
	public Iterable<Formation> loginPage() {
		return repof.findAll();
	}
	
	@RequestMapping("/addUser")
	public String addUser() {
		return "addUser.jsp";
	}
	
	@PostMapping(value="/addNewUser") 
	public User addUser(@Valid @RequestBody  User user) {  
		System.out.println("Spring was here /addNewUser");
		System.out.println(user); 
		return repo.save(user);
	}

	@RequestMapping("/addFormation")
	public String addFormation() {
		return "addFormation.jsp";
	}

	
	@PostMapping(value="/addNewFormation") 
	public Formation addFormation(@Valid @RequestBody  Formation formation) {
		System.out.println("Spring was here /addNewFormation");	 
		return repof.save(formation);
	}
	
	@RequestMapping("/addPlanFormation")
	public String addPlanFormation() {
		return "addPlanFormation.jsp";
	}
	

	
	@PostMapping("/addNewPlanFormation") 
	public PlanFormation addPlanFormation(@Valid @RequestBody PlanFormation planFormation) {  
			System.out.println("Spring was here /addNewPlanFormation");  
		return repoPlanFormation.save(planFormation);
	}
	
	@RequestMapping("/addFormateur")
	public String addFormatur() {
		return "addFormateur.jsp";
	}
	
	@PostMapping("/addNewFormateur") 
	public Formateur addFormateur(@ModelAttribute Formateur formateur) {
		 return repoFormateur.save(formateur);
	}
	
	@RequestMapping("/addFormateurPrevJobs")
	public String addFormateurPrevJobss() {
		return "addFormateurPrevJobs.jsp";
	}
	
	@PostMapping("/addNewFormateurPrevJobs") 
	public FormateurPrevJobs addFormateurPrevJobs(@Valid @RequestBody FormateurPrevJobs formateurPrevJobs) {
		System.out.println("Spring was here /addNewFormateurPrevJobs");
		 return repoFormateurPrevJobs.save(formateurPrevJobs);
	}
	
	@RequestMapping("/addFormationsBenificaire")
	public String addFormationsBenificaire() {
		return "addFormationsBenificaire.jsp";
	}
	
	@PostMapping("/addNewFormationsBenificaire") 
	public FormationsBenificaire addFormationsBenificaire(@ModelAttribute FormationsBenificaire formationsBenificaire) {
		 return repoFormationsBenificaire.save(formationsBenificaire);
	}
	
	@GetMapping(value="/listformations")
	public Iterable<Formation> getFormation(){
		return repof.findAll();
	}
	
	@DeleteMapping("/formation/{id}")
	public Map<String, Boolean> deleteFormation(@PathVariable(value = "id") Long formationId)
			throws ResourceNotFoundException {
		Formation formation = repof.findById(formationId)
				.orElseThrow(() -> new ResourceNotFoundException("Formation not found for this id : " + formationId));

		repof.delete(formation);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
	
	@GetMapping("/formation/{id}")
	public ResponseEntity<Formation> getEmployeeById(@PathVariable(value = "id") Long id)
			throws Exception {
		Formation formation = repof.findById(id)
				.orElseThrow(() -> new Exception("Employee not found for this id :: " + id));
		return ResponseEntity.ok().body(formation);
	}
	
	 @PutMapping("/formation/{id}")
	    public ResponseEntity<Formation> updateFormation(@PathVariable(value = "id") Long formationId,
	         @Valid @RequestBody Formation formationDetails) throws Exception {
			System.out.println("spring was here");
	        Formation formation = repof.findById(formationId)
	        .orElseThrow(() -> new Exception("Formation not found for this id :: " + formationId));

	        formation.setFormationTitle(formationDetails.getFormationTitle());
	        formation.setObjectifs(formationDetails.getObjectifs());
	        formation.setPreRequis(formationDetails.getPreRequis());
	        formation.setEtabli(formationDetails.getEtabli());
	        formation.setNombreMax(formationDetails.getNombreMax());
	        final Formation updatedFormation = repof.save(formation);
	        return ResponseEntity.ok(updatedFormation);
	    }
}
