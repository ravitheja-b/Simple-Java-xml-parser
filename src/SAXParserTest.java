import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
 
/**
 * This class is used to read XML elements using SAX parser.
 * @author w3spoint
 */
public class SAXParserTest {
	public static void main(String[] args){
	      try {	
	    	  //File Path
		  String filePath = "C:/Users/bulip/Downloads/classInfo.xml";
 
	          //Create file object.
	          File inputFile = new File(filePath);
 
	          //Get SAXParserFactory instance.
	          SAXParserFactory factory=SAXParserFactory.newInstance();
 
	          //Get SAXParser object from SAXParserFactory instance.
	          SAXParser saxParser = factory.newSAXParser();
 
	          //Create StudentHandler object.
	          StudentHandler studentHandler = new StudentHandler();
 
	          //Parse the XML file.
	          saxParser.parse(inputFile, studentHandler);     
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	   }   
}
