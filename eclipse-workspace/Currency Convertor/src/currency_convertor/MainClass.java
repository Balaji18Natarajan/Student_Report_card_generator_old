package currency_convertor;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
	public static boolean validate( float usdQty, String dest ) {
		String[] destlist = new String[]{" EUR"," INR"," MYR"," SGD"," GBP"," CAD"};
		try
		{
			String usdstring=String.valueOf(usdQty);
			Float.parseFloat(usdstring);
			if (usdQty >= 0 && Arrays.asList(destlist).contains(dest)) 
				return true;
			else
				return false;
		}
		catch (NumberFormatException e) 
        { 
			return false;
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter USD and Destination");
        float usd = in.nextFloat();
        String dest = in.nextLine();
		boolean bool_status = validate(usd,dest);
		if (bool_status) {
			ConverterClass obj = new ConverterClass(usd,dest);
			obj.display();
		}	
		else
			System.out.println("Unable to convert the given input");
		in.close();
	}

}
