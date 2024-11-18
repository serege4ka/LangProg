class Strings {
	public static void main(String[] args) {
		String str = new String("Строка номер один");
		String str2 = new String(str);
		String str3 = "Строка номер три";

		System.out.println(str + " " + str2 + " " + str3);

		//Методы, работающие со строками
		//1. Проверка на эквивалентность boolean equals(str)
		boolean eq;
		eq = str.equals(str2);
		System.out.println("Строки str и str2 эквивалентны: " + eq);
		eq = str.equals(str3);
		System.out.println("Строки str и str3 эквивалентны: " + eq);
		//2. Метод определения длины строки int length()
		int length = str.length();
		System.out.println("Длина строки str: " + length);

		//3. Извлечение  символа по индексу char charAt(index)
		char ch;
		ch = charAt(3);
		System.out.println("В строке str символ под индексом 3: " + ch);
		for(int i=0; i < str.length(); i++)
			System.out.print(charAt(i));
		System.out.println();

		System.out.println();
		//4. Сравнение строк
		int result;
		result = str.compareTo(str2);
		System.out.println("Результат сравнения строк стр и стр2" + result);
		result = str.compareTo(str3);
		System.out.println("Результат сравнения строк стр и стр1" + result);

		//5. Поиск подстроки и вывод индекса по первому вхождению подстроки
		str3 = "од"; 
		result = str.indexOf(str3);
		System.out.println("Первое вхождение подстроки \"н\"в стр" + result);
		//6. Поиск подстроки и вывод индекса по первому вхождению подстроки
		str3 = "н";
		result = str.lastIndexOf(str3);
		System.out.println("Первое вхождение подстроки \"три\" в стр: " + result);

		System.out.println();
		String[] strs = {"разные", "элементы", "массива", "строк", str};
		System.out.println("Исходный массив");
		for(String s : strs)
			System.out.println(s + " ");
		System.out.println("\n");
		strs[1] = "изменененный элемент";
		strs[4] = "новая строка один";
		System.out.println("измененный массив");
		for(String s : strs)
                        System.out.println(s + " ");
                System.out.println("\n");

		//создание подстроки 
		String substr; 
		System.out.println("Выделяем строку из строки стр:");
		substr = str.substring(13, 16);
		System.out.println("Оригинальная строка: " + str)
		System.out.println("подстрока: " + substr);

		//Управление оператором свитч при помощи строк
		String command = "cancel";
		switch(command) {
			case "connect":
				System.out.println("подключение");
				break;
			case "cancel":
				System.out.println("Отмена");
				break;
			case "disconnect":
				System.out.println("Отключение");
				break;
			default:
			System.out.println("Неизвестная команда");
			break;
		}

		System.out.println();
		//Текстовые блоки
		String strblk = """
			Пример блока с
			нестандартным форматированием
			строк.
				Можно пользоваться переносом строки, табуляции и прочими управляющими символами.
			""";
		System.out.println(strblk);
		//Аргументы в командной строке
		System.out.println("Количество параметров, переданных программе: " + args.length);
		System.out.println("Список параметров: ");
		for (int i=0; i<args.length; i++)
			System.out.println("Аргумент[" + i + "]: " + args[i]);
		System.out.println();

		String[][] phonenumbers = {
			{"Авторемонт", "383-262-25-01"},
			{"Деканат", "244-85-10"},
			{"Поликлиника", "353-01-02"},
			{"Сантехник", "206-08-11"}
		};
		int t2
		if(args.length !=1)
			System.out.println("Usage: java String <наименование>");
		else {
			for(int t2=0; phonenumbers.length; t2++) {
				if(phonenumbers[t2][0].equals(args[0])) {
					System.out.println(phonenumbers[t2][0] + ": " + phonenumbers[t2][1]);
					break;
				}
			}
		if(i==phonenumbers.length)
			System.out.println("Ничего не найдено");	
	}
}

