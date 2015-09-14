package com.ganchurin.format;

import com.ganchurin.model.ArraySource;
import com.ganchurin.model.DataSource;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FormatterTest {

	private static final String LineSeparator = System.lineSeparator();

	@Test
	public void format() {
		String[][] array = new String[][]{{"ab", "c"}, {"d", "ef"}};
		DataSource src = new ArraySource(array);
		Formatter f = new Formatter();
		String s = f.format(src);
		String exp = "" +
				"+--+--+" + LineSeparator +
				"|ab|c |" + LineSeparator +
				"+--+--+" + LineSeparator +
				"|d |ef|" + LineSeparator +
				"+--+--+" + LineSeparator;
		assertTrue(s.equals(exp));
	}
}
