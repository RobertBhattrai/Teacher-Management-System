/**
 * This is Teacher class which is used to store the details of teacher
 * and display the details of teacher.
 * 
 * author@ Safal Bhattarai
 * ID: 23049395
 * College ID : np05cp4a230039
 */
//Creating Class
public class Teacher
{
    //Six Attributes of Teacher
    //Declearing Instance Variable
    private int teacherID;
    private int workingHours;
    private String teacherName;
    private String address;
    private String workingType;
    private String employmentStatus;
    //Constructor.
    //Allowing to pass 5 parameters in parenthesis.
    public Teacher(int teacherID, String teacherName, String address, String workingType, String employmentStatus)
    {
        this.teacherID = teacherID;
        this.teacherName = teacherName;
        this.address = address;
        this.workingType = workingType;
        this.employmentStatus = employmentStatus;
        this.workingHours = 0; // Initial value is set to null
    } 
    //Accessor Method
    //for accessing teacherID we created this method: getTeacherID()
    public int getTeacherID()
    {
        return teacherID;
    }
    //for accessing teacherName we created this method: getTeacherName()
    public String getTeacherName() 
    {
        return teacherName;
    }
    //for accessing address we created this method: getAddress()
    public String getAddress() 
    {
        return address;
    }
    //for accessing workingType we created this method: getWorkingType()
    public String getWorkingType() 
    {
        return workingType;
    }
    //for accessing employmentStatus we created this method: getEmploymentStatus()
    public String getEmploymentStatus() 
    {
        return employmentStatus;
    }
    //for accessing WorkingHours we created this method: getWorkingHours()
    public int getWorkingHours() 
    {
        return workingHours;
    }
    //Creating a method to set working hours
    public void setWorkingHours(int workingHours) 
    {
        this.workingHours = workingHours;
    }
    //Creating a method to display Teacher Info
    public void displayTeacherInfo() 
    {
        System.out.println("Teacher ID: " + getTeacherID());
        System.out.println("Teacher Name: " + getTeacherName());
        System.out.println("Address: " +getAddress());
        System.out.println("Working Type: " + getWorkingType());
        System.out.println("Employment Status: " + getEmploymentStatus());
        //checking to see if workingHours is assigned or not
        if (workingHours < 0) 
        {
            System.out.println("Working Hours: Not assigned");
        }
        else 
        {
            System.out.println("Working Hours: " + getWorkingHours());
        }
    }
}
