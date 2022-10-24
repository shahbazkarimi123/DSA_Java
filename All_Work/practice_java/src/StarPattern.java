package All_Work.practice_java.src;
import java.util.Scanner;
public class StarPattern {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        int midNum = count/2;
        for(int i=0;i<count;i++){
            int j=0;
            while(j < count-i){
                System.out.print(" ");
                j++;
            }
            int star = (i*2)-1;
            int k = 0;
            while(k <= star+1){
                System.out.print("*");
                k++;
            }
            System.out.println();
        }
    }
    
}
