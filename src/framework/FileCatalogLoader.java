package framework;

import java.util.*;
import java.io.*;

/**
 * The class FileCatalogLoader implements interface CatalogLoader. 
 * It is used to obtain a product catalog from a file.
 *
 * @author  A Jiayi
 * @version  1.0.0
 * @see CatalogLoader
 * @see Catolog
 * @see DataFormatException
 * @see Product
 * @see Coffee
 * @see CoffeeBrewer
 * 
 */
public class FileCatalogLoader implements CatalogLoader {

	/**
	 * This method reads a line of coffee-accessory data.
	 *
	 * @return a <code>Product</code> object that encapsulates the accessory data.
	 * @throws a <code>DataFormatException</code> that contains the line of
	 *           malformed data.
	 */
	private Product readProduct(String line) throws DataFormatException {

		StringTokenizer st = new StringTokenizer(line, "_");
		if (st.countTokens() != 4) {
			throw new DataFormatException(line);
		} else {
			try {
				st.nextToken();
				return new Product(st.nextToken(), st.nextToken(), Double.parseDouble(st.nextToken()));
			} catch (NumberFormatException nfe) {
				throw new DataFormatException(line);
			}
		}
	}

	/**
	 * This method reads a line of coffee data.
	 *
	 * @return a <code>Coffee</code> object that encapsulates the coffee data.
	 * @throws a <code>DataFormatException</code> that contains the line of
	 *           malformed data.
	 */
	private Coffee readCoffee(String line) throws DataFormatException {
		StringTokenizer st = new StringTokenizer(line, "_");
		if (st.countTokens() != 10) {
			throw new DataFormatException(line);
		} else {
			try {
				st.nextToken();
				return new Coffee(st.nextToken(), st.nextToken(), Double.parseDouble(st.nextToken()), st.nextToken(),
						st.nextToken(), st.nextToken(), st.nextToken(), st.nextToken(), st.nextToken());
			} catch (NumberFormatException nfe) {
				throw new DataFormatException(line);
			}
		}
	}

	/**
	 * This method reads a line of coffee-brewer data.
	 *
	 * @return a <code>CoffeeBrewer</code> object that encapsulates the brewer data.
	 * @throws a <code>DataFormatException</code> that contains the line of
	 *           malformed data.
	 */
	private CoffeeBrewer readCoffeeBrewer(String line) throws DataFormatException {
		StringTokenizer st = new StringTokenizer(line, "_");
		if (st.countTokens() != 7) {
			throw new DataFormatException(line);
		} else {
			try {
				st.nextToken();
				return new CoffeeBrewer(st.nextToken(), st.nextToken(), Double.parseDouble(st.nextToken()),
						st.nextToken(), st.nextToken(), Integer.parseInt(st.nextToken()));
			} catch (NumberFormatException nfe) {
				throw new DataFormatException(line);
			}
		}
	}

	/**
	 * This method loads the information in the specified file into a product
	 * catalog and returns the catalog.
	 *
	 * @return a procuct catalog.
	 * @throws <code>FileNotFoundException</code>
	 * @throws <code>IOException</code>
	 * @throws <code>DataFormatException</code>
	 */
	public Catalog loadCatalog(String filename) throws FileNotFoundException, IOException, DataFormatException {
		Catalog catalog = new Catalog();
		BufferedReader file = new BufferedReader(new FileReader(filename));
		String line = file.readLine();

		while (line != null) {
			if (line.startsWith("Product")) {
				catalog.addProduct(readProduct(line));
			} else if (line.startsWith("Coffee")) {
				catalog.addProduct(readCoffee(line));
			} else if (line.startsWith("Brewer")) {
				catalog.addProduct(readCoffeeBrewer(line));
			} else {
				file.close();
				throw new DataFormatException(line);
			}

			line = file.readLine();
		}

		file.close();
		return catalog;
	}
}
