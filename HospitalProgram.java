import java.awt.*;
import java.util.Scanner;
public class HospitalProgram {
    public static void main(String[] args) {
        System.out.println("DAIT HOSPITAL");
        Scanner Input = new Scanner(System.in);
        String Choice;

        System.out.println("Select Your Physician");


        System.out.println("(1) Dermatologist , (2) Orthopedic Surgeon , (3) Cardiologist ");
        System.out.println("(4) Pediatricians , (5) Dentist , (6) Oncologist , (7) Psychiatrist ");

        do {
            System.out.print("Enter Disease Choice(Number) : ");
            int Disease = Input.nextInt();
            Input.nextLine();

            switch (Disease) {
                case 1:
                    System.out.println("You Need to Visit Dermatologist");
                    System.out.println("The Doctor Name is : Mari Selvam");
                    System.out.println("Your Token Number is : 18");
                    System.out.println("Your Consultation Fees is : 250");
                    break;

                case 2:
                    System.out.println("You Need to Visit Orthopedic Surgeon");
                    System.out.println("The Doctor Name is : Surya ");
                    System.out.println("Your Token Number is : 25");
                    System.out.println("Your Consultation Fees is : 300");
                    break;

                case 3:
                    System.out.println("You Need to Visit Cardiologist");
                    System.out.println("The Doctor Name is : Somesh ");
                    System.out.println("Your Token Number is : 15");
                    System.out.println("Your Consultation Fees is : 350");
                    break;

                case 4:
                    System.out.println("You Need to Visit Pediatricians");
                    System.out.println("The Doctor Name is : Vijay Dass ");
                    System.out.println("Your Token Number is : 15");
                    System.out.println("Your Consultation Fees is : 450");
                    break;

                case 5:
                    System.out.println("You Need to Visit Dentist");
                    System.out.println("The Doctor Name is : Vishwa Kumar ");
                    System.out.println("Your Token Number is : 07");
                    System.out.println("Your Consultation Fees is : 200");
                    break;

                case 6:
                    System.out.println("You Need to Visit Oncologist ");
                    System.out.println("The Doctor Name is : Sanjay ");
                    System.out.println("Your Token Number is : 11");
                    System.out.println("Your Consultation Fees is : 450");
                    break;

                case 7:
                    System.out.println("You Need to Visit Psychiatrist ");
                    System.out.println("The Doctor Name is : Yokesh ");
                    System.out.println("Your Token Number is : 21");
                    System.out.println("Your Consultation Fees is : 50");
                    break;

                default:
                    System.out.println("Please Select the Valid Choice");
                    break;

            }

            System.out.println("Do You Need The Medicine that Prescribed by the Doctor?(Yes/No)");
            System.out.print("Enter Your Choice : ");
            Choice = Input.nextLine();

            if (Choice.equalsIgnoreCase("yes")) {
                System.out.println("Please Visit The Medical Shop");
                System.out.println("Thank You and Visit Again");
            } else {
                System.out.println("Thank You and Visit Again");
            }
        }while(Choice.equalsIgnoreCase("yes"));
    }
}