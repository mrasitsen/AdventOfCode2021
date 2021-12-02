import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Day2_2 {

    public static void main(String[] args) throws FileNotFoundException {
        int totalX = 0, totalY = 0 , magnitute, aim = 0;
        String command;

        Scanner sc = new Scanner(new FileReader("file/day2.txt"));
        while(sc.hasNext()){
            command = sc.next();
            magnitute = sc.nextInt();

            switch (command) {
                case "forward" -> {
                    totalX += magnitute;
                    totalY += (aim * magnitute);
                }
                case "up" -> aim -= magnitute;
                case "down" -> aim += magnitute;
            }
        }
        System.out.println(totalX * totalY);
    }
}
