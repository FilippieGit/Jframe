
package Controller;

import static View.Tela_GUI.img_img;
import static View.Tela_GUI.res_txt;
import static View.Tela_GUI.valor1_txt;
import static View.Tela_GUI.valor2_txt;
import java.awt.Color;
import javax.swing.JOptionPane;


public class Funcoes_DAO {
    
        public static double valor1 = Double.parseDouble(View.Tela_GUI.valor1_txt.getText());
        public static double valor2 = Double.parseDouble(View.Tela_GUI.valor2_txt.getText());
        public static double valor3 = 0;
        
        
        public static void somar(){
            
        valor3 = valor1+valor2;
        img_img.setVisible(true);
        
        res_txt.setVisible(true);
        res_txt.setText(String.valueOf(valor3));
        res_txt.setBackground(Color.yellow);
    }
        
        public static void subtrair(){
            
        valor3 = valor1 - valor2;
        img_img.setVisible(true);
        
        res_txt.setVisible(true);
        res_txt.setText(String.valueOf(valor3));
        res_txt.setBackground(Color.yellow);
    }
        
        public static void divisao(){
            
        valor3 = valor1 / valor2;
        img_img.setVisible(true);
        
        res_txt.setVisible(true);
        res_txt.setText(String.valueOf(valor3));
        res_txt.setBackground(Color.yellow);
    }
        
        public static void multiplicacao(){
            
        valor3 = valor1 * valor2;
        img_img.setVisible(true);
        
        res_txt.setVisible(true);
        res_txt.setText(String.valueOf(valor3));
        res_txt.setBackground(Color.yellow);
    }
        
        public static void limpar(){
        
        img_img.setVisible(false);
        valor1_txt.setText("");
        valor2_txt.setText("");
        res_txt.setText("");
        }
        
      
    
}
