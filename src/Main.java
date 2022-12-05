import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Do you  wanna see alphabet? Write 1  ");
        switch (scanner.nextByte()){
            case 1 -> getFileREader();
            case 2 -> getFileWriter();
        }

        // Саламатсызбы агай, Ден соолугунуз жакшыбы? Тапшырманы  озум жазган жокмун тушундуруп беришти кеч болсо дагы
        // озум учун жазып жиберип койдум.

    }

    public static void getFileWriter() {
        try(FileWriter fileWriter = new FileWriter("Alphabet.txt")){
            for (char i = 'A', j = 'a';  i <= 'Z' ; i++, j++) {
                fileWriter.write(i + " " + j + "\n");
            }
            for (int i = 0; i < 10; i++) {
                fileWriter.write(i + "\n");

            }
        }catch ( IOException e) {
            e.getStackTrace();
        }

    }

    public static void getFileREader() {
        try(FileReader fileReader = new FileReader("Alphabet.txt")){
            Scanner scanner = new Scanner(fileReader);
            int counter = 0;

            while (scanner.hasNextLine()){
                counter++;
                System.out.println(counter+ ": "+ scanner.nextLine());
            }
        }catch (IOException e){
            e.getStackTrace();
        }

    }
}