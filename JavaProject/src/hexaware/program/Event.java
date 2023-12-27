package hexaware.program;
class Event {

	public enum EventType{MOVIE,SPORTS,CONCERT}
    private String event_name;
    private String event_date,event_time;
    private String venue_name;
    private int total_seats,available_seats;
    private float ticket_price;
    private EventType event_type;
	Event(String event_name, String event_date, String event_time, String venue_name, int total_seats,
			int available_seats, float ticket_price, EventType event_type) {
		super();
		this.event_name = event_name;
		this.event_date = event_date;
		this.event_time = event_time;
		this.venue_name = venue_name;
		this.total_seats = total_seats;
		this.available_seats = available_seats;
		this.ticket_price = ticket_price;
		this.event_type = event_type;
	}


	public String getEvent_name() {
		return event_name;
	}

	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}

	public String getEvent_date() {
		return event_date;
	}

	public void setEvent_date(String event_date) {
		this.event_date = event_date;
	}

	public String getEvent_time() {
		return event_time;
	}

	public void setEvent_time(String event_time) {
		this.event_time = event_time;
	}

	public String getVenue_name() {
		return venue_name;
	}

	public void setVenue_name(String venue_name) {
		this.venue_name = venue_name;
	}

	public int getTotal_seats() {
		return total_seats;
	}

	public void setTotal_seats(int total_seats) {
		this.total_seats = total_seats;
	}

	public int getAvailable_seats() {
		return available_seats;
	}

	public void setAvailable_seats(int available_seats) {
		this.available_seats = available_seats;
	}

	public double getTicket_price() {
		return ticket_price;
	}

	public void setTicket_price(double ticket_price) {
		this.ticket_price = ticket_price;
	}

	public EventType getEvent_type() {
		return event_type;
	}

	public void setEvent_type(EventType event_type) {
		this.event_type = event_type;
	}
    public double calculate_total_revenue(){
    	int num_ticket=total_seats-available_seats;
    	double total_revenue=ticket_price*num_ticket;
    	return total_revenue;
    }
    public int getBookedNoOfTickets(){
    	int num_ticket=total_seats-available_seats;
    	return num_ticket;
    }
    public void book_tickets(int num_tickets){
    	available_seats=available_seats-num_tickets;
    	System.out.println("Tickets Booked");
    }
    public void cancel_booking(int num_tickets) {
    	available_seats=available_seats+num_tickets;
    	System.out.println("Tickets Cancelled");
    }
    public void display_event_details() {
        System.out.println("Event Name: " + event_name);
        System.out.println("Event Date: " + event_date);
        System.out.println("Event Time: " + event_time);
        System.out.println("Venue Name: " + venue_name);
        System.out.println("Total Seats: " + total_seats);
        System.out.println("Available Seats: " + available_seats);
        System.out.println("Ticket Price: $" + ticket_price);
        System.out.println("Event Type: " + event_type);
    }

	public void calculate_booking_cost(int num_tickets) {
		double total_cost=num_tickets*ticket_price;
		System.out.println("Total Cost: "+total_cost);
	}
	@Override
	public String toString() {
        return "Event Name: " + event_name + "\n" +
               "Event Date: " + event_date + "\n" +
               "Event Time: " + event_time + "\n" +
               "Venue Name: " + venue_name + "\n" +
               "Total Seats: " + total_seats + "\n" +
               "Available Seats: " + available_seats + "\n" +
               "Ticket Price: $" + ticket_price + "\n" +
               "Event Type: " + event_type;
    }
}

