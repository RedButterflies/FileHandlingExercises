import java.io.*;

public class CountingLinesInAFile {
    public static File file = new File("File.txt");
    public static void create() throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
        bufferedWriter.append("""
                On Lotus Mountain’s western peak
                Far and wide, I spied bright stars
                Bearing lotus flowers
                Weakly walking for it was not too clear.
                Inviting me to its cloudy stage was
                Wei Shuqing, guardian angel of Huashan.
                Dreamily I went with him,
                Riding in the sky on the back of wild geese
                Calling as they flew.
                At the river, at Luoyang are
                Blood is flowing, painting the grass along the river
                Covered in jackals like tassels on a cap
                """);
        bufferedWriter.newLine();
        bufferedWriter.flush();
        fileWriter.close();
        bufferedWriter.close();


    }
    public static void countingLines() throws IOException {
        int lineCount=0;
        FileReader fileReader= new FileReader(file);
        BufferedReader bufferedReader= new BufferedReader(fileReader);
        String line;
        while((line=bufferedReader.readLine())!=null)
        {
            lineCount++;
            System.out.println(line);
            System.out.println();
        }
        System.out.println("The file has "+lineCount+" lines");
        fileReader.close();
        bufferedReader.close();

    }

    public static void main(String[] args) throws IOException {
        create();
        countingLines();
    }
}
