package framework;

/**
 * This class associates a name with a string value. Each DataField object
 * represents a single attribute that is stored within an object.
 * 
 * @author A Jiayi
 * @version 1.0.0
 */
public class DataField {

	private String name;
	private String value;

	/**
	 * Constructs a data field.
	 *
	 * @param initName  the name of the field.
	 * @param initValue the string value of the field.
	 */
	DataField(String initName, String initValue) {
		name = initName;
		value = initValue;
	}

	/**
	 * Get the name of the field.
	 *
	 * @return the name of the field.
	 */

	public String getName() {
		return name;
	}

	/**
	 * Get the string value of the field.
	 *
	 * @return the string value of the field.
	 */

	public String getValue() {
		return value;
	}

}
