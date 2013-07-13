package com.iitg.periodictable;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class PeriodicTable extends Activity {

	Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15,
			b16, b17, b18, b19, b20, b21, b22, b23, b24, b25, b26, b27, b28,
			b29, b30, b31, b32, b33, b34, b35, b36, b37, b38, b39, b40, b41,
			b42, b43, b44, b45, b46, b47, b48, b49, b50, b51, b52, b53, b54,
			b55, b56, b57, b58, b59, b60, b61, b62, b63, b64, b65, b66, b67,
			b68, b69, b70, b71, b72, b73, b74, b75, b76, b77, b78, b79, b80,
			b81, b82, b83, b84, b85, b86, b87, b88, b89, b90, b91, b92, b93,
			b94, b95, b96, b97, b98, b99, b100, b101, b102, b103, b104, b105,
			b106, b107, b108, b109, b110, b111, b112, b113, b114, b115, b116,
			b117, b118;

	Button bsearch, bLearn, bTable;

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		MenuInflater blowUp = getMenuInflater();
		blowUp.inflate(R.menu.menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.about:
			Intent i = new Intent("com.iitg.periodictable.ABOUT");
			startActivity(i);
			break;
		case R.id.exit:
			finish();
			break;
		}
		return false;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_periodic_table);
		initalise();
	}

	public void whenClick(View v) {
		switch (v.getId()) {
		case R.id.b1:
			Intent i1 = new Intent(this, List.class);
			Bundle h = new Bundle();
			h.putString("0", "1");
			i1.putExtras(h);

			startActivity(i1);
			break;

		case R.id.b2:
			Intent i2 = new Intent(this, List.class);
			Bundle he = new Bundle();
			he.putString("0", "2");
			i2.putExtras(he);

			startActivity(i2);
			break;

		case R.id.b3:
			Intent i3 = new Intent(this, List.class);
			Bundle li = new Bundle();
			li.putString("0", "3");
			i3.putExtras(li);

			startActivity(i3);
			break;

		case R.id.b4:
			Intent i4 = new Intent(this, List.class);
			Bundle be = new Bundle();
			be.putString("0", "4");
			i4.putExtras(be);

			startActivity(i4);
			break;

		case R.id.b5:
			Intent i5 = new Intent(this, List.class);
			Bundle b = new Bundle();
			b.putString("0", "5");
			i5.putExtras(b);

			startActivity(i5);
			break;

		case R.id.b6:
			Intent i6 = new Intent(this, List.class);
			Bundle c = new Bundle();
			c.putString("0", "6");
			i6.putExtras(c);

			startActivity(i6);
			break;

		case R.id.b7:
			Intent i7 = new Intent(this, List.class);
			Bundle n = new Bundle();
			n.putString("0", "7");
			i7.putExtras(n);

			startActivity(i7);
			break;

		case R.id.b8:
			Intent i8 = new Intent(this, List.class);
			Bundle o = new Bundle();
			o.putString("0", "8");
			i8.putExtras(o);

			startActivity(i8);
			break;

		case R.id.b9:
			Intent i9 = new Intent(this, List.class);
			Bundle f = new Bundle();
			f.putString("0", "9");
			i9.putExtras(f);

			startActivity(i9);
			break;

		case R.id.b10:
			Intent i10 = new Intent(this, List.class);
			Bundle ne = new Bundle();
			ne.putString("0", "10");
			i10.putExtras(ne);

			startActivity(i10);
			break;

		case R.id.b11:
			Intent i11 = new Intent(this, List.class);
			Bundle na = new Bundle();
			na.putString("0", "11");
			i11.putExtras(na);

			startActivity(i11);
			break;

		case R.id.b12:
			Intent i12 = new Intent(this, List.class);
			Bundle mg = new Bundle();
			mg.putString("0", "12");
			i12.putExtras(mg);

			startActivity(i12);
			break;

		case R.id.b13:
			Intent i13 = new Intent(this, List.class);
			Bundle al = new Bundle();
			al.putString("0", "13");
			i13.putExtras(al);

			startActivity(i13);
			break;

		case R.id.b14:
			Intent i14 = new Intent(this, List.class);
			Bundle si = new Bundle();
			si.putString("0", "14");
			i14.putExtras(si);

			startActivity(i14);
			break;

		case R.id.b15:
			Intent i15 = new Intent(this, List.class);
			Bundle p = new Bundle();
			p.putString("0", "15");
			i15.putExtras(p);

			startActivity(i15);
			break;

		case R.id.b16:
			Intent i16 = new Intent(this, List.class);
			Bundle s = new Bundle();
			s.putString("0", "16");
			i16.putExtras(s);

			startActivity(i16);
			break;

		case R.id.b17:
			Intent i17 = new Intent(this, List.class);
			Bundle cl = new Bundle();
			cl.putString("0", "17");
			i17.putExtras(cl);

			startActivity(i17);
			break;

		case R.id.b18:
			Intent i18 = new Intent(this, List.class);
			Bundle ar = new Bundle();
			ar.putString("0", "18");
			i18.putExtras(ar);

			startActivity(i18);
			break;

		case R.id.b19:
			Intent i19 = new Intent(this, List.class);
			Bundle k = new Bundle();
			k.putString("0", "19");
			i19.putExtras(k);

			startActivity(i19);
			break;

		case R.id.b20:
			Intent i20 = new Intent(this, List.class);
			Bundle ca = new Bundle();
			ca.putString("0", "20");
			i20.putExtras(ca);

			startActivity(i20);
			break;

		case R.id.b21:
			Intent i21 = new Intent(this, List.class);
			Bundle sc = new Bundle();
			sc.putString("0", "21");
			i21.putExtras(sc);

			startActivity(i21);
			break;

		case R.id.b22:
			Intent i22 = new Intent(this, List.class);
			Bundle ti = new Bundle();
			ti.putString("0", "22");
			i22.putExtras(ti);

			startActivity(i22);
			break;

		case R.id.b23:
			Intent i23 = new Intent(this, List.class);
			Bundle va = new Bundle();
			va.putString("0", "23");
			i23.putExtras(va);

			startActivity(i23);
			break;

		case R.id.b24:
			Intent i24 = new Intent(this, List.class);
			Bundle cr = new Bundle();
			cr.putString("0", "24");
			i24.putExtras(cr);

			startActivity(i24);
			break;

		case R.id.b25:
			Intent i25 = new Intent(this, List.class);
			Bundle mn = new Bundle();
			mn.putString("0", "25");
			i25.putExtras(mn);

			startActivity(i25);
			break;

		case R.id.b26:
			Intent i26 = new Intent(this, List.class);
			Bundle fe = new Bundle();
			fe.putString("0", "26");
			i26.putExtras(fe);

			startActivity(i26);
			break;

		case R.id.b27:
			Intent i27 = new Intent(this, List.class);
			Bundle co = new Bundle();
			co.putString("0", "27");
			i27.putExtras(co);

			startActivity(i27);
			break;

		case R.id.b28:
			Intent i28 = new Intent(this, List.class);
			Bundle ni = new Bundle();
			ni.putString("0", "28");
			i28.putExtras(ni);

			startActivity(i28);
			break;

		case R.id.b29:
			Intent i29 = new Intent(this, List.class);
			Bundle cu = new Bundle();
			cu.putString("0", "29");
			i29.putExtras(cu);

			startActivity(i29);
			break;

		case R.id.b30:
			Intent i30 = new Intent(this, List.class);
			Bundle zn = new Bundle();
			zn.putString("0", "30");
			i30.putExtras(zn);

			startActivity(i30);
			break;

		case R.id.b31:
			Intent i31 = new Intent(this, List.class);
			Bundle ga = new Bundle();
			ga.putString("0", "31");
			i31.putExtras(ga);

			startActivity(i31);
			break;

		case R.id.b32:
			Intent i32 = new Intent(this, List.class);
			Bundle ge = new Bundle();
			ge.putString("0", "32");
			i32.putExtras(ge);

			startActivity(i32);
			break;

		case R.id.b33:
			Intent i33 = new Intent(this, List.class);
			Bundle as = new Bundle();
			as.putString("0", "33");
			i33.putExtras(as);

			startActivity(i33);
			break;

		case R.id.b34:
			Intent i34 = new Intent(this, List.class);
			Bundle se = new Bundle();
			se.putString("0", "34");
			i34.putExtras(se);

			startActivity(i34);
			break;

		case R.id.b35:
			Intent i35 = new Intent(this, List.class);
			Bundle br = new Bundle();
			br.putString("0", "35");
			i35.putExtras(br);

			startActivity(i35);
			break;

		case R.id.b36:
			Intent i36 = new Intent(this, List.class);
			Bundle kr = new Bundle();
			kr.putString("0", "36");
			i36.putExtras(kr);

			startActivity(i36);
			break;

		case R.id.b37:
			Intent i37 = new Intent(this, List.class);
			Bundle rb = new Bundle();
			rb.putString("0", "37");
			i37.putExtras(rb);

			startActivity(i37);
			break;

		case R.id.b38:
			Intent i38 = new Intent(this, List.class);
			Bundle sr = new Bundle();
			sr.putString("0", "38");
			i38.putExtras(sr);

			startActivity(i38);
			break;

		case R.id.b39:
			Intent i39 = new Intent(this, List.class);
			Bundle y = new Bundle();
			y.putString("0", "39");
			i39.putExtras(y);

			startActivity(i39);
			break;

		case R.id.b40:
			Intent i40 = new Intent(this, List.class);
			Bundle zr = new Bundle();
			zr.putString("0", "40");
			i40.putExtras(zr);

			startActivity(i40);
			break;

		case R.id.b41:
			Intent i41 = new Intent(this, List.class);
			Bundle nb = new Bundle();
			nb.putString("0", "41");
			i41.putExtras(nb);

			startActivity(i41);
			break;

		case R.id.b42:
			Intent i42 = new Intent(this, List.class);
			Bundle mo = new Bundle();
			mo.putString("0", "42");
			i42.putExtras(mo);

			startActivity(i42);
			break;

		case R.id.b43:
			Intent i43 = new Intent(this, List.class);
			Bundle tc = new Bundle();
			tc.putString("0", "43");
			i43.putExtras(tc);

			startActivity(i43);
			break;

		case R.id.b44:
			Intent i44 = new Intent(this, List.class);
			Bundle ru = new Bundle();
			ru.putString("0", "44");
			i44.putExtras(ru);

			startActivity(i44);
			break;

		case R.id.b45:
			Intent i45 = new Intent(this, List.class);
			Bundle rh = new Bundle();
			rh.putString("0", "45");
			i45.putExtras(rh);

			startActivity(i45);
			break;

		case R.id.b46:
			Intent i46 = new Intent(this, List.class);
			Bundle pd = new Bundle();
			pd.putString("0", "46");
			i46.putExtras(pd);

			startActivity(i46);
			break;

		case R.id.b47:
			Intent i47 = new Intent(this, List.class);
			Bundle ag = new Bundle();
			ag.putString("0", "47");
			i47.putExtras(ag);

			startActivity(i47);
			break;

		case R.id.b48:
			Intent i48 = new Intent(this, List.class);
			Bundle cd = new Bundle();
			cd.putString("0", "48");
			i48.putExtras(cd);

			startActivity(i48);
			break;

		case R.id.b49:
			Intent i49 = new Intent(this, List.class);
			Bundle in = new Bundle();
			in.putString("0", "49");
			i49.putExtras(in);

			startActivity(i49);
			break;

		case R.id.b50:
			Intent i50 = new Intent(this, List.class);
			Bundle sn = new Bundle();
			sn.putString("0", "50");
			i50.putExtras(sn);

			startActivity(i50);
			break;

		case R.id.b51:
			Intent i51 = new Intent(this, List.class);
			Bundle sb = new Bundle();
			sb.putString("0", "51");
			i51.putExtras(sb);

			startActivity(i51);
			break;

		case R.id.b52:
			Intent i52 = new Intent(this, List.class);
			Bundle te = new Bundle();
			te.putString("0", "52");
			i52.putExtras(te);

			startActivity(i52);
			break;

		case R.id.b53:
			Intent i53 = new Intent(this, List.class);
			Bundle i = new Bundle();
			i.putString("0", "53");
			i53.putExtras(i);

			startActivity(i53);
			break;

		case R.id.b54:
			Intent i54 = new Intent(this, List.class);
			Bundle xe = new Bundle();
			xe.putString("0", "54");
			i54.putExtras(xe);

			startActivity(i54);
			break;

		case R.id.b55:
			Intent i55 = new Intent(this, List.class);
			Bundle cs = new Bundle();
			cs.putString("0", "55");
			i55.putExtras(cs);

			startActivity(i55);
			break;

		case R.id.b56:
			Intent i56 = new Intent(this, List.class);
			Bundle ba = new Bundle();
			ba.putString("0", "56");
			i56.putExtras(ba);

			startActivity(i56);
			break;

		case R.id.b57:
			Intent i57 = new Intent(this, List.class);
			Bundle la = new Bundle();
			la.putString("0", "57");
			i57.putExtras(la);

			startActivity(i57);
			break;

		case R.id.b58:
			Intent i58 = new Intent(this, List.class);
			Bundle ce = new Bundle();
			ce.putString("0", "58");
			i58.putExtras(ce);

			startActivity(i58);
			break;

		case R.id.b59:
			Intent i59 = new Intent(this, List.class);
			Bundle pr = new Bundle();
			pr.putString("0", "59");
			i59.putExtras(pr);

			startActivity(i59);
			break;

		case R.id.b60:
			Intent i60 = new Intent(this, List.class);
			Bundle nd = new Bundle();
			nd.putString("0", "60");
			i60.putExtras(nd);

			startActivity(i60);
			break;

		case R.id.b61:
			Intent i61 = new Intent(this, List.class);
			Bundle pm = new Bundle();
			pm.putString("0", "61");
			i61.putExtras(pm);

			startActivity(i61);
			break;

		case R.id.b62:
			Intent i62 = new Intent(this, List.class);
			Bundle sm = new Bundle();
			sm.putString("0", "62");
			i62.putExtras(sm);

			startActivity(i62);
			break;

		case R.id.b63:
			Intent i63 = new Intent(this, List.class);
			Bundle eu = new Bundle();
			eu.putString("0", "63");
			i63.putExtras(eu);

			startActivity(i63);
			break;

		case R.id.b64:
			Intent i64 = new Intent(this, List.class);
			Bundle gd = new Bundle();
			gd.putString("0", "64");
			i64.putExtras(gd);

			startActivity(i64);
			break;

		case R.id.b65:
			Intent i65 = new Intent(this, List.class);
			Bundle tb = new Bundle();
			tb.putString("0", "65");
			i65.putExtras(tb);

			startActivity(i65);
			break;

		case R.id.b66:
			Intent i66 = new Intent(this, List.class);
			Bundle dy = new Bundle();
			dy.putString("0", "66");
			i66.putExtras(dy);

			startActivity(i66);
			break;

		case R.id.b67:
			Intent i67 = new Intent(this, List.class);
			Bundle ho = new Bundle();
			ho.putString("0", "67");
			i67.putExtras(ho);

			startActivity(i67);
			break;

		case R.id.b68:
			Intent i68 = new Intent(this, List.class);
			Bundle er = new Bundle();
			er.putString("0", "68");
			i68.putExtras(er);

			startActivity(i68);
			break;

		case R.id.b69:
			Intent i69 = new Intent(this, List.class);
			Bundle tm = new Bundle();
			tm.putString("0", "69");
			i69.putExtras(tm);

			startActivity(i69);
			break;

		case R.id.b70:
			Intent i70 = new Intent(this, List.class);
			Bundle yb = new Bundle();
			yb.putString("0", "70");
			i70.putExtras(yb);

			startActivity(i70);
			break;

		case R.id.b71:
			Intent i71 = new Intent(this, List.class);
			Bundle lu = new Bundle();
			lu.putString("0", "71");
			i71.putExtras(lu);

			startActivity(i71);
			break;

		case R.id.b72:
			Intent i72 = new Intent(this, List.class);
			Bundle hf = new Bundle();
			hf.putString("0", "72");
			i72.putExtras(hf);

			startActivity(i72);
			break;

		case R.id.b73:
			Intent i73 = new Intent(this, List.class);
			Bundle ta = new Bundle();
			ta.putString("0", "73");
			i73.putExtras(ta);

			startActivity(i73);
			break;

		case R.id.b74:
			Intent i74 = new Intent(this, List.class);
			Bundle w = new Bundle();
			w.putString("0", "74");
			i74.putExtras(w);

			startActivity(i74);
			break;

		case R.id.b75:
			Intent i75 = new Intent(this, List.class);
			Bundle re = new Bundle();
			re.putString("0", "75");
			i75.putExtras(re);

			startActivity(i75);
			break;

		case R.id.b76:
			Intent i76 = new Intent(this, List.class);
			Bundle os = new Bundle();
			os.putString("0", "76");
			i76.putExtras(os);

			startActivity(i76);
			break;

		case R.id.b77:
			Intent i77 = new Intent(this, List.class);
			Bundle ir = new Bundle();
			ir.putString("0", "77");
			i77.putExtras(ir);

			startActivity(i77);
			break;

		case R.id.b78:
			Intent i78 = new Intent(this, List.class);
			Bundle pt = new Bundle();
			pt.putString("0", "78");
			i78.putExtras(pt);

			startActivity(i78);
			break;

		case R.id.b79:
			Intent i79 = new Intent(this, List.class);
			Bundle au = new Bundle();
			au.putString("0", "79");
			i79.putExtras(au);

			startActivity(i79);
			break;

		case R.id.b80:
			Intent i80 = new Intent(this, List.class);
			Bundle hg = new Bundle();
			hg.putString("0", "80");
			i80.putExtras(hg);

			startActivity(i80);
			break;

		case R.id.b81:
			Intent i81 = new Intent(this, List.class);
			Bundle tl = new Bundle();
			tl.putString("0", "81");
			i81.putExtras(tl);

			startActivity(i81);
			break;

		case R.id.b82:
			Intent i82 = new Intent(this, List.class);
			Bundle pb = new Bundle();
			pb.putString("0", "82");
			i82.putExtras(pb);

			startActivity(i82);
			break;

		case R.id.b83:
			Intent i83 = new Intent(this, List.class);
			Bundle bi = new Bundle();
			bi.putString("0", "83");
			i83.putExtras(bi);

			startActivity(i83);
			break;

		case R.id.b84:
			Intent i84 = new Intent(this, List.class);
			Bundle po = new Bundle();
			po.putString("0", "84");
			i84.putExtras(po);

			startActivity(i84);
			break;

		case R.id.b85:
			Intent i85 = new Intent(this, List.class);
			Bundle at = new Bundle();
			at.putString("0", "85");
			i85.putExtras(at);

			startActivity(i85);
			break;

		case R.id.b86:
			Intent i86 = new Intent(this, List.class);
			Bundle rn = new Bundle();
			rn.putString("0", "86");
			i86.putExtras(rn);

			startActivity(i86);
			break;

		case R.id.b87:
			Intent i87 = new Intent(this, List.class);
			Bundle fr = new Bundle();
			fr.putString("0", "87");
			i87.putExtras(fr);

			startActivity(i87);
			break;

		case R.id.b88:
			Intent i88 = new Intent(this, List.class);
			Bundle ra = new Bundle();
			ra.putString("0", "88");
			i88.putExtras(ra);

			startActivity(i88);
			break;

		case R.id.b89:
			Intent i89 = new Intent(this, List.class);
			Bundle ac = new Bundle();
			ac.putString("0", "89");
			i89.putExtras(ac);

			startActivity(i89);
			break;

		case R.id.b90:
			Intent i90 = new Intent(this, List.class);
			Bundle th = new Bundle();
			th.putString("0", "90");
			i90.putExtras(th);

			startActivity(i90);
			break;

		case R.id.b91:
			Intent i91 = new Intent(this, List.class);
			Bundle pa = new Bundle();
			pa.putString("0", "91");
			i91.putExtras(pa);

			startActivity(i91);
			break;

		case R.id.b92:
			Intent i92 = new Intent(this, List.class);
			Bundle u = new Bundle();
			u.putString("0", "92");
			i92.putExtras(u);

			startActivity(i92);
			break;

		case R.id.b93:
			Intent i93 = new Intent(this, List.class);
			Bundle np = new Bundle();
			np.putString("0", "93");
			i93.putExtras(np);

			startActivity(i93);
			break;

		case R.id.b94:
			Intent i94 = new Intent(this, List.class);
			Bundle pu = new Bundle();
			pu.putString("0", "94");
			i94.putExtras(pu);

			startActivity(i94);
			break;

		case R.id.b95:
			Intent i95 = new Intent(this, List.class);
			Bundle am = new Bundle();
			am.putString("0", "95");
			i95.putExtras(am);

			startActivity(i95);
			break;

		case R.id.b96:
			Intent i96 = new Intent(this, List.class);
			Bundle cm = new Bundle();
			cm.putString("0", "96");
			i96.putExtras(cm);

			startActivity(i96);
			break;

		case R.id.b97:
			Intent i97 = new Intent(this, List.class);
			Bundle bk = new Bundle();
			bk.putString("0", "97");
			i97.putExtras(bk);

			startActivity(i97);
			break;

		case R.id.b98:
			Intent i98 = new Intent(this, List.class);
			Bundle cf = new Bundle();
			cf.putString("0", "98");
			i98.putExtras(cf);

			startActivity(i98);
			break;

		case R.id.b99:
			Intent i99 = new Intent(this, List.class);
			Bundle es = new Bundle();
			es.putString("0", "99");
			i99.putExtras(es);

			startActivity(i99);
			break;

		case R.id.b100:
			Intent i100 = new Intent(this, List.class);
			Bundle fm = new Bundle();
			fm.putString("0", "100");
			i100.putExtras(fm);

			startActivity(i100);
			break;

		case R.id.b101:
			Intent i101 = new Intent(this, List.class);
			Bundle md = new Bundle();
			md.putString("0", "101");
			i101.putExtras(md);

			startActivity(i101);
			break;

		case R.id.b102:
			Intent i102 = new Intent(this, List.class);
			Bundle no = new Bundle();
			no.putString("0", "102");
			i102.putExtras(no);

			startActivity(i102);
			break;

		case R.id.b103:
			Intent i103 = new Intent(this, List.class);
			Bundle lr = new Bundle();
			lr.putString("0", "103");
			i103.putExtras(lr);

			startActivity(i103);
			break;

		case R.id.b104:
			Intent i104 = new Intent(this, List.class);
			Bundle rf = new Bundle();
			rf.putString("0", "104");
			i104.putExtras(rf);

			startActivity(i104);
			break;

		case R.id.b105:
			Intent i105 = new Intent(this, List.class);
			Bundle db = new Bundle();
			db.putString("0", "105");
			i105.putExtras(db);

			startActivity(i105);
			break;

		case R.id.b106:
			Intent i106 = new Intent(this, List.class);
			Bundle sg = new Bundle();
			sg.putString("0", "106");
			i106.putExtras(sg);

			startActivity(i106);
			break;

		case R.id.b107:
			Intent i107 = new Intent(this, List.class);
			Bundle bh = new Bundle();
			bh.putString("0", "107");
			i107.putExtras(bh);

			startActivity(i107);
			break;

		case R.id.b108:
			Intent i108 = new Intent(this, List.class);
			Bundle hs = new Bundle();
			hs.putString("0", "108");
			i108.putExtras(hs);

			startActivity(i108);
			break;

		case R.id.b109:
			Intent i109 = new Intent(this, List.class);
			Bundle mt = new Bundle();
			mt.putString("0", "109");
			i109.putExtras(mt);

			startActivity(i109);
			break;

		case R.id.b110:
			Intent i110 = new Intent(this, List.class);
			Bundle ds = new Bundle();
			ds.putString("0", "110");
			i110.putExtras(ds);

			startActivity(i110);
			break;

		case R.id.b111:
			Intent i111 = new Intent(this, List.class);
			Bundle rg = new Bundle();
			rg.putString("0", "111");
			i111.putExtras(rg);

			startActivity(i111);
			break;

		case R.id.b112:
			Intent i112 = new Intent(this, List.class);
			Bundle cn = new Bundle();
			cn.putString("0", "112");
			i112.putExtras(cn);

			startActivity(i112);
			break;

		case R.id.b113:
			Intent i113 = new Intent(this, List.class);
			Bundle uut = new Bundle();
			uut.putString("0", "113");
			i113.putExtras(uut);

			startActivity(i113);
			break;

		case R.id.b114:
			Intent i114 = new Intent(this, List.class);
			Bundle fl = new Bundle();
			fl.putString("0", "114");
			i114.putExtras(fl);

			startActivity(i114);
			break;

		case R.id.b115:
			Intent i115 = new Intent(this, List.class);
			Bundle uup = new Bundle();
			uup.putString("0", "115");
			i115.putExtras(uup);

			startActivity(i115);
			break;

		case R.id.b116:
			Intent i116 = new Intent(this, List.class);
			Bundle lv = new Bundle();
			lv.putString("0", "116");
			i116.putExtras(lv);

			startActivity(i116);
			break;

		case R.id.b117:
			Intent i117 = new Intent(this, List.class);
			Bundle uus = new Bundle();
			uus.putString("0", "117");
			i117.putExtras(uus);

			startActivity(i117);
			break;

		case R.id.b118:
			Intent i118 = new Intent(this, List.class);
			Bundle uuo = new Bundle();
			uuo.putString("0", "118");
			i118.putExtras(uuo);

			startActivity(i118);
			break;

		// =================================
		case R.id.bTable:
			Intent itable = new Intent(this, Table.class);
			startActivity(itable);
			break;

		case R.id.bsearch:
			onSearchRequested();
			break;

		case R.id.bLearn:
			Random rand = new Random();
			Integer element = rand.nextInt(118) + 1;
			Intent ilearn = new Intent(this, List.class);
			Bundle learn = new Bundle();
			learn.putString("0", element.toString());
			ilearn.putExtras(learn);
			startActivity(ilearn);
			break;
		// =================================
		}
	}

	private void initalise() {
		b1 = (Button) findViewById(R.id.b1);
		b2 = (Button) findViewById(R.id.b2);
		b3 = (Button) findViewById(R.id.b3);
		b4 = (Button) findViewById(R.id.b4);
		b5 = (Button) findViewById(R.id.b5);
		b6 = (Button) findViewById(R.id.b6);
		b7 = (Button) findViewById(R.id.b7);
		b8 = (Button) findViewById(R.id.b8);
		b9 = (Button) findViewById(R.id.b9);
		b10 = (Button) findViewById(R.id.b10);
		b11 = (Button) findViewById(R.id.b11);
		b12 = (Button) findViewById(R.id.b12);
		b13 = (Button) findViewById(R.id.b13);
		b14 = (Button) findViewById(R.id.b14);
		b15 = (Button) findViewById(R.id.b15);
		b16 = (Button) findViewById(R.id.b16);
		b17 = (Button) findViewById(R.id.b17);
		b18 = (Button) findViewById(R.id.b18);
		b19 = (Button) findViewById(R.id.b19);
		b20 = (Button) findViewById(R.id.b20);
		b21 = (Button) findViewById(R.id.b21);
		b22 = (Button) findViewById(R.id.b22);
		b23 = (Button) findViewById(R.id.b23);
		b24 = (Button) findViewById(R.id.b24);
		b25 = (Button) findViewById(R.id.b25);
		b26 = (Button) findViewById(R.id.b26);
		b27 = (Button) findViewById(R.id.b27);
		b28 = (Button) findViewById(R.id.b28);
		b29 = (Button) findViewById(R.id.b29);
		b30 = (Button) findViewById(R.id.b30);
		b31 = (Button) findViewById(R.id.b31);
		b32 = (Button) findViewById(R.id.b32);
		b33 = (Button) findViewById(R.id.b33);
		b34 = (Button) findViewById(R.id.b34);
		b35 = (Button) findViewById(R.id.b35);
		b36 = (Button) findViewById(R.id.b36);
		b37 = (Button) findViewById(R.id.b37);
		b38 = (Button) findViewById(R.id.b38);
		b39 = (Button) findViewById(R.id.b39);
		b40 = (Button) findViewById(R.id.b40);
		b41 = (Button) findViewById(R.id.b41);
		b42 = (Button) findViewById(R.id.b42);
		b43 = (Button) findViewById(R.id.b43);
		b44 = (Button) findViewById(R.id.b44);
		b45 = (Button) findViewById(R.id.b45);
		b46 = (Button) findViewById(R.id.b46);
		b47 = (Button) findViewById(R.id.b47);
		b48 = (Button) findViewById(R.id.b48);
		b49 = (Button) findViewById(R.id.b49);
		b50 = (Button) findViewById(R.id.b50);
		b51 = (Button) findViewById(R.id.b51);
		b52 = (Button) findViewById(R.id.b52);
		b53 = (Button) findViewById(R.id.b53);
		b54 = (Button) findViewById(R.id.b54);
		b55 = (Button) findViewById(R.id.b55);
		b56 = (Button) findViewById(R.id.b56);
		b57 = (Button) findViewById(R.id.b57);
		b58 = (Button) findViewById(R.id.b58);
		b59 = (Button) findViewById(R.id.b59);
		b60 = (Button) findViewById(R.id.b60);
		b61 = (Button) findViewById(R.id.b61);
		b62 = (Button) findViewById(R.id.b62);
		b63 = (Button) findViewById(R.id.b63);
		b64 = (Button) findViewById(R.id.b64);
		b65 = (Button) findViewById(R.id.b65);
		b66 = (Button) findViewById(R.id.b66);
		b67 = (Button) findViewById(R.id.b67);
		b68 = (Button) findViewById(R.id.b68);
		b69 = (Button) findViewById(R.id.b69);
		b70 = (Button) findViewById(R.id.b70);
		b71 = (Button) findViewById(R.id.b71);
		b72 = (Button) findViewById(R.id.b72);
		b73 = (Button) findViewById(R.id.b73);
		b74 = (Button) findViewById(R.id.b74);
		b75 = (Button) findViewById(R.id.b75);
		b76 = (Button) findViewById(R.id.b76);
		b77 = (Button) findViewById(R.id.b77);
		b78 = (Button) findViewById(R.id.b78);
		b79 = (Button) findViewById(R.id.b79);
		b80 = (Button) findViewById(R.id.b80);
		b81 = (Button) findViewById(R.id.b81);
		b82 = (Button) findViewById(R.id.b82);
		b83 = (Button) findViewById(R.id.b83);
		b84 = (Button) findViewById(R.id.b84);
		b85 = (Button) findViewById(R.id.b85);
		b86 = (Button) findViewById(R.id.b86);
		b87 = (Button) findViewById(R.id.b87);
		b88 = (Button) findViewById(R.id.b88);
		b89 = (Button) findViewById(R.id.b89);
		b90 = (Button) findViewById(R.id.b90);
		b91 = (Button) findViewById(R.id.b91);
		b92 = (Button) findViewById(R.id.b92);
		b93 = (Button) findViewById(R.id.b93);
		b94 = (Button) findViewById(R.id.b94);
		b95 = (Button) findViewById(R.id.b95);
		b96 = (Button) findViewById(R.id.b96);
		b97 = (Button) findViewById(R.id.b97);
		b98 = (Button) findViewById(R.id.b98);
		b99 = (Button) findViewById(R.id.b99);
		b100 = (Button) findViewById(R.id.b100);
		b101 = (Button) findViewById(R.id.b101);
		b102 = (Button) findViewById(R.id.b102);
		b103 = (Button) findViewById(R.id.b103);
		b104 = (Button) findViewById(R.id.b104);
		b105 = (Button) findViewById(R.id.b105);
		b106 = (Button) findViewById(R.id.b106);
		b107 = (Button) findViewById(R.id.b107);
		b108 = (Button) findViewById(R.id.b108);
		b109 = (Button) findViewById(R.id.b109);
		b110 = (Button) findViewById(R.id.b110);
		b111 = (Button) findViewById(R.id.b111);
		b112 = (Button) findViewById(R.id.b112);
		b113 = (Button) findViewById(R.id.b113);
		b114 = (Button) findViewById(R.id.b114);
		b115 = (Button) findViewById(R.id.b115);
		b116 = (Button) findViewById(R.id.b116);
		b117 = (Button) findViewById(R.id.b117);
		b118 = (Button) findViewById(R.id.b118);

		bsearch = (Button) findViewById(R.id.bsearch);
		bLearn = (Button) findViewById(R.id.bLearn);
		bTable = (Button) findViewById(R.id.bTable);

	}
}
