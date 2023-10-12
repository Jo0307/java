public class JavaBasic3 {

    public static void main (String[] arg){

        /*concatenation(27);
        concatenation(28);
        concatenation2();
        concatenation3();
        concatenation4();*/
        stringComparison1();
        stringComparison2();
        Smethod();
        Smethod2();
    }
    public static void concatenation(int age){
        if(age == 27){
            System.out.println("Next year, you will be 28");
        }else {
            System.out.println("Next year, you will be "+ (age+1));
        }
    }

    public static void Smethod(){

        String greeting = "Hello, World";
        String location = greeting.substring(7,12);
        System.out.println(location);

        String name = "Peter, Paul, Mary";
        String[] result = name.split(",");
        StringBuilder res = new StringBuilder();

        for (int i =0; i < result.length; i++){
            res.append(result[i]);
        }
        System.out.println(res.toString());
    }

    public static void Smethod2(){
        String name = "Peter, Paul, Mary";
        String[] result = name.split(",");

        for (int i =0; i<result.length; i++){
            System.out.print(result[i]);
        }
    }


    public static void concatenation2(){
        String [] nameList = {"Peter", "Paul", "Mary", "Minsu", "Jack"};
        int length = nameList.length;
        for(int i =0 ; i <length; i++){
            if(i == length-1){
                System.out.println(nameList[i]);
            }else{
                System.out.print(nameList[i]+ ",");
            }
        }


    }

    public static void concatenation3(){
        String [] nameList = {"Peter", "Paul", "Mary", "Minsu", "Jack"};
        String message = String.join(",",nameList);
        System.out.println(message);
    }

    public static void concatenation4() {
        String[] nameList = {"Peter", "Paul", "Mary", "Minsu", "Jack"};
        StringBuilder lM = new StringBuilder();
        for (int i = 0; i < nameList.length; i++) {
            if (i == nameList.length - 1) {
                lM.append(nameList[i]);
            } else {
                lM.append(nameList[i]);
                lM.append(",");
            }
        }
        System.out.println(lM.toString());
    }
    public static void stringComparison1() {
        String greeting = "Hello, World!";
        String location = greeting.substring(7, 12);

        System.out.println(location);

        if (location == "World") {
            System.out.println("location is same to \"World\"");
        }
        else {
            System.out.println("location is not same to \"World\"");
        }
    }

    public static void stringComparison2() {
        String location = "World";

        System.out.println(location);

        if (location == "World") {
            System.out.println("location is same to \"World\"");
        }
        else {
            System.out.println("location is not same to \"World\"");
        }
    }


}
