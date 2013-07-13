package com.iitg.sciencereferences;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Physics extends Activity {

	Button bnm, beam, bfm, btp, baanp, bwao, bgat;

	String snewton = "<br><h2> Newtonian Mechanics </h2>"
			+ "<br><font color=#808080><b> <i>Formula</i></b><b><br><br>1.Linear Motion : </font><b><br> v = v<sub>o</sub> + at <br> Δx = v<sub>o</sub>t + 1/2at² <br> v² = v²<sub>o</sub> + 2aΔx</b> "
			+ "<br><br><font color=#808080><b> 2.Newton's 2nd law : </font><b> F = ma </b>"
			+ "<br><br><font color=#808080><b> 3.Force of friction : </font><b> F(fric) ≤ µN </b>"
			+ "<br><br><font color=#808080><b> 4.Centripetal acceleration : </font><b><br> a = v²/r </b>"
			+ "<br><br><font color=#808080><b> 5.Centripetal force : </font><b> F = mv²/r </b>"
			+ "<br><br><font color=#808080><b> 6.Torque : </font><b> T = rF  </b>"
			+ "<br><br><font color=#808080><b> 7.Momentum : </font><b> p = mv </b>"
			+ "<br><br><font color=#808080><b> 8.Impulse : </font><b> J = FΔt </b>"
			+ "<br><br><font color=#808080><b> 9.Kinetic energy : </font><b> KE = 1/2 mv² </b>"
			+ "<br><br><font color=#808080><b> 10.Potential energy (Gravitational) : </font><b> ΔU = mgh  </b>"
			+ "<br><br><font color=#808080><b> 11.Work = Force x Displacement : </font><b><br> W = FΔx </b>"
			+ "<br><br><font color=#808080><b> 12.Power = Work/Time : </font><b> P = W/Δt </b>"
			+ "<br><br><font color=#808080><b> 13.Power = Force x Velocity (Gravitational) : </font><b> P = Fv </b>"
			+ "<br><br><font color=#808080><b> 14.Force (Spring) : </font><b> F = -kx </b>"
			+ "<br><br><font color=#808080><b> 15.Potential energy (Spring) : </font><b><br> U = 1/2 kx² </b>"
			+ "<br><br><font color=#808080><b> 16.Period of spring system : </font><b><br> T = 2π x √(m/k) </b>"
			+ "<br><br><font color=#808080><b> 17.Period of pendulum : </font><b><br> T = 2π x √(l/g) </b>"
			+ "<br><br><font color=#808080><b> 18.Period = 1/Frequency : </font><b> T = 1/f </b>"
			+ "<br><br><font color=#808080><b> 19.Universal gravitational (Force) : </font><b><br> F = (Gm<sub>1</sub>m<sub>2</sub>)/r² </b>"
			+ "<br><br><font color=#808080><b> 20.Universal gravitational (Potential energy) : </font><b><br> U = (Gm<sub>1</sub>m<sub>2</sub>)/r </b>";
	
	String seam =  "<br><h2> Electricity and Magnetism </h2>"
			+ "<br><br><font color=#808080><b> <i>Formula</i></b><b><br><br>1.Coulomb's law (force) : </font><b><br> F = (kq<sub>1</sub>q<sub>2</sub>)/r² </b>" 
			+ "<br><br><font color=#808080><b> 2.Coulomb's law (potential energy) : </font><b> U = (kq<sub>1</sub>q<sub>2</sub>)/r </b> "
			+ "<br><br><font color=#808080><b> 3.Potential energy (point charge) : </font><b> U = qV </b>"
			+ "<br><br><font color=#808080><b> 4.Electric Field : </font><b> E = F/q </b>" 
			+ "<br><br><font color=#808080><b> 5.Elec. field = Voltage/Distance : </font><b><br> E = V/d </b> "
			+ "<br><br><font color=#808080><b> 6.Capacitance : </font><b><br> C = Q/V <br> (ε<sub>o</sub>A)/d </b>"
			+ "<br><br><font color=#808080><b> 7.Potential energy (capacitor) : </font><b><br> U = 1/2 QV <br> U = 1/2 CV² </b>" 
			+ "<br><br><font color=#808080><b> 8.Current : </font><b> I = ΔQ/Δt </b> "
			+ "<br><br><font color=#808080><b> 9.Resistance of a wire : </font><b> R = (ρL)/A </b>"
			+ "<br><br><font color=#808080><b> 10.Ohm's law : </font><b> V = IR </b>" 
			+ "<br><br><font color=#808080><b> 11.Electric power : </font><b> P = IV </b> "
			+ "<br><br><font color=#808080><b> 12.Force of magnetic field on moving charge : </font><b> F = qvB </b>"
			+ "<br><br><font color=#808080><b> 13.Force (wire) : </font><b> F = BIL </b>" 
			+ "<br><br><font color=#808080><b> 14.Magnetic field around wire : </font><b><br> B = (μ<sub>o</sub>I)/(2πr) </b> "
			+ "<br><br><font color=#808080><b> 15.Magnetic flux : </font><b> = BA </b>"
			+ "<br><br><font color=#808080><b> 16.Induced voltage : </font><b><br> ε = Δ/Δt <br> ε = BLv  </b>" ;
	
	String sfm = "<br><h2> Fluid mechanics </h2>"
			+ "<br><br><font color=#808080><b> <i>Formula</i></b><b><br><br>1.Density : </font><b> ρ = m/V </b>"
			+ "<br><br><font color=#808080><b> 2.Pressure at a Depth : </font><b><br> P = P<sub>o</sub> + ρgh </b> "
			+ "<br><br><font color=#808080><b> 3.Buoyant force : </font><b> F = ρVg </b>"
			+ "<br><br><font color=#808080><b> 4.Continuity equation : </font><b><br> A<sub>1</sub>v<sub>1</sub> = A<sub>2</sub>v<sub>2</sub> </b>"
			+ "<br><br><font color=#808080><b> 5.Pressure = Force/Area : </font><b> P = F/A </b> "
			+ "<br><br><font color=#808080><b> 6.Ideal gas law : </font><b> PV = nRT </b>";
	
	String stp =  "<br><h2> Thermal physics </h2>"
			+ "<br><br><font color=#808080><b> <i>Formula</i></b><b><br><br>1.Thermal expansion (linear) : </font><b><br> ΔL = L<sub>o</sub>ΔT </b>"
			+ "<br><br><font color=#808080><b> 2.Heat transfer : </font><b> H = kAΔT/L </b> "
			+ "<br><br><font color=#808080><b> 3.Work (on a system) : </font><b> W = -PΔV </b>"
			+ "<br><br><font color=#808080><b> 4.First law of thermodynamics : </font><b><br> ΔU = Q + W </b>"
			+ "<br><br><font color=#808080><b> 5.Kinetic energy : </font><b> KE = 3/2 kT </b> "
			+ "<br><br><font color=#808080><b> 6.Root mean square velocity : </font><b><br> v = √([3RT]/M) <br> v = √([3kT]/μ) </b>"
			+ "<br><br><font color=#808080><b> 7.Efficiency : </font><b><br> e = |w/Q| <br> e = (Th - Tc)/Th </b> ";

	String saanp = "<br><h2> Atomic and nuclear physics </h2>"
			+ "<br><br><font color=#808080><b> <i>Formula</i></b><b><br><br>1.Energy of light : </font><b> E = hf </b>"
			+ "<br><br><font color=#808080><b> 2.de Broglie matter (energy) : </font><b><br> E = pc </b> "
			+ "<br><br><font color=#808080><b> 3.Kinetic energy of a photon : </font><b><br> KE = hf - Φ </b>"
			+ "<br><br><font color=#808080><b> 4.de Broglie matter (wavelength) : </font><b> λ = h/p </b>"	
			+ "<br><br><font color=#808080><b> 5.Energy realeased by nuclear reaction : </font><b> ΔE = (Δm)c<sup>2</sup> </b> ";
	
	String sgat = "<br><h2> Geometry and Trignometry </h2>"
			+ "<br><br><font color=#808080><b> <i>Formula</i></b><b><br><br>1.sinΘ : </font><b> O/H </b>"
			+ "<br><br><font color=#808080><b> 2.cosΘ : </font><b> A/H </b> "
			+ "<br><br><font color=#808080><b> 3.tanΘ : </font><b> O/A </b>"
			+ "<br><br><font color=#808080><b> 4.Pythagorean theorem : </font><b><br> A<sup>2</sup> + B<sup>2</sup> = C<sup>2</sup></b>";

	String swao = "<br><h2> Wave and Optics </h2>"
			+ "<br><br><font color=#808080><b> <i>Formula</i></b><b><br><br>1.Wave Velocity : </font><b> V = fλ </b>"
			+ "<br><br><font color=#808080><b> 2.Index of refraction: </font><b> n = c/v </b> "
			+ "<br><br><font color=#808080><b> 3.Snell's law : </font><b> n<sub>1</sub>sinΘ<sub>1</sub> = n<sub>2</sub>sinΘ<sub>2</sub></b>"
			+ "<br><br><font color=#808080><b> 4.Critical angle : </font><b> n<sub>2</sub>/n<sub>1</sub> </b>"
			+ "<br><br><font color=#808080><b> 5.Focal length : </font><b> 1/si + 1/so = 1/f </b> "
			+ "<br><br><font color=#808080><b> 6.Magnification : </font><b><br> M = h<sub>i</sub>/h<sub>o</sub> <br> M = -s<sub>i</sub>/s<sub>o</sub> </b>"
			+ "<br><br><font color=#808080><b> 7.Focal length : </font><b> f = R/2 </b>"
			+ "<br><br><font color=#808080><b> 8.Diffraction grating : </font><b> dsinΘ = mλ </b> "
			+ "<br><br><font color=#808080><b> 9.Double slit formula : </font><b> x = mλL/d </b> ";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_physics);
		initialise();

	}

	public void whenClick(View v) {
		switch (v.getId()) {
		case R.id.bnm:
			Intent inm = new Intent(this, List.class);
			Bundle passlist = new Bundle();
			passlist.putString("0", snewton);
			passlist.putString("1", "Physics");
			passlist.putString("2", "0");
			inm.putExtras(passlist);
			finish();
			startActivity(inm);
			break;
			
		case R.id.beam:
			Intent ieam = new Intent(this, List.class);
			Bundle passtoolist = new Bundle();
			passtoolist.putString("0", seam);
			passtoolist.putString("1", "Physics");
			passtoolist.putString("2", "1");
			ieam.putExtras(passtoolist);
			finish();
			startActivity(ieam);
			break;
			
		case R.id.bfm:
			Intent ifm = new Intent(this, List.class);
			Bundle passtwolist = new Bundle();
			passtwolist.putString("0", sfm);
			passtwolist.putString("1", "Physics");
			passtwolist.putString("2", "2");
			ifm.putExtras(passtwolist);
			finish();
			startActivity(ifm);
			break;
			
		case R.id.btp:
			Intent itp = new Intent(this, List.class);
			Bundle passto2list = new Bundle();
			passto2list.putString("0", stp);
			passto2list.putString("1", "Physics");
			passto2list.putString("2", "3");
			itp.putExtras(passto2list);
			finish();
			startActivity(itp);
			break;
			
		case R.id.baanp:
			Intent iaanp = new Intent(this, List.class);
			Bundle passtotolist = new Bundle();
			passtotolist.putString("0", saanp);
			passtotolist.putString("1", "Physics");
			passtotolist.putString("2", "4");
			iaanp.putExtras(passtotolist);
			finish();
			startActivity(iaanp);
			break;

		case R.id.bwao:
			Intent iwao = new Intent(this, List.class);
			Bundle passtolist = new Bundle();
			passtolist.putString("0", swao);
			passtolist.putString("1", "Physics");
			passtolist.putString("2", "5");
			iwao.putExtras(passtolist);
			finish();
			startActivity(iwao);
			break;

		case R.id.bgat:
			Intent igat = new Intent(this, List.class);
			Bundle pass2list = new Bundle();
			pass2list.putString("0", sgat);
			pass2list.putString("1", "Physics");
			pass2list.putString("2", "6");
			igat.putExtras(pass2list);
			finish();
			startActivity(igat);
			break;
		}
	}

	private void initialise() {
		bnm = (Button) findViewById(R.id.bnm);
		beam = (Button) findViewById(R.id.beam);
		bfm = (Button) findViewById(R.id.bfm);
		btp = (Button) findViewById(R.id.btp);
		baanp = (Button) findViewById(R.id.baanp);
		bwao = (Button) findViewById(R.id.bwao);
		bgat = (Button) findViewById(R.id.bgat);

	}

}
