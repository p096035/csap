
public class Circle implements Shape
{
	private Point center;
	private double radius;
	private String tostring;
	public Circle(Point center,double radius)
	{
		this.center=center;
		this.radius=radius;
	}
	@Override
	public double getSurface() {
		double surface=0;
		surface=3.14*(radius*radius);
		return surface;
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getPerimeter() {
		double perimeter=2*3.14*radius;
		return perimeter;
		// TODO Auto-generated method stub
		
	}
	public double getDiameter()
	{
		double diameter=2*radius;
		return diameter;
		
	}
	public String tostring()
	{
		tostring="center:("+center.x+","+center.y+") radius:"+radius;
		return tostring;
	}
}
