package framework;

import java.io.*;

/**
 * This interface declares a method for obtaining a product catalog from a file.
 *
 * @author author name
 * @version 1.1.0
 * @see Catalog
 */
public interface CatalogLoader {

	/**
	 * Loads the information in the specified file into a product catalog and
	 * returns the catalog.
	 *
	 * @param filename The name of a file that contains catalog information.
	 * @return a product catalog.
	 * @throws FileNotFoundException if the specified file does not exist.
	 * @throws IOException           if there is an error reading the information in
	 *                               the specified file.
	 * @throws DataFormatException   if the file contains badly-formed data.
	 */
	Catalog loadCatalog(String fileName) throws FileNotFoundException, IOException, DataFormatException;
}