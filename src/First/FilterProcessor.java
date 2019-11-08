package First;

public class FilterProcessor
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Waveform w =new Waveform();
		App.process(new FilterAdapter(new Lowpass(1.0)),w);
		App.process(new FilterAdapter(new Highpass(2.0)),w);

	}

}
