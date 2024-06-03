package framework;

import java.util.*;

/**
 * The class Sales maintains a list of the orders that have been completed.
 *
 * @author A Jiayi
 * @version 1.0.0
 * @see Order
 */
public class Sales {

	/**
	 * A vector that contains references to instances of class Order.
	 */
	private Vector<Order> orders;

	/**
	 * Creates the vector orders, which is initially empty.
	 */
	public Sales() {
		orders = new Vector<Order>();
	}

	/**
	 * Adds the specified order to the vector orders.
	 *
	 * @param order the specified <code>Order</code> to be added.
	 */
	public void addOrder(Order order) {
		orders.add(order);
	}

	/**
	 * Returns an iterator over the instances in the vector orders.
	 *
	 * @return an iterator over the instances in the vector orders.
	 */
	public Iterator<Order> getOrdersIterator() {
		return orders.iterator();
	}

	/**
	 * Returns the number of instances in the vector orders.
	 *
	 * @returns the number of instances in the vector orders.
	 */
	public int getNumberOfOrders() {
		return orders.size();
	}
}
