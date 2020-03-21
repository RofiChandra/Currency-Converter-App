/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currencyconverterapp.Function;

import currencyconverterapp.MainFrame;
import currencyconverterapp.Model.ModelProgram;

/**
 *
 * @author DEYA, ROFI, CHRISTIAN
 */
public class Logic {
	public String returnRupiah (ModelProgram modelProgram, MainFrame mainFrame){
		return "IDR " + modelProgram.getRupiah();
	}
	
	public String returnDollar (ModelProgram modelProgram, MainFrame mainFrame){
		return "USD " + modelProgram.getDollar();
	}
	
	public String returnEuro (ModelProgram modelProgram, MainFrame mainFrame){
		return "EUR " + modelProgram.getEuro();
	}
	
	public String returnYen (ModelProgram modelProgram, MainFrame mainFrame){
		return "JPY " + modelProgram.getYen();
	}
	
	public String returnsisaDollar (ModelProgram modelProgram, MainFrame mainFrame){
		return "Rp. " + modelProgram.getsisaDollar();
	}
	
	public String returnsisaEuro (ModelProgram modelProgram, MainFrame mainFrame){
		return "Rp. " + modelProgram.getsisaEuro();
	}
	
	public String returnsisaYen (ModelProgram modelProgram, MainFrame mainFrame){
		return "Rp. " + modelProgram.getsisaYen();
	}
}
