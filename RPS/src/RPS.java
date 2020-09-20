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
  System.out.print("가위 바위 보!>>");
  game = sc.next();

  switch(game)
  {
   case "가위":
    user=  0;
    System.out.print("사용자 : 가위, ");
   break;
  
   case "바위":
    user=1;
    System.out.print("사용자 : 바위, ");
   break;
   
   case "보":
    user=2;
    System.out.print("사용자 : 보, ");
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

   System.out.print("컴퓨터 : 가위");
   break;
  case 1:
   System.out.print("컴퓨터 : 바위");
   break;
  case 2:
   System.out.print("컴퓨터 : 보");
   break;
  }
  
  System.out.println("");
  
  if(user == 3)
  {
  }
  else if(user == computer)
  {
   System.out.println("비겼습니다");
  }
  else if(user == 0 || computer == 1)
  {
   System.out.println("컴퓨터가 이겼습니다.");
  }
  else if(user == 0 || computer == 2)
  {
   System.out.println("사용자가 이겼습니다.");
  }
  else if(user == 1 || computer == 0)
  {
   System.out.println("사용자가 이겼습니다.");
  }
  else if(user == 1 || computer == 2)
  {
   System.out.println("컴퓨터가 이겼습니다.");
  }
  else if(user == 2 || computer == 0)
  {
   System.out.println("컴퓨터가 이겼습니다.");
  }
  else if(user == 2 || computer == 1)
  {
   System.out.println("사용자가 이겼습니다.");
  }
  else
  {
   System.out.println("잘못된 입력입니다.");
  }
 }
 
 
 
 public static void main(String args[])
 {
	 System.out.print("컴퓨터와 가위바위보 게임을 합니다\n");
  RPS gam = new RPS();
  
  //함수 선언
  for(int i=0;i<5;i++) {
  gam.rspGame();
  gam.fight();
  }
 }
}


