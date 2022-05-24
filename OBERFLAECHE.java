import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.JOptionPane;               
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.Component;

/**   BITTE ALS VORLAGE BZW. TIPS DAS PROJEKT MIT DER SCHLANGE UND EDEM PILZ BENUTZEN (SIEHE PROJEKT IN GITHUB BEI ACCOUNT DENNIS)
      ALTERNATIV CATERINGPROJEKT BEI GITHUB PAULA

      Bitte als Oberkommentare die blauen verwenden mit Slash und zwei Sternen
      und als Zwischenkommentar die grauen verwenden 
           mit Slash und einem Stern (Mehrzeilig)
           mit zwei Slash und ohne Sterne (Einzeilig)
 */

public class OBERFLAECHE extends JFrame

{
    private JFrame f;
    private JPanel anmeldungsbild;
    private JPanel Bestellungsbild;
    private JPanel Rechnungsbild;
    
    /**JFrame zur Anmeldung am Anfang*/
    private JLabel l_anmeldung;
    private JLabel l_benutzername;
    private JLabel l_passwort;
    private JTextField tf_benutzername;
    private JTextField tf_passwort;
    private JButton b_17;
    private JButton b_18;
    private JButton b_beenden;
    private JButton b_anmelden;
    
    /**JFrame zur Bestellungsauswahl für BEIDE Altersgruppen; es wird beim Ausführen mit setVisible gearbeitet*/
    private JLabel l_bestellung;
    private JLabel l_anzahl;
    private JLabel l_konzertnummer;
    private JTable t;
    private JComboBox cb_anzahl;
    private JComboBox cb_konzertnummer;
    private JButton b_zurück;
    private JButton b_auswahlbestätigen;
    
    /**JFrame für Rechnung am Ende*/
    private JLabel l_rechnung;
    private JLabel l_gesamtpreis;
    /*   Drei Felder zur Zusammenfassenden Info fehlen noch
         konzertnr.
         anzahl
         gesamtpreis
    */
    private JButton b_pdf;
    
    public OBERFLAECHE()
    {
   
        super.setLayout(null);
        super.setSize(973, 1047);
        super.setVisible(true);
    }
    
    public void FensterAufbauenV1() {

        
        

    }
    
    public void FensterAufbauenV2() {

        
        

    }
}
