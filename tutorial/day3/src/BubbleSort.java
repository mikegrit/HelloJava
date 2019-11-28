import java.util.Date;
import java.util.Scanner;

public class BubbleSort {


	public static void main(String args[]) {
		System.out.println("Hello World!");

        int[] input = {12,32,44,9,45,100};

        bubbleSort1(input, input.length);
	}

    /**
     * 冒泡排序的第一种实现, 没有任何优化
     * @param a
     * @param n
     */
    public static void bubbleSort1(int [] a, int n){
        int i, j;

        System.out.println("Start Sorting! Original Array is :");
        printArray(a);

        for(i=0; i<n; i++){//表示n次排序过程。
            for(j=1; j<n-i; j++){
                if(a[j-1] > a[j]){//前面的数字大于后面的数字就交换
                    //交换a[j-1]和a[j]
                    int temp;
                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j]=temp;
                    System.out.println("switch!");
                    printArray(a);
                }
            }
        }
    }// end

    public static void printArray(int[] a) {

        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + ",");
        }


    }

}