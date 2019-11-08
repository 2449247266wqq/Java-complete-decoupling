package First;
//继承类，用来将字符大写
public class Upcase implements  Processor
{
	public  String name(){
		return "Upcase";
	}
	public String process(Object input) {return ((String)input).toUpperCase();}

}
