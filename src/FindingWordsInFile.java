import java.io.*;
import java.util.Objects;

public class FindingWordsInFile {
    public static File file = new File("Paczus.txt");
    public static void makingFiles(File name) throws IOException {
        FileWriter fileWriter= new FileWriter(name);
        BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
        bufferedWriter.append("""
                Half an autumn moon above Mt Emei
                Its reflection floating on the Qiang River
                Tonight, departing Qingxi for Sanxia
                Missing you, on my way to Yuzhou\s""");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        fileWriter.close();
        bufferedWriter.close();

    }
    public static void readingSearching(File name) throws IOException {
        FileReader fileReader= new FileReader(name);
        BufferedReader bufferedReader= new BufferedReader(fileReader);
        String line;
        String[] words;
        String wantedWord= "to";
        int count =0;
        while((line= bufferedReader.readLine())!=null)
        {
            words=line.split(" ");
            for (String word : words) {
                System.out.println(word);
                if(Objects.equals(word, wantedWord))
                {
                    count++;
                }
            }

        }
        if(count==0)
        {
            System.out.println("Text doesn't contain the wanted word");

        }
        if(count>0)
        {
            System.out.println("Text contains the wanted word, appearing "+ count +" times");
        }
        fileReader.close();
        bufferedReader.close();

    }

    public static void main(String[] args) throws IOException {
        makingFiles(file);
        readingSearching(file);

    }

}
