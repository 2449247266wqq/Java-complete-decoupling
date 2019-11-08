package First;

public class Highpass extends Filter
{
	double cutoff;

	public Highpass(double cutoff)
	{
		this.cutoff = cutoff;
	}
	public  String name(){
		return "Highpass";
	}
	public Waveform process(Waveform input) {return input;}

}
