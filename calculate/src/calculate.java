import java.util.Scanner;
public class calculate {
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("연산>>");
	int a = scanner.nextInt();
	char c = scanner.next().charAt(0);
	int b = scanner.nextInt();

	
	if(c=='/' && b==0) {
		System.out.println("0으로 나눌수 없습니다.");
	}else {
		System.out.print(a+""+c+""+b+"의 계산 결과는 ");
		
		switch(c) {
		case '+' : System.out.print((a+b));
		break;
		case '-' : System.out.print((a-b));
		break;
		case '*' : System.out.print((a*b));
		break;
		case '/' : System.out.print((a/b));
		break;
		default:
			System.out.println("사칙연산이 아닙니다.");
		}
	}

	}
}