package framework;

import java.util.*;

/**
 * This class models a product catalog.
 *
 * @author A Jiayi
 * @version 1.0.0
 * @see Product
 */
public class Catalog {

	/**
	 * A vector of <code>Product</code>.
	 */
	private Vector<Product> products;

	/**
	 * Constructs the vector products, which is initially empty.
	 */
	public Catalog() {
		products = new Vector<Product>();
	}

	/**
	 * Add the specified product to the vector products.
	 *
	 * @param product the specified product added to the vector products.
	 */
	public void addProduct(Product product) {
		products.add(product);
	}
	
	/**
	 * Return an array containing all the product codes in this catalog.
	 *
	 * @return an array containing all the product codes in this catalog.
	 * @return an empty array if there are no products in the catalog¡£
	 */
	public String[] getCodes() {
		String[] codes = new String[products.size()];
		int index = 0;
		for (Iterator<Product> i = getProductsIterator(); i.hasNext();) {
			Product product = (Product)i.next();
			codes[index] = product.getCode();
			index += 1;
		}
		return codes;
	}

	/**
	 * Return a <code>Product</code> with the specified code.
	 *
	 * @return a <code>Product</code> with the specified code.
	 * @return null if there are no products in the catalog with specified code
	 */
	public Product getProduct(String code) {
		for (Iterator<Product> i = getProductsIterator(); i.hasNext();) {
			Product product = (Product) i.next();
			if (product.getCode().equals(code)) {
				return product;
			}
		}
		return null;
	}

	/**
	 * Return an iterator over the instances in the vector products.
	 * 
	 * @return an iterator over the instances in the vector products.
	 */
	public Iterator<Product> getProductsIterator() {
		return products.iterator();
	}

	/**
	 * Return the number of products.
	 *
	 * @return the number of products.
	 */
	public int getNumberOfProducts() {
		return products.size();
	}
}
