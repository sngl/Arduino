package cc.arduino.packages.discoverers;
import java.util.HashMap;

import processing.app.Base;

import java.io.File;


public class SerialLister {
    
	
    static {
	
        File listCom = new File(Base.getContentFile("lib"), System.mapLibraryName("listCom"));
    	String listComPath = listCom.getAbsolutePath();
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
