package Main;

import java.util.Scanner;

import Main.Sistema.audio;
import Main.Sistema.elementoMultimediale;
import Main.Sistema.immagine;
import Main.Sistema.video;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * elementoMultimediale audio1 = new audio("TitoloFake", 6, 10);
		 * elementoMultimediale audio2 = new audio("TitoloFake2", 8, 6);
		 * elementoMultimediale video1 = new video("TitoloVideo", 10, 8, 5);
		 * elementoMultimediale video2 = new video("TitoloVideo2", 5, 9, 10);
		 * elementoMultimediale immagine1 = new immagine("TitoloImmagine", 10, 8, 5);
		 * audio1.play(); audio1.abbassaVolume(); audio1.alzaVolume(); video1.play();
		 * video1.aumentaLuminosità(); video1.diminuisciLuminosità(); immagine1.show();
		 */
		Scanner sc = new Scanner(System.in);
		elementoMultimediale[] elements = new elementoMultimediale[5];

		for (int i = 0; i < 2; i++) {
			System.out.print("Enter title for element " + (i + 1) + ": ");
			String title = sc.nextLine();
			System.out.print("Enter duration for element " + (i + 1) + ": ");
			int duration = sc.nextInt();
			System.out.print("Enter volume for element " + (i + 1) + ": ");
			int volume = sc.nextInt();
			sc.nextLine(); // Consume newline character
			System.out.println("Enter type of element (audio/video/immagine): ");
			String type = sc.nextLine();

			if (type.equals("audio")) {
				elements[i] = new audio(title, duration, volume);
			}else if (type.equals("video")) {
				System.out.print("Enter luminosità for element " + (i + 1) + ": ");
				int luminosità = sc.nextInt();
				elements[i] = new video(title, duration, volume, luminosità);
			}else if (type.equals("immagine")) {
				System.out.print("Enter luminosità for element " + (i + 1) + ": ");
				int luminosità = sc.nextInt();
				elements[i] = new immagine(title, duration, volume, luminosità);
			}
		}
		int scelta = -1;
		while (scelta != 0) {
			System.out.println("Inserire il numero dell'elemento da riprodurre(1-5) o 0 per uscire: ");
			scelta = sc.nextInt();
			if (scelta >= 1 && scelta <= 2) {
                elements[scelta - 1].play();
            } else if (scelta != 0) {
                System.out.println("Invalid choice.");
            }
		}
        sc.close();
	}

}
