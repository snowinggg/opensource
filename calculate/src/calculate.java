import java.util.Scanner;
public class calculate {
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("����>>");
	int a = scanner.nextInt();
	char c = scanner.next().charAt(0);
	int b = scanner.nextInt();

	
	if(c=='/' && b==0) {
		System.out.println("0���� ������ �����ϴ�.");
	}else {
		System.out.print(a+""+c+""+b+"�� ��� ����� ");
		
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
			System.out.println("��Ģ������ �ƴմϴ�.");
		}
	}

	}
}