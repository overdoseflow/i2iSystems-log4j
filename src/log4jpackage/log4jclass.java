
package log4jpackage;
import org.apache.log4j.Logger;
public class log4jclass {
	static Logger log = Logger.getLogger(log4jclass.class);
	public static void main(String[] args) {
		 
	            log.debug("HERE IS AN DEBUG WARNING");
	    	    log.info("THERE IS A INFO MESSAGE");
	    	    log.warn("OOPS! THIS IS AN WARN MESSAGE");
	    	    log.error("DANGEROUS! ERROR!");
	    	    log.fatal("SO DANGEROUS! FATAL ERROR!");
	}
}
