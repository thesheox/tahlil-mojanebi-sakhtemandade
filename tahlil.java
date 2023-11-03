import java.util.Random;
public class tahlil

{
    public static void main(String [] args)
    {
        Random r=new Random(0);
    
        for(int i=100;i<1000;i=i+=100){
            int[] arry=new int[i];
            for(int j=0;j<i;j++){
                arry[j]=r.nextInt(4*i);
            }
            long StartTime=System.nanoTime();
            bigO(i,arry);
            long EndTime=System.nanoTime();
            System.out.println(EndTime-StartTime);
        }
    }
    public static void bigO(int n, int[] A)
    {
        int[] FourA =new int[(4*n)+1];
        for(int i=0;i<A.length;i++)
        {
            FourA[A[i]]+=1;
        }
        int max=0;
        for(int i=0;i<FourA.length;i++)
        {
            if (FourA[i]>max){
                max=i;
            }
            
        }
        // System.out.print("max : ");
        //     System.out.println(max);

        

    }
}