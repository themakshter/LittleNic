
import java.io.PrintStream;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTreeNodeStream;

/**
 * THIS CLASS SHOULD BE FILLED OUT TO IMPLEMENT YOUR CROSS-COMPILER. TO RUN YOUR
 * COMPILER USE THE Run class e.g. java Run <in file> <out file>...
 */
public class LittleNic {

	/**
	 * THERE MUST ALWAYS BE A CONSTRUCTOR THAT TAKES NO ARGUMENTS DEFINED FOR
	 * THIS CLASS.
	 */
	public LittleNic() {
	}

	/**
	 * THIS METHOD SHOULD BE FILLED OUT TO CALL YOUR PARSER AND IMPLEMENT YOUR
	 * CROSS-COMPILER. THE SOURCE MUST BE READ FROM THE CHARSTREAM, ANY JAVA
	 * GENERATED MUST BE PASSED TO THE DEST PRINTSTREAM WITH THE CLASS NAME
	 * GIVEN, AND ALL ERRORS MUST BE PASSED TO THE ERROR REPORTER.
	 * 
	 * @param source
	 *            stream to read LittleNic source from
	 * @param dest
	 *            stream to write any generated java to
	 * @param destClassName
	 *            class name to give the generated java class
	 * @param errReporter
	 *            object to report any errors to
	 */
	public void compile(CharStream source, PrintStream dest,
			String destClassName, ErrorReporter errReporter) {

		String codeOutput = "";
		try {
			// call lexer and parser...
			LittleNicLexer l = new LittleNicLexer(source);
			l.err = errReporter;
			CommonTokenStream tokens = new CommonTokenStream(l);
			LittleNicParser g = new LittleNicParser(tokens);
			g.err = errReporter;
			LittleNicParser.program_return program = g.program();
			CommonTreeNodeStream nodeStream = new CommonTreeNodeStream(
					program.tree);
			LittleNicWalker walker = new LittleNicWalker(nodeStream);
			walker.err = errReporter;
			codeOutput = walker.program();

			if (errReporter.numErrorsReported() > 0) {
				return;
			}

		} catch (RecognitionException ex) {
			// IMPORTANT: ALL parser/lexer errors must be reported as below!
			errReporter.reportSyntaxError(ex.line, ex.charPositionInLine,
					ex.toString());
			return;
		}

		dest.println("public class " + destClassName + " {\n" + codeOutput + "} ");
	}

}
