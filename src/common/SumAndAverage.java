/*Write a program called SumAndAverage to produce the sum of 1, 2, 3, ..., to an upperbound (e.g., 100). 
Also compute and display the average. The output shall look like:
m is 5050
erage is 50.5

The upperBoung is a member variable and initialized in the constructor. 
The sum method name isgetSum and the average getter method name is getAvg.*/

package common;

public class SumAndAverage {
	private int upperBound;

	public SumAndAverage(int upperBound) {
		super();
		this.upperBound = upperBound;
	}
	public int isgetSum(){
		int sum = 0;
		for (int i = 1; i <= this.upperBound; i++) {
			sum+=i;
		}
		return sum;
	}
	public double getAvg(){
		return (double)isgetSum() / this.upperBound;
	}
	public static void main(String[] args) {
		SumAndAverage sum = new SumAndAverage(20);
		System.out.println("Sum is " + sum.isgetSum());
		System.out.println("Average is " + sum.getAvg());
	}
}
