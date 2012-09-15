package com.softwarepassion.woodstoxex.benchmark;

import com.google.caliper.Runner;
import com.google.caliper.SimpleBenchmark;
import com.softwarepassion.woodstoxex.WSXmlInputFactory;
import com.softwarepassion.woodstoxex.WSXmlParser;

/**
 * Created by IntelliJ IDEA.
 * User: kris
 * Date: 15/09/2012
 * Time: 22:11
 */
public class ForLowMemoryBenchmark extends SimpleBenchmark {

	private static final String FILE_NAME = "/Users/kris/Downloads/dbdump_artistalbumtrack.0.290905586176.xml";

	public void timeXmlParsingConfiguredForLowMemUsage(int reps){
		for (int i = 0; i < reps; i++) {
			new WSXmlParser().parse(FILE_NAME,WSXmlInputFactory.getInputFactoryConfiguredForLowMemUsage());
		}
	}
	public static void main(String[] args) throws Exception {
		Runner.main(ForLowMemoryBenchmark.class, args);
	}
}