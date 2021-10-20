
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
    
        Scanner teclado = new Scanner(System.in);
       
        int vetor1[] = new int[65];
        int vetor2[] = new int[65];
                
        for(int i=0; i<65;i++){
            vetor1[i] = teclado.nextInt();
        }
        
        for(int i=0; i<65;i++){
            vetor2[i] = teclado.nextInt();
        }
        
        boolean palindrom = true;
        
        for (int i = 0; i <65; i++) {
            if(vetor1[i] != vetor2[vetor2.length-i-1]){
                palindrom = false;
            }
        }
        
        if(palindrom==true){
            System.out.println("SIM");
        }else{
            System.out.println("NAO");
        }
    }    
}