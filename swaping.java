class swaping{
	
	public static void main(String args[]){
		int a = 20;
		int b = 30;
		int c = a;
		
		
		System.out.println("Swaping value of c: " + c 
							+ "\n Value of a: " + a +
							"\nValue of b: " + b);
		
		a = b;
		b = c;
		
		
		System.out.println("Swaping value of a: " + a
							+"\nSwaping value of b: " + b);
		
	}
}