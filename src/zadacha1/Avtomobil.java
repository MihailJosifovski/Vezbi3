package zadacha1;

public class Avtomobil {
	public String marka; 
	public String model;
	public String boja;
	public double pominatiKm;
	public int godinaNaProizvodstvo;
	public String registracija;
	public Avtomobil(String marka, String model, String boja, double pominatiKm, int godinaNaProizvodstvo, String registracija) {
		this.marka = marka;
		this.model = model;
		this.boja = boja;
		this.pominatiKm = pominatiKm;
		this.godinaNaProizvodstvo = godinaNaProizvodstvo;
	}
	public void prvMetod() {
		System.out.println(this.marka + " " + this.model + " " + this.boja + " " + this.pominatiKm + " " + this.godinaNaProizvodstvo);
	}
	public double vtorMetod() {
		double pKm;
		pKm = this.pominatiKm + 1520.25;
		return pKm;
	}
}
