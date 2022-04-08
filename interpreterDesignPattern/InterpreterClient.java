package interpreterDesignPattern;
public class InterpreterClient {
	
	public InterpreterContext ic;
	
	public InterpreterClient(InterpreterContext  i) {
		this.ic=i;
	}
	
	public String interpret(String str) {
		Expression exp=null;
		if(str.contains("Hexadecimal")) {
			exp=new IntToHexExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
		}else if(str.contains("Binary")) {
			exp=new IntToBinaryExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
		}else
			return str;
		return exp.interpret(ic);
	}
	
	public static void main(String args[]) {
		String str1="48 in Binary";
		String str2="48 in Hexadecimal";
		
		InterpreterClient ec=new InterpreterClient(new InterpreterContext());
		
		System.out.println(str1 + "= "+ec.interpret(str1));
		System.out.println(str2 + "= "+ec.interpret(str2));
	}
	
}
