import org.junit.Test;
import junit.framework.*;
public class RectangleTest extends TestCase
{
	@Test
	public void testsurface() 
	{
		Point V=new Point ();
		V.x=9;
		V.y=4;
		double surface=34.95;
		double getsurface=0;
		Rectangle r=new Rectangle(V,5,6.99);
		getsurface=r.getSurface();
		assertEquals(getsurface,surface);
	}
	@Test
	public void testperimeter() 
	{
		Point V=new Point ();
		V.x=9;
		V.y=4;
		Rectangle r=new Rectangle(V,5,6.99);
		double perimeter=23.98;
		double getperimeter=0;
		getperimeter=r.getPerimeter();
		assertEquals(getperimeter,perimeter);
	}
}
