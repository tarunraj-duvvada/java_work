package second;

public class studentDetails_5 {
    public static void main(String[] args) {
        studentLms5 Student_1 = new studentLms5();
         Student_1.student_name = "tarun raj";
         Student_1.student_Mobilenumber = 9110586439l;
         Student_1.age_Ofstudent = 21;
         Student_1.course_Enrolled = "java fullstack";
         
        studentLms5 Student_2 = new studentLms5();
         Student_2.student_name = "sai";
         Student_2.student_Mobilenumber = 9848672320l;
         Student_2.age_Ofstudent = 20;
         Student_2.course_Enrolled = "python fullstack";
        
         Student_1.Display_student_class();
         System.out.println("===================================================");
         Student_2.Display_student_class();
    }


    
}
