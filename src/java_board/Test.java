package java_board;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cmd = "";
		String store = null; //변수를 만들면 무조건 초기화를 해주는 게 좋다. ""->없는데이터,null
		
		while(true) {
			System.out.print("명령어를 입력해주세요 : ");
			cmd = sc.next();
			if(cmd.equals("exit")) {
				System.out.println("프로그램종료");
				break;
			}
			if(cmd.equals("help")) {
				System.out.println("add : 데이터 저장");
				System.out.println("read : 데이터 조회");
				System.out.println("update : 데이터 수정");
				System.out.println("delete : 데이터 삭제");
			}
			if(cmd.equals("add")) {
				System.out.println("어떤 값을 저장하시겠습니까? : ");
				store = sc.next(); //저장한 값을 store에 했음ㅎㅎ 
			}
			if(cmd.equals("read")) {
				if(store == null) {
					System.out.println("데이터가 없습니다.");
				} else {
					System.out.println(store);
				}	
			}
			if(cmd.equals("update")) {
				System.out.println("어떤 값을 수정하시겠습니까? :");
				store = sc.next();
			}
			if(cmd.equals("delete")) {
				store = null; //데이터x
				System.out.println("삭제가 완료되었습니다.");
			}
		}
	}

}
