package stationPackage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reading_Passengers {

	int id;
	String name;

	Passengers[] p = new Passengers[100];

	public void loadingPassengers() {
		try {
			Scanner s;
			s = new Scanner(new File("Passengers.txt"));
			int c = 0;

			while (s.hasNext()) {
				// p[c].id = s.next();
				// p[c].name = s.next();

				c++;

			}

		} catch (FileNotFoundException es) {
			System.out.println("ERROR");
		}
	}

	/*
	 * public static void main(String[] args) { Passengers[] p = new
	 * Passengers[100];
	 * 
	 * Reading_Passengers f = new Reading_Passengers();
	 * 
	 * f.loadingPassengers();
	 * 
	 * }
	 */
}
