package Alumni_Ms_Model;

public class Alumni_Model {
	
	private int Aid;
	private String aName,aEmail,aMob,aAddress,Pass_year,aBranch;
	private boolean status;
	
	
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Alumni_Model() {
		super();
	}
	public Alumni_Model(int aid, String aName, String aEmail, String aMob, String aAddress, String pass_year,String aBranch) {
		super();
		Aid = aid;
		this.aName = aName;
		this.aEmail = aEmail;
		this.aMob = aMob;
		this.aAddress = aAddress;
		Pass_year = pass_year;
		this.aBranch = aBranch;
		
	}
	public String getaBranch() {
		return aBranch;
	}
	public void setaBranch(String aBranch) {
		this.aBranch = aBranch;
	}
	public int getAid() {
		return Aid;
	}
	public void setAid(int aid) {
		Aid = aid;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getaEmail() {
		return aEmail;
	}
	public void setaEmail(String aEmail) {
		this.aEmail = aEmail;
	}
	public String getaMob() {
		return aMob;
	}
	public void setaMob(String aMob) {
		this.aMob = aMob;
	}
	public String getaAddress() {
		return aAddress;
	}
	public void setaAddress(String aAddress) {
		this.aAddress = aAddress;
	}
	public String getPass_year() {
		return Pass_year;
	}
	public void setPass_year(String pass_year) {
		Pass_year = pass_year;
	}
	
	
}
