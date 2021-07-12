package stationPackage;
public class Drivers extends Employee {

	private int age;
	private String licence;
	public Drivers(String name, int serialnum, int age, String licence) {
		super(name, serialnum);
		this.age = age;
		this.licence = licence;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLicence() {
		return licence;
	}
	public void setLicence(String licence) {
		this.licence = licence;
	}
	

	

}
