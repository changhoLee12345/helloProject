package com.yedam.reference;

public class ReferenceEx3 {
	public static void main(String[] args) {
		// 학생점수: 89.5, 78.9, 90.4 값을 저장. sum, avg 구함.
		double[] scores = { 89.5, 78.9, 90.4 };
		scores = new double[] { 55.5, 66.6, 77.7, 88.8 };
		double maxVal = 0;
		double minVal = 100;
		// 최저점수도 반영.
		double sum = 0;
		for (double score : scores) {
			if (maxVal < score) {
				maxVal = score; // 최대점수
			}
			if (minVal > score) {
				minVal = score; // 최저점수
			}
			sum += score;
		}
		double avg = sum / 3;
		String fmt = "합계점수는 %.2f, 평균은 %.2f, 최고점수는 %.1f, 최저점수는 %.1f";
		System.out.printf(fmt, sum, avg, maxVal, minVal);
	}
}
