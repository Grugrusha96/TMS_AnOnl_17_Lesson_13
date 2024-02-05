package Text2;

//2. Создать коллекцию класса ArrayList со значениями имен всех студентов
// в группе
// С помощью Stream'ов:
// - Вернуть количество людей с вашим именем (вне
// зависимости от верхнего/нижнего регистра букв)
// - Выбрать все имена, начинающиеся на "а" (вне зависимости от
// верхнего/нижнего регистра букв)
// - Отсортировать и вернуть первый элемент коллекции или
// "Empty@, если коллекция пуста

import java.util.ArrayList;
import java.util.List;

public class Text2 {
    public static void main(String[] args) {
        List<String> listName = makeNameList();


        int countName = (int) listName.stream()
                .filter("Слава"::equalsIgnoreCase)
                .count();
        System.out.println(countName);


        listName.stream()
                .filter(it -> it.toUpperCase().startsWith("а"))
                .forEach(System.out::println);


        String firstName = listName.stream()
                .sorted()
                .findFirst()
                .orElse("Empti@");
        System.out.println(firstName);
    }

    private static List<String> makeNameList(){
        List<String> list = new ArrayList<>();

        list.add("Слава");
        list.add("Настя");
        list.add("Коля");
        list.add("Оля");
        list.add("Слава");
        list.add("андрей");
        list.add("Антон");
        list.add("Света");
        list.add("Маша");
        list.add("сергей");
        list.add("Матвей");
        return list;
    }
}
