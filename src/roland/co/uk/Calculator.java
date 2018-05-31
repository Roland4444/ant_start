package roland.co.uk;
import roland.co.uk.operation.Adder;

public class  Calculator{

	public int sum(int a, int b){
		Adder adder = new Adder(a);
		adder.add(b);
		return adder.sum;
	}
}
