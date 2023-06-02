package com.yedam.object;

import java.util.Scanner;

public class ObjectEx2Bank {
	public static void main(String[] args) {
		// int[] {0,0,0}, Bank[] {null,null,null}

		Bank[] accounts = new Bank[3];

		Bank b1 = new Bank();
//		b1.accountNo = "11-11";
//		b1.owner = "홍길동";
//		b1.balance = 10000;
		b1.setAccountNo("11-11");
		b1.setOwner("홍길동");
		b1.setBalance(10000);
//		Bank b2 = new Bank();
//		b2.accountNo = "11-22";
//		b2.owner = "박길동";
//		b2.balance = 20000;
//		Bank b3 = new Bank();
//		b3.accountNo = "11-33";
//		b3.owner = "최길동";
//		b3.balance = 30000;

		accounts = new Bank[3]; // 계좌3건 등록
		accounts[0] = b1;

		boolean run = true;
		int selectNo = 0;
		Scanner scn = new Scanner(System.in);

		while (run) {
			System.out.println("1.등록 2.조회(계좌번호) 3.입금 4.출금 5.종료");
			System.out.print("선택> ");
			selectNo = Integer.parseInt(scn.nextLine());

			if (selectNo == 1) { // 등록.
				System.out.print("계좌번호입력> ");
				String account = scn.nextLine();

				System.out.print("예금주입력> ");
				String owner = scn.nextLine();

				System.out.print("금액입력> ");
				int balance = Integer.parseInt(scn.nextLine());

				Bank bank = new Bank();
				bank.accountNo = account;
				bank.owner = owner;
				bank.balance = balance;

				for (int i = 0; i < accounts.length; i++) {
					if (accounts[i] == null) {
						accounts[i] = bank;
						System.out.println("정상적으로 등록.");
						break;
					}
				}

			} else if (selectNo == 2) { // 조회(계좌번호)
				System.out.print("조회할 계좌번호> ");
				String account = scn.nextLine();
				boolean isExist = false; // 계좌의 존재여부를 체크하기위한 변수.
				for (int i = 0; i < accounts.length; i++) {
					// 배열위치의 값이 null 아닌 경우에만 조건검색.
					if (accounts[i] != null && accounts[i].accountNo.equals(account)) {
						System.out.printf("예금주: %s, 잔액: %d\n", //
								accounts[i].owner, accounts[i].balance);
						isExist = true;
						break; // 조회하려는 계좌를 찾았으면 더 반복할 필요가 없다.
					}
				}
				if (!isExist) {
					System.out.printf("%s 계좌가 존재하지 않습니다.\n", account);
				}

			} else if (selectNo == 3) { // 입금
				System.out.print("계좌번호입력> ");
				String account = scn.nextLine();
				// 조회하는 계좌가 있는지를 체크.
				// 없을 경우에는 메세지보여주고 있을 경우에는 진행.
				boolean isExist = false;
				for (int i = 0; i < accounts.length; i++) {
					if (accounts[i] == null && accounts[i].accountNo.equals(account)) {
						isExist = true;
						break;
					}
				}
				if (!isExist) {
					System.out.println("찾는 계좌가 없습니다.");
					continue;
				}

				System.out.print("금액입력> ");
				int balance = Integer.parseInt(scn.nextLine());

				for (int i = 0; i < accounts.length; i++) {
					// 배열위치의 값이 null 아닌 경우에만 조건검색.
					if (accounts[i] != null && accounts[i].accountNo.equals(account)) {
						accounts[i].balance += balance;
					}
				}

			} else if (selectNo == 4) { // 출금
				System.out.print("계좌번호입력> ");
				String account = scn.nextLine();

				System.out.print("금액입력> ");
				int balance = Integer.parseInt(scn.nextLine());

				for (int i = 0; i < accounts.length; i++) {
					// 배열위치의 값이 null 아닌 경우에만 조건검색.
					if (accounts[i] != null && accounts[i].accountNo.equals(account)) {
						accounts[i].balance -= balance;
					}
				}

			} else if (selectNo == 5) { // 종료.
				System.out.println("프로그램을 종료합니다.");
				run = false;

			}
		} // end of while().

		System.out.println("end of prog.");
		scn.close();
	} // end of main().
}
