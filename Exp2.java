import java.util.*;

class Exp2 {
    ArrayList<String> a = new ArrayList<String>();

    void append(String c) {
        a.add(c);
    }

    void insert(int p, String c) {
        if (p >= 0 && p <= a.size())
            a.add(p, c);
        else
            System.out.println("Invalid Index");
    }

    boolean search(String c) {
        return a.contains(c);
    }

    void display() {
        System.out.println("Cities: " + a);
    }

    void displayByLetter(char ch)
{
    for(String city : a)
    {
        if(city.charAt(0) == ch || city.charAt(0) == Character.toUpperCase(ch) || city.charAt(0) == Character.toLowerCase(ch))
        {
            System.out.println(city);
        }
    }
}

