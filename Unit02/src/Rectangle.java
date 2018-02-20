//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Rectangle
{
	private int length;
	private int width;
	private int perimeter;

	public void setLengthWidth(int length, int wid )
	{
		this.length=length;
		width=wid;
	}

	public void calculatePerimeter( )
	{
		perimeter = length*2 + width*2;
		
	}

	public void print( )
	{
		System.out.println("the perimeteris::"+perimeter);
	}
}