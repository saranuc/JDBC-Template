package com.jdbc.intern.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Details")
public class Intern {
	
	 	@Id
	    @Column(name = "pid")
//	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int pid;

	    @Column(name = "name")
	    private String internName;

	    @Column(name = "id")
	    private int internId;

	    @Column(name = "college")
	    private String collegeName;

	    @Column(name = "batchno")
	    private int batchNo;
	    
	    @Column(name = "project")
	    private String projectName;

	    public int getPid() {
			return pid;
		}

		public void setPid(int pid) {
			this.pid = pid;
		}

		public String getInternName() {
			return internName;
		}

		public void setInternName(String internName) {
			this.internName = internName;
		}

		public int getInternId() {
			return internId;
		}

		public void setInternId(int internId) {
			this.internId = internId;
		}

		public String getCollegeName() {
			return collegeName;
		}

		public void setCollegeName(String collegeName) {
			this.collegeName = collegeName;
		}

		public int getBatchNo() {
			return batchNo;
		}

		public void setBatchNo(int batchNo) {
			this.batchNo = batchNo;
		}

		public String getProjectName() {
			return projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		@Override
		public String toString() {
			return "Intern [pid=" + pid + ", internName=" + internName + ", internId=" + internId + ", collegeName="
					+ collegeName + ", batchNo=" + batchNo + ", projectName=" + projectName + "]";
		}

		public Intern(int pid, String internName, int internId, String collegeName, int batchNo, String projectName) {
			super();
			this.pid = pid;
			this.internName = internName;
			this.internId = internId;
			this.collegeName = collegeName;
			this.batchNo = batchNo;
			this.projectName = projectName;
		}

		public Intern() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
	    
	    
	

}
