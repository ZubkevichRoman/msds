package Homework14;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        /**
         * В задании приложен файл Ромео и Джульетта на английском, вычитать его в Idea.
         * Проанализировать и записать в другой файл самое длинное слово.
         */
        File input = new File("D:\\romeo-and-juliet.txt");
        String mostLongestWord = "";
        try (Scanner scanner = new Scanner(input)) {
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word.length() > mostLongestWord.length()) {
                    mostLongestWord = word;
                }
            }
        }catch (IOException e){
            throw new IOException(e.getMessage());
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\output.txt"))){
            bufferedWriter.write(mostLongestWord);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Most longest word: " + mostLongestWord);
    }
}
