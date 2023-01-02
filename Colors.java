import java.util.*;
public class Colors {
	
 Colors() {
    char[] endgame = {'G','A','M','E',' ',' ','E','N','D','S'};
 	 char[] dots = {'.','.','.','.','.'};
  	String[] arrayColors = {
		  "blue","yellow","pink","purple",
			"orange","black","white","magenta",
			"indigo","red","brown"
		};
		System.out.println("You are given 10 trials,to find the unknown color");

		for(int i = 0; i < 10; i++) {
		Random r = new Random();
		int a = r.nextInt(10);
		String colors = arrayColors[a];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your guesses(color):");
		String guess = sc.next();
		
		if(colors.equals(guess)) {
		System.out.println("Woah!,You Are A Genius,You Win!,your guess was right");
		}
		else {
		System.out.println("You Lose!,your guess was wrong\n the unknown color is "+colors);
		}
		if(i == 9) {
		new restart(endgame,dots);
				 }
	    }
	 }
}