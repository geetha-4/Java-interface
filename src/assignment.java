interface shapes{
	void collectdata();
	void calculate();
	void display();
}
class Circle implements shapes{
		double radius ;
		double pi=3.14768;
		double area;
		public void collectdata() {
			radius=5;
			System.out.println("enter the radius: "+radius);
}
		public void calculate() {
			area=pi*radius*radius;
		}
		public void display() {
			System.out.println("area: "+area);
			
		}
		}
	class square implements shapes{
		int side;
		double area;
			public void collectdata() {
				side=3;
				System.out.println("enter the side of square: ");
			}
			public void calculate() {
				area=side*side;
		}
			public void display() {
				System.out.println(" area: "+area);
			}
	}
	class rectangle implements shapes{
		int length;
		int breadth;
		double area;
		public void collectdata() {
			length=3;
			breadth=5;
			System.out.println("enter the length: ");
			System.out.println("enter the breadth: ");
		}
		public void calculate() {
			area=length*breadth;
		}
		public void display() {
			System.out.println("area: "+area);
		}
	}
	class assignment{
		public static void main(String[] args) {
			Circle c1=new Circle();
			c1.collectdata();
			c1.calculate();
			c1.display();
			
			rectangle r=new rectangle();
			r.collectdata();
			r.calculate();
			r.display();
			
			square t=new square();
			t.collectdata();
			t.calculate();
			t.display();
		
			}
		}