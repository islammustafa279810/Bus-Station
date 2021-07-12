package stationPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	Trips x[]=new Trips[5];
	try
	{
		File TripFile = new File("Trips.txt");
		Scanner s = new Scanner(TripFile);
		String dest;
		String date;
		String type;
		int index=0;
		while(s.hasNext())
		{
			String word = s.nextLine();
			String[] line = word.split(",");
		dest = line[0];
		type = line[1];
		date = line[2];
        x[index]= new Trips(type,dest,date);
        index++;
		}
		System.out.println(x[1].getDate());
		s.close();
	}
   catch(FileNotFoundException fnf)
	{
	   System.out.println("fnf");
	}
}
}