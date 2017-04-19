package EasterAssignment;

import java.util.Date;

public abstract class Activities {
//fields
	private Date startTime;
	private Date endTime;
//constructor	
	public Activities(Date startTime,Date endTime) 
	{
		this.startTime = startTime;
		this.endTime = endTime;
	}
	//method
	public long timeSpent()
	{
		return endTime.getTime() - startTime.getTime();
	}
	
	// Guarantees every class that extends Activities will have it's own implementation of evaluateTimeSpent()
	public abstract String evaluateTimeSpent();
	
}
