package framework;

/**
 * Interface SalesFormatter declares the method that every "Formatter" class
 * will implement.
 *
 * @author A Jiayi
 * @version 1.0.0
 */
public interface SalesFormatter {

	/**
	 * Obtains the string representation of the specified <code>Sales</code>
	 * information
	 *
	 * @param sales the specified sales
	 * @return the string representation of the specified <code>Sales</code>
	 *         information
	 */
	String formatSales(Sales sales);
}
