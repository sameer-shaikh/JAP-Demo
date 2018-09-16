package com.maven3.JPADemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
		@Id
		private int eid;
		private String name;
		private String tech;
		public int getAid() {
			return eid;
		}
		public void setEid(int eid) {
			this.eid = eid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getTech() {
			return tech;
		}
		public void setTech(String tech) {
			this.tech = tech;
		}
		@Override
		public String toString() {
			return "Employee [aid=" + eid + ", name=" + name + ", tech=" + tech + "]";
		}
	
	
}
