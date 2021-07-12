package stationPackage;


public class Passengers {

	private String fname;
	private String lname;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public Passengers(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}

	

	/*public void read() {
		try {
			// Scanner get = new Scanner(new FileReader("F://newfile.txt"));
			Scanner get = new Scanner(new FileReader("Passengers.txt"));

			while (get.hasNextLine()) {
				String word = get.nextLine();
				String[] line = word.split(",");

				this.id = line[0];
				this.name = line[1];

				// l.add(new Passengers(Integer.parseInt(line[0])));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error");

		}

	}
}

/*
 * Passengers[] p = new Passengers[100];
 * 
 * public void loadingPassengers() { try { Scanner s; s = new Scanner(new
 * File("Passengers.txt")); int c = 0;
 * 
 * while (s.hasNext()) { // p[c].id = s.nextInt(); p[c].name = s.next();
 * 
 * c++;
 * 
 * // }
 * 
 * //} catch (FileNotFoundException ex) { // System.out.println("ERROR"); // }
 * //}
 * 
 * /*public void putin() { try { FileWriter fw = new
 * FileWriter("Passengers.txt"); } catch (IOException e) { // TODO
 * Auto-generated catch block e.printStackTrace(); } Buffer }
 * 
 * public static void main(String[] args) {
 * 
 * // Passengers f = new Passengers(4595, "hjh"); // f.loadingPassengers();
 * 
 * }
 * 
 * }
 */
}