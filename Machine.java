
package machine;

import java.util.Scanner;

public class Machine {

    char fita[];
  int contador;
    
    public void Q(String palavra1){
        contador = 0;
        fita = palavra1.toCharArray();
        q0();
    }
    
    public void q0(){
        if(contador <= 0 ){
            if(fita[contador] == 'Z' && fita[contador + 1] == 'Z'){
                //fita[contador] = 'Z';
                contador++;
                System.out.println(fita);
                q5f();
            }
            else if(fita[contador + 1] == 'a'){
                contador++;
                fita[contador] = 'A';
                System.out.println(fita);
                contador++;
                q1();
            }
            else{
                System.out.println(fita);
                qErro();
            }
        }
        else if(contador >= 0){
            if(fita[contador] == 'a'){
                fita[contador] = 'A';
                System.out.println(fita);
                contador++;
            }           q1();
    }
//        else{
//            System.out.println(fita);
//            qErro();
//        }
}
    public void q1(){
        if(contador >= 0){
            if(fita[contador] == 'a'){
            fita[contador] = 'a';
            System.out.println(fita);
            contador++;
            q1();
        }
            else if(fita[contador] == 'B'){
            fita[contador] = 'B';
            System.out.println(fita);
            contador++;
            q1();
        }
            else if(fita[contador] == 'b'){
            fita[contador] = 'B';
            System.out.println(fita);
            contador++;
            q2();
        }
            else{
                System.out.println(fita);
                qErro();
        }
    }
        
//        else if(fita[contador] == 'b'){
//            fita[contador] = 'B';
//            System.out.println(fita);
//            contador++;
//            q2();
//        }
//        else{
//            System.out.println(fita);
//            qErro();
//        }
    }
    public void q2(){
        if(contador >= 0){
        if(fita[contador] == 'b'){
            fita[contador] = 'b';
            System.out.println(fita);
            contador++;
            q2();
        }
        else if(fita[contador] == 'C'){
            fita[contador] = 'C';
            System.out.println(fita);
            contador++;
            q2();
        }
        else if(fita[contador] == 'c'){
            fita[contador] = 'C';
            System.out.println(fita);
            contador--;
            q3();
        }
        else{
            System.out.println(fita);
            qErro();
        }
    }
//        else{
//            System.out.println(fita);
//            qErro();
//        }
    }
    public void q3(){
        if(contador >= 0){
        if(fita[contador] == 'b'){
            fita[contador] = 'b';
            System.out.println(fita);
            contador--;
            q3();
        }
        else if(fita[contador] == 'B'){
            fita[contador] = 'B';
            System.out.println(fita);
            contador--;
            q3();
        }
        else if(fita[contador]=='a'){
            fita[contador] = 'a';
            System.out.println(fita);
            contador--;
            q3();
        }
        else if(fita[contador] == 'C'){
            fita[contador] = 'C';
            System.out.println(fita);
            contador--;
            q3();
        }
        else if(fita[contador] == 'A'){
            fita[contador] = 'A';
            System.out.println(fita);
            contador++;
            q0();
        }
        else{
            System.out.println(fita);
            qErro();
        }
    }
//        else if(fita[contador] == 'C'){
//            fita[contador] = 'C';
//            System.out.println(fita);
//            contador++;
//            q4();
//        }
//        else{
//            System.out.println(fita);
//            qErro();
//        }
    }
    public void q4(){
        if(contador >= 0){
            if(fita[contador] == 'Z' && fita[contador - 1] == 'C'){
            //fita[contador] = 'Z';
            System.out.println(fita);
            contador++;
            q5f();
        }
            else if(fita[contador] == 'C'){
            fita[contador] = 'C';
            System.out.println(fita);
            contador++;
            q4();
        }
        else{
            System.out.println(fita);
            qErro();
        }
    }
        else{
            System.out.println(fita);
            q5f();
        }
    }
    
    public void q5f(){
        System.out.println("Palavra aceita!");
    }
    
    public void qErro(){
        System.out.println("Palavra nao aceita!");
    }
    
    public static void main(String[] args) {
        
        Machine m = new Machine();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("De um espaco antes de iniciar a palavra e apos terminar a palavra.");
        System.out.println("Insira a palavra: ");
        String palavra = scan.nextLine();
        
        m.Q(palavra);
    }
    
}
