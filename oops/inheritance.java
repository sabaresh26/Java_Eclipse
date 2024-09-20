package oops;

class emp{
	private String name;
	private double salary; 
	emp(String n,double s) {
		name=n;
		salary=s;
	}
	emp(){
		name="";
		salary=0.0;
	}
	String getname() {return name;}
	void setname(String n) { name=n; }
	double getsalary(){ return salary;}
	void setsalary(double s) { salary=s;}
	double raisesalary(int p) {
		return salary+=salary*p/100;
	}

}
class manager extends emp{
	private double bonus;
	manager(String n,double s,double b){
		super(n,s);
		bonus=b;
	}
	void setbonus(double b) {
		bonus=b;
	}
	double getsalary() { //Method Overridding
		return super.getsalary()+bonus;
	}
}
	
	
public class inheritance {
	public static void main(String[] args) {
		emp e1=new emp("sab",50000);
		System.out.println(e1.getsalary());
		System.out.println(e1.raisesalary(10));
		manager m1=new manager("prem",60000,22000);
		System.out.println(m1.getsalary());
	}
}
