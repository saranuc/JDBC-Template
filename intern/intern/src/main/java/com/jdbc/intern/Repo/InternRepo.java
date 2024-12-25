package com.jdbc.intern.Repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.swing.tree.RowMapper;

import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.jdbc.intern.Entity.Intern;

//import org.springframework.jdbc.core.RowMapper;

@Repository
public class InternRepo {
	
	private JdbcTemplate jdbctemplate;
	
	public InternRepo(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	
	
	public int saveIntern(Intern intern)
	{
		String sql ="INSERT INTO details(pid,name,id,college,batchno,project) VALUES(?,?,?,?,?,?)";
		return jdbctemplate.update(sql,intern.getPid(),intern.getInternName(),intern.getInternId(),intern.getCollegeName(),intern.getBatchNo(),intern.getProjectName());
	}
	
	public List<Intern> findAll()
	{
		String sql = "SELECT * from details";
		return jdbctemplate.query(sql,new InternRowMapper());
	}
	public int update(Intern intern)
	{
		String sql = "UPDATE details SET pid = ?,name = ?,id = ?,college = ?, batchno = ?,project = ? WHERE pid = ?";
		return jdbctemplate.update(sql,intern.getPid(),intern.getInternName(),intern.getInternId(),intern.getCollegeName(),intern.getBatchNo(),intern.getProjectName(),intern.getPid());	
	}
	
	private static class InternRowMapper implements org.springframework.jdbc.core.RowMapper<Intern>{

		@Override
		public Intern mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			
			Intern intern = new Intern();
			intern.setPid(rs.getInt("pid"));
			intern.setInternName(rs.getString("name"));
			intern.setInternId(rs.getInt("id"));
			intern.setCollegeName(rs.getString("college"));
			intern.setBatchNo(rs.getInt("batchno"));
			intern.setProjectName(rs.getString("project"));
			
			return intern;
		}
}

	public Intern findById(int id) {
		// TODO Auto-generated method stub
		String sql = "SELECT * from details WHERE pid = ?";
		return jdbctemplate.queryForObject(sql, new Object[]{id},new InternRowMapper());
	}


	public int deleteById(int id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM details WHERE pid = ?";
		return jdbctemplate.update(sql,id);
		
	}
}
