import java.util.Scanner;
public class KefaAndFirstSteps {
    public static void main(String[] args) {
             int m;
        Scanner s = new Scanner(System.in);
        m= s.nextInt();
        int [] p = new int[m];
         for(int i=0;i<p.length;i++){
             p[i]= s.nextInt();
         }
        System.out.println(count(p));
    }
    public static int count(int [] a){
     int b=1, c=1;
          for(int i=0;i<a.length-1;i++){
         if(a[i+1]>=a[i]){
             b++;
         }
         else{
             c= Math.max(c, b);
             b=1;
         }
             c= Math.max(c, b); 
    }
          return c;
}
    }
