/*
 * This class display the weight of human on earth and mars
 */
package lab1;

public class HumanWeightDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HumanWeight weight1 = new HumanWeight (70);
		
		weight1.calculateWeightOnMars();
		
		System.out.println("Weight on earth: " + weight1.getWeightOnEarth());
		System.out.println("Weight on mars: " + weight1.getWeightOnMars());
		
	}
}
