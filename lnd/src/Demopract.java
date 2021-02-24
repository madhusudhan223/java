class Demopract{
	public static void main(String[] args) {
		Area a=new Area();
		a.area();
		int y=a.area(10);
		System.out.println("area of square :"+y);
		a.area(10,20);
	}
}
class Area{
	void area() {
		int y=area(20);
		double pi=3.14;
		double area=pi*y;
		System.out.println("area of circle "+area);
	}
	void area(int x,int y) {
	int area=x*y;
	System.out.println("area of rectangle :"+area);
}
	static int area(int x) {
	int area =x*x;
	
	return area;
	
}
}