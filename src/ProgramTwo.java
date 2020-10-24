public class ProgramTwo {

    public static void perfectNumber (int min, int max)
    {

        while(min<=max) {
            int start = min;
            int prev = Integer.MAX_VALUE, a = 0;
            int flag = 0;
            while (start != 0)
            {
                a =  start % 10;
                start = start/10;
                if (prev > a){
                    prev = a;
                }
                else {
                    flag = 1;
                    break;
                }
            }
            if (flag ==0) {
                System.out.println(min);
            }
            min++;
        }

    }
    public static void main(String[] args) {
        String prog = "1000-2000";
        String[] numArr = prog.split("-", 2);

        int min = Integer.parseInt(numArr[0]);
        int max = Integer.parseInt(numArr[1]);
        if ( min > max) {
            System.out.println("First number is greater than second number");
        }
        else {
            perfectNumber(min, max);
        }
    }
}
