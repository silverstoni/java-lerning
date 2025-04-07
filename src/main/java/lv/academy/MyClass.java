package lv.academy;

public class MyClass {
    public static void main(String[] args) {
        System.out.println("Ja u mami programist");
   // byt 8-bit
        byte age = 30;
    System.out.println(age);


    //Naming convetion:
    //Camel Case:MyClass for classes (Capital Camel Case)
    //Camel Case:CurentYear for variables (Lower Camel Case)
    // short 16bit
    short currentYear = 2025;
short teampature = -273;
short distance =1600;

//int 32-bit
        int score = 9000;
        int population = 1000330;
        int result = (10 * 10) - 42;

        System.out.println(result);

        //long 64-bit
        long starsInGalaxy = 100_000_000L; //1000000000000000
        long bigNumber = 7895L;
        long currentMillis = System.currentTimeMillis();
        System.out.println(currentMillis);

        //float 32-bit
        float PI = 3.14f;
        float piNumber = (float) Math.PI;//casting
        float discount = 25.5f;

        //double 64-bit
        double accountBalance = 9999.999944444;
        double squareRoot = Math.sqrt(2);
        System.out.println(squareRoot);

        //char (symbol)
        char gender = 'M';
        char digit = '7';

        //Unicode
        char smiley = '\u263A';
        System.out.println(gender);

        // boolean (true/false)
        boolean isJavaFun = true;
        boolean isTired = true ;
        boolean passed = (40 > 60); //false

      //String
        String myFullName = "Sergey Popov"; // immutable

    }
}
