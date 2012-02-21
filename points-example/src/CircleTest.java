import org.junit.Test;
import junit.framework.*;
public class CircleTest extends TestCase {

	@Test
	public void testperimeter () 
	{
		double radius=3;
		double perimeter=18.84;
		double getperimeter=0;
		Point p=new Point ();
		p.x=3;
		p.y=4;
		Circle c=new Circle(p,radius);
		getperimeter=c.getPerimeter();
		assertEquals(getperimeter,perimeter );
	}
	@Test
	public void testdiameter () 
	{
		double radius=3;
		double diameter=6;
		double getdiameter=0;
		Point p=new Point ();
		p.x=3;
		p.y=4;
		Circle c=new Circle(p,radius);
		getdiameter=c.getDiameter();
		assertEquals(getdiameter,diameter);
	}
	@Test
	public void testsurface () 
	{
		double radius=3;
		Point p=new Point ();
		p.x=3;
		p.y=4;
		Circle c=new Circle(p,radius);
		double surface=28.26;
		double getsurface=0;
		getsurface=c.getSurface();
		assertEquals(getsurface,surface);
	}

}
