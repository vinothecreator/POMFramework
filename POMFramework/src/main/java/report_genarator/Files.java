/*     */ package report_genarator;
/*     */ 
/*     */ import java.io.BufferedReader;
/*     */ import java.io.BufferedWriter;
/*     */ import java.io.File;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.FileWriter;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.InputStreamReader;
/*     */ import java.io.OutputStream;
/*     */ import java.io.PrintStream;
/*     */ import java.net.URL;
/*     */ import java.util.Properties;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Files
/*     */ {
/*     */   public void pushpendra()
/*     */     throws IOException
/*     */   {
/*  25 */     OutputStream os = null;
/*  26 */     Properties prop1 = new Properties();
/*  27 */     prop1.setProperty("name", "java2novice");
/*     */     try {
/*  29 */       os = new FileOutputStream("MyProp.properties");
/*  30 */       prop1.store(os, "Dynamic Property File");
/*     */     } catch (FileNotFoundException e) {
/*  32 */       e.printStackTrace();
/*     */     } }
/*     */   
/*  35 */   Properties prop = new Properties();
/*     */   
/*     */   public void writeFile()
/*     */     throws IOException, PropertiesFileNotFound
/*     */   {
/*  40 */     getProperties();
/*  41 */     readFromJARFile("Chart.min.js", "Report//data//Chart.min.js");
/*  42 */     readFromJARFile("Chart.PieceLabel.js", "Report//data//Chart.PieceLabel.js");
/*  43 */     readFromJARFile("report.css", "Report//data//report.css");
/*  44 */     readFromJARFile("report.js", "Report//data//report.js");
/*  45 */     readFromJARFile("sortable.css", "Report//data//sortable.css");
/*  46 */     readFromJARFile("sortable.js", "Report//data//sortable.js");
/*  47 */     readFromJARFile("Report.html", "Report//Report.html");
/*  48 */     writeStyle();
/*     */   }
/*     */   
/*     */   public void readFromJARFile(String filename, String dest) throws IOException {
/*  52 */     InputStream is = getClass().getResourceAsStream(filename);
/*  53 */     InputStreamReader isr = new InputStreamReader(is);
/*  54 */     BufferedReader br = new BufferedReader(isr);
/*  55 */     File f = new File(dest);
/*  56 */     FileWriter fr = new FileWriter(f);
/*  57 */     BufferedWriter writer = new BufferedWriter(fr);
/*     */     String line;
/*  59 */     while ((line = br.readLine()) != null) { 
	        
/*  60 */       writer.write(line);
/*     */     }
/*  62 */     br.close();
/*  63 */     writer.close();
/*  64 */     isr.close();
/*  65 */     fr.close();
/*  66 */     is.close();
/*     */   }
/*     */   
/*     */   public void getProperties()
/*     */   {
/*     */     try {
/*  72 */       URL url = ClassLoader.getSystemResource("report.properties");
/*  73 */       this.prop.load(url.openStream());
/*     */     } catch (Exception e) {
/*     */       try {
/*  76 */         writeProperties();
/*  77 */         throw new PropertiesFileNotFound("Properties File Not Found in Source location\nPlease download from https://www.javatpoint.com/jsoup-example-print-links-of-an-url , customize and add in source folder");
/*     */       } catch (Exception e1) {
/*  79 */         e1.printStackTrace();
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void writeProperties() throws IOException
/*     */   {
/*  86 */     this.prop.setProperty("background-color", "white");
/*  87 */     this.prop.setProperty("report-title-background", "white");
/*  88 */     this.prop.setProperty("report-title", "Selenium Testing Result");
/*  89 */     this.prop.setProperty("title-fontsize", "50px");
/*  90 */     this.prop.setProperty("title-color", "black");
/*  91 */     this.prop.setProperty("footer-background", "white");
/*  92 */     this.prop.setProperty("footer-text", "@testNG");
/*  93 */     this.prop.setProperty("footer-fontsize", "20px");
/*  94 */     this.prop.setProperty("footer-color", "black");
/*     */   }
/*     */   
/*     */   public void writeStyle() throws IOException
/*     */   {
/*     */     try {
/* 100 */       FileWriter fw = new FileWriter("Report//data//reportStyle.js");
/* 101 */       fw.write("document.getElementById('main_table').style.backgroundColor = '" + this.prop.getProperty("background-color") + "';document.getElementById('AplicationDetails').style.backgroundColor = '" + this.prop.getProperty("report-title-background") + "';document.getElementById('AplicationDetails').innerHTML = '" + this.prop.getProperty("report-title") + "';document.getElementById('AplicationDetails').style.fontSize = '" + this.prop.getProperty("title-fontsize") + "';document.getElementById('AplicationDetails').style.color = '" + this.prop.getProperty("title-color") + "';document.getElementById('footer').style.backgroundColor = '" + this.prop.getProperty("footer-background") + "';document.getElementById('footer').innerHTML = '" + this.prop.getProperty("footer-text") + "';document.getElementById('footer').style.fontSize = '" + this.prop.getProperty("footer-fontsize") + "';document.getElementById('footer').style.color = '" + this.prop.getProperty("footer-color") + "';");
/* 102 */       fw.close();
/*     */     } catch (Exception e) {
/* 104 */       System.out.println(e);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\vgunasekaran\Downloads\TestNG-Report-master\TestNG-Report-master\report_ganareter-1.0.jar!\report_genarator\Files.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */