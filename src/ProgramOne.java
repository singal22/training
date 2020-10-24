public class ProgramOne {

    public static String displayCharacters (String str)
    {
        String outputString = "";
        String outputNum = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            char currentChar = str.charAt(i);

            if (Character.isDigit(currentChar)) {
                    outputNum += currentChar;

            }
            else {
                if (outputNum == "") {
                    count = 1;
                }
                else {
                    count = Integer.parseInt(outputNum);
                }

                for (int j = 0; j < count; j++) {
                        outputString += currentChar;
                    }
                outputNum = "";

            }
        }
        return outputString;

    }
    public static void main(String[] args) {
        String prog = "123";
        String out = displayCharacters(prog);
        System.out.print(out);
    }
}
