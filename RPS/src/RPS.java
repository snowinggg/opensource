import java.util.Random;
import java.util.Scanner;

public class RPS {
 
 static Random rd = new Random();
 static Scanner sc = new Scanner(System.in);
 
 static int user = 3;
 
 static int computer = rd.nextInt(3);
 
 static String game;
 
 public void rspGame()
 {
  System.out.print("���� ���� ��!>>");
  game = sc.next();

  switch(game)
  {
   case "����":
    user=  0;
    System.out.print("����� : ����, ");
   break;
  
   case "����":
    user=1;
    System.out.print("����� : ����, ");
   break;
   
   case "��":
    user=2;
    System.out.print("����� : ��, ");
   break;
   
   default:
    user=3;
   break;
  }
 }
 
 public void fight()
 {
  switch(computer)
  {
  case 0 :

   System.out.print("��ǻ�� : ����");
   break;
  case 1:
   System.out.print("��ǻ�� : ����");
   break;
  case 2:
   System.out.print("��ǻ�� : ��");
   break;
  }
  
  System.out.println("");
  
  if(user == 3)
  {
  }
  else if(user == computer)
  {
   System.out.println("�����ϴ�");
  }
  else if(user == 0 || computer == 1)
  {
   System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
  }
  else if(user == 0 || computer == 2)
  {
   System.out.println("����ڰ� �̰���ϴ�.");
  }
  else if(user == 1 || computer == 0)
  {
   System.out.println("����ڰ� �̰���ϴ�.");
  }
  else if(user == 1 || computer == 2)
  {
   System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
  }
  else if(user == 2 || computer == 0)
  {
   System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
  }
  else if(user == 2 || computer == 1)
  {
   System.out.println("����ڰ� �̰���ϴ�.");
  }
  else
  {
   System.out.println("�߸��� �Է��Դϴ�.");
  }
 }
 
 
 
 public static void main(String args[])
 {
	 System.out.print("��ǻ�Ϳ� ���������� ������ �մϴ�\n");
  RPS gam = new RPS();
  
  //�Լ� ����
  for(int i=0;i<5;i++) {
  gam.rspGame();
  gam.fight();
  }
 }
}


