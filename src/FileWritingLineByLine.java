import java.io.*;

public class FileWritingLineByLine {
    public static File file = new File("flower.txt");
    public static void writing(File name) throws IOException {
        FileWriter fileWriter= new FileWriter(name);
        fileWriter.append("Someone bought me a flower\n");
        fileWriter.flush();
        fileWriter.append("It was quite beautiful\n");
        fileWriter.flush();
        fileWriter.append("But the person was even prettier\n");
        fileWriter.flush();
        fileWriter.close();

    }
    public static void reading(File name) throws IOException {
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
        reading(file);

    }

}
