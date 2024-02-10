
// Имплементируем интерфейс iCalculable
public class Calculator implements iCalculable {
  // Создание экземпляра класса логгер

  // Переопрелеляем метод Sum для сложения комплексных чисел
  @Override
  public void sum(int a, int b, int c, int d, String i) {
    System.out.println("Cложение комплексного числа " + "a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", i=i");
    System.out.println("(a + bi) + (c + di) = " + ((a + c) + (b + d)) + "i");
    System.out.println();
  }

  // Переопрелеляем метод Multi для умножения комплексных чисел
  @Override
  public void multi(int a, int b, int c, int d, String i) {
    System.out.println("Умножение комплексного числа " + "a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", i=i");
    System.out.println("(a + bi) * (c + di) = " + ((a * c) - (b * d) - (b * c) + (a * d)) + "i");
    System.out.println();
  }

  // Переопрелеляем метод Separate для деления комплексных чисел
  @Override
  public void separate(int a, int b, int c, int d, String i) {
    System.out.println("Деление комплексного числа " + "a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", i=i");
    System.out.println("(a + bi) / (c + di) = " + (((a + c) + (b + d)) / ((c * c) + (d * d))) + " + "
        + ((b * c - a * d) / (c * c + d * d)) + "i");
    System.out.println();
  }
}
