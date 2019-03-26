package com.cts.freelancer.bean;

import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table
	public class  User{
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int userId;
		private String password;
		private String firstName;
		private String lastName;
		private String emailId;
		private String phoneNumber;
		@Column(columnDefinition = "VARCHAR(10) default 'NULL'")
		private String skill1="NULL";
		@Column(columnDefinition = "VARCHAR(10) default 'NULL'")
		private String skill2="NULL";
		@Column(columnDefinition = "VARCHAR(10) default 'NULL'")
		private String skill3="NULL";
		@Column(columnDefinition = "VARCHAR(10) default 'NULL'")
		private String skill4="NULL";
		@Column(columnDefinition = "VARCHAR(10) default 'NULL'")
		private String skill5="NULL";
		@Column(columnDefinition = "VARCHAR(10) default 'NULL'")
		private String skill6="NULL";
		@Column(columnDefinition = "VARCHAR(10) default 'NULL'")
		private String skill7="NULL";
		@Column(columnDefinition = "VARCHAR(10) default 'NULL'")
		private String skill8="NULL";
		@Column(columnDefinition = "VARCHAR(10) default 'NULL'")
		private String skill9="NULL";
		@Column(columnDefinition = "VARCHAR(10) default 'NULL'")
		private String skill10="NULL";
		
		public User(){}
		
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

	
	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	
	
	
	
}
