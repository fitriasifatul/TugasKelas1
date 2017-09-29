
package algodat.kelas;


public class NewMain {
    public static void main(String[] args) {  
        
        ArrayLinearList x = new ArrayLinearList(8);
        
        System.out.println("Ukuran awal x   : " +x.element.length);
        System.out.println("Apakah x kosong : " +x.isEmpty());
        
        x.add(0, "a");
        x.add(1, "b");
        x.add(2, "c");
        x.add(3, "d");
        x.add(4, "e");
        x.add(5, 1);
        x.add(6, 2);
        x.add(7, 3);
        
        System.out.println("\nIsi awal x      : " +x.toString());
        System.out.println("x yang terisi     : " +x.size());
        System.out.println("Element di index 3: " +x.get(3));
        System.out.println("Index element c   : " +x.indexOf("c"));
        x.remove(2);
        System.out.println("\nIsi setelah index 2 dihapus    : " +x.toString());
        System.out.println("Isi index 2 setelah dihapus    : " +x.get(2));
        x.add(2, "f");
        System.out.println("Isi index 2 setelah ditambah   : " +x.get(2));
        System.out.println("Isi setelah index 2 ditambah   : " +x.toString());
        
        x.add(8, 6);
        x.add(9, 8);
        x.add(10, 7);
        

        System.out.println("\nIsi setelah ditambah 3 array baru : " +x.toString());
        System.out.println("Jumlah array sebelum dipotong     : " +x.element.length);
        x.trimToSize();
        System.out.println("Jumlah array setelah dipotong     : " +x.element.length);
        x.setSize(4);
        System.out.println("Isi array setelah di setSize 4    : " +x.toString());
        x.clear();
        System.out.println("Isi array setelah di clear        : " +x.toString());
    }
}
