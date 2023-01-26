import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FindingVowelsInAFile {
    public static File file = new File("JimmyJo.txt");
    public static void creatingAFile(File name) throws IOException {
        FileWriter fileWriter= new FileWriter(name);
        BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
        bufferedWriter.append("""

                Will mushroom compost burn plants?
                3 Common Lawn Mushrooms That Are Poisonous (and 6 That Are Not)
                How hard is it to grow mushrooms at home?
                List of Hybrid Tomato Varieties from A to Z
                38 Aglaonema Varieties to Consider
                Blueberry Bush Varieties
                YOU ARE HERE: HOME / FRUITS & VEGETABLES / NUTRITION / LIST OF MUSHROOM VARIETIES FROM A TO Z
                List of Mushroom Varieties from A to Z
                17 COMMENTS

                mushroom types from A to Z
                Looking for types of mushrooms? Whether your interest in mushrooms lies in commercially grown varieties, wild mushrooms, or perhaps both, mushrooms are among the most fascinating of plant life. Edible mushrooms are packed with antioxidants and lend an earthy flavor to almost any cooked dish. Many mushrooms, though, lack flavor or are poisonous. Some can kill you.

                Keep scrolling if you want to get straight to the list, which is right below.

                In this article and list, we provide tips for avoiding poisonous mushrooms while foraging, and we highlight some of mushrooms’ health benefits and reasons you should consider adding them to your diet. We also provide a list of some of the most common mushrooms, including edible, inedible, poisonous, and lethal varieties.\s


                morel mushroom
                Morels have a distinct look and are popular for mushroom hunters to identify and gather.
                button mushrooms
                Button mushrooms are available at many grocery stores.
                cauliflower mushroom
                The cauliflower mushroom is named that because of the way it looks.
                oyster mushrooms
                Oyster mushrooms that have been gathered.
                mushroom market
                Many supermarkets have a variety of different delicious mushrooms to try.
                white mushrooms
                Mushrooms are a healthy addition to your diet!
                basket of mushrooms
                Only experienced mushroom hunters should gather them, to avoid accidentally picking poisonous ones that look similar.
                chanterelle mushrooms
                Chanterelle mushrooms are among the most popular of wild edible mushrooms.
                morel mushroom
                Morels have a distinct look and are popular for mushroom hunters to identify and gather.
                button mushrooms
                Button mushrooms are available at many grocery stores.
                1
                2
                3
                4
                5
                6
                7
                8
                Previous
                Next
                Considering that there are 10,000 different recorded species of mushrooms, a 100 percent comprehensive list would be pretty unwieldy. That’s why we’ve narrowed our list down to include the best of the best, targeting both the mushroom species that are widely cultivated and types that can only be found in the wild. Our list includes the most commonly found mushroom species, the best tasting varieties, mushrooms with the most health and medicinal benefits, and the most popular edible varieties as well as poisonous species you’ll want to avoid.  \s


                Mushroom Types Identified
                If you’re interested in collecting wild mushrooms, take note: the art of mushroom picking is just that – an art. There are no scientific tests to determine if a mushroom is poisonous. Over the years, we’ve gained anecdotal knowledge about the safety of mushroom types simply by making observations. Safe mushrooms are those which have been eaten by many people with no ill effects; we learn that a mushroom is poisonous because someone has become ill from eating it. \s

                An old saying sums it up: “There are old mushroom hunters and bold mushroom hunters; but there are no old, bold mushroom hunters.” Better to be old than bold, we say. Take an experienced mushroom hunter and a good guidebook with you when mushroom hunting. Some poisonous types mimic edible kinds so careful inspection is absolutely critical.


                Aborted Entoloma (Entoloma abortivum). Weirdly named edible mushroom found in North American East and Midwest, near the base of hardwood trees in the fall.

                Artist’s Conk / Artist’s Bracket (Ganoderma Applanatum). Common in Maine, and often grows on hardwoods. Inedible, but can be used as a tea or tincture.

                Beech: With a firm texture and a mildly sweet, very nutty taste, the distinct flavor of the brown beech mushroom is highly regarded, and it’s considered one of the most gourmet varieties of all the oyster-like mushrooms.\s


                Beefsteak mushroom (Fistulina hepatica). An edible mushroom that is a fleshy, shell fungus that is often around the base of oak trees in the eastern North America in the summer and fall.

                Black Trumpet (Craterellus cornucopioides, C. cenerius, C. foetidus). Hard to find, reportedly very good tasting edible mushroom. Shaped like a funnel and look a little bit like a trumpet.

                Burnt Matches (Eutypella scoparia). Found in winter on sticks and branches and looks a lot like a pack of burnt paper matches.


                Button mushroom. Button or white mushrooms are the most commonly available mushrooms in the grocery store. In the wild, though, their look-alikes are very poisonous.

                Cauliflower mushroom: Cauliflower mushrooms taste like fennel or almonds. \s

                Cantharellus cibarius mushroom
                Cantharellus cibarius

                Chanterelle (Cantharellus) is considered a gourmet mushroom. It is bright orange or yellow, with a tender texture and intense flavor. Chanterelle grows under hardwood trees, such as oaks, and is harvested in the fall. Look-alikes are poisonous.

                Chicken of the Woods (Laetiporus sulphureus): Chicken of the woods or chicken mushroom is an edible mushroom that, unsurprisingly, tastes like chicken. These fungi are most often found in large, fan-like clusters that are sometimes attached to a living or dead tree of some sort, depending on the species. Chicken of the woods mushrooms are usually brightly colored and come in various shades of orange and yellow.

                Corn Smut (Ustilago maydis). A fungal pathogen of sweet corn that is known as a delicacy in Mexico called huitlacoche\s"""
        );
        bufferedWriter.newLine();
        bufferedWriter.flush();
        bufferedWriter.close();

    }

    public static void reading(File name) throws IOException {
        FileReader fileReader= new FileReader(name);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        String[]words;
        ArrayList<Character>vowels= new ArrayList<>(List.of('a','e','i','o','u','y'));
        int in=0;
        System.out.println("Words with vowels in them");
        while((line=bufferedReader.readLine())!=null)
        {
            words=line.split(" ");
            for(int i=0;i< words.length;i++)
            {
                for(int j=0;j<words[i].length();j++)
                {
                    char character = words[i].charAt(j);
                    if(vowels.contains(character))
                    {
                        in=1;
                    }
                }
                if(in==1)
                {
                    System.out.println(words[i]);
                }
                in=0;
            }
        }
        fileReader.close();
        bufferedReader.close();

    }

    public static void main(String[] args) throws IOException {
        creatingAFile(file);
        reading(file);
    }
}
