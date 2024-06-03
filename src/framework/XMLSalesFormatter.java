package framework;

import java.util.*;

/**
 * This class implements a method that obtains a XML representation of a
 * {@link Sales} object.
 *
 * @author A Jiayi
 * @version 1.0.0
 */
public class XMLSalesFormatter implements SalesFormatter {

	/**
	 * Line separator.
	 */
	private static final String NEW_LINE = System.getProperty("line.separator");

	/**
	 * Single instance of this class.
	 */
	private static XMLSalesFormatter singletonInstance = null;

	/**
	 * Obtains the single instance of class <code>XMLSalesFormatter</code>
	 *
	 * @return the single instance of class <code>XMLSalesFormatter</code>
	 */
	public static XMLSalesFormatter getSingletonInstance() {

		if (singletonInstance == null) {
			singletonInstance = new XMLSalesFormatter();
		}

		return singletonInstance;
	}

	/**
	 * The constructor is declared private so other classes cannot create an
	 * instance of this class.
	 */
	private XMLSalesFormatter() {
	}

	/**
	 * Obtains an XML representation of the specified sales
	 *
	 * @param sales the specified sales.
	 * @return a XML representation of the specified {@link Sale} object.
	 */
	public String formatSales(Sales sales) {

		String out = "<Sales>" + NEW_LINE;

		for (Iterator<Order> i = sales.getOrdersIterator(); i.hasNext();) {

			Order order = (Order) i.next();

			out += "  <Order total=\"" + order.getTotalCost() + "\">" + NEW_LINE;

			for (Iterator<OrderItem> j = order.getItemsIterator(); j.hasNext();) {
				OrderItem item = (OrderItem) j.next();
				out += "    <OrderItem quantity=\"" + item.getQuantity() + "\" price=\"" + item.getProduct().getPrice()
						+ "\">" + item.getProduct().getCode() + "</OrderItem>" + NEW_LINE;
			}
			out += "  </Order>" + NEW_LINE;
		}

		out += "</Sales>";

		return out;
	}
}
