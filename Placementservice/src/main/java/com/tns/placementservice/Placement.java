package com.tns.placementservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Placement {
	private Integer P_companyid;
	private String P_companyname;
	private Integer P_salarypackage;

	public Placement() {
		super();
	}
	
	public Placement(Integer p_companyid, String p_companyname, Integer p_salarypackage) {
		super();
		P_companyid = p_companyid;
		P_companyname = p_companyname;
		P_salarypackage = p_salarypackage;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getP_companyid() {
		return P_companyid;
	}
	public void setP_companyid(Integer p_companyid) {
		P_companyid = p_companyid;
	}
	public String getP_companyname() {
		return P_companyname;
	}
	public void setP_companyname(String p_companyname) {
		P_companyname = p_companyname;
	}
	public Integer getP_salarypackage() {
		return P_salarypackage;
	}
	public void setP_salarypackage(Integer p_salarypackage) {
		P_salarypackage = p_salarypackage;
	}
	@Override
	public String toString()
	{
		return "Placement[Placement companyid:"+P_companyid+" Placement conpanyname"+P_companyname+" Placement salarypackage"+P_salarypackage+"]";
	}
	

}
