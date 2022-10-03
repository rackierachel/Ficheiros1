
package ficheiros1;

import java.util.Scanner;



public class Ficheiros1 {
    
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int op;
        
        do{
            System.out.println("1 - Criar Ficheiro");
            System.out.println("2 - Verificar se existe");
            System.out.println("3 - Adicionar ao ficheiro existente");
            System.out.println("4 - Criar Novo Ficheiro");
            System.out.println("5 - Ler Ficheiro");
            System.out.println("6 - Mostrar uma lista de ficheiros");
            System.out.println("0 -SAIR");
            System.out.println("Selecione a opção pretendida :");
            
            op = ler.nextInt();
            switch (op){
                case 1 : Ficheiro.criaFicheiro(); break;
                case 2 : Ficheiro.verificaSeExiste (); break;
                case 3 : Ficheiro.adicionaAoFicheiro (); break;
                case 4 : Ficheiro.escreveFicheiroNovo (); break;
                case 5 : Ficheiro.mostraConteudoFicheiro (); break;
                case 6 : Ficheiro.mostraListaFicheiros (); break;
                case 0 : break;
            }
            
        }while(op!=0);
    
  }
  
}