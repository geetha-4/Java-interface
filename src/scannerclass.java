import java.util.Scanner;
interface Shapes{
	void collectdata();
	void calculate();
	void display();
}
	class circl implements Shapes{
		double radius ;
		double pi=3.18976;
		double area;
		public void collectdata() {
			Scanner sc=new Scanner(System.in);
			radius=sc.nextDouble();
			System.out.println("enter the radius: ");
}
		public void calculate() {
			area=pi*radius*radius;
		}
		public void display() {
			System.out.println("area: "+area);
			
		}
		}
	class Square implements Shapes{
		double side;
		double area;
			public void collectdata() {
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the side of square: ");
				System.out.println("enter the area of square: ");
				side=sc.nextDouble();
				area=sc.nextDouble();
			}
			public void calculate() {
				area=side*side;
		}
			public void display() {
				System.out.println(" area: "+area);
			}
	}
	class Rectangle implements Shapes{
		double length;
		double breath;
		double area;
		public void collectdata() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the length: ");
			System.out.println("enter the breath: ");
			System.out.println("enter the area: ");
			length=sc.nextDouble();
			breath=sc.nextDouble();
			area=sc.nextDouble();
		}
		public void calculate() {
			area=length*breath;
		}
		public void display() {
			System.out.println("area: "+area);
		}
	}
	class scannerclass{
		public static void main(String[] args) {
			circl c1=new circl();
			c1.collectdata();
			c1.calculate();
			c1.display();
			
			Rectangle r=new Rectangle();
			r.collectdata();
			r.calculate();
			r.display();
			
			Square t=new Square();
			t.collectdata();
			t.calculate();
			t.display();
		
			}
}