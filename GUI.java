/**
 * This is the main graphical user interface (GUI) for a Teacher Management System
 * It interacts with users allowing them to perform various actions such as adding, displaying information about lecturers and tutors. Grading Assignment for the lecturers, and Setting the Salary and Removing the Tutor.
 * 
 * 
 * author@ Safal Bhattarai
 * ID: 23049395
 * College ID : np05cp4a230039
 */
import javax.swing.*;

import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/*This is the constructor of class GUI. All graphical components used in our project is  */
public class GUI {
    /*----------------------- Declaring Instance Variables  --------------------------------*/
    private JFrame frame;
    private JLabel titleLbl;
    private ImageIcon frameIcon;

    // For Help Icon
    private ImageIcon helpIcon;
    private JButton helpBtn;

    // For main Button
    private JButton lecturerBtn;
    private JButton tutorBtn;

    // Array List of Teacher
    private ArrayList<Teacher> teacherArrayList;

    // For Lecturer Panel
    // Note : The variables related to lecture are start with letter 'l'
    private JPanel mainLecturerPanel;
    private JLabel registrationLbl;
    private JPanel lecturerPanel;
    private JLabel lTeacherIdLbl;
    private JTextField lTeacherIdTF;
    private JLabel lTeacherNameLbl;
    private JTextField lTeacherNameTF;
    private JLabel lTeacherAddressLbl;
    private JTextField lTeacherAddressTF;
    private JLabel lWorkingTypeLbl;
    private JComboBox<String> lWorkingType;
    private JLabel employmentStatusLbl;
    private JTextField employmentStatusTF;
    private JLabel departmentLbl;
    private JTextField departmentTF;
    private JLabel yearsOfExperienceLbl;
    private JTextField yearsOfExperienceTF;
    private JButton addLecturerBtn;

    // For Grade Panel
    // Note : The variables related to grade Panel are start with letter 'GP'
    private JLabel gradeLbl;
    private JPanel gradePanel;
    private JLabel GPgradedScoreLbl;
    private JTextField GPgradedScoreTF;
    private JLabel GPlTeacherIdLbl;
    private JTextField GPteacherIdTF;
    private JLabel GPdepartmentLbl;
    private JTextField GPdepartmentTF;
    private JLabel GPyearsOfExperienceLbl;
    private JTextField GPyearsOfExperienceTF;
    private JButton gradeBtn;

    // Display and Clear Button for Lecturer Panel
    private JButton displayBtn;
    private JButton clearBtn;

    // For Tutor Panel
    // Note : The variables related to tutor are start with letter 't'
    private JPanel mainTutorPanel;
    private JLabel tRegistrationLbl;
    private JPanel tutorPanel;
    private JLabel tTeacherIdLbl;
    private JTextField tTeacherIdTF;
    private JLabel tTeacherNameLbl;
    private JTextField tTeacherNameTF;
    private JLabel tTeacherAddressLbl;
    private JTextField tTeacherAddressTF;
    private JLabel tWorkingTypeLbl;
    private JComboBox<String> tWorkingType;
    private JLabel tEmploymentStatusLbl;
    private JTextField tEmploymentStatusTF;
    private JLabel tWorkingHoursLbl;
    private JTextField tWorkingHoursTF;
    private JLabel salaryLbl;
    private JTextField salaryTF;
    private JLabel specializationLbl;
    private JTextField specializationTF;
    private JLabel academicQualificationLbl;
    private JTextField academicQualificationTF;
    private JLabel performanceIndexLbl;
    private JTextField performanceIndexTF;
    private JButton addTutorBtn;

    // For Salary Panel
    // Note : The variables related to salary are start with letter'SP'
    private JLabel salaryTitleLbl;
    private JPanel setSalaryPanel;
    private JLabel SPnewSalaryLbl;
    private JTextField SPnewSalaryTF;
    private JLabel SPtTeacherIdLbl;
    private JTextField SPtTeacherIdTF;
    private JLabel SPnewPerformanceIndexLbl;
    private JTextField SPnewPerformanceIndexTF;
    private JButton setSalaryBtn;

    // For Remove Tutor Panel
    private JLabel removeTitleLbl;
    private JLabel RPteacherID;
    private JTextField RPteacherIDTF;
    private JButton RPremoveBtn;
    private JPanel removePanel;

    // Display and Clear button for Tutor
    private JButton tDisplayBtn;
    private JButton tClearBtn;

    // Color used in GUI
    private Color secondbgColor = new Color(203, 192, 181);
    private Color backgroundColor = Color.GRAY;
    private Color fontColor = new Color(54, 69, 79);

    // Font used in GUI
    // Font Titlefont = new Font("Comic Sans MS", Font.BOLD,25);
    private Font titleFont;
    private Font subtitleFont;

    // Border used in GUI
    private Border bd;
    private Border bd1;
    private Border comBorder;

