class FuShuException extends Exception
{
	private int value;
	FuShuException()
	{
		super();
	}
	FuShuException(String msg,int value)
	{
		super(msg);
		this.value = value;
	}
	public int getValue()
	{
		return value;
	}
}

class Demo
{
	int div(int a,int b)throws FuShuException
	{
		if(b<0)
			throw new FuShuException("出现了除数是负数的情况----/ by fs",b);
		return a/b;
	}
}

class defineException
{
	public static void main(String[] args)
	{
		Demo d = new Demo();
		try
		{
			int x = d.div(4,-1);
			System.out.println("x="+x);
		}catch(FuShuException e)
		{
			System.out.println(e.toString());
			//System.out.println("除数出现负数了");
			System.out.println("错误的除数是:"+e.getValue());
		}
		System.out.println("over");
	}
}