interface Calculator1{
	int a=10;//constant rule10
	void add();//Abstract method rule9
	void sub();//Abstract method rule9
}
//interface Calculator2 implements Calculator1{
//	//error ruleno7
//}
interface Calculator3 extends Calculator1{
	//int a=10;//can be accessed here also
	//void add();//available from calculator
	//void sub();//available from calculator
	void mull();//ruleno8
	void div();
}
interface Calculator4{
	void add1();
	void add2();
}
class SampleCode1 implements Calculator1{
	@Override
	public void add() {
		System.out.println("Inside add method of Sample Code1");
		}
	@Override
	public void sub() {
		System.out.println("Inside sub method of Sample Code 1");
	}
}
class SampleCode2 implements Calculator1{
	//ruleno1
	@Override
	public void add(){
		System.out.println("Inside add method of SampleCode2");
	}
	@Override
	public void sub() {
		System.out.println("Inside sb method of Sample code2");
	}
}
class SampleCode3 implements Calculator1,Calculator3{
	//ruleno6
	@Override
	public void add() {
	System.out.println("Inside add method of Sample Code3");
}
@Override
public void sub() {
System.out.println("Inside sub method of Sample Code 3");
}
@Override
public void mull() {
	System.out.println("Inside mull method of Samole Code3");
}
@Override
public void div() {
	System.out.println("Inside div method of Sample Code3");
}
}
interface Calculator5{
	//ruleno11:tagged interface
}
class SampleCode4{
	void display() {
		System.out.println("Inide Display method ");
	}
}
class SampleCode5 extends SampleCode4 implements Calculator1{
	//ruleno 12
	@Override
	public void add() {
		System.out.println("Inside add method of SampleCode5 ");
	}
	@Override
	public void sub() {
		System.out.println("Inside sub method of Sample Code5");
	}
}
interface Calculator6{
	void addition();
	void subtraction();
	//ruleno14
	default void multiplication() {
		System.out.println("Inside multiplication method of Calculator6");
	}
	static void division() {
		System.out.println("Inside division method of Calculator6");
	}
}
class rule{
	public static void main(String[] args) {
		//Calculator1 c1=new Calculator1();//error ruleno14
		Calculator1 c2;//Accepted as reference can be created
		//ruleno5
		Calculator1 c3= new Calculator1() {
		//ruleno13
		@Override
		public void add() {
			System.out.println("Inside add method od Calculator 1");
		}
		@Override
		public void sub() {
			System.out.println("Inside sub method of Calculator1");
		}
	};
	c3.add();
	c3.sub();
}
}