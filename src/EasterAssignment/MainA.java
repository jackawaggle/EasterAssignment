package EasterAssignment;

import java.util.Date;

public class MainA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date startDate = new Date (2017, 4, 19, 10, 0, 0);
		Date endDate = new Date(2017,4,19,11,0,0);
		
		Activities[] activities = {
				new Study (startDate, endDate),
				new Work(startDate, endDate)
		};
		
		// Study study = new Study (startDate, endDate);
		// Work work = new Work(startDate, endDate);
		
		for(int i = 0; i < activities.length; i++)
		{
			System.out.println(activities[i].timeSpent());
			System.out.println(activities[i].evaluateTimeSpent());
		}
	}

}
 