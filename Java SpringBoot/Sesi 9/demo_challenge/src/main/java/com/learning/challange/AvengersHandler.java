package com.learning.challange;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class AvengersHandler extends DefaultHandler{
	private List<Avengers> users = new ArrayList<>();
	private Avengers user;
	
	private boolean bfn = false;
	private boolean bln = false;
	
	@Override
	public void startElement(String url, String localName, String qName, Attributes attributes) throws SAXException {
		
		if("user".equals(qName)) {
			user = new Avengers();
			int id = Integer.valueOf(attributes.getValue("id"));
			user.setId(id);
		}
		
		switch(qName) {
		case "firstname":
			bfn = true;
			break;
		case "lastname":
			bln = true;
			break;
		}
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		if (bfn) {
			user.setFirstName(new String(ch, start, length));
			bfn = false;
		}
		if (bln) {
			user.setLastName(new String(ch, start, length));
			bln = false;
		}
	}
	
	@Override
	public void endElement(String url, String localName, String qName) throws SAXException {
		
		if("user".equals(qName)) {
			users.add(user);
		}
	}
	
	public List<Avengers> getUsers() {
		return users;
	} 	
	
}

