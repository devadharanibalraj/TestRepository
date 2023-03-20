package org.ConditionStatement;
import java.util.Scanner;
public class JumpingStatement {
	public static void main(String[] args) {
		Scanner JumpingStatement = new Scanner(System.in);
		System.out.println("Enter True/False");
		boolean object = JumpingStatement.nextBoolean();
		if (object == true) {
			for (int i = 1; i <= 5; i++) {
				if (i == 5) {
					break;
				}
				for (int j = 5; j >= i; j--) {
					if (j == 2) {
						continue;
					}
					System.out.print(j);
				}
				System.out.println();
			}
		}
		if (object == false) {

			for (int k = 1; k <= 5; k++) {
				if (k == 1 || k == 2) {
					switch (k) {
					case 1:
						System.out.print("*");
						break;
					case 2:
						System.out.print("#");
						break;
					}
				} else {
					System.out.print(k);
				}
			}
		}
		if (object == false || object == true) {
			System.out.println();
		System.out.print(object);
	}
}
}
