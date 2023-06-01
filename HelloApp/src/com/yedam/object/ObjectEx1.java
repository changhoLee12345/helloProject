package com.yedam.object;

import java.util.Scanner;

public class ObjectEx1 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		Member[] members = new Member[3];

		// 등록.
		for (int i = 0; i < members.length; i++) {
			Member m1 = new Member();
			System.out.print("아이디를 입력> ");
			String id = scn.nextLine();
			// i => 0 이면 처음등록.
			// i != 0 면 2번째 등록 1 비교. 동일한 아이디를 체크.
			if (i != 0) {
				boolean dupId = false; // 중복된 아이디를 체크하기 위해 선언.
				for (int j = 0; j < i; j++) {
					if (members[j].memberId.equals(id)) {
						dupId = true; // 중복된 아이디임을 확인.
						break; //중복여부를 확인했으면 다음 순번을 볼 필요없음.
					}
				}
				if (dupId) {
					System.out.println("중복된 아이디입니다.");
					i--; // 순번을 한번 빼줌.
					continue;
				}
			}
			m1.memberId = id;
			System.out.print("이름을 입력> ");
			m1.memberName = scn.nextLine();
			System.out.print("point를 입력> ");
			m1.point = Integer.parseInt(scn.nextLine());

			members[i] = m1;
		}

		// memberId 조회 후 point 를 변경.
		System.out.print("조회할 아이디를 입력.");
		String searchId = scn.nextLine();
		System.out.print("변경할 point 를 입력.");
		int newPoint = Integer.parseInt(scn.nextLine());

		for (int i = 0; i < members.length; i++) {
			if (members[i].memberId.equals(searchId)) {
				members[i].point = newPoint;
			}
		}

		// 출력.
		for (int i = 0; i < members.length; i++) {
			System.out.printf("아이디: %s, 이름: %s, pont: %d\n", //
					members[i].memberId, //
					members[i].memberName, //
					members[i].point);
		}

		scn.close();
	}
}
