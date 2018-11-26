package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Nikolay Zhuykov (kishinx@rambler.ru)
 * @since 26.11.2018
 * @version 1
 */
public class CalculateTest {

	/**
	 * Test echo.
	 */
	@Test
	public void whenTakeNameThenTreeEchoPlusName() {
		String input = "Nikolay";
		String expect = "Echo, echo, echo : Nikolay"; 
		Calculate calc = new Calculate();
		String result = calc.echo(input);
		assertThat(result, is(expect));
	}
 
}