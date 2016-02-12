
public class printVowels 
	
{
    public static void main(String[] args)
    {
    	printVowels.printVowels("Hello");
    	
    }
    static void printVowels(String s)
    {
    	 String vowels="aeiouAEIOU";
    	 for(int i=0;i<s.length();i++)
    	 {
    		   if(vowels.indexOf(s.charAt(i))!=-1)
    		   {
    			   System.out.println(s.charAt(i));
    		   }
    	 }
    }
}


