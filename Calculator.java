package Projects;
import java.util.Scanner;
class Function {
    Function(){
        instruction();
        noOfCal();
        endOfCal();
    }
    void instruction() {
        System.out.println("              -------Calculator-------");
        System.out.print("Note: Operation keywords are add='+', sub='-', mul='*' and div='/'. Press enter to  continue: ");
    }
    void noOfCal() {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        System.out.print("No of calculations: ");
        int cal = sc.nextInt();
        operation(cal);
    }
    void operation(int cal) {
        char op;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float x = sc.nextFloat();
        for (int i = 1; i <= cal; i++) {
            System.out.print("Enter other number: ");
            float y = sc.nextFloat();
            System.out.print("Enter operation keyword: ");
            do {
                op = sc.next().charAt(0);
                switch (op) {
                    case '+':
                        float ans1 = x + y;
                        System.out.println("= " + ans1);
                        x = ans1;
                        break;
                    case '-':
                        float ans2 = x - y;
                        System.out.println("= " + ans2);
                        x = ans2;
                        break;
                    case '*':
                        float ans3 = x * y;
                        System.out.println("= " + ans3);
                        x = ans3;
                        break;
                    case '/':
                        float ans4 = x / y;
                        System.out.println("= " + ans4);
                        x = ans4;
                        break;
                }
            } while (!invalidOperation(op));
        }
    }
    boolean invalidOperation(int op){
        if (op=='+' || op=='-' || op=='*' || op=='/') {
            return true;
        }
        else {
            System.out.println("Invalid keyword!!!");
            System.out.print("Enter again: ");
            return false;
        }
    }
    void endOfCal(){
        System.out.println("       -------Thanks!!!-------");
    }
}
public class Calculator {
    public static void main(String[] args) {
        new Function();
    }
}
