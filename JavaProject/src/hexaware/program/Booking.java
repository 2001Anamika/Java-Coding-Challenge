package hexaware.program;
import java.util.Scanner;
import hexaware.program.Event.EventType;
public class Booking {
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
			double ticket_price=scan.nextDouble();
			System.out.println("Enter Event type");
			String input=scan.next().toUpperCase();
			EventType event_type = EventType.valueOf(input);
			System.out.println("Enter Venue address");
			String venue_address=scan.next();
			System.out.println("Enter Customer name");
			String customer_name=scan.next();
			System.out.println("Enter Email");
			String email=scan.next();
			System.out.println("Enter Phone number");
			String phone_number=scan.next();
			System.out.println("Enter Number of tickets to book");
			int num_tickets_to_book=scan.nextInt();
			System.out.println("Enter Number of tickets to cancel");
			int num_tickets_to_cancel=scan.nextInt();
			Event e=new Event(event_name,event_date,event_time,venue_name,total_seats,available_seats,ticket_price,event_type);
			Venue v=new Venue(venue_name,venue_address);
			Customer c=new Customer(customer_name,email,phone_number);
			e.calculate_total_revenue();
			e.book_tickets(num_tickets_to_book);
			int tickets_num=e.getBookedNoOfTickets();
			e.cancel_booking(num_tickets_to_cancel);
			int total_available_seats=e.getAvailable_seats();
			e.calculate_booking_cost(num_tickets_to_book);
			System.out.println("Booked Number of Tickets: "+tickets_num);
			System.out.println("Available Tickets: "+total_available_seats);
			System.out.println("----------Event Details----------");
			e.display_event_details();
			System.out.println("----------Venue Details----------");
			v.display_venue_details();
			System.out.println("----------Customer Details----------");
			c.display_customer_details();
		}catch(IllegalArgumentException iae) {
			System.out.println("Error: Invalid event type. Please enter MOVIE, SPORTS, or CONCERT.");
        } catch (Exception iae) {
            System.out.println("Error: Invalid input. Please enter valid values.");
        }finally {
            scan.close();
        }
	}
}
