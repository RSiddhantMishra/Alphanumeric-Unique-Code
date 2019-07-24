import java.io.*;
import java.util.*;
public class Rando
{
    private static List<String> generatedIDs = new ArrayList<String>();
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        generateIDs(n);
    }
    public static void generateIDs(int numOfUsers)
    {
        char[] ch = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
        'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
        'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
        'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
        'w', 'x', 'y', 'z' };
        for (int i = 0; i < numOfUsers; i++)
        {
            Random r = new Random();
            int first = r.nextInt((9 - 1) + 1) + 1;
            char second = (char) (r.nextInt(26) + 'A');
            int third = r.nextInt((899 - 100) + 100) + 100;
            String id="";
            id+= "0" + first + second + third +ch[r.nextInt(ch.length)]+ch[r.nextInt(ch.length)-i];
            generatedIDs.add(id);
            System.out.println(id);
        }
    }
} 
