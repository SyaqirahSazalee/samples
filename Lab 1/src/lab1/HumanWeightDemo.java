/*
 * This class display the weight of human on earth and mars
 */
package lab1;

public class HumanWeightDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//set weight for person 1 and display the weight on earth and mars
		HumanWeight weight1 = new HumanWeight (60);
		weight1.calculateWeightOnMars();
		
		System.out.println("Weight on earth: " + weight1.getWeightOnEarth());
		System.out.println("Weight on mars: " + weight1.getWeightOnMars());
		
		System.out.print("\n\n");
		
		//set weight for person 2 and display the weight on earth and mars
		HumanWeight weight2 = new HumanWeight (70);
		weight2.calculateWeightOnMars();
		
		System.out.println("Weight on earth: " + weight2.getWeightOnEarth());
		System.out.println("Weight on mars: " + weight2.getWeightOnMars());
	}
}
