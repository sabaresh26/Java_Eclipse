package bus_res;
import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
public class booking {
    String name;
	private int busno;
	private Date date;
	private int phno;
	booking() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Name : ");
		name=in.next();
		System.out.println("Enter the Phone Number :");
		phno=in.nextInt();
		System.out.println("Enter the Bus Number :");
		busno=in.nextInt();
		System.out.println("Enter the Date DD-MM-YYYY");
		String dateinput=in.next();
		SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy");
		try {
			date=dateformat.parse(dateinput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public boolean isavailable(ArrayList <bus> buses,ArrayList <booking> book) {
		int capacity=0;
		for(bus b:buses) {
			if(b.getbusno()==busno) {
				capacity=b.getcapacity();
				ac=b.getac();
				sleeper=b.getsleeper();
				
			}
		}
		int booked=0;
		for(booking b:book) {
			if(b.busno==this.busno && b.date.equals(date)) {
				booked++;
			}
		}
		booked1=booked;
		capacity1=capacity-booked-1;
		return booked<capacity?true:false;
	}
	int booked1,capacity1;
	boolean ac,sleeper;
	public void displaybook() {
				System.out.println("Bus Number:"+busno+"  Date : "+date+"   AC:"+ac+"   Available Seats:"+capacity1+"  Sleeper:"+sleeper);
		}
	
}
