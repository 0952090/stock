package stock;

import java.util.ArrayList;

public class StockTool {
	static String todayGreaterThan60_0(ArrayList<Securities> securitieslist, ArrayList<Double> average60) {
		if (average60.get(average60.size() - 1) < securitieslist.get(securitieslist.size() - 1).close) {
			return "Y";
		}
		return "N";
	}
	static String todayLessThanThan60_0(ArrayList<Securities> securitieslist, ArrayList<Double> average60) {
		if (average60.get(average60.size() - 1) > securitieslist.get(securitieslist.size() - 1).close) {
			return "Y";
		}
		return "N";
	}
	static String todayLessThanThan20_0(ArrayList<Securities> securitieslist, ArrayList<Double> average20) {
		if (average20.get(average20.size() - 1) > securitieslist.get(securitieslist.size() - 1).close) {
			return "Y";
		}
		return "N";
	}
	static String todayGreaterThan20_0(ArrayList<Securities> securitieslist, ArrayList<Double> average20) {
		if (average20.get(average20.size() - 1) < securitieslist.get(securitieslist.size() - 1).close) {
			return "Y";
		}
		return "N";
	}
	
	
	static String TodayGreaterYesterday60(ArrayList<Double> average60) {
		if (average60.get(average60.size() - 2) < average60.get(average60.size()-1)) {
			return "Y";
		}
		return "N";
	}

}
