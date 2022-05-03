import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array={2,4,0,1,9};
        for(int i:array){
            System.out.print(i+" ");
        }
        System.out.println();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number to search: ");
        int x=scanner.nextInt();
        if(linearSearch(array,x)==-1){
            System.out.println("Element not found...");
        }
        else{
            System.out.println("Element found at index: "+linearSearch(array,x));
        }
    }

    public static int linearSearch(int[] array,int x){
        for(int i=0;i<array.length;i++){
            if(array[i]==x){
                return i;
            }
        }
        return -1;
    }
}
