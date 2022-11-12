package zadacha4;

import java.util.Scanner;

public class ClassMain {
	public static void main(String[] args) {
		boolean prekin = false;
		 Scanner vlez = new Scanner(System.in);
		Brojach broj = new Brojach();
	    while (!prekin) {
	    	System.out.println("Za frlanje na parichkata vnesete 1 ");
	    	System.out.println("Za resetiranje na brojachot vnesete 2 ");
	    	System.out.println("Za izlez vnesete 0 ");
	        int a = vlez.nextInt();
	        switch (a) {
	            case 0:
	                prekin = true;
	                break;
	            case 1:
	            	System.out.println("Kolku pati da se frli parichkata?");
	            	int b = vlez.nextInt();	
	            	broj.FlipCoin(b);
	            	break;
	            case 2:
	                System.out.println("Brojachot e resetiran: ");
	                broj.Reset();
	            	System.out.println("Glava: " + broj.x);
	            	System.out.println("Pismo: " + broj.y);
	                break;
	            default:
	                System.out.println("Vnesovte nevaliden broj!");
	                break;
	        }
	    }
	    vlez.close();
	}
}

