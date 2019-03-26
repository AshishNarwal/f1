package com.cts.freelancer.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;

@Entity
@Table
@DynamicInsert(value=true)
public class Project {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int projectId;
	private int adminId;
	private String projectName;
	private String projectDuration;
	@Column(name = "projectStatus",  columnDefinition = "VARCHAR(10) default 'Incomplete'") 
	private String status;
	@Column(columnDefinition = "VARCHAR(10) default 'NULL'") 
	private String skill1;
	@Column(columnDefinition = "VARCHAR(10) default 'NULL'")
	private String skill2;
	@Column(columnDefinition = "VARCHAR(10) default 'NULL'")
	private String skill3;
	@Column(columnDefinition = "VARCHAR(10) default 'NULL'")
	private String skill4;
	@Column(columnDefinition = "VARCHAR(10) default 'NULL'")
	private String skill5;
	@Column(columnDefinition = "VARCHAR(10) default 'NULL'")
	private String skill6;
	@Column(columnDefinition = "VARCHAR(10) default 'NULL'")
	private String skill7;
	@Column(columnDefinition = "VARCHAR(10) default 'NULL'")
	private String skill8;
	@Column(columnDefinition = "VARCHAR(10) default 'NULL'")
	private String skill9;
	@Column(columnDefinition = "VARCHAR(10) default 'NULL'")
	private String skill10;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectDuration() {
		return projectDuration;
	}
	public void setProjectDuration(String projectDuration) {
		this.projectDuration = projectDuration;
	}
	public String getSkill1() {
		return skill1;
	}
	public void setSkill1(String skill1) {
		this.skill1 = skill1;
	}
	public String getSkill2() {
		return skill2;
	}
	public void setSkill2(String skill2) {
		this.skill2 = skill2;
	}
	public String getSkill3() {
		return skill3;
	}
	public void setSkill3(String skill3) {
		this.skill3 = skill3;
	}
	public String getSkill4() {
		return skill4;
	}
	public void setSkill4(String skill4) {
		this.skill4 = skill4;
	}
	public String getSkill5() {
		return skill5;
	}
	public void setSkill5(String skill5) {
		this.skill5 = skill5;
	}
	public String getSkill6() {
		return skill6;
	}
	public void setSkill6(String skill6) {
		this.skill6 = skill6;
	}
	public String getSkill7() {
		return skill7;
	}
	public void setSkill7(String skill7) {
		this.skill7 = skill7;
	}
	public String getSkill8() {
		return skill8;
	}
	public void setSkill8(String skill8) {
		this.skill8 = skill8;
	}
	public String getSkill9() {
		return skill9;
	}
	public void setSkill9(String skill9) {
		this.skill9 = skill9;
	}
	public String getSkill10() {
		return skill10;
	}
	public void setSkill10(String skill10) {
		this.skill10 = skill10;
	}
}
