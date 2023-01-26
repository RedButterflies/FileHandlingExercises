import java.io.*;

public class WritingTextCharacterByCharacter {
    public static File file= new File("Bread.txt");
    public static void writing(File name) throws IOException {
        FileWriter fileWriter= new FileWriter(name);
        fileWriter.append("O");
        fileWriter.flush();
        fileWriter.append("L");
        fileWriter.flush();
        fileWriter.append("A");
        fileWriter.flush();
        fileWriter.close();
    }
    public static void read(File name) throws IOException {
        FileReader fileReader= new FileReader(name);
        BufferedReader bufferedReader= new BufferedReader(fileReader);
        String line;
        while((line= bufferedReader.readLine())!=null)
        {
            System.out.println(line);
        }
        fileReader.close();
        bufferedReader.close();

    }

    public static void main(String[] args) throws IOException {
        writing(file);
        read(file);

    }



}
