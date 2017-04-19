package EasterAssignment;

import java.util.Date;

public class Work extends Activities {

	public Work(Date startTime, Date endTime) {
		super(startTime, endTime);
		// TODO Auto-generated constructor stub
	}

	@Override// The overriding method has the same name,no + type of parameters, + return type as the method that it overrides.
	public String evaluateTimeSpent() {
		// TODO Auto-generated method stub
		return "Work";
	}
	
	

}
