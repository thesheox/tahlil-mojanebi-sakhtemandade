public class tahlil
{
    public static void main(String [] args)
    {
        int[] arry={1,2,3,3};
        bigO(4,arry);
    }
    public static void bigO(int n, int[] A)
    {
        int[] FourA =new int[(4*n)+1];
        for(int i=0;i<A.length;i++)
        {
            FourA[A[i]]+=1;
        }
        for(int i=0;i<FourA.length;i++)
        {
            System.out.println(FourA[i]);
        }
        

    }
}