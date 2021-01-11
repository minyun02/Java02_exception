import java.util.Scanner;

public class ExceptionEx {

	public ExceptionEx() {
		
	}

	public void start() {
		Scanner scan = new Scanner(System.in);
		do {	
			try {
				System.out.print("첫번째 수 ->");
				//int num1 = scan.nextInt();//-------------InputMismatchException
				//콘솔의 문자열 1줄을 입력받는다.
				int num1 = Integer.parseInt(scan.nextLine());
				
				System.out.print("두번째 수 ->");
				int num2 = Integer.parseInt(scan.nextLine());
				
				int result = num1 * num2;
				int result2 = num1 / num2; //------------0으로 나눌때 ArithmeticException
				
				System.out.println(num1+"*"+num2+"="+result);
				System.out.printf("%d/%d=%d\n", num1, num2, result2);
				
				String names[] = {"세종대왕", "이순신"};
				for(int i=0; i<=names.length;i++) {		//배열 index 	ArrayIndexOutOfBoundsException
					System.out.println("names["+i+"]="+ names[i]);
				}
			}//catch(InputMismatchException ime) {
				//System.out.println("숫자만 입력하세요...");
			//}
			catch(NumberFormatException nfe) {
				System.out.println("숫자만 입력하세요....");
			}catch(ArithmeticException ae) {
				System.out.println("두번째 값은 0외의 값을 입력해야 합니다.");
			}catch(ArrayIndexOutOfBoundsException ai) {
				System.out.println("배열의 index를 잘못사용하였습니다.."+ ai.getMessage());
			}
		}while(true);
	}
	
	public static void main(String[] args) {
		new ExceptionEx().start();
	}

}
