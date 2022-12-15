package Student_Portal;
import java.util.*;

import java.util.ArrayList;

public class Function {

    ArrayList<Student> student_ = new ArrayList<>();

    public void login(){
        System.out.println("Login Successfully");
    }
    public void CreateAccount(Student S){
        student_.add(S);

        System.out.println("Create account successfully");
        System.out.println("\n");
    }

    public void CreateAccount(String n , String i , String p , String d){
        Department D = new Department(n, i, p , d) {
        };
        CreateAccount(D);
    }

    public Student find(String id,String password){
        for (Student x : student_){
            if(x.getId().equals(id)&& x.getPassword().equals(password)) {
                return x;
            }
        }
        System.out.println("Invalid Id or Password!");
        System.out.println("\n");
        return null;
    }

    public String getDept(String id , String password){
        Student x = find(id,password);
        if(x!=null){
            return x.getDept();
        }
        return null;
    }

//    public String getDept(String id ){
//        Student x = find(id);
//        if(x!=null){
//            return x.getDept();
//        }
//        return null;
//    }

    public void display(){
        for(Student x : student_){
            x.display();
        }
    }


    public void DashboardDisplay(){
        System.out.println("Total Payable:Tk301,900.00\n"+
                "Total Paid:Tk 297,630.03\n"+"Total Due: Tk 4,269.97\n"+"Total Others:Tk 750.00");
    }
    public void ProfileDisplay(){
        System.out.println("First Name    :    ADNAN BIN HOSSEN\n"+
                            "Nick Name     :    Adnan\n"+
                            "Date of Birth :    2001-12-07+\n" +
                            "Place of Birth:    Noakhali\n"+
                            "Gender        :    Male\n"+
                            "Blood Group   :    A+\n"+
                            "Religion      :    Islam\n"+
                            "Nationality   :    Bangladeshi\n"+
                            "National ID   :    20011517017024442");
    }
    public void PaymentSchemeDisplay(){
        System.out.println("Payment Name         \t\t\t\t\t\t\tAmount      \t\tMultiple\n\n" +
                "Admission Fee                               \t7500        \tAdmission time\n" +
                "Campus Development Fee                      \t6750        \tEvery semester\n" +
                "Extra Curriculam Fee                        \t2250        \tEvery semester\n" +
                "Lab Fee                                     \t3000        \tEvery semester\n" +
                "Library Fee                                 \t3000        \tAdmission time\n" +
                "Rover Scout & BNCC Fee                      \t1000        \tAdmission time\n" +
                "Semester Fee                                \t8250        \tEvery semester\n" +
                "Student Life Insurance                      \t4000        \tAdmission time\n" +
                "Smart Card                                  \t1000        \tAdmission time\n" +
                "Tuition Fee ( Core )                        \t4900        \tEvery semester\n" +
                "Tuition Fee ( Core Lab )                    \t5000        \tEvery semester\n" +
                "Tuition Fee ( Core With Lab for 1 Credit )  \t4950        \tEvery semester\n" +
                "Tuition Fee ( Core With Lab for 2 Credit )  \t4967        \tEvery semester\n" +
                "Tuition Fee ( Core With Lab for 3 Credit )  \t4934        \tEvery semester\n" +
                "Tuition Fee ( Core With Lab for 4 Credit )  \t4925        \tEvery semester\n" +
                "Tuition Fee ( General Course )              \t3200        \tEvery semester\n" +
                "Tuition Fee ( GED Lab )                     \t5000        \tEvery semester\n" +
                "Tuition Fee ( Lab )                         \t5000        \tEvery semester\n" +
                "Tuition Fee ( Non Core )                    \t4900        \tEvery semester\n" +
                "Tuition Fee ( Project/Thesis/Internship )   \t3200        \tEvery semester");
    }
    public void RegistrationExamClearanceDisplay(){
        System.out.println("Semester\t\tRegistration\tMid Term Exam\tFinal Exam/Assessment\n" +
                "Fall, 2021\t\t\t <Yes>          <Yes>            <Yes>\n" +
                "Spring, 2022\t\t <Yes>          <Yes>            <Yes>\n" +
                "Summer, 2022\t\t <Yes>          <Yes>            <Yes>\n" +
                "Fall, 2022\t\t\t <Yes>          <Yes>            <No>");
    }

    public void RegisteredCourseDisplay(){
        System.out.println("1.Fall 2021\n"+
                           "2.Spring, 2022\n"+
                           "3.Summer, 2022\n"+
                           "4.Fall, 2022\n"+
                           "0.Exit\n");
    }
    public void AcademicResultCourseDisplay(){
        System.out.println("1.Fall 2021)\n" +
                           "2.Spring 2022)\n" +
                           "3.Summer 2022)\n" +
                           "4.Fall 2022\n"+
                           "0.Exit\n");
    }
}
