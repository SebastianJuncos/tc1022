import java.util.*;
/*Sebastian Juncos A01022629
10/24/2018
*/
public class bisiesto{
	public static void main (String [] args){
		// variables
		double year = 0, res = 0, nextDiv=0, nextDiv1 = 0, nextDiv2 = 0, last = 0, percent = 0;
		Scanner kb = new Scanner(System.in);
		//coding
		System.out.println("Introduce un año");
		year = kb.nextInt();
		if (year >= 0){
			if( year < 100){
				percent = year%4;
				if (percent == 0.0){
					System.out.println("El año es bisiesto");
				}
				else
				System.out.println("El año no es bisiesto");
			}//first nested if end
			else if ( year >= 100 && year <= 400){
				nextDiv = year%100;
				nextDiv2 = year%4;
				if (nextDiv == 0.0 && nextDiv2 == 0.0){
					System.out.println("El año es bisiesto");
				}// second nested if end
				else
					System.out.println("El año no es bisiesto");
			}//first nested else if end
			else if (year > 400){
				last = year%400;
				res = year%100;
				nextDiv1 = year%4;
				if (last == 0.0 && res == 0.0 && nextDiv1 == 0.0){
					System.out.println("El año es bisiesto");
				}
				else
							System.out.println("El año no es bisiesto");
			}//second nested else if end
		}//if end
		else
		System.out.println("El año no es valido");
	}// main end
}//bisiesto end

