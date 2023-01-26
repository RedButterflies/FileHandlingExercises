import java.io.*;

public class CountingCharsOnceMore {
    public static File file = new File("Fish.txt");
    public static void writingAFile(File name) throws IOException {
        FileWriter fileWriter= new FileWriter(name);
        BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
        bufferedWriter.append("""
                Abalone
                Anchovies
                Barramundi
                Black Cod
                Bombay Duck
                Bream
                Brill
                Carp
                Clams
                Cod
                Coley
                Crab
                Crayfish""");

bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();
    }
    public static void readingAndCounting(File name) throws IOException {
        FileReader fileReader = new FileReader(name);
        BufferedReader bufferedReader= new BufferedReader(fileReader);
        int charCount=0;
        int character;
        while((character=bufferedReader.read())!=-1)
        {
            System.out.println((char)character);charCount++;
        }System.out.println("End of file");
        System.out.println("Text file has "+charCount+" characters");
        fileReader.close();
        bufferedReader.close();

    }

    public static void main(String[] args) throws IOException {
        writingAFile(file);
        readingAndCounting(file);

    }

}
