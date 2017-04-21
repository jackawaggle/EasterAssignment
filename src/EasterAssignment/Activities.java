package EasterAssignment;

//Extends class (Inheritance)
public class Activities extends AbstractActivities implements ActivityInterface  {
   //subclass of abst.act.      superclass of activities            interface
	//Attributes private
	private int startTime;
	private int endTime;
	
	//Constructor activities
	public Activities(int startTime,int endTime)
	{
		this.startTime=startTime;
		this.endTime=endTime;		
	}
	
	
	//Polymorphism
	@Override	
	public String evaluateTimeSpent() {
		return null;
	}

	//Encapsulation getter and setter methods	
	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int getEndTime() {
		return endTime;
	}

	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}

	@Override//polymorphism this methods was declared in activity interface but i am using it here
	public long timeSpent() {
		// TODO Auto-generated method stub
		return endTime-startTime;
	}

}
//activity class has inheritance from abstract activity class and implementation from the interface
//it sets the private start and end time variales values from all other classes and i am using encapsulation also.