package concertReserve;

public class seat {
	private String name; // ---, ---, ---
	
	public seat(String name) {
		this.name = name;
	}

	//조회
	public String getName() {
		return name;
	}

	//예약
	public void setName(String name) {
		this.name = name;
	}
	
}
