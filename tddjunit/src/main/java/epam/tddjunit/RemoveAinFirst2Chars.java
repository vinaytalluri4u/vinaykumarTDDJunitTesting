package epam.tddjunit;

public class RemoveAinFirst2Chars
{
	public  String removeA(String string)
	{
		String result=string;
		int stringlength=string.length();
		if(stringlength>0)
		{
			if(stringlength==1 && string.charAt(0)=='A')
			{
				result="";
			}
			else if(string.charAt(0)=='A' && string.charAt(1)=='A')
			{
					result=string.substring(2,stringlength);
			}
			else if(string.charAt(0)=='A')
			{
				result=string.substring(1,stringlength);
			}
			else if(string.charAt(1)=='A')
			{
				result=string.charAt(0)+string.substring(2,stringlength);
			}
		}
		return result;
	}

}
