

import java.util.Collections;

import java.util.List;

public class BinarySearch {
	int target, first, last;
	List<Integer> lis;

	public BinarySearch(List<Integer> lis, int target, int first, int last) {
		this.first = first;
		this.target = target;
		this.last = last;
		this.lis = lis;
	}

	public void Search() {
		Collections.sort(lis);
		while (first <= last) {
			int m = (int) (first + last) / 2;
			int midElement = lis.get(m);
			if (midElement < target) {
				first = lis.indexOf(midElement) + 1;
			} else if (midElement > target) {
				last = lis.indexOf(midElement) - 1;
			} else if (midElement == target) {
				System.out.println("The value is found at index " + lis.indexOf(midElement));
				System.exit(0);
			}
		}
		System.out.println("value not found");
	}
}