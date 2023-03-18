import java.util.Scanner;

public class Kalkulator {

    static Scanner scanner = new Scanner(System.in);

    public static int getInt() {
        System.out.println("Введіть число");
        int numb = 0;
        if (scanner.hasNextInt()) {
            numb = scanner.nextInt();
        } else {
            System.out.println("Невірний символ, повторіть знову");
            scanner.next();
            numb = getInt();
        }
        return numb;
    }

    public static char getOperation(){
        System.out.println("Виберіть опечрацію");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        }
        else{
            System.out.println("Невірний символ, повторіть знову");
            scanner.next();
            operation = getOperation();
        }
        return operation;

    }
    public static int calk(int numb1, int numb2, char numb3){
        return 0;
    }

}

