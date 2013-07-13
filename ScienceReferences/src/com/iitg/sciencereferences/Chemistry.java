package com.iitg.sciencereferences;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class Chemistry extends Activity {

	Button batomic, bequilibrium, btk, bgls, bore;
	
	String satomic ="<br><h2> Atomic Structure </h2>" + 
					"<br><font color=#808080><b> <i>Formula</i></b><b><br><br>1.Photon Energy : </font><b> E = hf </b> " +
					"<br><br><font color=#808080><b> 2.Speed of Light = Wavelength times freq : </font><b> c = λf </b>" +
					"<br><br><font color=#808080><b> 3.Wavelength of a Mass : </font><b> λ = h/mv </b>" +
					"<br><br><font color=#808080><b> 4.Momentum : </font><b> p = mv </b>" +
					"<br><br><font color=#808080><b> 5.Energy at principle quantum no : </font><b> E = -2.178E<sup>-18</sup>/n²</b>";
	
	String sequilibrium = "<br><h2> Equilibrium </h2>" + 
				"<br><font color=#808080><b> <i>Formula</i></b><b><br><br>1.Acid equilibrium constant : </font><b><br> Ka = [H+][A-]/[HA] </b> " +
				"<br><br><font color=#808080><b> 2.Water constant from hydroxide and cydrogen concentrations : </font><b><br> Kb = [OH-][HB+]/[B] </b>" +
				"<br><br><font color=#808080><b> 3.Wavelength of a mass : </font><b><br> Kw = [OH-][H+] </b>" +
				"<br><br><font color=#808080><b> 4.Acid and base constants relationship : </font><b> Kw = Ka x Kb </b>" +
				"<br><br><font color=#808080><b> 5.pH from hydrogen ion concentration : </font><b> pH = -log[H+] </b>" +
				"<br><br><font color=#808080><b> 6.pOH from hydrogen concentration : </font><b> pOH = -log[OH-] </b>" +
				"<br><br><font color=#808080><b> 7.Relationship of pH and pOH : </font><b><br> 14 = pH + pOH </b>" +
				"<br><br><font color=#808080><b> 8.pH of buffer solution : </font><b><br> pH = pKa + log([A-]/[HA]) </b>" +
				"<br><br><font color=#808080><b> 9.pOH of buffer solution : </font><b><br> pOH = pKb + log([HB+]/[B]) </b>" +
				"<br><br><font color=#808080><b> 10.Acid ionization constant : </font><b><br>  pKa = -log(Ka) </b>" +
				"<br><br><font color=#808080><b> 11.Base ionization constant : </font><b><br>  pKb = -log(Kb) </b>" +
				"<br><br><font color=#808080><b> 12.Comaprison of gaseous and molar concentration constants : </font><b><br>  K = Kc(RT)ⁿ </b>" ;
	
	String stk = "<br><h4> Thermochemistry, Kinetics </h4>" + 
				"<br><font color=#808080><b> <i>Formula</i></b><b><br><br>1.Gibb's free energy : </font><b><br> ΔG˚ = ΔH˚ - TΔS˚ <br> ΔG˚ = -RT x lnK <br> ΔG˚ = -nFE˚ </b> " +
				"<br><br><font color=#808080><b> 2.Heat transfer : </font><b> q = mcΔT </b>" +
				"<br><br><font color=#808080><b> 3.Entropy change non-standard conditions : </font><b> ΔG = ΔG˚ + RTlnQ </b>" +
				"<br><br><font color=#808080><b> 4.Molar heat capacity at constant pressure : </font><b> C = ΔH/ΔT </b>" +
				"<br><br><font color=#808080><b> 5.First order rate expression : </font><b><br> ln[A] - ln[A]<sub>o</sub> = -kt </b>" +
				"<br><br><font color=#808080><b> 6.Second order rate expression : </font><b><br> 1/ln[A] - 1/ln[A]<sub>o</sub>  = kt </b>" +
				"<br><br><font color=#808080><b> 7.Rate constant formula : </font><b><br> lnk = -Ea/(RT) +lnA </b>";
		
	
	
	String sgls="<br><h4> Gases, Liquids and Sols </h4>" + 
				"<br><font color=#808080><b> <i>Formula</i></b><b><br><br>1.Ideal gas law : </font><b> PV = nRT </b> " +
				"<br><br><font color=#808080><b> 2.Dalton's law of partial pressure : </font><b> P = P<sub>T</sub> x X </b>" +
				"<br><br><font color=#808080><b> 3.Moles = mass/Molar mass : </font><b><br> n = m/M </b>" +
				"<br><br><font color=#808080><b> 4.Boyle's law : </font><b> P<sub>1</sub>V<sub>1</sub> = P<sub>2</sub>V<sub>2</sub>  </b>" +
				"<br><br><font color=#808080><b> 5.Pressure-Temperature relation : </font><b> P<sub>1</sub>/T<sub>1</sub> = P<sub>2</sub>/T<sub>2</sub> </b> " +
				"<br><br><font color=#808080><b> 6.Charles' law : </font><b> V<sub>1</sub>/T<sub>1</sub> = V<sub>2</sub>/T<sub>2</sub> </b>" +
				"<br><br><font color=#808080><b> 7.Combined gas law : </font><b><br> P<sub>1</sub>V<sub>1</sub>/T<sub>1</sub> = P<sub>2</sub>V<sub>2</sub>/T<sub>2</sub>  </b>" +
				"<br><br><font color=#808080><b> 8.Density : </font><b> D = m/V </b>" +
				"<br><br><font color=#808080><b> 9.Root mean square velocity : </font><b><br> v = √(3RT/M) & v = √(3kT/M)  </b>" +
				"<br><br><font color=#808080><b> 10.Kinetic energy : </font><b><br> KE = 1/2mv² & KE = 3/2RT </b>" +
				"<br><br><font color=#808080><b> 11.Graham's law of effusion : </font><b><br> r<sub>1</sub>/r<sub>2</sub> = √(M<sub>2</sub>/M<sub>1</sub>) </b>" +
				"<br><br><font color=#808080><b> 12.Freezing point depression : </font><b><br> ΔT = iKf x molality </b>" +
				"<br><br><font color=#808080><b> 13.Boiling point evaluation : </font><b><br> ΔT = iKb x molality </b>" +
				"<br><br><font color=#808080><b> 14.Osmotic pressure : </font><b> π = iMRT </b>" ;
	
	String sore="<br><h4> Oxidation-Reduction Electrochemistry </h4>" + 
			"<br><font color=#808080><b> <i>Formula</i></b><b><br><br>1.Current : </font><b> I = q/t </b> " +
			"<br><br><font color=#808080><b> 2.E(cell) as a fn of concentrations : </font><b><br>  E = E˚-RTlnQ/(nF) </b>" +
			"<br><br><font color=#808080><b> 3.Equilibrium constant : </font><b><br> logK = nE˚/0.0592 </b>";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chemistry);
		initialise();
	}

	public void whenClick(View v){
		switch(v.getId()){
		case R.id.batomic:
			Intent iatomic = new Intent(this,List.class);
			Bundle passlist = new Bundle();
			passlist.putString("0", satomic);
			passlist.putString("1", "Chemistry");
			passlist.putString("2", "0");
			iatomic.putExtras(passlist);
			finish();
			startActivity(iatomic);
			break;
			
		case R.id.bequilibrium:
			Intent equil = new Intent(this,List.class);
			Bundle passtoolist = new Bundle();
			passtoolist.putString("0", sequilibrium);
			passtoolist.putString("1", "Chemistry");
			passtoolist.putString("2", "1");
			equil.putExtras(passtoolist);
			finish();
			startActivity(equil);
			break;
			
		case R.id.btk:
			Intent tk = new Intent(this,List.class);
			Bundle passtwolist = new Bundle();
			passtwolist.putString("0", stk);
			passtwolist.putString("1", "Chemistry");
			passtwolist.putString("2", "2");
			tk.putExtras(passtwolist);
			finish();
			startActivity(tk);
			break;
			
		case R.id.bgls:
			Intent gls = new Intent(this,List.class);
			Bundle pass2list = new Bundle();
			pass2list.putString("0", sgls);
			pass2list.putString("1", "Chemistry");
			pass2list.putString("2", "3");
			gls.putExtras(pass2list);
			finish();
			startActivity(gls);
			break;
			
		case R.id.bore:
			Intent ore = new Intent(this,List.class);
			Bundle passtolist = new Bundle();
			passtolist.putString("0", sore);
			passtolist.putString("1", "Chemistry");
			passtolist.putString("2", "4");
			ore.putExtras(passtolist);
			finish();
			startActivity(ore);
			break;
		}
	}
	
	private void initialise() {
		batomic = (Button)findViewById(R.id.batomic);
		bequilibrium = (Button)findViewById(R.id.bequilibrium);
		btk = (Button)findViewById(R.id.btk);
		bgls = (Button)findViewById(R.id.bgls);
		bore = (Button)findViewById(R.id.bore);
		
	}
}
