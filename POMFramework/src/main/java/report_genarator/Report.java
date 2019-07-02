/*    */ package report_genarator;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ public class Report
/*    */ {
/*    */   public String _count;
/*    */   public String _class;
/*    */   public String _mothod;
/*    */   public String _time;
/*    */   public String _status;
/*    */   public String _exception;
/* 13 */   public static ArrayList<Report> report = new ArrayList();
/*    */   
/*    */   public Report(String _count, String _class, String _mothod, String _time, String _status, String _exception)
/*    */   {
/* 17 */     this._count = _count;
/* 18 */     this._class = _class;
/* 19 */     this._mothod = _mothod;
/* 20 */     this._time = _time;
/* 21 */     this._status = _status;
/* 22 */     this._exception = _exception;
/*    */   }
/*    */ }


/* Location:              C:\Users\vgunasekaran\Downloads\TestNG-Report-master\TestNG-Report-master\report_ganareter-1.0.jar!\report_genarator\Report.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */