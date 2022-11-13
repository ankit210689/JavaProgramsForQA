package javaProgramsforQA;

public class ComparisonOf2IntegerValuesWithoutIfCondition {
	public static void comparisonWithoutIf() {
		int x=10;
		int y=20;
		int greater=x>y?x:y;//Using ternary operator
		System.out.println(greater);
	}

	public static void main(String[] args) {
		comparisonWithoutIf();
		

	}

}
