package stock;
import java.util.ArrayList;

public class Average {
	static void avg(ArrayList<Securities> securitieslist, ArrayList<Double> average, int n) {

		for (int i = 0; i < securitieslist.size(); i++) {
			if (i < n - 1) {
				average.add(0.0);
				continue;
			}
			double q = 0;
			for (int w = i - (n - 1); w <= i; w++) {
				q += securitieslist.get(w).close;
			}
			average.add(q / n);
		}
	}
}
