package com.in28minutes.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;
//	private int[] marks;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Student(String name, int... marks) {
		this.name = name;
//		this.marks = marks;
		for (int mark : marks) {
			this.marks.add(mark);
		}
	}

	public int getNumberOfMarks() {
//		return marks.length;
		return marks.size();
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}

//	public int getMaximumMark() {
//		int maximum = Integer.MIN_VALUE;
//		for (int mark : marks) {
//			if (mark > maximum) {
//				maximum = mark;
//			}
//		}
//		return maximum;
//	}

	public int getMaximumMark() {
		return Collections.max(marks);
	}

//	public int getMinimumMark() {
//		int minimum = Integer.MAX_VALUE;
//		for (int mark : marks) {
//			if (mark < minimum) {
//				minimum = mark;
//			}
//		}
//		return minimum;
//	}

	public int getMinimumMark() {
		return Collections.min(marks);
	}

	public BigDecimal getAverageMarks() {
		int sum = getTotalSumOfMarks();
		int number = getNumberOfMarks();

//		return new BigDecimal(sum / number);
		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
		// 98.3333...이 되기 떄문에 소수점을 명확히 지정해줘야 오류가 안뜸
	}

	@Override
	public String toString() {
		return name + marks;
	}

	public void addNewMark(int mark) {
		marks.add(mark);
	}

	public void removeMarkAtIndex(int index) {
		marks.remove(index);
	}
}
