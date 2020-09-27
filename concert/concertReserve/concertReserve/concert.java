package concertReserve;

//�ܼ�Ʈ ��ü!!
public class concert {
	
	private final String HALLNAME = "��ǰ�ܼ�ƮȦ";
	private Group[] group;
	
	public concert() {
		group = new Group[3];
		group[0] = new Group('S');
		group[1] = new Group('A');
		group[2] = new Group('B');
	}
	
	public void reserve(char c, String username, int seatNum) { //����
		//�ش� �迭�� ã�� (c) 
		if(c=='S') {
			seat seat[] = group[0].getSeats(); 
			String value = seat[seatNum-1].getName();
			if(value.equals("---")) {
				//��������
				seat[seatNum-1].setName(username);
			}else {
				//����Ұ�
				System.out.println("����� �ڸ��Դϴ�.");
			}
		}else if(c=='A') {
			seat seat[] = group[1].getSeats(); 
			String value = seat[seatNum-1].getName();
			if(value.equals("---")) {
			
				seat[seatNum-1].setName(username);
			}else {
				
				System.out.println("����� �ڸ��Դϴ�.");
			}
		}else {
			seat seat[] = group[2].getSeats(); 
			String value = seat[seatNum-1].getName();
			if(value.equals("---")) {
				
				seat[seatNum-1].setName(username);
			}else {
			
				System.out.println("����� �ڸ��Դϴ�.");
			}
		}

	}
	
	public void search(char c) { //��ȸ
		if(c=='S') {
			seat seat[] = group[0].getSeats();
			System.out.print(c+">>");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i].getName()+" ");
			}
			System.out.println();
		}else if(c=='A') {
			seat seat[] = group[1].getSeats();
			System.out.print(c+">>");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i].getName()+" ");
			}
			System.out.println();
		}else {
			seat seat[] = group[2].getSeats();
			System.out.print(c+">>");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i].getName()+" ");
			}
			System.out.println();
		}
	}
	
	public void cancel(String username, int groupNum) { //���
		//� �迭���� Ȯ��
		boolean check = false;
		seat seat[] = group[groupNum].getSeats();
		for (int i = 0; i < seat.length; i++) {
			if(seat[i].getName().equals(username)) {
				seat[i].setName("---");
				check = true;
			}
		}
		
		if(check==false) {
			System.out.println("�ش��̸����� ����� �ڸ��� �����ϴ�.");
		}
	}

	public String getHALLNAME() {
		return HALLNAME;
	}
	
}


