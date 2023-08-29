package hashing;
import java.util.*;
class hashing{
    public static void main (String[] args) {
        Scanner sc  =new Scanner(System.in);
        int size= sc.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        int hash[] = new int[13];
        for(int i =0;i<size;i++){
            hash[array[i]]=hash[array[i]]+1;
        }
        int q = sc.nextInt();
        while(q>0){
            int number = sc.nextInt();
            System.out.println("frequency"+hash[number]);
            q--;
        }
    }    
}
