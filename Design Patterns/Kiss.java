import java.util.Scanner;
class Weekday
{
	
private static Scanner s;	
public static void main(String[] args)throws Exception
{
	s=new Scanner(System.in);
	int day=s.nextInt();
		switch (day) {
	
        case 1:
            System.out.println( "Monday");
        case 2:
        	System.out.println("Tuesday");
        case 3:
        	System.out.println("Wednesday");
        case 4:
        	System.out.println("Thursday");
        case 5:
        	System.out.println("Friday");
        case 6:
        	System.out.println("Saturday");
        case 7:
        	System.out.println("Sunday");
        default:
            System.out.println("day must be in range 1 to 7");
    }

}
}


Another method:
import java.util.Scanner;
class Weekday2
{
	private static Scanner s;
	private static String[] days;
	public static void main(String[] args)throws Exception
	{
		s=new Scanner(System.in);
		int day=s.nextInt();
		if((day<1) || (day>7))
		{
			System.out.println("day must be in range 1 to 7");
		}
		setDays(new String[] {"mon","tus","wed","thur","fri","sat","sun"});
	}
	public static String[] getDays() {
		return days;
	}
	public static void setDays(String[] days) {
		Weekday2.days = days;
	}
}
