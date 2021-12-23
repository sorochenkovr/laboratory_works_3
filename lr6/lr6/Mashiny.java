package lr6;
import java.util.Vector;

public class Mashiny {

	protected String type;
	protected int probeg;
	

	
	public void Worker(String TIP_MASHINY, int PROBEG)
	{
		type = TIP_MASHINY;
		probeg = PROBEG;
	}
	@Override
	public String toString()
	{
		return "Марка: " + type + "\n" + 
			   "Пробег (в годах): " + probeg + "\n";
	}
	

}
