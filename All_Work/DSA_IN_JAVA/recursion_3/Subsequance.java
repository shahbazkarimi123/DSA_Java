package All_Work.DSA_IN_JAVA.recursion_3;
import java.util.Scanner;
public class Subsequance {
    public static String[] subsequances(String input) {
		if(input.length()==0) {
			String[] output = new String[1];
			output[0]="";
			return output;
		}
		String[] smallOutput = subsequances(input.substring(1));
		String[] output = new String[smallOutput.length*2];
		for(int i=0;i<smallOutput.length;i++) {
			output[i]=smallOutput[i];
		}
		for(int i=0;i<smallOutput.length;i++) {
			output[smallOutput.length+i]=input.charAt(0)+smallOutput[i];
		}
		return output;
	}
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
		String input = s.next();
		s.close();
		String[] output= subsequances(input);
		for(String k:output) {
			System.out.println(k);
		}
        
    }

    
}
