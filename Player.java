/*
 * @author Saige Madden
 */

public class Player {

	private String name="";
	private int wins, losses, points;


	public Player(String playerName)
	{
		name = playerName;
		wins = 0;
		losses = 0;
		points = 0;
	}

	public String getName()
	{
		return name;
	}
	public int getPoints(){
		return points;
	}
	public int getWins()
	{
		return wins;
	}
	public int getLosses()
	{
		return losses;
	}

	public void setName(String newName){
		name = newName;
	}
	public void setPoints(int z){
		points = z;
	}
	public void setLosses(int newLosses){
		losses = newLosses;
	}
	public void setWins(int newWins){
		losses = newWins;
	}


	public void won(){
		wins++;
	}
	public void lost(){
		losses++;
	}
	public String toString()
	{
		return name+":\n\tWins: " + wins +"\n\t" + "Losses: "+losses+"\n";
	}
}
