package Main.Sistema;

public class immagine extends video{

	public immagine(String titolo, int durata, int volume, int luminosità) {
		super(titolo, durata, volume, luminosità);
		// TODO Auto-generated constructor stub
	}
	public void show() {
		System.out.printf("%n" + titolo + " luminosità immagine: ");
		for(int i = 0; i <= luminosità; i++) {
			System.out.printf("*");
		}
	}

}
