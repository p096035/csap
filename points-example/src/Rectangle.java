
public class Rectangle implements Shape
{
	private double edgeX;
	private double edgeY;
	private Point V;
	String tostring;

	/**
	 * @param args
	 */
	public Rectangle(Point V,double edgeX, double edgeY)
	{
		this.V=V;
		this.edgeX=edgeX;
		this.edgeY=edgeY;
	}
	@Override
	public double getSurface() 
	{
		// TODO Auto-generated method stub
		double a,b;
		a=edgeX;
		b=edgeY;
		double surface;
		surface=a*b;
		return surface;
	}
	@Override
	public double getPerimeter() 
	{
		// TODO Auto-generated method stub
		double a,b;
		a=edgeX;
		b=edgeY;
		double perimeter;
		perimeter=2*(a+b);
		return perimeter;
	}
	public String tostring()
	{
		tostring="edgeX:"+edgeX+"edgeY:"+edgeY+"vertice:"+V.x+V.y;
		
		return tostring;
	}
}
