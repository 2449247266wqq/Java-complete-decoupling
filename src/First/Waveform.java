package First;

public class Waveform
{
	private static long counter;
	private final long id = counter++;
	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return "Waveform"+id;
	}
	

}
