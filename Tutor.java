/**
 * This is Tutor class which is used to store the details of Tutor, 
 * and used to remove the tutor, and set new salary according to performance
 * index and working hours and display the details of Tutor
 * 
 * author@ Safal Bhattarai
 * ID: 23049395 
 * College ID : np05cp4a230039
 */
public class Tutor extends Teacher
{
    //Five Attributes of Tutor
    private double salary;
    private String specialization;
    private String academicQualifications;
    private int performanceIndex;
    private boolean isCertified;
    //Creating a Constructor for tutor
    public Tutor (int teacherID, String teacherName, String address, String workingType,
    String employmentStatus, int workingHours, double salary, String academicQualifications, 
    int performanceIndex, String specialization)
    {
        //calling superclass constructor
        super(teacherID, teacherName, address, workingType, employmentStatus);
        //calling superclass setter method for workingHours
        super.setWorkingHours(workingHours);
        this.salary = salary;
        this.specialization = specialization;
        this.academicQualifications = academicQualifications;
        this.performanceIndex = performanceIndex;
        this.isCertified = false; //Initializing isCertified to false.
    }
    //Accesor Method for salary
      public double getSalary() 
    {
        return salary;
    }
    //for accessing specialization we created this method: getSpecialization()
    public String getSpecialization()
    {
        return specialization;
    }
    //for accessing academicQualification we created this method: getAcademicQualification()
    public String getAcademicQualifications() 
    {
        return academicQualifications;
    }
    //for accessing performanceIndex we created this method: getPerformanceIndex() 
    public int getPerformanceIndex() 
    {
        return performanceIndex;
    }
    //for accessing isCertified we created this method: getIsCertified()
    public boolean getIsCertified() 
    {
        return isCertified;
    }
    //Creating a method setSalary to set the tutor salary.
    public void setSalary(double Salary, int newPerformanceIndex) 
    {
        double appraisal = 0.0; //declaring local variable to store appraisal value
        if(newPerformanceIndex > 5 && getWorkingHours() > 20)
        {
            if (newPerformanceIndex >= 5 && newPerformanceIndex <= 7)
            {
                appraisal = 0.05;
            }
            else if(newPerformanceIndex >= 8 && newPerformanceIndex <= 9)
            {
                appraisal = 0.1;
            }
            else if(newPerformanceIndex >= 10)
            {
                appraisal = 0.2;
            }
            Salary = salary + appraisal * salary;
            this.salary = Salary;
            this.isCertified = true;
        }
        else
        {
            System.out.println("The tutor is not eligible for salary approval");
        }
    }
    //Creating a method called removeTutor to remove the data in tutor. 
    public void removeTutor() 
    {
        //checking if tutor is certified or not.
        if (isCertified) 
        {
            System.out.println("Tutor cannot be removed. Tutor is certified.");
        } 
        else 
        {
            salary = 0;
            specialization = null;
            academicQualifications = null;
            performanceIndex = 0;
            isCertified = false;
            System.out.println("Tutor removed.");
        }
    }
    //Creating a method to display Tutor information.
    public void display() 
    {
        //checking if tutor is certified
        if (isCertified)
        {
            super.displayTeacherInfo();
            System.out.println("Salary: " + getSalary());
            System.out.println("Specialization: " + getSpecialization());
            System.out.println("Academic Qualifications: " + getAcademicQualifications());
            System.out.println("Performance Index: " + getPerformanceIndex());
        }
        else 
        {
            super.displayTeacherInfo();
        }
    }
}
