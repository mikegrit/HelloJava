package day0515;
public class Demo_sort {
    public static void main(String[] args) {
		
        int[] numbers=new int[]{1,5,8,2,3,9,4};
        int i,j;
        for(i=0;i<numbers.length;i++)
        {
            for(j=0;j<numbers.length-1-i;j++)
            {
                if(numbers[j]>numbers[j+1])
                {
                    int temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }
        System.out.println("��С���������Ľ����:");
        for(i=0;i<numbers.length;i++)
            System.out.print(numbers[i]+" ");
    }
}
