
package algodat.kelas;


public class ArrayLinearList implements LinearList {
     
   
    protected Object [] element, element2; 
    protected int size; 
    
    
    public ArrayLinearList(int initialCapacity){
        if(initialCapacity < 1)
            throw new IllegalArgumentException("initialCapacity harus >= 1");
        element = new Object[initialCapacity];
    }
    
    
    public ArrayLinearList(){
        this(10);
    }
    
   
    @Override
    public boolean isEmpty(){
        return size == 0;
    }
    
    
    @Override
    public int size(){
        return size;
    }
    
    
    void checkIndex(int index){
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException("index = " +index +"size = " +size);
    }
    
    
    @Override
    public Object get(int index){
        checkIndex(index);
        return element[index];
    }
    
    
    @Override
    public int indexOf(Object theElement){
       
        for(int i=0; i<size; i++)
            if(element[i].equals(theElement))
                return i;
        
        
        return -1;
    }
    
    //menghapus dan mengembalikkan element
    @Override
    public Object remove(int index){
        checkIndex(index);
        
        //index yg valid, geser element dengan index yg lebih tinggi
        Object removedElement = element[index];
        for(int i=index+1; i<size; i++)
            element[i-1] = element[i];
        
        element[--size] = null; //enable garbage collection
        return removedElement;
    }
    
    
    @Override
    public void add(int index, Object theElement){
        
        if(index < 0 || index > size)
            throw new IndexOutOfBoundsException("index = " +index +"size = " +size);
        
        if(size == element.length)
            element = ChangeArrayLength.changeLength1D(element, 2*size);

        for(int i=size-1; i>=index; i--)
            element[i+1] = element[i];
        
        element[index] = theElement;
        size++;
    }

    @Override
    public String toString(){
        StringBuffer s = new StringBuffer("[");
 
        for(int i=0; i<size; i++)
            if(element[i] == null)
                s.append("null, ");
            else
                s.append(element[i].toString() + ", ");
        if(size > 0)
            s.delete(s.length() - 2, s.length());
        s.append("]");
        
        return new String(s);
    }
    
    @Override
    public void trimToSize(){
        element2 = new Object[size];
        if(size < element.length){
            System.arraycopy(element, 0, element2, 0, size);
            
            element = element2;
        }
    }
    
    @Override
    public Object setSize(int no){
        if(size>no){
            int index = size - no;
            Object removedElement = element[index];
            for(int i=0; i<index; i++){
                for(int j=index+1; j<size; j++)
                    element[j-1] = element[j];
                
            element[--size] = null;
            }
            return removedElement;
        }
        else{
            element2 = new Object[no];
            System.arraycopy(element, 0, element2, 0, size);
            
            element = element2;
        }
        return size;
    }
    
    @Override
    public Object clear(){
        for(int i=0; i<size; i++){
            element[i] = null;
        }
        return size;
    }
    //i= awal angka yang mau dihapus, l akhir angka yang ingin dihapus
    @Override
    public Object removeRange(int i, int l){
        for(int a = i; a < l; a++){
            remove(a);
        }
        return element;
    }
    
    
}
 