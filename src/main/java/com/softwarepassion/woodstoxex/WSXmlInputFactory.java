package com.softwarepassion.woodstoxex;

import org.codehaus.stax2.XMLInputFactory2;

import javax.xml.stream.XMLInputFactory;

/**
 * Created by IntelliJ IDEA.
 * User: kris
 * Date: 15/09/2012
 * Time: 21:29
 */
public class WSXmlInputFactory {

	private static XMLInputFactory2 xmlif2 = null;

	public static XMLInputFactory2 getInputFactoryConfiguredForSpeed() {
		init();
		xmlif2.configureForSpeed();
		return xmlif2;
	}
	public static XMLInputFactory2 getInputFactoryConfiguredForLowMemUsage() {
		init();
		xmlif2.configureForLowMemUsage();
		return xmlif2;
	}
	public static XMLInputFactory2 getInputFactoryConfiguredForXmlConformance() {
		init();
		xmlif2.configureForXmlConformance();
		return xmlif2;
	}
	private static void init(){
		try{
			xmlif2 = (XMLInputFactory2)XMLInputFactory2.newInstance();
			xmlif2.setProperty(XMLInputFactory.IS_REPLACING_ENTITY_REFERENCES,Boolean.FALSE);
			xmlif2.setProperty(XMLInputFactory.IS_SUPPORTING_EXTERNAL_ENTITIES,Boolean.FALSE);
			xmlif2.setProperty(XMLInputFactory.IS_COALESCING,Boolean.FALSE);
			xmlif2.configureForSpeed();
		}catch(Exception ex){ex.printStackTrace();}
	}
}
