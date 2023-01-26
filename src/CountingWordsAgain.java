import java.io.*;

public class CountingWordsAgain {
    public static File file = new File("Burger.txt");
    public static void creatingFile(File name) throws IOException {
        FileWriter fileWriter = new FileWriter(name);
        BufferedWriter bufferedWriter =new BufferedWriter(fileWriter);
        bufferedWriter.append("""
                Half an autumn moon above Mt Emei
                Its reflection floating on the Qiang River
                Tonight, departing Qingxi for Sanxia
                Missing you, on my way to Yuzhou""");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        bufferedWriter.close();


    }
    public static void countingWords(File name) throws IOException {
        FileReader fileReader=new FileReader(name);
        BufferedReader bufferedReader= new BufferedReader(fileReader);
        String line;
        String[] words;
        int wordCount=0;
        while((line= bufferedReader.readLine())!=null)
        {
            words=line.split(" ");
            for (String word : words) {
                System.out.println(word);wordCount++;
            }

        }
        System.out.println("The text contains "+wordCount+" words");
        fileReader.close();
        bufferedReader.close();

    }

    public static void main(String[] args) throws IOException {
        creatingFile(file);
        countingWords(file);

    }
}
