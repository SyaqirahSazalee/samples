/*
 * 
 */

package weightE7.demo;

public class WeightOnMarsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WeightOnMars weight1 = new WeightOnMars (70);
		
		weight1.calculateWeightOnMars();
		
		System.out.println("Weight on earth: " + weight1.getWeightOnEarth());
		System.out.println("Weight on mars: " + weight1.getWeightOnMars());
		
	}
}
