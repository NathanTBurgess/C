import java.util.HashMap;
import java.util.Map;

public class CCILab2 {
    
    public static void Permutation(String one, String two)
    {

        int count = 0;

        if(one.length() != two.length())
        {
            System.out.print("These strings are not permutations of each other.");
            return;
        }

        else
        {
            Map<Character, Integer> Hash1 = new HashMap<Character, Integer>();

            for(int i = 0; i < one.length(); i++)
            {
                for(int j = 0; j < one.length(); j++)
                {
                    if(one.charAt(i) == one.charAt(j))
                    {
                        count += 1;
                    }
                }
                if (!Hash1.containsKey(one.charAt(i)))
                {
                    Hash1.put(one.charAt(i), count);
                }
                count = 0;
            }



            for(int i = 0; i < two.length(); i++)
            {
                for(int j = 0; j < two.length(); j++)
                {
                    if(two.charAt(i) == two.charAt(j))
                    {
                        count += 1;
                    }   
                }
                if (!Hash1.containsKey(two.charAt(i)))
                {
                    System.out.print("These strings are not permutations of each other.");
                    return;
                }
                if (Hash1.get(two.charAt(i)) != count)
                {
                    System.out.print("These strings are not permutations of each other.");
                    return;
                }
                count = 0;
            }

            
            System.out.print("These strings are permutations of each other");
            return;
        }
    }

    public static void main(String[] args)
    {
        Permutation("hant wow", "natw how");
    }


}



