package com.xml.domparser.demo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlDomParser {

	public static void main(String[] args) throws ParserConfigurationException, IOException {
		String file = "Student.xml";
		File xmlFile = new File(file);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dbBuilder;
		
		try{
			dbBuilder = dbFactory.newDocumentBuilder();
			Document doc = dbBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root Element : "+doc.getDocumentElement().getNodeName());
			NodeList nodeList = doc.getElementsByTagName("Student");
			List<Student> stuList = new ArrayList<Student>();
			for(int i=0; i < nodeList.getLength();i++){
				stuList.add(getStudent(nodeList.item(i)));
			}
			for (Student student : stuList) {
                System.out.println(student.toString());
            }
		}
		catch(SAXException e){
			e.getMessage();
		}
	}
	
	private static Student getStudent(Node node){
		Student student = new Student();
		if(node.getNodeType() == Node.ELEMENT_NODE){
			Element element = (Element)node;
			student.setName(getTagValue("name", element));
			student.setRegNo(Integer.parseInt(getTagValue("regNo", element)));
			student.setCourse(getTagValue("course", element));
		}
		return student;
	}
	
	private static String getTagValue(String tag, Element element) {
        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
        Node node = (Node) nodeList.item(0);
        return node.getNodeValue();
    }

}
