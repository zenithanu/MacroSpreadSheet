package spreadSheet;

/**
 * Inverse - Expression used in parsing, framework based on 
 * lecture material by Eric McCreath
 * 
 * @author Hayden Dummett u5563578
 * @author Hao Zhang u5319850
 * 
 */

public class Inverse extends Expression {
	
	Expression a;
	
	public Inverse(Expression a) {
		this.a = a;
	}
	
	@Override
	public String show() {
		return "(-" + a.show() + ")";
	}

	@Override
	public double evaluate() {
		return -(a.evaluate());
	}

	@Override
	public Expression includeSub(Expression term) {
		return new Subtraction(term, this);
	}

	@Override
	public Expression includeAdd(Expression term) {
		return new Addition(term, this);
	}

	@Override
	public Expression includeMult(Expression term) {
		return new Multiplication(term, this);
	}

	@Override
	public Expression includeDiv(Expression term) {
		return new Division(term, this);
	}

	@Override
	public Expression includePow(Expression term) {
		return new Power(term, this);
	}
	
}
