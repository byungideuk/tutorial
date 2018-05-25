import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileFilter;
import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class FileMan extends JFrame implements ActionListener{
	Panel panel1 = new Panel(new BorderLayout());
	Panel panel2 = new Panel(new BorderLayout());
	Panel panel3 = new Panel(new BorderLayout());
	Panel panel4 = new Panel(new BorderLayout());
	TextArea text = new TextArea("",20,35,TextArea.SCROLLBARS_NONE);
	Choice choice = new Choice();
	Label label = new Label("File Explorer");
	
	JTree tree;
	private DefaultMutableTreeNode leaf3;
	private DefaultTreeModel treeModel;
	private String colName[] = { "Name", "Size", "Modified"};
	private JPanel pan = new JPanel();
	DefaultTableModel model = new DefaultTableModel(colName, 0);
	JTable table = new JTable(model);
	public FileMan() {
		super("/home/");
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("disk drive(C:)");
		treeModel = new DefaultTreeModel(root);
		tree = new JTree(treeModel);
		File dir = new File("C:\\");
		File[] files = dir.listFiles(); 
		FileFilter fileFilter = new FileFilter() {
			public boolean accept(File file) { 
				return file.isDirectory();
			}
		};
		files = dir.listFiles(fileFilter);
		if (files.length == 0) {
			System.out.println("Either dir does not exist or is not a directory");
		} else {
			for (int i = 0; i < files.length; i++) {
				File filename = files[i];
				if (filename.toString().contains("$") || filename.toString().contains("Recovery")
						|| filename.toString().contains("System") || filename.toString().contains("Temp")
						|| filename.toString().contains("PerfLogs"))

					continue;
				else {	
						Object a = filename;
						String w = a.toString();
						String e[] = w.split("\\\\");
						leaf3 = new DefaultMutableTreeNode(e[1]);
						root.add(leaf3);
					}
				}
			}
		
		DefaultMutableTreeNode root1 = new DefaultMutableTreeNode("disk drive(C:)");
		treeModel = new DefaultTreeModel(root);
		tree = new JTree(treeModel);
		File dir1 = new File("D:\\");
		File[] files1 = dir.listFiles(); 
		FileFilter fileFilter1 = new FileFilter() {
			public boolean accept(File file) {
				return file.isDirectory();
			}
		};
		files = dir1.listFiles(fileFilter1);
		
	 	choice.addItem("English");
		choice.addItem("ÇÑ±¹¾î");
		String row1[] = new String[3];
		  row1[0] = "app.html";
		  row1[1] = "1.3 KB";
		  row1[2] = "1/4/2018/ 06:24:13";
		  
		String row2[] = new String[3];
			row2[0] = "package.json";
			row2[1] = "384 B";
			row2[2] = "5/10/2018/ 01:02:09"; 
			
		model.addRow(row1);
		model.addRow(row2);
		
		pan.add(new JScrollPane(table));
		
		this.add(pan);		
		add(panel1,BorderLayout.SOUTH);
		add(panel2,BorderLayout.WEST);
		add(panel3,BorderLayout.NORTH);
		add(panel4,BorderLayout.EAST);
		panel1.add(label,BorderLayout.WEST);
		panel1.add(choice,BorderLayout.EAST);
		panel2.add(tree);
		setSize(1000, 700);
		setVisible(true);
		this.setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new FileMan();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
			if(arg0.equals(choice)) {
				
			}
	}
}