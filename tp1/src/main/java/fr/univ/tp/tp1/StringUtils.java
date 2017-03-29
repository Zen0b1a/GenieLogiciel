package fr.univ.tp.tp1;

public class StringUtils {
	public static String reverseString(String s)
	{
		String res = "";
		for(int i=0; i<s.length(); i++)
		{
			res = s.charAt(i) + res;
		}
		return res;
	}
}
