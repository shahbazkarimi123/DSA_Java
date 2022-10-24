package All_Work.practice_java.src;
import java.util.Scanner;
public class IntrustingPattern {
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = s.nextInt();
		int r=0;
		for(int i=count;i>0;i--) {
			int j=i-(i-r);
			while(j>=0) {
				char alpha = (char)('A'+i-j);
				System.out.print(alpha);
				j--;
			}
			r++;
			System.out.println();
		}
	}
    
}
