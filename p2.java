public class p2 {
//    public static int duplicate(int[] nums)
//    {
//         int j=0;
//         for(int i=1;i<nums.length;i++)
//         {
//             if(nums[j]!=nums[i])
//             {
//               nums[j+1]=nums[i]; 
//               j++; 
//             }
//     } 
//     return j+1;
// }
public static void main(String[] args) {
    // int num[]={1,2,2,3,4,5};
    // System.out.print(duplicate(num));
    String s=" race a ecar";
    String a=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
    System.out.print(a);
}
}
