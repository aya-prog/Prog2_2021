package aufgaben.aufgabe8;
import javax.swing.*;
import java.awt.*;




			public class Taschenrechner extends JFrame {

		    public Taschenrechner() {
		        super();    
		        this.setTitle("Taschnrechner");
		        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        this.setSize(400,300);
		        this.setLocation(600,300);
		        this.setVisible(true);
		        //this.getContentPane().setBackground(new java.awt.Color(111, 201, 227));
		        JPanel content = this.initContent();
		        this.getContentPane().add(content);
		        
		    }
		    
		    private JPanel initContent() {
		        
		        //main container
		        
		        JPanel mainPanel = new JPanel();
		        mainPanel.setLayout(new BorderLayout());
		        
		        
		        //oben container
		        
		        JPanel oben = new JPanel();
		        oben.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
		        JTextField output = new JTextField(10);
		        //oben.setBackground(Color.DARK_GRAY);
		        
		        //mitte container
		        
		        JPanel mitte = new JPanel();
		        mitte.setLayout(new GridLayout(4, 4, 15, 15));
		        
		        
		        JButton t1 = new JButton ("1");
		        JButton t2 = new JButton ("2");
		        JButton t3 = new JButton ("3");
		        JButton t4 = new JButton ("4");
		        JButton t5 = new JButton ("5");
		        JButton t6 = new JButton ("6");
		        JButton t7 = new JButton ("7");
		        JButton t8 = new JButton ("8");
		        JButton t9 = new JButton ("9");
		        JButton t10 = new JButton ("(");
		        JButton t11 = new JButton ("0");
		        JButton t12 = new JButton (")");
		        JButton t13 = new JButton ("*");
		        JButton t14 = new JButton ("/");
		        JButton t15 = new JButton ("+");
		        JButton t16 = new JButton ("-");
		        JButton t17 = new JButton (".");
		        JButton t18 = new JButton ("=");
		        
		        mitte.add(t1);
		        mitte.add(t2);
		        mitte.add(t3);
		        mitte.add(t4);
		        mitte.add(t5);
		        mitte.add(t6);
		        mitte.add(t7);
		        mitte.add(t8);
		        mitte.add(t9);
		        mitte.add(t10);
		        mitte.add(t11);
		        mitte.add(t12);
		        mitte.add(t13);
		        mitte.add(t14);
		        mitte.add(t15);
		        mitte.add(t16);
		        mitte.add(t17);
		        mitte.add(t18);
		        mitte.setBackground(Color.LIGHT_GRAY);
		        
		        mainPanel.add(oben, BorderLayout.NORTH);
		        mainPanel.add(mitte, BorderLayout.CENTER);
		        
		        return mainPanel;
		    }




		    public static void main(String[] args) {
		        new Taschenrechner();
		        
		    }
		

	}


