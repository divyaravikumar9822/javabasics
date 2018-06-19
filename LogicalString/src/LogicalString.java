
public class LogicalString {
public static void main(String[] args){
		String input1="DIVYA RAVI YUVI";
		char ch1,ch2;
		int counter;
		int center;
		int num1,num2;
		int sum=0;
		int output=0;
		String[] words=input1.split("\\s");
		
		String totall="";
		//System.out.println(totall);

		for(String w:words){
		    counter=0;
		    center=w.length()/2;
		   // System.out.println(center);
		    sum=0;
		    while(counter<center){
		        ch1=w.charAt(counter);
		      //  System.out.println(ch1);
		       
		        ch2=w.charAt(w.length()-counter-1);
		      //  System.out.println(ch2);
		        counter++;
		        num1=getLetterNo(ch1);
		      //  System.out.println(num1);
		        num2=getLetterNo(ch2);
		       // System.out.println(num2);
		        sum+=diffLetter(num1,num2);
		       // System.out.println(sum);
		    }
		    if(w.length()%2!=0)
		        sum+=getLetterNo(w.charAt(center));
		    totall+=sum;
		   //System.out.println(totall);
		}
		output=Integer.valueOf(totall);


		System.out.println(output);    
		}
public static int getLetterNo(char letter){
	//System.out.println
	return ((int)letter-64);
	}
public static int diffLetter(int a, int b){
	int difference=a-b;
	if(difference<0)
	    difference*=-1;
	return difference;
	}
}

