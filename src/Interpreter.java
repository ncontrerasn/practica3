import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Interpreter {

	public static void main(String [] args) throws Exception{
		MiLenguajeLexer lexer = new MiLenguajeLexer(CharStreams.fromFileName("input.txt"));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		MiLenguajeParser parser = new MiLenguajeParser(tokens);
		ParseTree tree = parser.prog();

		MyVisitor<Object> loader = new MyVisitor<Object>();
		loader.visit(tree);
	}
}
