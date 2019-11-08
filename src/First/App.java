package First;

public class App
{
	public static void process(Processor p,Object s)
	{
		System.out.println(p.name());
		System.out.println(p.process(s));
	}
	public static String s="My name is Qiqi Rookie";
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		process(new Upcase(),s);
		process(new LowCase(),s);

	}

}
