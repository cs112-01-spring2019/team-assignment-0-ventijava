import java.util.*;

public class Coin
{
	private boolean heads = true;

	public Coin()
	{
		heads = true;
	}
	public void flip()
	{
	int toss;
	Random generator = new Random();
	toss = generator.nextInt(2);
	if (toss == 0)
	{
		heads = true;
	}
	else
	{
		heads = false;
	}
	}
	public boolean isHeads()
	{
		if (heads == true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
