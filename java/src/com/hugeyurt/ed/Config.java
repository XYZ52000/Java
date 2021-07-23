package com.hugeyurt.ed;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Config
{
	public static String driver;
	public static String url;
	public static String user;
	public static String pwd;
	
	static
    {
   	 try{
		    String path=Config.class.getClassLoader().getResource("").toString().substring(6);
		    path=path+"database.properties";
	        System.out.println(path);
	        Properties p = new Properties();
		  	p.load(new FileInputStream(new File(path)));
		  	Config.url=p.getProperty("url");
		  	Config.user=p.getProperty("user");
		  	Config.pwd=p.getProperty("pwd");
		  	Config.driver=p.getProperty("driver");
		  
		  	
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
    }

}
