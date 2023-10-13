// Write a program to fid duplicate numbers in an array

public class Duplicate_no {

    public static void main(String args[]) {
        int Arr[] = { 1, 2, 3, 4, 5, 1, 4 };
        for (int j = 0; j < Arr.length; j++) {
            for (int i = j + 1; i < Arr.length; i++) {
                if (Arr[j] == Arr[i]) {
                    System.out.print("\n\tDuplicate Number :- " + Arr[i]);
                    break;
                }
            }
        }
        System.out.println("\n\n");
    }
}