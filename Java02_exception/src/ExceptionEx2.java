import java.util.Scanner;

public class ExceptionEx2 {
	Scanner scan = new Scanner(System.in);
	public ExceptionEx2() {
		
	}
	public void start() {
		try {	
			System.out.print("첫번째 수 ->");
			
			//콘솔의 문자열 1줄을 입력받는다.
			int num1 = Integer.parseInt(scan.nextLine());//------------!!!! NumberFormatException
			
			System.out.print("두번째 수 ->");
			int num2 = Integer.parseInt(scan.nextLine());
			
			int result = num1 * num2;
			int result2 = num1 / num2; //------------!!!!0으로 나눌때 ArithmeticException
			
			System.out.println(num1+"*"+num2+"="+result);
			System.out.printf("%d/%d=%d\n", num1, num2, result2);
			
			String names[] = {"세종대왕", "이순신"};
			for(int i=0; i<=names.length;i++) {		//배열 index 	ArrayIndexOutOfBoundsException
				System.out.println("names["+i+"]="+ names[i]);
			}	
		}catch(ArrayIndexOutOfBoundsException oe) {
			System.out.println("배열에서 예외발생..");
		}catch(Exception e) {		//Exception이 마지막에 와야한다 -> Exception이 상위클래스이기 때문에.
			System.out.println("0을 제외한 정수 입력하세요.. --->"+ e.getMessage());
		}
	}
	public static void main(String[] args) {
		new ExceptionEx2().start();

	}

}
