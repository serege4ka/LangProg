class Summation {
	private int sum;
	<T extends Numbler> Summation(T arg) {
		sum = 0;
		for(int i=0; i<=arg.intValue(); i++)
			sum += i;
	}
	int getSum() {
		return sum;
	} 
}
class GenCdemo {
	public static void main (String[] args) {
		Summation ob = new Summation(4.0);
		System.out.println("Сумма целых чисел от 0 до 4: " + ob.getSum());
	}
}
