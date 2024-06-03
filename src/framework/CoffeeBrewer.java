package framework;

/**
 * <p>
 * Class CoffeeBrewer models a coffee brewer. It extends class Product.
 * </p>
 *
 * @author A Jiayi
 * @version 1.0.0
 * @see Product
 */
public class CoffeeBrewer extends Product {

	/**
	 * The model of the coffee brewer.
	 */
	private String model;

	/**
	 * The water supply of the coffee brewer.
	 */
	private String waterSupply;

	/**
	 * The capacity of the coffee brewer.
	 */
	private int numberOfCups;

	/**
	 * Constructs a <code>Coffee</code> object.
	 * 
	 * @param initialCode         the code of the coffee brewer.
	 * @param initialDescription  the description of the coffee brewer.
	 * @param initialPrice        the price of the coffee brewer.
	 * @param initialModel        the model of the coffee brewer.
	 * @param initialWaterSupply  the water supply of the coffee brewer.
	 * @param initialNumberOfCups the capacity of the coffee brewer.
	 */
	public CoffeeBrewer(String initialCode, String initialDescription, double initialPrice, String initialModel,
			String initialWaterSupply, int initialNumberOfCups) {

		super(initialCode, initialDescription, initialPrice);

		model = initialModel;
		waterSupply = initialWaterSupply;
		numberOfCups = initialNumberOfCups;
	}

	/**
	 * Returns the model of this coffee brewer.
	 *
	 * @return the model of this coffee brewer.
	 */
	public String getModel() {
		return model;
	}

	/**
	 * Returns the water supply of this coffee brewer.
	 *
	 * @return the water supply of this coffee brewer.
	 */
	public String getWaterSupply() {
		return waterSupply;
	}

	/**
	 * Returns the capacity of this coffee brewer.
	 *
	 * @return the capacity of this coffee brewer.
	 */
	public int getNumberOfCups() {
		return numberOfCups;
	}

	/**
	 * Returns the string representation of this coffee brewer.
	 *
	 * @return the string representation of this coffee brewer.
	 */
	public String toString() {
		return super.toString() + "_" + getModel() + "_" + getWaterSupply() + "_" + getNumberOfCups();
	}
}
