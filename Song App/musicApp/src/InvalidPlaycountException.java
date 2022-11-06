public class InvalidPlaycountException extends Exception
{

	private int playcountSent;
	
	//Blank InvalidPlaycountException with no argurements 
	private InvalidPlaycountException()
	{}
		
	
	//Returns the numberSent of an InvalidPlaycountException.
	public int getNumberSent()
	{
		return this.playcountSent;
	}
	
}