package com.Spring.took.ProblemCode2;

public class ReportSender {
    public void SendReport(String s){
        if (s.equals("PDF")){
            System.out.println("this is pdf report");
        } else if (s.equals("DOC")) {
            System.out.println("this is doc report");
        } else if (s.equals("EXCEL")) {
            System.out.println("this is excel report");
        }
    }
}
