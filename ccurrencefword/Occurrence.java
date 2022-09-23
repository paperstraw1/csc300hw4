package ccurrencefword;
public class Occurrence {

	public static int FindWord(String word, String occurrence)
	{
	    //for a hint on the hw you said to split the string separated by spaces
	    String str[] = word.split(" ");
	 
	    int count = 0;
	    for (int i = 0; i < str.length; i++)
	    {
	    if (occurrence.equals(str[i]))
	        count++;
	    }
	    System.out.println("The word " + "'" + occurrence + "' occurs " + count + " time(s)");
	    
	    return count;
	}
	
	public static void main(String[] args) 
	{
		//put the sentence of what you want to count the occurrence of
		String Sentence = "In the beginning God created the heavens and the earth.";
		//here it will look for every time it says the specific word
		String Look1 = "the";
		String Look2 = "beginning";
		String Look3 = "recreate";

		FindWord(Sentence, Look1);
		FindWord(Sentence, Look2);
		FindWord(Sentence, Look3);
		
	}

}