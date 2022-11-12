package zadacha2;

public class ClassMain {
	public static void main(String[] args) {
		Fakultet f1 = new Fakultet();
		f1.nazivNaFakultet = "FIKT";
		f1.brojNaSmerovi = 6;
		f1.brojNaStudenti = 200;
		f1.dekan = "Zoran Zoranoski";
		f1.sediste = "Bitola";
		f1.prvMetod();
		System.out.println("Namalen broj na studenti:" + f1.vtorMetod(40));
		f1.tretMetod();
		
		Fakultet f2 = new Fakultet();
		f2.nazivNaFakultet = "Tehnicki";
		f2.brojNaSmerovi = 8;
		f2.brojNaStudenti = 400;
		f2.dekan = "Aneta Anetoska";
		f2.sediste = "Bitola";
		f2.prvMetod();
		System.out.println("Namalen broj na studenti:" + f1.vtorMetod(80));
		f2.tretMetod();
	}
}
