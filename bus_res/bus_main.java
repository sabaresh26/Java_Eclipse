package bus_res;
import java.util.Scanner;
import java.util.ArrayList;
public class bus_main {
	public static void main(String[] args) {
		
		ArrayList <bus> buses=new ArrayList();
		ArrayList <booking> book=new ArrayList();
		
		buses.add(new bus(01,true,5,true));
		buses.add(new bus(02,false,5,false));
		buses.add(new bus(03,true,5,false));
		
		for(bus b:buses) {
			b.display();
		}
		int n=1;
		while(n==1) {
			Scanner in=new Scanner(System.in);
			System.out.print("Enter  1 - Continue or 2 - Exit :");
			n=in.nextInt();
			if(n==1) {
				booking books=new booking();
				if(books.isavailable(buses, book)) {
					
					System.out.print("1 - Confirm your Ticket 2 - Cancel the Ticket : ");
					int c=in.nextInt();
					if(c==1) {
						book.add(books);
						System.out.println("Hii "+books.name+"  Your Booking is Confirmed");
				     	books.displaybook();
					}
					else {
						System.out.println("Your Tickect is Canceled");
						}
				}
				else {
					System.out.println("Sorry Bus is full ,Try Another bus or dates");
				}
			}
			else {
				System.out.println("Thanks for visiting");
			}
		}
	}
}

