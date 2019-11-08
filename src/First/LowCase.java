package First;
//继承类，用来将字符大写
public class LowCase implements  Processor
{
	public  String name(){
		return "Lowcase";
	}
	public String process(Object input) {return ((String)input).toLowerCase();}

}