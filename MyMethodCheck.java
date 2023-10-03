package Functions;

public class MyMethodCheck {
	public int add() {
		int a=5;
		int b=10;
		return a+b;
	}

public void findadd() {
	int a=23;
	int b=30;
	System.out.println(a+b);
}
public float mul(int a,float b, long c) {
	return a*b-c;
}
public void div(float a, float b,int c) {
	System.out.println(a-b);
}
public String find(int a) {
	if(a%2==0) {
		return"even";
	}
	else {
	return "odd";
	}
}
public String findNumber(int a) {
	if(a>0) {
		return "positive";
	}
	else if(a<0) {
		return "Negative";
	}
	else {
		return "Neutral";
	}
}
public String Prime(int a) {
	boolean result=true;
	for(int i=2; i<a; i++) {
		if(a%i==0) {
			result=false;
		}
	}
		if(result==true) {
			return "Prime";
		}
		else {
			return "Not Prime";
		}
	}

public int findNet(int price, int taxPer) {
	return (price*taxPer/100)+price;
}
 
public String findMax(int[] a) {
	int max=0;
	for(int i=0; i<a.length; i++) {
		if(a[i]>max) {
			max=a[i];
		}
	}
	if(max%2==0) {
		return "EVEN";
	}
	else {
	return "ODD";
	}
		}
public String myStr(String[] a) {
	String b="";
	for(int i=0; i<a.length; i++) {
		if(a[i].length()>=a[i].length()) {
			b=a[i];
		}
		}
	return "This is Maximum String " +b;
}
}

 
