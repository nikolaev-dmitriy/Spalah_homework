



import java.util.Scanner;

/**
 * Created by Дмитрий on 13.12.2016.
 */
public class Marks {

    public static void main(String[] args) {
        int n = 10;
        String[] markstr = new String[n];
        int[] mark = new int[n];
        String[] name = new String[n];
        Scanner in = new Scanner(System.in);
        String answer;
        int i = -1;
        Boolean t=true;
        while (t) {
            answer="";
            System.out.println("Do you want add the record? (Y/N)");
            answer = in.nextLine();
            switch (answer) {
                case "Y":
                    i++;
                    System.out.println("What is your name?");
                    name[i] = in.nextLine();
                    System.out.println("What is your result (%)?");
                    mark[i] = in.nextInt();
                    if (mark[i] >= 90) {
                        markstr[i] = "A";
                    } else if (mark[i] < 90 && mark[i] >= 82) {
                        markstr[i] = "B";
                    } else if (mark[i] < 82 && mark[i] >= 75) {
                        markstr[i] = "C";
                    } else {
                        markstr[i] = "Loser";
                    }
                    in.nextLine();
                    break;
                default:
                    t=false;
            }
        }

        for (int q = 0; q <=i; q++) {
            System.out.println(name[q] + " has mark " + markstr[q]);
        }
    }
}




