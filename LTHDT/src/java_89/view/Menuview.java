package java_89.view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java_89.controller.Menucontroller;
import java_89.controller.Menulitstener;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

public class Menuview extends JFrame {

    private JLabel jLabel_test;
    public JPopupMenu jpPopupMenu;
    public JToolBar jtoolbar;

    public Menuview() {
        this.setTitle("Menu");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(10,10));
        Menucontroller mcl = new Menucontroller(this);
          // thêm thanh menu
        JMenuBar menuBar = new JMenuBar();
    
        JMenu menu_file = new JMenu("File");
        JMenuItem menuItem_save = new JMenuItem("Save");
        menuItem_save.addActionListener(mcl);
         menuItem_save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
        JMenuItem menuItem_exit = new JMenuItem("Exit");
        menuItem_exit.addActionListener(mcl);
        menuItem_exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_DOWN_MASK));
        menu_file.add(menuItem_save);
        menu_file.add(menuItem_exit);

        JMenu menu_view = new JMenu("View");
        JMenuItem menuItem_run = new JMenuItem("Run");
        menuItem_run.addActionListener(mcl);
          menuItem_run.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.CTRL_DOWN_MASK));
        JMenuItem menuItem_output = new JMenuItem("Output");
        menuItem_output.addActionListener(mcl);
        menuItem_output.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
        JMenu menu_editor__layout = new JMenu("Editor Layout");
        menu_editor__layout.addActionListener(mcl);
        JMenuItem menuItem_split_up = new JMenuItem("Split Up");
        menuItem_split_up.addActionListener(mcl);
        menuItem_split_up.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_UP, InputEvent.ALT_DOWN_MASK));
        JMenuItem menuItem_split_down = new JMenuItem("Split Down");
        menuItem_split_down.addActionListener(mcl);
        menuItem_split_down.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, InputEvent.ALT_DOWN_MASK));
        menu_editor__layout.add(menuItem_split_up);
        menu_editor__layout.add(menuItem_split_down);
        menu_view.add(menu_editor__layout);
        menu_view.add(menuItem_run);
        menu_view.add(menuItem_output);

        JMenu jMenu_help = new JMenu("Help");
        JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem("Toolbar");
        jMenu_help.add(jCheckBoxMenuItem);
        jCheckBoxMenuItem.addActionListener(mcl);
        

        menuBar.add(menu_file);
        menuBar.add(menu_view);
        menuBar.add(jMenu_help);

        this.setJMenuBar(menuBar);

      Font f1 = new Font("Arial",Font.BOLD,30);
        jtoolbar = new JToolBar();
       jtoolbar.addSeparator();
    
       JButton jbutton_undo = new JButton("Undo");
       jbutton_undo.setToolTipText("vao day de quay lai");
       jbutton_undo.addActionListener(mcl);
       jbutton_undo.setFont(f1);
      
       JButton jbutton_redo = new JButton("Redo");
       jbutton_redo.setToolTipText("vao day de di toi");
       jbutton_undo.addActionListener(mcl);
       jbutton_redo.setFont(f1);
       JButton jbutton_cut = new JButton("Cut");
       jbutton_cut.setToolTipText("vao day de cat ");
       jbutton_cut.addActionListener(mcl);
       jbutton_cut.setFont(f1);
       JButton jbutton_copy = new JButton("Copy");
       jbutton_copy.setToolTipText("vao day de copy");
       jbutton_copy.addActionListener(mcl);
       jbutton_copy.setFont(f1);
       JButton jbutton_paste = new JButton("Paste");
       jbutton_paste.setToolTipText("vao day de dan");
       jbutton_paste.addActionListener(mcl);
       jbutton_paste.setFont(f1);
       jtoolbar.add(jbutton_undo);
       jtoolbar.add(jbutton_redo);
       jtoolbar.add(jbutton_cut);
       jtoolbar.add(jbutton_copy);
       jtoolbar.add(jbutton_paste);
      

       // tạo menu chuọt phải
       jpPopupMenu = new JPopupMenu();
       

       JMenu jmenu_font = new JMenu("Font");
       jmenu_font.addActionListener(mcl);
       JMenuItem jmeItem_type = new JMenuItem("Type");
       jmeItem_type.addActionListener(mcl);
       JMenuItem jmeItem_size = new JMenuItem("Size");
       jmeItem_size.addActionListener(mcl);
       jmenu_font.add(jmeItem_type);
       jmenu_font.add(jmeItem_size);

      JMenuItem jmenu_cut = new JMenuItem("Cut");
       jmenu_cut.addActionListener(mcl);
       JMenuItem jmenu_copy = new JMenuItem("Copy");
       jmenu_copy.addActionListener(mcl);
       JMenuItem jmenu_paste = new JMenuItem("Paste");
       jmenu_paste.addActionListener(mcl);

       jpPopupMenu.add(jmenu_font);
       jpPopupMenu.add(jmenu_cut);
       jpPopupMenu.add(jmenu_copy);
       jpPopupMenu.add(jmenu_paste);

      
       
        Menulitstener mlt = new Menulitstener(this);
       


        Font f = new Font("Arial",Font.BOLD,20);
        jLabel_test = new JLabel();
        jLabel_test.setFont(f);
        this.add(jLabel_test, BorderLayout.CENTER);
         jLabel_test.addMouseListener(mlt);

        this.setVisible(true);
    }

    public void setlaber(String s){
        this.jLabel_test.setText(s);

    }

    public void naTool(){
      this.add(jtoolbar,BorderLayout.NORTH);
      
    }
    public void diTool(){
      this.remove(jtoolbar);
    }




   
   

    

}
