package epam.tddjunit;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RemoveAinFirst2CharsTest {
	/*
	 *  “ABCD” => “BCD”
 		“AACD” => “CD”
 		“BACD” => “BCD”
 		“BBAA” => “BBAA”
 		“AABAA” => “BAA”
 		""		=> ""
 		"A"     =>""
 		"AA"    =>""
 		"AB"    =>"B"
	 */
	RemoveAinFirst2Chars remove;
	@BeforeEach
	void setup()
	{
		remove=new RemoveAinFirst2Chars();	
	}
	@Test
	public void oneA0test()
	{
		assertEquals("BCD",remove.removeA("ABCD"));
	}
	@Test
	public void twoAtest()
	{
		assertEquals("CD",remove.removeA("AACD"));
	}
	@Test
	public void oneA1test()
	{
		assertEquals("BCD",remove.removeA("BACD"));
	}
	@Test
	public void noAtest()
	{
		assertEquals("BBAA",remove.removeA("BBAA"));
	}
	@Test
	public void test()
	{
		assertEquals("BAA",remove.removeA("AABAA"));
	}
	@Test
	public void nulltest()
	{
		assertEquals("",remove.removeA(""));
	}
	@Test
	public void singleAtest()
	{
		assertEquals("",remove.removeA("A"));
	}
	@Test
	public void doubleAtest()
	{
		assertEquals("",remove.removeA("AA"));
	}

}
