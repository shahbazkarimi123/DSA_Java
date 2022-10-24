package All_Work.practice_java.src;
import java.util.Scanner;
public class TriangelNumber {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int i=0;
        int p=0;
        while(i<=num){
            int dot = 1;
            while(dot<num-i){
                System.out.print(" ");
                dot++;

            }
            p = i;
            int end = (i*2)-1;
            while(p<=end){
                System.out.print(p);
                p++;

            }
            int count =1;
            p=p-2;
            while(count<i){
                
                System.out.print(p);
                p--;
                count++;
            }

            System.out.println();
            i++;
            
        } 
        
    }
    
}
