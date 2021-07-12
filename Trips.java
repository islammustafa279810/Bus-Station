package stationPackage;

public class Trips extends Abs implements Inter_Trip_In {

	private String types;
	private String dest;
	private String date;

	public Trips(String types, String dest, String date) {
		super();
		this.types = types;
		this.dest = dest;
		this.date = date;
	}

	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void initial(Trips x[]) {
		for (int i = 0; i < 100; i++)
			x[i] = new Trips(null, null, null);
	}
}
