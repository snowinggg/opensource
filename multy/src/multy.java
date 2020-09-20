import java.util.Scanner;
import java.util.InputMismatchException;
public class multy {
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("곱하고자 하는 두 수 입력>>");
	int n=0, m=0;
	for(int i=0; i<3; i++) {
		try {
		n = scanner.nextInt(); // 정수 입력
		m = scanner.nextInt();
		break;
		}
		catch(InputMismatchException e) {
		System.out.println("실수는 입력 할 수 없습니다");
		System.out.print("곱하고자 하는 두 수 입력>>");
		scanner.next(); // 입력 스트림에 있는 정수가 아닌 토큰을 버린다.
		i--; // 인덱스가 증가하지 않도록 미리 감소
		continue;
		}
	}
	System.out.print(n+"x"+m+"="+n*m);
	scanner.close();
	}
}
