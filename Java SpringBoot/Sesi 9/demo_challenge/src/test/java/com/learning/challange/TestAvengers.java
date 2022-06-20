package com.learning.challange;

import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;

public class TestAvengers {
	
	@Test
	public void parseOnePiece() throws ParserConfigurationException {

		//untuk definisiin
		AvengerParser parser = new AvengerParser();
		List<Avengers> lines = parser.parseUsers();
		lines.forEach(System.out::println);
	}
}
