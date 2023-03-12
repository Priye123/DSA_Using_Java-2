package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import sorting.SortDates.DatePair;

class SortByYear implements Comparator<DatePair> {

	@Override
	public int compare(DatePair o1, DatePair o2) {
		return o1.year.compareTo(o2.year);
	}

}

class SortByMonth implements Comparator<DatePair> {

	@Override
	public int compare(DatePair o1, DatePair o2) {
		return o1.month.compareTo(o2.month);
	}

}

class SortByDay implements Comparator<DatePair> {

	@Override
	public int compare(DatePair o1, DatePair o2) {
		return o1.day.compareTo(o2.day);
	}

}

public class SortDates {

	static class DatePair {
		String day;
		String month;
		String year;

		public DatePair(String day, String month, String year) {
			this.day = day;
			this.month = month;
			this.year = year;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int arr[] = new int[size];
		String dates[] = new String[size];

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt(); //ddmmyyyy :- 26101997
			dates[i] = Integer.toString(arr[i]);
		}

		List<DatePair> list = new ArrayList<>();

		for (int i = 0; i < size; i++) {
//			list.add(new DatePair(Integer.parseInt(dates[i].substring(0, 2),10),
//					Integer.parseInt(dates[i].substring(2, 4),10), Integer.parseInt(dates[i].substring(4),10)));
			list.add(new DatePair(dates[i].substring(0, 2), dates[i].substring(2, 4), dates[i].substring(4)));
		}

		for (DatePair date : list) {
			System.out.println(date.day + " " + date.month + " " + date.year);
		}

		System.out.println("Date Sorting---");
		Collections.sort(list, new SortByYear());
		Collections.sort(list, new SortByMonth());
		Collections.sort(list, new Comparator<DatePair>() {
			@Override
			public int compare(DatePair o1, DatePair o2) {
				return o1.day.compareTo(o2.day);
			}
		});

		for (DatePair date : list) {
			System.out.println(date.day + " " + date.month + " " + date.year);
		}

	}

}
