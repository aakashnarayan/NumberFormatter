package package1;

public class DefaultFormatter 
{
	public String numberFormatter(int num)
	{
		String number = "" + num;
		String format = "";
		int numFirstDigits = number.length() % 3;
		
		format = number.substring(0, numFirstDigits);
		for (int i = numFirstDigits; i < number.length(); i += 3)
		{
			format += "," + number.substring(i, i + 3);
		}
		
		if (numFirstDigits == 0)
		{
			format = format.substring(1);
		}
		
		return format;
	}
}