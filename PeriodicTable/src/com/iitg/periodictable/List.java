package com.iitg.periodictable;

import java.util.Locale;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.provider.VoicemailContract;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;
import android.text.Html;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class List extends Activity {

	Button bback, bforward;
	EditText tvlist;

	String s1 = "", s2 = "", s3 = "", s4 = "", s5 = "", s6 = "", s7 = "",
			s8 = "", s9 = "", s10 = "", s11 = "", s12 = "", s13 = "", s14 = "",
			s15 = "", s16 = "", s17 = "", s18 = "", s19 = "", s20 = "",
			s21 = "", s22 = "", s23 = "", s24 = "", s25 = "", s26 = "",
			s27 = "", s28 = "", s29 = "", s30 = "", s31 = "", s32 = "",
			s33 = "", s34 = "", s35 = "", s36 = "", s37 = "", s38 = "",
			s39 = "", s40 = "", s41 = "", s42 = "", s43 = "", s44 = "",
			s45 = "", s46 = "", s47 = "", s48 = "", s49 = "", s50 = "",
			s51 = "", s52 = "", s53 = "", s54 = "", s55 = "", s56 = "",
			s57 = "", s58 = "", s59 = "", s60 = "", s61 = "", s62 = "",
			s63 = "", s64 = "", s65 = "", s66 = "", s67 = "", s68 = "",
			s69 = "", s70 = "", s71 = "", s72 = "", s73 = "", s74 = "",
			s75 = "", s76 = "", s77 = "", s78 = "", s79 = "", s80 = "",
			s81 = "", s82 = "", s83 = "", s84 = "", s85 = "", s86 = "",
			s87 = "", s88 = "", s89 = "", s90 = "", s91 = "", s92 = "",
			s93 = "", s94 = "", s95 = "", s96 = "", s97 = "", s98 = "",
			s99 = "", s100 = "", s101 = "", s102 = "", s103 = "", s104 = "",
			s105 = "", s106 = "", s107 = "", s108 = "", s109 = "", s110 = "",
			s111 = "", s112 = "", s113 = "", s114 = "", s115 = "", s116 = "",
			s117 = "", s118 = "";

	String query = "";
	String name = "";
	String h = "";
	Integer ctr = -1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list);
		bback = (Button)findViewById(R.id.bback);
		bforward = (Button)findViewById(R.id.bforward);
		tvlist = (EditText)findViewById(R.id.tvlist);

		try {
			Bundle get = getIntent().getExtras();
			name = get.getString("0");
		} catch (Exception e) {
			// Do nothing.
		}

		try {
			Intent intent = getIntent();
			if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
				query = intent.getStringExtra(SearchManager.QUERY);
			}
		} catch (Exception e) {
			// Do nothing.
		}
		if (query.length() >= 1){
			name = query.toLowerCase();
		}

		// *****************************************************************************

		if (name.equals("hydrogen") || name.equals("1") || name.equals("h")) {
			ctr = 0;
			s1tos10();
			h += s1;
			tvlist.setText(Html.fromHtml(h));
			
			//private TextToSpeech tts = new Tex;
			
			
		}
		if (name.equals("helium") || name.equals("2") || name.equals("he")) {
			ctr = 1;
			s1tos10();
			h += s2;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("lithium") || name.equals("3") || name.equals("li")) {
			ctr = 2;
			s1tos10();
			h += s3;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("beryllium") || name.equals("4") || name.equals("be")) {
			ctr = 3;
			s1tos10();
			h += s4;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("boron") || name.equals("5") || name.equals("b")) {
			ctr = 4;
			s1tos10();
			h += s5;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("carbon") || name.equals("6") || name.equals("c")) {
			ctr = 5;
			s1tos10();
			h += s6;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("nitrogen") || name.equals("7") || name.equals("n")) {
			ctr = 6;
			s1tos10();
			h += s7;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("oxygen") || name.equals("8") || name.equals("o")) {
			ctr = 7;
			s1tos10();
			h += s8;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("fluorine") || name.equals("9") || name.equals("f")) {
			ctr = 8;
			s1tos10();
			h += s9;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("neon") || name.equals("10") || name.equals("ne")) {
			ctr = 9;
			s1tos10();
			h += s10;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("sodium") || name.equals("11") || name.equals("na")) {
			ctr = 10;
			s11tos20();
			h += s11;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("magnesium") || name.equals("12") || name.equals("mg")) {
			ctr = 11;
			s11tos20();
			h += s12;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("aluminium") || name.equals("13") || name.equals("al")) {
			ctr = 12;
			s11tos20();
			h += s13;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("silicon") || name.equals("14") || name.equals("si")) {
			ctr = 13;
			s11tos20();
			h += s14;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("phosphorus") || name.equals("15") || name.equals("p")) {
			ctr = 14;
			s11tos20();
			h += s15;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("sulfur") || name.equals("16") || name.equals("s")) {
			ctr = 15;
			s11tos20();
			h += s16;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("chlorine") || name.equals("17") || name.equals("cl")) {
			ctr = 16;
			s11tos20();
			h += s17;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("argon") || name.equals("18") || name.equals("ar")) {
			ctr = 17;
			s11tos20();
			h += s18;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("potassium") || name.equals("19") || name.equals("k")) {
			ctr = 18;
			s11tos20();
			h += s19;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("calcium") || name.equals("20") || name.equals("ca")) {
			ctr = 19;
			s11tos20();
			h += s20;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("scandium") || name.equals("21") || name.equals("sc")) {
			ctr = 20;
			s21tos30();
			h += s21;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("titanium") || name.equals("22") || name.equals("ti")) {
			ctr = 21;
			s21tos30();
			h += s22;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("vanadium") || name.equals("23") || name.equals("v")) {
			ctr = 22;
			s21tos30();
			h += s23;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("chromium") || name.equals("24") || name.equals("cr")) {
			ctr = 23;
			s21tos30();
			h += s24;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("manganese") || name.equals("25") || name.equals("mn")) {
			ctr = 24;
			s21tos30();
			h += s25;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("iron") || name.equals("26") || name.equals("fe")) {
			ctr = 25;
			s21tos30();
			h += s26;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("cobalt") || name.equals("27") || name.equals("co")) {
			ctr = 26;
			s21tos30();
			h += s27;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("nickel") || name.equals("28") || name.equals("ni")) {
			ctr = 27;
			s21tos30();
			h += s28;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("copper") || name.equals("29") || name.equals("cu")) {
			ctr = 28;
			s21tos30();
			h += s29;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("zinc") || name.equals("30") || name.equals("zn")) {
			ctr = 29;
			s21tos30();
			h += s30;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("gallium") || name.equals("31") || name.equals("ga")) {
			ctr = 30;
			s31tos40();
			h += s31;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("germanium") || name.equals("32") || name.equals("ge")) {
			ctr = 31;
			s31tos40();
			h += s32;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("arsenic") || name.equals("33") || name.equals("as")) {
			ctr = 32;
			s31tos40();
			h += s33;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("selenium") || name.equals("34") || name.equals("se")) {
			ctr = 33;
			s31tos40();
			h += s34;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("bromine") || name.equals("35") || name.equals("br")) {
			ctr = 34;
			s31tos40();
			h += s35;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("krypton") || name.equals("36") || name.equals("kr")) {
			ctr = 35;
			s31tos40();
			h += s36;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("rubidium") || name.equals("37") || name.equals("rb")) {
			ctr = 36;
			s31tos40();
			h += s37;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("strontium") || name.equals("38") || name.equals("sr")) {
			ctr = 37;
			s31tos40();
			h += s38;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("yttrium") || name.equals("39") || name.equals("y")) {
			ctr = 38;
			s31tos40();
			h += s39;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("zirconium") || name.equals("40") || name.equals("zr")) {
			ctr = 39;
			s31tos40();
			h += s40;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("niobium") || name.equals("41") || name.equals("nb")) {
			ctr = 40;
			s41tos50();
			h += s41;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("molybdenum") || name.equals("42") || name.equals("mo")) {
			ctr = 41;
			s41tos50();
			h += s42;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("technetium") || name.equals("43") || name.equals("tc")) {
			ctr = 42;
			s41tos50();
			h += s43;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("ruthenium") || name.equals("44") || name.equals("ru")) {
			ctr = 43;
			s41tos50();
			h += s44;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("rhodium") || name.equals("45") || name.equals("rh")) {
			ctr = 44;
			s41tos50();
			h += s45;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("palladium") || name.equals("46") || name.equals("pd")) {
			ctr = 45;
			s41tos50();
			h += s46;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("silver") || name.equals("47") || name.equals("ag")) {
			ctr = 46;
			s41tos50();
			h += s47;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("cadmium") || name.equals("48") || name.equals("cd")) {
			ctr = 47;
			s41tos50();
			h += s48;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("indium") || name.equals("49") || name.equals("in")) {
			ctr = 48;
			s41tos50();
			h += s49;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("tin") || name.equals("50") || name.equals("sn")) {
			ctr = 49;
			s41tos50();
			h += s50;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("antimony") || name.equals("51") || name.equals("sb")) {
			ctr = 50;
			s51tos60();
			h += s51;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("tellurium") || name.equals("52") || name.equals("te")) {
			ctr = 51;
			s51tos60();
			h += s52;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("iodine") || name.equals("53") || name.equals("i")) {
			ctr = 52;
			s51tos60();
			h += s53;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("xenon") || name.equals("54") || name.equals("xe")) {
			ctr = 53;
			s51tos60();
			h += s54;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("cesium") || name.equals("55") || name.equals("cs")) {
			ctr = 54;
			s51tos60();
			h += s55;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("barium") || name.equals("56") || name.equals("ba")) {
			ctr = 55;
			s51tos60();
			h += s56;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("lanthanum") || name.equals("57") || name.equals("la")) {
			ctr = 56;
			s51tos60();
			h += s57;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("cerium") || name.equals("58") || name.equals("ce")) {
			ctr = 57;
			s51tos60();
			h += s58;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("praseodymium") || name.equals("59")
				|| name.equals("pr")) {
			ctr = 58;
			s51tos60();
			h += s59;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("neodymium") || name.equals("60") || name.equals("nd")) {
			ctr = 59;
			s51tos60();
			h += s60;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("promethium") || name.equals("61") || name.equals("pm")) {
			ctr = 60;
			s61tos70();
			h += s61;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("samarium") || name.equals("62") || name.equals("sm")) {
			ctr = 61;
			s61tos70();
			h += s62;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("europium") || name.equals("63") || name.equals("eu")) {
			ctr = 62;
			s61tos70();
			h += s63;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("gadolinium") || name.equals("64") || name.equals("gd")) {
			ctr = 63;
			s61tos70();
			h += s64;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("terbium") || name.equals("65") || name.equals("tb")) {
			ctr = 64;
			s61tos70();
			h += s65;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("dysprosium") || name.equals("66") || name.equals("dy")) {
			ctr = 65;
			s61tos70();
			h += s66;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("holmium") || name.equals("67") || name.equals("ho")) {
			ctr = 66;
			s61tos70();
			h += s67;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("erbium") || name.equals("68") || name.equals("er")) {
			ctr = 67;
			s61tos70();
			h += s68;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("thulium") || name.equals("69") || name.equals("tm")) {
			ctr = 68;
			s61tos70();
			h += s69;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("ytterbium") || name.equals("70") || name.equals("yb")) {
			ctr = 69;
			s61tos70();
			h += s70;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("lutetium") || name.equals("71") || name.equals("lu")) {
			ctr = 70;
			s71tos80();
			h += s71;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("hafnium") || name.equals("72") || name.equals("hf")) {
			ctr = 71;
			s71tos80();
			h += s72;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("tantalum") || name.equals("73") || name.equals("ta")) {
			ctr = 72;
			s71tos80();
			h += s73;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("tungsten") || name.equals("74") || name.equals("w")) {
			ctr = 73;
			s71tos80();
			h += s74;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("rhenium") || name.equals("75") || name.equals("re")) {
			ctr = 74;
			s71tos80();
			h += s75;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("osmium") || name.equals("76") || name.equals("os")) {
			ctr = 75;
			s71tos80();
			h += s76;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("iridium") || name.equals("77") || name.equals("ir")) {
			ctr = 76;
			s71tos80();
			h += s77;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("platinum") || name.equals("78") || name.equals("pt")) {
			ctr = 77;
			s71tos80();
			h += s78;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("gold") || name.equals("79") || name.equals("au")) {
			ctr = 78;
			s71tos80();
			h += s79;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("mercury") || name.equals("80") || name.equals("hg")) {
			ctr = 79;
			s71tos80();
			h += s80;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("thallium") || name.equals("81") || name.equals("tl")) {
			ctr = 80;
			s81tos90();
			h += s81;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("lead") || name.equals("82") || name.equals("pb")) {
			ctr = 81;
			s81tos90();
			h += s82;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("bismuth") || name.equals("83") || name.equals("bi")) {
			ctr = 82;
			s81tos90();
			h += s83;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("polonium") || name.equals("84") || name.equals("po")) {
			ctr = 83;
			s81tos90();
			h += s84;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("astatine") || name.equals("85") || name.equals("at")) {
			ctr = 84;
			s81tos90();
			h += s85;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("radon") || name.equals("86") || name.equals("rn")) {
			ctr = 85;
			s81tos90();
			h += s86;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("francium") || name.equals("87") || name.equals("fr")) {
			ctr = 86;
			s81tos90();
			h += s87;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("radium") || name.equals("88") || name.equals("ra")) {
			ctr = 87;
			s81tos90();
			h += s88;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("actinium") || name.equals("89") || name.equals("ac")) {
			ctr = 88;
			s81tos90();
			h += s89;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("thorium") || name.equals("90") || name.equals("th")) {
			ctr = 89;
			s81tos90();
			h += s90;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("protactinium") || name.equals("91")
				|| name.equals("pa")) {
			ctr = 90;
			s91tos100();
			h += s91;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("uranium") || name.equals("92") || name.equals("u")) {
			ctr = 91;
			s91tos100();
			h += s92;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("neptunium") || name.equals("93") || name.equals("np")) {
			ctr = 92;
			s91tos100();
			h += s93;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("plutonium") || name.equals("94") || name.equals("pu")) {
			ctr = 93;
			s91tos100();
			h += s94;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("americium") || name.equals("95") || name.equals("am")) {
			ctr = 94;
			s91tos100();
			h += s95;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("curium") || name.equals("96") || name.equals("cm")) {
			ctr = 95;
			s91tos100();
			h += s96;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("berkelium") || name.equals("97") || name.equals("bk")) {
			ctr = 96;
			s91tos100();
			h += s97;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("californium") || name.equals("98")
				|| name.equals("cf")) {
			ctr = 97;
			s91tos100();
			h += s98;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("einsteinium") || name.equals("99")
				|| name.equals("es")) {
			ctr = 98;
			s91tos100();
			h += s99;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("fermium") || name.equals("100") || name.equals("fm")) {
			ctr = 99;
			s91tos100();
			h += s100;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("mendelevium") || name.equals("101")
				|| name.equals("md")) {
			ctr = 100;
			s101tos118();
			h += s101;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("nobelium") || name.equals("102") || name.equals("no")) {
			ctr = 101;
			s101tos118();
			h += s102;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("lawrencium") || name.equals("103")
				|| name.equals("lr")) {
			ctr = 102;
			s101tos118();
			h += s103;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("rutherfordium") || name.equals("104")
				|| name.equals("rf")) {
			ctr = 103;
			s101tos118();
			h += s104;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("dubnium") || name.equals("105") || name.equals("db")) {
			ctr = 104;
			s101tos118();
			h += s105;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("seaborgium") || name.equals("106")
				|| name.equals("sg")) {
			ctr = 105;
			s101tos118();
			h += s106;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("bohrium") || name.equals("107") || name.equals("bh")) {
			ctr = 106;
			s101tos118();
			h += s107;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("hassium") || name.equals("108") || name.equals("hs")) {
			ctr = 107;
			s101tos118();
			h += s108;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("meitnerium") || name.equals("109")
				|| name.equals("mt")) {
			ctr = 108;
			s101tos118();
			h += s109;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("darmstadtium") || name.equals("110")
				|| name.equals("ds")) {
			ctr = 109;
			s101tos118();
			h += s110;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("roentgenium") || name.equals("111")
				|| name.equals("rg")) {
			ctr = 110;
			s101tos118();
			h += s111;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("copernicium") || name.equals("112")
				|| name.equals("cn")) {
			ctr = 111;
			s101tos118();
			h += s112;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("ununtrium") || name.equals("113")
				|| name.equals("uut")) {
			ctr = 112;
			s101tos118();
			h += s113;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("flerovium") || name.equals("114") || name.equals("fl")) {
			ctr = 113;
			s101tos118();
			h += s114;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("ununpentium") || name.equals("115")
				|| name.equals("uup")) {
			ctr = 114;
			s101tos118();
			h += s115;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("livermorium") || name.equals("116")
				|| name.equals("lv")) {
			ctr = 115;
			s101tos118();
			h += s116;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("ununseptium") || name.equals("117")
				|| name.equals("uus")) {
			ctr = 116;
			s101tos118();
			h += s117;
			tvlist.setText(Html.fromHtml(h));
		}
		if (name.equals("ununoctium") || name.equals("118")
				|| name.equals("uuo")) {
			ctr = 117;
			s101tos118();
			h += s118;
			tvlist.setText(Html.fromHtml(h));
		}

		// *******************************************************************************
		
		if (ctr == -1 && query.length() >= 1) {
			Toast t = Toast.makeText(this, "Element '" + name + "' doesn't exist",
					Toast.LENGTH_LONG);
			t.show();
			Intent main = new Intent(this, PeriodicTable.class);
			finish();
			startActivity(main);
		}
	}

	public void whenClick(View v) {
		switch (v.getId()) {
		case R.id.bback:
			if(ctr!=0){
				Intent iback = new Intent(this, List.class);
				Bundle back = new Bundle();
				back.putString("0", ctr.toString());
				iback.putExtras(back);
				finish();
				startActivity(iback);
			}
			else if(ctr==0){
				ctr=118;
				Intent iback = new Intent(this, List.class);
				Bundle back = new Bundle();
				back.putString("0", ctr.toString());
				iback.putExtras(back);
				finish();
				startActivity(iback);
			}
			break;
			
		case R.id.bforward:
			if(ctr!=117){
				Integer f = ctr + 2;
				Intent iforward = new Intent(this, List.class);
				Bundle forward = new Bundle();
				forward.putString("0", f.toString());
				iforward.putExtras(forward);
				finish();
				startActivity(iforward);
			}
			else if(ctr==117){
				Integer f = 1;
				Intent iforward = new Intent(this, List.class);
				Bundle forward = new Bundle();
				forward.putString("0", f.toString());
				iforward.putExtras(forward);
				finish();
				startActivity(iforward);
			}
			break;
		}
	}

	public void s1tos10() {

		s1 = new String(
				"<b><i><h2><br> \t\t\t Hydrogen (H) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Non-metal </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  1 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  1.008 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  1 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  0 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  1, 1, s </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> 1s1 (1) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  31±5 pm </font><br>"
						+ "<br><font color=#808080><b> Van der waals radius : </font><font color=#25383C>  120 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.208 (-1) nm </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  2.1 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  1311 kJ.mol -1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  3  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  colorless  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  gas  </font><br>"
						+ "<br><font color=#808080> Density :	</font><br><font color=#25383C> (0 °C, 101.325 kPa) 0.0899x10-3 g.cm-3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  14.01 K, -259.14 °C, -434.45 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  20.28 K, -252.87 °C, -423.17 °F  </font><br>"
						+ "<br><font color=#808080> Triple point : </font><br><font color=#25383C>  13.8033 K (-259°C), 7.042 kPa  </font><br>"
						+ "<br><font color=#808080> Critical point : </font><br><font color=#25383C>  32.97 K, 1.293 MPa  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  (H2) 0.117 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  (H2) 0.904 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  (H2) 28.836 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  hexagonal </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  diamagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  0.1805 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (gas, 27 °C) 1310 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  1333-74-0 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  balloons, Metal refining </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  mines, oil, gas wells </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Henry Cavendish (1766) </font><br>"
						+ "<br><font color=#808080> Named by : </font><br><font color=#25383C>  Antoine Lavoisier (1783) </font><br>");

		s2 = new String(
				"<b><i><h2><br> \t\t\t Helium (He) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Non-metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>   2 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  4.002602 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>   2 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>   2 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  18 (noble gases), 1, s </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> 1s2 (2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  28 pm </font><br>"
						+ "<br><font color=#808080><b> Van der waals radius : </font><font color=#25383C>  140 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  Not known </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  2372.3 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  2  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  colorless  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  gas  </font><br>"
						+ "<br><font color=#808080> Density :	</font><br><font color=#25383C>  (0 °C, 101.325 kPa) 0.1786 g/L </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  (at 2.5 MPa) 0.95 K, −272.20 °C, −457.96 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  4.22 K, −268.93 °C, −452.07 °F  </font><br>"
						+ "<br><font color=#808080> Critical point : </font><br><font color=#25383C>  5.19 K, 0.227 MPa  </font><br>"
						+ "<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  0.0829 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  0.0138 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  5R/2 = 20.786 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  hexagonal close-packed </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  diamagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  0.1513 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  972 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-59-7 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  balloons, deep sea diving </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  natural gas deposit, air  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Pierre Janssen, Norman Lockyer (1868)  </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  William Ramsay, Per Teodor Cleve, Abraham Langlet (1895)  </font><br>");

		s3 = new String(
				"<b><i><h2><br> \t\t\t Lithium (Li) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  3 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  6.94 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  3  </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>   4  </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  1 (alkali metals), 2, s </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [He] 2s1 (2, 1) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  128±7 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  182 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.06 nm </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  0.98 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  520.2 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  2  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery white/grey  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  0.534 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  453.69 K, 180.54 °C, 356.97 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  1615 K, 1342 °C, 2448 °F  </font><br>"
						+ "<br><font color=#808080> Critical point : </font><br><font color=#25383C>  (extrapolated) 3223 K, 67 MPa  </font><br>"
						+ "<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  147.1 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  3.00 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  24.860 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  body-centered cubic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  84.8 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 6000 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7439-93-2 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  batteries, ceramics, lubricants  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  passing electric charge through melted lithium chloride, spodumene  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Johan August Arfwedson (1817)  </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  William Thomas Brande (1821) </font><br>");

		s4 = new String(
				"<b><i><h2><br> \t\t\t Beryllium (Be) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  4 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  9.012182 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  4 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  5 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  2 (alkaline earth metals), 2, s </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [He] 2s2 (2, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  96±3 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  153 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.57 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  899.5 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  1  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  lead grey  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  1.85 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  1560 K, 1287 °C, 2349 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  2742 K, 2469 °C, 4476 °F  </font><br>"
						+ "<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  297 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  12.2 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  16.443 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  hexagonal close-packed </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  diamagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  200 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  12870 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-41-7 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  spacecraft, missiles, aircraft </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  beryl, chrysoberyl  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Louis Nicolas Vauquelin (1797) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Friedrich Wöhler & Antoine Bussy (1828) </font><br>");

		s5 = new String(
				"<b><i><h2><br> \t\t\t\t Boron (B) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Semi-metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  5 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  10.81 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  5 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  6 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  13, 2, p </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [He] 2s2 2p1 (2, 3) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  84±3 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  192 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.027 nm </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  2.04 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  800.6 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  2  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  black  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Liquid density at m.p. :	</font><br><font color=#25383C>  2.08 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  2349 K, 2076 °C, 3769 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  4200 K, 3927 °C, 7101 °F  </font><br>"
						+ "<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  480 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  50.2 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  11.087 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  rhombohedral </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  diamagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  27.4 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 16,200 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-42-8 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  heat resistant alloys  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  kernite  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Joseph Louis Gay-Lussac and Louis Jacques Thénard (30 June 1808) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Humphry Davy (9 July 1808) </font><br>");

		s6 = new String(
				"<b><i><h2><br> \t\t\t\t Carbon (C) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Non-metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  6 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  12.011 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  6 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  6 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  14, 2, p </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [He] 2s2 2p2 (2, 4) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  77(sp³), 73(sp²), 69(sp) pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  170 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.26 nm (-4) ; 0.015 nm (+4) </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  2.55  </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  1086.5 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  3  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  graphite is black, diamond is colourless  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  diamond: 3.515 g·cm−3 <br> graphite: 2.267 g·cm−3 <br> amorphous: 1.8–2.1 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Triple point : </font><br><font color=#25383C>  4600 K (4327°C), 10800 kPa </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  117 (graphite) kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  6.155 (diamond)<br>8.517 (graphite) J·mol−1·K−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C> <br> diamond (diamond, clear) <br>  simple hexagonal (graphite, black)  </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  diamagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C> <br> 900-2300 (diamond)<br> 119-165 (graphite) W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 18350 (diamond) m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-44-0 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  steel, filters  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>   burning with insufficient oxygen  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Egyptians and Sumerians (3750 BC) </font><br>"
						+ "<br><font color=#808080> Recognised as an element by : </font><br><font color=#25383C>  Antoine Lavoisier (1789) </font><br>");

		s7 = new String(
				"<b><i><h2><br> \t\t\t Nitrogen (N) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Non-metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  7 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  14.007 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  7 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  7 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  15 (pnictogens), 2, p </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [He] 2s2 2p3 (2, 5) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  71±1 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  155 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.171 nm (-3) ; 0.011 (+5) ; 0.016 (+3)  </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  3.04 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  1402.3 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  4  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  colourless  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  gas  </font><br>"
						+ "<br><font color=#808080> Density :	</font><br><font color=#25383C>  (0 °C, 101.325 kPa) 1.251 g/L </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  63.15 K, −210.00 °C, −346.00 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  77.36 K, −195.79 °C, −320.33 °F  </font><br>"
						+ "<br><font color=#808080> Triple point : </font><br><font color=#25383C>  63.1526 K (-210°C), 12.53 kPa  </font><br>"
						+ "<br><font color=#808080> Critical point : </font><br><font color=#25383C>  126.19 K, 3.3978 MPa  </font><br>"
						+ "<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  (N2) 5.56 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  (N2) 0.72 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  (N2) 29.124 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  hexagonal </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  diamagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  25.83 × 10−3 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (gas, 27 °C) 353 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7727-37-9 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  forms most of atmosphere  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  from liquid air  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Daniel Rutherford (1772) </font><br>"
						+ "<br><font color=#808080> Named by : </font><br><font color=#25383C>  Jean-Antoine Chaptal (1790) </font><br>");

		s8 = new String(
				"<b><i><h2><br> \t\t\t Oxygen (O) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>   Non-metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  8 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  15.999 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  8 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  8 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  16 (chalcogens), 2, p </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [He] 2s2 2p4 (2, 6) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  66±2 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  152 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.14 nm (-2) </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  3.44 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  1313.9 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  4  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  colourless as a gas, liquid is pale blue  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  gas  </font><br>"
						+ "<br><font color=#808080> Density :	</font><br><font color=#25383C>  (0 °C, 101.325 kPa) 1.429 g/L </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  54.36 K, -218.79 °C, -361.82 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  90.20 K, -182.95 °C, -297.31 °F  </font><br>"
						+ "<br><font color=#808080> Critical point : </font><br><font color=#25383C>  154.59 K, 5.043 MPa  </font><br>"
						+ "<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  (O2) 6.82 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  (O2) 0.444 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C> (O2) 29.378 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  cubic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  26.58x10-3  W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (gas, 27 °C) 330 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7782-44-7 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  supports life  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  from liquid air  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Carl Wilhelm Scheele (1772) </font><br>"
						+ "<br><font color=#808080> Named by : </font><br><font color=#25383C>  Antoine Lavoisier (1777) </font><br>");

		s9 = new String(
				"<b><i><h2><br> \t\t\t Fluorine (F) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Non-metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  9 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  18.9984032 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  9 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  10 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  17 (halogens), 2, p </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [He] 2s2 2p5 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  64 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  135 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.136 nm (-1); 0.007 (+7)  </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  3.98 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  1,681 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  2  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  colourless  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  gas  </font><br>"
						+ "<br><font color=#808080> Density :	</font><br><font color=#25383C>  (0 °C, 101.325 kPa) 1.696[3] g/L </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  53.53 K, −219.62 °C, −363.32 °F   </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  85.03 K, −188.12 °C, −306.62 °F   </font><br>"
						+

						"<br><font color=#808080> Critical point : </font><br><font color=#25383C>  144.4 K, 5.215 MPa  </font><br>"
						+ "<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  6.51 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  (Cp) (21.1 °C) 825 J·mol−1·K−1 <br> (Cv) (21.1 °C) 610 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  monoclinic - alpha state (low-temperature) <br> cubic - beta state (high-temperature)  </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  diamagnetic, −1.2×10−4 (SI) </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  0.02591 W·m−1·K−1 </font><br>"

						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7782-41-4 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  Refrigerants  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>   mineral fluorite  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  André-Marie Ampère (1810) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Henri Moissan (June 26, 1886) </font><br>");

		s10 = new String(
				"<b><i><h2><br> \t\t\t\t Neon (Ne) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Non-metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  10 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  20.1797 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  10 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  10 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  18 (noble gases), 2, p </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [He] 2s2 2p6 (2, 8) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  58 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  154 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  Not known </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  2080.7 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  3  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  colourless  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  gas  </font><br>"
						+ "<br><font color=#808080> Density :	</font><br><font color=#25383C>  (0 °C, 101.325 kPa) 0.9002 g/L  </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  24.56 K, -248.59 °C, -415.46 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  27.07 K, -246.08 °C, -410.94 °F  </font><br>"
						+ "<br><font color=#808080> Triple point : </font><br><font color=#25383C>  24.5561 K (-249°C), 43 kPa  </font><br>"
						+ "<br><font color=#808080> Critical point : </font><br><font color=#25383C>  44.4 K, 2.76 MPa  </font><br>"
						+ "<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  1.71 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  0.335 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  5R/2 = 20.786 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  face-centered cubic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  diamagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  49.1x10-3  W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (gas, 0 °C) 435 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-01-9 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  lighting </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  liquid air  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  William Ramsay & Morris Travers (1898) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  William Ramsay & Morris Travers (1898) </font><br>");

	}

	public void s11tos20() {
		s11 = new String(
				"<b><i><h2><br> \t\t\t Sodium (Na) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  11 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  22.98976928 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  11 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  12 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  1 (alkali metals), 3, s </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Ne] 3s1 (2,8,1) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  166±9 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  227 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.095 (+1) nm </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  0.93 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  495.8 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  3  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery white  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.):	</font><br><font color=#25383C>  0.968 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  370.87 K, 97.72 °C, 207.9 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  1156 K, 883 °C, 1621 °F  </font><br>"
						+

						"<br><font color=#808080> Critical point : </font><br><font color=#25383C>  (extrapolated) 2573 K, 35 MPa  </font><br>"
						+ "<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  97.42 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  2.60 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  28.230 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  body-centered cubic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  142 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 3200 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-23-5 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  medicine, agriculture  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  table salts and other foods  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Humphry Davy (1807) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Humphry Davy (1807) </font><br>");

		s12 = new String(
				"<b><i><h2><br> \t\t\t Magnesium (Mg) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  12 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  24.3050 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  12 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  12 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  2 (alkaline earth metals), 3, s </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Ne] 3s2 (2, 8, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  141±7 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  173 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.065 nm </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.31 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  737.7 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  5  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery white  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  1.738 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  923 K, 650 °C, 1202 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  1363 K, 1091 °C, 1994 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  128 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  8.48 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  24.869 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  hexagonal close-packed </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  156 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (r.t.) (annealed) 4940 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7439-95-4 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  airplanes, missiles  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  sea water </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Joseph Black (1755) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Humphry Davy (1808) </font><br>");

		s13 = new String(
				"<b><i><h2><br> \t\t\t Aluminium (Al) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  13 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  26.9815386 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  13 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  14 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  13, 3, p </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Ne] 3s2 3p1 (2, 8, 3) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  121±4 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  184 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.05 nm </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.61 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  577.5 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  3  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.):	</font><br><font color=#25383C>  2.70 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  933.47 K, 660.32 °C, 1220.58 °F   </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  2792 K, 2519 °C, 4566 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  294.0 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  10.71 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  24.200 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  face-centered cubic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  237 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (r.t.) (rolled) 5,000 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7429-90-5 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  airplanes, soda cans  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  bauxite  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Prediction : </font><br><font color=#25383C>  Antoine Lavoisier (1787) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Friedrich Wöhler (1827) </font><br>");

		s14 = new String(
				"<b><i><h2><br> \t\t\t\t Silicon (Si) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Semi-metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  14 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  28.085 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  14 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  14 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  14, 3, p </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Ne] 3s2 3p2 (2, 8, 4) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  111 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  210 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.271 (-4) nm ; 0.041(+4) </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.90  </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  786.5 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  5  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  dark grey with a bluish tinge  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  2.3290 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  1687 K, 1414 °C, 2577 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  3538 K, 3265 °C, 5909 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  359 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  50.21 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  19.789 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  diamond cubic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  diamagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  149 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 8433 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-21-3 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  glass, semiconductors  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  Second most abundant element. Found in clay, granite, quartz, sand  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Jöns Jacob Berzelius (1823) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Jöns Jacob Berzelius (1823) </font><br>");

		s15 = new String(
				"<b><i><h2><br> \t\t\t Phosphorus (P) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Non-metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  15 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  30.973762 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  15 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  16 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  15 (pnictogens), 3, p </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Ne] 3s2 3p3 (2, 8, 5) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  107±3 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  180 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0,34 Å </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  2.19 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  1011.8 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"

						+ "<br><font color=#808080> Color : </font><font color=#25383C>  colourless/red/silvery white  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  (white) 1.823, (red) ≈ 2.2 – 2.34, (violet) 2.36, (black) 2.69 g·cm−3  </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  (white) 44.2 °C, (black) 610 °C  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  (white) 280.5 °C  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  (white) 12.4 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  (white) 0.66 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C> (white) 23.824 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  triclinic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  (white, red, violet, black) diamagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  (white) 0.236, (black) 12.1 W·m−1·K−1 </font><br>"

						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7723-14-0 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  fertilizers, detergents  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  phosphate rock  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Hennig Brand (1669) </font><br>"
						+ "<br><font color=#808080> Recognised as an element by : </font><br><font color=#25383C>  Antoine Lavoisier (1777) </font><br>");

		s16 = new String(
				"<b><i><h2><br> \t\t\t\t Sulfur (S) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Non-metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  16 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  32.06 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  16 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  16 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  16 (chalcogens), 3, p </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Ne] 3s2 3p4 (2, 8, 6) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  105±3 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  180 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.184 (-2) nm ; 0.029 (+6) </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  2.58 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  999.6 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  5  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  lemon yellow  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  (alpha) 2.07 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  388.36 K, 115.21 °C, 239.38 °F </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  717.8 K, 444.6 °C, 832.3 °F  </font><br>"
						+

						"<br><font color=#808080> Critical point : </font><br><font color=#25383C>  1314 K, 20.7 MPa  </font><br>"
						+ "<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  (mono) 45 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  (mono) 1.727 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  22.75 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  orthorhombic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  diamagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  (amorphous) 0.205 W·m−1·K−1 </font><br>"

						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7704-34-9 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  matches, gunpowder, medicines  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  naturally </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Chinese (Before 2000BC) </font><br>"
						+ "<br><font color=#808080> Recognized as an element by  : </font><br><font color=#25383C>  Antoine Lavoisier (1777) </font><br>");

		s17 = new String(
				"<b><i><h2><br> \t\t\t Chlorine (Cl) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Non-metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  17 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  35.45 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  17 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  18 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  17 (halogens), 3, p </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Ne] 3s2 3p5 (2, 8, 7) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  102±4 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  175 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.184 (-2) nm ; 0.029 nm (+6) </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  3.16  </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  1251.2 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  4  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  yellowish green  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  gas  </font><br>"
						+ "<br><font color=#808080> Density :	</font><br><font color=#25383C>  (0 °C, 101.325 kPa) 3.2 g/L </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  171.6 K, -101.5 °C, -150.7 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  239.11 K, -34.04 °C, -29.27 °F  </font><br>"
						+

						"<br><font color=#808080> Critical point : </font><br><font color=#25383C>  416.9 K, 7.991 MPa  </font><br>"
						+ "<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  (Cl2) 20.41 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  (Cl2) 6.406 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C> (Cl2) 33.949 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  orthorhombic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  diamagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  8.9×10−3  W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (gas, 0 °C) 206 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7782-50-5 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  Water purification, bleaches </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  Salt  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Carl Wilhelm Scheele (1774) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Carl Wilhelm Scheele (1774) </font><br>");

		s18 = new String(
				"<b><i><h2><br> \t\t\t\t Argon (Ar) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Non-metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  18 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  39.948 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  18 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  22 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  18 (noble gases), 3, p </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Ne] 3s2 3p6 (2, 8, 8) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  106±10 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  188 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not knwon </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  Not known </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  1520.6 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  6  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  colourless  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  gas  </font><br>"
						+ "<br><font color=#808080> Density :	</font><br><font color=#25383C>  (0 °C, 101.325 kPa) 1.784 g/L </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  83.80 K, −189.35 °C, −308.83 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  87.30 K, −185.85 °C, −302.53 °F  </font><br>"
						+ "<br><font color=#808080> Triple point : </font><br><font color=#25383C>  83.8058 K (-189°C), 69 kPa  </font><br>"
						+ "<br><font color=#808080> Critical point : </font><br><font color=#25383C>  150.87 K, 4.898 MPa  </font><br>"
						+ "<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  6.43 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  1.18 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  5R/2 = 20.786 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  face-centered cubic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  diamagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  17.72x10-3  W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (gas, 27 °C) 323 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440–37–1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  Lighting  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  air  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Lord Rayleigh and William Ramsay (1894) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Lord Rayleigh and William Ramsay (1894) </font><br>");

		s19 = new String(
				"<b><i><h2><br> \t\t\t Potassium (K) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>   Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  19 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  39.0983 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  19 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  20 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  1 (alkali metals), 4, s </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Ar] 4s1 (2, 8, 8, 1) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  203±12 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  275 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.133 (+1) </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  0.82  </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  418.8 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  5  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery white  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  0.862 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  336.53 K, 63.38 °C, 146.08 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  1032 K, 759 °C, 1398 °F  </font><br>"
						+ "<br><font color=#808080> Triple point : </font><br><font color=#25383C>  336.35 K (63°C),  kPa  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  76.9 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  2.33 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  29.6 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  body-centered cubic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  102.5 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 2000 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-09-7 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  glass, soap  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  minerals (carnallite)  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Humphry Davy (1807) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Humphry Davy (1807) </font><br>");

		s20 = new String(
				"<b><i><h2><br> \t\t\t Calcium (Ca) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  20 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  40.078 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  20 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  20 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  2 (alkaline earth metals), 4, s </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Ar] 4s2 (2, 8, 8, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  176±10 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  231 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.099 nm </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.00  </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  589.8 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  10  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery white  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  1.55 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  1115 K, 842 °C, 1548 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  1757 K, 1484 °C, 2703 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  154.7 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  8.54 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  25.929 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  face-centered cubic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  diamagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  201 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 3810 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-70-2 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  life forms for bones and shells  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  chalk, limestone, marble. 3.5% of crust  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Humphry Davy (1808) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Humphry Davy (1808) </font><br>");
	}

	public void s21tos30() {
		s21 = new String(
				"<b><i><h2><br> \t\t\t Scandium (Sc) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  21 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  44.955912 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  21 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  24 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  3, 4, d </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Ar] 3d1 4s2 (2, 8, 9, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  170±7 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  211 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.083 nm (+3) </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.36 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  633.1 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  7  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery white  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  2.985 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  1814 K, 1541 °C, 2806 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  3109 K, 2836 °C, 5136 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  332.7 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  14.1 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  25.52 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  hexagonal close-packed </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  15.8 W·m−1·K−1 </font><br>"

						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-20-2 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  No uses known  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  minerals (thortveitile, wiikite)  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Lars Fredrik Nilson (1879) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Lars Fredrik Nilson (1879) </font><br>");

		s22 = new String(
				"<b><i><h2><br> \t\t\t Titanium (Ti) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  22 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  47.867 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  22 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  26 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  4, 4, d </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Ar] 3d2 4s2 (2, 8, 10, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  160±8 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.09 nm (+2) ; 0.068 nm (+4) </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.54 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  658.8 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  8  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery metallic  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  4.506 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  1941 K, 1668 °C, 3034 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  3560 K, 3287 °C, 5949 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  425 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  14.15 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  25.060 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  hexagonal close-packed </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  21.9 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (r.t.) 5,090 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-32-6 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  paint, rubber, paper  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  minerals (ilmenite, rutile)  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  William Gregor (1791) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Jöns Jakob Berzelius (1825) </font><br>");

		s23 = new String(
				"<b><i><h2><br> \t\t\t Vanadium (V) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  23 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  50.9415 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  23 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  28 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  5, 4, d </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Ar] 3d3 4s2 (2, 8, 11, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  153±8 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.074 nm (+3) ; 0.059 (+5)  </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.63  </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  650.9 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  5  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery grey metallic  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  6.0 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  2183 K, 1910 °C, 3470 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  3680 K, 3407 °C, 6165 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  459 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  21.5 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  24.89 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  body-centered cubic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  30.7 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 4560 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-62-2 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  catalyst, dye, color-fixer  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  minerals (patronite, vanadinite)  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Andrés Manuel del Río (1801) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Nils Gabriel Sefström (1830) </font><br>");

		s24 = new String(
				"<b><i><h2><br> \t\t\t Chromium (Cr) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  24 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  51.9961 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  24 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  28 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  6, 4, d </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Ar] 3d5 4s1 (2, 8, 13, 1) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  139±5 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.061 nm (+3) ; 0.044 nm (+6) </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.66 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>   652.9 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  6  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery metallic  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  7.19 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  2180 K, 1907 °C, 3465 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  2944 K, 2671 °C, 4840 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  339.5 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  21.0 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  23.35 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  body-centered cubic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  AFM (rather: SDW) </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  93.9 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 5940 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-47-3 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  Stainless steel  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  Chromite  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Louis Nicolas Vauquelin (1797) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Louis Nicolas Vauquelin (1797) </font><br>");

		s25 = new String(
				"<b><i><h2><br> \t\t\t Manganese (Mn) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  25 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  54.938045 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  25 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  30 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  7, 4, d </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Ar] 4s2 3d5 (2, 8, 13, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  139±5 (low spin), 161±8 (high spin) pm  </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.08 nm (+2) ; 0.046 nm (+7) </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.55  </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  717.3 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  7  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery metallic  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  7.21 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  1519 K, 1246 °C, 2275 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  2334 K, 2061 °C, 3742 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  221 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  12.91 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  26.32 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  body-centered cubic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  7.81 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 5150 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7439-96-5 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  steel, batteries, ceramics  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  pyrolusite, psilomelane, rhodochrosite  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Torbern Olof Bergman (1770) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Johann Gottlieb Gahn (1774) </font><br>");

		s26 = new String(
				"<b><i><h2><br> \t\t\t\t Iron (Fe) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  26 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  55.845 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  26 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  30 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  8, 4, d </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Ar] 3d6 4s2 (2, 8, 14, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  132±3 (low spin), 152±6 (high spin) pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.076 nm (+2) ; 0.064 nm (+3) </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.83 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  762.5 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  8  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  lustrous, metallic, greyish tinge  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  7.874 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  1811 K, 1538 °C, 2800 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  3134 K, 2862 °C, 5182 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  340 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  13.81 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  25.10 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  body-centered cubic (a=286.65 pm) <br> face-centered cubic (between 1185–1667 K)  </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  ferromagnetic 1043 K </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  80.4 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (r.t.) (electrolytic) 5120 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7439-89-6 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  steel, hemoglobin (carries oxygen in blood)  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  iron ores  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  before 5000 BC </font><br>");

		s27 = new String(
				"<b><i><h2><br> \t\t\t Cobalt (Co) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  27 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  58.933195 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  27 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  32 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  9, 4, d </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Ar] 4s2 3d7 (2, 8, 15, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  126±3 (low spin), 150±7 (high spin) pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.078 nm (+2) ; 0.063 nm (+3) </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.88  </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  760.4 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  8  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  lustrous, metallic, greyish tinge  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  8.90 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  1768 K, 1495 °C, 2723 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  3200 K, 2927 °C, 5301 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  377 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  16.06 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  24.81 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  hexagonal close-packed </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  ferromagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  100 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 4720 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-48-4 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  magnets, ceramics, special glasses </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  arsenic, oxygen, sulfur, cobaltine  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Georg Brandt (1732) </font><br>");

		s28 = new String(
				"<b><i><h2><br> \t\t\t Nickel (Ni) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  28 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  58.6934 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  28 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  31 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  10, 4, d </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Ar] 4s2 3d8 or [Ar] 4s1 3d9 (2, 8, 16, 2 or 2, 8, 17, 1) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  124±4 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  163 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.069 nm (+2) ; 0.06 nm (+3) </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.91 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  737.1 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  10  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  lustrous, metallic, silvery tinge  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  8.908 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  1728 K, 1455 °C, 2651 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  3186 K, 2913 °C, 5275 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  377.5 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  17.48 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  26.07 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  face-centered cubic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  ferromagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  90.9 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (r.t.) 4900 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-02-0 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  electroplating metal alloys, nickel-cadmium batteries  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  pentlandite  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Axel Fredrik Cronstedt (1751) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Axel Fredrik Cronstedt (1751) </font><br>");

		s29 = new String(
				"<b><i><h2><br> \t\t\t Copper (Cu) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  29 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  63.546 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  29 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  35 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  11, 4, d </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Ar] 3d10 4s1 (2, 8, 18, 1) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  132±4 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  140 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.096 nm (+1) ; 0.069 nm (+3) </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.90 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  745.5 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  6  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  copper, metallic  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  8.96 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  1357.77 K, 1084.62 °C, 1984.32 °F   </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  2835 K, 2562 °C, 4643 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  300.4 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  13.26 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  24.440 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  face-centered cubic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  diamagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  401 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (r.t.) (annealed) 3810 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-50-8 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  electrical conductor, jewelry, coins, plumbing  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  chalcopyrite, coveline, chalcosine  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Middle Easterns (9000 BC) </font><br>");

		s30 = new String(
				"<b><i><h2><br> \t\t\t\t Zinc (Zn) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  30 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  65.38 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  30 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  35 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  12, 4, d </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Ar] 3d10 4s2 (2, 8, 18, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  122±4 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  139 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.074 nm (+2) </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.65 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  906.4 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  10  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  bluish pale grey  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  7.14 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  692.68 K, 419.53 °C, 787.15 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  1180 K, 907 °C, 1665 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  123.6 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  7.32 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  25.470 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  hexagonal close-packed </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  diamagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  116 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (r.t.) (rolled) 3850 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-66-6 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  metal coating, rust protection, brass, bronze, nickel  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  zinc blende, calamine  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Indian metallurgists (before 1000 BC) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Andreas Sigismund Marggraf (1746) </font><br>");
	}

	public void s31tos40() {
		s31 = new String(
				"<b><i><h2><br> \t\t\t Gallium (Ga) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  31 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  69.723 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  31 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  39 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  13, 4, p </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Ar] 4s2 3d10 4p1 (2, 8, 18, 3) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  122±3 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  187 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.083 nm (+3) </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.81 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  578.8 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  6  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery white  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  5.91 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  302.9146 K, 29.7646 °C, 85.5763 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  2477 K, 2204 °C, 3999 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  254 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  5.59 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  25.86 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  orthorhombic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  diamagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  40.6 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 2740 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-55-3 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  semiconductor production  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  bauxite, germanite, coal  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Lecoq de Boisbaudran (1875) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Lecoq de Boisbaudran (1875) </font><br>");

		s32 = new String(
				"<b><i><h2><br> \t\t\t Germanium (Ge) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Semi-metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  32 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  72.63 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  32 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  41 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  14, 4, p </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Ar] 3d10 4s2 4p2 (2, 8, 18, 4) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  122 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  211 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.093 nm (+2) ; 0.054 nm (+4) </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  2.01 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  762 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  9  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  greyish white  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  5.323 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  1211.40 K, 938.25 °C, 1720.85 °F   </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  3106 K, 2833 °C, 5131 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  334 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  36.94 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  23.222 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  diamond cubic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  Diamagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  60.2 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 5400 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-56-4 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  semiconductors  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  refining of copper, zinc, lead  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Clemens Winkler (1886) </font><br>");

		s33 = new String(
				"<b><i><h2><br> \t\t\t\t Arsenic (As) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>   Semi-metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  33 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  74.92160 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  33 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  42 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  15 (pnictogens), 4, p </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Ar] 4s2 3d10 4p3 (2, 8, 18, 5) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  119±4 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  185 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.222 nm (-2) 0,047 nm (+5) 0,058 (+3) </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  2.18 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  947.0 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  8  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  metallic grey  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  5.727 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Triple point : </font><br><font color=#25383C>  1090 K (817°C), 3628 kPa  </font><br>"
						+ "<br><font color=#808080> Critical point : </font><br><font color=#25383C>  1673 K, ? MPa  </font><br>"
						+ "<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>   ? 34.76 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  (grey) 24.44 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  24.64 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  simple trigonal </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  diamagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  50.2 W·m−1·K−1 </font><br>"

						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-38-2 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>   Poison, conducts electricity, semiconductors  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  mispickel  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Early Bronze Age (2500 BC) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Albertus Magnus (1250) </font><br>");

		s34 = new String(
				"<b><i><h2><br> \t\t\t Selenium (Se) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Non-metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  34 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  78.96 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  34 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  45 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  16 (chalcogens), 4, p </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Ar] 3d10 4s2 4p4 (2, 8, 18, 6) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  120±4 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  190 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.198 nm (-2) ; 0.042 nm (+6)  </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  2.55 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  941.0 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  9  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  grey, metallic lustre  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  (gray) 4.81 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  494 K, 221 °C, 430 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  958 K, 685 °C, 1265 °F  </font><br>"
						+

						"<br><font color=#808080> Critical point : </font><br><font color=#25383C>  1766 K, 27.2 MPa  </font><br>"
						+ "<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  95.48 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  (gray) 6.69 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  25.363 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  hexagonal </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  diamagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  (25 °C) (amorphous) 37 µm·m−1·K−1  </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 3350 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7782-49-2 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  photoelectric cells, TV cameras  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  refining of lead, copper, nickel  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Jöns Jakob Berzelius and Johann Gottlieb Gahn (1817) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Jöns Jakob Berzelius and Johann Gottlieb Gahn (1817) </font><br>");

		s35 = new String(
				"<b><i><h2><br> \t\t\t Bromine (Br) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Non-metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  35 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  79.904 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  35 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  45 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  17 (halogens), 4, p </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Ar] 4s2 3d10 4p5 (2, 8, 18, 7) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  120±3 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  185 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.195 nm (-1) </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  2.96 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  1139.9 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  10  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  red-brown, metallic lustre when solid  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  liquid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  (Br2, liquid) 3.1028 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  265.8 K, -7.2 °C, 19 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  332.0 K, 58.8 °C, 137.8 °F  </font><br>"
						+

						"<br><font color=#808080> Critical point : </font><br><font color=#25383C>  588 K, 10.34 MPa  </font><br>"
						+ "<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  (Br2) 29.96 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  (Br2) 10.571 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  (Br2) 75.69 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  orthorhombic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  diamagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  0.122 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20°C) 206 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7726-95-6 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  Poisonous  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  Sea Water </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Antoine Jérôme Balard and Leopold Gmelin (1825) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Antoine Jérôme Balard and Leopold Gmelin (1825) </font><br>");

		s36 = new String(
				"<b><i><h2><br> \t\t\t Krypton (Kr) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Non-metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  36 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  83.798 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  36 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  48 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  18 (noble gases), 4, p </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Ar] 3d10 4s2 4p6 (2, 8, 18, 8) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  116±4 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  202 pm </font><br>"

						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  3.00  </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  1350.8 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  15  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  colourless  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  gas  </font><br>"
						+ "<br><font color=#808080> Density :	</font><br><font color=#25383C>  (0 °C, 101.325 kPa) 3.749 g/L </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  115.79 K, -157.36 °C, -251.25 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  119.93 K, -153.22 °C, -244.12 °F  </font><br>"
						+ "<br><font color=#808080> Triple point : </font><br><font color=#25383C>  115.775 K (-157°C), 73.2 kPa  </font><br>"
						+ "<br><font color=#808080> Critical point : </font><br><font color=#25383C>  209.41 K, 5.50 MPa  </font><br>"
						+ "<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  9.08 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  1.64 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  5R/2 = 20.786 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  cubic face-centered </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  diamagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  9.43×10-3  W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (gas, 23 °C) 220, (liquid) 1120 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7439-90-9 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  Lighting  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  production of liquid air  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  William Ramsay and Morris Travers (1898) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  William Ramsay and Morris Travers (1898) </font><br>");

		s37 = new String(
				"<b><i><h2><br> \t\t\t Rubidium (Rb) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  37 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  85.4678 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  37 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  48 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  1 (alkali metals), 5, s </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Kr] 5s1 (2, 8, 18, 8, 1) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  220±9 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  303 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.149 nm (+1) </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  0.82  </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  403 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  11  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery white  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  1.532 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  312.46 K, 39.31 °C, 102.76 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  961 K, 688 °C, 1270 °F  </font><br>"
						+

						"<br><font color=#808080> Critical point : </font><br><font color=#25383C>  (extrapolated) 2093 K, 16 MPa  </font><br>"
						+ "<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  75.77 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  2.19 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  31.060 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  body-centered cubic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  58.2 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 1300 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-17-7 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  catalyst, photocells  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  lithium production  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Robert Bunsen and Gustav Kirchhoff (1861) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  George de Hevesy </font><br>");

		s38 = new String(
				"<b><i><h2><br> \t\t\t Strontium (Sr) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  38 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  87.62 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  38 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  50 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  2 (alkaline earth metals), 5, s </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Kr] 5s2 (2, 8, 18, 8, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  195±10 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  249 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.113 nm (+2) </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  0.95  </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  549.5 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  14  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery white  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  2.64 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  1050 K, 777 °C, 1431 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  1655 K, 1382 °C, 2520 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  136.9 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  7.43 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  26.4 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  face-centered cubic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  35.4 W·m−1·K−1 </font><br>"

						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-24-6 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  flares, fireworks, crimson color  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  celestite, strontianite  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  William Cruickshank (1787) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Humphry Davy (1808) </font><br>");

		s39 = new String(
				"<b><i><h2><br> \t\t\t Yttrium (Y) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  39 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  88.90585 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  39 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  50 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  3, 5, d </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Kr] 4d1 5s2 (2, 8, 18, 9, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  190±7 pm </font><br>"

						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.22  </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  600 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  10  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery white  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  4.472 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  1799 K, 1526 °C, 2779 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  3609 K, 3336 °C, 6037 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  365 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  11.42 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  26.53 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  hexagonal close-packed </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  17.2 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 3300 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-65-5 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  color TV's, radars  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  monazite, xenotime, yettriac </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Johan Gadolin (1794) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Carl Gustav Mosander (1840) </font><br>");

		s40 = new String(
				"<b><i><h2><br> \t\t\t Zirconium (Zr) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  40 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  91.224 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  40 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  51 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  4, 5, d </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Kr] 5s2 4d2 (2, 8, 18, 10, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  175±7 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.08 nm (+4) </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.33 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  640.1 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  11  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery white  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  6.52 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  2128 K, 1855 °C, 3371 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  4682 K, 4409 °C, 7968 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  573 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  14 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  25.36 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  hexagonal close-packed </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  22.6 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 3800 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-67-7 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  nuclear applications </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  zircon, baddeleyite  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Martin Heinrich Klaproth (1789) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Jöns Jakob Berzelius (1824) </font><br>");
	}

	public void s41tos50() {
		s41 = new String(
				"<b><i><h2><br> \t\t\t Niobium (Nb) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  41 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  92.90638 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  41 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  52 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  5, 5, d </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Kr] 4d4 5s1 (2, 8, 18, 12, 1) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  164±6 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.070 nm (+5) ; 0.069 nm (+4) </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.6  </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  652.1 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  14  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  grey metallic  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  8.57 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  2750 K, 2477 °C, 4491 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  5017 K, 4744 °C, 8571 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  689.9 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  30 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  24.60 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  cubic body-centered </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  53.7 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 3480 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-03-1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  No uses known  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  columbite  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Charles Hatchett (1801) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Christian Wilhelm Blomstrand (1864) </font><br>");

		s42 = new String(
				"<b><i><h2><br> \t\t\t Molybdenum (Mo) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  42 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  95.96 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  42 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  54 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  6, 5, d </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Kr] 5s1 4d5 (2, 8, 18, 13, 1) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  154±5 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.068 nm (+4) ; 0.06 nm (+6) </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  2.16 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>   684.3 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  11  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  grey metallic  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  10.28 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  2896 K, 2623 °C, 4753 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  4912 K, 4639 °C, 8382 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  598 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  37.48 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  24.06 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  body-centered cubic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  138 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (r.t.) 5400 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7439-98-7 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  aircraft, missiles  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  molybdenite, wulfenite  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Carl Wilhelm Scheele (1778) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Peter Jacob Hjelm (1781) </font><br>");

		s43 = new String(
				"<b><i><h2><br> \t\t\t Technetium (Tc) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  43 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  98 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  43 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  55 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  7, 5, d </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Kr] 4d5 5s2 (2, 8, 18, 13, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  147±7 pm </font><br>"

						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.9  </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  702 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  9  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery grey metallic  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  11 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  2430 K, 2157 °C, 3915 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  4538 K, 4265 °C, 7709 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  585.2 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  33.29 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  24.27 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  hexagonal close-packed </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  Paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  50.6 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 16,200 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-26-8 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  Tc-99m is used for radioactive tracing in medicine  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  Man-made  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Carlo Perrier and Emilio Segrè (1937) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Carlo Perrier and Emilio Segrè (1937) </font><br>");

		s44 = new String(
				"<b><i><h2><br> \t\t\t Ruthenium (Ru) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  44 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  101.07 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  44 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  57 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  8, 5, d </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Kr] 4d7 5s1 (2, 8, 18, 15, 1) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  146±7 pm </font><br>"

						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  2.2  </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  710.2 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  11  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery white metallic  </font><br>"

						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  12.45 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  2607 K, 2334 °C, 4233 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  4423 K, 4150 °C, 7502 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  591.6 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  38.59 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  24.06 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  hexagonal close-packed </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  117 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 5970 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-18-8 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  platinum alloys  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  pentlandite, pyroxinite  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Jędrzej Śniadecki (1807) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Jędrzej Śniadecki (1807) </font><br>");

		s45 = new String(
				"<b><i><h2><br> \t\t\t Rhodium (Rh) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  45 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  102.90550 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  45 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  58 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  9, 5, d </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Kr] 5s1 4d8 (2, 8, 18, 16, 1) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  142±7 pm </font><br>"

						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  2.28 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  719.7 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  9  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery white metallic  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  12.41 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  2237 K, 1964 °C, 3567 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  3968 K, 3695 °C, 6683 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  494 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  26.59 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  24.98 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  face-centered cubic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  150 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 4700 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-16-6 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  coatings </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  by-product of nickel production  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  William Hyde Wollaston (1804) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  William Hyde Wollaston (1804) </font><br>");

		s46 = new String(
				"<b><i><h2><br> \t\t\t Palladium (Pd) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  46 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  106.42 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  46 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  60 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  10, 5, d </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Kr] 4d10 (2, 8, 18, 18) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  139±6 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  163 pm </font><br>"

						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  2.20 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  804.4 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  9  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery white metallic  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  12.023 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  1828.05 K, 1554.9 °C, 2830.82 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  3236 K, 2963 °C, 5365 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  362 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  16.74 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  25.98 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  face-centered cubic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  71.8 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 3070 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-05-3 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  jewelry, medical instruments  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  platinum, nickel, copper, mercury ores  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  William Hyde Wollaston (1803) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  William Hyde Wollaston (1803) </font><br>");

		s47 = new String(
				"<b><i><h2><br> \t\t\t\t Silver (Ag) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  47 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  107.8682 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  47 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  61 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  11, 5, d </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Kr] 4d10 5s1 (2, 8, 18, 18, 1) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  145±5 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  172 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.126 nm </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.93 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  731.0 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  11  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silver  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  10.49 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  1234.93 K, 961.78 °C, 1763.2 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  2435 K, 2162 °C, 3924 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  250.58 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  11.28 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  25.350 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  face-centered cubic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  diamagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  429 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (r.t.) 2680 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-22-4 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  jewelry, photography, electrical conductor  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  ores (argentite, light ruby silver, dark ruby silver, brittle silver)  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  before 5000 BC </font><br>");

		s48 = new String(
				"<b><i><h2><br> \t\t\t Cadmium (Cd) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  48 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  112.411 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  48 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  64 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  12, 5, d </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Kr] 5s2 4d10 (2, 8, 18, 18, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  144±9 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  158 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.097 nm (+2) </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.69 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  867.8 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  15  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery grey metallic  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  8.65 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  594.22 K, 321.07 °C, 609.93 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  1040 K, 767 °C, 1413 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  99.87 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  6.21 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  26.020 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  hexagonal close-packed </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  diamagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  96.6 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 2310 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-43-9 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  poisonous, nickel-cadmium batteries  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  by-product of zinc refining  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Karl Samuel Leberecht Hermann and Friedrich Stromeyer (1817) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Karl Samuel Leberecht Hermann and Friedrich Stromeyer (1817) </font><br>");

		s49 = new String(
				"<b><i><h2><br> \t\t\t Indium (In) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  49 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  114.818 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  49 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  66 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  13, 5, p </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Kr] 4d10 5s2 5p1 (2, 8, 18, 18, 3) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  142±5 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  193 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.092 nm (+2) </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.78   </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  558.3 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  11  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery lustrous grey  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  7.31 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  429.7485 K, 156.5985 °C, 313.8773 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  2345 K, 2072 °C, 3762 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  231.8 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  3.281 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  26.74 J·mol−1·K−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  tetragonal </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  diamagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  81.8 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 1215 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-74-6 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  coating of high-speed bearings  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  by-product of zinc refining  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Ferdinand Reich and Hieronymous Theodor Richter (1863) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Hieronymous Theodor Richter (1867) </font><br>");

		s50 = new String(
				"<b><i><h2><br> \t\t\t\t Tin (Sn) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  50 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  118.710 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  50 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  69 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  14, 5, p </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Kr] 4d10 5s2 5p2 (2, 8, 18, 18, 4) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  139±4 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  217 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.112 nm (+2) ; 0.070 nm (+4) </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.96 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  708.6 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  20  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery lustrous grey  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  (white) 7.365 g·cm−3 <br> (gray) 5.769 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  505.08 K, 231.93 °C, 449.47 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  2875 K, 2602 °C, 4716 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  (white) 296.1 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  (white) 7.03 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  (white) 27.112 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  tetragonal (white) <br> diamond cubic (gray) </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  (gray) diamagnetic, (white) paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  66.8 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (r.t.) (rolled) 2730 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-31-5 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  coating for steel cans  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  ore cassiterite  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  around 3500 BC </font><br>");
	}

	public void s51tos60() {
		s51 = new String(
				"<b><i><h2><br> \t\t\t Antimony (Sb) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Semi-metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  51 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  121.760 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  51 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  71 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  15 (pnictogens), 5, p </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Kr] 4d10 5s2 5p3 (2, 8, 18, 18, 5) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  139±5 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  206 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.245 nm (-3); 0.062 nm (+5); 0.076 nm (+3)  </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  2.05 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  834 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  12  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery lustrous grey  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  6.697 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  903.78 K, 630.63 °C, 1167.13 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  1860 K, 1587 °C, 2889 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  193.43 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  19.79 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  25.23 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  simple trigonal </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  diamagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  24.4 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 3420 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-36-0 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  hardens lead, plastics, chemicals  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  stibnite, valentinite </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  3000 BC </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Vannoccio Biringuccio (1540) </font><br>");

		s52 = new String(
				"<b><i><h2><br> \t\t\t Tellurium (Te) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Semi-metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  52 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  127.60 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  52 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  76 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  16 (chalcogens), 5, p </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Kr] 4d10 5s2 5p4 (2, 8, 18, 18, 6) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  138±4 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  206 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.221 nm (-2) ; 0.089 nm (+4) </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  2.1 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  869.3 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  23  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery lustrous grey  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  6.24 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  722.66 K, 449.51 °C, 841.12 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  1261 K, 988 °C, 1810 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  114.1 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  17.49 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  25.73 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  hexagonal </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  diamagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  (1.97–3.38) W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 2610 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  13494-80-9 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  coloring of glass and ceramics, thermoelectric devices  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  by-product of refining of lead and copper  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Franz-Joseph Müller von Reichenstein (1782) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Martin Heinrich Klaproth </font><br>");

		s53 = new String(
				"<b><i><h2><br> \t\t\t\t Iodine (I) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Non-metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  53 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  126.90447 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  53 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  74 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  17 (halogens), 5, p </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Kr] 4d10 5s2 5p5 (2, 8, 18, 18, 7) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  139±3 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  198 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.216 nm (-1) ; 0.05 nm (+7) </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  2.66 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  1008.4 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  15  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  violet-dark grey, lustrous  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  4.933 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  386.85 K, 113.7 °C, 236.66 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  457.4 K, 184.3 °C, 363.7 °F  </font><br>"
						+ "<br><font color=#808080> Triple point : </font><br><font color=#25383C>  386.65 K (113°C), 12.1 kPa  </font><br>"
						+ "<br><font color=#808080> Critical point : </font><br><font color=#25383C>  819 K, 11.7 MPa  </font><br>"
						+ "<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  (I2) 41.57 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  (I2) 15.52 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  (I2) 54.44 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  orthorhombic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  diamagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  0.449 W·m−1·K−1 </font><br>"

						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7553-56-2 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  required in humans  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  sodium and potassium compounds  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Bernard Courtois (1811) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Bernard Courtois (1811) </font><br>");

		s54 = new String(
				"<b><i><h2><br> \t\t\t\t Xenon (Xe) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Non-metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  54 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  131.293 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  54 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  77 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  18 (noble gases), 5, p </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Kr] 5s2 4d10 5p6 (2, 8, 18, 18, 8) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  140±9 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  216 pm </font><br>"

						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  2.6 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  1170.4 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  21  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  colourless  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  gas  </font><br>"
						+ "<br><font color=#808080> Density :	</font><br><font color=#25383C>  (0 °C, 101.325 kPa) 5.894 g/L </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  (101.325 kPa) 161.4 K, -111.7 °C, -169.1 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  (101.325 kPa) 165.03 K, -108.12 °C, -162.62 °F  </font><br>"
						+ "<br><font color=#808080> Triple point : </font><br><font color=#25383C>  161.405 K (-112°C), 81.6 kPa  </font><br>"
						+ "<br><font color=#808080> Critical point : </font><br><font color=#25383C>  289.77 K, 5.841 MPa  </font><br>"
						+ "<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  (101.325 kPa) 12.64 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  (101.325 kPa) 2.27 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  5R/2 = 20.786 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  face-centered cubic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  diamagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  5.65×10-3  W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (liquid) 1090 m/s; (gas) 169 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-63-3 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  powerful lamps, bubble chambers  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  liquid air </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  William Ramsay and Morris Travers (1898) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  William Ramsay and Morris Travers (1898) </font><br>");

		s55 = new String(
				"<b><i><h2><br> \t\t\t Caesium (Cs) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  55 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  132.9054519 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  55 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  78 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  1 (alkali metals), 6, s </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Xe] 6s1 (2, 8, 18, 18, 8, 1) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  244±11 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  343 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.167 </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  0.79  </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  375.7 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  12  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery gold  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  1.93 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  301.59 K, 28.44 °C, 83.19 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  944 K, 671 °C, 1240 °F  </font><br>"
						+

						"<br><font color=#808080> Critical point : </font><br><font color=#25383C>  1938 K, 9.4 MPa  </font><br>"
						+ "<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  63.9 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  2.09 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  32.210 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  body-centered cubic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  35.9 W·m−1·K−1 </font><br>"

						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-46-2 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  removes air traces in vacuum tubes  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  pollucite, lepidolite  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Robert Bunsen and Gustav Kirchhoff (1860) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Carl Setterberg (1882) </font><br>");

		s56 = new String(
				"<b><i><h2><br> \t\t\t Barium (Ba) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  56 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  137.327 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  56 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  81 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  2 (alkaline earth metals), 6, s </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Xe] 6s2 (2, 8, 18, 18, 8, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  215±11 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  268 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.135 </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  0.89 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  502.9 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  16  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery white  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  3.51 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  1000 K, 727 °C, 1341 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  2170 K, 1897 °C, 3447 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  140.3 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  7.12 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  28.07 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  body-centered cubic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  18.4 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 1620 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-39-3 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  Medical applications, among others  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  barytine, whiterite  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Carl Wilhelm Scheele (1772) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Humphry Davy (1808) </font><br>");

		s57 = new String(
				"<b><i><h2><br> \t\t\t Lanthanum (La) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  57 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  138.90547 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  57 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  82 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  n/a, 6, f </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Xe] 5d1 6s2 (2, 8, 18, 18, 9, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  207±8 pm </font><br>"

						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.10 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  538.1 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  7  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery white  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  6.162 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  1193 K, 920 °C, 1688 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  3737 K, 3464 °C, 6267 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  402.1 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  6.20 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  27.11 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  hexagonal </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  13.4 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 2475 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7439-91-0 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  expensive camera lenses  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  monazite, bastnasite  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Carl Gustaf Mosander (1838) </font><br>");

		s58 = new String(
				"<b><i><h2><br> \t\t\t Cerium (Ce) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  58 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  140.116 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  58 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  82 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  n/a, 6, f </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Xe] 4f1 5d1 6s2 (2, 8, 18, 19, 9, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  204±9 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.102 nm (+3) ; 0,087 nm (+4) </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.12 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  534.4 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  9  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery white  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  6.770 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  1068 K, 795 °C, 1463 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  3716 K, 3443 °C, 6229 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  398 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  5.46 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  26.94 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  face-centered cubic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  11.3 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 2100 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-45-1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  heat-resistant alloys  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  monazite  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Martin Heinrich Klaproth, Jöns Jakob Berzelius, Wilhelm Hisinger (1803) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Carl Gustaf Mosander (1839) </font><br>");

		s59 = new String(
				"<b><i><h2><br> \t\t\t Praseodymium (Pr) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  59 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  140.90765 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  59 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  82 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  n/a, 6, f </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Xe] 4f3 6s2 (2, 8, 18, 21, 8, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  203±7 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.101 nm (+3) </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.13 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  527 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  5  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery white, yellowish tinge  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  6.77 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  1208 K, 935 °C, 1715 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  3793 K, 3520 °C, 6368 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  331 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  6.89 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  27.20 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  hexagonal </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  12.5 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 2280 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-10-0 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  coloring glass and ceramics  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  salts  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Carl Auer von Welsbach (1885) </font><br>");

		s60 = new String(
				"<b><i><h2><br> \t\t\t Neodymium (Nd) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  60 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  144.242 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  60 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  84 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  n/a, 6, f </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Xe] 4f4 6s2 (2, 8, 18, 22, 8, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  201±6 pm </font><br>"

						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.14 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  533.1 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  9  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery white, yellowish tinge  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  7.01 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  1297 K, 1024 °C, 1875 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  3347 K, 3074 °C, 5565 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  289 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  7.14 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  27.45 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  hexagonal </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic, antiferromagnetic below 20 K </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  16.5 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 2330 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-00-8 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  coloring glass and ceramics, infrared radiation filtering  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  electrolysis of salts  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Carl Auer von Welsbach (1885) </font><br>");
	}

	public void s61tos70() {
		s61 = new String(
				"<b><i><h2><br> \t\t\t Promethium (Pm) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  61 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  145 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  61 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  84 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  n/a, 6, f </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Xe] 6s2 4f5 (2, 8, 18, 23, 8, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  199 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  ? 1.13 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  540 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  9  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  metallic  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  7.26 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  1315 K, 1042 °C, 1908 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  3273 K, 3000 °C, 5432 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  289 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  7.13 kJ·mol−1  </font><br>"

						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  hexagonal </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  17.9 W·m−1·K−1 </font><br>"

						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-12-2 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  No uses known  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  fission products of uranium, thorium, plutonium  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Chien Shiung Wu, Emilio Segrè, Hans Bethe (1942) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Charles D. Coryell, Jacob A. Marinsky, Lawrence E. Glendenin, Harold G. Richter (1945) </font><br>");

		s62 = new String(
				"<b><i><h2><br> \t\t\t Samarium (Sm) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  62 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  150.36 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  62 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  88 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  n/a, 6, f </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Xe] 6s2 4f6 (2, 8, 18, 24, 8, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  198±8 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.17 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  544.5 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  11  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery white  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  7.52 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  1345 K, 1072 °C, 1962 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  2067 K, 1794 °C, 3261 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  165 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  8.62 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  29.54 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  rhombohedral </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  13.3 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 2130 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-19-9 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  used in magnets, in alloys with cobalt, and nuclear reactors  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  found with other rare earths  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Lecoq de Boisbaudran (1879) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Lecoq de Boisbaudran (1879) </font><br>");

		s63 = new String(
				"<b><i><h2><br> \t\t\t Europium (Eu) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  63 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  151.964 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  63 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  89 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  n/a, 6, f </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Xe] 4f7 6s2 (2, 8, 18, 25, 8, 2)</font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  198±6 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  ? 1.2 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  547.1 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  9  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery white  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  5.264 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  1099 K, 826 °C, 1519 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  1802 K, 1529 °C, 2784 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  176 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  9.21 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  27.66 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  body-centered cubic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  est. 13.9 W·m−1·K−1 </font><br>"

						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-53-1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  color televisions  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  Man-made  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Eugène-Anatole Demarçay (1896) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Eugène-Anatole Demarçay (1901) </font><br>");

		s64 = new String(
				"<b><i><h2><br> \t\t\t Gadolinium (Gd) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  64 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  157.25 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  64 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  93 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  n/a, 6, f </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Xe] 4f7 5d1 6s2 (2, 8, 18, 25, 9, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  196±6 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.20  </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  593.4 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  13  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery white  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  7.90 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  1585 K, 1312 °C, 2394 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  3546 K, 3273 °C, 5923 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  301.3 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  10.05 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  37.03 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  hexagonal close-packed </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  ferromagnetic/paramagnetic transition at 293.4 K </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  10.6 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 2680 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-54-2 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  magnetic </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  gadolinite  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Jean Charles Galissard de Marignac (1880) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Lecoq de Boisbaudran (1886) </font><br>");

		s65 = new String(
				"<b><i><h2><br> \t\t\t Terbium (Tb) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  65 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  158.92535 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  65 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  94 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  n/a, 6, f </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Xe] 4f9 6s2 (2, 8, 18, 27, 8, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  194±5 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>   ? 1.2  </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  565.8 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  9  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery white  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  8.23 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  1629 K, 1356 °C, 2473 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  3503 K, 3230 °C, 5846 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  293 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  10.15 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  28.91 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  hexagonal close-packed </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic at 300 K </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  11.1 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 2620 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-27-9 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  in color TV's  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  with other rare earths  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Carl Gustaf Mosander (1842) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Carl Gustaf Mosander (1842) </font><br>");

		s66 = new String(
				"<b><i><h2><br> \t\t\t Dysprosium (Dy) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  66 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  162.500 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  66 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  97 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  n/a, 6, f </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Xe] 4f10 6s2 (2, 8, 18, 28, 8, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  192±7 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.22 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  573.0 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  12  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery white  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  8.540 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  1680 K, 1407 °C, 2565 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  2840 K, 2562 °C, 4653 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  280 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  11.06 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  27.7 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  hexagonal close-packed </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic at 300 K </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  10.7 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 2710 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7429-91-6 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  nuclear reactors  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  erbium, holmium  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Lecoq de Boisbaudran (1886) </font><br>");

		s67 = new String(
				"<b><i><h2><br> \t\t\t Holmium (Ho) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  67 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  164.93032 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  67 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  98 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  n/a, 6, f </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Xe] 4f11 6s2 (2, 8, 18, 29, 8, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  192±7 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.23  </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  581.0 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  4  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery white  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  8.79 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  1734 K, 1461 °C, 2662 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  2993 K, 2720 °C, 4928 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  265 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  17.0 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  27.15 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  hexagonal close-packed </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  16.2 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 2760 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-60-0 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  nuclear reactors  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  gadolinite  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Marc Delafontaine (1878) </font><br>");

		s68 = new String(
				"<b><i><h2><br> \t\t\t Erbium (Er) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  68 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  167.259 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  68 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  99 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  n/a, 6, f </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Xe] 4f12 6s2 (2, 8, 18, 30, 8, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  189±6 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.24 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  589.3 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  9  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery white  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  9.066 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  1802 K, 1529 °C, 2784 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  3141 K, 2868 °C, 5194 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  280 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  19.90 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  28.12 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  hexagonal close-packed </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic at 300 K </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  14.5 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 2830 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-52-0 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  ceramics  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  heavier rare earth minerals  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Carl Gustaf Mosander (1842) </font><br>");

		s69 = new String(
				"<b><i><h2><br> \t\t\t Thulium (Tm) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  69 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  168.93421 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  69 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  100 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  n/a, 6, f </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Xe] 4f13 6s2 (2, 8, 18, 31, 8, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  190±10 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.25 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  596.7 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  5  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery white  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  9.32 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  1818 K, 1545 °C, 2813 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  2223 K, 1950 °C, 3542 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  247 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  16.84 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  27.03 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  hexagonal close-packed </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic at 300 K </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  16.9 W·m−1·K−1 </font><br>"

						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-30-4 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  power for portable x-ray machines  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  gadolinite, euxenite, xenotime  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Per Teodor Cleve (1879) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Per Teodor Cleve (1879) </font><br>");

		s70 = new String(
				"<b><i><h2><br> \t\t\t Ytterbium (Yb) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  70 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  173.054 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  70 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  103 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  n/a, 6, f </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Xe] 4f14 6s2 (2, 8, 18, 32, 8, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  187±8 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>   ? 1.1  </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  603.4 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  9  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery white  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  6.90 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  1097 K, 824 °C, 1515 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  1469 K, 1196 °C, 2185 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  159 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  7.66 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  26.74 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  face-centered cubic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  38.5 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 1590 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-64-4 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  metallurgical and chemical experiments  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  yttria, monazite, gadolinite, xenotime  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Jean Charles Galissard de Marignac (1878) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Georges Urbain (1907) </font><br>");
	}

	public void s71tos80() {
		s71 = new String(
				"<b><i><h2><br> \t\t\t Lutetium (Lu) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  71 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  174.9668 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  71 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  104 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  n/a, 6, d </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Xe] 6s2 4f14 5d1 (2, 8, 18, 32, 9, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  187±8 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.27  </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  523.5 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  9  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery white  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  9.841 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  1925 K, 1652 °C, 3006 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  3675 K, 3402 °C, 6156 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  414 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  ca. 22 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  26.86 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  hexagonal close-packed </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  16.4 W·m−1·K−1 </font><br>"

						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7439-94-3 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  No uses known  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  gadolinite, xenotime  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Georges Urbain and Carl Auer von Welsbach (1906) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Carl Auer von Welsbach (1906) </font><br>");

		s72 = new String(
				"<b><i><h2><br> \t\t\t Hafnium (Hf) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  72 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  178.49 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  72 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  106 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  4, 6, d </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Xe] 4f14 5d2 6s2 (2, 8, 18, 32, 10, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  175±10 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.075 nm </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.3 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  658.5 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  10  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  grey steel  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  13.31 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  2506 K, 2233 °C, 4051 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  4876 K, 4603 °C, 8317 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  571 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  27.2 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  25.73 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  hexagonal close-packed </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  23.0 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 3010 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-58-6 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  nuclear reactors </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  zircon  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Dirk Coster and George de Hevesy (1922) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Dirk Coster and George de Hevesy (1922) </font><br>");

		s73 = new String(
				"<b><i><h2><br> \t\t\t Tantalum (Ta) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  73 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  180.94788 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  73 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  108 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  5, 6, d </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Xe] 4f14 5d3 6s2 (2, 8, 18, 32, 11, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  170±8 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.070 nm (+5) </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.5 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  761 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  4  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  grey blue  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  16.69 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  3290 K, 3017 °C, 5463 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  5731 K, 5458 °C, 9856 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  732.8 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  36.57 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  25.36 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  body-centered cubic (α-Ta) <br> tetragonal (β-Ta) </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  57.5 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  57.5 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-25-7 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  capacitors, camera lenses </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  tantalite  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Anders Gustaf Ekeberg (1802) </font><br>"
						+ "<br><font color=#808080> Recognized as a distinct element by : </font><br><font color=#25383C>  Heinrich Rose (1844) </font><br>");

		s74 = new String(
				"<b><i><h2><br> \t\t\t Tungsten (W) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  74 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  183.84 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  74 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  110 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  6, 6, d </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Xe] 4f14 5d4 6s2 (2, 8, 18, 32, 12, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  162±7 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.068 nm (+4) ; 0.067 nm (+6) </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  2.36  </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  770 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  10  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  greyish white, lustrous  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  19.25 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  3695 K, 3422 °C, 6192 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  5828 K, 5555 °C, 10031 °F  </font><br>"
						+

						"<br><font color=#808080> Critical point : </font><br><font color=#25383C>  13892 K, MPa  </font><br>"
						+ "<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  806.7 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  35.3 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  24.27 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  body-centered cubic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  173 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (r.t.) (annealed) 4620 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-33-7 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  used widely in electronics industry  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  scheelite, wolframite  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Torbern Bergman (1781) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Juan José Elhuyar and Fausto Elhuyar (1783) </font><br>");

		s75 = new String(
				"<b><i><h2><br> \t\t\t Rhenium (Re) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  75 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  186.207 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  75 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  111 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  7, 6, d </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Xe] 4f14 5d5 6s2 (2, 8, 18, 32, 13, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  151±7 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.9  </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  760 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  9  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  greyish white  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  21.02 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  3459 K, 3186 °C, 5767 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  5869 K, 5596 °C, 10105 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  704 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  60.43 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  25.48 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  hexagonal close-packed </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  48.0 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 4700 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-15-5 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  filaments for mass spectrographs  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  gadolinite, molybdenite  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Masataka Ogawa (1908) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Masataka Ogawa (1908) </font><br>");

		s76 = new String(
				"<b><i><h2><br> \t\t\t Osmium (Os) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  76 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  190.23 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  76 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  114 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  8, 6, d </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Xe] 4f14 5d6 6s2 (2, 8, 18, 32, 14, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  144±4 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.067 nm (+4) </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  2.2 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  840 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  13  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  bluish grey  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  22.59 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  3306 K, 3033 °C, 5491 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  5285 K, 5012 °C, 9054 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  738 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  57.85 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  24.7 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  hexagonal close-packed </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  87.6 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 4940 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-04-2 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  tip gold pen points, instrument pivots, electrical light filaments  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  ores that contain platinum  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Smithson Tennant (1803) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Smithson Tennant (1803) </font><br>");

		s77 = new String(
				"<b><i><h2><br> \t\t\t Iridium (Ir) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  77 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  192.217 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  77 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  115 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  9, 6, d </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Xe] 4f14 5d7 6s2 (2, 8, 18, 32, 15, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  141±6 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.066 nm (+4) </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  2.20 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  880 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  11  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery white  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  22.56 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  2739 K, 2466 °C, 4471 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  4701 K, 4428 °C, 8002 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  563 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  41.12 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  25.10 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  face-centered cubic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  147 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 4825 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7439-88-5 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  tip gold pens, crucible and special containers </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  gravel deposits with platinum  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Smithson Tennant (1803) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Smithson Tennant (1803) </font><br>");

		s78 = new String(
				"<b><i><h2><br> \t\t\t Platinum (Pt) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  78 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  195.084 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  78 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  117 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  10, 6, d </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Xe] 4f14 5d9 6s1 (2, 8, 18, 32, 17, 1) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  136±5 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  175 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.096 nm (+2) </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  2.28 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  870 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  13  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  greyish white  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  21.45 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  2041.4 K, 1768.3 °C, 3214.9 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  4098 K, 3825 °C, 6917 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  469 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  22.17 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  25.86 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  face-centered cubic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  71.6 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (r.t.) 2800 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-06-4 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  jewelry, containers, catalyst  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  platinum ores  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Antonio de Ulloa (1735) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Antonio de Ulloa (1735) </font><br>");

		s79 = new String(
				"<b><i><h2><br> \t\t\t\t Gold (Au) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  79 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  196.966569 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  79 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  118 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  11, 6, d </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Xe] 4f14 5d10 6s1 (2, 8, 18, 32, 18, 1) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  136±6 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  166 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.137 nm (+1) </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  2.54 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  890.1 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  7  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  gold  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  19.30 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  1337.33 K, 1064.18 °C, 1947.52 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  3129 K, 2856 °C, 5173 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  324 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  12.55 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  25.418 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  lattice face centered cubic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  diamagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  318 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (r.t.) 2030 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-57-5 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  electronics, jewelry, coins  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  crust of the earth, copper ores  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Middle Easterns (before 6000 BC) </font><br>");

		s80 = new String(
				"<b><i><h2><br> \t\t\t Mercury (Hg) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  80 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  200.59 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  80 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  121 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  12, 6, d </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Xe] 4f14 5d10 6s2 (2, 8, 18, 32, 18, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  132±5 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  155 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.11 nm (+2) </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  2.00 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  1007.1 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  12  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery white  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  liquid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  13.534 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  234.3210 K, −38.8290 °C, −37.8922 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  629.88 K, 356.73 °C, 674.11 °F  </font><br>"
						+ "<br><font color=#808080> Triple point : </font><br><font color=#25383C>  234.3156 K (-39°C), 1.65×10−7 kPa  </font><br>"
						+ "<br><font color=#808080> Critical point : </font><br><font color=#25383C>  1750 K, 172.00 MPa  </font><br>"
						+ "<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  59.11 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  2.29 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  27.983 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  rhombohedral </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  diamagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  8.30 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (liquid, 20 °C) 1451.4 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7439-97-6 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  thermometers, barometers, fluorescent lamps, batteries </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  cinnabar ore  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Ancient Chinese and Indians (before 2000 BC) </font><br>");

	}

	public void s81tos90() {
		s81 = new String(
				"<b><i><h2><br> \t\t\t Thallium (Tl) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  81 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  204.38 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  81 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  123 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  13, 6, p </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Xe] 4f14 5d10 6s2 6p1 (2, 8, 18, 32, 18, 3) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  145±7 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  196 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.099 nm </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.62  </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  589.4 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  11  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery white  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  11.85 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  577 K, 304 °C, 579 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  1746 K, 1473 °C, 2683 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  165 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  4.14 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  26.32 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  hexagonal close-packed </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  diamagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  46.1 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 818 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-28-0 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  rat and ant poisons, detecting infrared radiation  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  crookesite, hutchinsonite, lorandite  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  William Crookes (1861) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Claude-Auguste Lamy (1862) </font><br>");

		s82 = new String(
				"<b><i><h2><br> \t\t\t\t Lead (Pb) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  82 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  207.2 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  82 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  125 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  14, 6, p </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Xe] 4f14 5d10 6s2 6p2 (2, 8, 18, 32, 18, 4) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  146±5 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  202 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.132 nm (+2) ; 0.084 nm (+4) </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  2.33 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  715.6 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  13  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  bluish white  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  11.34 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  600.61 K, 327.46 °C, 621.43 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  2022 K, 1749 °C, 3180 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  179.5 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  4.77 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  26.650 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  face-centered cubic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  diamagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  35.3 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (r.t.) (annealed) 1190 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7439-92-1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  solder and shielding against radiation, batteries  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  galena  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Middle Easterns (7000 BC) </font><br>");

		s83 = new String(
				"<b><i><h2><br> \t\t\t Bismuth (Bi) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  83 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  208.98040 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  83 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  126 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  15 (pnictogens), 6, p </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Xe] 4f14 5d10 6s2 6p3 (2, 8, 18, 32, 18, 5) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  148±4 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  207 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.074 nm (+5) ; 0,120 nm (+3) </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  2.02 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  703 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  14  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  lustrous reddish white  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  9.78 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  544.7 K, 271.5 °C, 520.7 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  1837 K, 1564 °C, 2847 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  151 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  11.30 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  25.52 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  rhombohedral </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  diamagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  7.97 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 1790 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-69-9 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  pharmaceuticals, fuses  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  bismuthine  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Claude François Geoffroy (1753) </font><br>");

		s84 = new String(
				"<b><i><h2><br> \t\t\t Polonium (Po) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  84 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  209 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  84 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  125 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  16 (chalcogens), 6, p </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Xe] 6s2 4f14 5d10 6p4 (2, 8, 18, 32, 18, 6) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  140±4 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  197 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.102 nm (+4) </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  2.0 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  812.1 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  12  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  (alpha) 9.196 g·cm−3 <br> (beta) 9.398 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  527 K, 254 °C, 489 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  1235 K, 962 °C, 1764 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  102.91 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  ca. 13 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  26.4 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  cubic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  nonmagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>   ? 20 W·m−1·K−1 </font><br>"

						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-08-6 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  No uses known  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  pitchblende, decay of radium  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Pierre Curie and Marie Curie (1898) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Willy Marckwald (1902) </font><br>");

		s85 = new String(
				"<b><i><h2><br> \t\t\t Astatine (At) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Semi-metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  85 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  210 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  85 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  125 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  17 (halogens), 6, p </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Xe] 4f14 5d10 6s2 6p5 (2, 8, 18, 32, 18, 7) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  150 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  202 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  2.2 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  887.7±38.59 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  7  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  metallic  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  (predicted) 6.2–6.5 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  575 K, 302 °C, 576 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  610 K, 337 °C, 639 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  (At2) 54.39 kJ·mol−1  </font><br>"

						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"

						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  no data </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  1.7 W·m−1·K−1 </font><br>"

						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-68-8 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  No uses known  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  Man-made  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Dale R. Corson, Kenneth Ross MacKenzie, Emilio Segrè (1940) </font><br>");

		s86 = new String(
				"<b><i><h2><br> \t\t\t\t Radon (Rn) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Non-metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  86 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  222 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  86 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  136 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  18 (noble gases), 6, p </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Xe] 4f14 5d10 6s2 6p6 (2, 8, 18, 32, 18, 8) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  150 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  220 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  2.2 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  1037 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  7  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  colourless  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  gas  </font><br>"
						+ "<br><font color=#808080> Density :	</font><br><font color=#25383C>  (0 °C, 101.325 kPa) 9.73 g/L </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  202.0 K, −71.15 °C, −96.07 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  211.3 K, −61.85 °C, −79.1 °F  </font><br>"
						+

						"<br><font color=#808080> Critical point : </font><br><font color=#25383C>  377 K, 6.28 MPa  </font><br>"
						+ "<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  18.10 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  3.247 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  5R/2 = 20.786 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  face-centered cubic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  non-magnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  3.61 m W·m−1·K−1 </font><br>"

						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  10043-92-2 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  treatment of cancer  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  decay of radium  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Friedrich Ernst Dorn (1898) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  William Ramsay and Robert Whytlaw-Gray (1910) </font><br>");

		s87 = new String(
				"<b><i><h2><br> \t\t\t Francium (Fr) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  87 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  223 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  87 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  136 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  1 (alkali metals), 7, s </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Rn] 7s1 (2, 8, 18, 32, 18, 8, 1) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  260 (extrapolated) pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  348 (extrapolated) pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  0.7  </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  380 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  4  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  metallic  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid presumably  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  ? 1.87 (extrapolated) g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  ? 300 K, ? 27 °C, ? 80 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>   ? 950 K, ? 677 °C, ? 1250 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  ca. 65 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  ca. 2 kJ·mol−1  </font><br>"

						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  cubic body-centered (extrapolated) </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  Paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  15 (extrapolated) W·m−1·K−1 </font><br>"

						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-73-5 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  No uses known </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  decay of actinium  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Marguerite Perey (1939) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Marguerite Perey (1939) </font><br>");

		s88 = new String(
				"<b><i><h2><br> \t\t\t Radium (Ra) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  88 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  226 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  88 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  138 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  2 (alkaline earth metals), 7, s </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Rn] 7s2 (2, 8, 18, 32, 18, 8, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  221±2 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  283 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  0.9  </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  509.3 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  6  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  metallic  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  5.5 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  973 K, 700 °C, 1292 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  2010 K, 1737 °C, 3158.6 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  113 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  8.5 kJ·mol−1  </font><br>"

						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  body-centered cubic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  nonmagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  18.6 W·m−1·K−1 </font><br>"

						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-14-4 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  treating cancer  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  uranium ores  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Pierre Curie and Marie Curie (1898) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Marie Curie (1902) </font><br>");

		s89 = new String(
				"<b><i><h2><br> \t\t\t Actinium (Ac) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  89 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  227 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  89 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  138 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  n/a, 7, f </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Rn] 6d1 7s2 (2, 8, 18, 32, 18, 9, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  215 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.1  </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  499 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  4  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  10 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  (circa) 1323 K, 1050 °C, 1922 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  3471 K, 3198 °C, 5788 °F  </font><br>"
						+

						"<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  400 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  14 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  27.2 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  face-centered cubic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  no data </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  12 W·m−1·K−1 </font><br>"

						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-34-8 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  No uses known  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  extremely rare  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  André-Louis Debierne (1899) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  André-Louis Debierne (1899) </font><br>");

		s90 = new String(
				"<b><i><h2><br> \t\t\t Thorium (Th) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  90 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  232.03806 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  90 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  142 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  n/a, 7, f </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Rn] 6d2 7s2 (2, 8, 18, 32, 18, 10, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  206±6 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.110 nm (+4) </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.3  </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  587 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  9  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery white  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  11.7 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  2115 K, 1842 °C, 3348 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  5061 K, 4788 °C, 8650 °F  </font><br>"
						+ "<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  514 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  13.81 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  26.230 J·mol−1·K−1  </font><br>"

						+ " <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  face-centered cubic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  54.0 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 2490 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-29-1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  strong alloys, ultraviolet photoelectric cells  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  monazite, thorite  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Jöns Jakob Berzelius (1829) </font><br>");
	}

	public void s91tos100() {
		s91 = new String(
				"<b><i><h2><br> \t\t Protactinium (Pa) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  91 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  231.03588 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  91 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  140 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  n/a, 7, f </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Rn] 5f2 6d1 7s2 (2, 8, 18, 32, 20, 9, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  200 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.5 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  568 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  5  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery metallic  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  15.37 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  1841 K, 1568 °C, 2854 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  ? 4300 K, ? 4027 °C, ? 7280 °F  </font><br>"

						+ "<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  481 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  12.34 kJ·mol−1  </font><br>"

						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  tetragonal </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  47 W·m−1·K−1 </font><br>"

						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-13-3 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  No uses known  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  fission product of uranium, thorium, plutonium  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  William Crookes (1900) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  William Crookes (1900) </font><br>");

		s92 = new String(
				"<b><i><h2><br> \t\t\t Uranium (U) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  92 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  238.02891 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  92 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  146 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  n/a, 7, f </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Rn] 5f3 6d1 7s2 (2, 8, 18, 32, 21, 9, 2)</font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  196±7 pm </font><br>"
						+ "<br><font color=#808080><b> Vanderwaals radius : </font><font color=#25383C>  186 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  0.103 nm (+3) ; 0.093 nm (+4) </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.38 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  597.6 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  11  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  metallic grey  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  19.1 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  1405.3 K, 1132.2 °C, 2070 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  4404 K, 4131 °C, 7468 °F  </font><br>"

						+ "<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  417.1 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  9.14 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  27.665 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  orthorhombic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  27.5 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  (20 °C) 3155 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-61-1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  fuel for nuclear reactors  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  many rocks, large amounts in pitchblende and carnotite  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Martin Heinrich Klaproth (1789) </font><br>"
						+ "<br><font color=#808080> First isolation : </font><br><font color=#25383C>  Eugène-Melchior Péligot (1841) </font><br>");

		s93 = new String(
				"<b><i><h2><br> \t\t Neptunium (Np) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  93 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  237 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  93 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  144 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  n/a, 7, f </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Rn] 5f4 6d1 7s2 (2, 8, 18, 32, 22, 9, 2)</font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  190±1 pm </font><br>"

						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.36 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  604.5 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  8  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery metallic  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  20.45 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  910 K, 637 °C, 1179 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  4273 K, 4000 °C, 7232 °F  </font><br>"

						+ "<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  336 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  3.20 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  29.46 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  orthorhombic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  6.3 W·m−1·K−1 </font><br>"

						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7439-99-8 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  No uses known  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  Man-made  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Edwin McMillan and Philip H. Abelson (1940) </font><br>");

		s94 = new String(
				"<b><i><h2><br> \t\t Plutonium (Pu) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  94 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  244 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  94 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  150 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  n/a, 7, f </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Rn] 5f6 7s2 (2, 8, 18, 32, 24, 8, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  187±1 pm </font><br>"

						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.28 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  584.7 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  11  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery white  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  19.816 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  912.5 K, 639.4 °C, 1182.9 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  3505 K, 3228 °C, 5842 °F  </font><br>"

						+ "<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  333.5 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  2.82 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  35.5 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  monoclinic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  6.74 W·m−1·K−1 </font><br>"
						+ "<br><font color=#808080> Speed of sound : </font><br><font color=#25383C>  2260 m·s−1 </font><br>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-07-5 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  bombs, nuclear reactors  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  some uranium ores, man-made  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Glenn T. Seaborg, Arthur Wahl, Joseph W. Kennedy, Edwin McMillan (1940–1) </font><br>");

		s95 = new String(
				"<b><i><h2><br> \t\t Americium (Ac) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  95 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  243 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  95 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  148 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  n/a, 7, f </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Rn] 5f7 7s2 (2, 8, 18, 32, 25, 8, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  180±6 pm </font><br>"

						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.3  </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  578 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  8  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silvery white  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  12 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  1449 K, 1176 °C, 2149 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  2880 K, 2607 °C, 4725 °F  </font><br>"

						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  14.39 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Molar heat capacity : </font><br><font color=#25383C>  62.7 J·mol−1·K−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  hexagonal </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"
						+ "<br><font color=#808080> Thermal conductivity : </font><br><font color=#25383C>  10 W·m−1·K−1 </font><br>"

						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-35-9 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  Smoke Detectors  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  Man-made  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Glenn T. Seaborg, Ralph A. James, Leon O. Morgan, Albert Ghiorso (1944) </font><br>");

		s96 = new String(
				"<b><i><h2><br> \t\t\t Curium (Cm) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  96 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  247 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  96 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  151 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  n/a, 7, f </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Rn] 5f7 6d1 7s2 (2, 8, 18, 32, 25, 9, 2)</font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  169±3 pm </font><br>"

						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.3 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  581 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  10  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  silver  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  13.51 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  1613 K, 1340 °C, 2444 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  3383 K, 3110 °C, 5630 °F  </font><br>"

						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  ? 15 kJ·mol−1  </font><br>"

						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  hexagonal close-packed </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  antiferromagnetic→paramagnetic transition at 52 K </font><br>"

						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-51-9 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  No uses known </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  Man-made  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Glenn T. Seaborg, Ralph A. James, Albert Ghiorso (1944) </font><br>");

		s97 = new String(
				"<b><i><h2><br> \t\t Berkelium (Bk) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  97 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  247 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  97 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  150 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  n/a, 7, f </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Rn] 5f9 7s2 (2, 8, 18, 32, 27, 8, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"

						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.3 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  601 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  8  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  unknown, but probably metallic and silvery white or grey in appearance </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  (alpha) 14.78 g·cm−3 <br> (beta) 13.25 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  (beta) 1259 K, 986 °C, 1807 °F  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  hexagonal close-packed </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"

						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-40-6 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  No uses known  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  Man-made </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Lawrence Berkeley National Laboratory (1949) </font><br>");

		s98 = new String(
				"<b><i><h2><br> \t\t Californium (Cf) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  98 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  251 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  98 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  153 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  n/a, 7, f </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Rn] 5f10 7s2 (2, 8, 18, 32, 28, 8, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"

						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.3 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  608 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  10  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  unknown, but probably metallic and silvery white or grey in appearance  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  15.1 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  1173 K, 900 °C, 1652 °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  (estimation) 1743 K, 1470 °C, 2678 °F  </font><br>"

						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  simple hexagonal </font><br>"

						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-71-3 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  No uses known </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  Man-made </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Lawrence Berkeley National Laboratory (1950) </font><br>");

		s99 = new String(
				"<b><i><h2><br> \t\t Einsteinium (Es) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  99 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  252 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  99 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  153 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  n/a, 7, f </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Rn] 5f11 7s2 (2, 8, 18, 32, 29, 8, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"

						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.3 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  619 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  10  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  unknown, but probably metallic and silvery white or grey in appearance  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  8.84 g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  1133 K, 860 °C, 1580 °F  </font><br>"

						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  face-centered cubic </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic </font><br>"

						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7429-92-7 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  No uses known  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  Man-made  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Lawrence Berkeley National Laboratory (1952) </font><br>");

		s100 = new String(
				"<b><i><h2><br> \t\t\t Fermium (Fm) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  100 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  257 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  100 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  157 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  n/a, 7, f </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Rn] 5f12 7s2 (2, 8, 18, 32, 30, 8, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"

						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.3 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  627 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  1  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  unknown, but probably metallic and silvery white or grey in appearance  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  1800 K, 1527 °C, 2781 °F  </font><br>"

						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"

						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-72-4 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  No uses known  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  Man-made  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Lawrence Berkeley National Laboratory (1952) </font><br>");
	}

	public void s101tos118() {
		s101 = new String(
				"<b><i><h2><br> \t\t Mendelevium (Md) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  101 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  258 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  101 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  157 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  n/a, 7, f </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Rn] 5f13 7s2 (2, 8, 18, 32, 31, 8, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"

						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.3 </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  635 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  1  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  unknown, but probably metallic and silvery white or grey in appearance  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid  </font><br>"

						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  1100 K, 827 °C, 1521 °F  </font><br>"

						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"

						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  no data </font><br>"

						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  7440-11-1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  No uses known  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  Man-made  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Lawrence Berkeley National Laboratory (1955) </font><br>");

		s102 = new String(
				"<b><i><h2><br> \t\t Nobelium (No) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  102 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  259 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  102 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  157 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  n/a, 7, f </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Rn] 5f14 7s2 (2, 8, 18, 32, 32, 8, 2)</font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"

						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"
						+ "<br><font color=#808080> Electronegativity according to Pauling : </font><font color=#25383C>  1.3 (predicted) </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  641.6 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  1  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  unknown, but probably metallic and silvery white or grey in appearance  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid (predicted)  </font><br>"

						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  1100 K, 827 °C, 1521 (predicted) °F  </font><br>"

						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"

						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  10028-14-5 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  No uses known  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  Man-made  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Joint Institute for Nuclear Research (1966) </font><br>");

		s103 = new String(
				"<b><i><h2><br> \t\t Lawrencium (Lr) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  103 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  262 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  103 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  159 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  n/a, 7, d </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Rn] 7s2 5f14 7p1 (2, 8, 18, 32, 32, 8, 3) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"

						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"

						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  443.8 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  1  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  unknown, but probably metallic and silvery white or grey in appearance  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid presumably  </font><br>"

						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"

						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  22537-19-5 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  No uses known  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  Man-made  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Lawrence Berkeley National Laboratory (1961) </font><br>");

		s104 = new String(
				"<b><i><h2><br> \t\t\t Rutherfordium (Rf) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  104 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  267 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  104 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  157 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  4, 7, d </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Rn] 5f14 6d2 7s2 (2, 8, 18, 32, 32, 10, 2) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  157 (estimated) pm </font><br>"

						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"

						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  579.9 (estimated) kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  9  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  unknown, but probably metallic and silvery white or grey in appearance  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid (predicted)  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  23 (estimated) g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  2400 K, 2100 °C, 3800 (estimated) °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  5800 K, 5500 °C, 9900 (estimated) °F  </font><br>"

						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"

						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  53850-36-5 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  No uses known  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  Man-made  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Joint Institute for Nuclear Research (1964) </font><br>");

		s105 = new String(
				"<b><i><h2><br> \t\t\t Dubnium (Db) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  105 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  268 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  105 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  157 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  5, 7, d </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Rn] 5f14 6d3 7s2 (predicted) <br> (2, 8, 18, 32, 32, 11, 2) (predicted) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  149 (estimated) pm </font><br>"

						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"

						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  664.8 (estimated) kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  1  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  unknown, but probably metallic and silvery white or grey in appearance  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid (predicted)  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  29 (predicted) g·cm−3 </font><br>"

						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"

						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  53850-35-4 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  No uses known  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  Man-made  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Joint Institute for Nuclear Research (1968) </font><br>");

		s106 = new String(
				"<b><i><h2><br> \t\t Seaborgium (Sg) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  106 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  269 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  106 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  157 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  6, 7, d </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Rn] 5f14 6d4 7s2 (predicted) <br> (2, 8, 18, 32, 32, 12, 2) (predicted) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  143 (estimated) pm </font><br>"

						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"

						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  757.4 (estimated) kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  1  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  unknown, but probably metallic and silvery white or grey in appearance  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid (predicted)  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  35 (predicted) g·cm−3 </font><br>"

						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"

						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  54038-81-2 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  No uses known  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  Man-made  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Lawrence Berkeley National Laboratory (1974) </font><br>");

		s107 = new String(
				"<b><i><h2><br> \t\t Bohrium (Bh) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  107 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  270 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  107 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  155 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  7, 7, d </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Rn] 5f14 6d5 7s2 (calculated)<br> (2, 8, 18, 32, 32, 13, 2) (predicted) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  141 (estimated) pm </font><br>"

						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"

						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>   742.9 (estimated) kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  3  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  unknown, but probably metallic and silvery white or grey in appearance  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid (predicted)  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  37 (predicted) g·cm−3 </font><br>"

						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"

						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  54037-14-8 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  No uses known  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  Man-made </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Gesellschaft für Schwerionenforschung (1981) </font><br>");

		s108 = new String(
				"<b><i><h2><br> \t\t Hassium (Hs) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  108 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  269 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  108 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  157 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  8, 7, d </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Rn] 5f14 6d6 7s2 (predicted)<br> 2, 8, 18, 32, 32, 14, 2 (predicted)</font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  134 (estimated) pm </font><br>"

						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"

						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  733.3 (estimated) kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  1  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  unknown, but probably metallic and silvery white or grey in appearance  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid (predicted)  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  41 (predicted) g·cm−3 </font><br>"

						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"

						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  54037-57-9 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  No uses known  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  Man-made  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Gesellschaft für Schwerionenforschung (1984) </font><br>");
	

		s109 = new String(
				"<b><i><h2><br> \t\t Meitnerium (Mt) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  109 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  278 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  109 </font><br>"
						+ "<br><font color=#808080> Number of Neutrons : </font><font color=#25383C>  157 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  9, 7, d </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Rn] 5f14 6d7 7s2 (calculated) <br> (2, 8, 18, 32, 32, 15, 2) (predicted) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  129 (estimated) pm </font><br>"

						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"

						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  800.8 (estimated) kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  1  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  unknown, but probably metallic and silvery white or grey in appearance  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid (predicted)  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  37.4 (predicted) g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  melting_point  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  boiling_point  </font><br>"

						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> Crystal Structure : </font><font color=#25383C>  face-centered cubic (predicted)  </font><br>"
						+ "<br><font color=#808080> Magnetic ordering : </font><font color=#25383C>  paramagnetic (predicted) </font><br>"

						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  54038-01-6 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t    Use & Source </u></b></h5>"
						+ "<font color=#808080> Uses : </font><br><font color=#25383C>  No uses known  </font><br>"
						+ "<br><font color=#808080> Obtained from : </font><br><font color=#25383C>  Man-made  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Gesellschaft für Schwerionenforschung (1982) </font><br>");

		s110 = new String(
				"<b><i><h2><br> \t\t Darmstadtium (Ds) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  110 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  281 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  110 </font><br>"

						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  10, 7, d </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Rn] 5f14 6d8 7s2 (predicted) <br> (2, 8, 18, 32, 32, 16, 2) (predicted) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  128 (estimated) pm </font><br>"

						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"

						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  955.2 (estimated) kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  1  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  unknown, but probably metallic and silvery white or grey in appearance  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid (predicted)  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  34.8 (predicted) g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  melting_point  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  boiling_point  </font><br>"

						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"

						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  54083-77-1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Gesellschaft für Schwerionenforschung (1994) </font><br>");

		s111 = new String(
				"<b><i><h2><br> \t\t Roentgenium (Rg) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  111 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  281 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  111 </font><br>"

						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  11, 7, d </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Rn] 5f14 6d9 7s2 (predicted) <br> (2, 8, 18, 32, 32, 17, 2) (predicted) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  121 (estimated) pm </font><br>"

						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  1022.7 (estimated) kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"

						+ "<br><font color=#808080> Color : </font><font color=#25383C>  unknown, but probably metallic and silvery white or grey in appearance  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid (predicted)  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  28.7 (predicted) g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  melting_point  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  boiling_point  </font><br>"

						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"

						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  54386-24-2 </font><br>"
						+
						
						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Gesellschaft für Schwerionenforschung (1994) </font><br>");

		s112 = new String(
				"<b><i><h2><br> \t\t Copernicium (Cn) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  112 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  285 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  112 </font><br>"

						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  12, 7, d </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Rn] 5f14 6d10 7s2 (predicted) <br> (2, 8, 18, 32, 32, 18, 2) (predicted) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  122 (predicted) pm </font><br>"

						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"

						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  1154.9 (estimated) kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  1  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  unknown, but probably metallic and silvery white or grey in appearance  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  Not known  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  23.7 (predicted) g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  melting_point  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  boiling_point  </font><br>"

						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"

						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  54084-26-3 </font><br>"
						+
						
						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Gesellschaft für Schwerionenforschung (1996) </font><br>");

		s113 = new String(
				"<b><i><h2><br> \t\t Ununtrium (Uut) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  113 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  286 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  113 </font><br>"

						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  13, 7, p </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Rn] 5f14 6d10 7s2 7p1 (predicted) <br> (2, 8, 18, 32, 32, 18, 3) (predicted) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  136 (prediction) pm </font><br>"

						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"

						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  704.9 (prediction) kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  Not known  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  unknown, but probably metallic and silvery white or grey in appearance  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid (predicted)  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  18 (predicted) g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  700 K, 430 °C, 810 (predicted) °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  1400 K, 1100 °C, 2000 (predicted) °F  </font><br>"

						+ "<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  130 (predicted) kJ·mol−1  </font><br>"

						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"

						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  54084-70-7 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Joint Institute for Nuclear Research and Lawrence Livermore National Laboratory (2003) </font><br>");

		s114 = new String(
				"<b><i><h2><br> \t\t\t Flerovium (Fl) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  114 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  289 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  114 </font><br>"

						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  14, 7, p </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Rn] 5f14 6d10 7s2 7p2 (predicted)<br> (2, 8, 18, 32, 32, 18, 4) (predicted) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  143 (estimated) pm </font><br>"

						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"

						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  823.9 (prediction) kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  Not known  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  unknown, but probably metallic and silvery white or grey in appearance  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid (predicted) </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  22 (predicted) g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  340 K, 70 °C, 160 (predicted) °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  420 K, 150 °C, 300 (predicted) °F  </font><br>"

						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"

						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  54085-16-4 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Joint Institute for Nuclear Research and Lawrence Livermore National Laboratory (1999) </font><br>");

		s115 = new String(
				"<b><i><h2><br> \t\t Ununpentium (Uup) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  115 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  288 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  115 </font><br>"

						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  15 (pnictogens), 7, p </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Rn] 5f14 6d10 7s2 7p3 (predicted)<br>(2, 8, 18, 32, 32, 18, 5) (predicted) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  162 (estimated) pm </font><br>"

						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"

						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  538.4 (prediction) kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  Not known  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  unknown, but probably metallic and silvery white or grey in appearance  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid (predicted)  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  11 (predicted) g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  ~700 K, ~430 °C, ~810 (predicted) °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  ~1400 K, ~1100 °C, ~2000 (predicted) °F  </font><br>"

						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"

						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  54085-64-2 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Joint Institute for Nuclear Research and Lawrence Livermore National Laboratory (2003) </font><br>");

		s116 = new String(
				"<b><i><h2><br> \t\t Livermorium (Lv) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  116 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  293 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  116 </font><br>"

						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  16 (chalcogens), 7, p </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Rn] 5f14 6d10 7s2 7p4 (predicted)<br> (2, 8, 18, 32, 32, 18, 6) (predicted) </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  175 (estimated) pm </font><br>"

						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"

						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  723.6 (prediction) kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  Not known  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  unknown, but probably metallic and silvery white or grey in appearance  </font><br>"

						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  12.9 (predicted) g·cm−3 </font><br>"
						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  melting_point  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  boiling_point  </font><br>"

						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<br><font color=#808080> CAS registry number : </font><font color=#25383C>  54100-71-9 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Joint Institute for Nuclear Research and Lawrence Livermore National Laboratory (2000) </font><br>");

		s117 = new String(
				"<b><i><h2><br> \t\t Ununseptium (Uus) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Unknown </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  117 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  294 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  117 </font><br>"

						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  17 (halogens), 7, p </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Rn] 5f14 6d10 7s2 7p5 (predicted)<br> (2, 8, 18, 32, 32, 18, 7) (predicted)  </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  165 (estimated) pm </font><br>"

						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"

						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>   742.9 (prediction) kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  Not known  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  unknown, but probably metallic and dark in appearance  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid (predicted)  </font><br>"

						+ "<br><font color=#808080> Melting point : </font><font color=#25383C><br>  573–773 K, 300–500 °C, 572–932 (predicted) °F  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  823 K, 550 °C, 1022 (predicted) °F  </font><br>"

						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> CAS registry number : </font><font color=#25383C>  54101-14-3 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Joint Institute for Nuclear Research and Lawrence Livermore National Laboratory (2010) </font><br>");

		s118 = new String(
				"<b><i><h2><br> \t\t Ununoctium (Uuo) </h2></i></b>"
						+ "<br><h5><b><u>  \t\t\t General Properties </u></b></h5>"
						+ "<font color=#808080><b> Classification : </font><font color=#25383C>  Non-metallic </font><br>"
						+ "<br><font color=#808080> Atomic number : </font><font color=#25383C>  118 </font><br>"
						+ "<br><font color=#808080> Atomic weight : </font><font color=#25383C>  294 </font><br>"
						+ "<br><font color=#808080> Number of Protons/Electrons : </font><font color=#25383C>  118 </font><br>"
						+ "<br><font color=#808080> Group, period, block : </font><font color=#25383C><br>  18 (noble gases), 7, p </font><br>"
						+ "<br><font color=#808080> Electronic configuration : </font><br><font color=#25383C> [Rn] 5f14 6d10 7s2 7p6 (predicted)<br> 2, 8, 18, 32, 32, 18, 8 (predicted)  </font><br>"
						+

						" <br><h5><b><u> \t\t\t Atomic Properties </u></b></h5>"
						+ "<font color=#808080><b> Covalent radius : </font><font color=#25383C>  (predicted) 157 pm </font><br>"
						+ "<br><font color=#808080> Ionic radius : </font><font color=#25383C>  Not known </font><br>"
						+ "<br><font color=#808080> Energy of first ionisation : </font><br><font color=#25383C>  (extrapolated) 839.4 kJ·mol−1 </font><br>"
						+

						" <br><h5><b><u> \t\t\t Physical Properties </u></b></h5>"
						+ "<font color=#808080> Isotopes : </font><font color=#25383C>  Not known  </font><br>"
						+ "<br><font color=#808080> Color : </font><font color=#25383C>  unknown, but probably a colourless gas  </font><br>"
						+ "<br><font color=#808080> Phase : </font><font color=#25383C>  solid (predicted)  </font><br>"
						+ "<br><font color=#808080> Density (near r.t.) :	</font><br><font color=#25383C>  13.65 g·cm−3 (predicted)  </font><br>"
						+ "<br><font color=#808080> Boiling point : </font><font color=#25383C><br>  (extrapolated) 350±30 K, 80±30 °C, 170±50 °F  </font><br>"
						+ "<br><font color=#808080> Critical point : </font><br><font color=#25383C>  (extrapolated) 439 K, 6.8 MPa  </font><br>"
						+ "<br><font color=#808080> Heat of vaporization : </font><br><font color=#25383C>  (extrapolated) 19.4 kJ·mol−1  </font><br>"
						+ "<br><font color=#808080> Heat of fusion : </font><br><font color=#25383C>  (extrapolated) 23.5 kJ·mol−1  </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t Miscellanea </u></b></h5>"
						+ "<font color=#808080> CAS registry number : </font><font color=#25383C>  54144-19-3 </font><br>"
						+

						" <br><h5><b><u> \t\t\t\t\t History </u></b></h5>"
						+ "<font color=#808080> Discovery : </font><br><font color=#25383C>  Joint Institute for Nuclear Research and Lawrence Livermore National Laboratory (2002) </font><br>");
	}

}
