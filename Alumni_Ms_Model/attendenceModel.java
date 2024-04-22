package Alumni_Ms_Model;

public class attendenceModel {

	private String eName,aName;
	public attendenceModel(String aName, String eName) {
		super();
		
		this.aName = aName;
		this.eName = eName;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}	
}
