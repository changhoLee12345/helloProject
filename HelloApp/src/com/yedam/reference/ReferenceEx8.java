package com.yedam.reference;

import java.util.Scanner;

public class ReferenceEx8 {
	public static void main(String[] args) {
		// 학생수 => 점수 입력. 점수출력, 최고점수, 평균점수.

		Scanner scn = new Scanner(System.in);
		int studentNum = 0; // 학생수 지정.
		int[] scores = null; // scores = new int[5]
		boolean run = true;

		while (run) {
			System.out.println("\n-----------------------");
			System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석(최고,평균) 5.종료 ");
			System.out.println("-----------------------");
			System.out.print("선택> ");

			int selectNo = Integer.parseInt(scn.nextLine());
			if (selectNo == 1) { // 학생수.
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(scn.nextLine());
				scores = new int[studentNum];

			} else if (selectNo == 2) { // 배열의 크기만큼 학생의 점수.

				// 이전 처리가 안되어 있을 경우.
				if (scores == null) {
					System.out.println("*** 학생의 수를 입력하세요. ***");
					continue;
				}

				for (int i = 0; i < scores.length; i++) {
					System.out.printf("scores[%d]> \n", i);
					scores[i] = Integer.parseInt(scn.nextLine());
				}

			} else if (selectNo == 3) { // 배열의 점수 출력.

				// 이전 처리가 안되어 있을 경우.
				if (scores == null) {
					System.out.println("*** 학생의 수를 입력하세요. ***");
					continue;
				} else {
					int sum = 0;
					for (int score : scores) {
						sum += score;
					}
					if (sum == 0) {
						System.out.println("*** 학생의 점수를 입력하세요. ***");
						continue;
					}
				}

				for (int i = 0; i < scores.length; i++) {
					System.out.printf("scores[%d]> %2d \n", i, scores[i]);
				}

			} else if (selectNo == 4) { // 분석: 최고, 평균.

				// 이전 처리가 안되어 있을 경우.
				if (scores == null) {
					System.out.println("*** 배열의 크기를 지정하세요. ***");
					continue;
				} else {
					int sum = 0;
					for (int score : scores) {
						sum += score;
					}
					if (sum == 0) {
						System.out.println("*** 학생의 점수를 입력하세요. ***");
						continue;
					}
				}

				int sum = 0, maxVal = 0;
				double avg = 0;
				for (int i = 0; i < scores.length; i++) {
					if (maxVal < scores[i]) {
						maxVal = scores[i];
					}
					sum += scores[i];
				}
				avg = (double) sum / scores.length;
				System.out.printf("최고점수는 %d, 평균은 %.1f", maxVal, avg);

			} else if (selectNo == 5) { // 종료: 프로그램 종료합니다.
				System.out.println("프로그램을 종료합니다.");
				run = false;
			}
		}

		System.out.println("end of prog.");
	} // end of main().
}
