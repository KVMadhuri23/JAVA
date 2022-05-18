package arithematic;

interface add
{
	public double add_op(int a,int b);
}
interface sub
{
	public double sub_op(int a,int b);
}
interface div
{
	public double div_op(int a,int b);
}
interface mul
{
	public double mul_op(int a,int b);
}

public class Calculate implements add,sub,mul,div
{
	public double add_op(int a,int b)
	{
		return (a+b);
	}
	public double sub_op(int a,int b)
	{
		return (a-b);
	}
	public double div_op(int a,int b)
	{
		return (a/b);
	}
	public double mul_op(int a,int b)
	{
		return (a*b);
	}
}
