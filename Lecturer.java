/**
 * This is Lectuer class which is used to store the details of Lecturer, 
 * display the details of Lecturer and grade the assignment.
 * author@ Safal Bhattarai
 * ID: 23049395 
 * College ID : np05cp4a230039
 */
//Creating lecturer class which inherites from Teacher
public class Lecturer extends Teacher
{
   //Four Attributes of Lecturer 
   private String department;
   private int yearsOfExperience;
   private int gradedScore;
   private boolean hasGraded;
   //Constructor.
   //Allowing to pass 7 parameters in parenthesis.
   public Lecturer(int teacherID, String teacherName, String address, String workingType, String employmentStatus,
   String department, int yearsOfExperience)
   {
       //Calling superclass constructor
       super(teacherID, teacherName, address, workingType, employmentStatus);
       this.department = department;
       this.yearsOfExperience = yearsOfExperience;
       this.hasGraded = false; //Initializing hasGraded to false
   }
      //setter method for gradedScore
   public void setGradedScore(int gradedScore)
   {
       this.gradedScore = gradedScore;
   }
   //Accessor method
   //for accessing gradedScore we created this method: getGradedScore()
   public int getGradedScore()
   {
       return gradedScore;
   }
   //for accessing department we created this method: getDepartment()
   public String getDepartment()
   {
       return department;
   }
   //for accessing yearsOfExperience we created this method: getYearsOfExperience()
   public int getYearsOfExperience()
   {
       return yearsOfExperience;
   }
   //for accessing hasGraded we created this method: getHasGraded()
   public boolean getHasGraded()
   {
       return hasGraded;
   }
   //Creating a method called gradeAssignment to Grade the score.
   //Allowing to pass three parameter in paranthesis
   public void gradeAssignment(int gradedScore, String department, int yearsOfExperience)
   {
      //Checking if yearsOfExperience is greater then 5 and has same department
      if (yearsOfExperience >=5 && department.equals(getDepartment())) 
      {
            if (gradedScore >= 70) 
            {
                System.out.println("Grade: A");
            } 
            else if (gradedScore >= 60) 
            {
                System.out.println("Grade: B");
            } 
            else if (gradedScore >= 50) 
            {
                System.out.println("Grade: C");
            } 
            else if (gradedScore >=40) 
            {
                System.out.println("Grade: D");
            } else 
            {
                System.out.println("Grade: E");
            }
            //updating the value of gradedScore and hasGraded to true
            this.gradedScore = gradedScore;
            hasGraded = true;
      } 
      else 
      {
            System.out.println("Lecturer not eligible to grade assignment.");
      } 
   }
   //Creating a method to display Lecturer information
   public void display() 
   {
        super.displayTeacherInfo(); // Call the display method in the Teacher class
        System.out.println("Department: " + getDepartment());
        System.out.println("Years of Experience: " + getYearsOfExperience());
        //checking if lecture has graded score.
        if (hasGraded = true) 
        {
            System.out.println("Graded Score: " + getGradedScore());
        } 
        else 
        {
            System.out.println("Score has not been graded yet.");
        }
   }
}
