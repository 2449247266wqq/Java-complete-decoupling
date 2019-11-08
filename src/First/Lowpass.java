package First;

public class Lowpass extends Filter
{
	double cutoff;

	public Lowpass(double cutoff)
	{
		this.cutoff = cutoff;
	}
	public  String name(){
		return "Lowpass";
	}
	public Waveform process(Waveform input) {return input;}
}
