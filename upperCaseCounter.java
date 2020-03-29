import acm.program.ConsoleProgram;

public class upperCaseCounter extends ConsoleProgram {

    public void run()
    {
        String input = "BooBm";
        print(toUpperCase(input));
    }
    /*method to count number of upper case letters in a string*/
    public int toUpperCase(String input) {
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isUpperCase(ch)) {
                count += 1;
            }
        }
        return count;
    }


}


