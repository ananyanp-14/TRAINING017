public class p1
{
    public static int[] twoSum(int[] num,int target)
    {
        for(int i=0;i<num.length;i++)
        {
            for(int j=0;j<num.length;j++)
            {
                if(num[i]+num[j]==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int num[]={1,2,3,4,5};
     int[] a=twoSum(num,9); 
     for(int i=0;i<2;i++)
     {
        System.out.print(a[i]);
     }  
    }
}
