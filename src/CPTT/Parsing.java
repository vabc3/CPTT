package CPTT;

enum StmtType {
	EXPR, IF, FOR, OTHER
}

class Lex {
	public StmtType type() {
		return StmtType.EXPR;
	}

	public void Match(String expr) {

	}
}

public class Parsing {

	private Lex lookahead;

	public Parsing(Lex lookahead) {
		this.lookahead = lookahead;
	}

	private void stmt() {		
		switch (lookahead.type()) {
		case EXPR:
			lookahead.Match("");
			lookahead.Match(";");
			break;
		case IF:
			lookahead.Match("if");
		default:
			break;
		}

	}

	public static void main(String[] args) {
		Parsing ps = new Parsing(new Lex());
		ps.stmt();
		System.out.println("hi");
	}
}
