import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Java_HW6 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("enter number from 1 to 5 ");
        System.out.println("1-Accept elements of an array");
        System.out.println("2-Display elements of an array");
        System.out.println("3-Search the element within array");
        System.out.println("4-Sort the array");
        System.out.println("5-To Stop");
        int[] arr = null;
        boolean stop = false;

            while (!stop) {
                try {
                    int d = data.nextInt();
                    switch (d) {
                        case 1:
                            System.out.println("enter the size of array");
                            int size = data.nextInt();
                            arr = new int[size];
                            System.out.println("enter the elements of array");
                            for (int g = 0; g < size; g++) {
                                arr[g] = data.nextInt();
                            }
                            break;
                        case 2:
                            if (arr == null) {
                                System.out.println("Array is empty");
                            } else {
                                System.out.println("enter element of array are  : ");
                                for (int e : arr) {
                                    System.out.println(e);
                                }
                            }
                            break;
                        case 3:
                            if (arr == null) {
                                System.out.println("Array is empty");
                            } else {
                                System.out.println("enter element to serach : ");
                                int se = data.nextInt();
                                boolean found = false;
                                for (int s = 0; s < arr.length; s++) {
                                    if (arr[s] == se) {
                                        System.out.println("element found at index " + s);
                                        found = true;
                                        break;
                                    }

                                }
                                if (!found) {
                                    System.out.println("element not found in array !");
                                }
                            }
                            break;
                        case 4:
                            if (arr == null) {
                                System.out.println("Array is empty");
                            } else {
                                Arrays.sort(arr);
                                System.out.println("the sorted array is ");
                                for (int g : arr) {
                                    System.out.println(g);
                                }
                            }
                            break;
                        case 5:
                            stop = true;
                            break;
                        default:
                            System.out.println("Invalied choice ");
                            break;
                    }
                }catch(InputMismatchException e1){
                    System.out.println ("Invalid input chose number from 1 to 5 ");
                }
                catch (Exception e2 ){
                    System.out.println(e2.getMessage());
                }
                finally{
                    System.out.println("Well Done");
                }
                }//end while
    }
    }
