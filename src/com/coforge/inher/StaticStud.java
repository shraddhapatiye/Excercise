package com.coforge.inher;

public class StaticStud {
	
	   static String trainer;
	    static String company="Coforge";
	    String name;
	    String laptopModel;
	    long mobile;
	    static {
	        System.out.println("welcome");
	    }
	    static {
	        trainer = "Priya";
	        System.out.println("static block -1");
	    }
	    public StaticStud(String name, String laptopModel, long mobile) {
	        super();
	        this.name = name;
	        this.laptopModel = laptopModel;
	        this.mobile = mobile;
	    }

	 

	    static void greet() {
	        System.out.println("Great day");
	        System.out.println(trainer+" "+company);
	    }
	    void show() {
	        System.out.println(name+" "+laptopModel+"  "+mobile);
	        System.out.println(trainer+" "+company);
	        
	    }
	    public static void main(String[] args) {
	        System.out.println("main");
	        System.out.println(trainer);
	        greet();
	        StaticStud st = new StaticStud("Ram","A123",986219237);
	        st.show();

	 

	        
	    }

	 

	}