import javax.swing.*;
   public class Exercicio8{
      public static int mdc(int x, int n){
         if (n==0) return x;
         else return mdc(n, x % n);
         }
         public static void main(String[] args){
            int x = Integer.parseInt (JOptionPane.showInputDialog("Digite o primeiro numero: "));
            int n = Integer.parseInt (JOptionPane.showInputDialog("Digite o segundo numero: "));
            JOptionPane.showMessageDialog(null, "O resultado é: " + (x % n));
            System.exit(0);
            }
        }
         