package stock;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Read {
	static void read(ArrayList<Securities> securitieslist,String filePath) throws IOException {
		FileInputStream fis = new FileInputStream(filePath);
		BufferedReader br = new BufferedReader(new InputStreamReader(fis, "UTF-8"));//³]©w½s½X
		String oneLine;
		while (true) {
			oneLine = br.readLine();
			if (oneLine == null) {
				break;
			}
			String[] arr = oneLine.split(",");
			Securities a = new Securities();
			a.date = arr[0];
			a.tradingVolume = stringToDouble(arr[1]);
			a.turnover = stringToDouble(arr[2]);
			a.openingPrice = stringToDouble(arr[3]);
			a.highestPrice = stringToDouble(arr[4]);
			a.lowestPrice = stringToDouble(arr[5]);
			a.close = stringToDouble(arr[6]);
			a.priceDifference = stringToDouble(arr[7]);
			a.numberOfTransactions = stringToDouble(arr[8]);
			securitieslist.add(a);
	
		}
		br.close();
	}

	static long stringToLong(String s) {
		String[] arr = s.split(",");
		String q = "";
		for (int i = 0; i < arr.length; i++) {
			q = q + arr[i];
		}
		return Long.parseLong(q);
	}

	static double stringToDouble(String s) {
		if (s.equals("X0.00")) {
			return (0.00);
		}
		if (s.equals("")) {
			return (0.00);
		}
		if (s.equals("--")) {
			return (0.00);
		}
		if (s.equals("X")) {
			return (0.00);
		}
		if (s.equals("---")) {
			return (0.00);
		}
		
		String[] arr = s.split(",");
		String q = "";
		for (int i = 0; i < arr.length; i++) {
			q = q + arr[i];
		}
		return Double.parseDouble(q);

	}
}
