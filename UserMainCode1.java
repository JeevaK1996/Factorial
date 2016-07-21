# Factorial
import java.io.*;
import  java.util.*;

class UserMainCode1
{
		public static void main(String []args){
			UserMainCode1 code=new UserMainCode1();
			code.nFactorial(91);
		}
    public static long output1;
	    
		
    public static void nFactorial(int input1){
        //Write code here
    	int fact=1;
    	for(int i=1;i<=input1;i++){
    		fact=fact*i;
    	}
    	output1=fact;
    	System.out.println(output1);
    }	
}
