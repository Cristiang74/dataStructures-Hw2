
public class Array {

int[] setArray = {3, 42, 2, 59, 1};
int sum = 0;

public Array(){}

public void run(){
    for (int i = 0; i < setArray.length; i++) {
        sum += setArray[i];
    }
    System.out.printf("The sum of the array is %s\n", sum);
}




}