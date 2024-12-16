//Пример обобщенного класса
class Gen <T> {
	//Объявление ссылки на объект обобщенного типа
	T ob;
	
	//конструктор
	Gen(T o) {
		ob = o;
	}
	//Методы для проверки информации об объектах
	T getOb() {
		return ob;
	}

	void showType() {
		System.out.println("Тип T: " + ob.getClass().getName());
	}
}
class GenDemo {
	public static void main(String[] args) {
		//Объявили переменную класса Gen
		Gen <Double> dOb;
		//Создаем объект
		dOb = new Gen <Double> (100.00);
		//Ошибочное использование:
		//iOb = new Gen <Integer> (100.0);
		
		dOb.showType();
		double x = dOb.getOb();
		System.out.println("Значение x: " + x);
		System.out.println();

		Gen <String> sOb;
		sOb = new Gen<>("Строка");
		sOb.showType();
		String s = sOb.getOb();
		System.out.println("Значение s: " + s);
		System.out.println();

		//Неверное присваивание несовместимых объектов
		//dOb = iOb;
	}
}
