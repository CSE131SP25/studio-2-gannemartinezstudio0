package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		System.out.println("How much money do you want to start with?");
		Scanner in = new Scanner(System.in);
		double startAmount = in.nextDouble();
		double winChance= 0.7;
		double winLimit= 10.0;
		for (int i=0; i<500; i++) {
			double balance = startAmount;
			while(balance>0 && balance<winLimit) {
				double a = Math.random();
				if(a < winChance) {
					balance +=1;
				}
				else {
					balance -=1;
				}
			}
			if(balance==10){
				System.out.println("DAY: WIN");
			}
			else {
				System.out.println("DAY: LOSE");
			}

		}
	}

}
