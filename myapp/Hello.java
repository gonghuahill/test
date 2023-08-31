/**  
 * 读取当前目录下的文件路径  
 *    
 * @author   
 * @since jdk1.4.2  
 * @version 1.0  
 * @date 2007-06-30  
 *  modifed by gonghua to add last modified date   
 *   modified by gonghua to add log according the action
 */  
import java.lang.*;
import java.io.*;
import java.util.*;
import   java.text.*  ;

public class  Hello {   
	String dd=null;
           
    public static void main(String[] args) {   
	    System.out.println("Args number :"+args.length);
	   if (args.length< 4) {
		   Hello h=new Hello("Hello World !");
		   h.print();
        	System.out.println(" Hello world2 !");   
	   }
    }
    public Hello (String d) {
	   this.dd=d;
    }
     public void  print() {
        	System.out.println(dd);   
     }

}   
