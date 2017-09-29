
package algodat.kelas;

public class Main {
    public static void main(String[] args) {
    Object [][] data ={
            {"Ray","1997" ,"Laki"}, 
            {"Dina","1998" ,"perempuan" }, 
            {"Tobby","1995" ,"Laki" }, 
            {"Jack","1996" ,"Laki" }, 
            {"Uli","1997" ,"Perempuan"}  
        };
        
        Object[][] ganti = algodat.kelas.ChangeArrayLength.changeLength2D(data, 9, 3);
        
        System.out.println("Length   : "+ganti.length);
        System.out.println("Length 2 : "+ganti[0].length);
        System.out.println("");
        
        for(Object[] ganti2 : ganti){
            for(int i = 0; i<ganti[0].length; i++){
                System.out.println(ganti2[i]);
            }
            System.out.println();
        }
        }
}
