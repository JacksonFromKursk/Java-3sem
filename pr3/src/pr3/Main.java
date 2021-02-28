package pr3;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {


    public static void main(String[] args) throws  Exception {
        String easy = RandomString.digits + "ACEFGHJKLMNPQRUVWXYabcdefhijkprstuvwx";
        /*RandomString gen = new RandomString(9, new SecureRandom(), easy);
        System.out.println(gen.nextString());*/
        Counter cout1 = new Counter();
        HashSet<String> ex_1 = new HashSet<String>();
        System.out.println("Set с использованием ключевого слова synchronized");
       Thread ex1_1 = new Thread(()->{
            for (int i = 0; i < 5000; i++) {
                cout1.plus1();
                RandomString gen = new RandomString(9, new SecureRandom(), easy);
                ex_1.add(gen.nextString1());
            }
        });
        Thread ex1_2 = new Thread(()->{
            for (int i = 0; i < 5000; i++) {
                cout1.plus1();
                RandomString gen = new RandomString(9, new SecureRandom(), easy);
                ex_1.add(gen.nextString1());
            }
        });
        ex1_1.start();
        ex1_2.start();
        Thread.sleep(3000);
        System.out.println("Было сгенерировано " +cout1.getCount()+ " строк и добавлено в коллекцию\n");

        System.out.println("Map с использованием Lock");
        Map<Integer, String> ex_2 = new HashMap<Integer, String>();
        Counter cout2 = new Counter();
        Thread ex2_1 = new Thread(()->{
            for (int i = 0; i < 5000; i++) {
                cout2.plus2();
                RandomString gen = new RandomString(9, new SecureRandom(), easy);
                ex_2.put(cout2.getCount(),gen.nextString2());
            }
        });
        Thread ex2_2 = new Thread(()->{
            for (int i = 0; i < 5000; i++) {
                cout2.plus2();
                RandomString gen = new RandomString(9, new SecureRandom(), easy);
                ex_2.put(cout2.getCount(),gen.nextString2());
            }
        });
        ex2_1.start();
        ex2_2.start();
        Thread.sleep(3000);
        System.out.println("Было сгенерировано " +cout2.getCount()+ " строк и добавлено в словарь");
    }

}

