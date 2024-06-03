package framework;

/**
 * <p>
 * Class OrderItem models an item in an order.
 * </p>
 *
 * @author A Jiayi
 * @version 1.0.0
 * @see Product
 */
public class OrderItem {

	/**
	 * The product of the order.
	 */
	private Product product;

	/**
	 * The quantity of the product in the order.
	 */
	private int quantity;

	/**
	 * Constructs a <code>OrderItem</code> object.
	 * 
	 * @param initialProduct  the product of the order.
	 * @param initialQuantity the quantity of the product in the order.
	 */
	public OrderItem(Product initialProduct, int initialQuantity) {
		product = initialProduct;
		quantity = initialQuantity;
	}

	/**
	 * Returns the product of this order.
	 *
	 * @return the product of this order.
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * Returns the quantity of this order.
	 *
	 * @return the quantity of this order.
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * set the instance variable quantity to <code>newQuantity</code>
	 *
	 * @param newQuantity the new value of the order's quantity
	 */
	public void setQuantity(int newQuantity) {
		quantity = newQuantity;
	}

	/**
	 * Returns the product of quantity and price.
	 *
	 * @return the product of quantity and price.
	 */
	public double getCost() {
		return quantity * getProduct().getPrice();
	}

	/**
	 * Returns the string representation of this order item.
	 *
	 * @return the string representation of this order item.
	 */
	public String toString() {
		return getQuantity() + " " + getProduct().getCode() + " " + getProduct().getPrice();
	}
}
