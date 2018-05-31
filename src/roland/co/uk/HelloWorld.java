package roland.co.uk;
public class HelloWorld
{
	public static void main(String[] args)
	{
		int a = 2;
		int b = 4;
		Calculator calc =  new Calculator();

		System.out.println("Hello World!");
		System.out.println("2+2="+calc.sum(2,2));
	}
}
