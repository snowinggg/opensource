import java.util.Scanner;
import java.util.InputMismatchException;
public class multy {
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
	int n=0, m=0;
	for(int i=0; i<3; i++) {
		try {
		n = scanner.nextInt(); // ���� �Է�
		m = scanner.nextInt();
		break;
		}
		catch(InputMismatchException e) {
		System.out.println("�Ǽ��� �Է� �� �� �����ϴ�");
		System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
		scanner.next(); // �Է� ��Ʈ���� �ִ� ������ �ƴ� ��ū�� ������.
		i--; // �ε����� �������� �ʵ��� �̸� ����
		continue;
		}
	}
	System.out.print(n+"x"+m+"="+n*m);
	scanner.close();
	}
}
