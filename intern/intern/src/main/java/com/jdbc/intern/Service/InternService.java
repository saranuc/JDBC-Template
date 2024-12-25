package com.jdbc.intern.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdbc.intern.Entity.Intern;
import com.jdbc.intern.Repo.InternRepo;

@Service

public class InternService {
	
	@Autowired
	private InternRepo internrepo;

	public void addInterns(Intern intern) {
		// TODO Auto-generated method stub
		internrepo.saveIntern(intern);
	}

	public Intern getInternById(int id) {
		// TODO Auto-generated method stub
		return internrepo.findById(id);
		
	}

	public List<Intern> getAllIntern() {
		// TODO Auto-generated method stub
		
		return internrepo.findAll();
	}

	public void updateInterns(Intern intern) {
		// TODO Auto-generated method stub
		internrepo.update(intern);
		
	}

	public void deleteIntern(int id) {
		// TODO Auto-generated method stub
		internrepo.deleteById(id);
		
	}

}
