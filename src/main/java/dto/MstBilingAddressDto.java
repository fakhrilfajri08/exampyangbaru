package dto;

import java.util.Date;

import entity.enumcol.GenderEnum;

public class MstBilingAddressDto {

	private Date createdDate;// = LocalDateTime.now();
	private String createdUser;
	private Date updatedDate;
	private String updatedUser;
	private Boolean deleted;
	
	private String noID;
	private String nama;
	private GenderEnum gender;
	private String job;
	private MstCustomerDto customer;
	private MstEmployeeDto employee;
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getCreatedUser() {
		return createdUser;
	}
	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getUpdatedUser() {
		return updatedUser;
	}
	public void setUpdatedUser(String updatedUser) {
		this.updatedUser = updatedUser;
	}
	public Boolean getDeleted() {
		return deleted;
	}
	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
	public String getNoID() {
		return noID;
	}
	public void setNoID(String noID) {
		this.noID = noID;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public GenderEnum getGender() {
		return gender;
	}
	public void setGender(GenderEnum gender) {
		this.gender = gender;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public MstCustomerDto getCustomer() {
		return customer;
	}
	public void setCustomer(MstCustomerDto customer) {
		this.customer = customer;
	}
	public MstEmployeeDto getEmployee() {
		return employee;
	}
	public void setEmployee(MstEmployeeDto employee) {
		this.employee = employee;
	}
}
