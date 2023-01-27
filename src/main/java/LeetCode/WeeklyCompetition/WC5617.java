package LeetCode.WeeklyCompetition;

public class WC5617 {
    public static void main(String[] args) {
        System.out.println(WC5617.interpret("(al)G(al)()()G"));
    }


    public static String interpret(String command) {
        command = command.replace("()", "o");
        command = command.replace("(al)", "al");
        return command;
    }
}
