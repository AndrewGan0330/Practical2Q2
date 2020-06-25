
package practical2q1;

/**
 *
 * @author mengf
 */
public class Practical2Q1 {

    public static void main (String[]args){
   	
   	double ans = 0, num = 0;
   	
   	System.out.printf("Number  SquareRoot\n");
   	
   	for(int i = 0 ; i <=20; i+= 2){
   		
   		num = i;
   		ans = Math.sqrt(i);
   		
   		System.out.printf("%-2.0f       %.4f\n", num, ans);
   	}
   } 
}
