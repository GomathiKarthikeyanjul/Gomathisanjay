
public class Fib {
	public void fibo()
	{
		int a=0,b=0,c=1;
		for(int i=1;i<=10;i++)
		{
			a=b;
			b=c;
			c=a+b;
			
			System.out.println(a+"");
			
		}
	
	}
public static void main(String[] args) {
	Fib f=new Fib();
	f.fibo();
	
}
}
