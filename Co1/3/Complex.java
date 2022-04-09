class Complex
{
	int real,image;
	public Complex(int r,int i)
	{
		this.real=r;
		this.image=i;
	}
	void show()
	{
		System.out.println(this.real+"+"+this.image+"i");
	}
	public static Complex C_add(Complex n1,Complex n2)
	{
		Complex res= new Complex(0,0);
		res.real=n1.real+n2.real;
		res.image=n1.image+n2.image;
		return res;
	}
	public static void main(String args[])
	{
		Complex c1=new Complex(4,5);
		Complex c2=new Complex(10,4);
		System.out.println("First complex Number is");
		c1.show();
		System.out.println("Second complex Number is");
		c2.show();
		Complex res=C_add(c1,c2);
		System.out.println("After addition");
		res.show();
	}
}
