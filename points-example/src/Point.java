public class Point 
{
	double x;
	double y;
	private static int nbPoints=0;
	
	public double getX(){ return x;}
	public double getY(){ return y;}
	public void setX(double x){this.x=x;}
	public void setY(double y){this.y=y;}
	public static int getNbPoints() {return nbPoints;}
	public Point (double x, double y){
		nbPoints++;
		setX(x);
		setY(y);
	}
	public Point (double n){ this(n,n);}
	public Point (){this(0,0);}
	public Point (Point p){this(p.getX(),p.getY());}
	public void move (double dx, double dy)
	{
		setX(getX()+dx);
		setY(getY()+dy);
	}
	public void display (){
		System.out.println("<"+getX()+";"+getY()+">");
	}
	public double findDistanceFrom(Point b)
	{
		double d;
		d=Math.sqrt((x-b.x)*(x-b.x))+((y-b.y)*(y-b.y));
		return d;
	}
}