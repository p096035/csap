
public class mainclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Point p=new Point(9,4);
		Point p1=new Point(5,6);
		Point p2=new Point(8,3);
		Triangle t=new Triangle(p,p1,p2);
		System.out.println("surface and perimeter of triangle is:"+t.getSurface()+"  "+t.getPerimeter()+"  "+t.isIsoceles());
		Rectangle r=new Rectangle(p,5,6.99);
		System.out.println("Description about rectangle:"+r.tostring());
		System.out.println("surface and perimeter of rectangle is:"+r.getSurface()+"  "+r.getPerimeter());
		Circle c=new Circle(p,3);
		System.out.println("Description about circle:"+c.tostring());
		System.out.println("diameter, surface and perimeter of circle is:"+c.getDiameter()+"  "+c.getSurface()+"  "+c.getPerimeter());
	}

}

