/*     */ package report_genarator;
/*     */ 
/*     */ import java.io.File;
/*     */ import java.io.FileWriter;
/*     */ import java.io.IOException;
/*     */ import java.io.PrintStream;
/*     */ import javax.xml.parsers.DocumentBuilder;
/*     */ import javax.xml.parsers.DocumentBuilderFactory;
/*     */ import javax.xml.parsers.ParserConfigurationException;
/*     */ import javax.xml.transform.Transformer;
/*     */ import javax.xml.transform.TransformerException;
/*     */ import javax.xml.transform.TransformerFactory;
/*     */ import javax.xml.transform.dom.DOMSource;
/*     */ import javax.xml.transform.stream.StreamResult;
/*     */ import org.w3c.dom.Document;
/*     */ import org.w3c.dom.Element;
/*     */ import org.w3c.dom.NodeList;
/*     */ import org.xml.sax.SAXException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class XmlWriter
/*     */ {
/*     */   static final String filepathFailedSuit = "Report\\Failed_Test_Suite.xml";
/*     */   static final String filepathJSON = "Report\\data\\datafile.js";
/*     */   
/*     */   public static void FailedSuitWriter(String _class)
/*     */     throws Exception
/*     */   {
/*     */     try
/*     */     {
/*  47 */       DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
/*  48 */       DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
/*  49 */       Document doc = docBuilder.parse("Report\\Failed_Test_Suite.xml");
/*  50 */       doc.normalize();
/*  51 */       Element testcases = null;
/*  52 */       NodeList testSuit = doc.getElementsByTagName("classes");
/*  53 */       testcases = (Element)testSuit.item(0);
/*  54 */       Element testcase = doc.createElement("class");
/*  55 */       testcase.setAttribute("name", _class);
/*  56 */       testcases.appendChild(testcase);
/*  57 */       TransformerFactory transformerFactory = TransformerFactory.newInstance();
/*  58 */       Transformer transformer = transformerFactory.newTransformer();
/*     */       
/*  60 */       transformer.setOutputProperty("method", "xml");
/*  61 */       transformer.setOutputProperty("indent", "yes");
/*  62 */       transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
/*  63 */       transformer.setOutputProperty("omit-xml-declaration", "no");
/*  64 */       StreamResult result = new StreamResult(new File("Report\\Failed_Test_Suite.xml"));
/*  65 */       DOMSource source = new DOMSource(doc);
/*  66 */       transformer.transform(source, result);
/*     */     }
/*     */     catch (ParserConfigurationException pce) {
/*  69 */       pce.printStackTrace();
/*     */     } catch (TransformerException tfe) {
/*  71 */       tfe.printStackTrace();
/*     */     } catch (IOException ioe) {
/*  73 */       ioe.printStackTrace();
/*     */     } catch (SAXException sae) {
/*  75 */       sae.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */   public static void Create() {
/*     */     try {
/*  81 */       File dir = new File("Report");
/*  82 */       dir.mkdirs();
/*  83 */       File dir1 = new File("Report\\data");
/*  84 */       dir1.mkdirs();
/*  85 */       FileWriter fw = new FileWriter("Report\\Failed_Test_Suite.xml");
/*  86 */       fw.write("<?xml version = \"1.0\" encoding = \"UTF-8\"?>\n<!-- <!DOCTYPE suite SYSTEM \"http://testng.org/testng-1.0.dtd\">-->\n<suite name=\"selenium_suit\" verbose=\"10\">\n\t<listeners>\n\t\t<listener class-name=\"report_genarator.Listener\"></listener>\n\t</listeners>\n\t<test name=\"selenium_test\" preserve-order=\"true\"> \n\t\t<classes>\n\t\t</classes>\n\t</test>\n</suite>");
/*  87 */       fw.close();
/*     */     } catch (Exception e) {
/*  89 */       System.out.println(e);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void JSON_report(String report)
/*     */   {
/*     */     try
/*     */     {
/*  97 */       FileWriter fw = new FileWriter("Report\\data\\datafile.js");
/*  98 */       fw.write("var data = " + report + ";");
/*  99 */       fw.close();
/*     */     } catch (Exception e) {
/* 101 */       System.out.println(e);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\vgunasekaran\Downloads\TestNG-Report-master\TestNG-Report-master\report_ganareter-1.0.jar!\report_genarator\XmlWriter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */