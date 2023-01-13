package Main.Sistema;

abstract public class elementoMultimediale {
	 public String titolo;
	 public int durata;
	 public int volumeMax;
	 public int volume = 0;
	
	public elementoMultimediale(String titolo, int durata, int volumeMax) {
		this.titolo = titolo;
		this.durata = durata;
		this.volumeMax = volumeMax;
	}
	abstract public void abbassaVolume();
	abstract public void alzaVolume();
	abstract public void play();
	abstract public void aumentaLuminosità();
	abstract public void diminuisciLuminosità();
	abstract public void show();
	
	public int getVolume() {
		return volume;
	}
}  
