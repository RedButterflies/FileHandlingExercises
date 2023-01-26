import java.io.*;
import java.util.Objects;

public class SearchingForWordsOnceAgain {
   public static File file= new File("Promise.txt");
    public static void create(File name) throws IOException
    {
        FileWriter fileWriter= new FileWriter(name);
        BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
        bufferedWriter.append("""
                Master Meng, my love. Beloved the world over.
                Your rosy cheeks replace your courtly crown
                Your white haired head now rests in pine trees and clouds
                Often Moon Drunk, a saintly sage
                Bewildered by flowers that hardly matter.
                Lofty mountains, how I long to be there
                Taking in your pure fragrance\s""");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        bufferedWriter.close();

    }
    public static void searchForMe(File name) throws IOException {
        FileReader fileReader= new FileReader(name);
        BufferedReader bufferedReader= new BufferedReader(fileReader);
        String word="love.";
        String[] strings;
        int count =0;
        String line;
        while((line=bufferedReader.readLine())!=null)
        {
            strings=line.split(" ");

            for (String string : strings) {
                System.out.println(string);
                if (Objects.equals(string, word))
                {
                    count++;
                }
            }


        }
        if(count==0)
        {
            System.out.println("The word doesn't appear in the file");

        }
        if(count>0)
        {
            System.out.println("The word appears in file "+count+" times");
        }
        fileReader.close();
        bufferedReader.close();

    }

    public static void main(String[] args) throws IOException {
        create(file);
        searchForMe(file);

    }

}
