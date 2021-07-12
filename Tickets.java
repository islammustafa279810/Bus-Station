package stationPackage;


public class Tickets {

	private Trips t;
	private int no;
	public Tickets(Trips t, int no) {
		super();
		this.t = t;
		this.no = no;
	}
	public Trips getT() {
		return t;
	}
	public void setT(Trips t) {
		this.t = t;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
}
