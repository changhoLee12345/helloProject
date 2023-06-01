package com.yedam.reference;

public class ReferenceEx5 {
	public static void main(String[] args) {
		int[] intAry = new int[3];

		int a = 34, b = 88, c = 22;

		if (a > b) {

			if (a > c) {
				intAry[0] = a;
				if (b > c) {
					intAry[1] = b;
					intAry[2] = c;
				}
			} else {
				intAry[0] = c;
				intAry[1] = a;
				intAry[2] = b;
			}

		} else {

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

				if (a > c) {
					intAry[1] = a;
				}

			}
		}

		System.out.println(intAry);
	}
}
