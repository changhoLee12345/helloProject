package com.yedam.object;

import java.util.Scanner;

public class ObjectEx2Bank {
	public static void main(String[] args) {
		// int[] {0,0,0}, Bank[] {null,null,null}

		Bank[] accounts = new Bank[3];

		Bank b1 = new Bank();
		b1.accountNo = "11-11";
		b1.owner = "홍길동";
		b1.balance = 10000;
		Bank b2 = new Bank();
		b2.accountNo = "11-22";
		b2.owner = "박길동";
		b2.balance = 20000;
		Bank b3 = new Bank();
		b3.accountNo = "11-33";
		b3.owner = "최길동";
		b3.balance = 30000;

//		accounts = new Bank[] { b1, b2, b3 }; // 계좌3건 등록

		boolean run = true;
		int selectNo = 0;
		Scanner scn = new Scanner(System.in);

		while (run) {
			System.out.println("1.등록 2.조회(계좌번호) 3.입금 4.출금 5.종료");
			System.out.print("선택> ");
			selectNo = Integer.parseInt(scn.nextLine());

			if (selectNo == 1) { // 등록.

			} else if (selectNo == 2) { // 조회(계좌번호)

			} else if (selectNo == 3) { // 입금

			} else if (selectNo == 4) { // 출금

			} else if (selectNo == 5) { // 종료.

			}
		} // end of while().

		System.out.println("end of prog.");
		scn.close();
	} // end of main().
}
