
package turingmachine1;

//import java.util.ArrayList;

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
        if(fita.length > contador){
            if(fita[contador] == 'a'){
                fita[contador] ='A';
                System.out.println(fita);
                contador = contador + 1;
                q1();
            }
            else if(fita.length == 'B'){
                fita[contador] = 'B';
                System.out.println(fita);
                contador = contador + 1;
                q4();
            }
            else{
                q5f();
            }
        }
           else{
                System.out.println("Erro no q0");
                qErro();
            }
    }
    public void q1(){
        if(fita.length > contador){
            if(fita[contador] == 'a'){
                fita[contador] = 'a';
                System.out.println(fita);
                contador = contador + 1;
                q1();
            }
            else if(fita[contador] == 'B'){
                fita[contador] = 'B';
                System.out.println(fita);
                contador = contador + 1;
                q1();
            }
            else if(fita[contador] == 'b'){
                fita[contador] = 'B';
                System.out.println(fita);
                contador = contador + 1;
                q2();
            }
            else{
                contador = contador + 1;
                q1();
        }
    }
        else{
            System.out.println("Erro no q1");
            qErro();
        }
    }
    public void q2(){
        if(fita.length > contador){
        if(fita[contador] == 'b'){
            fita[contador] = 'b';
            System.out.println(fita);
            contador = contador + 1;
            q2();
        }
        else if(fita[contador] == 'C'){
            fita[contador] = 'C';
            System.out.println(fita);
            contador = contador + 1;
            q2();
        }
        else if(fita[contador] == 'c'){
            fita[contador] = 'C';
            System.out.println(fita);
            contador = contador - 1;
            q3();
        }
        else{
            contador = contador + 1;
            q2();
        }
        }
        else{
            System.out.println("Erro no q2");
            qErro();
        }
    }
    
    public void q3(){
        if(fita.length > contador){
        if(fita[contador] == 'b'){
            fita[contador] = 'b';
            System.out.println(fita);
            contador = contador - 1;
            q3();
        }
        else if(fita[contador] == 'B'){
            fita[contador] = 'B';
            System.out.println(fita);
            contador = contador - 1;
            q3();
        }
        else if(fita[contador]=='a'){
            fita[contador] = 'a';
            System.out.println(fita);
            contador = contador - 1;
            q3();
        }
        else if(fita[contador] == 'C'){
            fita[contador] = 'C';
            System.out.println(fita);
            contador = contador - 1;
            q3();
        }
        else if(fita[contador] == 'A'){
            fita[contador] = 'A';
            System.out.println(fita);
            contador = contador + 1;
            q0();
        }
        else{
            System.out.println("Erro no q3");
            qErro();
        }
    }
}
    public void q4(){
        if(fita.length > contador){
        if(fita[contador] == 'B'){
            fita[contador] = 'B';
            contador++;
            q4();
        }
        else if(fita[contador] == 'C'){
            fita[contador] = 'C';
            System.out.println(fita);
            contador = contador + 1;
            q4();
        }
        else if(fita[contador] == fita.length -1){
            //fita[contador] = ' ';
            contador++;
            q5f();
        }
        else{
            System.out.println("Erro no q4");
            qErro();
        }
    }
        else{
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
        
        System.out.println("Insira a palavra:");
        String palavra = scan.nextLine();
        
        m.Q(palavra);
    }
    
}
