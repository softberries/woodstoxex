package com.softwarepassion.woodstoxex.benchmark;

import com.google.caliper.Runner;
import com.google.caliper.SimpleBenchmark;
import com.softwarepassion.woodstoxex.WSXmlInputFactory;
import com.softwarepassion.woodstoxex.WSXmlParser;

/**
 * Created by IntelliJ IDEA.
 * User: kris
 * Date: 15/09/2012
 * Time: 21:34
 */
public class ForXmlConformanceBenchmark extends SimpleBenchmark {

	private static final String FILE_NAME = "/Users/kris/Downloads/dbdump_artistalbumtrack.0.290905586176.xml";

	public void timeXmlParsingConfiguredForSpeed(int reps){
		for (int i = 0; i < reps; i++) {
			new WSXmlParser().parse(FILE_NAME,WSXmlInputFactory.getInputFactoryConfiguredForXmlConformance());
		}
	}
	public static void main(String[] args) throws Exception {
		Runner.main(ForXmlConformanceBenchmark.class, args);
	}
}
