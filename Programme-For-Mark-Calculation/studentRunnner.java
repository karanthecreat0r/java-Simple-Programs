package arreystart;

import java.math.BigDecimal;

public class studentRunnner {

	public static void main(String[] args) {
		int[] marks = { 80, 98, 97, 60, 72 };
		Student student = new Student("karan", marks);
		int number = student.getNumberOfMarks();
		System.out.println("N0mber of martks given= " + number);
		int sum = student.getTotalNumberOfMarks();
		System.out.println("Total sum is = " + sum);
		int maximumMark = student.getMaximumMark();
		System.out.println("maximum marks = " + maximumMark);
		int minimumMark = student.getMinimumMark();
		System.out.println("minimum Marks=" + minimumMark);
		BigDecimal average = student.getAverageMarks();
		System.out.println("Average Marks =" + average);
		BigDecimal percentage = student.getPercentage();
		System.out.println(percentage * 100);

	}

}
