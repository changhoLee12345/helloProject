package com.yedam.operator;

import java.util.Scanner;

public class OperatorEx2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("첫번째 값을 입력: ");
		int num1 = scn.nextInt();
		System.out.println("두번째 값을 입력: ");
		int num2 = scn.nextInt();
		thirdMethod(num1, num2);
		scn.close();
	}

	public static void thirdMethod(int a, int b) {
		// 매개로 받은 2개의 수를 더하고 결과를 출력.
		int result = a + b;
		System.out.println("결과값은 : " + result);
	}

	public static void secondMethod() {
		// Scanner 활용.
		// "I am a boy", 6 => 문장을 입력받은 숫자의 횟수만큼 반복출력.
		Scanner scn = new Scanner(System.in);
		System.out.println("출력할 문장을 입력하세요.");
		String str1 = scn.nextLine();
		System.out.println("반복할 횟수를 입력: ");
		int num2 = scn.nextInt();

		for (int i = 1; i <= num2; i++) {
			System.out.println(str1);
		}
		scn.close();

	} // end of secondMethod().

	public static void firstMethod() {
		// Scanner 사용해서 입력값을 2개.
		// 2, 3 => 2의 3제곱에 값을 출력. 2*2*2
		int result = 1;

		Scanner scn = new Scanner(System.in);
		System.out.println("첫번째 값을 입력: ");
		int num1 = scn.nextInt();
		System.out.println("두번째 값을 입력: ");
		int num2 = scn.nextInt();

		for (int i = 1; i <= num2; i++) {
			result = result * num1;
		}
		System.out.println("결과: " + result);

		scn.close();
	} // end of firstMethod().
}
