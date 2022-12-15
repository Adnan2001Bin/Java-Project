package Student_Portal;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Function F = new Function();
        UserInterface UI = new UserInterface();
        Registered_Course RC = new Registered_Course();

        while (true) {

            UI.option();
            int option = scan.nextInt();
            if (option == 1) {
                scan.nextLine();
                System.out.println("Enter Student ID* and Password*");
                String ID = scan.nextLine();
                String Password = scan.nextLine();

                Student Find = F.find(ID,Password);
                if (Find != null) {
                    F.login();
                    while (true) {
                        System.out.println("\n");

                        F.display();
                        UI.Option_1();
                        int option_1 = scan.nextInt();
                        if (option_1 == 1) {
                            F.DashboardDisplay();
                        } else if (option_1 == 1) {
                            F.ProfileDisplay();
                        } else if (option_1 == 2) {
                            F.ProfileDisplay();
                        } else if (option_1 == 3) {
                            F.PaymentSchemeDisplay();
                        } else if (option_1 == 4) {
                            F.RegistrationExamClearanceDisplay();
                        } else if (option_1 == 5) {
                            while (true) {
                                F.RegisteredCourseDisplay();
                                int RegisteredCourseDisplay = scan.nextInt();
                                if (RegisteredCourseDisplay == 1) {
                                    RC.registeredCourseFall_2021();
                                } else if (RegisteredCourseDisplay == 2) {
                                    RC.registeredCourseSpring_2022();
                                } else if (RegisteredCourseDisplay == 3) {
                                    RC.registeredCourseSummer_2022();
                                } else if (RegisteredCourseDisplay == 4) {
                                    RC.registeredCourseFall_2022();
                                } else if (RegisteredCourseDisplay == 0) {
                                    break;
                                }
                            }
                        } else if (option_1 == 6) {
                            while (true) {
                                F.AcademicResultCourseDisplay();
                                int AcademicResult_op = scan.nextInt();
                                if (AcademicResult_op == 1) {
                                    System.out.println("CGPA : 3.25");
                                } else if (AcademicResult_op == 2) {
                                    System.out.println("CGPA : 3.35");
                                } else if (AcademicResult_op == 3) {
                                    System.out.println("CGPA : 3.50");
                                } else if (AcademicResult_op == 4) {
                                    System.out.println("CGPA : 3.55");
                                } else if (AcademicResult_op == 0) {
                                    break;
                                }
                            }
                        } else if (option_1 == 0) {
                            break;
                        } else {
                            System.out.println("Wrong key pressed! Please try again.");
                        }
                    }
                }
            } else if (option == 2) {

                scan.nextLine();

                System.out.println("Enter Your Name");
                String Name = scan.nextLine();
                System.out.println("Enter Your Student ID");
                String Id = scan.nextLine();
                System.out.println("Enter A (3-6)-Digit Password");
                String Password = scan.nextLine();
                System.out.println("Department");
                String Dept = scan.nextLine();
                Department D = new Department(Name, Id, Password, Dept);
                F.CreateAccount(Name, Id, Password, Dept);

            } else if (option == 0) {
                break;
            }
        }

    }
}

