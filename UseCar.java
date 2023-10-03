package Functions;

public class UseCar {
	public static void main(String[] args) {
		Car a=new Car();
		Car d= new Car();
		d.brand="Mahindra";
		d.price=20000;
		d.taxPer=10;
		d.netPrice=a.findNet(d.price,d.taxPer);
		
		
		Car e= new Car();
		e.brand="Suzuki";
		e.price=50000;
		e.taxPer=20;
		e.netPrice=a.findNet(e.price,e.taxPer);
		
		
		Car f= new Car();
		f.brand="TATA";
		f.price=40000;
		f.taxPer=15;
		f.netPrice=a.findNet(f.price,f.taxPer);
	
	
		Car g= new Car();
		g.brand="Ford";
		g.price=30000;
		g.taxPer=10;
		g.netPrice=a.findNet(g.price,g.taxPer);
		
			Car[] cars1={d,e,f,g};
		Car s = a.findWord(cars1);
		s.show();
			
	}

}
