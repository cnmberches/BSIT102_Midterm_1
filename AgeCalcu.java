import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class AgeCalcu
{
	public static void main(String [] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int mYear, mMonth,mDay, myDate, myYear, myMonth;
		String ageMonth, ageYear, ageDate;
		
		SimpleDateFormat df =new SimpleDateFormat("dd-M-YYYY");
		
		Calendar c = Calendar.getInstance();
		
        mYear = c.get(Calendar.YEAR);
        mMonth = c.get(Calendar.MONTH);
        mDay = c.get(Calendar.DAY_OF_MONTH);
        
        System.out.print("Date: ");
        myDate = sc.nextInt();
        
        System.out.print("Month: ");
        myMonth = sc.nextInt();
        
        System.out.print("Year: ");
        myYear = sc.nextInt();
        
        ageMonth = String.valueOf(Math.abs(myMonth - mMonth));
        ageYear = String.valueOf(Math.abs(myYear - mYear));
        ageDate = String.valueOf(Math.abs(myDate - mDay));
        
        System.out.print("You are " + ageMonth + " months, " + ageDate + " days, and " + ageYear + " years old.");
	}
}