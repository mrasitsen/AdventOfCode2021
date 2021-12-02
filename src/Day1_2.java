import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day1_2 {

    public static void main(String[] args){

        List<Integer> ls = new ArrayList<>();
        int result = 0;

        try{
            Scanner sc = new Scanner(new FileReader("file/day1.txt")); //data to read
            while(sc.hasNext()){
                ls.add(sc.nextInt());
            }

            int prevNum = ls.get(0) + ls.get(1) + ls.get(2); //get the first record

            for(int i=1; i < ls.size(); i += 4){

                for(int j=i; j<i+4; ++j){

                    if(j == ls.size()-2) break; //for the last loop, it contains only 3
                    int nextNum = 0;

                    for(int k=j; k<j+3; ++k){
                        nextNum += ls.get(k);
                    }

                    if(nextNum > prevNum) result += 1;
                    prevNum = nextNum;
                }
            }

            System.out.println(result);

        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