    /**
     * Constructor of the Class
     * This method represents the constructor of the GUI class,
     * initializing the graphical user interface components of the
     * Teacher Management System.
     */
    public GUI() {
        // Color used in GUI
        secondbgColor = new Color(203, 192, 181);
        backgroundColor = Color.GRAY;
        fontColor = new Color(54, 69, 79);

        // Font used in GUI
        // Font Titlefont = new Font("Comic Sans MS", Font.BOLD,25);
        titleFont = new Font("Courier", Font.PLAIN, 27);
        subtitleFont = new Font("Comic Sans MS", Font.BOLD, 15);

        // Border used in GUI
        bd = BorderFactory.createLineBorder(new Color(54, 69, 79), 5);
        bd1 = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
        comBorder = BorderFactory.createCompoundBorder(bd1, bd);

        frame = new JFrame();
        frame.setSize(1050, 750);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(secondbgColor);
        frame.setTitle("Teacher Management System");

        // Changing the Frame's Icon
        frameIcon = new ImageIcon("frameIcon.png");
        frame.setIconImage(frameIcon.getImage());

        // Creating title Label
        titleLbl = new JLabel("   Teacher Management System");
        titleLbl.setFont(titleFont);
        titleLbl.setBorder(BorderFactory.createLineBorder(backgroundColor, 4));
        titleLbl.setBounds(355, 10, 420, 50);
        frame.add(titleLbl);
        titleLbl.setForeground(fontColor);

        // Creating a Help Icon
        helpIcon = new ImageIcon("help.png");
        Image helpIcn = helpIcon.getImage();
        helpIcn = helpIcn.getScaledInstance(30, 30, Image.SCALE_SMOOTH);

        // Adding the Help icon to the Button
        ImageIcon resizeIcon = new ImageIcon(helpIcn);
        helpBtn = new JButton();
        helpBtn.setIcon(resizeIcon);
        helpBtn.setBounds(1000, 5, 30, 30);
        frame.add(helpBtn);
        helpBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                helpPannel();
            }
        });

        // Creating an ArrayList to store the Object of Teacher
        teacherArrayList = new ArrayList<>();

        // Start of Lecturer Panel
        // Creating Panel for Lecturer Management
        mainLecturerPanel = new JPanel();
        frame.add(mainLecturerPanel);
        mainLecturerPanel.setLayout(null);
        mainLecturerPanel.setBounds(18, 150, 1000, 550);
        mainLecturerPanel.setBackground(backgroundColor);
        // registrationPanel.setForeground(new Color(54,69,79));
        mainLecturerPanel.setBorder(comBorder);
        mainLecturerPanel.setVisible(false);

        registrationLbl = new JLabel("Registration Form");
        registrationLbl.setFont(titleFont);
        registrationLbl.setBounds(130, 20, 300, 35);
        mainLecturerPanel.add(registrationLbl);
        registrationLbl.setForeground(fontColor);

        // Create panel for adding lecturer details
        lecturerPanel = new JPanel();
        lecturerPanel.setLayout(new GridLayout(0, 2, 10, 12));
        lecturerPanel.setBackground(secondbgColor);
        lecturerPanel.setBorder(BorderFactory.createLineBorder(secondbgColor, 5));
        lecturerPanel.setBounds(20, 80, 460, 350);
        mainLecturerPanel.add(lecturerPanel);

        // Create labels and text fields for lecturer details
        lTeacherIdLbl = new JLabel("Teacher ID");
        lTeacherIdLbl.setFont(subtitleFont);
        lecturerPanel.add(lTeacherIdLbl);

        lTeacherNameLbl = new JLabel("Teacher Name");
        lTeacherNameLbl.setFont(subtitleFont);
        lecturerPanel.add(lTeacherNameLbl);

        lTeacherIdTF = new JTextField();
        lTeacherIdTF.setFont(subtitleFont);
        lecturerPanel.add(lTeacherIdTF);

        lTeacherNameTF = new JTextField();
        lTeacherNameTF.setFont(subtitleFont);
        lecturerPanel.add(lTeacherNameTF);

        lTeacherAddressLbl = new JLabel("Teacher Address");
        lTeacherAddressLbl.setFont(subtitleFont);
        lecturerPanel.add(lTeacherAddressLbl);

        lWorkingTypeLbl = new JLabel("Working Type");
        lWorkingTypeLbl.setFont(subtitleFont);
        lecturerPanel.add(lWorkingTypeLbl);

        lTeacherAddressTF = new JTextField();
        lTeacherAddressTF.setFont(subtitleFont);
        lecturerPanel.add(lTeacherAddressTF);

        // Adding string values to the JComboBox
        String[] workingTypes = { "Full-Time", "Part-Time" };
        lWorkingType = new JComboBox<>(workingTypes);
        lWorkingType.setFont(subtitleFont);
        lecturerPanel.add(lWorkingType);

        employmentStatusLbl = new JLabel("Employment Status");
        employmentStatusLbl.setFont(subtitleFont);
        lecturerPanel.add(employmentStatusLbl);

        departmentLbl = new JLabel("Department");
        departmentLbl.setFont(subtitleFont);
        lecturerPanel.add(departmentLbl);

        employmentStatusTF = new JTextField();
        employmentStatusTF.setFont(subtitleFont);
        lecturerPanel.add(employmentStatusTF);

        departmentTF = new JTextField();
        departmentTF.setFont(subtitleFont);
        lecturerPanel.add(departmentTF);

        yearsOfExperienceLbl = new JLabel("Year Of Experience");
        yearsOfExperienceLbl.setFont(subtitleFont);
        lecturerPanel.add(yearsOfExperienceLbl);

        // Adding an empty label for design and formating purpose
        JLabel emptyLBL = new JLabel(" ");
        lecturerPanel.add(emptyLBL);

        yearsOfExperienceTF = new JTextField();
        yearsOfExperienceTF.setFont(subtitleFont);
        lecturerPanel.add(yearsOfExperienceTF);

        // Create buttons for adding lecturer
        addLecturerBtn = new JButton("Add Lecture");
        addLecturerBtn.setFont(subtitleFont);
        addLecturerBtn.setBackground(Color.CYAN);
        addLecturerBtn.setFocusable(false);
        addLecturerBtn.setBounds(160, 450, 150, 40);
        mainLecturerPanel.add(addLecturerBtn);
        addLecturerBtn.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        addLeturer();
                    }
                });

        // Creating Title for Grade Assignment Panel
        gradeLbl = new JLabel("Grade Assignments");
        gradeLbl.setFont(titleFont);
        gradeLbl.setForeground(fontColor);
        gradeLbl.setBounds(650, 20, 300, 35);
        mainLecturerPanel.add(gradeLbl);

        // Creating panel for Grade Assignment
        gradePanel = new JPanel();
        mainLecturerPanel.add(gradePanel);
        gradePanel.setLayout(new GridLayout(0, 2, 10, 12));
        gradePanel.setBackground(secondbgColor);
        gradePanel.setBounds(600, 80, 380, 170);
        gradePanel.setBorder(BorderFactory.createLineBorder(secondbgColor, 5));

        // Create labels and text fields for Grade Panel
        GPgradedScoreLbl = new JLabel("Graded Score");
        GPgradedScoreLbl.setFont(subtitleFont);
        gradePanel.add(GPgradedScoreLbl);

        GPlTeacherIdLbl = new JLabel("Teacher Id");
        GPlTeacherIdLbl.setFont(subtitleFont);
        gradePanel.add(GPlTeacherIdLbl);

        GPgradedScoreTF = new JTextField();
        GPgradedScoreTF.setFont(subtitleFont);
        gradePanel.add(GPgradedScoreTF);

        GPteacherIdTF = new JTextField();
        GPteacherIdTF.setFont(subtitleFont);
        gradePanel.add(GPteacherIdTF);

        GPdepartmentLbl = new JLabel("Department");
        GPdepartmentLbl.setFont(subtitleFont);
        gradePanel.add(GPdepartmentLbl);

        GPyearsOfExperienceLbl = new JLabel("Years Of Experience");
        GPyearsOfExperienceLbl.setFont(subtitleFont);
        gradePanel.add(GPyearsOfExperienceLbl);

        GPdepartmentTF = new JTextField();
        GPdepartmentTF.setFont(subtitleFont);
        gradePanel.add(GPdepartmentTF);

        GPyearsOfExperienceTF = new JTextField();
        GPyearsOfExperienceTF.setFont(subtitleFont);
        gradePanel.add(GPyearsOfExperienceTF);

        // Create buttons for grading assignments
        gradeBtn = new JButton("Grade Assignment");
        gradeBtn.setBackground(Color.CYAN);
        gradeBtn.setFocusable(false);
        gradeBtn.setFont(subtitleFont);
        gradeBtn.setBounds(690, 270, 170, 40);
        mainLecturerPanel.add(gradeBtn);
        gradeBtn.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        gradeAssignment();
                    }
                });

        // Creating Display and Clear Button for Lecturer
        displayBtn = new JButton("Display");
        displayBtn.setBackground(secondbgColor);
        displayBtn.setFocusable(false);
        displayBtn.setFont(titleFont);
        displayBtn.setBorder(bd);
        displayBtn.setBounds(600, 450, 150, 50);
        mainLecturerPanel.add(displayBtn);
        displayBtn.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        displayLecturer();
                    }
                });

        clearBtn = new JButton("Clear");
        clearBtn.setBackground(secondbgColor);
        clearBtn.setFocusable(false);
        clearBtn.setFont(titleFont);
        clearBtn.setBorder(bd);
        clearBtn.setBounds(790, 450, 150, 50);
        mainLecturerPanel.add(clearBtn);
        clearBtn.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        clearLecturer();
                    }
                });
        // End of Lecturer Management Panel

        // Start of Tutor Management Panel
        // Creating Panel for Tutor Management
        mainTutorPanel = new JPanel();
        frame.add(mainTutorPanel);
        mainTutorPanel.setLayout(null);
        mainTutorPanel.setBounds(18, 150, 1000, 550);
        mainTutorPanel.setBackground(backgroundColor);
        // registrationPanel.setForeground(new Color(54,69,79));
        mainTutorPanel.setBorder(comBorder);
        mainTutorPanel.setVisible(false);

        tRegistrationLbl = new JLabel("Registration Form");
        tRegistrationLbl.setFont(titleFont);
        tRegistrationLbl.setBounds(130, 20, 300, 35);
        mainTutorPanel.add(tRegistrationLbl);
        tRegistrationLbl.setForeground(fontColor);

        // Create panel for adding Tutor details
        tutorPanel = new JPanel();
        tutorPanel.setLayout(new GridLayout(0, 2, 10, 12));
        tutorPanel.setBackground(secondbgColor);
        tutorPanel.setBorder(BorderFactory.createLineBorder(secondbgColor, 5));
        tutorPanel.setBounds(20, 80, 460, 400);
        mainTutorPanel.add(tutorPanel);

        tTeacherIdLbl = new JLabel("Teacher ID");
        tTeacherIdLbl.setFont(subtitleFont);
        tutorPanel.add(tTeacherIdLbl);

        tTeacherNameLbl = new JLabel("Teacher Name");
        tTeacherNameLbl.setFont(subtitleFont);
        tutorPanel.add(tTeacherNameLbl);

        tTeacherIdTF = new JTextField();
        tTeacherIdTF.setFont(subtitleFont);
        tutorPanel.add(tTeacherIdTF);

        tTeacherNameTF = new JTextField();
        tTeacherNameTF.setFont(subtitleFont);
        tutorPanel.add(tTeacherNameTF);

        tTeacherAddressLbl = new JLabel("Teacher Address");
        tTeacherAddressLbl.setFont(subtitleFont);
        tutorPanel.add(tTeacherAddressLbl);

        tWorkingTypeLbl = new JLabel("Working Type");
        tWorkingTypeLbl.setFont(subtitleFont);
        tutorPanel.add(tWorkingTypeLbl);

        tTeacherAddressTF = new JTextField();
        tTeacherAddressTF.setFont(subtitleFont);
        tutorPanel.add(tTeacherAddressTF);

        // Adding string values to the JComboBox
        String[] tWorkingTypes = { "Full-Time", "Part-Time" };
        tWorkingType = new JComboBox<>(tWorkingTypes);
        tWorkingType.setFont(subtitleFont);
        tutorPanel.add(tWorkingType);

        tEmploymentStatusLbl = new JLabel("Employment Status");
        tEmploymentStatusLbl.setFont(subtitleFont);
        tutorPanel.add(tEmploymentStatusLbl);

        salaryLbl = new JLabel("Salary");
        salaryLbl.setFont(subtitleFont);
        tutorPanel.add(salaryLbl);

        tEmploymentStatusTF = new JTextField();
        tEmploymentStatusTF.setFont(subtitleFont);
        tutorPanel.add(tEmploymentStatusTF);

        salaryTF = new JTextField();
        salaryTF.setFont(subtitleFont);
        tutorPanel.add(salaryTF);

        specializationLbl = new JLabel("Specialization");
        specializationLbl.setFont(subtitleFont);
        tutorPanel.add(specializationLbl);

        academicQualificationLbl = new JLabel("Academic Qualification");
        academicQualificationLbl.setFont(subtitleFont);
        tutorPanel.add(academicQualificationLbl);

        specializationTF = new JTextField();
        specializationTF.setFont(subtitleFont);
        tutorPanel.add(specializationTF);

        academicQualificationTF = new JTextField();
        academicQualificationTF.setFont(subtitleFont);
        tutorPanel.add(academicQualificationTF);

        tWorkingHoursLbl = new JLabel("Working Hours");
        tWorkingHoursLbl.setFont(subtitleFont);
        tutorPanel.add(tWorkingHoursLbl);

        performanceIndexLbl = new JLabel("Performance Index");
        performanceIndexLbl.setFont(subtitleFont);
        tutorPanel.add(performanceIndexLbl);

        tWorkingHoursTF = new JTextField();
        tWorkingHoursTF.setFont(subtitleFont);
        tutorPanel.add(tWorkingHoursTF);

        performanceIndexTF = new JTextField();
        performanceIndexTF.setFont(subtitleFont);
        tutorPanel.add(performanceIndexTF);

        // Create buttons for adding lecturer
        addTutorBtn = new JButton("Add Tutor");
        addTutorBtn.setFont(subtitleFont);
        addTutorBtn.setBackground(Color.CYAN);
        addTutorBtn.setFocusable(false);
        addTutorBtn.setBounds(160, 500, 150, 40);
        mainTutorPanel.add(addTutorBtn);
        addTutorBtn.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        addTutor();
                    }
                });

        // Creating Title for Set Salary Panel
        salaryTitleLbl = new JLabel("Set The Salary");
        salaryTitleLbl.setFont(titleFont);
        salaryTitleLbl.setForeground(fontColor);
        salaryTitleLbl.setBounds(670, 20, 300, 35);
        mainTutorPanel.add(salaryTitleLbl);

        // Creating panel for Grade Assignment
        setSalaryPanel = new JPanel();
        mainTutorPanel.add(setSalaryPanel);
        setSalaryPanel.setLayout(new GridLayout(0, 2, 10, 12));
        setSalaryPanel.setBackground(secondbgColor);
        setSalaryPanel.setBounds(600, 80, 380, 170);
        setSalaryPanel.setBorder(BorderFactory.createLineBorder(secondbgColor, 5));

        // Create labels and text fields for Salary Panel
        SPtTeacherIdLbl = new JLabel("Teacher ID");
        SPtTeacherIdLbl.setFont(subtitleFont);
        setSalaryPanel.add(SPtTeacherIdLbl);

        SPnewSalaryLbl = new JLabel("Old Salary");
        SPnewSalaryLbl.setFont(subtitleFont);
        setSalaryPanel.add(SPnewSalaryLbl);

        SPtTeacherIdTF = new JTextField();
        SPtTeacherIdTF.setFont(subtitleFont);
        setSalaryPanel.add(SPtTeacherIdTF);

        SPnewSalaryTF = new JTextField();
        SPnewSalaryTF.setFont(subtitleFont);
        setSalaryPanel.add(SPnewSalaryTF);

        SPnewPerformanceIndexLbl = new JLabel("New Performance");
        SPnewPerformanceIndexLbl.setFont(subtitleFont);
        setSalaryPanel.add(SPnewPerformanceIndexLbl);

        // Adding an empty label for design and formating purpose
        JLabel emptyLbl = new JLabel(" ");
        setSalaryPanel.add(emptyLbl);

        SPnewPerformanceIndexTF = new JTextField();
        SPnewPerformanceIndexTF.setFont(subtitleFont);
        setSalaryPanel.add(SPnewPerformanceIndexTF);

        // Create buttons for grading assignments
        setSalaryBtn = new JButton("Set Salary");
        setSalaryBtn.setBackground(Color.CYAN);
        setSalaryBtn.setFocusable(false);
        setSalaryBtn.setFont(subtitleFont);
        setSalaryBtn.setBounds(690, 270, 170, 40);
        mainTutorPanel.add(setSalaryBtn);
        setSalaryBtn.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setSalary();
                    }
                });

        // Creating Title for Remove Tutor Panel
        removeTitleLbl = new JLabel("Remove the Tutor");
        removeTitleLbl.setFont(titleFont);
        removeTitleLbl.setForeground(fontColor);
        removeTitleLbl.setBounds(670, 335, 300, 35);
        mainTutorPanel.add(removeTitleLbl);

        // Creating panel for Remove Tutor Panel
        removePanel = new JPanel();
        mainTutorPanel.add(removePanel);
        removePanel.setLayout(new GridLayout(0, 2, 10, 12));
        removePanel.setBackground(secondbgColor);
        removePanel.setBounds(600, 375, 380, 80);
        removePanel.setBorder(BorderFactory.createLineBorder(secondbgColor, 5));
        removePanel.setVisible(true);

        // Create labels and text fields for Remove Tutor
        RPteacherID = new JLabel("Teacher ID");
        RPteacherID.setFont(subtitleFont);
        RPteacherID.setForeground(fontColor);
        RPteacherID.setBounds(210, 100, 150, 40);
        removePanel.add(RPteacherID);

        RPteacherIDTF = new JTextField();
        RPteacherIDTF.setFont(subtitleFont);
        RPteacherIDTF.setBounds(370, 100, 150, 40);
        removePanel.add(RPteacherIDTF);

        // Create button for Removing Tutor
        RPremoveBtn = new JButton("Remove");
        RPremoveBtn.setBackground(Color.CYAN);
        RPremoveBtn.setFocusable(false);
        RPremoveBtn.setFont(subtitleFont);
        RPremoveBtn.setBounds(530, 100, 150, 40);
        removePanel.add(RPremoveBtn);
        RPremoveBtn.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        removeTutor();
                    }
                });

        // Creating Display and Clear Button for Lecturer
        tDisplayBtn = new JButton("Display");
        tDisplayBtn.setBackground(secondbgColor);
        tDisplayBtn.setFocusable(false);
        tDisplayBtn.setFont(titleFont);
        tDisplayBtn.setBorder(bd);
        tDisplayBtn.setBounds(600, 480, 150, 50);
        mainTutorPanel.add(tDisplayBtn);
        tDisplayBtn.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        displayTutor();
                    }
                });

        tClearBtn = new JButton("Clear");
        tClearBtn.setBackground(secondbgColor);
        tClearBtn.setFocusable(false);
        tClearBtn.setFont(titleFont);
        tClearBtn.setBorder(bd);
        tClearBtn.setBounds(800, 480, 150, 50);
        mainTutorPanel.add(tClearBtn);
        tClearBtn.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        clearTutor();
                    }
                });

        // Create buttons(lecturerBtn & TutorBtn) for switching between lecturer and
        // tutor panels
        lecturerBtn = new JButton("Lecturer");
        lecturerBtn.setFont(titleFont);
        lecturerBtn.setBackground(backgroundColor);
        lecturerBtn.setBounds(210, 110, 170, 40);
        lecturerBtn.setFocusable(false);
        frame.add(lecturerBtn);
        lecturerBtn.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        swapablePanelLecturer();
                    }
                });

        tutorBtn = new JButton("Tutor");
        tutorBtn.setFont(titleFont);
        tutorBtn.setBounds(700, 100, 150, 40);
        tutorBtn.setFocusable(false);
        tutorBtn.setBackground(backgroundColor);
        frame.add(tutorBtn);
        tutorBtn.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        swapablePanelTutor();
                    }
                });

        // Setting the frame visibility to true at the end of GUI
        frame.setVisible(true);

    }// End of Constructor

    /*
     * It is responsible for swapping between lecturer and tutor panel.
        This method provides functionality to toggle the visibility of Lecturer 
        panels and adjust the appearance of buttons based on the current 
        visibility state of Lecturer panels.

     */
    private void swapablePanelLecturer() {
        boolean isLVisible = mainLecturerPanel.isVisible();
        boolean isTVisible = mainTutorPanel.isVisible();

        // Checking Conditions
        if (isLVisible == false && isTVisible == false) {
            mainLecturerPanel.setVisible(true);
            lecturerBtn.setBackground(Color.CYAN);
            lecturerBtn.setLocation(210, 95);
        }

        else if (isLVisible == false && isTVisible == true) {
            mainLecturerPanel.setVisible(true);
            tutorBtn.setBackground(backgroundColor);
            tutorBtn.setLocation(700, 100);
            mainTutorPanel.setVisible(false);
            lecturerBtn.setBackground(Color.CYAN);
            lecturerBtn.setLocation(210, 95);
        }

        else if (isLVisible == true) {
            mainLecturerPanel.setVisible(false);
            lecturerBtn.setBackground(backgroundColor);
            lecturerBtn.setLocation(210, 100);
        }
    }

    /*
     * It is responsible for swapping between lecturer and tutor panel.
        This method provides functionality to toggle the visibility of 
        Tutor panels and adjust the appearance of  based on the current 
        visibility state of Tutor panels.
     */
    private void swapablePanelTutor() {
        boolean isLVisible = mainLecturerPanel.isVisible();
        boolean isTVisible = mainTutorPanel.isVisible();

        // Checking Conditions
        if (isTVisible == false && isLVisible == false) {
            mainTutorPanel.setVisible(true);
            tutorBtn.setBackground(Color.CYAN);
            tutorBtn.setLocation(700, 95);
        }

        else if (isTVisible == false && isLVisible == true) {
            mainTutorPanel.setVisible(true);
            lecturerBtn.setBackground(backgroundColor);
            lecturerBtn.setLocation(210, 100);
            mainLecturerPanel.setVisible(false);
            tutorBtn.setBackground(Color.CYAN);
            tutorBtn.setLocation(700, 95);
        }

        else if (isTVisible == true) {
            mainTutorPanel.setVisible(false);
            tutorBtn.setBackground(backgroundColor);
            tutorBtn.setLocation(700, 100);
        }
    }

    // Creating a method to get text from the input box
    private String getText(JTextField textField) {
        return textField.getText().trim();
    }

    // Creating a method to ger items from the JComboBox
    private String getText(JComboBox<String> comboBox) {
        return comboBox.getSelectedItem().toString();
    }

    /* 
     * It method handles the grading process for a lecturer's assignment,
     *  ensuring valid input, confirming user intent, calculating the grade
     *  based on specified criteria, and updating relevant data. It provides 
     * feedback to the user regarding successful grading or encountered
     * errors, such as invalid input or ineligibility for grading.
    */
    private void gradeAssignment() {
        try {
            // Validate input
            String department = getText(GPdepartmentTF);
            String teacherIdText = getText(GPteacherIdTF);
            String gradedScoreText = getText(GPgradedScoreTF);
            String yearsOfExperienceText = getText(GPyearsOfExperienceTF);

            // Check for empty fields
            if (department.isEmpty() || teacherIdText.isEmpty() || gradedScoreText.isEmpty()
                    || yearsOfExperienceText.isEmpty()) {
                throw new IllegalArgumentException("Invalid input. Please fill in all fields.");
            }

            // Changing the String value to int for calculations
            int teacherId = Integer.parseInt(teacherIdText);
            int gradedScore = Integer.parseInt(gradedScoreText);
            int yearsOfExperience = Integer.parseInt(yearsOfExperienceText);
            String grade = null;

            // Check for negative values in the fields
            if (gradedScore < 0 || yearsOfExperience < 0 || teacherId < 0) {
                throw new IllegalArgumentException(
                        "Invalid input. Please enter positive values for numeric fields.\n(i.e. Graded Score, Years Of Experience & Teacher Id)");
            }

            // Find the lecturer in the teacherArrayList based on teacherId
            Lecturer lecturer = null;
            for (Teacher teacher : teacherArrayList) {
                if (teacher instanceof Lecturer && teacher.getTeacherID() == teacherId) {
                    lecturer = (Lecturer) teacher;
                    break;
                }
            }

            // If lecturer is not found in the Arraylist
            if (lecturer == null) {
                JOptionPane.showMessageDialog(null, "Lecturer not found with ID: " + teacherId, "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

            else if (yearsOfExperience >= 5 && department.equals(lecturer.getDepartment())) {
                int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to grade this assignment?",
                        "Confirmation", JOptionPane.YES_NO_OPTION);
                if (confirm != JOptionPane.YES_OPTION) {
                    return; // User canceled
                }
                if (gradedScore >= 70) {
                    grade = "A";
                }

                else if (gradedScore >= 60) {
                    grade = "B";
                }

                else if (gradedScore >= 50) {
                    grade = "C";
                }

                else if (gradedScore >= 40) {
                    grade = "D";
                }

                else {
                    grade = "F";
                }

                // updating the value of gradedScore and hasGraded to true
                lecturer.setGradedScore(gradedScore);
                JOptionPane.showMessageDialog(null, "Assignment graded successfully.\nGrade : " + grade, "Success",
                        JOptionPane.INFORMATION_MESSAGE);
            }

            else {
                JOptionPane.showMessageDialog(null,
                        "Error: Lecturer not eligible to grade assignment.\n (Years of Experience must be greater then 5 and \n Lecturer must be from same department)",
                        "Not Eligible to Grade", JOptionPane.ERROR_MESSAGE);
            }
        }

        catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error: Invalid input. Please enter numeric values for numeric fields.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }

        catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /*
     * It checks if a lecturer with a specified teacher ID exists in the teacherArrayList. If found, it returns true; otherwise, it returns false.
     */
    private boolean isLecturerExists(int teacherId) {
        for (Teacher teacher : teacherArrayList) {
            if (teacher instanceof Lecturer && teacher.getTeacherID() == teacherId) {
                return true; // Lecturer with the given teacherId exists
            }
        }
        return false; // Lecturer with the given teacherId does not exist
    }

    /*
     * The addLeturer method adds a new lecturer to the system with the provided details.
     *  It retrieves input values such as teacher ID, name, address, working type, employment
     *  status, department, and years of experience. After validating the input, it confirms
     *  the addition with a dialog box and proceeds to create a new Lecturer object if the 
     * lecturer does not already exist. Finally, it adds the new lecturer to the ArrayList and 
     * displays a success message.
     */
    private void addLeturer() {
        try {
            // Retrieve input values
            String teacherIdText = getText(lTeacherIdTF);
            String teacherName = getText(lTeacherNameTF);
            String teacherAddress = getText(lTeacherAddressTF);
            String workingTypes = getText(lWorkingType);
            String employmentStatus = getText(employmentStatusTF);
            String department = getText(departmentTF);
            String yearsOfExperienceText = getText(yearsOfExperienceTF);

            // Validate input
            if (teacherIdText.isEmpty() || teacherName.isEmpty() || teacherAddress.isEmpty() || workingTypes.isEmpty()
                    || employmentStatus.isEmpty() || department.isEmpty() || yearsOfExperienceText.isEmpty()) {
                throw new IllegalArgumentException("Please fill all the fields.");
            }

            int teacherId = Integer.parseInt(teacherIdText);
            int yearsOfExperience = Integer.parseInt(yearsOfExperienceText);

            if (isLecturerExists(teacherId)) {
                JOptionPane.showMessageDialog(null, "The Lecturer Already Exists", "Error", JOptionPane.ERROR_MESSAGE);
            }

            else if (teacherId <= 0 || yearsOfExperience < 0) {
                throw new IllegalArgumentException("Invalid input. Please enter positive values for numeric fields.");
            }

            else {
                int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to add the lecture?",
                        "Confirmation", JOptionPane.YES_NO_OPTION);
                if (confirm != JOptionPane.YES_OPTION) {
                    return; // User canceled
                }
                // Create a new Lecturer object
                Lecturer newLecturer = new Lecturer(teacherId, teacherName, teacherAddress, workingTypes,
                        employmentStatus, department, yearsOfExperience);
                // newLecturer.setGradedScore(gradedScore); // Set the graded score

                // Add the new Lecturer object to the ArrayList
                teacherArrayList.add(newLecturer); // Assuming teacherArrayList is your ArrayList<Teacher>

                // Display confirmation message
                JOptionPane.showMessageDialog(null, "Lecturer added successfully.", "Success",
                        JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (NumberFormatException ex) {
            // Handle NumberFormatException
            JOptionPane.showMessageDialog(null, "Error: Invalid input. Please enter numeric values for numeric fields.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException ex) {
            // Handle NullPointerException
            JOptionPane.showMessageDialog(null, "Error: Please select a working type.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException ex) {
            // Handle IllegalArgumentException
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
/*
 * The displayLecturer method retrieves information about all lecturers
 *  stored in the system and displays it. It creates a separate new frame with
 *  label “Lecturer Information”, and a text area with scroll pane. For each lecturer
 *  found, it appends their details such as ID, name, address, working type, employment 
 * status, department, years of experience, and graded score to the Text Area. After looping 
 * through all lecturers, it checks if any were found. If none were found, it displays a message
 *  indicating so. Otherwise, it displays the accumulated information in a dialog box.
 */
    private void displayLecturer() {
        // Create the frame
        JFrame lecturerDisplayFrame = new JFrame("Display Lecturer Frame");
        lecturerDisplayFrame.setSize(500, 600); // Set frame size
        lecturerDisplayFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close only this window on exit
        lecturerDisplayFrame.setLayout(null); // Use absolute positioning
        lecturerDisplayFrame.setLocationRelativeTo(null); // Center the frame on the screen
        lecturerDisplayFrame.getContentPane().setBackground(secondbgColor);

        // Create a JLabel for the title
        JLabel displayLecturertitleLabel = new JLabel("    Lecturer Information");
        displayLecturertitleLabel.setFont(titleFont);
        displayLecturertitleLabel.setBounds(60, 10, 300, 33); // Set bounds (x, y, width, height)
        lecturerDisplayFrame.add(displayLecturertitleLabel); // Add the label to the frame
        displayLecturertitleLabel.setBorder(BorderFactory.createLineBorder(backgroundColor, 4));

        // Create a JTextArea to display lecturer information
        JTextArea lecturerTextArea = new JTextArea();
        lecturerTextArea.setFont(subtitleFont);
        lecturerTextArea.setEditable(false); // Set text area as read-only
        lecturerTextArea.setLineWrap(true); // Enable line wrapping
        lecturerTextArea.setWrapStyleWord(true); // Wrap at word boundaries

        // Loop through the teacherArrayList to find lecturers
        boolean foundLecturers = false;
        for (Teacher teacher : teacherArrayList) {
            if (teacher instanceof Lecturer) {
                foundLecturers = true;
                Lecturer lecturer = (Lecturer) teacher;
                // Append lecturer information to the JTextArea
                lecturerTextArea.append("Teacher ID: " + lecturer.getTeacherID() + "\n");
                lecturerTextArea.append("Teacher Name: " + lecturer.getTeacherName() + "\n");
                lecturerTextArea.append("Teacher Address: " + lecturer.getAddress() + "\n");
                lecturerTextArea.append("Working Type: " + lecturer.getWorkingType() + "\n");
                lecturerTextArea.append("Employment Status: " + lecturer.getEmploymentStatus() + "\n");
                lecturerTextArea.append("Department: " + lecturer.getDepartment() + "\n");
                lecturerTextArea.append("Years of Experience: " + lecturer.getYearsOfExperience() + "\n");
                lecturerTextArea.append("Graded Score: " + lecturer.getGradedScore() + "\n\n");
            }
        }

        // If no lecturers were found, display "No lecturers found"
        if (!foundLecturers) {
            lecturerTextArea.setText("No lecturers found.");
        }

        // Add the JTextArea to a JScrollPane and add it to the frame
        JScrollPane scrollPane = new JScrollPane(lecturerTextArea);
        scrollPane.setBounds(50, 50, 400, 500); // Set bounds (x, y, width, height)
        lecturerDisplayFrame.add(scrollPane); // Add the scroll pane to the frame

        // Make the frame visible
        lecturerDisplayFrame.setVisible(true);
    }

    /*The clearLecturer method clears all input fields related to adding and grading lecturers.  */
    private void clearLecturer() {
        // Clear all text fields
        lTeacherIdTF.setText("");
        lTeacherNameTF.setText("");
        lTeacherAddressTF.setText("");
        employmentStatusTF.setText("");
        departmentTF.setText("");
        yearsOfExperienceTF.setText("");

        // Set the working type combo box to its default selection
        lWorkingType.setSelectedIndex(0);

        GPgradedScoreTF.setText("");
        GPdepartmentTF.setText("");
        GPteacherIdTF.setText("");
        GPyearsOfExperienceTF.setText("");

    }

    /*
     * It checks if a Tutor with a specified teacher ID exists in the teacherArrayList. 
     * If found, it returns true; otherwise, it returns false.
     */
    private boolean isTutorExists(int teacherId) {
        for (Teacher teacher : teacherArrayList) {
            if (teacher instanceof Tutor && teacher.getTeacherID() == teacherId) {
                return true; // Tutor with the given teacherId exists
            }
        }
        return false; // Tutor with the given teacherId does not exist
    }

    /*
     * The addTutor method adds a new tutor to the system. 
     * It collects input values like teacher ID, name, address, 
     * working type, employment status, working hours, salary, 
     * specialization, academic qualifications, and performance 
     * index. After validating the input, it confirms the addition
     * through a dialog box. If the user confirms, it proceeds to 
     * create a new Tutor object. If the tutor already exists or if 
     * any input fields contain invalid values, appropriate error 
     * messages are displayed.
     */
    private void addTutor() {
        try {
            // Retrieve input values
            String teacherIdText = getText(tTeacherIdTF);
            String teacherName = getText(tTeacherNameTF);
            String teacherAddress = getText(tTeacherAddressTF);
            String workingType = (String) getText(tWorkingType);
            String employmentStatus = getText(tEmploymentStatusTF);
            String workingHoursText = getText(tWorkingHoursTF);
            String salaryText = getText(salaryTF);
            String specialization = getText(specializationTF);
            String academicQualifications = getText(academicQualificationTF);
            String performanceIndexText = getText(performanceIndexTF);

            // Validate input
            if (teacherIdText.isEmpty() || teacherName.isEmpty() || teacherAddress.isEmpty() || workingType.isEmpty()
                    || employmentStatus.isEmpty() || workingHoursText.isEmpty() || salaryText.isEmpty()
                    || specialization.isEmpty() || academicQualifications.isEmpty() || performanceIndexText.isEmpty()) {
                throw new IllegalArgumentException("Please fill all the fields.");
            }

            int teacherId = Integer.parseInt(teacherIdText);
            int workingHours = Integer.parseInt(workingHoursText);
            double salary = Double.parseDouble(salaryText);
            int performanceIndex = Integer.parseInt(performanceIndexText);

            if (isTutorExists(teacherId)) {
                JOptionPane.showMessageDialog(null, "The Tutor Already Exists", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (teacherId <= 0 || workingHours < 0 || salary <= 0 || performanceIndex <= 0) {
                throw new IllegalArgumentException(
                        "Invalid input. Please enter positive values for numeric fields\n(.ie. Teacher Id, Working Hours, Salary, Performance Index");
            } else {
                int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to add the Tutor?",
                        "Confirmation",
                        JOptionPane.YES_NO_OPTION);
                if (confirm != JOptionPane.YES_OPTION) {
                    return; // User canceled
                }
                // Create a new Tutor object
                Tutor newTutor = new Tutor(teacherId, teacherName, teacherAddress, workingType, employmentStatus,
                        workingHours, salary, academicQualifications, performanceIndex, specialization);

                // Add the new Tutor object to the ArrayList
                teacherArrayList.add(newTutor);

                // Display confirmation message
                JOptionPane.showMessageDialog(null, "Tutor added successfully.", "Success",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            // Handle NumberFormatException
            JOptionPane.showMessageDialog(null, "Error: Invalid input. Please enter numeric values for numeric fields.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException ex) {
            // Handle IllegalArgumentException
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /*
     * The setSalary method allows the user to update the salary of a tutor based on 
     * their performance index and working hours. It prompts the user to enter the tutor's
     *  ID, the current salary, and the new performance index. After validation, it confirms 
     * the action with a dialog box. If confirmed, it retrieves the tutor from the teacherArrayList, 
     * checks eligibility based on performance and working hours, then updates the salary 
     * accordingly. If the tutor is not found or if the conditions for salary approval are not met, 
     * appropriate error messages are displayed.
     */
    private void setSalary() {
        try {
            String teacherIdText = getText(SPtTeacherIdTF);
            String oldSalaryText = getText(SPnewSalaryTF);
            String newPerformanceIndexText = getText(SPnewPerformanceIndexTF);

            // Validate input
            if (teacherIdText.isEmpty() || oldSalaryText.isEmpty() || newPerformanceIndexText.isEmpty()) {
                throw new IllegalArgumentException("Please fill all the fields.");
            }

            int teacherId = Integer.parseInt(teacherIdText);
            double oldSalary = Double.parseDouble(oldSalaryText);
            int newPerformanceIndex = Integer.parseInt(newPerformanceIndexText);

            if (teacherId <= 0 || oldSalary < 0 || newPerformanceIndex < 0) {
                throw new IllegalArgumentException(
                        "Invalid input. Please enter positive values for numeric fields\n(.ie. Teacher Id, Salary, Performance Index");
            }
            // Find the tutor in the teacherArrayList based on teacherId
            Tutor tutor = null;
            for (Teacher teacher : teacherArrayList) {
                if (teacher instanceof Tutor && teacher.getTeacherID() == teacherId) {
                    tutor = (Tutor) teacher;
                    break;
                }
            }

            if (tutor == null) {
                JOptionPane.showMessageDialog(null, "Tutor not found with ID: " + teacherId, "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else if (newPerformanceIndex > 5 && tutor.getWorkingHours() > 20) {
                // Asking for confirmation
                int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to set the salary?",
                        "Confirmation", JOptionPane.YES_NO_OPTION);
                if (confirm != JOptionPane.YES_OPTION) {
                    return; // User canceled
                }
                // Setting the salary
                tutor.setSalary(oldSalary, newPerformanceIndex);
                double salary = tutor.getSalary();
                JOptionPane.showMessageDialog(null, "Salary set successfully.\nNew Salary : " + salary, "Success",
                        JOptionPane.INFORMATION_MESSAGE);

                SPnewSalaryTF.setText(Double.toString(salary));
                salaryTF.setText(Double.toString(salary));
            } else {
                JOptionPane.showMessageDialog(null,
                        "Error: The tutor is not eligible for salary approval \n(Working hours must be Greater then 20\n and Perfomance Index must be Greatet then 5)",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null,
                    "Error: Invalid input. Please enter numeric values for salary and performance index.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /*
     * The removeTutor method allows the user to delete a tutor from the system using their teacher ID. 
     * It prompts the user to enter the teacher ID and confirms the action with a dialog box. 
     * After validation, it searches for the tutor in the teacherArrayList based on the provided ID.
     *  If found, it removes the tutor from the list. If not found, it displays an error message 
     * indicating that the tutor was not found. If any errors occur during the process, 
     * such as invalid input or the absence of the tutor, appropriate error messages 
     * are displayed to the user.
     */
    private void removeTutor() {
        try {
            String teacherIdText = RPteacherIDTF.getText();

            // Validate input
            if (teacherIdText.isEmpty()) {
                throw new IllegalArgumentException("Please enter the teacher ID.");
            }

            int teacherId = Integer.parseInt(teacherIdText);

            boolean tutorFound = false;
            boolean isRemoved = false;

            // Find the tutor in the teacherArrayList based on teacherId
            for (Teacher teacher : teacherArrayList) {
                if (teacher instanceof Tutor && teacher.getTeacherID() == teacherId) {
                    // Confirming
                    int confirm = JOptionPane.showConfirmDialog(null,
                            "Are you sure you want to remove this Tutor?\nTutor Name:" + teacher.getTeacherName(),
                            "Confirmation", JOptionPane.YES_NO_OPTION);
                    if (confirm != JOptionPane.YES_OPTION) {
                        return; // User canceled
                    }
                    // Remove the tutor from the list
                    // teacherArrayList.remove(teacher);
                    Tutor tutor = (Tutor) teacher;
                    if (tutor.getIsCertified() == false) {
                        tutor.removeTutor();
                        isRemoved = true;
                    }
                    tutorFound = true;
                    break; // Stop searching once the tutor is found and removed
                }
            }

            if (tutorFound) {
                if (isRemoved) {
                    JOptionPane.showMessageDialog(null, "Tutor removed successfully.", "Success",
                            JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Certified Tutor can not be removed", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Tutor not found with ID: " + teacherId, "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error: Invalid input. Please enter a valid numeric teacher ID.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    /*
     * The displayTutor method retrieves information about all lecturers stored in the system 
     * and displays it. It creates a separate new frame with label “Lecturer Information”, 
     * and a text area with scroll pane. It checks each item in the teacherArrayList and 
     * adds details like ID, name, address, working type, employment status, working hours, salary, specialization, academic qualifications, and performance index to a summary. If no tutors are found, it displays a message saying so; otherwise, it shows the summary in a dialog box.
     */
    private void displayTutor() {
        // Create the frame
        JFrame tutorDisplayFrame = new JFrame("Display Tutor Frame");
        tutorDisplayFrame.setSize(500, 600); // Set frame size
        tutorDisplayFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close only this window on exit
        tutorDisplayFrame.setLayout(null); // Use absolute positioning
        tutorDisplayFrame.setLocationRelativeTo(null); // Center the frame on the screen
        tutorDisplayFrame.getContentPane().setBackground(secondbgColor);

        // Create a JLabel for the title
        JLabel titleLabel = new JLabel("Tutor Information");
        titleLabel.setFont(titleFont);
        titleLabel.setBounds(60, 10, 300, 33); // Set bounds (x, y, width, height)
        tutorDisplayFrame.add(titleLabel); // Add the label to the frame
        titleLabel.setBorder(BorderFactory.createLineBorder(backgroundColor, 4));

        // Create a JTextArea to display tutor information
        JTextArea tutorTextArea = new JTextArea();
        tutorTextArea.setFont(subtitleFont);
        tutorTextArea.setEditable(false); // Set text area as read-only
        tutorTextArea.setLineWrap(true); // Enable line wrapping
        tutorTextArea.setWrapStyleWord(true); // Wrap at word boundaries

        // Loop through the teacherArrayList to find tutors
        boolean foundTutors = false;
        for (Teacher teacher : teacherArrayList) {
            if (teacher instanceof Tutor) {
                foundTutors = true;
                Tutor tutor = (Tutor) teacher;
                // Append tutor information to the JTextArea
                tutorTextArea.append("Teacher ID: " + tutor.getTeacherID() + "\n");
                tutorTextArea.append("Teacher Name: " + tutor.getTeacherName() + "\n");
                tutorTextArea.append("Teacher Address: " + tutor.getAddress() + "\n");
                tutorTextArea.append("Working Type: " + tutor.getWorkingType() + "\n");
                tutorTextArea.append("Employment Status: " + tutor.getEmploymentStatus() + "\n");
                tutorTextArea.append("Working Hours: " + tutor.getWorkingHours() + "\n");
                tutorTextArea.append("Salary: " + tutor.getSalary() + "\n");
                tutorTextArea.append("Specialization: " + tutor.getSpecialization() + "\n");
                tutorTextArea.append("Academic Qualifications: " + tutor.getAcademicQualifications() + "\n");
                tutorTextArea.append("Performance Index: " + tutor.getPerformanceIndex() + "\n\n");
            }
        }

        // If no tutors were found, display "No tutors found"
        if (!foundTutors) {
            tutorTextArea.setText("No tutors found.");
        }

        // Add the JTextArea to a JScrollPane and add it to the frame
        JScrollPane scrollPane = new JScrollPane(tutorTextArea);
        scrollPane.setBounds(50, 50, 400, 500); // Set bounds (x, y, width, height)
        tutorDisplayFrame.add(scrollPane); // Add the scroll pane to the frame

        // Make the frame visible
        tutorDisplayFrame.setVisible(true);
    }

    /*
     * The clearTutor method clears all input fields related to adding 
     * and grading lecturers.
     */
    private void clearTutor() {
        // Clear all text fields
        tTeacherIdTF.setText("");
        tTeacherNameTF.setText("");
        tTeacherAddressTF.setText("");
        tEmploymentStatusTF.setText("");
        salaryTF.setText("");
        specializationTF.setText("");
        academicQualificationTF.setText("");
        tWorkingHoursTF.setText("");
        performanceIndexTF.setText("");

        // Set the working type combo box to its default selection
        tWorkingType.setSelectedIndex(0);

        SPtTeacherIdTF.setText("");
        SPnewSalaryTF.setText("");
        SPnewPerformanceIndexTF.setText("");
        RPteacherIDTF.setText("");
    }

    /*
     * This method creates a help panel window for the Teacher Management System.
     */
    private void helpPannel() {
        // Create a JFrame for the help window
        JFrame helpFrame = new JFrame("Help - Teacher Management System");
        helpFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        helpFrame.setSize(600, 800);
        helpFrame.setLocationRelativeTo(null);

        // Create a JTextArea to display help content
        JTextArea helpTextArea = new JTextArea();
        helpTextArea.setEditable(false);
        helpTextArea.setLineWrap(true);
        helpTextArea.setWrapStyleWord(true);

        // Create JScrollPane to enable scrolling
        JScrollPane scrollPane = new JScrollPane(helpTextArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // Define your help content here
        String helpContent = "-----------------------------------------------------------\n" +
                "                       Help - Teacher Management System\n" +
                "-----------------------------------------------------------\n\n" +
                "*  Overview:\n" +
                "This program allows you to manage Lecturers & Tutors, and display information, Grade assignments for Lecturers, Set salary and Remove for Tutors.\n\n"
                +
                "*  Instructions:\n" +
                "1. To add a new lecturer or Tutor, click on the \"Lecturer\" or \"Tutor\"           button to open their respective pannels and fill the Registration form\n"
                +
                "2. To grade an assignment, enter the relevant details and click on the          \"Grade Assignment\" button.\n"
                +
                "3. To set salary of tutor, enter the relevant details and click on the           \"Set Salary\" button.\n"
                +
                "4. To remove a Tutor, enter the Teacher Id of tutor and click on the          \"Remove\" button.\n" +
                "5. To display information about tutors or lecturers, click on the \"Display\"       button on Tutor and Lecturers pannel respectively.\n\n"
                +
                "*  Version Information:\n" +
                "Teacher Management System - Version 1.0 (January 2024)\n\n" +
                "*  FAQs:\n" +
                "Q: Can I undo a grading action?\n" +
                "A: No, grading actions cannot be undone. Please double-check the information before grading an assignment and clicking Yes on Confirmation Dialogue Box.\n"
                +
                "-----------------------------------------------------------";

        // Set the help content into the JTextArea
        helpTextArea.setText(helpContent);
        helpTextArea.setFont(subtitleFont);

        // Add the JScrollPane to the JFrame
        helpFrame.getContentPane().add(scrollPane, BorderLayout.CENTER);

        // Make the help frame visible
        helpFrame.setVisible(true);
    }

    
    //Main method
    public static void main(String[] args) {
        new GUI();
    }
}   