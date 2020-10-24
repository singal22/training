import java.util.ArrayList;

public class ProgramThree {

    public static String replaceChar(String str, char ch, int index) {
        StringBuilder myString = new StringBuilder(str);
        myString.setCharAt(index, ch);
        return myString.toString();
    }

    public static String displayString(String str)
    {
        ArrayList<Character> numbersString  = new ArrayList<Character>();
        for (int i = 0; i < str.length(); i++)
        {
            char currentChar = str.charAt(i);

            if (Character.isDigit(currentChar)) {
                numbersString.add(currentChar);
            }
        }

        int size = numbersString.size();
        for (int j= 0; j < str.length(); j++)
        {
            if (Character.isDigit(str.charAt(j))) {
                size +=-1;
                str = replaceChar(str,numbersString.get(size),j);
            }
        }

        return str;

    }
    public static void main(String[] args) {
        String prog = "A4nbb6o5i8g9";
        String out = displayString(prog);
        System.out.println(out);
    }
}

