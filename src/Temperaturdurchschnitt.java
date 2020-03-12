import java.util.Random;

public class Temperaturdurchschnitt {

	public static void main(String[] args) {

		Random r = new Random();
		int avg = 0;
		int[][] temp = new int[14][10];
		int gavg = 0;

		for (int i = 0; i < temp.length; i++) {

			for (int j = 0; j < temp[i].length; j++) {
				temp[i][j] = 20 + r.nextInt(35 - 20 + 1);
				System.out.print(temp[i][j] + " ");
				avg = avg + temp[i][j];
			}
			avg = avg / temp[i].length;
			System.out.println("- Durschnitts-Teperatur: "+avg);
			gavg = gavg+avg;
		}	
		gavg = gavg/temp.length;
		System.out.println("Gesamt-Durschnitts-Temperatur: "+gavg);
	}

}
