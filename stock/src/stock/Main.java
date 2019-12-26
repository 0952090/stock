package stock;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<String> fileList = new ArrayList<String>();
		ReadFolder.readFolder(fileList);
		for (int i = 0; i < fileList.size(); i++) {
			System.out.println(fileList.get(i));
			avg("data/" + fileList.get(i));
		}
	}

	static void avg(String filePath) throws IOException {
		ArrayList<Securities> securitieslist = new ArrayList<Securities>();
		ArrayList<Double> average5 = new ArrayList<>();
		ArrayList<Double> average20 = new ArrayList<>();
		ArrayList<Double> average60 = new ArrayList<>();
		Read.read(securitieslist, filePath);
		Average.avg(securitieslist, average5, 5);
		Average.avg(securitieslist, average20, 20);
		Average.avg(securitieslist, average60, 60);
		String q = StockTool.todayGreaterThan60_0(securitieslist, average60);
		String q1 = StockTool.todayLessThanThan60_0(securitieslist, average60);
		String q2 = StockTool.todayLessThanThan20_0(securitieslist, average20);
		String q3 = StockTool.todayGreaterThan20_0(securitieslist, average20);
		String q4 = StockTool.TodayGreaterYesterday60(average60);
		System.out.println("さら基蔼60㏄絬0%" + q);
		System.out.println("さら基60㏄絬0%" + q1);
		System.out.println("さら基蔼20る絬0%" + q3);
		System.out.println("さら基20る絬0%" + q2);
		System.out.println("さら﹗絬琎ら" + q4);
	}
}
