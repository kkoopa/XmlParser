/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlparser;

import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import product.Product;

/**
 *
 * @author bbyholm
 */
public class XmlParser {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		try {
			// TODO code application logic here
			JAXBContext jc = JAXBContext.newInstance(Product.class);
			Unmarshaller u = jc.createUnmarshaller();
			Product p = (Product) u.unmarshal(new StreamSource(new StringReader(
				"<product id=\"1\" optLockVersion=\"1\"><barCode>1</barCode><name>Namn</name><vat>15</vat><keyword>test</keyword></product>")));
			System.out.println(p);
		} catch (JAXBException ex) {
			Logger.getLogger(XmlParser.class.getName()).log(Level.SEVERE,
				null, ex);
		}
	}

}
