package package1;

public class BaseTwoFormatter 
{
	public String numberFormatter(int num)
	{
		String format = "";
		while (num > 0)
		{
			format = num % 2 + format;
			num /= 2;
		}
		return format;
	}
}