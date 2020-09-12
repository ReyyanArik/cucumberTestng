package ApplicationPages;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import WebConnector.webconnector;
import static WebConnector.webconnector.driver;
import java.io.IOException;

public class Homepage {
	webconnector wc=new webconnector();

    public void goToHomePage(String url){
    	driver.get(url);
        wc.waitForCondition("PageLoad","",60);
    }

    public void checkBlogLinkDisplay() {
    	try {
			wc.PerformActionOnElement("BlogLink_HomePage","Click","");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}