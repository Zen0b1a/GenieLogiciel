package fr.univ.tp.tp1;

import java.util.logging.Logger;
import org.junit.*;

public class StringUtilsTest {
	private static Logger Log = Logger.getLogger(MyFirstTest.class.getSimpleName());
	
	@Test
	public void premierTest()
	{
		Log.info("Premier test.");
		String test = StringUtils.reverseString("coucou");
		Assert.assertEquals("uocuoc", test);
	}
	
	@Test
	public void secondTest()
	{
		Log.info("Cas vide.");
		String test = StringUtils.reverseString("");
		Assert.assertEquals("", test);
	}
	
	@Test
	public void troisiemeTest()
	{
		Log.info("Cas null.");
		String test = StringUtils.reverseString(null);
		Assert.assertEquals(null, test);
	}
}
