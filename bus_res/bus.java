package bus_res;

public class bus {
	private int busno;
	private boolean ac;
	private int capacity;
	private boolean sleeper;
	bus(int b,boolean a,int cap,boolean s){
		this.busno=b;
		this.ac=a;
		this.capacity=cap;
		this.sleeper=s;
	}
	public int getbusno() {
		return busno;
	}
	public int getcapacity() { // ACCESSCOR method
		return capacity;
	}
	public void setcapacity(int cap) { // MUTATOR METHOD
		capacity=cap;
	}
	public boolean getac() {
		return ac;
	}
	public void setac(boolean a) {
		ac=a;
	}
	public boolean getsleeper() {
		return sleeper;
	}
	public void setsleeper(boolean s) {
		sleeper=s;
	}
	public void display() {
		if(ac==true) { 
			System.out.println("Bus Number:"+busno+"   AC:"+ac+"   Total Capacity:"+capacity+"  Sleeper:"+sleeper);
		}
		else {
			System.out.println("Bus Number:"+busno+"   AC:"+ac+"  Total Capacity:"+capacity+"  Sleeper:"+sleeper);
		}
	}
	
}
