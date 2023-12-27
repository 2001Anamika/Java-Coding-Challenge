package hexaware.program;

public class Sports extends Event{
	 public Sports(String event_name, String event_date, String event_time, String venue_name, int total_seats,
			int available_seats, float ticket_price, EventType event_type, String sportName, String teamsName) {
		super(event_name, event_date, event_time, venue_name, total_seats, available_seats, ticket_price, event_type);
		this.sportName = sportName;
		this.teamsName = teamsName;
	}

	private String sportName, teamsName;

	public String getSportName() {
		return sportName;
	}

	public void setSportName(String sportName) {
		this.sportName = sportName;
	}

	public String getTeamsName() {
		return teamsName;
	}

	public void setTeamsName(String teamsName) {
		this.teamsName = teamsName;
	}
	public void display_event_details() {
		System.out.println("Sport Name: " + sportName);
		System.out.println("Teams Name: " + teamsName);
	}
	 
}
