package com.yedam.operator;

import java.util.Scanner;

public class OperatorEx1 {
	// 메소드: 함수인데 객체(object)에 소속되어있는 메소드.
	public static void main(String[] args) {
		/*
		 * 사용자의 값을 입력받도록 num1, num2 값을 입력받도록. num1(3) ~ num2(1) 사이의 값의 합계를 구하는 프로그램 작성.
		 * 짝수만 계산합. 3%2==>1
		 */

		Scanner scn = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		int result = 0;
		String str = "";

		// var, let => int, long
		// for(let i=0; i<3; i++){}
		// for(int i=0; i<3; i++){}
		try {
			System.out.println("첫번째 숫자를 입력하세요.");
			num1 = scn.nextInt();
			System.out.println("두번째 숫자를 입력하세요.");
			num2 = scn.nextInt();
			if (num1 > num2) {
				// 함수가 객체에 소속되어있는것을 메소드라고 함.
				for (int i = num2; i <= num1; i++) {
					if (i % 2 == 0)
						result += i;
				}
			} else {
				// 함수가 객체에 소속되어있는것을 메소드라고 함.
				for (int i = num1; i <= num2; i++) {
					if (i % 2 == 0)
						result += i;
				}
			}
		} catch (Exception e) {
			System.out.println("숫자가 아닌 값을 입력했습니다.");
		}
		System.out.println("결과값은 " + result + "입니다.");

		scn.close(); // resource 환원.
	}
}
