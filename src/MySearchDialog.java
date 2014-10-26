import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.sun.xml.internal.ws.api.server.Container;

public class MySearchDialog extends JPanel {

	//Frame Width and Height
	final int FRAME_WIDTH = 280;
	final int FRAME_HEIGHT = 130;
	
	JFrame searchFrame = new JFrame();
	
	JButton nextButton = new JButton("Next");
	JButton prevButton = new JButton("Prev");
	JTextField searchTextField;
	
	//public MySearchDialog(String title, Object[] content, JButton[] options)
	public MySearchDialog(String titleString, JTextField textField)
	{
		this.searchTextField = textField;
		
		searchFrame.setTitle(titleString);
		searchFrame.setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
		
		searchFrame.getContentPane().add(this);
		
		JLabel titleLabel = new JLabel(titleString);
		
		GroupLayout layout = new GroupLayout(this);
		setLayout(layout);
		
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.CENTER)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(layout.createParallelGroup(Alignment.LEADING)
							.addComponent(titleLabel)
							.addComponent(searchTextField)
								)
						.addContainerGap()					
						)
				.addGroup(layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(prevButton)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(nextButton)
					.addContainerGap()
						)
				);
		
		layout.setVerticalGroup(
			layout.createSequentialGroup()
				.addContainerGap()
				.addComponent(titleLabel)
				.addComponent(searchTextField, 20, 20, 20)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup()
					.addComponent(prevButton)
					.addComponent(nextButton)
					)
				.addContainerGap()
				);
		
		//searchFrame.setContentPane(contentPanel);
		searchFrame.pack();			
		//searchFrame.setVisible(true);	
	}
	
	public void showDialog()
	{
		searchFrame.setVisible(true);
	}	
}
