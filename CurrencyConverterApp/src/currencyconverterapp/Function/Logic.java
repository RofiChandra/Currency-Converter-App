/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currencyconverterapp.Function;

import currencyconverterapp.Model.ModelProgram;

/**
 *
 * @author DEYA, ROFI, CHRISTIAN
 */
public class Logic {
    float returnRupiah(ModelProgram modelProgram){
		
		return modelProgram.getRupiah();
	}
	
	float returnDollar(ModelProgram modelProgram){
		return modelProgram.getDollar();
	}
	
	float returnEuro(ModelProgram modelProgram){
		return modelProgram.getEuro();
	}
	
	float returnYen(ModelProgram modelProgram){
		return modelProgram.getYen();
	}
	
	float returnsisaDollar(ModelProgram modelProgram){
		return modelProgram.getsisaDollar();
	}
	
	float returnsisaEuro(ModelProgram modelProgram){
		return modelProgram.getsisaEuro();
	}
	
	float returnsisaYen(ModelProgram modelProgram){
		return modelProgram.getsisaYen();
	}
}
