class R 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int i=10;
		do
		{
			i++;
			System.out.println("body:"+i);
			if(i==20)
			{
				break;
			}
		}
		while (i>10);
		System.out.println("main end");
	}
}
