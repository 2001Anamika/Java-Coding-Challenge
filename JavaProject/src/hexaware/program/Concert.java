package hexaware.program;

public class Concert extends Event {
	public enum Type{THEATRICAL, CLASSICAL, ROCK, RECITAL}
	private String artist;
	private Type type;
	public Concert(String event_name, String event_date, String event_time, String venue_name, int total_seats,
			int available_seats, float ticket_price, EventType event_type, String artist, Type type) {
		super(event_name, event_date, event_time, venue_name, total_seats, available_seats, ticket_price, event_type);
		this.artist = artist;
		this.type = type;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	 public void display_event_details() {
		    System.out.println("Concert Name: " + event_name);
		    System.out.println("Artist Name: " + artist);
		    System.out.println("Concert Type: " + type);
	 }

}
