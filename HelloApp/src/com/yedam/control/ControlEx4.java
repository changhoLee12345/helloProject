package com.yedam.control;

public class ControlEx4 {

	public static void main(String[] args) {
		// 1부터 100까지의 수중에서 3의 배수의 합계. method1()
		// Math.random() 의 2번 실행 => 두수의 합이 5가 되는 경우.
		// 1,4, 2,3, 3,2, 반복회수를 중단. method2()
		// 반복문 for를 활용.
		// *___ 1-1
		// **__ 2-2
		// ***_ 3-3
		// **** 4-4. method3()
		// ___* 1-4
		// __** 2-3
		// _*** 3-2
		// **** 4-1. method4()

		method3();
		System.out.println();
		method4();

	} // end of main().

	public static void method4() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i + j >= 5) {
					System.out.printf("%s", "*");
				} else {
					System.out.printf("%s", " ");
				}
			}
			System.out.println();
		}
	}

	public static void method3() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i < j) {
					System.out.printf("%s", " ");
				} else {
					System.out.printf("%s", "*");
				}
			}
			System.out.println(); // 줄바꿈.
		}
	}

	public static void method1() {

	} // end of method1().

	public static void method2() {

	} // end of method2().

}
