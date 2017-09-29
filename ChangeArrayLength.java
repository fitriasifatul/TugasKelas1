
package algodat.kelas;

import java.lang.reflect.Array;

public class ChangeArrayLength {
   public static Object[] changeLength1D(Object [] a, int n, int newLength){
        
        if(n>newLength){
            throw new IllegalArgumentException("new length is too small");
        }
        
        Object [] newArray = (Object []) Array.newInstance(a.getClass().getComponentType(), newLength);
        
        
        System.arraycopy(a, 0, newArray, 0, n);
        
        return newArray;
    }
    
   
    public static Object [] changeLength1D(Object[] a, int newLength){
        return changeLength1D(a, a.length, newLength);
    }

    static Object[][] changeLength2D(Object[][] data, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
