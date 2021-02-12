import java.awt.Component;
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
		
		JLabel txtTitulo = new JLabel("<html>The classic Form includes all visible fields for this list.<html>");
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
		
		/*
		JLabel txtPreview = new JLabel("Preview");
		txtPreview.setBounds(277,21,324,13);
		add(txtPreview);
		
		JLabel txtEAddress = new JLabel("Email Address");
		txtEAddress.setBounds(296,66,136,9);
		add(txtEAddress);
		
		
		txtbEAddress.setBounds(296, 80, 419, 25);
		add(txtbEAddress);//textbox email
		
		JLabel txtFName = new JLabel("First Name");
		txtFName.setBounds(296,118,110,9);
		add(txtFName);
		
		JTextArea txtbFName = new JTextArea();
		txtbFName.setBounds(296, 132, 419, 25);
		txtbFName.setLineWrap(true);
		txtbFName.setWrapStyleWord(true);
		add(txtbFName);
		
		JLabel txtLName = new JLabel("Last Name");
		txtLName.setBounds(296,170,110,9);
		add(txtLName);
		
		JTextArea txtbLName = new JTextArea();
		txtbLName.setBounds(296, 184, 419, 25);
		txtbLName.setLineWrap(true);
		txtbLName.setWrapStyleWord(true);
		add(txtbLName);
		
	
		btnSub.setBounds(297, 221, 53, 53);
		btnSub.addActionListener(this);
		add(btnSub);//bounds del botón
		
		JLabel txtCp = new JLabel("Copy/paste onto your site");
		txtCp.setBounds(277,300,1,13);
		add(txtCp);
		*/
		JTextArea display = new JTextArea("<!-- Begin MailChimp Signup Form -->\r\n" + 
				"<link href=\"//cdn-images.mailchimp.com/embedcode/classic-10_7.css\" rel=\"stylesheet\" type=\"text/css\">\r\n" + 
				"<style type=\"text/css\">\r\n" + 
				"	#mc_embed_signup{background:#fff; clear:left; font:14px Helvetica,Arial,sans-serif;  width:500px; margin-right: auto; margin-left:auto; padding: 15px;}\r\n" + 
				"	/* Add your own MailChimp form style overrides in your site stylesheet or in this style block.\r\n" + 
				"	   We recommend moving this block and the preceding CSS link to the HEAD of your HTML file. */\r\n" + 
				"</style>\r\n" + 
				"<div id=\"mc_embed_signup\">\r\n" + 
				"<form action=\"//cafetruth.us4.list-manage.com/subscribe/post?u=1cb3e16b044661b3a214687b6&amp;id=07a29d37f6\" method=\"post\" id=\"mc-embedded-subscribe-form\" name=\"mc-embedded-subscribe-form\" class=\"validate\" target=\"_blank\" novalidate>\r\n" + 
				"    <div id=\"mc_embed_signup_scroll\">\r\n" + 
				"	<h2 align=center>Join and Get Our <br />Tried & True Testimonial Request Template</h2>\r\n" + 
				"<div class=\"indicates-required\"><span class=\"asterisk\">*</span> indicates required</div>\r\n" + 
				"<div class=\"mc-field-group\">\r\n" + 
				"	<label for=\"mce-EMAIL\">Email Address  <span class=\"asterisk\">*</span>\r\n" + 
				"</label>\r\n" + 
				"	<input type=\"email\" value=\"\" name=\"EMAIL\" class=\"required email\" id=\"mce-EMAIL\">\r\n" + 
				"</div>\r\n" + 
				"<div class=\"mc-field-group\">\r\n" + 
				"	<label for=\"mce-FNAME\">First Name </label>\r\n" + 
				"	<input type=\"text\" value=\"\" name=\"FNAME\" class=\"\" id=\"mce-FNAME\">\r\n" + 
				"</div>\r\n" + 
				"<div class=\"mc-field-group\">\r\n" + 
				"	<label for=\"mce-LNAME\">Last Name </label>\r\n" + 
				"	<input type=\"text\" value=\"\" name=\"LNAME\" class=\"\" id=\"mce-LNAME\">\r\n" + 
				"</div>\r\n" + 
				"	<div id=\"mce-responses\" class=\"clear\">\r\n" + 
				"		<div class=\"response\" id=\"mce-error-response\" style=\"display:none\"></div>\r\n" + 
				"		<div class=\"response\" id=\"mce-success-response\" style=\"display:none\"></div>\r\n" + 
				"	</div>    <!-- real people should not fill this in and expect good things - do not remove this or risk form bot signups-->\r\n" + 
				"    <div style=\"position: absolute; left: -5000px;\" aria-hidden=\"true\"><input type=\"text\" name=\"b_1cb3e16b044661b3a214687b6_07a29d37f6\" tabindex=\"-1\" value=\"\"></div>\r\n" + 
				"    <div class=\"clear\"><input type=\"submit\" value=\"Subscribe\" name=\"subscribe\" id=\"mc-embedded-subscribe\" class=\"button\"></div>\r\n" + 
				"    </div>\r\n" + 
				"</form>\r\n" + 
				"</div>\r\n" + 
				"<script type='text/javascript' src='//s3.amazonaws.com/downloads.mailchimp.com/js/mc-validate.js'></script><script type='text/javascript'>(function($) {window.fnames = new Array(); window.ftypes = new Array();fnames[0]='EMAIL';ftypes[0]='email';fnames[1]='FNAME';ftypes[1]='text';fnames[2]='LNAME';ftypes[2]='text';}(jQuery));var $mcj = jQuery.noConflict(true);</script>\r\n" + 
				"<!--End mc_embed_signup-->");
	    display.setEditable(false);
	    display.setLineWrap(true);
	    display.setWrapStyleWord(true);
	    JScrollPane scroll = new JScrollPane(display);
	    scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		//scroll.setBounds(277, 323, 463, 150);
		
		//add(scroll);
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
