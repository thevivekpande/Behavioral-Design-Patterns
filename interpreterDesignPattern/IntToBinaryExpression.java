package interpreterDesignPattern;
public class IntToBinaryExpression implements Expression{
	private int i;
	
	public IntToBinaryExpression(int c) {
		this.i=c;
	}
	
	@Override
	public String interpret(InterpreterContext ic) {
		// TODO Auto-generated method stub
		return ic.getBinaryFormat(i);
	}

}
