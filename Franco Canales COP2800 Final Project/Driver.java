package application;
import java.io.FileWriter;


public class Driver {
	public static void main(String[] args) {
		SavingAccount s	=new SavingAccount(50,4);
		System.out.println(s.toString());
		s.withDraw(30);
		System.out.println(s.toString());
		s.withDraw(20);
		s.Deposite(20);
		System.out.println(s.toString());
		s.MonthlyProcess();
		System.out.println(s.toString());
		s.withDraw(10);
		s.withDraw(10);
		s.withDraw(10);
		s.withDraw(10);
		System.out.println(s.toString());
		s.MonthlyProcess();
		System.out.println(s.toString());
		
		
		 try{    
	           FileWriter fw=new FileWriter("out.txt");    
	           fw.write(s.toString());    
	           fw.close();
	           System.out.println("File Written!");
	          }catch(Exception e){System.out.println(e);}    
	            
	}
}
