
public class loopingPractice {
	public static void main(String [] args) {
		
			int i = 0, count = 0;
					
			String vowels = "aAeEoOuUiI";		
			String s = "How are you today";
			
			
			while (i < s.length()) {   //note!!! if you put in <= instead then it will give an error 
				
				if (vowels.indexOf(s.charAt(i)) !=-1 ) {
				
				count ++;
				};
				
				i ++;
			}
		
			System.out.printf("There are %d vowels in the string \"%s\".", count, s);
			
			
			
		
		

		

		
	}

}
