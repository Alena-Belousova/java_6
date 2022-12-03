public class Main {
    public static void main(String[] args)
    {
        System.out.println("task1");
        int size=1000;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = ((int)(Math.random() * 25));
            System.out.println(array[i]);
        }

        System.out.println("число уникальных элементов "+(uniqueCount(array)));
     System.out.println("доля уникальных элементов "+ (getPercentUniqueValues(array)));
    }
    static int uniqueCount(int[] array)
    {

        int count = 0;
        for (int i = 0; i < array.length; i++)
        {

            for (int j = 0; j < array.length; j++)
            {
                if (array[j] == array[i] && i!=j)
                {
                    count++;
                    break;
                }
            }
        }
        return  array.length - count;
    }
   static double getPercentUniqueValues(int[] array)
   {
        int U=uniqueCount(array);
        double P=U*100/1000;
       return P;
    }}

