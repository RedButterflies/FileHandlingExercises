import java.io.*;

public class CountingWordsInAFile {
    public static File file = new File("GuguMock.txt");
    public static void making(File name) throws IOException {
        FileWriter fileWriter= new FileWriter(name);
        BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
        bufferedWriter.append("""
                Asiatic lions
                Squirrel, Colobus and spider monkeys
                Camels
                Giraffes
                Okapis
                Western lowland gorillas
                Sumatran tigers
                Crocodiles, lizards, frogs and snakes
                Humbolt penguins
                Two-toed sloths
                Elephants
                Rhinos
                Giraffes
                Camels
                Patagonian mara (free-roaming)
                Chimpanzees
                Amur tigers
                Wolverines
                Rockhopper and African black-footed penguins
                Eurasian lynx""");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        fileWriter.close();
        bufferedWriter.close();


    }
    public static void readingAndCounting(File name) throws IOException {
        String line;
        String[]words;
        FileReader fileReader= new FileReader(name);
        BufferedReader bufferedReader= new BufferedReader(fileReader);
        int wordCount=0;
        while((line= bufferedReader.readLine())!=null)
        {
            words= line.split(" ");
            for (String word : words) {
                System.out.println(word);
                wordCount++;
            }
        }

        System.out.println("The text has "+wordCount+" words");
        fileReader.close();
        bufferedReader.close();

    }

    public static void main(String[] args) throws IOException {
        making(file);
        readingAndCounting(file);
    }

}
