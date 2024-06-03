package framework;

import java.util.*;

/**
 * This class implements a method that obtains a plain text representation of a
 * {@link Sales} object.
 *
 * @author A Jiayi
 * @version 1.0.0
 */
public class PlainTextSalesFormatter implements SalesFormatter {

	/**
	 * Line separator.
	 */
	private static final String NEW_LINE = System.getProperty("line.separator");

	/**
	 * Single instance of this class.
	 */
	private static PlainTextSalesFormatter singletonInstance = null;

	/**
	 * Obtains the single instance of class <code>PlainTextSalesFormatter</code>
	 *
	 * @return the single instance of class <code>PlainTextSalesFormatter</code>
	 */
	public static PlainTextSalesFormatter getSingletonInstance() {

		if (singletonInstance == null) {
			singletonInstance = new PlainTextSalesFormatter();
		}

		return singletonInstance;
	}

	/**
	 * The constructor is declared private so other classes cannot create an
	 * instance of this class.
	 */
	private PlainTextSalesFormatter() {
	}

	/**
	 * Obtains a plain text representation of the specified sales
	 *
	 * @param sales the sales.
	 * @return a plain text representation of the specified {@link Sales} object.
	 */
	public String formatSales(Sales sales) {

		String out = "";
		int sequenceNumber = 1;

		for (Iterator<Order> i = sales.getOrdersIterator(); i.hasNext();) {
			Order order = (Order) i.next();
			out += "-----------------------" + NEW_LINE + "Order " + sequenceNumber++ + NEW_LINE + NEW_LINE;

			for (Iterator<OrderItem> j = order.getItemsIterator(); j.hasNext();) {
				OrderItem item = (OrderItem) j.next();
				out += item.toString().replace(",", " ") + NEW_LINE;
			}
			out += NEW_LINE + "Total = " + order.getTotalCost() + "\n";
		}
		return out;
	}
}
