package zadacha3;

public class PC {
	public int memorija;
	public String tipNaMemorija;
	public int HardDisk;
	public String golemina = "GB";
	public PC() {
		this.memorija = 2;
		this.tipNaMemorija = "DDR4";
		this.HardDisk = 256;
	}
	public void prvMetod(int zgolemiMemorija, int novHardDisk) {
		int novaMemorija = this.memorija + zgolemiMemorija;
		System.out.println("Memorijata beshe " + memorija + golemina + ", sega iznesuva " + novaMemorija + golemina + ".");
		System.out.println("Tipot na memorijata e " + tipNaMemorija + ".");
		System.out.println("HD ima golemina od " + novHardDisk+ golemina + ". Prethodno iznesuvashe " + HardDisk + golemina + ".");
	}
}
