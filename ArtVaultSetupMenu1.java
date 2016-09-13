import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ArtVaultSetupMenu1 extends JFrame implements ActionListener{ 
  
  String months[] = new String[11];
  String days[] = new String[30];
  String years[] = new String[9];
  
  
  String columnnames[] = {"Quantity", "Item", "Quality"};
  Object[][] data = {{"Quantity", "Item", "Quality"}};
  
  String periods[] = new String[4];
  String statuses[] = new String[6];
  String columnnames2[] = {"Period", "Student", "Status"};
  Object[][] data2 = {{"Period", "Student", "Status"}};
  
  
  JPanel pan1 = new JPanel();
  JPanel pan2 = new JPanel();
  JPanel pan3 = new JPanel();
  JPanel pan4 = new JPanel();
  JPanel pan5 = new JPanel();
  JPanel pan6 = new JPanel();
  
  JPanel pan7 = new JPanel();
  JPanel pan8 = new JPanel();
  JPanel pan9 = new JPanel();
  
  JPanel pan10 = new JPanel();
  JPanel pan11 = new JPanel();
  JPanel pan12 = new JPanel();
  JPanel pan13 = new JPanel();
  JPanel pan14 = new JPanel();
  JPanel pan15 = new JPanel();
  JPanel pan16 = new JPanel();
  JPanel pan17 = new JPanel();
  JPanel pan18 = new JPanel();
  JPanel pan19 = new JPanel();
  JPanel pan20 = new JPanel();
  
  JPanel pan21 = new JPanel();
  JPanel pan22 = new JPanel();
  JPanel pan23 = new JPanel();
  JPanel pan24 = new JPanel();
  JPanel pan25 = new JPanel();
  JPanel pan26 = new JPanel();
  JPanel pan27 = new JPanel();
  JPanel pan28 = new JPanel();
  JPanel pan29 = new JPanel();
  JPanel pan30 = new JPanel();
  JPanel pan31 = new JPanel();
  JPanel pan32 = new JPanel();
  JPanel pan33 = new JPanel();
  JPanel pan34 = new JPanel();
  JPanel pan35 = new JPanel();
  JPanel pan36 = new JPanel();
  JPanel pan37 = new JPanel();
  JPanel pan38 = new JPanel();
  JPanel pan39 = new JPanel();
  JPanel pan40 = new JPanel();
  JPanel pan41 = new JPanel();
  JPanel pan42 = new JPanel();
  JPanel pan43 = new JPanel();
  JPanel pan44 = new JPanel();
  
  JPanel pan45 = new JPanel();
  JPanel pan46 = new JPanel();
  JPanel pan47 = new JPanel();
  JPanel pan48 = new JPanel();
  JPanel pan49 = new JPanel();
  JPanel pan50 = new JPanel();
  JPanel pan51 = new JPanel();
  JPanel pan52 = new JPanel();
  JPanel pan53 = new JPanel();
  JPanel pan54 = new JPanel();
  JPanel pan55 = new JPanel();
  JPanel pan56 = new JPanel();
  JPanel pan57 = new JPanel();
  JPanel pan58 = new JPanel();
  JPanel pan59 = new JPanel();
  JPanel pan60 = new JPanel();
  JPanel pan61 = new JPanel();
  JPanel pan62 = new JPanel();
  JPanel pan63 = new JPanel();
  JPanel pan64 = new JPanel();
  JPanel pan65 = new JPanel();
  JPanel pan66 = new JPanel();
  JPanel pan67 = new JPanel();
  JPanel pan68 = new JPanel();
  JPanel pan69 = new JPanel();
  JPanel pan70 = new JPanel();
  
  
  
  //____________________________________ CREATE THE GUI COMPONENTS ________________________________________
  
  JLabel programLabel = new JLabel("Welcome To Art Vault!", JLabel.CENTER);    //create a label
  JButton startButton = new JButton("Start"); //create a button    
  JButton setupButton = new JButton("Setup");     
  JButton helpButton = new JButton("Help"); 
  JButton quitButton = new JButton("Quit"); 
  
  JFrame helpframe = new JFrame(" Help Menu");
  
  DefaultListModel listmodel;
  JList manualList;  
  JScrollPane manualListScrollPane;
  JButton closeButton = new JButton("Close"); 
  
  
  JFrame useraccountframe = new JFrame("User Account Menu");
  
  JLabel useraccountLabel = new JLabel(" User Account");
  JLabel usernameLabel = new JLabel("Name");
  JLabel firstnameLabel = new JLabel("     First : ");
  JTextField firstnameField = new JTextField(10);
  JLabel lastnameLabel = new JLabel(" Last : ");
  JTextField lastnameField = new JTextField(10);
  JLabel createpasswordLabel = new JLabel("     Create password :     ");
  JPasswordField createPasswordField = new JPasswordField(10);
  JLabel reenterpasswordLabel = new JLabel("     Re-enter password : ");
  JPasswordField reenterPasswordField = new JPasswordField(10);
  JLabel birthdateLabel = new JLabel("Birthdate");
  JLabel monthLabel = new JLabel("     Month : ");
  JComboBox monthComboBox;
  JLabel dayLabel = new JLabel(" Day : ");
  JComboBox dayComboBox;
  JLabel yearLabel = new JLabel(" Year : ");
  JComboBox yearComboBox;
  JLabel classLabel = new JLabel("Class");
  JLabel space1Label = new JLabel("   ");
  JRadioButton period1Button = new JRadioButton(" Period 1 ");
  JRadioButton period2Button = new JRadioButton(" Period 2 ");
  JRadioButton period3Button = new JRadioButton(" Period 3 ");
  JRadioButton period4Button = new JRadioButton(" Period 4 ");
  JRadioButton period5Button = new JRadioButton(" Period 5 ");
  JLabel space2Label = new JLabel("    ");
  JButton backButton = new JButton("Back"); 
  JLabel space3Label = new JLabel("    ");
  //JLabel space3Label = new JLabel("                                                                                      ");
  JButton nextButton = new JButton("Next"); 
  
  
  JFrame artvaultframe = new JFrame("Art Vault Menu"); 
  
  //JLabel space5Label = new JLabel("                                                    ");
  //JLabel space5Label = new JLabel(" ");
  JLabel artvaultLabel = new JLabel(" Art Vault", JLabel.CENTER);
  JLabel itemLabel = new JLabel("Item"); 
  JLabel space4Label = new JLabel("                                                    ");
  JLabel inventoryLabel = new JLabel(" Inventory "); 
  JLabel itemnameLabel = new JLabel(" Name :");
  JTextField itemnameField = new JTextField(10);
  JLabel costLabel = new JLabel(" Cost :  ");
  JTextField costField = new JTextField(10);
  JLabel qualityLabel = new JLabel(" Quality :  ");
  JLabel quantityLabel = new JLabel(" Quantity :");
  JTextField quantityField = new JTextField(10);
  JTextField qualityField = new JTextField(10);
  JLabel discriptionLabel = new JLabel(" Discription :");
  JList discriptionList;  
  JScrollPane discriptionListScrollPane;
  JButton addButton = new JButton("Add"); 
  JButton updateButton = new JButton("update"); 
  JButton back2Button = new JButton(" Back ");  
  JButton next2Button = new JButton(" Next "); 
  JLabel searchLabel = new JLabel(" Search :");  
  JTextField searchField = new JTextField(10);
  JButton qButton = new JButton("Q");
  JList inventorytable;
  
  JScrollPane inventoryListScrollPane;
  JButton leftarrowButton = new JButton("<"); 
  JButton viewButton = new JButton("View"); 
  JButton rightarrowButton = new JButton(">"); 
  JButton editButton = new JButton("Edit"); 
  JButton deleteButton = new JButton("Delete"); 
  
  
  
  JFrame studentinformationframe = new JFrame("Student Information Menu");
  
  JLabel studentLabel = new JLabel(" Student");
  JLabel studentnameLabel = new JLabel(" Name ");
  JLabel studentfirstnameLabel = new JLabel(" First : ");
  JTextField studentfirstnameField = new JTextField(10);
  JLabel studentlastnameLabel = new JLabel(" Last : ");
  JTextField studentlastnameField = new JTextField(10);
  JLabel periodLabel = new JLabel(" Period : ");
  JComboBox periodComboBox;
  JLabel emailLabel = new JLabel(" Email : ");
  JTextField emailField = new JTextField(10);
  JButton mButton = new JButton("M"); 
  JLabel cellphoneLabel = new JLabel(" Cell Phone # : ");
  JTextField cellphoneField = new JTextField(10);
  JButton callButton = new JButton("}");
  JButton mButton2 = new JButton(" M ");
  JButton callButton2 = new JButton(" } ");
  JLabel homephoneLabel = new JLabel(" Home Phone # : ");
  JTextField homephoneField = new JTextField(10);
  JButton callButton3 = new JButton("  }  ");
  //JLabel statusLabel = new JLabel(" Status : ");
  JButton statusButton = new JButton("Status");
  //JComboBox statusComboBox;
  JButton add2Button = new JButton(" Add "); 
  JButton update2Button = new JButton(" update "); 
  JLabel studentsearchLabel = new JLabel(" Search : ");
  JTextField studentsearchField = new JTextField(10);
  JButton q2Button = new JButton(" Q "); 
  JTable studenttable;
  JScrollPane studentListScrollPane;
  JButton leftarrow2Button = new JButton(" < "); 
  JButton view2Button = new JButton(" View "); 
  JButton rightarrow2Button = new JButton(" > "); 
  JButton edit2Button = new JButton(" Edit "); 
  JButton delete2Button = new JButton(" Delete "); 
  JButton back3Button = new JButton("  Back  ");  
  JButton next3Button = new JButton("  Next  "); 
  
  
  JFrame statusframe = new JFrame("Status Menu");
  
  String itemnames[];
  String cost[];
  String quality[];
  String quantity[];
  
  
  //____________________________________________ CONSTRUCTOR _______________________________________________
  
  //_______________________________________ ART VAULT SETUP JFRAME _________________________________________
  
  public ArtVaultSetupMenu1() {
    setTitle(" Art Vault Setup Menu");  //Set the window title
    setSize(400,250);         //Set the dimensions of window
    setResizable(false);
    setLocationRelativeTo(null);
    
    itemnames=new String [100];
    cost=new String[100];
    quantity= new String [100];
    quality= new String [100];
    
    
    
    for (int i=0; i<100; i++){
      itemnames[i]=" ";
      cost[i]=" ";
      quantity[i] = " ";
      quality[i] = " ";
    }
    
    FlowLayout flowlayout1 = new FlowLayout(FlowLayout.CENTER); //used to organize window
    BoxLayout boxlayout1 = new BoxLayout(pan6,BoxLayout.Y_AXIS); 
    setLayout(flowlayout1); 
    //setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));                    //organize window
    
    pan1.setLayout(flowlayout1);
    pan2.setLayout(flowlayout1);
    pan3.setLayout(flowlayout1);
    pan4.setLayout(flowlayout1);
    pan5.setLayout(flowlayout1);
    pan6.setLayout(boxlayout1);
    
    pan1.add(programLabel);
    programLabel.setFont(new Font("MONOSPACED", Font.BOLD,25)); 
    pan2.add(startButton);
    pan3.add(setupButton);
    pan4.add(helpButton);
    pan5.add(quitButton);
    
    startButton.addActionListener(this); 
    setupButton.addActionListener(this); 
    helpButton.addActionListener(this); 
    quitButton.addActionListener(this); 
    addButton.addActionListener(this);
    view2Button.addActionListener(this);
    
    add(pan1);
    add(pan2);// add the button to the frame
    add(pan3);
    add(pan4);
    add(pan5);
    add(pan6);
    
    pan6.add(pan1);
    pan6.add(pan2);
    pan6.add(pan3);
    pan6.add(pan4);
    pan6.add(pan5);
    
    setVisible(true);       // display the gui on the screen
    startButton.setEnabled(false);
    
    //__________________________________________________ HELP JFRAME ________________________________________________
    
    //helpframe.setTitle(" Help");
    helpframe.setSize(250,300);
    helpframe.setResizable(true);
    helpframe.setLocationRelativeTo(null);
    
    listmodel = new DefaultListModel();
    manualList = new JList(listmodel);
    manualListScrollPane = new JScrollPane(manualList);
    manualListScrollPane.setPreferredSize(new Dimension(200,300));
    
    listmodel.addElement("instruction: set up a password");
    listmodel.addElement("instruction 2: click start to enter");
    
    FlowLayout flowlayout2 = new FlowLayout(FlowLayout.RIGHT);
    BoxLayout boxlayout2 = new BoxLayout(pan9,BoxLayout.Y_AXIS); 
    
    pan7.setLayout(flowlayout2);
    pan8.setLayout(flowlayout2);
    pan9.setLayout(boxlayout2);
    
    pan7.add(manualListScrollPane);
    pan8.add(closeButton);
    
    closeButton.addActionListener(this); 
    
    pan9.add(pan7);
    pan9.add(pan8);
    
    helpframe.add(pan9);
    
    //__________________________________________ USER ACCOUNT JFRAME _________________________________________________
    
    useraccountframe.setSize(460,400);
    useraccountframe.setResizable(false);
    useraccountframe.setLocationRelativeTo(null);
    
    JComboBox monthComboBox = new JComboBox(months);
    monthComboBox.setPreferredSize(new Dimension(100,20));
    JComboBox dayComboBox = new JComboBox(days);
    dayComboBox.setPreferredSize(new Dimension(50,20));
    JComboBox yearComboBox = new JComboBox(years);
    yearComboBox.setPreferredSize(new Dimension(80,20));
    
    FlowLayout flowlayout3 = new FlowLayout(FlowLayout.LEFT); 
    BoxLayout boxlayout3 = new BoxLayout(pan20,BoxLayout.Y_AXIS); 
    //GridLayout gridlayout1 = new GridLayout(0,4); 
    
    pan10.setLayout(flowlayout3);
    pan11.setLayout(flowlayout3);
    pan12.setLayout(flowlayout3);
    pan13.setLayout(flowlayout3);
    pan14.setLayout(flowlayout3);
    pan15.setLayout(flowlayout3);
    pan16.setLayout(flowlayout3);
    pan17.setLayout(flowlayout3);
    pan18.setLayout(flowlayout3);
    pan19.setLayout(flowlayout3);
    pan20.setLayout(boxlayout3);
    
    pan10.add(useraccountLabel);
    useraccountLabel.setFont(new Font("MONOSPACED", Font.BOLD,22)); 
    pan11.add(usernameLabel);
    usernameLabel.setFont(new Font("MONOSPACED", Font.BOLD,18)); 
    pan12.add(firstnameLabel);
    pan12.add(firstnameField);
    pan12.add(lastnameLabel);
    pan12.add(lastnameField);
    pan13.add(createpasswordLabel);
    pan13.add(createPasswordField);
    pan14.add(reenterpasswordLabel);
    pan14.add(reenterPasswordField);
    pan15.add(birthdateLabel);
    birthdateLabel.setFont(new Font("MONOSPACED", Font.BOLD,18)); 
    pan16.add(monthLabel);
    pan16.add(monthComboBox);
    pan16.add(dayLabel);
    pan16.add(dayComboBox);
    pan16.add(yearLabel);
    pan16.add(yearComboBox);
    pan17.add(classLabel);
    classLabel.setFont(new Font("MONOSPACED", Font.BOLD,18)); 
    pan18.add(space1Label);
    pan18.add(period1Button);
    pan18.add(period2Button);
    pan18.add(period3Button);
    pan18.add(period4Button);
    pan18.add(period5Button);
    pan19.add(space2Label);
    pan19.add(backButton);
    pan19.add(space3Label);
    pan19.add(nextButton);
    
    backButton.addActionListener(this); 
    nextButton.addActionListener(this); 
    
    pan20.add(pan10);
    pan20.add(pan11);
    pan20.add(pan12);
    pan20.add(pan13);
    pan20.add(pan14);
    pan20.add(pan15);
    pan20.add(pan16);
    pan20.add(pan17);
    pan20.add(pan18);
    pan20.add(pan19);
    
    useraccountframe.add(pan20);
    
    //_____________________________________________ ART VAULT JFRAME _________________________________________________
    
    artvaultframe.setSize(575,550);
    artvaultframe.setResizable(false);
    artvaultframe.setLocationRelativeTo(null);
    
//    JTextField qualityField = new JTextField (10);
//    JTextField quantityField = new JTextField(10);
    
    //listmodel = new DefaultListModel();
    discriptionList = new JList(listmodel);
    discriptionListScrollPane = new JScrollPane(discriptionList);
    discriptionListScrollPane.setPreferredSize(new Dimension(225,100));
    addButton.setPreferredSize(new Dimension(110,26));
    updateButton.setPreferredSize(new Dimension(110,26));
    
    inventorytable = new JList(itemnames);
    inventoryListScrollPane = new JScrollPane(inventorytable);
    inventoryListScrollPane.setPreferredSize(new Dimension(300,200));
    leftarrowButton.setPreferredSize(new Dimension(75,26));
    viewButton.setPreferredSize(new Dimension(138,26));
    rightarrowButton.setPreferredSize(new Dimension(75,26));
    editButton.setPreferredSize(new Dimension(147,26));
    deleteButton.setPreferredSize(new Dimension(147,26));
    
    BoxLayout boxlayout4 = new BoxLayout(pan32,BoxLayout.Y_AXIS); 
    BoxLayout boxlayout5 = new BoxLayout(pan38,BoxLayout.Y_AXIS); 
    BoxLayout boxlayout6 = new BoxLayout(pan39,BoxLayout.Y_AXIS); 
    BoxLayout boxlayout7 = new BoxLayout(pan42,BoxLayout.Y_AXIS);
    
    pan21.setLayout(flowlayout3);
    pan22.setLayout(flowlayout3);
    pan23.setLayout(flowlayout3);
    pan24.setLayout(flowlayout3);
    pan25.setLayout(flowlayout3);
    pan26.setLayout(flowlayout3);
    pan27.setLayout(flowlayout3);
    pan28.setLayout(flowlayout3);
    pan29.setLayout(flowlayout3);
    pan30.setLayout(flowlayout3);
    pan31.setLayout(flowlayout3);
    pan32.setLayout(boxlayout4);
    pan33.setLayout(flowlayout3);
    pan34.setLayout(flowlayout3);
    pan35.setLayout(flowlayout3);
    pan36.setLayout(flowlayout3);
    pan37.setLayout(flowlayout3);
    pan38.setLayout(boxlayout5);
    pan39.setLayout(boxlayout6);
    pan40.setLayout(flowlayout3);
    pan41.setLayout(flowlayout3);
    pan42.setLayout(boxlayout7);
    pan43.setLayout(flowlayout3);
    pan44.setLayout(flowlayout3);
    
    //pan43.add(space5Label);
    pan21.add(artvaultLabel);
    artvaultLabel.setFont(new Font("MONOSPACED", Font.BOLD,22));
    //pan44.add(pan43);
    pan44.add(pan21);
    
    pan22.add(itemLabel);
    itemLabel.setFont(new Font("MONOSPACED", Font.BOLD,18)); 
    pan23.add(space4Label);
    pan24.add(inventoryLabel);
    inventoryLabel.setFont(new Font("MONOSPACED", Font.BOLD,18));
    
    pan25.add(itemnameLabel);
    pan25.add(itemnameField);
    pan26.add(costLabel);
    pan26.add(costField);
    pan27.add(qualityLabel);
    pan27.add(qualityField);
    pan45.add(quantityLabel);
    pan45.add(quantityField);
    pan28.add(discriptionLabel);
    pan29.add(discriptionListScrollPane);
    pan30.add(addButton);
    pan30.add(updateButton);
    
    pan33.add(searchLabel);
    pan33.add(searchField);
    pan33.add(qButton);
    pan34.add(inventoryListScrollPane);
    pan35.add(leftarrowButton);
    pan35.add(viewButton);
    pan35.add(rightarrowButton);
    pan36.add(editButton);
    pan36.add(deleteButton);
    
    back2Button.addActionListener(this); 
    next2Button.addActionListener(this); 
    
    pan31.add(pan22);
    pan31.add(pan23);
    pan31.add(pan24);
    
    pan32.add(pan25);
    pan32.add(pan26);
    pan32.add(pan27);
    pan32.add(pan45);
    pan32.add(pan28);
    pan32.add(pan29);
    pan32.add(pan30);
    
    pan37.add(pan33);
    
    pan38.add(pan34);
    pan38.add(pan35);
    pan38.add(pan36);
    
    pan39.add(pan37);
    pan39.add(pan38);
    
    pan40.add(pan32);
    pan40.add(pan39);
    
    pan41.add(back2Button);
    pan41.add(next2Button);
    
    pan42.add(pan44);
    pan42.add(pan31);
    pan42.add(pan40);
    pan42.add(pan41);
    
    artvaultframe.add(pan42);
    
    //_______________________________________ STUDENT INFORMATION JFRAME ____________________________________________
    
    studentinformationframe.setSize(675,530);
    studentinformationframe.setResizable(true);
    studentinformationframe.setLocationRelativeTo(null);
    
    JComboBox periodComboBox = new JComboBox(periods);
    periodComboBox.setPreferredSize(new Dimension(100,20));
    statusButton.setPreferredSize(new Dimension(158,26));
    //JComboBox statusComboBox = new JComboBox(statuses);
    //statusComboBox.setPreferredSize(new Dimension(100,20));
    add2Button.setPreferredSize(new Dimension(75,26));
    JTable studenttable = new JTable(data2, columnnames2);
    studentListScrollPane = new JScrollPane(studenttable);
    studentListScrollPane.setPreferredSize(new Dimension(300,200));
    leftarrow2Button.setPreferredSize(new Dimension(75,26));
    view2Button.setPreferredSize(new Dimension(138,26));
    rightarrow2Button.setPreferredSize(new Dimension(75,26));
    edit2Button.setPreferredSize(new Dimension(147,26));
    delete2Button.setPreferredSize(new Dimension(147,26));
    next3Button.setPreferredSize(new Dimension(78,26));
    
    BoxLayout boxlayout8 = new BoxLayout(pan64,BoxLayout.Y_AXIS);
    BoxLayout boxlayout9 = new BoxLayout(pan65,BoxLayout.Y_AXIS);
    
    pan45.setLayout(flowlayout3);
    pan46.setLayout(flowlayout3);
    
    pan47.setLayout(flowlayout3);
    pan48.setLayout(flowlayout3);
    pan49.setLayout(flowlayout3);
    pan50.setLayout(flowlayout3);
    pan51.setLayout(flowlayout3);
    pan52.setLayout(flowlayout3);
    pan54.setLayout(flowlayout3);
    pan55.setLayout(flowlayout3);
    pan56.setLayout(flowlayout3);
    pan57.setLayout(flowlayout3);
    pan58.setLayout(flowlayout3);
    pan59.setLayout(flowlayout3);
    pan60.setLayout(flowlayout3);
    pan61.setLayout(flowlayout3);
    pan62.setLayout(flowlayout3);
    pan63.setLayout(flowlayout3);
    pan64.setLayout(boxlayout8);
    pan65.setLayout(boxlayout9);
    pan66.setLayout(flowlayout3);
    
    
    
    pan46.add(studentLabel);
    studentLabel.setFont(new Font("MONOSPACED", Font.BOLD,22));
    pan47.add(studentnameLabel);
    studentnameLabel.setFont(new Font("MONOSPACED", Font.BOLD,18));
    pan48.add(studentfirstnameLabel);
    pan48.add(studentfirstnameField);
    pan48.add(studentlastnameLabel);
    pan48.add(studentlastnameField);
    pan49.add(periodLabel);
    pan49.add(periodComboBox);
    pan50.add(emailLabel);
    pan50.add(emailField);
    pan50.add(mButton);
    pan51.add(cellphoneLabel);
    pan51.add(cellphoneField);
    pan51.add(callButton);
 
    pan54.add(mButton2);
    pan55.add(callButton2);
    pan56.add(homephoneLabel);
    pan56.add(homephoneField);
    pan56.add(callButton3);
    pan57.add(statusButton);
    //pan57.add(statusLabel);
    //pan57.add(statusComboBox);
    pan58.add(add2Button);
    pan58.add(update2Button);
    pan59.add(studentsearchLabel);
    pan59.add(studentsearchField);
    pan59.add(q2Button);
    pan60.add(studentListScrollPane);
    pan61.add(leftarrow2Button);
    pan61.add(view2Button);
    pan61.add(rightarrow2Button);
    pan62.add(edit2Button);
    pan62.add(delete2Button);
    pan63.add(back3Button);
    pan63.add(next3Button);
    
    statusButton.addActionListener(this); 
    back3Button.addActionListener(this); 
    next3Button.addActionListener(this); 
    
    pan64.add(pan46);
    pan64.add(pan47);
    pan64.add(pan48);
    pan64.add(pan49);
    pan64.add(pan50);
    pan64.add(pan51);
    pan64.add(pan52);
    pan64.add(pan54);
    pan64.add(pan55);
    pan64.add(pan56);
    pan64.add(pan57);
    pan64.add(pan58);
    pan64.add(pan63);
    
    pan65.add(pan59);
    pan65.add(pan60);
    pan65.add(pan61);
    pan65.add(pan62);
    
    pan66.add(pan64);
    pan66.add(pan65);
    
    studentinformationframe.add(pan66);
    
    //_____________________________________________ STATUS JFRAME _____________________________________________________
    
    statusframe.setSize(500,300);
    statusframe.setResizable(false);
    statusframe.setLocationRelativeTo(null);
    
    //pan53.add();
    //pan67.add();
    //pan68.add();
    //pan69.add();
    //pan70.add();
    
  }
  
  public void actionPerformed(ActionEvent event) {
    String command = event.getActionCommand();
    
    if (command.equals("Help")) {
      helpframe.setVisible(true);
      
    }
    if (command.equals("Close")) {
      helpframe.setVisible(false);
    }
    
    if (command.equals("Quit")){
      System.exit(0);
    }
    
    if (command.equals("Setup")) {
      useraccountframe.setVisible(true);
      setVisible(false);
    }
    
    if (command.equals("Back")) {
      useraccountframe.setVisible(false);
      setVisible(true);
    }
    
    if (command.equals("Next")) {
      artvaultframe.setVisible(true);
      useraccountframe.setVisible(false);
    }
    
    if (command.equals(" Back ")) {
      artvaultframe.setVisible(false);
      useraccountframe.setVisible(true);
    }
    
    if (command.equals(" Next ")) {
      studentinformationframe.setVisible(true);
      artvaultframe.setVisible(false);
    }
    
    if (command.equals("  Back  ")) {
      studentinformationframe.setVisible(false);
      artvaultframe.setVisible(true);
    }
    
    if (command.equals("Status")) {
      //studentinformationframe.setVisible(false);
      statusframe.setVisible(true);
    }
    
    if (command.equals("Add")){
      for (int i=0; i<100; i++){
        if (itemnames[i].equals(" ")){
          itemnames[i]=itemnameField.getText();
          cost[i]=costField.getText();
          quality[i]= qualityField.getText();
          quantity[i]= quantityField.getText();
          itemnameField.setText(" ");
          costField.setText(" ");
          qualityField.setText(" ");
          quantityField.setText(" ");
          break;
        }
      }
    }
    
    if (command.equals("View")){
      JOptionPane.showMessageDialog(pan1, "cost: " + cost + "quality: " + quality + "quantity: " + quantity);
    }
    
    
    
    
    /*
     if (command.equals("  Next  ")) {
     studentinformationframe.setVisible(true);
     artvaultframe.setVisible(false);
     }
     */
  }
  
  public static void main(String[] args) {
    ArtVaultSetupMenu1 frame1 = new ArtVaultSetupMenu1();  //start the GUI!
  }
}




// http://stackoverflow.com/questions/18249592/how-to-change-font-size-in-drawstring-java
// http://stackoverflow.com/questions/144892/how-to-center-a-window-in-java
//http://da2i.univ-lille1.fr/doc/tutorial-java/uiswing/components/table.html