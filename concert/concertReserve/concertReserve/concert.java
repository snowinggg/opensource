package concertReserve;

//콘서트 객체!!
public class concert {
	
	private final String HALLNAME = "명품콘서트홀";
	private Group[] group;
	
	public concert() {
		group = new Group[3];
		group[0] = new Group('S');
		group[1] = new Group('A');
		group[2] = new Group('B');
	}
	
	public void reserve(char c, String username, int seatNum) { //예약
		//해당 배열을 찾기 (c) 
		if(c=='S') {
			seat seat[] = group[0].getSeats(); 
			String value = seat[seatNum-1].getName();
			if(value.equals("---")) {
				//예약진행
				seat[seatNum-1].setName(username);
			}else {
				//예약불가
				System.out.println("예약된 자리입니다.");
			}
		}else if(c=='A') {
			seat seat[] = group[1].getSeats(); 
			String value = seat[seatNum-1].getName();
			if(value.equals("---")) {
			
				seat[seatNum-1].setName(username);
			}else {
				
				System.out.println("예약된 자리입니다.");
			}
		}else {
			seat seat[] = group[2].getSeats(); 
			String value = seat[seatNum-1].getName();
			if(value.equals("---")) {
				
				seat[seatNum-1].setName(username);
			}else {
			
				System.out.println("예약된 자리입니다.");
			}
		}

	}
	
	public void search(char c) { //조회
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
	
	public void cancel(String username, int groupNum) { //취소
		//어떤 배열인지 확인
		boolean check = false;
		seat seat[] = group[groupNum].getSeats();
		for (int i = 0; i < seat.length; i++) {
			if(seat[i].getName().equals(username)) {
				seat[i].setName("---");
				check = true;
			}
		}
		
		if(check==false) {
			System.out.println("해당이름으로 예약된 자리가 없습니다.");
		}
	}

	public String getHALLNAME() {
		return HALLNAME;
	}
	
}


