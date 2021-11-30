import java.util.Scanner;

class Average {
    int a, b, c;
    Average() {
        // delcare locally here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        this.a = sc.nextInt();
        System.out.println("Enter the number 2: ");
        this.b = sc.nextInt();
        System.out.println("Enter the number 3: ");
        this.c = sc.nextInt();
    }

    public void average_method() {
        int result = (a + b + c) / 3;
        System.out.println("The average of three number is: " + result);
    }
}

class  MyException extends Exception {
    MyException(String s)
    {
        super(s);
    }
}
class method{
    public static void main(String[] args) {
        try {

            Average obj = new Average();
            obj.average_method();
            throw new MyException("this is my custom exception ");
        }
        catch(MyException e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("end of the program");
    }
}