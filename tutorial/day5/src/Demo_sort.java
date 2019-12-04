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
                //比较相邻的两个的大小
                if(numbers[j]>numbers[j+1])
                {
                    //交换
                    int temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }
        //详细针对上面的两个循环
        //i=0：
        //j=0->number.length-1-0
            //j=0,number[0]与number[1]
            //j=1,number[1]与number[2]
            //j=2,number[2]与number[3]
            //...
            //j=6,number[6]与number[7]？


        //将数组打印出来
        for(i=0;i<numbers.length;i++)
            System.out.print(numbers[i]+" ");

        System.out.println("");
    }
}
