package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int intputNumber;

		while (true) {
			System.out.println("5~10까지 입력해주세요");
			intputNumber = intScan();
			if (intputNumber >= 5 && intputNumber <= 10) {
				break;
			} else {
				System.out.println("다시 입력바랍니다.");
			}
		}

		int[][] layout = new int[intputNumber][intputNumber];
		int countNumber = 1;
		int i = 0;

		
		//가운데 기준 왼쪽
		for (int countN = 0; countN <= (intputNumber / 2); countN++) {

			for (int countM = i; countM < intputNumber - i; countM++) {
				layout[countM][countN] = countNumber++;
			}
			i++;
		}
	
		//가운데 기준점
		i = (intputNumber / 2) - 1;
		
		//가운데 기준 오른쪽
		for (int countN = (intputNumber / 2) + 1; countN < intputNumber; countN++) {

			for (int countM = i; countM < intputNumber - i; countM++) {
				layout[countM][countN] = countNumber++;
			}
			i--;
		}
		
		

		for (int countM = 0; countM < intputNumber; countM++) {
			for (int countN = 0; countN < intputNumber; countN++) {
				if (layout[countM][countN] == 0) {
					System.out.print(" ");
				} else {
					System.out.print(layout[countM][countN]);
				}
				System.out.print("	");
			}
			System.out.println();
		}

	}

	public static int intScan() {
		Scanner scInt = new Scanner(System.in);
		return scInt.nextInt();
	}

}
