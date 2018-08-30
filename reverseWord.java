class reverseWord{
	public static void main(String args[]){

		String s = "I Love My INDIA";

		String newS = "";

		int length = s.length();

		for(int i = length-1; i >= 0; i--){

			newS = newS + s.charAt(i);
		}
		System.out.println("" + newS);
		//Output: AIDNI yM evoL I

		String newString = newS;
		char s0 = '';
		char Space0 = '';

		int newL = newString.length();

		for(int i = newL-1; i >= 0; i--){

			if((newString.charAt(i) != ' ') && (newString.charAt(i-1) == ' ')){
				s0 = newString.charAt(i);
			}
			else{
				Space0 = ' ';
			}
			System.out.println(" " + s0 + Space0);

		}

	}
}

//Output: AIDNI yM evoL I
