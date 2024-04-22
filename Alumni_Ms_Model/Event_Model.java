package Alumni_Ms_Model;

public class Event_Model {

	private String eName,eDate,eVanue,eDesc;

	public Event_Model() {
		super();
	}

	public Event_Model(String eName, String eDate, String eVanue, String eDesc) {
		super();
		this.eName = eName;
		this.eDate = eDate;
		this.eVanue = eVanue;
		this.eDesc = eDesc;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteDate() {
		return eDate;
	}

	public void seteDate(String eDate) {
		this.eDate = eDate;
	}

	public String geteVanue() {
		return eVanue;
	}

	public void seteVanue(String eVanue) {
		this.eVanue = eVanue;
	}

	public String geteDesc() {
		return eDesc;
	}

	public void seteDescription(String eDesc) {
		this.eDesc = eDesc;
	}
}
