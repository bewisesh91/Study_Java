package chapter7;

public class TwoDimension {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }

        char[][] alphabets = new char[13][2];
        char ch = 'a';

        for(int i=0; i<alphabets.length; i++) {
            for(int j=0; j<alphabets[i].length; j++) {
                alphabets[i][j] = ch;
                System.out.print(alphabets[i][j] + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
