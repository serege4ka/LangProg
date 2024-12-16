//Пример обобщенного класса с двумя обобщенными типами
class TwoGen <T, V> {
	//Объявление ссылки на объект обобщенного типа
	T ob1;
	V ob2;
	
	//конструктор
	TwoGen(T o1, V o2) {
		ob1 = o1;
		ob2 = o2;
	}
	
	void showType() {
		System.out.println("Тип T: " + ob1.getClass().getName());
		System.out.println("Тип V: " + ob2.getClass().getName());
	}

	T getOb1() {
		return ob1;
	}

	V getOb2() {
		return ob2;
	}
}
class TwoGenDemo {
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
		
		TwoGen <Double, String> tg2Ob;
		tg2Ob = new TwoGen<>(8.0, "Строка");
		
		//Типы объектов:
		tg2Ob.showType();
		
		double vd1 = tg2Ob.getOb1();
		String vs2 = tg2Ob.getOb2();

		System.out.println("Переменные vd1 и vs2: " + vd1 +  " " + vs2);
	}
}
