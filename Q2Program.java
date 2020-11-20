class Vehicle
{
	public void start()
	{
		System.out.println("in base class start");
	}
}
class Fourwheeler extends Vehicle
{
	public void start()
	{
		System.out.println("in child class start");
	}
}
public class Q2program {

	public static void main(String[] args) {
		Vehicle obj=new Fourwheeler();//upcasting
		obj.start();//late binding

	}

}
