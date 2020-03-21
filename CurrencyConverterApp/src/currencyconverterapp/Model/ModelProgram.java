/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currencyconverterapp.Model;

import currencyconverterapp.MainFrame;

/**
 *
 * @author DEYA, ROFI, CHRISTIAN
 */
public class ModelProgram {

	float rupiah, dollar, euro, yen, sisaDollar, sisaEuro, sisaYen;

	public void setRupiah(float rupiah, ModelProgram modelProgram, MainFrame mainFrame) {
		float returnRupiah = Float.parseFloat(mainFrame.tf_rupiah.getText());
		this.rupiah = rupiah;
	}

	public float getRupiah() {
		return rupiah;
	}

	public void setDollar(float dollar, ModelProgram modelProgram, MainFrame mainFrame) {
		float returnDollar = Float.parseFloat(mainFrame.tf_dollar.getText());
		float hitungdollar = (float) (rupiah * 0.000063);
		this.dollar = dollar;
	}

	public float getDollar() {
		return dollar;
	}

	public void setEuro(float euro, ModelProgram modelProgram, MainFrame mainFrame) {
		float returnEuro = Float.parseFloat(mainFrame.tf_euro.getText());
		float hitungeuro = (float) (rupiah * 0.000059);
		this.euro = euro;
	}

	public float getEuro() {
		return euro;
	}

	public void setYen(float yen, ModelProgram modelProgram, MainFrame mainFrame) {
		float returnYen = Float.parseFloat(mainFrame.tf_yen.getText());
		float hitungyen = (float) (rupiah * 0.0069);
		this.yen = yen;
	}

	public float getYen() {
		return yen;
	}

	public void setsisaDollar(float sisaDollar, ModelProgram modelProgram, MainFrame mainFrame) {
		//BELUM DIBUAT DI MAINFRAME
		this.sisaDollar = sisaDollar;
	}

	public float getsisaDollar() {
		return sisaDollar;
	}

	public void setsisaEuro(float sisaEuro, ModelProgram modelProgram, MainFrame mainFrame) {
		//BELUM DIBUAT DI MAINFRAME
		this.sisaEuro = sisaEuro;
	}

	public float getsisaEuro() {
		return sisaEuro;
	}

	public void setsisaYen(float sisaYen, ModelProgram modelProgram, MainFrame mainFrame) {
		//BELUM DIBUAT DI MAINFRAME
		this.sisaYen = sisaYen;
	}

	public float getsisaYen() {
		return sisaYen;
	}
}
