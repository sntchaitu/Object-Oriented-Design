//Builder design pattern implementation 
//reference link http://ramj2ee.blogspot.in/2013/12/builder-design-pattern-implementation.html#.WB4gMGVeDR0

package coffee_builder;
import java.util.*;
public class customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Please enter Drink Name");
		String input = sc1.next();
		Director.takeOrder(input);
		
	}

}
