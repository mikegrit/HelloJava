package day0515;
public class Demo_sort {
    public static void main(String[] args) {
		
        //初始化数组
        int[] numbers=new int[]{1,5,8,2,3,9,4};
        //初始化索引
        int i,j;
        //i循环：从0到数组numbers的长度
        for(i=0;i<numbers.length;i++)
        {
            //j循环：从0到numbers的长度-1-i
            for(j=0;j<numbers.length-1-i;j++)
            {
                //判断
                if(numbers[j]>numbers[j+1])
                {
                    int temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }

        //将数组打印出来
        for(i=0;i<numbers.length;i++)
            System.out.print(numbers[i]+" ");

        System.out.println("");
    }
}
