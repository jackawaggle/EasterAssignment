package EasterAssignment;

public class Main {

	public static void main(String[] args) {
		
		Study frame = new Study("Study");
		frame.setVisible(true);
	//makes the college screen pop up
		College frame1 = new College();
		frame1.setVisible(true);
	// makes the commuting screen pop up	
		Commuting1 frame2 = new Commuting1();
		frame2.setVisible(true);
		// makes the work screen pop up
		Work frame4 = new Work();
		frame4.setVisible(true);

	}

}
//responsible for running all the windows/frames/classes that were created