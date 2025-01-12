package com.in28minutes.ifstatement.examples;

public class SwitchExerciseRunner {
	public static void main(String[] args) {
//		System.out.println(determineNameOfDay(4));
		System.out.println(isWeekDay(3));
	}

	public static boolean isWeekDay(int dayNumber) {
		switch (dayNumber) {
		/*
		case 0:
			return false;
		case 1:
			return true;
		case 2:
			return true;
		case 3:
			return true;
		case 4:
			return true;
		case 5:
			return true;
		case 6:
			return false;
		*/
		
		case 0:
		case 6:
			return false;
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			return true;
		}

		return false;
	}

	public static String determineNameOfDay(int dayNumber) {
		String result = "";

		switch (dayNumber) {
		case 0:
			result = "Sunday";
			break;
		case 1:
			result = "Monday";
			break;
		case 2:
			result = "Tuesday";
			break;
		case 3:
			result = "Wednesday";
			break;
		case 4:
			result = "Thursday";
			break;
		case 5:
			result = "Friday";
			break;
		case 6:
			result = "Saturday";
			break;
		default:
			result = "Invalid_day";
		}

		return result;
//		굳이 result로 안받고 바로 return으로 값을 줘도 됨
	}
}
