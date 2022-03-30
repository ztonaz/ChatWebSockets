package com.example.demo;

import java.util.ArrayList;

public class MyUnicode {

	
	public String getTheBold(String theWord) {
		
		ArrayList<String> firstArray = new ArrayList<String>();
		
		for (int i = 0; i<theWord.length();i++) {
			firstArray.add(String.valueOf(theWord.charAt(i)));
		}
		
		
		ArrayList<String> lastArrayList = new ArrayList<String>();
		
		for (int j = 0; j<firstArray.size(); j++) {
			if (String.valueOf(firstArray.get(j)).contains("a")) {
				lastArrayList.add("𝐚");
			}
			else if (String.valueOf(firstArray.get(j)).contains("b")) {
				lastArrayList.add("𝐛");
			}
			else if (String.valueOf(firstArray.get(j)).contains("c")) {
				lastArrayList.add("𝐜");
			}
			else if (String.valueOf(firstArray.get(j)).contains("d")) {
				lastArrayList.add("𝐝");
			}
			else if (String.valueOf(firstArray.get(j)).contains("e")) {
				lastArrayList.add("𝐞");
			}
			else if (String.valueOf(firstArray.get(j)).contains("f")) {
				lastArrayList.add("𝐟");
			}
			else if (String.valueOf(firstArray.get(j)).contains("g")) {
				lastArrayList.add("𝐠");
			}
			else if (String.valueOf(firstArray.get(j)).contains("h")) {
				lastArrayList.add("𝐡");
			}
			else if (String.valueOf(firstArray.get(j)).contains("i")) {
				lastArrayList.add("𝐢");
			}
			else if (String.valueOf(firstArray.get(j)).contains("j")) {
				lastArrayList.add("𝐣");
			}
			else if (String.valueOf(firstArray.get(j)).contains("k")) {
				lastArrayList.add("𝐤");
			}
			else if (String.valueOf(firstArray.get(j)).contains("l")) {
				lastArrayList.add("𝐥");
			}
			else if (String.valueOf(firstArray.get(j)).contains("m")) {
				lastArrayList.add("𝐦");
			}
			else if (String.valueOf(firstArray.get(j)).contains("n")) {
				lastArrayList.add("𝐧");
			}
			else if (String.valueOf(firstArray.get(j)).contains("o")) {
				lastArrayList.add("𝐨");
			}
			else if (String.valueOf(firstArray.get(j)).contains("p")) {
				lastArrayList.add("𝐩");
			}
			else if (String.valueOf(firstArray.get(j)).contains("q")) {
				lastArrayList.add("𝐪");
			}
			else if (String.valueOf(firstArray.get(j)).contains("r")) {
				lastArrayList.add("𝐫");
			}
			else if (String.valueOf(firstArray.get(j)).contains("s")) {
				lastArrayList.add("𝐬");
			}
			else if (String.valueOf(firstArray.get(j)).contains("t")) {
				lastArrayList.add("𝐭");
			}
			else if (String.valueOf(firstArray.get(j)).contains("u")) {
				lastArrayList.add("𝐮");
			}
			else if (String.valueOf(firstArray.get(j)).contains("v")) {
				lastArrayList.add("𝐯");
			}
			else if (String.valueOf(firstArray.get(j)).contains("w")) {
				lastArrayList.add("𝐰");
			}
			else if (String.valueOf(firstArray.get(j)).contains("x")) {
				lastArrayList.add("𝐱");
			}
			else if (String.valueOf(firstArray.get(j)).contains("y")) {
				lastArrayList.add("𝐲");
			}
			else if (String.valueOf(firstArray.get(j)).contains("z")) {
				lastArrayList.add("𝐳");
			}
			else if (String.valueOf(firstArray.get(j)).contains("A")) {
				lastArrayList.add("𝑨");
			}
			else if (String.valueOf(firstArray.get(j)).contains("B")) {
				lastArrayList.add("𝑩");
			}
			else if (String.valueOf(firstArray.get(j)).contains("C")) {
				lastArrayList.add("𝑪");
			}
			else if (String.valueOf(firstArray.get(j)).contains("D")) {
				lastArrayList.add("𝑫");
			}
			else if (String.valueOf(firstArray.get(j)).contains("E")) {
				lastArrayList.add("𝑬");
			}
			else if (String.valueOf(firstArray.get(j)).contains("F")) {
				lastArrayList.add("𝑭");
			}
			else if (String.valueOf(firstArray.get(j)).contains("G")) {
				lastArrayList.add("𝑮");
			}
			else if (String.valueOf(firstArray.get(j)).contains("H")) {
				lastArrayList.add("𝑯");
			}
			else if (String.valueOf(firstArray.get(j)).contains("I")) {
				lastArrayList.add("𝑰");
			}
			else if (String.valueOf(firstArray.get(j)).contains("J")) {
				lastArrayList.add("𝑱");
			}
			else if (String.valueOf(firstArray.get(j)).contains("K")) {
				lastArrayList.add("𝑲");
			}
			else if (String.valueOf(firstArray.get(j)).contains("L")) {
				lastArrayList.add("𝑳");
			}
			else if (String.valueOf(firstArray.get(j)).contains("M")) {
				lastArrayList.add("𝑴");
			}
			else if (String.valueOf(firstArray.get(j)).contains("N")) {
				lastArrayList.add("𝑵");
			}
			else if (String.valueOf(firstArray.get(j)).contains("O")) {
				lastArrayList.add("𝑶");
			}
			else if (String.valueOf(firstArray.get(j)).contains("P")) {
				lastArrayList.add("𝑷");
			}
			else if (String.valueOf(firstArray.get(j)).contains("Q")) {
				lastArrayList.add("𝑸");
			}
			else if (String.valueOf(firstArray.get(j)).contains("R")) {
				lastArrayList.add("𝑹");
			}
			else if (String.valueOf(firstArray.get(j)).contains("S")) {
				lastArrayList.add("𝑺");
			}
			else if (String.valueOf(firstArray.get(j)).contains("T")) {
				lastArrayList.add("𝑻");
			}
			else if (String.valueOf(firstArray.get(j)).contains("U")) {
				lastArrayList.add("𝑼");
			}
			else if (String.valueOf(firstArray.get(j)).contains("V")) {
				lastArrayList.add("𝑽");
			}
			else if (String.valueOf(firstArray.get(j)).contains("W")) {
				lastArrayList.add("𝑾");
			}
			else if (String.valueOf(firstArray.get(j)).contains("X")) {
				lastArrayList.add("𝑿");
			}
			else if (String.valueOf(firstArray.get(j)).contains("Y")) {
				lastArrayList.add("𝒀");
			}
			else if (String.valueOf(firstArray.get(j)).contains("Z")) {
				lastArrayList.add("𝒁");
			}
			else if (String.valueOf(firstArray.get(j)).contains("0")) {
				lastArrayList.add("𝟎");
			}
			else if (String.valueOf(firstArray.get(j)).contains("1")) {
				lastArrayList.add("𝟏");
			}
			else if (String.valueOf(firstArray.get(j)).contains("2")) {
				lastArrayList.add("𝟐");
			}
			else if (String.valueOf(firstArray.get(j)).contains("3")) {
				lastArrayList.add("𝟑");
			}
			else if (String.valueOf(firstArray.get(j)).contains("4")) {
				lastArrayList.add("𝟒");
			}
			else if (String.valueOf(firstArray.get(j)).contains("5")) {
				lastArrayList.add("𝟓");
			}
			else if (String.valueOf(firstArray.get(j)).contains("6")) {
				lastArrayList.add("𝟔");
			}
			else if (String.valueOf(firstArray.get(j)).contains("7")) {
				lastArrayList.add("𝟕");
			}
			else if (String.valueOf(firstArray.get(j)).contains("8")) {
				lastArrayList.add("𝟖");
			}
			else if (String.valueOf(firstArray.get(j)).contains("9")) {
				lastArrayList.add("𝟗");
			}
			else {
				lastArrayList.add(firstArray.get(j));
			}
		}
		
		String theFknWord= "";
		for (int k = 0; k<lastArrayList.size(); k++) {
			theFknWord = theFknWord + lastArrayList.get(k);
			
		}
		
		
		return theFknWord;
		
	}
	

	
}
