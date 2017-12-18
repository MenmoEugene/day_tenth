class FuShuException extends RuntimeException
{
	FuShuException(String msg)
	{
		super(msg);
	}
}

class Demo
{
	int div(int a,int b)
	{
		if(b<0)
			throw new FuShuException("出现除数为负数了");
		if(b==0)
			throw new ArithmeticException("被除零了");
		return a/b;
	}
}

class ExceptionRuntime
{
	public static void main(String[] args)
	{
		Demo d = new Demo();
		
		int x = d.div(4,-1);
		System.out.println("x="+x);
		System.out.println("over");
	}
}