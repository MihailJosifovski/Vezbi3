package zadacha1;

public class ClassMain {
	public static void main(String[] args) {
		Avtomobil av = new Avtomobil("Reno", "Clio", "Crna", 5000, 2003, "BT-8585-BT");
		av.prvMetod();
		System.out.println(av.vtorMetod());
	}
}
