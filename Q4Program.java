class Top1
{
	void disp1()
	{
		System.out.println("in top1 class");
	}
}
class Bottom1 extends Top1
{
	void disp1()
	{
		System.out.println("in bottom1 class");
	}
}
class Bottom2 extends Top1
{
	void disp1()
	{
		System.out.println("in bottom 2 class");
	}
}
class Bottom3 extends Top1
{
	void disp1()
	{
		System.out.println("in bottom3 class");
	}
}
public class Q4program {
   static public void perform(Top1 ref)
   {
	   ref.disp1();
   }
	public static void main(String[] args) {
		Q4program.perform(new Bottom1());
		Q4program.perform(new Bottom2());
		Q4program.perform(new Bottom3());

	}

}
