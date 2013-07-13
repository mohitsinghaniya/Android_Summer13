package com.iitg.sciencereferences;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Phy_Chem extends Activity {

	EditText tvconst;
	
	String constants = "<h2> <br> Constants </h2>"
		+ "<br><br><font color=#808080><b> Speed of light (c) : </font><b><br> 2.99792458 x 10<sup>8</sup> m/s </b>"
		+ "<br><br><font color=#808080><b> Planck constant (h) : </font><b><br> 6.6260755 x 10<sup>-34</sup> J.s <br> 4.1356692 x 10<sup>-15</sup> eV.s </b> "
		+ "<br><br><font color=#808080><b> Coulomb constant (K = 1/4πε<sub>o</sub>) : </font><b> 8.987552 x 10<sup>9</sup> N.m<sup>2</sup>/C<sup>2</sup> </b>"
		+ "<br><br><font color=#808080><b> Planck hbar (ħ) : </font><b><br> 1.0545727 x 10<sup>-34</sup> J.s <br> 6.582121 x 10<sup>-16</sup> eV.s </b>"
		+ "<br><br><font color=#808080><b> Gravitation constant (G) : </font><b><br> 6.67259 x 10<sup>-11</sup> m<sup>3</sup>.kg<sup>-1</sup>.s<sup>-2</sup></b> "
		+ "<br><br><font color=#808080><b> Boltzmann constant (k) : </font><b><br> 1.380658 x 10<sup>-23</sup> J/K  <br> 8.617385 x 10<sup>-5</sup>eV/K  </b>"
		+ "<br><br><font color=#808080><b> Molar gas constant (R) : </font><b><br> 8.314510 J/mol.K </b>"
		+ "<br><br><font color=#808080><b> Avogadro's number (N<sub>A</sub>) : </font><b><br> 6.0221 x 10<sup>23</sup> mol<sup>-1</sup> </b> "
		+ "<br><br><font color=#808080><b> Charge of electron (e) : </font><b> 1.60217733 x 10<sup>-19</sup> C </b>"
		+ "<br><br><font color=#808080><b> Permeability of vacuum (μ<sub>o</sub>) : </font><b><br> 4π x 10<sup>-7</sup> N/A² </b>"
		+ "<br><br><font color=#808080><b> Permittivity of vacuum (ε<sub>o</sub>) : </font><b> 8.854187817 x 10<sup>-12</sup> F/m </b> "
		+ "<br><br><font color=#808080><b> Faraday constant (F) : </font><b><br> 96485.309 C/mol </b>"
		+ "<br><br><font color=#808080><b> Mass of electron (m<sub>e</sub>) : </font><b><br> 9.1093897 x 10<sup>-31</sup>kg <br> 0.51099906 MeV/c² </b>"
		+ "<br><br><font color=#808080><b> Mass of proton (m<sub>p</sub>) : </font><b><br> 1.6726231 x 10<sup>-27</sup>kg <br> 938.27231 MeV/c² </b> "
		+ "<br><br><font color=#808080><b> Mass of neutron (m<sub>n</sub>) : </font><b><br> 1.6749286 x 10<sup>-27</sup>kg <br> 939.56563 MeV/c² </b>"
		+ "<br><br><font color=#808080><b> Atomic mass unit (u) : </font><b><br> 1.6605402 x 10<sup>-27</sup>kg <br> 931.49432 MeV/c² </b>"
		+ "<br><br><font color=#808080><b> Stefan-Boltzmann constant (σ) : </font><b> 5.67051 x 10<sup>-8</sup>W/m².K<sup>4</sup> </b> "
		+ "<br><br><font color=#808080><b> Rydberg constant (R<sub>∞</sub>) : </font><b> 10973731.534 m<sup>-1</sup> </b>"
		+ "<br><br><font color=#808080><b> Bohr magneton (μ<sub>B</sub>) : </font><b><br> 9.2740154 x 10<sup>-24</sup>J/T  <br> 5.788382 x 10<sup>-5</sup>eV/T </b>"
		+ "<br><br><font color=#808080><b> Flux quantum (Φ<sub>o</sub>) : </font><b><br> 2.067834 x 10<sup>-15</sup>T/m² </b> "
		+ "<br><br><font color=#808080><b> Bohr radius (a<sub>o</sub>) : </font><b><br> 0.529177249 x 10<sup>-10</sup>m </b>"
		+ "<br><br><font color=#808080><b> Standard atmosphere (atm) : </font><b> 101325 Pa </b>"
		+ "<br><br><font color=#808080><b> Wien displacement constant (b) : </font><b> 2.897756 x 10<sup>-3</sup>m.K </b> " ;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_phy__chem);
		tvconst = (EditText)findViewById(R.id.tvconst);
		
		tvconst.setText(Html.fromHtml(constants));
	}
}



