package oops;
class box{
	int len;
	int height;
	int breadth;
	box(int l,int b,int h){
		len=l;
		height=h;
		breadth=b;
	}
	box(int l){
		len=height=breadth=l;
	}
	box(int l,int h){
		len=breadth=l;
		height=h;
	}
	void in(int l,int b,int h) {
		len=l;
		height=h;
		breadth=b;
	}
	boolean isequal(box b) {
		if(len==b.len && height==b.height && breadth==b.breadth) {
			return true;
		}
		return false;
	}
	int volume() {
		return len*breadth*height;
	}
}
public class demo {
	public static void main(String[] args) {
		box b1=new box(1,3,1);
		System.out.println(b1.volume());
		box b2=new box(1,1,1);
		System.out.println(b2.volume());
		b2=b1;
		System.out.println(b2.volume());
		box b3=new box(2);
		System.out.println(b3.volume());
		box b4=new box(2,3);
		System.out.println(b4.volume());
		
		System.out.println("IsEqual = "+b1.isequal(b2));
		
	}

}
