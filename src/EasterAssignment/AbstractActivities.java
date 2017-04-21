package EasterAssignment;

//This class has been implemented from interface called ActivitiesInterface
public abstract class AbstractActivities implements ActivityInterface{
	
	//Abstract method
	public abstract String evaluateTimeSpent();
}

//this is the abstract activity class used for polymorphism contains
//one or more methods declared but no object created (instantiated)