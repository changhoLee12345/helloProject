package com.yedam.control;

public class ControlEx1 {
	public static void main(String[] args) {
		// 0 ~ 1 사이의 임의의 수를 생성.
		// 3.454543534534 => 3
		// 0 ~ 9 => 1 ~ 10
		String msg = "";
		int result = (int) (Math.random() * 10) + 1; //
		System.out.println(result);
		if (result % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}

		// Math.random 을 활용해서 10 ~ 100 까지의 임의의 수.
		// 생성된 값이 100~90 A출력.
		// 80 ~ 89: B, 70 ~ 79: C, 그외는 D 출력.
		while (true) {
			result = (int) (Math.random() * 91) + 10;
			System.out.println(result);
			if (result == 10) {
				break;
			}
		}

		result = (int) (Math.random() * 91) + 10;
		if (result >= 90) {
			msg = "A";
		} else if (result >= 80) {
			msg = "B";
		} else if (result >= 70) {
			msg = "C";
		} else {
			msg = "D";
		}
		System.out.printf("점수 %d는 %s등급입니다.", result, msg);
	}
}
