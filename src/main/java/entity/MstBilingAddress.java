package entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.*;

import component.BaseEntity;
import entity.enumcol.GenderEnum;
import entity.pk.MstBilingAddressPk;


@Entity
@Table(name="Mst_BilingAddress")
@IdClass(value=MstBilingAddressPk.class)
public class MstBilingAddress extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="no_ID")
	private String noID;	
	@Column(name="nama")
	private String nama;
	@Column(name="gender")
	private GenderEnum gender;
	@Column(name="job")
	private String job;
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
}
	