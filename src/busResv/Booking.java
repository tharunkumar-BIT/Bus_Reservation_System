package busResv;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking {
	String passengerName;
	int busNo;
	Date date;
	
	Booking(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name of passenger: ");
		passengerName = scanner.next();
		System.out.println("Enter bus no: ");
		busNo = scanner.nextInt();
		System.out.println("Enter Date of Travel (dd-mm-yyyy): ");
		String dateInput = scanner.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		try {
			date = dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
		// only read the data, don't change anything on the list because reference will be received as parameter in this function
		// if we change, it would lead to data lost or miss match
		int capacity = 0;
		for(Bus bus : buses) {
			if(bus.getBusNo() == busNo) {
				capacity = bus.getCapacity();
			}
		}
		
		int booked = 0;
		for(Booking b : bookings) {
			if(b.busNo == busNo && b.date.equals(date)) {
				booked++;
			}
		}
		
		return booked < capacity ? true : false;
	}
}
