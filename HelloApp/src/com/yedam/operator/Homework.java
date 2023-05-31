package com.yedam.operator;

public class Homework {

	public static void main(String[] args) {

		System.out.printf("%.2f", 2.34);
//		method3();
	}

	public static void method3() {

//		while (true) {
//			int num1 = (int) (Math.random() * 6) + 1;
//			int num2 = (int) (Math.random() * 6) + 1;
//			System.out.println(num1 + ", " + num2);
//			if (num1 + num2 == 5) {
//				break;
//			}
//		}

		for (int i = 1; i <= 4; i++) {
			String star = "";
			for (int j = 1; j <= 4; j++) {
//				1) ....
//				System.out.printf("%s", "*");

//				2) ....
//				if (j < i) {
//					star += "*";
//				}
//				if (j == 4)
//					System.out.println(star);
//				3) ....
				if (i + j >= 5) {
					star += "*";
				} else {
					star += " ";
				}
				if (j == 4) {
					System.out.println(star);
				}
			}
		}
	} // end of method3().

	public static void method2() {
		String[] strAry = "Hello".split("");
		for (String str : strAry) {
			System.out.println(str);
		}
	} // end of method2().

	public static void method1() {
		while (true) {
			int result = (int) (Math.random() * 91) + 10;
			System.out.println(result);
			if (result == 100) {
				break;
			}
		}

		System.out.println("end of prog.");
	} // end of method1().

}
