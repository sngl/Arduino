package cc.arduino.packages.discoverers;
import java.util.HashMap;

public class SerialLister {
    
	
    static {
	
        File listComPath = new File(Base.getContentFile("lib"), System.mapLibraryName("listCom"));
    	String listComPath = listComPath.getAbsolutePath();
    	try {
      		System.load(listComPath);
    	} catch (UnsatisfiedLinkError e) {
        e.printStackTrace();
        System.out.println(e.getMessage());
        System.out.println("Cannot load native library " + listComPath);
        System.out.println("The program has terminated!");
        System.exit(1);
    }
    }
    
    
    public native HashMap[] serialPortList();
    
}
