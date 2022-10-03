
package ficheiros1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Ficheiro {

    static void adicionaAoFicheiro() {
        String nome; 
        System.out.println("Insira o nome do ficheiro a criar"); 
        nome = Ficheiros1.ler.nextLine(); 
        nome = Ficheiros1.ler.next(); 
        File ficheiro = new File (nome); 
        try { 
            if(!ficheiro.exists()){         
                ficheiro.createNewFile();  
                }  
                FileWriter fw = new FileWriter(ficheiro, true); 
                BufferedWriter bw = new BufferedWriter (fw); 
                String texto; 
                System.out.println("Insira o conteudo"); 
                texto = Ficheiros1.ler.nextLine(); 
                texto = Ficheiros1.ler.nextLine(); 
                bw.write(texto); 
                bw.newLine(); 
                bw.close(); 
                fw.close(); 
            } catch (IOException ex){ 
                ex.printStackTrace(); } 
         
          }

    static void mostraListaFicheiros() {
        File ficheiro = new File("C:\\Users\\rcustodio\\Desktop\\JAVA\\FICHEIROS");
        File [] lista = ficheiro.listFiles();
        System.out.println(">>> Lista de Ficheiros <<<");
           for (int x = 0;x<lista.length;x++){
            System.out.println(lista[x].getName());
        }
    }

    static void criaFicheiro() {
        String nome;
        System.out.println("Insira o nome do ficheiro a criar");
        
        nome = Ficheiros1.ler.nextLine();
        nome = Ficheiros1.ler.next();
        File ficheiro = new File(nome);
        if(!ficheiro.exists()){
            try {
                ficheiro.createNewFile();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
    }
    }

    static void verificaSeExiste() {
        String nome;
        System.out.println("Insira o nome do ficheiro a criar");
        
        nome = Ficheiros1.ler.nextLine();
        nome = Ficheiros1.ler.next();
        File ficheiro = new File(nome);
        if(!ficheiro.exists()){
            
                System.out.println("O ficheiro não existe");
            }else{
                    System.out.println("O ficheiro existe");
                    }
            }

    static void escreveFicheiroNovo() {
               String nome; 
        System.out.println("Insira o nome do ficheiro a criar"); 
        nome = Ficheiros1.ler.nextLine(); 
        nome = Ficheiros1.ler.next(); 
        File ficheiro = new File (nome); 
        try { 
            if(!ficheiro.exists()){         
                ficheiro.createNewFile();  
                }  
                FileWriter fw = new FileWriter(ficheiro); 
                BufferedWriter bw = new BufferedWriter (fw); 
                String texto; 
                System.out.println("Insira o conteudo"); 
                texto = Ficheiros1.ler.nextLine(); 
                texto = Ficheiros1.ler.nextLine(); 
                bw.write(texto); 
                bw.newLine(); 
                bw.close(); 
                fw.close(); 
            } catch (IOException ex){ 
                ex.printStackTrace(); } 
         
          }

    static void mostraConteudoFicheiro() {
             String nome; 
        System.out.println("Insira o nome do ficheiro a mostrar"); 
        nome = Ficheiros1.ler.nextLine(); 
        nome = Ficheiros1.ler.next(); 
        File ficheiro = new File (nome); 
        if(!ficheiro.exists()) {
        System.out.println("O ficheiro não existe");
        }else{
           try{ 
            FileReader fr = new FileReader(ficheiro);
            BufferedReader br = new BufferedReader(fr);
            while(br.ready()){
                    String linha = br.readLine();
                    System.out.println(linha);
                }
            br.close();
            fr.close();
            }catch (FileNotFoundException ex){
                    ex.printStackTrace();
                    }catch(IOException ioe){ 
         
    }
    }
      
    }
    }
    
    


        

   
    

