package com.jdbc.intern.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdbc.intern.Entity.Intern;
import com.jdbc.intern.Service.InternService;

@RestController
@RequestMapping("/api/intern")
public class InternController {
	
	@Autowired
	private InternService internservice;
	
	@PostMapping
	public String addintern(@RequestBody Intern intern)
	{
		internservice.addInterns(intern);
		return "Intern Added Sucessfully";
	}
	
	@GetMapping("/{id}")
	public Intern getbyid(@PathVariable int id)
	{
		return internservice.getInternById(id);
	}
	
	@GetMapping()
	public List<Intern> getallintern()
	{
		return internservice.getAllIntern();
	}
	
	@PutMapping("/{id}")
	public String updateIntern(@PathVariable int id, @RequestBody Intern intern)
	{
		intern.setPid(id);
		internservice.updateInterns(intern);
		return "Sucessfully Updated";
	}
	
	@DeleteMapping("/{id}")
	public String deleteintern(@PathVariable int id)
	{
		internservice.deleteIntern(id);
		return "Intern Deleted Sucessfully";
	}
	
	
	
	
	

}
