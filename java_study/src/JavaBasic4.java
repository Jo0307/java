import java.util.Random;
import java.util.Scanner;

public class JavaBasic4 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("How old are you?");

        int age = in.nextInt();
        int age1 = inputScanner();
        if(age!=age1) {
            System.out.printf("You are liar! %d, %d \n", age, age1);
        }


    }

    public static int inputScanner() {
        Scanner in = new Scanner(System.in);

        System.out.print("what is your name? : ");
        String name = in.nextLine();
        System.out.printf("Hello, %s!\n",name);
        System.out.println("Nice to meet you");

        int age = 0;
        while(true) {
            System.out.print("How old are you? : ");
            if (in.hasNextInt()) {
                age = in.nextInt();
                System.out.printf("You are %d years old! \n", age);
                break;
            }
            else {
                System.out.println("Please enter only numbers.");
                in.nextLine();

            }
        }

        return age;


    }

    public static void loop1(int target) {  // 0 <= target < 10 , target은 자연수
        System.out.println("target =" + target);

        Random generator = new Random();
        int next = generator.nextInt(10);
        System.out.println("number =" + next);

        while (next != target) {
            next = generator.nextInt(10);
            System.out.println("number =" + next);
        }
    }

    public static void loop2(int target){
        System.out.println("target = "+ target);
        Random generator = new Random();


        int next = 0;

        do{
            next = generator.nextInt(10);
            System.out.println("number =" + next);
            
        }while (next!=target);

    }

}
