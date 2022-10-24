package All_Work.practice_java.src;
import java.util.Scanner;
public class InvertedNumber {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        
        for(int i=0;i<count;i++){
            int j=0;
            while(j<count-i){
                System.out.print(count-i);
                j++;
            }
            int num = 0;
            while(num<i){{
                System.out.print(" ");
                num++;
            }
            

            }
            System.out.println();

        }
    }
    
}
