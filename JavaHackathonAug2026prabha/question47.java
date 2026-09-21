package tekarchJavaHackathon;

//If no access modifier is specified, 
//this means only classes within the same package can access it.
class sample{
	String sampletxt;
}
//Q47. What are access modifiers? Give me an example?
public class question47 {

	public static void main(String[] args) {
		
		sample ch = new sample();
		//accessible within the same package
		ch.sampletxt = "Default access modifier";
		System.out.println(ch.sampletxt);
	}

}
