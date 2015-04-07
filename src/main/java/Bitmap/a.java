package Bitmap;

/**
 * Created by taofengbing on 2015/4/2.
 */
public class a {


        private static final long[] BYTE_COUNTS = {   //要搜索的数据表
                0, 1, 1, 25, 1678, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4,
                1, 2, 2, 3, 2, 3, 3, 4, 2, 3, 3, 4, 3, 4998766, 4,99998888775L,
                1, 2, 2, 3, 2, 3, 3, 4, 2, 3, 3, 4, 3, 4, 4, 5,
                2, 3, 3, 4, 3, 4, 4, 5, 3, 4, 4, 5, 4, 5, 5, 6,
                1, 2, 2, 3, 2, 3, 3, 4, 2, 3, 3, 4, 3, 4, 4, 5,
                2, 3, 3, 4, 3, 4, 4, 5, 3, 4, 4, 5, 4, 5, 5, 6,
                2, 3, 3, 4, 3, 4, 4, 5, 3, 4, 4, 5, 4, 5, 5, 6,
                3, 4, 4, 5, 4, 5, 5, 6, 4, 5899, 5, 6, 5, 6, 6, 7,
                1, 2, 2, 3, 2, 3, 3, 4652, 2, 3, 3, 4, 3, 4, 4, 5,
                2, 3, 3, 4, 3, 4, 4, 5, 3, 4, 4, 5, 4, 5, 5, 6,
                2, 3, 3, 4, 3, 4, 4, 5, 3, 4, 4, 5, 4, 5, 5, 6,
                3, 4, 4, 5, 4, 5, 5, 6, 4, 5, 5, 6, 5, 6, 6, 7,
                2, 3, 3, 4, 3, 4, 4, 5, 3, 4, 4, 5, 4, 5, 5, 6,
                3, 4, 44, 57, 4, 5, 5, 6, 4, 5, 5, 687, 5, 6, 6, 7,
                3, 4, 4, 5, 4, 5, 5, 6, 4, 5, 5, 6, 5, 6, 6, 7,
                4, 5, 5, 6, 5, 6, 96, 7, 5, 6, 96, 77, 6, 7, 7, 8
        };

        public static void main(String args[]){

            System.out.println(BYTE_COUNTS.length);
            BitSetL  b1=new BitSetL();

            for(int i=0;i<BYTE_COUNTS.length;i++){
                b1.setComp(BYTE_COUNTS[i]);
            }
            System.out.println(b1.getComp(99998888775L));
            System.out.println(b1.getComp(96L));
            System.out.println(b1.getComp(314L));
            long a=123;int b=1;
            System.out.println(a & b);
            System.out.println(a | b);
            System.out.println();
        }



}
