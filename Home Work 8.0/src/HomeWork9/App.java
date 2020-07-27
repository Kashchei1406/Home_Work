package HomeWork9;

import java.util.*;


public class App {

    public static void main(String[] args) {

        //Первое задание

 /*     String text = "AAA bb ccc vvv sas ff ggg ,,.";
        String[] stringToArrayLetters = text.split("\\.*");
        Map<String, Integer> numberOfLetters = new HashMap<>();
        int count;

        for (int i = 0; i < stringToArrayLetters.length; i++) {
            count = 0;

            for (int j = 0; j < stringToArrayLetters.length; j++) {
                if (stringToArrayLetters[i].equals(stringToArrayLetters[j])) {
                    count++;
                }
            }
            numberOfLetters.put(stringToArrayLetters[i], count);
        }

        System.out.println(numberOfLetters);
        numberOfLetters.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);
 */

        //Второе задание

/*        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        int count = -1;

        while (!list.contains("end")) {
            System.out.println("Введите значение: ");
            list.add(scanner.next());
            System.out.println("Если хотите закончить введите end");
            count++;
        }

        list.remove(count);
        System.out.println(list);
*/

        //Третье задание
 /*       Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Queue<Integer> queue = new ArrayDeque<>();
        int user1, user2;

        for (int i = 0; i < 10; i++) {
            queue.add(random.nextInt(16));
        }
        System.out.println(queue.toString());

        for (int i = 0; i < 11; i++) {

            if (queue.isEmpty()) {
                System.out.println("Game over очередь пуста");
                return;
            }

            System.out.println("Игрок номер один введите значение от 0 до 15: ");
            user1 = scanner.nextInt();
            if (user1 == queue.peek()) {
                System.out.println("User1 Win!");
                return;
            }

            System.out.println("Игрок номер два введите значение от 0 до 15: ");
            user2 = scanner.nextInt();
            if (user2 == queue.peek()) {
                System.out.println("User2 Win!");
                return;
            }
            queue.remove();
            System.out.println(queue.toString());
            }
  */
        //Четвертое задание

        int size = 10000000;

        Random random = new Random();

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        long startTime;
        long endTime;

        System.out.println("Add time:");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            hashMap.put(random.nextInt(1000), random.nextInt(1000));
        }
        endTime = System.currentTimeMillis();
        System.out.println("HashMap add time: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            treeMap.put(random.nextInt(1000), random.nextInt(1000));
        }
        endTime = System.currentTimeMillis();
        System.out.println("ThreeMap add time: " + (endTime - startTime));

        System.out.println();

        startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            hashSet.add(random.nextInt(1000));
        }
        endTime = System.currentTimeMillis();
        System.out.println("HashSet add time: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            treeSet.add(random.nextInt(1000));
        }
        endTime = System.currentTimeMillis();
        System.out.println("ThreeSet add time: " + (endTime - startTime) + '\n');

        System.out.println("Removal time:");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            hashMap.remove(random.nextInt(1000), random.nextInt(1000));
        }
        endTime = System.currentTimeMillis();
        System.out.println("Hashmap removal time: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            treeMap.remove(random.nextInt(1000), random.nextInt(1000));
        }
        endTime = System.currentTimeMillis();
        System.out.println("ThreeMap removal time: " + (endTime - startTime) + '\n');

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            hashSet.remove(random.nextInt(1000));
        }
        endTime = System.currentTimeMillis();
        System.out.println("HasSet removal time: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            treeSet.remove(random.nextInt(1000));
        }
        endTime = System.currentTimeMillis();
        System.out.println("ThreeSet removal time: " + (endTime - startTime) + '\n');

        System.out.println("Search time:");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            hashMap.get(random.nextInt(1000));
        }
        endTime = System.currentTimeMillis();
        System.out.println("Hashmap removal time: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            treeMap.get(random.nextInt(1000));
        }
        endTime = System.currentTimeMillis();
        System.out.println("ThreeMap removal time: " + (endTime - startTime) + '\n');

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            hashSet.contains(random.nextInt(1000));
        }
        endTime = System.currentTimeMillis();
        System.out.println("HasSet removal time: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            treeSet.contains(random.nextInt(1000));
        }
        endTime = System.currentTimeMillis();
        System.out.println("ThreeSet removal time: " + (endTime - startTime) + '\n');


    }
}














