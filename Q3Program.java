class Base1
{
	int num1=10;
	public void disp1()
	{
		System.out.println(num1);
	}
	Base1()
	{
		
	}
	Base1(int num1)
	{
		this.num1=num1;
	}
}
class Child1 extends Base1
{
	int num2=5;
	public void disp2()
	{
		System.out.println(num2);
	}
	Child1()
	{
		
	}
	Child1(int num2)
	{
		super(20);
		this.num2=num2;
	}
}
class Child2 extends Base1
{
	int num3=30;
	public void disp3()
	{
		System.out.println(num3);
	}
      Child2()
	{
		
	}
      Child2(int num3)
      {
    	  super(45);
    	  this.num3=num3;
      }
}
public class Q3program {

	public static void main(String[] args) {
		Child1 obj1=new Child1();
		Child2 obj2=new Child2(60);
		obj1.disp1();
		obj1.disp2();
		obj2.disp1();
		obj2.disp3();

	}

}
