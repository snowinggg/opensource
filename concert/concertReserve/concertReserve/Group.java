package concertReserve;

public class Group {
	private char type; //S, A, B
	private seat[] seats;
	
	public Group(char type) {
		this.type = type;
		
		seats = new seat[10];
		for (int i = 0; i < seats.length; i++) {
			seats[i] = new seat("---");
		}
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public seat[] getSeats() {
		return seats;
	}

	public void setSeats(seat[] seats) {
		this.seats = seats;
	}
	
	
}
