import junit.framework.TestCase;

import org.junit.Test;
public class TriangleTest extends TestCase
{
	@Test
	public void testsurface() 
	{
		Point p=new Point(9,4);
		Point p1=new Point(5,6);
		Point p2=new Point(8,3);
		Triangle t=new Triangle(p,p1,p2);
		t.d=22.0;
		double getsurface=0;
		double surface=61600;
		getsurface=t.getSurface();
		assertEquals(getsurface,surface);
	}
	@Test
	public void testperimeter() 
	{
		Point p=new Point(9,4);
		Point p1=new Point(5,6);
		Point p2=new Point(8,3);
		Triangle t=new Triangle(p,p1,p2);
		t.d=t.getPerimeter();
		double perimeter=22.0;
		assertEquals(t.d,perimeter);
	}
	@Test
	public void testisIsoceles() 
	{
		Point p=new Point(9,4);
		Point p1=new Point(5,6);
		Point p2=new Point(8,3);
		Triangle t=new Triangle(p,p1,p2);
		boolean i=t.isIsoceles();
		assertEquals(i,false);
	}

}
