package All_Work.practice_java.src;
import java.util.Scanner;
public class MirrorImage {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        for(int i=1;i<=count;i++){
            int j=1;
            while(j<=count-i){
                System.out.print(" ");
                j++;
            }
            int num = 1;
            while(num<=i){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
    
}
