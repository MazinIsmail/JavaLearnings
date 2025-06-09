package com.textBlocks.learnings;

/**
 * Since Java 15, text blocks are available as a standard feature. With Java 13
 * and 14, we needed to enable it as a preview feature.
 * 
 * Text blocks start with a “”” (three double-quote marks) followed by optional
 * whitespaces and a newline.
 * 
 * Text blocks just provide us with another way to write String literals in our
 * source code.
 * 
 * We can still indent our code properly
 */
public class TextBlocksLearnings {
	public static void main(String[] args) {

		String test = """
				<html>
				    <body>
				        <span>example text</span>
				    </body>
				</html>
				""";
		System.out.println(test);

		// Inside text blocks, double-quotes don’t have to be escaped.
		String test2 = """
				"fun" with
				whitespace
				and other escapes \"""
				""";
		System.out.println(test2);

		// newlines don’t have to be escaped inside text blocks.
		String test3 = """
				separated with\r
				carriage returns""";
		System.out.println(test3);

		// We can escape a newline so that it is ignored
		String test4 = """
				This is a long test which looks to \
				have a newline but actually does not""";
		System.out.println(test4);

		// The compiler ignores all trailing spaces in text blocks. However, since Java
		// 14 preview, we can escape a space using the new escape sequence \s.
		// This is useful when we want to preserve trailing spaces in our text blocks.
		String test5 = """
				line 1·······
				line 2·······\s
				""";
		System.out.println(test5);

	}

}
