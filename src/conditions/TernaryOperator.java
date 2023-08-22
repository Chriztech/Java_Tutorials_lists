package conditions;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		String result= n%2==0?"even":"odd";
		System.out.println(n +"is "+ result);
	}
}
