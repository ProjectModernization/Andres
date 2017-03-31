import java.text.SimpleDateFormat;
import java.util.*;

public class Accept {
	public static void main(String[] args) {

		String StudentDetails;
		int StudentId;
		String Surname;
		String Initials;
		int CourseCode;
		String Gender;
		
		Calendar cal = new GregorianCalendar();
		int CurrentYear = cal.get(Calendar.YEAR);
		int CurrentMonth = cal.get(Calendar.MONTH) + 1;
		int CurrentDay = cal.get(Calendar.DAY_OF_MONTH);
		int YearDay = cal.get(Calendar.DAY_OF_YEAR);
		int CurrentHour = cal.get(Calendar.HOUR_OF_DAY);
		int CurrentMinute = cal.get(Calendar.MINUTE);
		
		Scanner UserInput = new Scanner(System.in);

		System.out.println("Enter student details using template below");
		System.out.println("Enter - ID,Surname,Initials,CourseCode,Gender");
		System.out.println("SSSSSSSNNNNNNNNIICCCCG");

		StudentDetails = UserInput.nextLine();
		StudentId = Integer.parseInt(StudentDetails.substring(0, 7));
		Surname = StudentDetails.substring(7, 15);
		Initials = StudentDetails.substring(15, 17);
		CourseCode = Integer.parseInt(StudentDetails.substring(17, 21));
		Gender = StudentDetails.substring(21, 22);

		System.out.println("Name is " + Initials + " " + Surname);
		System.out.println("Date is " + CurrentDay + " " + String.format("%02d", CurrentMonth) + " " + CurrentYear);
		System.out.println("Today is day " + String.format("%03d", YearDay) + " of the year");
		System.out.println("The time is " + CurrentHour + ":" + CurrentMinute);

	}

}
