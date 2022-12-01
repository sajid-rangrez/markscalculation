import java.util.*;
class program{
    public static Scanner scan = new Scanner(System.in);
    public static void avgOfSem(int[][][] arr, int n){
        System.out.println("Enter the semister for Average Marks ");
        int a = scan.nextInt();
        int sum = 0;
        int c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                sum = sum + arr[a-1][i][j];
                c = c + 1;
            }
        }
        System.out.println(sum/c);
    }
    public static void avgOfSubject(int[][][] arr, int n){
        System.out.println("Select the subject of average : 0 for English, 1 for Math, 2 for Science");
        int a = scan.nextInt();
        int sum = 0;
        int c = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                sum = sum + arr[i][j][a];
                c = c + 1;
            }
        }
        System.out.println(sum/c);



    }
    public static void main(String[] args) {

        System.out.println("Enter number of students");
        int n = scan.nextInt();
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            int studentcount = i+1;
            System.out.println("Enter the name of Student " + studentcount );
            names[i] = scan.next();

        }
        int marks[][][] = new int[2][n][3];
        for (int i = 0; i < 2; i++) {
            int sc = i+1;
            for (int j = 0; j < n ; j++) {
                for (int k = 0; k < 3; k++) {
                    if(k == 0){
                        System.out.println("Enter marks in English for " + names[j] + " in Semister "+ sc);
                    }
                    else if(k == 1){
                        System.out.println("Enter marks in Math for " + names[j] + " in Semister "+ sc);
                    }
                    else if(k == 2){
                        System.out.println("Enter marks in Science for " + names[j] + " in Semister "+ sc);
                    }
//                        System.out.println( i +" "+j+" " + k);
                    marks[i][j][k] = scan.nextInt();
                }
            }

        }
        avgOfSem(marks, n);
        avgOfSubject(marks, n);
    }
}

