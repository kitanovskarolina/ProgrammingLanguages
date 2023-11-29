package car;

public class Vehicle {
	class Car{
		private String type;
		private int no_seats;
		private String fuel;
		private String body_color;
		Car(){
		type="";
		no_seats=0;
		fuel="";
		body_color="";
		}
		Car (String type, int seats, String fuel, String body_color){
		this.type=type;
		this.no_seats=seats;
		this.fuel=fuel;
		this.body_color=body_color;
		}
		public string getType(){
		return type;
		}
		public void setType(String type){
		this.type=type;
		}
		 public int getNoSeats() {
		        return no_seats;
		    }

		    public void setNoSeats(int no_seats) {
		        this.no_seats = no_seats;
		    }

		    public String getFuel() {
		        return fuel;
		    }

		    public void setFuel(String fuel) {
		        this.fuel = fuel;
		    }

		    public String getBodyColor() {
		        return body_color;
		    }

		    public void setBodyColor(String body_color) {
		        this.body_color = body_color;
		    }
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
