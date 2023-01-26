import java.io.*;

public class ReadingFileCharByChar {
    public static File file = new File("Spceies.txt");
    public static void create() throws IOException {
        FileWriter filewriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(filewriter);
        bufferedWriter.append("""
                Accipiter badius\tShikra
                Accipiter brevipes\tLevant Sparrowhawk
                Accipiter gentilis\tNorthern Goshawk
                Accipiter gularis\tJapanese Sparrowhawk
                Accipiter nisus\tEurasian Sparrowhawk
                Accipiter ovampensis\tOvambo Sparrowhawk
                Accipiter soloensis\tChinese Sparrowhawk
                Accipiter virgatus\tBesra
                Acinonyx jubatus\tCheetah
                Acipenser baerii baicalensis\tSiberian sturgeon
                Acipenser fulvescens\tLake Sturgeon
                Acipenser gueldenstaedtii\tRussian Sturgeon, Ossetra
                Acipenser medirostris\tGreen Sturgeon
                Acipenser mikadoi\tSakhalin Sturgeon""");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        filewriter.close();
        bufferedWriter.close();



    }
    public static void readCharByChar() throws IOException {
        FileReader fileReader= new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int character;
        while((character=bufferedReader.read())!=-1)
        {
            System.out.println((char)character);
        }
        System.out.println("No more char to read");
        fileReader.close();
        bufferedReader.close();
    }

    public static void main(String[] args) throws IOException {
        create();
        readCharByChar();
    }
}
