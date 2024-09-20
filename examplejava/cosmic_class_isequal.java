package examplejava;

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
	boolean isequal(emp e) {
		if(this==e) {
			return true;
		}
		if(this.getClass()!=e.getClass()) {
			return false;
		}
		if(this.name.equals(e.getname()) && this.getsalary()==e.getsalary()) {
			return true;
		}
		return false;
	}

}
class manager extends emp{
	private double bonus;
	manager(String n,double s,double b){
		super(n,s);
		bonus=b;
	}
	double getbonus() {
		return bonus;
	}
	void setbonus(double b) {
		bonus=b;
	}
	double getsalary() { //Method Overridding
		return super.getsalary()+bonus;
	}
	boolean isequal(manager e) {
		if(this==e) {
			return true;
		}
		if(this.getClass()!=e.getClass()) {
			return false;
		}
		if(this.getname().equals(e.getname()) && this.getsalary()==e.getsalary() && this.getbonus()==e.getbonus()) {
			return true;
		}
		return false;
	}
}
	
	
public class cosmic_class_isequal {
	public static void main(String[] args) {
		emp e1=new emp("sab",50000);
		System.out.println(e1.getsalary());
		manager m1=new manager("naz",60000,30000);
		System.out.println(m1.getsalary());
		manager m2=new manager("naz",60000,30000);
		System.out.println(m2.getsalary());
		emp e2=new emp("sab",50000);
		System.out.println(e2.getsalary());
		System.out.println(e1.isequal(m2));
	

		System.out.println(e1.isequal(m1));
	}
}
