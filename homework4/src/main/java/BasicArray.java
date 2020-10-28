



   /**
    * Task:
    * Create a program that will print a table 100 x 100 size of random numbers.
    * Use a two dimensions array to store numbers and the "for loop" to output them.
    *
    * Создайте программу, которая будет печатать таблицу 100 x 100 размера произвольный чисел.
    * Используйте 2-х мерный массив чтобы хранить числа и "for loop" для их вывода.
    */
public class BasicArray {
       public static void main(String[] args) {
           int[][] a1 = new int[100][100];
           /* a[0] = new int[99];*/
           for (int i1 = 0; i1 < a1.length; i1++)
               for (int i2 = 0; i2 < a1[i1].length; i2++)
                   a1[i1][i2] = (int) (Math.random() * 100);

           for (int[] ints : a1) {
               {
                   for (int anInt : ints) System.out.print(anInt + "   ");
                   System.out.println();
               }

           }
       }
   }