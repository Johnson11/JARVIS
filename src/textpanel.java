import java.awt.Font;
import java.io.UnsupportedEncodingException;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.text.DefaultCaret;

class textpanel extends JTextArea {
	public textpanel(String text){
		setFont(new Font("mono", Font.ITALIC, 16));
		append(text);

	}
	public void matrix(){
		Random r = new Random();
		String complete = new String();
		for(int i = 0; i < 1000; i++){
			if(i%10==0) complete+="\n";
			complete+=String.valueOf(r.nextInt(2));
		}
		setText("");
		append(complete);
		//setCaretPosition(getDocument().getLength());


	}
	} //class TextPanel