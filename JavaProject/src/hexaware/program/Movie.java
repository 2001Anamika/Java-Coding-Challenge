package hexaware.program;

public class Movie extends Event{
	private String genre,ActorName,ActressName;
	public Movie(String event_name, String event_date, String event_time, String venue_name, int total_seats,
			int available_seats, float ticket_price, EventType event_type, String genre, String actorName,
			String actressName) {
		super(event_name, event_date, event_time, venue_name, total_seats, available_seats, ticket_price, event_type);
		this.genre = genre;
		this.ActorName = actorName;
		this.ActressName = actressName;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getActorName() {
		return ActorName;
	}
	public void setActorName(String actorName) {
		ActorName = actorName;
	}
	public String getActressName() {
		return ActressName;
	}
	public void setActressName(String actressName) {
		ActressName = actressName;
	}
public void display_event_details() {
    System.out.println("Movie Name: " + event_name);
    System.out.println("Movie Genre: " + genre);
    System.out.println("Movie Actor: " + ActorName);
    System.out.println("Movie Actress: " + ActressName);
    }
}
