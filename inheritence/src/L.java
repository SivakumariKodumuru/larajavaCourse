class K extends Object
{
	K()
	{
		super();
         System.out.println("K()");
	}
}
class L extends K
{
	L()
	{
		//super();--->internally calling super() 
		System.out.println("L()");
	}
	public static void main(String[] args) 
	{
		L obj = new L();
		System.out.println("HI");
	}
}
