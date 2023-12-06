import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = 0;
        String pass;
        String sub;
        boolean testOne = false;
        boolean testTwo = false;
        boolean testThree = false;
        boolean testFour = false;
        boolean testFive = false;
        int strengthFinal = 0;
        String passStrength;
        boolean done = true;

        do {
            testOne = false;
            testTwo = false;
            testThree = false;
            testFour = false;
            testFive = false;
            strengthFinal = 0;
            System.out.println("Please enter your password");
            pass = scan.nextLine();


            if (pass.length() >= 12) {
                testOne = true;
            }

            count = pass.length();

            for (int i = 0; i < pass.length(); i++ ) {
                sub = pass.substring(i, i+1);
                if (sub.matches("[ABCDEFUHIJKLMNOPQRSTUVWXYZ]")) {
                    testTwo = true;
                }
            }

            for (int i = 0; i < pass.length(); i++ ) {
                sub = pass.substring(i, i+1);
                if (sub.matches("[abcdefuhijklmnopqrstuvwxyz]")) {
                    testThree = true;
                }
            }

            for (int i = 0; i < pass.length(); i++ ) {
                sub = pass.substring(i, i+1);
                if (sub.matches("[0123456789]")) {
                    testFour = true;
                }
            }

            for (int i = 0; i < pass.length(); i++ ) {
                sub = pass.substring(i, i+1);
                if (sub.matches("[!#$%]")) {
                    testFive = true;
                }
            }

            if (testOne) {
                strengthFinal++;
            } else {
                System.out.println("Your password should have at least 12 characters");
            }

            if (testTwo) {
                strengthFinal++;
            } else {
                System.out.println("Your password should have at least 1 uppercase letter");
            }

            if (testThree) {
                strengthFinal++;
            } else {
                System.out.println("Your password should have at least 1 lowercase letter");
            }

            if (testFour) {
                strengthFinal++;
            } else {
                System.out.println("Your password should have at least 1 number");
            }

            if (testFive) {
                strengthFinal++;
            } else {
                System.out.println("Your password should have at least 1 special character");
            }

            System.out.println("Your password passed " + strengthFinal + "/5 tests.");

            if (strengthFinal < 3) {
                System.out.println("Your password sucks!");
            } else if (strengthFinal < 4) {
                System.out.println("Your password is aight cuh");
            } else {
                System.out.println("Holy guacamole what a password!");
            }

            done = InputHelper.getYNConfirm(scan, "Would you like to check another password?");

        } while (done);

    }
}