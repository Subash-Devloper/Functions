package Functions;

public class Car {
	
		String brand;
		int price;
		int taxPer;
		int netPrice;
		
		public int findNet(int price, int taxPer) {
			return (price*taxPer/100)+price;
		}
		public Car findWord(Car[] a) {
			Car max=a[0];
			for(int i=0; i<a.length; i++) {
				if(a[i].brand.length()>max.brand.length())
					max=a[i];
			}
		return max;
			}
		public void show() {
			System.out.println("Brand= "+brand+" "+"NetPrice= "+netPrice);
		}
			
		}

