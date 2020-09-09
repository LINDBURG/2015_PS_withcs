import java.util.*;
 
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
 
        int num = sc.nextInt();
        for(;num>0;num--){
            StackOfIntegers arr = new StackOfIntegers();
            for(int n = sc.nextInt(),c = 2;n!=1;){
                if(n%c==0){
                    arr.push(c);
                    n /=c;
                }
                else{
                    c++;
                }
            }
            for(int i = arr.getSize();i>0;i--){
                System.out.printf("%d",arr.pop());
                if(i!=1){
                    System.out.printf(" ");
                }
            }
            if(num!=1){
                System.out.printf("\n");
            }
        }
    }
}
class StackOfIntegers {
    private int[] elements;
    private int size;
    public static final int MAX_SIZE = 16;
 
    public StackOfIntegers() {
        this(MAX_SIZE);
    }
 
    public StackOfIntegers(int capacity) {
        elements = new int[capacity];
    }
 
    public int push(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
 
        return elements[size++] = value;
    }
 
    public int pop() {
        return elements[--size];
    }
    
    public int getSize() {
        return size;
    }
}