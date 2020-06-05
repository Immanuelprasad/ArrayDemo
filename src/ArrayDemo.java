public class ArrayDemo
{
    public static void main(String[] args)
    {
        int a[] = {1,2,3,4};
        int b[] = {2,4,6,8,10};
        int c[] = {3,6,9,12,15,18};
        int d[] = {4,8,12,16,20,24,28};

        int e[][] = {
                {1, 2, 3, 4},                        //Jagged arrays
                {2, 4, 6, 8, 10},
                {3, 6, 9, 12, 15, 18},
                {4, 8, 12, 16, 20, 24, 28}
                    };
        for(int i=0; i<e.length;i++)
        {
            for(int j=0; j<e[i].length;j++)
            {
                System.out.print("  "+ e[i][j]);
            }
            System.out.println();
        }

    }
}
