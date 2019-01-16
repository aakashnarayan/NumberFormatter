package package1;

public class FormatterMain 
{

	public static void main(String[] args) 
	{
		BaseTwoFormatter a = new BaseTwoFormatter();
		DefaultFormatter b = new DefaultFormatter();
		DecimalFormatter c = new DecimalFormatter();
		
		System.out.println(a.numberFormatter(276));
		System.out.println(b.numberFormatter(34596385));
		System.out.println(c.numberFormatter(785673014));
	}

}
