package com.example.EmployeeAndProject;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ProjectDetails")
public class ProjectDetails 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int projectId;
	private String projectName;
	
	@OneToMany(mappedBy="project",cascade=CascadeType.ALL)
	private List<EmployeeDetails> emp=new ArrayList<EmployeeDetails>();

	public ProjectDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProjectDetails(int projectId, String projectName, List<EmployeeDetails> emp) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.emp = emp;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<EmployeeDetails> getEmp() {
		return emp;
	}

	public void setEmp(List<EmployeeDetails> emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "ProjectDetails [projectId=" + projectId + ", projectName=" + projectName + ", emp=" + emp + "]";
	}

}