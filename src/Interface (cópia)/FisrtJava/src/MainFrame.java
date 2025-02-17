import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
public class MainFrame extends JFrame {
    public void initialize(){
        final Font mainFont = new Font("Segoe print ", Font.BOLD, 18);
        JTextField tfFisrtName, tfLastName;
        JLabel lbWelcome;
        
        
        JLabel Lbname = new JLabel("Nome");
        Lbname.setFont(mainFont);
        
        tfFisrtName = new JTextField();
        tfFisrtName.setFont(mainFont);

        JLabel LblastName = new JLabel("Sobrenome"); 
        LblastName.setFont(mainFont);
    
        tfLastName = new JTextField();
        tfLastName.setFont(mainFont);


        JPanel forms = new JPanel();    
        forms.setLayout(new GridLayout(4,1,1,5));
        forms.setOpaque(false);
        forms.add(Lbname);
        forms.add(tfFisrtName);
        forms.add(LblastName);
        forms.add(tfLastName); 

        lbWelcome = new JLabel();
        lbWelcome.setFont(mainFont);

        JButton button = new JButton("ok");
        button.setFont(mainFont);
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e){
                String firstName = tfFisrtName.getText();
                String lastName = tfLastName.getText();
                lbWelcome.setText("Olá, " + firstName + "" + lastName);
            }
            
        });


        JButton bntClear = new JButton("Apagar");
        bntClear.setFont(mainFont);
        bntClear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e){
               tfFisrtName.setText("");
               tfLastName.setText("");
               lbWelcome.setText("");
            }
            
        });

        JPanel  buttonPanel = new JPanel();
        buttonPanel.setLayout(new BorderLayout());
        buttonPanel.setOpaque(false);
        buttonPanel.add(button);
        buttonPanel.add(bntClear);


        
        JPanel maiPanel = new JPanel();
        maiPanel.setLayout(new BorderLayout());
        maiPanel.setBackground(new Color(0, 191, 255));
        maiPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        maiPanel.add(forms, BorderLayout.NORTH);
        maiPanel.add(lbWelcome, BorderLayout.CENTER);
        maiPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(maiPanel);

        setTitle("Welcome");
        setSize(200,300);
        setMinimumSize(new Dimension(300,400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        MainFrame myFrame = new MainFrame();
        myFrame.initialize();
    }
}
