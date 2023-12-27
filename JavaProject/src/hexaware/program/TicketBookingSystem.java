package hexaware.program;

import java.util.Scanner;

import hexaware.program.Event.EventType;

public class TicketBookingSystem {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		try {
			System.out.println("Enter Event name");
			String event_name=scan.next();
			System.out.println("Enter Event date");
			String event_date=scan.next();
			System.out.println("Enter Event time");
			String event_time=scan.next();
			System.out.println("Enter Venue name");
			String venue_name=scan.next();
			System.out.println("Enter Total Seats");
			int total_seats=scan.nextInt();
			System.out.println("Enter Available Seats");
			int available_seats=scan.nextInt();
			System.out.println("Enter Ticket price");
			float ticket_price=scan.nextFloat();
			System.out.println("Enter Event type");
			String input=scan.next().toUpperCase();
			EventType event_type = EventType.valueOf(input);
			/*create_event(event_name,event_date,event_time,venue_name,total_seats,available_seats,ticket_price,event_type);*/

		}catch(IllegalArgumentException iae) {
			System.out.println("Error: Invalid event type. Please enter MOVIE, SPORTS, or CONCERT.");
        } catch (Exception iae) {
            System.out.println("Error: Invalid input. Please enter valid values.");
        }
		public Event create_event(String event_name,String event_date,String event_time,String venue_name,int total_seats,int available_seats,float ticket_price,EventType event_type) {
			Event e1=new Event(event_name,event_date,event_time,venue_name,total_seats,available_seats,ticket_price,event_type);
			return e1;
		}
		public void display_event_details(Event e) {
			e.display_event_details();
		}
		finally{
            scan.close();
        }


	}

}
