import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Day1_1 {

    public static void main(String[] args) {

        int result = 0;

        try{
            Scanner sc = new Scanner(new FileReader("file/day1.txt")); //data to read
            int prevNum = sc.nextInt();
            int nextNum;
            while(sc.hasNext()){
                nextNum = sc.nextInt();
                if(nextNum > prevNum){
                    result++;
                }
                prevNum = nextNum;
            }

        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }

        System.out.println(result);
    }
}
