import java.util.*;

public class DicePair
{
	Die d1 = new Die();
	Die d2 = new Die();

	public DicePair()
	{
		Die d1 = new Die();
		Die d2 = new Die();
	}

	public int roll()
	{
		int total=0;
		total+=d1.roll();
		total+=d2.roll();
		return total;
	}

	
}
