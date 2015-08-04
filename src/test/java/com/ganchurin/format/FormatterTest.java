package com.ganchurin.format;

import com.ganchurin.model.ArraySource;
import com.ganchurin.model.DataSource;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FormatterTest {

	@Test
	public void format() {
		String[][] array = new String[][]{{"ab", "c"}, {"d", "ef"}};
		DataSource src = new ArraySource(array);
		Formatter f = new Formatter();
		String s = f.format(src);
		String exp = "" +
				"+--+--+\n" +
				"|ab|c |\n" +
				"+--+--+\n" +
				"|d |ef|\n" +
				"+--+--+\n";
		assertTrue(s.equals(exp));
	}
}
