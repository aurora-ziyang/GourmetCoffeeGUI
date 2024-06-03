package framework;

/**
 * <p>
 * The class Coffee models a coffee product. It extends class Product.
 * </p>
 *
 * @author A Jiayi
 * @version 1.0.0
 * @see Product
 */

public class Coffee extends Product {

	/**
	 * The origin of the coffee.
	 */
	private String origin;

	/**
	 * The roast of the coffee.
	 */
	private String roast;

	/**
	 * The flavor of the coffee.
	 */
	private String flavor;

	/**
	 * The aroma of the coffee.
	 */
	private String aroma;

	/**
	 * The acidity of the coffee.
	 */
	private String acidity;

	/**
	 * The body of the coffee.
	 */
	private String body;

	/**
	 * Constructs a <code>Coffee</code> object.
	 * 
	 * @param initialCode        the code of the coffee.
	 * @param initialDescription the description of the coffee.
	 * @param initialPrice       the price of the coffee.
	 * @param initialOrigin      the origin of the coffee.
	 * @param initialRoast       the roast of the coffee.
	 * @param initialFlavor      the flavor of the coffee.
	 * @param initialAroma       the aroma of the coffee.
	 * @param initialAcidity     the acidity of the coffee.
	 * @param initialBody        the body of the coffee.
	 */
	public Coffee(String initialCode, String initialDescription, double initialPrice, String initialOrigin,
			String initialRoast, String initialFlavor, String initialAroma, String initialAcidity, String initialBody) {

		super(initialCode, initialDescription, initialPrice);

		origin = initialOrigin;
		roast = initialRoast;
		flavor = initialFlavor;
		aroma = initialAroma;
		acidity = initialAcidity;
		body = initialBody;
	}

	/**
	 * Returns the origin of this coffee.
	 *
	 * @return the origin of this coffee.
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * Returns the roast of this coffee.
	 *
	 * @return the roast of this coffee.
	 */
	public String getRoast() {
		return roast;
	}

	/**
	 * Returns the flavor of this coffee.
	 *
	 * @return the flavor of this coffee.
	 */
	public String getFlavor() {
		return flavor;
	}

	/**
	 * Returns the aroma of this coffee.
	 *
	 * @return the aroma of this coffee.
	 */
	public String getAroma() {
		return aroma;
	}

	/**
	 * Returns the acidity of this coffee.
	 *
	 * @return the acidity of this coffee.
	 */
	public String getAcidity() {
		return acidity;
	}

	/**
	 * Returns the body of this coffee.
	 *
	 * @return the body of this coffee.
	 */
	public String getBody() {
		return body;
	}

	/**
	 * Returns the string representation of this coffee.
	 *
	 * @return the string representation of this coffee.
	 */
	public String toString() {
		return super.toString() + "_" + getOrigin() + "_" + getRoast() + "_" + getFlavor() + "_" + getAroma() + "_"
				+ getAcidity() + "_" + getBody();
	}
}
