package com.yedam.reference;

public class ReferenceEx5 {
	public static void main(String[] args) {
		int[] intAry = new int[4];
		intAry[0] = (int) (Math.random() * 100);
		intAry[1] = (int) (Math.random() * 100);
		intAry[2] = (int) (Math.random() * 100);
		intAry[3] = (int) (Math.random() * 100);

		// 변경.
		for (int j = 0; j < intAry.length - 1; j++) {
			for (int i = 0; i < intAry.length - 1; i++) {
				// i = 0: 3 <-> 7, i = 1: i = 2:
				int temp = 0;
				if (intAry[i] < intAry[i + 1]) {
					temp = intAry[i];
					intAry[i] = intAry[i + 1];
					intAry[i + 1] = temp;
				}
			}
		} // end of for.

		for (int num : intAry)
			System.out.println(num);
	}

	public static void method1() {
		int[] intAry = new int[3];
		// (int)(Math.random()*100);
		int a = (int) (Math.random() * 100);
		int b = (int) (Math.random() * 100);
		int c = (int) (Math.random() * 100);
		// a>b>c, a>c>b, b>a>c, b>c>a, c>a>b, c>b>a
		if (a > b) {
			if (a > c) {
				intAry[0] = a;
				if (b > c) {
					intAry[1] = b;
					intAry[2] = c;
				} else {
					intAry[1] = c;
					intAry[2] = b;
				}
			} else {
				intAry[0] = c;
				intAry[1] = a;
				intAry[2] = b;
			}
		} else { // a < b
			if (b > c) {
				intAry[0] = b;
				if (a > c) {
					intAry[1] = a;
					intAry[2] = c;
				} else {
					intAry[1] = c;
					intAry[2] = a;
				}
			} else {
				intAry[0] = c;
				intAry[1] = b;
				intAry[2] = a;
			}
		}
		// 제일 큰수 intAry 의 첫번째: 제일큰값...제일작은값.
		// intAry[0] = 85, intAry[1] = 34, intAry[2] = 22;
		for (int num : intAry)
			System.out.println(num);
	}
}
