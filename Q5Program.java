abstract class shape
{
	abstract void draw();
}
class Triangle extends shape
{
	void draw()
	{
		System.out.println("triangle shape draw");
	}
}
class Polygon extends shape
{
	void draw()
	{
		System.out.println("polygon shape draw");
	}
}
class Circle extends shape
{
	void draw()
	{
		System.out.println("circle shape draw");
	}
}
public class Q5program {

	public static void main(String[] args) {
		shape arr[]=new shape[3];
         arr[0]=new Triangle();
         arr[1]=new Polygon();
         arr[2]=new Circle();
         arr[0].draw();
         arr[1].draw();
         arr[2].draw();
	}

}
