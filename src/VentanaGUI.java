import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaGUI {
    private JTextField cedulatextField1;
    private JTextField nombretextField1;
    private JTextField edadtextField1;
    private JComboBox gererocomboBox1;
    private JComboBox regioncomboBox1;
    private JTextArea colatextArea1;
    private JButton ingresarButton;
    private JButton button2;
    private JButton button3;
    private JPanel VentanaGUI;

    private Cola cola=new Cola();





    public VentanaGUI() {

        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    cola.encolar(cedulatextField1.getText(),nombretextField1.getText(),Integer.parseInt(edadtextField1.getText()), gererocomboBox1.getSelectedItem().toString(), regioncomboBox1.getSelectedItem().toString());
                    colatextArea1.setText(cola.listarPersonas());
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }

            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("VentanaGUI");
        frame.setContentPane(new VentanaGUI().VentanaGUI);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}