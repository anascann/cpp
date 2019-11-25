import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class WeekDays {
	public static void main (String[] args) throws java.lang.Exception
	{
			DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	ArrayList<String> WeekDates = new ArrayList<String>(8);
	LocalDateTime now = LocalDateTime.now();
	for(int i=1;i<=7;i++) {
		LocalDateTime date =now.minusDays(i);
		WeekDates.add(date.format(format));
	}
		System.out.println(WeekDates);	
	}
}
