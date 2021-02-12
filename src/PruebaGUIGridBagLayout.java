import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

class GUIGridBagLayout extends JFrame implements ActionListener{

	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	
	Icon icon = new ImageIcon("./archivos/sent.PNG");//imagen
	JButton btnSub = new JButton(icon);	//Icono
	JFormattedTextField txtbEAddress = new JFormattedTextField();//textbox
	
	public GUIGridBagLayout() {
		
		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("GUI-GridBagLayout");
		gbc.fill=GridBagConstraints.BOTH;
		setVisible(true);
		
		JLabel txtTitulo = new JLabel("The classic Form includes all visible fields for this list.");
		inst(txtTitulo,0,0,4,1,GridBagConstraints.NONE);
		
		inst(Box.createVerticalStrut(20),0,1,4,1,GridBagConstraints.NONE);
		
		JLabel txtFormOptions = new JLabel("Form options");
		inst(txtFormOptions,0,2,4,1,GridBagConstraints.BOTH);
		
		JLabel txt1stCheck = new JLabel("Include the following");
		inst(txt1stCheck,0,3,4,1,GridBagConstraints.BOTH);
		
		JCheckBox checkTitle = new JCheckBox("a title for your form");
		inst(checkTitle,0,4,4,1,GridBagConstraints.BOTH);
		
		JTextArea txtbMail = new JTextArea( "Subscribe to our mailing list");
		txtbMail.setLineWrap(true);
		txtbMail.setWrapStyleWord(true);
		inst(txtbMail,0,5,4,1,GridBagConstraints.BOTH);
		
		inst(Box.createVerticalStrut(20),0,6,4,1,GridBagConstraints.NONE);
		
		ButtonGroup bg = new ButtonGroup();
		JRadioButton radioOrf = new JRadioButton("only required fields");
		bg.add(radioOrf);
		inst(radioOrf,0,7,4,1,GridBagConstraints.BOTH);
		JRadioButton radioAll = new JRadioButton("all fields");
		bg.add(radioAll);
		inst(radioAll,0,8,4,1,GridBagConstraints.BOTH);
		
		JLabel txtEditFields = new JLabel("(edit required fields in the form builder)");
		inst(txtEditFields,0,9,4,1,GridBagConstraints.BOTH);
		
		inst(Box.createVerticalStrut(20),0,10,4,1,GridBagConstraints.NONE);
		
		JCheckBox checkIgf = new JCheckBox("interest group fields");
		inst(checkIgf,0,11,4,1,GridBagConstraints.BOTH);
		
		JCheckBox checkRfi = new JCheckBox("required field indicators");
		inst(checkRfi,0,12,4,1,GridBagConstraints.BOTH);
		
		inst(Box.createVerticalStrut(20),0,13,4,1,GridBagConstraints.NONE);
		
		JLabel txtSfw = new JLabel("Set form width");
		inst(txtSfw,0,14,4,1,GridBagConstraints.BOTH);
		
		JTextArea txtbSfw = new JTextArea();
		txtbSfw.setLineWrap(true);
		txtbSfw.setWrapStyleWord(true);
		inst(txtbSfw,0,15,4,1,GridBagConstraints.BOTH);
		
		inst(Box.createVerticalStrut(20),0,16,4,1,GridBagConstraints.NONE);
		
		JLabel txtEyf = new JLabel("Enhance your form");
		inst(txtEyf,0,17,4,1,GridBagConstraints.BOTH);
		
		JCheckBox checEvPop= new JCheckBox("enable evil popup mode");
		inst(checEvPop,0,18,4,1,GridBagConstraints.BOTH);
		
		JCheckBox checkJS = new JCheckBox("disable all JavaScript");
		inst(checkJS,0,19,4,1,GridBagConstraints.BOTH);
		
		JCheckBox checkfLink = new JCheckBox("include archive link");
		inst(checkfLink,0,20,4,1,GridBagConstraints.BOTH);
		
		JCheckBox checkMkRw = new JCheckBox("include Monkey Rewards link");
		inst(checkMkRw,0,21,4,1,GridBagConstraints.BOTH);
		
		
		
		
		inst(Box.createHorizontalStrut(20),4,0,1,0,GridBagConstraints.NONE);
		
		JLabel txtPreview = new JLabel("Preview");
		inst(txtPreview,5,0,12,1,GridBagConstraints.BOTH);
		txtPreview.setPreferredSize(new Dimension(475,20));
		
		inst(Box.createVerticalStrut(20),5,1,12,1,GridBagConstraints.NONE);
		
		JLabel txtEAddress = new JLabel("Email Address");
		inst(txtEAddress,5,2,12,1,GridBagConstraints.BOTH);
		
		inst(txtbEAddress,5,3,12,1,GridBagConstraints.BOTH);
		
		inst(Box.createVerticalStrut(1),5,4,12,1,GridBagConstraints.NONE);
		
		JLabel txtFName = new JLabel("First Name");
		inst(txtFName,5,5,12,1,GridBagConstraints.BOTH);
		
		JTextArea txtbFName = new JTextArea();
		txtbFName.setLineWrap(true);
		txtbFName.setWrapStyleWord(true);
		inst(txtbFName,5,6,12,1,GridBagConstraints.BOTH);
		
		inst(Box.createVerticalStrut(1),5,7,12,1,GridBagConstraints.NONE);
		
		
		JLabel txtLName = new JLabel("Last Name");
		inst(txtLName,5,8,12,1,GridBagConstraints.BOTH);
		
		JTextArea txtbLName = new JTextArea();
		txtbLName.setLineWrap(true);
		txtbLName.setWrapStyleWord(true);
		inst(txtbLName,5,9,12,1,GridBagConstraints.BOTH);
		
		
		btnSub.addActionListener(this);
		inst(btnSub,5,10,1,1,GridBagConstraints.NONE);
		
		inst(Box.createVerticalStrut(1),5,11,12,1,GridBagConstraints.NONE);
		
		JLabel txtCp = new JLabel("Copy/paste onto your site");
		inst(txtCp,5,12,12,1,GridBagConstraints.BOTH);
		
		JTextArea display = new JTextArea(
				"	<div id=\"mce-responses\" class=\"cler\"" + 
				"		<div class=\"response\" id=\"mce-err" + 
				"		<div class=\"response\" id=\"mce-suc" + 
				"	</div>    <!-- real people should not fi" + 
				"		<div class=\"response\" id=\"mce-err" + 
				"		<div class=\"response\" id=\"mce-suc" + 
				"	</div>    <!-- real people should not fi" + 
				"		<div class=\"response\" id=\"mce-err" + 
				"		<div class=\"response\" id=\"mce-suc" + 
				"	</div>    <!-- real people should not fi" + 
				"    <div style=\"position: absolute; left: -"+ 
				"<script type='text/javascript' src='//s3.am");
	    display.setEditable(false);
	    display.setLineWrap(true);
	    display.setWrapStyleWord(true);
	    JScrollPane scroll = new JScrollPane(display);
	    scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	    inst(scroll,5,13,12,7,GridBagConstraints.BOTH);
	    
		pack();
	}
	
	public void inst(Component cmp,int gridx, int gridy, int gridwidth, int gridheight, int fill) {
		gbc.gridx=gridx;
		gbc.gridy=gridy;
		gbc.gridwidth=gridwidth;
		gbc.gridheight=gridheight;
		gbc.fill=fill;
		gbl.setConstraints(cmp, gbc);
		add(cmp);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}


public class PruebaGUIGridBagLayout {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new GUIGridBagLayout();
			}
		});

	}

}
