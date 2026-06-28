package Task17;

import java.io.*;
import java.nio.charset.StandardCharsets;


public class Main {
    public static void main(String[] args) throws IOException {
        writeTextRelativePath();
        writeTextAbsolutePath();
        readTextRelativePath();
        readTextAbsolutePath();
        Car car = createCar();
        String path = "src/Task17/TestFolder/SerializationCar.txt";
        serialize(car, path);
        deserialize(path);

    }
//1.1 Записать текст в файл,  прописав относительный путь.
//Реализуйте соответствующий метод в классе Main.

    public static void writeTextRelativePath() {
        File file = new File("src\\Task17\\TestFolder\\TextFile.txt");
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write("The Rostóvs knew everybody in Moscow. " +
                    "The old count had money enough that year, as all his estates had been remortgaged, " +
                    "and so Nicholas, acquiring a trotter of his own, very stylish riding breeches of the " +
                    "latest cut, such as no one else yet had in Moscow, and boots of the latest fashion, " +
                    "with extremely pointed toes and small silver spurs, passed his time very gaily. " +
                    "After a short period of adapting himself to the old conditions of life, " +
                    "Nicholas found it very pleasant to be at home again. He felt that he had grown up " +
                    "and matured very much. His despair at failing in a Scripture examination, his borrowing" +
                    " money from Gavríl to pay a sleigh driver, his kissing Sónya on the sly—he now recalled " +
                    "all this as childishness he had left immeasurably behind. Now he was a lieutenant of hussars," +
                    " in a jacket laced with silver, and wearing the Cross of St. George, awarded to soldiers for" +
                    " bravery in action, and in the company of well-known, elderly, and respected racing men was " +
                    "training a trotter of his own for a race. He knew a lady on one of the boulevards whom he " +
                    "visited of an evening. He led the mazurka at the Arkhárovs’ ball, talked about the war with " +
                    "Field Marshal Kámenski, visited the English Club, and was on intimate terms with a colonel " +
                    "of forty to whom Denísov had introduced him");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Текст по относительному пути успешно записан!");
    }

    //1.2 Записать его в файл прописав абсолютный путь. Реализуйте соответствующий метод в классе Main
    public static void writeTextAbsolutePath() {
        File file = new File("D:\\fileForTask17", "Text2.txt");
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write("The Rostóvs knew everybody in Moscow. " +
                    "The old count had money enough that year, as all his estates had been remortgaged, " +
                    "and so Nicholas, acquiring a trotter of his own, very stylish riding breeches of the " +
                    "latest cut, such as no one else yet had in Moscow, and boots of the latest fashion, " +
                    "with extremely pointed toes and small silver spurs, passed his time very gaily. " +
                    "After a short period of adapting himself to the old conditions of life, " +
                    "Nicholas found it very pleasant to be at home again. He felt that he had grown up " +
                    "and matured very much. His despair at failing in a Scripture examination, his borrowing" +
                    " money from Gavríl to pay a sleigh driver, his kissing Sónya on the sly—he now recalled " +
                    "all this as childishness he had left immeasurably behind. Now he was a lieutenant of hussars," +
                    " in a jacket laced with silver, and wearing the Cross of St. George, awarded to soldiers for" +
                    " bravery in action, and in the company of well-known, elderly, and respected racing men was " +
                    "training a trotter of his own for a race. He knew a lady on one of the boulevards whom he " +
                    "visited of an evening. He led the mazurka at the Arkhárovs’ ball, talked about the war with " +
                    "Field Marshal Kámenski, visited the English Club, and was on intimate terms with a colonel " +
                    "of forty to whom Denísov had introduced him");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Текст по абсолютному пути успешно записан!");
    }

    //1.3 Вычитать текст из первого файла. Реализуйте соответствующий метод в классе Main
    public static void readTextRelativePath() {
        File file = new File("src\\Task17\\TestFolder\\TextFile.txt");
        try (FileReader fileReader = new FileReader(file, StandardCharsets.UTF_8)) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String text = bufferedReader.readLine();
            System.out.println("Текст по относительному пути успешно вычитан!" + "\n" + text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //1.4 Вычитать текст из второго файла Реализуйте соответствующий метод в классе Main
    public static void readTextAbsolutePath() {
        File file = new File("D:\\fileForTask17", "Text2.txt");
        try (FileReader fileReader = new FileReader(file, StandardCharsets.UTF_8)) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String text2 = bufferedReader.readLine();
            System.out.println("Текст по абсолютному пути успешно вычитан!" + "\n" + text2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

//В классе Main создать объект автомобиль.
//2.1. Выполнить сериализацию объекта. Реализуйте соответствующий метод в классе Main

    static Car createCar() {
        Car car = new Car("Peugeot", 201, "France");
        return car;
    }


    public static void serialize(Car car, String file) {

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(car);
            System.out.println("Объект: " + car + " сериализован!");
        } catch (Exception e) {
            throw new RuntimeException("Ошибка!");
        }
    }

    //2.2 Выполнить десериализацию автомобиля и вывести его в консоли. Реализуйте соответствующий метод в классе Main
    public static void deserialize(String file) {

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            Car car = (Car) objectInputStream.readObject();
            System.out.println("Десериализованный автомобиль: ");
            System.out.println(car);
        } catch (Exception e) {
            throw new RuntimeException("Ошибка!");
        }
    }
}