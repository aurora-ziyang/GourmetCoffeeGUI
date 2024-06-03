package framework;

import java.util.*;

/**
 * This class implements a method that obtains a HTML representation of a
 * {@link Sales} object.
 *
 * @author A Jiayi
 * @version 1.0.0
 */
public class HTMLSalesFormatter implements SalesFormatter {

	/**
	 * Line separator.
	 */
	private static final String NEW_LINE = System.getProperty("line.separator");

	/**
	 * Single instance of this class.
	 */
	private static HTMLSalesFormatter singletonInstance = null;

	/**
	 * Obtains the single instance of class <code>HTMLSalesFormatter</code>
	 *
	 * @return the single instance of class <code>HTMLSalesFormatter</code>
	 */
	public static HTMLSalesFormatter getSingletonInstance() {

		if (singletonInstance == null) {
			singletonInstance = new HTMLSalesFormatter();
		}

		return singletonInstance;
	}

	/**
	 * The constructor is declared private so other classes cannot create an
	 * instance of this class.
	 */
	private HTMLSalesFormatter() {
	}

	/**
	 * Obtains an HTML representation of the specified sales
	 *
	 * @param sales the specified sales.
	 * @return an HTML representation of the specified {@link Sales} object.
	 */
	public String formatSales(Sales sales) {

		String out = "<html>" + NEW_LINE + "  <body>" + NEW_LINE + "" + "    <center><h2>Orders</h2></center>"
				+ NEW_LINE;

		for (Iterator<Order> i = sales.getOrdersIterator(); i.hasNext();) {

			Order order = (Order) i.next();

			out += "    <hr>" + NEW_LINE + "    <h4>Total = " + order.getTotalCost() + "</h4>" + NEW_LINE;

			for (Iterator<OrderItem> j = order.getItemsIterator(); j.hasNext();) {
				OrderItem item = (OrderItem) j.next();
				out += "    <p>" + NEW_LINE + "      <b>code:</b> " + item.getProduct().getCode() + "<br>" + NEW_LINE
						+ "      <b>quantity:</b> " + item.getQuantity() + "<br>" + NEW_LINE + "      <b>price:</b> "
						+ item.getProduct().getPrice() + NEW_LINE + "    </p>" + NEW_LINE;
			}
		}

		out += "  </body>" + NEW_LINE + "</html>";

		return out;
	}
}
