package stationPackage;

public class Employee {

	private String name;
	private int serialnum;
	public Employee(String name, int serialnum) {
		super();
		this.name = name;
		this.serialnum = serialnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSerialnum() {
		return serialnum;
	}
	public void setSerialnum(int serialnum) {
		this.serialnum = serialnum;
	}
	

	}
