import java.io.*;

public class ReadingCharByCharAndCountingCharacters {
    public static File file = new File("Mushrooms.txt");
    public static void creation(File file1) throws IOException {
        FileWriter fileWriter= new FileWriter(file1);
        BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
        bufferedWriter.append("""
                Horn of Plenty (Craterellus cornucopiodes). This horn-shaped mushroom matures from spring to fall, depending on your climate. Edible.
                                
                Jack-O-Lantern mushroom (Omphalotus, Clitocybe). These woodland mushrooms resemble sulfur mushrooms, but they’re poisonous. They grow at the base of trees or on decaying roots.
                                
                King Oyster: King oyster mushrooms look just like regular oyster mushrooms, only they grow atop a thick white stem. Compared to regular oyster mushrooms, they have a much firmer, meatier texture.\s
                Lactarius or milk mushroom. These brownish-red, flat-topped mushrooms grow in wooded areas. Some are edible; others are not.
                """);
        bufferedWriter.newLine();
        bufferedWriter.flush();
        fileWriter.close();
        bufferedWriter.close();


    }
    public static void countingCharacters(File file1) throws IOException {
        FileReader fileReader= new FileReader(file1);
        BufferedReader bufferedReader= new BufferedReader(fileReader);
        int charCount=0;
        int character;
        while((character=bufferedReader.read())!=-1)
        {
            System.out.println((char)character);charCount++;
            System.out.println();
        }
        System.out.println("The text has "+charCount+" characters");
        fileReader.close();
        bufferedReader.close();

    }

    public static void main(String[] args) throws IOException {
        creation(file);
        countingCharacters(file);

    }

}
