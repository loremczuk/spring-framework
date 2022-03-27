package pl.oremczuk.springtutorial;

public class UsersRepository {

	private static int instanceNumber = 0;
	private int incrementedNumber = instanceNumber++;
	
	public int getIncrementedNumber() {
		return incrementedNumber;
	}
	public void setIncrementedNumber(int incrementedNumber) {
		this.incrementedNumber = incrementedNumber;
	}
	
	
	
}
