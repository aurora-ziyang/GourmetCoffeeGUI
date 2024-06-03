package framework;

import java.util.*;

/**
 * <p>
 * The class Product models a generic product in the store.
 * </p>
 *
 * @author A Jiayi
 * @version 1.0.0
 */
public class Product {

	/** The Unique code that identifies the product */
	private String code;

	/** A short description of the product */
	private String description;

	/** The price of the product */
	private double price;

	/**
	 * Constructs a <code>Product</code> object.
	 * 
	 * @param initialCode        the code of the product.
	 * @param initialDescription the description of the product.
	 * @param initialPrice       the price of the product.
	 */
	public Product(String initialCode, String initialDescription, double initialPrice) {

		code = initialCode;
		description = initialDescription;
		price = initialPrice;
	}

	/**
	 * Returns the code of this product.
	 *
	 * @return the code of this product.
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Returns the description of this product.
	 *
	 * @return the description of this product.
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Returns the price of this product.
	 *
	 * @return the price of this product.
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * Returns an ArrayList of DataField with the names and values of each attribute for this product.
	 *
	 * @return an ArrayList of DataField with the names and values of each attribute for this product.
	 */
	public ArrayList<DataField> getDataFields() {
		ArrayList<DataField> dataFields = new ArrayList<DataField>();
		dataFields.add(new DataField("Code:", code));
		dataFields.add(new DataField("Description:", description));
		dataFields.add(new DataField("Price:", String.valueOf(price)));
		return dataFields;
	}

	/**
	 * Returns <code>true</code> if the code of this product is equal to the code of
	 * the specified object.
	 *
	 * @param object object with which this product is compared.
	 * @return <code>true</code> if the code of this product is equal to the code of
	 *         the argument; <code>false</code> otherwise.
	 */
	public boolean equals(Object object) {
		return object instanceof Product && getCode().equals(((Product) object).getCode());
	}

	/**
	 * Returns the string representation of this product.
	 *
	 * @return the string representation of this product.
	 */
	public String toString() {
		return getCode() + "_" + getDescription() + "_" + getPrice();
	}
}
