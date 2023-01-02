import java.util.*;
public class restart {
	restart(char[] game,char[] dots)  {
	Scanner scx = new Scanner(System.in);
	System.out.println("Do you want to restart, 'enter 'yes' or 'no' to get your required operation'");
	String reply = scx.next();
	if(reply.equals("yes")) {
			try {
		System.out.print("Restarting");
		for(char c : dots) {
		System.out.print(c);
			Thread.sleep(700);
			}
			System.out.println();
			new Colors();
			} catch(Exception ex) {
			
			}
		}
	else {
			try {
		System.out.println("Thanks For Playing Our Game!,Keep Playing And Enjoy Playing!");
			for(char a : game) {
			System.out.print(a);
				Thread.sleep(800);
			}
			System.out.println();
				}
		 catch(Exception e) {
			
			}
		}
	}
}