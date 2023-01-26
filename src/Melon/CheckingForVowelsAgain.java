package Melon;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CheckingForVowelsAgain {
    public static File file = new File("Juice.txt");
    public static void making(File name) throws IOException {
        FileWriter fileWriter= new FileWriter(name);
        BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
        bufferedWriter.append("""
                What’s the difference between fruit
                juice and fruit drinks?
                l Products labeled fruit juice are made from real
                juice. For example, if the label says “apple juice”, it
                is made of the juice from apples.
                l Real fruit juice has over 20 vitamins and minerals.
                l 125 ml (1/2 cup) of juice equals one serving from the
                Vegetables and Fruit food group from Canada’s
                Food Guide.
                l Products labeled fruit drink, beverage, punch or
                cocktail are not real juice. For example, “grape
                cocktail” is not “grape juice”.
                l Many fruit-flavoured drinks are made to look like
                juice, but are just sugar and water with some
                flavours.
                l Although some fruit drinks have vitamin C added,
                they do not have the potassium, B-vitamins and
                other nutrients found in real juice.
                l Don’t be fooled by a label that says “contains real
                fruit juice”. This claim can be made even if the
                product has only a small amount of real juice.
                """);
        bufferedWriter.newLine();
        bufferedWriter.flush();
        bufferedWriter.close();

    }
    public static void reading(File name) throws IOException {
        FileReader fileReader= new FileReader(name);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String[]words;
        ArrayList<Character>vowels= new ArrayList<>(List.of('a','e','i','o','u','y'));
        String line;
        int contains=0;
        System.out.println("Vowel-containing words");
        while((line=bufferedReader.readLine())!=null)
        {
            words=line.split(" ");
            for(int i=0;i< words.length;i++)
            {
                for(int j=0;j<words[i].length();j++)
                {
                    if(vowels.contains(words[i].charAt(j)))
                    {
                        contains=1;
                    }
                }
                if(contains==1)
                {
                    System.out.println(words[i]);
                }
                contains=0;
            }
        }
        fileReader.close();
        bufferedReader.close();


    }

    public static void main(String[] args) throws IOException {
        making(file);
        reading(file);
    }

}
