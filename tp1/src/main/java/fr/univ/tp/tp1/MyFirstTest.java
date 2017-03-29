package fr.univ.tp.tp1;

import org.junit.*;
import java.util.logging.Logger;

public class MyFirstTest 
{
	private static Logger Log = Logger.getLogger(MyFirstTest.class.getSimpleName());
	
	@BeforeClass
	public static void firstInit() 
	{
		Log.info("Première méthode appelée.");
	}
	
	@AfterClass
	public static void lastDestroy()
	{
		Log.info("Dernière méthode appelée.");
	}
	
	@Before
	public void beforeTest()
	{
		Log.info("Méthode appelée avant chaque test.");
	}
	
	@After
	public void afterTest()
	{
		Log.info("Méthode appelée après chaque test.");
	}
	
	@Test
	public void premierTest()
	{
		Log.info("Premier test.");
		Assert.assertTrue(true);
	}
	
	@Test
	public void secondTest()
	{
		Log.info("Deuxième test.");
		Assert.assertFalse(false);
	}
	
	@Ignore
	@Test
	public void testIgnore()
	{
		Log.info("Test ignoré.");
	}
}
