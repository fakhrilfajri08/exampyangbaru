package entity.pk;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class MstBilingAddressPk implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String noID;
	
	public MstBilingAddressPk() {
		// TODO Auto-generated constructor stub
	}
	
	public MstBilingAddressPk(String noID) {
		this.noID = noID;
}

	public String getNoID() {
		return noID;
	}

	public void setNoID(String noID) {
		this.noID = noID;
	}
}
