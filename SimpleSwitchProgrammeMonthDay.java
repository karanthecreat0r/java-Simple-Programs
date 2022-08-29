public class switchexcersiserunner {
	public static void main(String[] args) {
		System.out.println(determinNameofmonth(3));
		System.out.println(determinNameofday1(3));
	}

	public static String determinNameofmonth(int monthnumber) {
		String result = "";
		switch (monthnumber) {
		case 1: 
			result = "January";
			break;
		case 2: 
			result = "Fibuary";
			break;
		case 3: 
			result = "march";
			break;
		case 4: 
			result = "APirl";
			break;
		case 5: 
			result = "May";
			break;
		case 6: 
			result = "June";
			break;
		case 7:
			result = "Jully";
			break;
		case 8:
			result = "Augest";
			break;
		case 9:
			result = "September";
			break;
		case 10:
			result = "October";
			break;
		case 11:
			result = "November";
			break;
		case 12:
			result = "December";
			break;
		}
		return result;
	}

	public static String determinNameofday1(int daynumber) {
		String result1 = "";
		switch (daynumber) {
		case 0:
			result1 = "Sunday";
			break;
		case 1:
			result1 = "Monday";
			break;
		case 2:
			result1 = "Tuesday";
			break;
		case 3:
			result1 = "Wednesday";
			break;
		case 4:
			result1 = "Thursday";
			break;
		case 5:
			result1 = "Friday";
			break;
		case 6:
			result1 = "Saturday";
			break;
		}
		return result1;
	}
}
