package OOCAssignment;
import java.util.Scanner;
public class TimeTable
{
	public void time(int day)
	{
		String subject;
        switch (day) 
        {
            case 1:
                subject = "Mathematics";
                break;
            case 2:
                subject = "Science";
                break;
            case 3:
                subject = "History";
                break;
            case 4:
                subject = "English";
                break;
            case 5:
                subject = "Physical Education";
                break;
            case 6:
                subject = "Art";
                break;
            case 7:
                subject = "Music";
                break;
            default:
                System.out.println("Invalid input.");
                return;
        }

        System.out.println("Your class for today is: " + subject);
	}
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
        System.out.println("Enter the day of the week (1-7): ");
        int day = in.nextInt();
        TimeTable t = new TimeTable();
        t.time(day);
        in.close();
	}
}

