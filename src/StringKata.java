import java.util.*;
import java.util.regex.*;

public class StringKata {
	public static void main(String[] args) {
		System.out.println(add("1, 4, 6"));

	}

	public static int add(String n) {
		n = n.trim();
		int total = 0;
		String delim = ",";
		ArrayList<Integer> negs = new ArrayList<Integer>();
		if (n.contains("\n")) {
			String n1 = n.substring(0, n.indexOf('\n'));
			if (Pattern.matches("//.*", n1)) {
				String d = n1.substring(n1.indexOf("//") + 2, n1.length());
				delim = d;
				n = n.substring(n.indexOf('\n') + 1);
			}
		}
		n = n.replace("\n", ",");
		n = n.replace(delim, ",");

		if (!n.contentEquals("")) {
			String[] list = n.split(",");
			for (int i = 0; i < list.length; i++) {
				list[i] = list[i].trim();

				if (Pattern.matches("-?\\d*", list[i])) {
					if (list[i].length() > 3) {
						int l = list[i].length();
						list[i] = list[i].substring(l - 3, l);
					}

					int t = Integer.parseInt(list[i]);

					if (t < 0) {

						negs.add(t);

					}
					total += t;
				}
			}
		}
		if (!negs.isEmpty()) {
			for (int neg : negs) {
				System.out.print(neg + " ");
			}
			System.out.println();
			total = 0;
			System.out.println("Negatives are not allowed");

		}

		return total;

	}

}