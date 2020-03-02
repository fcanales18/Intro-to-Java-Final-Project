package application;

import javax.swing.JOptionPane;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
	
	SavingAccount s;
	@FXML private TextField tfa;
	@FXML private TextField tfair;
	@FXML private TextField tfw;
	@FXML private TextField tfd;
	@FXML private Label lb;
	@FXML private Label lw;
	@FXML private Label ld;
	@FXML private Label ls;
	@FXML private Label lair;
	@FXML private Label lmsc;

	public void initialize()
	{
		s=null;

	}
	
	@FXML
	public void createAccount()
	{
		if(tfa.getText().isEmpty() || tfair.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(null, "Enter all fields!");
		}
		else
		{
			s = new SavingAccount(Double.parseDouble(tfa.getText()),Double.parseDouble(tfair.getText()));
			
			lb.setText(Double.toString(s.getBalance()));
			lw.setText(Integer.toString(s.getNumberofwithdrawls()));
			ld.setText(Integer.toString(s.getNumberofdeposits_tm()));
			lair.setText(Double.toString(s.getAnnualInterestRate()));
			lmsc.setText(Double.toString(s.getMonthlyServiceCharges()));
		    ls.setText(Boolean.toString(s.status));	
		}
		
	}
	
	
	@FXML
	public void withDraw()
	{
		
		if(tfw.getText().isEmpty() )
		{
			JOptionPane.showMessageDialog(null, "Enter all fields!");
		}
		else
		{
			s.withDraw(Double.parseDouble(tfw.getText()));
			
			lb.setText(Double.toString(s.getBalance()));
			lw.setText(Integer.toString(s.getNumberofwithdrawls()));
			ld.setText(Integer.toString(s.getNumberofdeposits_tm()));
			lair.setText(Double.toString(s.getAnnualInterestRate()));
			lmsc.setText(Double.toString(s.getMonthlyServiceCharges()));
		    ls.setText(Boolean.toString(s.status));	
		}
	}
	

	@FXML
	public void Deposite()
	{
		
		if(tfd.getText().isEmpty() )
		{
			JOptionPane.showMessageDialog(null, "Enter all fields!");
		}
		else
		{
			s.Deposite(Double.parseDouble(tfd.getText()));
			
			lb.setText(Double.toString(s.getBalance()));
			lw.setText(Integer.toString(s.getNumberofwithdrawls()));
			ld.setText(Integer.toString(s.getNumberofdeposits_tm()));
			lair.setText(Double.toString(s.getAnnualInterestRate()));
			lmsc.setText(Double.toString(s.getMonthlyServiceCharges()));
		    ls.setText(Boolean.toString(s.status));	
		}
	}
	
	
	@FXML
	public void MonthlyProcess()
	{
		s.MonthlyProcess();
		
		lb.setText(Double.toString(s.getBalance()));
		lw.setText(Integer.toString(s.getNumberofwithdrawls()));
		ld.setText(Integer.toString(s.getNumberofdeposits_tm()));
		lair.setText(Double.toString(s.getAnnualInterestRate()));
		lmsc.setText(Double.toString(s.getMonthlyServiceCharges()));
	    ls.setText(Boolean.toString(s.status));	
		
	}

}
