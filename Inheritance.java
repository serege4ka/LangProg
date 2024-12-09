class TwoDShape {
    private double width;
    private double height;
    String name;
    int i = 100;
    
    TwoDShape(double w, double h) {
        if(w > 21.0)
            width = 21.0;
        else
            width = w;
        if(h > 29.7)
            height = 29.7;
        else
            height = h;
        name = "Двумерная фигура";
    }
    double getWidth() {
        return width;
    }
    double getHeight() {
        return height;
    }
    void setWidth(double w) {
        if(w > 21.0)
            width = 21.0;
        else
            width = w;
    }
    void setHeight(double h) {
        if(h > 29.7)
            height = 29.7;
        else
            height = h;
    }
    void showDim() {
        System.out.println("Размеры фигуры: " + width + " x " + height);
    }
    /*
    String showName() {
        return name;
    }
    */
    double area() {
	    System.out.println("метод должен быть переопределен");
		    return 0.0;
}
class Triangle extends TwoDShape {
    String style;
    Triangle(String s, double w, double h) {
        super(w, h); // Вызов конструктора суперкласса
        style = s;
        name = "Треугольник";
    }
    double area() {
        return getWidth() * getHeight() / 2;
    }
    void showStyle() {
        System.out.println("Стиль: " + style);
    }
    // Демонстрация доступа к одноименной переменной суперкласса
    int showSuperI() {
        return super.i
    }
    
    /*
    String showSuperName() {
        return super.name;
    }
    */
}
class ColorTriangle extends Triangle {
	String color;
	ColorTriangle(String c, String s, double w, double h) {
		super(s, w, h); //Вызов конструктора Triangle();
		color = c;
		name = "Цветной треугольник";
	}
	void showColor() { 
		System.out.println("Цвет: " + color);
	}
}
class Rectangle extends TwoDShape {
    Rectangle(String o, double w, double h) {
        super(w, h); // Вызов конструктора суперкласса
        outLine = o;
        name = "Прямоугольник";
    }
    String outLine;
    double area() {
        return getWidth() * getHeight();
    }
    boolean isSquare() {
        if (getWidth() == getHeight())
            return true;
        return false;
    }
}

class Interihance {
    public static void main(String[] args) {
        TwoDShape fig1 = new TwoDShape(20.0, 30.0);
        Triangle t1 = new Triangle("Закрашенный", 4.5, 7.0);
        ColorTriangle t2 = new ColorTriangle("Синий", "Контурный", 3.5, 8.0);
        Rectangle r1 = new Rectangle("Сплошная линия", 5.0, 5.0);
        Rectangle r2 = new Rectangle("Пунктирная линия", 5.0, 7.0);
        System.out.println("Информация об объектах");
        System.out.println("fig1: " + fig1.name);
        fig1.showDim();
        System.out.println("t1: " + t1.name);
        t1.showStyle();
        System.out.println("Площадь: " + t1.area());
        // t1.showSuperName();
        System.out.println():
        System.out.println("r1 " + r1.name);
        System.out.println("Квадрат: " + r1.isSquare());
        System.out.println("Площадь: " + r1.area());
        //Совместимость переменных родственных классов
	//Переменна супер класса может ссылаться на объект
	System.out.println();
	System.out.println("Ширина двумерной фигуры fig1: " + fig1.getWidth());
	//При указании на объект суперкласса выполняется метод суперкласса
	fig1.area();

	fig1 = t1;
	System.out.println("Ширина треугольника, на который ссылется fig1: " + fig1.getWidth());
	//При указании на объект подкласса "Треугольник" выполняется вычисление площади для треугольника
	System.out.println("Площадь треугольника: " + fig1.area());

	fig1 = r1; 
	System.out.println("Ширина прямоугольника, на который ссылается: " + fig1.getWidth());
	//При указании на объект подкласса "Прямоугольник" выполняется вычисление площади для прямоугольника
	System.out.println("Площадь прямоугольника: " + fig1.area());

	fig1 = t2;
	t2.showColor();
	System.out.println("Площадь цветного треугольникка: " + fig1.area());

	// Доступ к членам подкласса для ссылочных переменных закрыт: 
	// System.out.println(fig1.style);

        // Проверка доступности переменных
        /*
        System.out.println(fig1.wigth);
        System.out.println(t1.width); // Подкласс имеет доступ к переменным и методам суперкласса
        System.out.println(fig1.style); // Супер класс не имеет доступа к переменным, описанным в подклассе
        */
    }
}
