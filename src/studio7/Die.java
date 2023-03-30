package studio7;

public class Die {

	private int sides;
	
	public Die()
	{
		sides = 0;
	}
	
	public Die(int initSides)
	{
		sides = initSides;
	}
	
	public int roll()
	{
		return (int)(sides * Math.random() + 1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
		Die d6 = new Die(6);
		System.out.println(d6.roll());
		}
		
	}

}
