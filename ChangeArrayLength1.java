
package algodat.kelas;

import java.lang.reflect.Array;

public class ChangeArrayLength1 {
    public static Object[][] changeLength2D(Object [][] a, int n, int m, int newLength, int newLength2){
        
        if (n> newLength){
            throw new IllegalArgumentException("new length is too small");
        }
        if(m>newLength2){
            throw new IllegalArgumentException("new length 2 is too small");
        }

        Object [][] newArray = (Object [][]) Array.newInstance(a.getClass().getComponentType(), newLength, newLength2);

        newArray = (Object[][])a.clone(); 
        
        return newArray;
    }
    
    // semua array akan di copy ke array yg baru
    public static Object [][] changeLength2D(Object[][] a, int newLength, int newLength2){
        return changeLength2D(a, a.length, a[0].length, newLength, newLength2);
    }
}
