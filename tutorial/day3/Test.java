public class Test{
	public static void main(String[] args){
		int [] a = {7,3,5,6,4,9,1};
			for(int i = 0;i < a.length-1;i++){
				for(int j = 0;j < a.length-1-i;j++){
					if(a[j]>a[j+1]){
						int temp;
						temp = a[j];
						a[j] = a[j+1];
						a[j+1] = temp;
					}
				}
			}
			System.out.println(Arrays.toString(a));
	}
}