package zadacha4;

public class Brojach {
	public int x = 0;
	public int y = 0;
	public int  ZgolemuvanjeZaX(){
		x = x + 1;
		return x;
	}
	public int ZgolemuvanjeZaY() {
		y = y + 1;
		return y;
	}
	public void Reset() {
		x = 0;
		y = 0;
	}
	public void FlipCoin(int b) {
		for (int i = 0; i < b; i++) {
    		if (Math.random() < 0.5) {
    			ZgolemuvanjeZaX();
    		}
    		else {
    			ZgolemuvanjeZaY();
    		}
    	}
    	System.out.println("Glava: " + x);
    	System.out.println("Pismo: " + y);
	}
}
