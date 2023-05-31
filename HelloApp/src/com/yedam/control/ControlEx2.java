package com.yedam.control;

public class ControlEx2 {
	public static void main(String[] args) {
		// 12월
// 메소드...마지막날짜값: 1=>31, 2=>28, 3=>31, 4=>30
		System.out.println("1월달의 마지막날은 " + getLastDate(1));
	} // end of main().

	public static int getLastDate(int month) {
		int result = 0;

		switch (month) {
		case 2:
			result = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			result = 30;
			break;
		default:
			result = 31;
		}

		return result;
	} // end of getLastDate().

	public static void method1() {
		int result = (int) (Math.random() * 3) + 1;
		switch (result) {
		case 1:
			System.out.println("가위.");
			break;
		case 2:
			System.out.println("바위.");
			break;
		case 3:
			System.out.println("보.");
		}

		// 정수 연산(+,-,*,/) 정수 => 정수.
		result = (int) (Math.random() * 91) + 10;
		switch (result / 10) {
		case 10:
			System.out.println("A++");
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("D");
		}

		System.out.println("end of prog.");
	} // end of method1().
}
