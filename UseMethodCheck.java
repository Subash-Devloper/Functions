package Functions;

public class UseMethodCheck {
public static void main(String[] args) {
	MyMethodCheck a=new MyMethodCheck();
	System.out.println(a.add());
	a.findadd();
	System.out.println(a.mul(10,5.2f,3l));
	a.div(10.5f,5.5f,2);
	System.out.println(a.find(5));
	System.out.println(a.findNumber(1));
	System.out.println(a.Prime(7));
	int[] nums= {34,84,64,76};
	int[] values= {545,8667,54,577};
	System.out.println(a.findMax(nums));
	System.out.println(a.findMax(values));
	String[] value= {"Hi", "Hello", "Welcome","DEVELOPER"};
	System.out.println(a.myStr(value));
}
}
