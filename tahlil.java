
public class tahlil

{
    public static void main(String [] args)
    {
        
        int n=8;
        int[] arry={1,2,2,6,7,7,7,8};
        long StartTime=System.nanoTime();
        for(int i=0;i<n;i++){
            bigO(n,arry);
        }
        long EndTime=System.nanoTime();
        System.out.println(EndTime-StartTime);
        
        
    }
    public static void bigO(int n, int[] A)
    {
        int[] FourA =new int[(4*n)+1];
        for(int i=0;i<A.length;i++)
        {
            FourA[A[i]]+=1;
        }
        // for(int i=0;i<FourA.length;i++)
        // {
        //     System.out.println(FourA[i]);
        // }
        int max=0;
        for(int i=0;i<FourA.length;i++)
        {
            if (FourA[i]>max){
                max=i;
            }
            
        }
        System.out.print("max : ");
            System.out.println(max);

        

    }
}