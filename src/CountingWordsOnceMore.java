import java.io.*;

public class CountingWordsOnceMore {
    public static File file=new File("Somebody.txt");
    public static void creating(File name) throws IOException {
        FileWriter fileWriter= new FileWriter(file);
        BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
        bufferedWriter.append("""
                A teetering tower a hundred feet high
                I can pick my very own star
                But I dare not speak loudly
                For fear of startling God\s""");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        fileWriter.close();
        bufferedWriter.close();



    }
    public static void counting(File name) throws IOException {
        FileReader fileReader= new FileReader(name);
        BufferedReader bufferedReader= new BufferedReader(fileReader);
        String line;
        String[]words=null;
        int wordCount=0;
        while((line= bufferedReader.readLine())!=null)
        {
            words=line.split(" ");
            for (String word : words) {
                System.out.println(word);wordCount++;
            }
        }
        System.out.println("The file contains "+wordCount+" words");
        fileReader.close();
        bufferedReader.close();

    }

    public static void main(String[] args) throws IOException {
        creating(file);
        counting(file);

    }

}
