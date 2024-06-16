import java.util.Arrays;

public class Learn {

    public static void main(String[] args) {

        //this class helps us and provide us various functiion to perform on array (primitive array).

        // Integer arr[] = {1,2,3,4,5,6,7,8,9};

        // int ind = Arrays.binarySearch(arr, 6);
        // System.out.println("index of ekement is :  "+ind);




        //Sorting Array : this performs quick sort
        // int ar[] = {1,22,4,6,5677,842,8};
        // for(int e : ar){
        //     System.out.println(e);

        // }
       
        // System.out.println();
        // Arrays.sort(ar);
        // for(Integer e : ar){
        //     System.out.println(e);

        // }


        //Arrays.fill()

        int ar[] = {1,22,4,6,5677,842,8};
        for(int e : ar){
            System.out.println(e);

        }

        Arrays.fill(ar, 12); // this will fill 12 in array ar. for evry element
    
        for(int e : ar){
            System.out.println(e);

        }

       
    }
}