package interpreterDesignPattern;
public class IntToHexExpression implements Expression{
	private int i;
	
	public IntToHexExpression(int i) {
		this.i=i;
	}

	@Override
	public String interpret(InterpreterContext ic) {
		// TODO Auto-generated method stub
		return ic.getHexadecimalFormat(i);
	}

}
