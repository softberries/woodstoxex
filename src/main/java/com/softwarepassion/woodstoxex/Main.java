package com.softwarepassion.woodstoxex;

import com.softwarepassion.woodstoxex.WSXmlParser;

/**
 * Created by IntelliJ IDEA.
 * User: kris
 * Date: 13/09/2012
 * Time: 20:32
 */
public class Main {

	public static void main(String[] art) throws Exception{
		long start = System.currentTimeMillis();
		WSXmlParser parser = new WSXmlParser();
		String fileName = "/Users/kris/Downloads/dbdump_artistalbumtrack.0.290905586176.xml";
		int result = parser.parse(fileName, WSXmlInputFactory.getInputFactoryConfiguredForSpeed());
		long end = System.currentTimeMillis();
		System.out.println("Finished within: " + (end - start) + " processing: " + result + " results.");
	}

}
