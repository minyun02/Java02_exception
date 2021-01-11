import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest1 {

	public ExceptionTest1() {
		try {
			//예외처리하기
			//예외 발생 가능한 코드와 예외발생가능성이 없는 코드도 명시 가능하다.
			Scanner scan = new Scanner(System.in);
			System.out.println("정수를 입력하세요>>");
			int n = scan.nextInt();					//
			System.out.println("n="+ n);
		}catch(InputMismatchException ime) {
			//try영역 코드에서 예외가 발생하면 실행될 영역
			//ime.printStackTrace();
			
			//System.out.println(ime.getMessage());
			
			System.out.println("숫자를 잘못입력하였습니다..");
		}
		//System.out.println("프로그램이 종료되었습니다.");
	}
	public static void main(String[] args) {
		new ExceptionTest1();
	}

}
