
public class Triangle implements Shape
{
	private String tostring; 
	double d;
	Point v1,v2,v3;
	public Triangle (Point v1,Point v2,Point v3)
	{
		this.v1=v1;
		this.v2=v2;
		this.v3=v3;
	}
	@Override
	public double getSurface() {
		// TODO Auto-generated method stub
		double a,b,c;
		a=v1.findDistanceFrom(v2);
		b=v2.findDistanceFrom(v3);
		c=v3.findDistanceFrom(v1);
		double surface=d*(d-a)*(d-b)*(d-c);
		return surface;
		
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		double a,b,c;
		a=v1.findDistanceFrom(v2);
		b=v2.findDistanceFrom(v3);
		c=v3.findDistanceFrom(v1);
		//System.out.print(a+"  "+b+"  "+c);
		double perimeter=a+b+c;
		d=perimeter;
		//System.out.print("   "+d);
		return perimeter;
	}
	public Boolean isIsoceles()
	{
		double a,b,c;
		a=v1.findDistanceFrom(v2);
		b=v2.findDistanceFrom(v3);
		c=v3.findDistanceFrom(v1);
		if (a==b ||b==c || c==a)
		{
			return true;
		}
		else 
			return false;
	}
	public String tostring()
	{
		tostring="v1:("+v1.x+","+v1.y+") v2:("+v2.x+","+v2.y+") v3:("+v3.x+","+v3.y+")";
		return tostring;
	}
}
