import javax.swing.*;
   public class Exercicio5{
      public static int pot(int x, int n){
         if(n == 0) return 1;
         else return (x * pot(x, n-1));  
         }
         public static void main(String [] args){
            int x = Integer.parseInt (JOptionPane.showInputDialog("Digite o primeiro numero: "));
            int n = Integer.parseInt (JOptionPane.showInputDialog("Digite o segundo numero: "));
            JOptionPane.showMessageDialog(null, "O resultado é: " + (x * pot(x, n-1)));
            
            System.exit(0);
            }
        }
            
         
            
         