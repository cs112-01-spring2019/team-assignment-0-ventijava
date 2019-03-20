import java.util.*

public class Coin
{
	private boolean heads = true;

	public Coin()
	{
		boolean heads = true;
	}
	public flip()
	{
	private int toss;
	Random generator = new random();
	toss = generator.nextInt(1);
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
		if (heads == false)
		{
			return false;
		}
	}
}
