package Text1;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

//1. Создать коллекцию класса ArrayList наполнить ее элементами
//  рандомными элементами типа Integer.
//  С помощью Stream'ов:
//  - Удалить дубликаты
//  - Вывести все четные элементы в диапазоне от 7 до 17
//  (включительно)
//  - Каждый элемент умножить на 2
//  - Отсортировать и вывести на экран первых 4 элемента
//  - Вывести количество элементов в стриме
//  - Вывести среднее арифметическое всех чисел в стриме
public class Text1 {
    public static void main(String[] args) {
        List<Integer> listInteger = makeList();
        System.out.println("Оригинальный лист :" + listInteger);


        List<Integer> newList = listInteger.stream()
                .distinct()
                .filter(it -> it >= 7 && it <= 17 && it % 2 == 0)
                .peek(it -> System.out.println(it +" "))
                .map(it -> it * 2)
                .sorted()
                .limit(4)
                .toList();
        System.out.println("\n" + newList);


        int count = (int) listInteger.stream().count();
        System.out.println(count);


        OptionalDouble average = listInteger.stream()
                .mapToDouble(Integer::intValue)
                .average();
        System.out.println(average);

    }
    private static List<Integer> makeList(){
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 40; i++){
            list.add((int) (Math.random() * 20));
        }
        return list;
    }
}
