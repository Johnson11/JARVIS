import java.awt.Font;
import java.io.UnsupportedEncodingException;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

class textpanel extends JTextArea {
	public textpanel(String text){
		JScrollPane scrollPane = new JScrollPane(this); 
		setFont(new Font("mono", Font.ITALIC, 16));
		append(text);
	}
	public void matrix(){
		Random r = new Random();
		String complete=String.valueOf(r.nextInt(2));
		append(complete);
	}
	} //class TextPanel