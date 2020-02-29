import java.util.ArrayList;
import java.util.Random;

public class Prima{
    
    public static void main(String[] args) {
        Random angkaRandom = new Random();

        ArrayList<Integer> hasil = new ArrayList<Integer>();
        int angka , prim , a ;
       

        while(hasil.size() < 5){
            angka = angkaRandom.nextInt(30);
            prim = 0 ;
            for(a=1;a<angka;a++){
                if(angka%a==0){
                    prim++;
                }
            } 
            if(prim<2 && (angka!=0)){
                hasil.add(angka);
            }
        }
        int sum = 0 ;
        for(int y=0 ; y < hasil.size(); y++ ){
            System.out.println(hasil.get(y));
            sum+= hasil.get(y);
        }

        System.out.println("Sum : " + sum);
        
        
    }
}