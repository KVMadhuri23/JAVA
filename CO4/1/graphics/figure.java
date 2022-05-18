package graphics;

interface rect
{
	public double rectarea(int l,int b);
}
interface squ
{
	public double squarea(int s);
}
interface circle
{
	public double cirarea(int r);
}
interface tri
{
	public double triarea(int b,int h);
}

public class figure implements rect,squ,circle,tri
{
	public double rectarea(int l,int b)
	{
		return (l*b);
	}
	public double squarea(int s)
	{
		return (s*s);
	}
	public double cirarea(int r)
	{
		return (3.14*r*r);
	}
	public double triarea(int b,int h)
	{
		return (0.5*b*h);
	}
}
