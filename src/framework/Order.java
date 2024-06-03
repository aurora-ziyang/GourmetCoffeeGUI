package framework;

import java.util.*;

/**
 * The class Order maintains a list of order items.
 *
 * @author A Jiayi
 * @version 1.0.0
 * @see OrderItem
 * @see Product
 */
public class Order {

	/**
	 * A collection of OrderItems.
	 */
	private Vector<OrderItem> items;

	/**
	 * Constructs the vector items, which is initially empty.
	 */
	public Order() {
		items = new Vector<OrderItem>();
	}
	
	/**
	 * Returns a vector containing all the items in this order.
	 *
	 * @return a vector containing all the items in this order.
	 */
	public Vector<OrderItem> getItems() {
		return items;
	}

	/**
	 * Add the specified <code>orderItem</code> to the vector items.
	 *
	 * @param orderItem the <code>orderItem</code> added to the vector items.
	 */
	public void addItem(OrderItem orderItem) {
		items.add(orderItem);
	}

	/**
	 * Remove the specified <code>orderItem</code> from the vector items.
	 *
	 * @param orderItem the <code>orderItem</code> removed to the vector items.
	 */
	public void removeItem(OrderItem orderItem) {
		items.remove(orderItem);
	}

	/**
	 * Return a <code>OrderItem</code> with the specified product.
	 *
	 * @return a <code>OrderItem</code> with the specified product.
	 * @return null if there are no items in the order with the specified product.
	 */
	public OrderItem getItem(Product product) {
		for (Iterator<OrderItem> i = getItemsIterator(); i.hasNext();) {
			OrderItem orderItem = (OrderItem) i.next();
			if (orderItem.getProduct().equals(product)) {
				return orderItem;
			}
		}
		return null;
	}

	/**
	 * Return an iterator over the vector items.
	 *
	 * @return an iterator over the vector items.
	 */
	public Iterator<OrderItem> getItemsIterator() {
		return items.iterator();
	}

	/**
	 * Return the number of instances in the vector items.
	 *
	 * @return the number of instances in the vector items.
	 */
	public int getNumberOfItems() {
		return items.size();
	}

	/**
	 * Return the total cost of the order.
	 *
	 * @return the total cost of the order.
	 */
	public double getTotalCost() {
		double total = 0.0;
		for (Iterator<OrderItem> i = getItemsIterator(); i.hasNext();) {
			OrderItem orderItem = (OrderItem) i.next();
			total += orderItem.getCost();
		}
		return total;
	}
}
