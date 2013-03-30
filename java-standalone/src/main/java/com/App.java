package com;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
*
 */
public class App 
{
    public static void main( String[] args )
    {
        Logger logger = Logger.getLogger(App.class);
        PropertyConfigurator.configure(App.class.getClassLoader().getResource("log4j.properties"));
        logger.info("LOG INFO: App is initialized");

        System.out.println( "Hello World!" );
    }
}
