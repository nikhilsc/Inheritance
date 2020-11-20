class Base
{
	int num1=10;
	public void disp1()
	{
		System.out.println("in display 1 funtion"+ num1);
	}
	public Base(int num1)
	{
		this.num1=num1;
	}
}
class Sub1 extends Base
{
	int num2=20;
	public void disp2()
	{
		System.out.println("in display 2 funtion"+ num2);
	}
	public Sub1()
	{
		super(5);
	}
	public Sub1(int num2)
	{
		super(45);
		this.num2=num2;
	}
}
class Sub2 extends Sub1
{
	int num3=30;
	public void disp3()
	{
		System.out.println("in display 3 funtion"+ num3);
	}
	public Sub2()
	{
		super(50);
	}
}
public class Q1program {

	public static void main(String[] args) {
		Sub2 s=new Sub2();
		s.disp1();
		s.disp2();
		s.disp3();

	}

}
