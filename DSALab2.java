import java.util.Scanner;

public class DSALab2{
    
    public static class Letter_Counter 
    {
        public static void count_that_letter()
        {
            try 
            {
            Scanner input = new Scanner(System.in); 
                System.out.print("Please enter a string!\n");
                String statement = input.nextLine();
                System.out.print("Please provide a character, the alphabet sort not the spongebob kind.\n");
                char character = (input.nextLine().charAt(0));

                input.close();
    
                int counter = 0;
    
                for (int i = 0; i < statement.length(); i++)
                {
                    if (statement.charAt(i) == character)
                    {
                        counter +=1;
                    }
                }
                
            System.out.print("There are " + counter+ " " + character + "'s in your input!\n");
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    
    }

    public static class PrimeDetector
    {
        public static boolean detect(int num)
        {
    
                if (num == 0 || num == 1 || num < 0)
                {
                    return false;
                }
    
                else
                {                
                    for (int i = 2; i < num; i++)
                    {
                        if(num % i == 0)
                        {
                            return false;
                        }
                    }
                }
            
            return true;
        }

        public static void nthPrime()
        {
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("Please enter which prime number you'd like to see counting from one!\n");
                int num = Integer.parseInt(input.nextLine());

                int count = 0;
                boolean primeness;

                input.close();
    

                if (num > 0)
                {
                    for (int i = 2; count <= num; i++)
                    {
                        primeness = PrimeDetector.detect(i);

                        if (primeness == true)
                        {
                            count++;
                        }

                        if (count == num && primeness == true)
                        {
                            System.out.print(i + " is the " + num + "th prime number.\n");
                        }
                    }


                }
    
                else
                {                
                    System.out.print("Invalid entry, please try again\n");
                    PrimeDetector.nthPrime();
                }
    
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        
    }

    public static class StringReversal
    {
        public static void reverseString()
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter a sentence with no punctuation, only letters and spaces.\n");
            String sentence = input.nextLine();
            
            input.close();

            for (int i = 0; i < sentence.length(); i++)
            {
                System.out.print(sentence.charAt((sentence.length() - i)));  //CURRENT CONFUSING PART!!!!!!!!!!! why crashing?
            }
        }
 
    }

    public static class Menu {
        public static void menu()
        {
            try 
            {
                Scanner input = new Scanner(System.in);
                System.out.print("1) Letter Counter\n2) Is it Prime?\n3) Nth Prime finder\n4) String Reversal\n");
                int choice = Integer.parseInt(input.nextLine());
                if (choice == 1)
                {
                    Letter_Counter.count_that_letter();
                }

                 else if (choice == 2)
                {
                    System.out.print("Enter a number?\n");
                    int num = Integer.parseInt(input.nextLine());
                    if (PrimeDetector.detect(num))
                    {
                        System.out.print("Your number is prime!\n");
                    }

                    else if (!PrimeDetector.detect(num))
                    {
                        System.out.print("Your number is NOT prime!\n");
                    }
                    
                }

                 else if (choice == 3)
                {
                    PrimeDetector.nthPrime();
                }

                else if (choice == 4)
                {
                    StringReversal.reverseString();
                }


                else 
                {
                    System.out.print("Invalid entry, please try again\n\n");
                    Menu.menu();
                }

                input.close();
                
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }



    //public static void main(String[] args)
   // {
   //     Menu.menu();
   // }
}
