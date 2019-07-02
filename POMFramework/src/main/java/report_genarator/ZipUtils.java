/*     */ package report_genarator;
/*     */ 
/*     */ import java.io.File;
/*     */ import java.io.PrintStream;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ZipUtils
/*     */ {
/*     */   private List<String> fileList;
/*  19 */   static String PATH = "Old Reports";
/*  20 */   private static final String OUTPUT_ZIP_FILE = PATH + "/report " + getFileName() + ".zip";
/*     */   private static final String SOURCE_FOLDER = "Report";
/*     */   
/*     */   public ZipUtils() {
/*  24 */     this.fileList = new ArrayList();
/*     */   }
/*     */   
/*     */   static void createDir()
/*     */   {
/*  29 */     File file = new File(PATH);
/*  30 */     if (!file.exists()) {
/*  31 */       file.mkdirs();
/*     */     }
/*     */   }
/*     */   
/*     */   static String getFileName() {
/*  36 */     SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a", Locale.ENGLISH);
/*  37 */     Date currentDate = new Date();
/*  38 */     String filename = format.format(currentDate).replace("/", "-").replace(":", "-");
/*  39 */     return filename;
/*     */   }
/*     */   
/*     */   public static void CreateBackUpReoprt() {
/*  43 */     createDir();
/*  44 */     ZipUtils appZip = new ZipUtils();
/*  45 */     appZip.generateFileList(new File("Report"));
/*  46 */     appZip.zipIt(OUTPUT_ZIP_FILE);
/*  47 */     System.out.println(OUTPUT_ZIP_FILE + " is created......");
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public void zipIt(String zipFile)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: sipush 1024
/*     */     //   3: newarray <illegal type>
/*     */     //   5: astore_2
/*     */     //   6: new 64	java/io/File
/*     */     //   9: dup
/*     */     //   10: ldc 14
/*     */     //   12: invokespecial 66	java/io/File:<init>	(Ljava/lang/String;)V
/*     */     //   15: invokevirtual 136	java/io/File:getName	()Ljava/lang/String;
/*     */     //   18: astore_3
/*     */     //   19: aconst_null
/*     */     //   20: astore 4
/*     */     //   22: aconst_null
/*     */     //   23: astore 5
/*     */     //   25: new 139	java/io/FileOutputStream
/*     */     //   28: dup
/*     */     //   29: aload_1
/*     */     //   30: invokespecial 141	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
/*     */     //   33: astore 4
/*     */     //   35: new 142	java/util/zip/ZipOutputStream
/*     */     //   38: dup
/*     */     //   39: aload 4
/*     */     //   41: invokespecial 144	java/util/zip/ZipOutputStream:<init>	(Ljava/io/OutputStream;)V
/*     */     //   44: astore 5
/*     */     //   46: aconst_null
/*     */     //   47: astore 6
/*     */     //   49: aload_0
/*     */     //   50: getfield 59	report_genarator/ZipUtils:fileList	Ljava/util/List;
/*     */     //   53: invokeinterface 147 1 0
/*     */     //   58: astore 8
/*     */     //   60: goto +130 -> 190
/*     */     //   63: aload 8
/*     */     //   65: invokeinterface 153 1 0
/*     */     //   70: checkcast 26	java/lang/String
/*     */     //   73: astore 7
/*     */     //   75: new 159	java/util/zip/ZipEntry
/*     */     //   78: dup
/*     */     //   79: new 23	java/lang/StringBuilder
/*     */     //   82: dup
/*     */     //   83: aload_3
/*     */     //   84: invokestatic 25	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   87: invokespecial 31	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
/*     */     //   90: getstatic 161	java/io/File:separator	Ljava/lang/String;
/*     */     //   93: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   96: aload 7
/*     */     //   98: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   101: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
/*     */     //   104: invokespecial 164	java/util/zip/ZipEntry:<init>	(Ljava/lang/String;)V
/*     */     //   107: astore 9
/*     */     //   109: aload 5
/*     */     //   111: aload 9
/*     */     //   113: invokevirtual 165	java/util/zip/ZipOutputStream:putNextEntry	(Ljava/util/zip/ZipEntry;)V
/*     */     //   116: new 169	java/io/FileInputStream
/*     */     //   119: dup
/*     */     //   120: new 23	java/lang/StringBuilder
/*     */     //   123: dup
/*     */     //   124: ldc 14
/*     */     //   126: invokespecial 31	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
/*     */     //   129: getstatic 161	java/io/File:separator	Ljava/lang/String;
/*     */     //   132: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   135: aload 7
/*     */     //   137: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   140: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
/*     */     //   143: invokespecial 171	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
/*     */     //   146: astore 6
/*     */     //   148: goto +12 -> 160
/*     */     //   151: aload 5
/*     */     //   153: aload_2
/*     */     //   154: iconst_0
/*     */     //   155: iload 10
/*     */     //   157: invokevirtual 172	java/util/zip/ZipOutputStream:write	([BII)V
/*     */     //   160: aload 6
/*     */     //   162: aload_2
/*     */     //   163: invokevirtual 176	java/io/FileInputStream:read	([B)I
/*     */     //   166: dup
/*     */     //   167: istore 10
/*     */     //   169: ifgt -18 -> 151
/*     */     //   172: goto +13 -> 185
/*     */     //   175: astore 11
/*     */     //   177: aload 6
/*     */     //   179: invokevirtual 180	java/io/FileInputStream:close	()V
/*     */     //   182: aload 11
/*     */     //   184: athrow
/*     */     //   185: aload 6
/*     */     //   187: invokevirtual 180	java/io/FileInputStream:close	()V
/*     */     //   190: aload 8
/*     */     //   192: invokeinterface 183 1 0
/*     */     //   197: ifne -134 -> 63
/*     */     //   200: aload 5
/*     */     //   202: invokevirtual 186	java/util/zip/ZipOutputStream:closeEntry	()V
/*     */     //   205: goto +48 -> 253
/*     */     //   208: astore 6
/*     */     //   210: aload 6
/*     */     //   212: invokevirtual 189	java/io/IOException:printStackTrace	()V
/*     */     //   215: aload 5
/*     */     //   217: invokevirtual 194	java/util/zip/ZipOutputStream:close	()V
/*     */     //   220: goto +48 -> 268
/*     */     //   223: astore 13
/*     */     //   225: aload 13
/*     */     //   227: invokevirtual 189	java/io/IOException:printStackTrace	()V
/*     */     //   230: goto +38 -> 268
/*     */     //   233: astore 12
/*     */     //   235: aload 5
/*     */     //   237: invokevirtual 194	java/util/zip/ZipOutputStream:close	()V
/*     */     //   240: goto +10 -> 250
/*     */     //   243: astore 13
/*     */     //   245: aload 13
/*     */     //   247: invokevirtual 189	java/io/IOException:printStackTrace	()V
/*     */     //   250: aload 12
/*     */     //   252: athrow
/*     */     //   253: aload 5
/*     */     //   255: invokevirtual 194	java/util/zip/ZipOutputStream:close	()V
/*     */     //   258: goto +10 -> 268
/*     */     //   261: astore 13
/*     */     //   263: aload 13
/*     */     //   265: invokevirtual 189	java/io/IOException:printStackTrace	()V
/*     */     //   268: return
/*     */     // Line number table:
/*     */     //   Java source line #51	-> byte code offset #0
/*     */     //   Java source line #52	-> byte code offset #6
/*     */     //   Java source line #53	-> byte code offset #19
/*     */     //   Java source line #54	-> byte code offset #22
/*     */     //   Java source line #56	-> byte code offset #25
/*     */     //   Java source line #57	-> byte code offset #35
/*     */     //   Java source line #58	-> byte code offset #46
/*     */     //   Java source line #60	-> byte code offset #49
/*     */     //   Java source line #61	-> byte code offset #75
/*     */     //   Java source line #62	-> byte code offset #109
/*     */     //   Java source line #64	-> byte code offset #116
/*     */     //   Java source line #66	-> byte code offset #148
/*     */     //   Java source line #67	-> byte code offset #151
/*     */     //   Java source line #66	-> byte code offset #160
/*     */     //   Java source line #69	-> byte code offset #175
/*     */     //   Java source line #70	-> byte code offset #177
/*     */     //   Java source line #71	-> byte code offset #182
/*     */     //   Java source line #70	-> byte code offset #185
/*     */     //   Java source line #60	-> byte code offset #190
/*     */     //   Java source line #74	-> byte code offset #200
/*     */     //   Java source line #76	-> byte code offset #208
/*     */     //   Java source line #77	-> byte code offset #210
/*     */     //   Java source line #80	-> byte code offset #215
/*     */     //   Java source line #81	-> byte code offset #223
/*     */     //   Java source line #82	-> byte code offset #225
/*     */     //   Java source line #78	-> byte code offset #233
/*     */     //   Java source line #80	-> byte code offset #235
/*     */     //   Java source line #81	-> byte code offset #243
/*     */     //   Java source line #82	-> byte code offset #245
/*     */     //   Java source line #84	-> byte code offset #250
/*     */     //   Java source line #80	-> byte code offset #253
/*     */     //   Java source line #81	-> byte code offset #261
/*     */     //   Java source line #82	-> byte code offset #263
/*     */     //   Java source line #85	-> byte code offset #268
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	269	0	this	ZipUtils
/*     */     //   0	269	1	zipFile	String
/*     */     //   5	158	2	buffer	byte[]
/*     */     //   18	66	3	source	String
/*     */     //   20	20	4	fos	java.io.FileOutputStream
/*     */     //   23	231	5	zos	java.util.zip.ZipOutputStream
/*     */     //   47	139	6	in	java.io.FileInputStream
/*     */     //   208	3	6	ex	java.io.IOException
/*     */     //   73	63	7	file	String
/*     */     //   58	133	8	localIterator	java.util.Iterator
/*     */     //   107	5	9	ze	java.util.zip.ZipEntry
/*     */     //   151	5	10	len	int
/*     */     //   167	3	10	len	int
/*     */     //   175	8	11	localObject1	Object
/*     */     //   233	18	12	localObject2	Object
/*     */     //   223	3	13	e	java.io.IOException
/*     */     //   243	3	13	e	java.io.IOException
/*     */     //   261	3	13	e	java.io.IOException
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   116	175	175	finally
/*     */     //   25	205	208	java/io/IOException
/*     */     //   215	220	223	java/io/IOException
/*     */     //   25	215	233	finally
/*     */     //   235	240	243	java/io/IOException
/*     */     //   253	258	261	java/io/IOException
/*     */   }
/*     */   
/*     */   public void generateFileList(File node)
/*     */   {
/*  88 */     if (node.isFile()) {
/*  89 */       this.fileList.add(generateZipEntry(node.toString()));
/*     */     }
/*     */     
/*  92 */     if (node.isDirectory()) {
/*  93 */       String[] subNote = node.list();
/*  94 */       String[] arrayOfString1; int j = (arrayOfString1 = subNote).length; for (int i = 0; i < j; i++) { String filename = arrayOfString1[i];
/*  95 */         generateFileList(new File(node, filename));
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private String generateZipEntry(String file) {
/* 101 */     return file.substring("Report".length() + 1, file.length());
/*     */   }
/*     */ }


/* Location:              C:\Users\vgunasekaran\Downloads\TestNG-Report-master\TestNG-Report-master\report_ganareter-1.0.jar!\report_genarator\ZipUtils.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */