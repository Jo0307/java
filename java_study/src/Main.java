public class Main {
    public static void main(String[] args){
        String[] name = new String[3];
        name[0]= "Jo";
        name[1]= "seong";
        name[2]= "yeun";

        Test at = new Test();
        at.test(name);

    }


}

class Test {
    public void test(String[] args) {
        for(String s : args) {
            System.out.println(s);
        }
    }
}

