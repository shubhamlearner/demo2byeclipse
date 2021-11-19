package com.codes.pojo;

import java.util.Scanner;

public class Student {
    private String sid;
    private String sname;
    private int sclass;


    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSclass() {
        return sclass;
    }

    public void setSclass(int sclass) {
        this.sclass = sclass;
    }


    public void setStudentDetails(String sid,String sname,int sclass)
    {
        setSid(sid);
        setSclass(sclass);
        setSname(sname);
    }
    public void getStudentDetails()
    {
        System.out.println("Sid:"+getSid());
        System.out.println("Sname:"+getSname());
        System.out.println("Sclass:"+getSclass());
    }
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        Student s1=new Student();
        int cl;
        String name;
        String id;
        System.out.println("Enter sid");
        id=in.next();
        System.out.println("Enter sname");
        name=in.next();
        System.out.println("Enter sclass");
        cl=in.nextInt();
        s1.setStudentDetails(id,name,cl);
        s1.getStudentDetails();
    }
}
