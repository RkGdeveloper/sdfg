package com.cg.app.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="applicants")
public class ApplicantBean {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="app_id")
	private int appId;
	
	@Column(name="APP_NAME")
	private String appName;
	
	@Column(name="AGE")
	private int appAge;
	
	@Column(name="DATE_OF_BIRTH")
	private String appDate;
	
	@Column(name="DESIGNATION")
	private String appDesig;
	
	@Column(name="OCCUPATION")
	private String appOccp;
	
	@Column(name="COURSE_TO_JOIN")
	private String appCourse;

	public int getAppId() {
		return appId;
	}

	public void setAppId(int appId) {
		this.appId = appId;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public int getAppAge() {
		return appAge;
	}

	public void setAppAge(int appAge) {
		this.appAge = appAge;
	}

	public String getAppDate() {
		return appDate;
	}

	public void setAppDate(String appDate) {
		this.appDate = appDate;
	}

	public String getAppDesig() {
		return appDesig;
	}

	public void setAppDesig(String appDesig) {
		this.appDesig = appDesig;
	}

	public String getAppOccp() {
		return appOccp;
	}

	public void setAppOccp(String appOccp) {
		this.appOccp = appOccp;
	}

	public String getAppCourse() {
		return appCourse;
	}

	public void setAppCourse(String appCourse) {
		this.appCourse = appCourse;
	}

	@Override
	public String toString() {
		return "ApplicantBean [appId=" + appId + ", appName=" + appName
				+ ", appAge=" + appAge + ", appDate=" + appDate + ", appDesig="
				+ appDesig + ", appOccp=" + appOccp + ", appCourse="
				+ appCourse + "]";
	}
	
	
	
}
