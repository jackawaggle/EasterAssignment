package EasterAssignment;

import java.util.Date;

public class Study extends Activities{

	public Study(Date startTime, Date endTime) {
		super(startTime, endTime);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String evaluateTimeSpent() {
		// TODO Auto-generated method stub
		return "Study";
	}

	public int pagesRead()
	{
		return 10;
	}

}
