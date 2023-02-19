//Dilshan Dekumpitiya

import java.util.*;
public class Main{

    public static StudentCollection sc = new StudentCollection();  //Create and refer(sc) object type StudentCollection
    public static Scanner input=new Scanner(System.in);

    public static void bestinPRF(){
        L1:do{
            clearConsole();
            for (int i = 0; i <100 ; i++){
                System.out.print("-");
            }
            System.out.printf("\n%s%50s%50s","|","BEST IN PROGRAMMIG FUNDAMENTALS","|\n");
            for (int i = 0; i <100 ; i++){
                System.out.print("-");
            }
            sc.shortByPrf();
            L2:do{
                System.out.print("\nDo you want to go back to main menu (y/n) ");
                String option=input.nextLine();
                if(option.equalsIgnoreCase("y")){
                    clearConsole();
                    continue L1;
                }else {
                    clearConsole();
                    homePage();
                    break;
                }
            }while(true);
        }while(true);
    }
    public static void bestinDBMS(){
        L1:do{
            clearConsole();
            for (int i = 0; i <100 ; i++){
                System.out.print("-");
            }
            System.out.printf("\n%s%50s%50s","|","BEST IN DATABASE MANAGEMENT SYSTEM","|\n");
            for (int i = 0; i <100 ; i++){
                System.out.print("-");
            }
            sc.shortByDbms();
            L2:do{
                System.out.print("\nDo you want to go back to main menu (y/n) ");
                String option=input.nextLine();
                if(option.equalsIgnoreCase("y")){
                    clearConsole();
                    continue L1;
                }else {
                    clearConsole();
                    homePage();
                    break;
                }
            }while(true);


        }while(true);
    }

    public static void printStudentRanks(){
        L1:do{
            clearConsole();
            for (int i = 0; i <100 ; i++){
                System.out.print("-");
            }
            System.out.printf("\n%s%50s%50s","|","PRINT STUDENT RANKS","|\n");
            for (int i = 0; i <100 ; i++){
                System.out.print("-");
            }
            sc.printStudentRanks();
            L2:do{
                System.out.print("\nDo you want to go back to main menu (y/n) ");
                String option=input.nextLine();
                if(option.equalsIgnoreCase("y")){
                    clearConsole();
                    continue L1;
                }else {
                    clearConsole();
                    homePage();
                    break;
                }
            }while(true);
        }while(true);
    }

    public static void printStudentDetails(){
        L1:do{
            clearConsole();
            for (int i = 0; i <100 ; i++){
                System.out.print("-");
            }
            System.out.printf("\n%s%50s%50s","|","PRINT STUDENT DETAILS","|\n");
            for (int i = 0; i <100 ; i++){
                System.out.print("-");
            }

            System.out.print("\nEnter student ID :");
            String stId=input.nextLine();
            int idIndex=sc.searchId(stId);
            if (!isValidId(stId)){
                System.out.println("Invelid student id ");
                L2:do{
                    System.out.print("Do you want to search another student(y/n) ");
                    String option=input.nextLine();
                    if(option.equalsIgnoreCase("y")){
                        clearConsole();
                        continue L1;
                    }else {
                        clearConsole();
                        homePage();
                        break;
                    }
                }while(true);
            }else if(idIndex==-1){
                System.out.println(" This student ID does not exsit");
                L2:do{
                    System.out.print("Do you want to search another student(y/n) ");
                    String option=input.nextLine();
                    if(option.equalsIgnoreCase("y")){
                        clearConsole();
                        continue L1;
                    }else {
                        clearConsole();
                        homePage();
                        break;
                    }
                }while(true);
            }else{
                if (sc.marksEmptyCheckUp(idIndex)){
                    sc.printStudentName(idIndex);
                    System.out.println("Student marks yet to be added");

                }else{
                    sc.printStudentDetails(idIndex);

                }
                L2:do{
                    System.out.print("\nDo you want to search another student(y/n) ");
                    String option=input.nextLine();
                    if(option.equalsIgnoreCase("y")){
                        clearConsole();
                        continue L1;
                    }else {
                        clearConsole();
                        homePage();
                        break;
                    }
                }while(true);
            }
        }while(true);

    }

    public static void deleteStudent(){
        L1:do{
            clearConsole();
            for (int i = 0; i <100 ; i++){
                System.out.print("-");
            }
            System.out.printf("\n%s%50s%50s","|","DELETE STUDENT","|\n");
            for (int i = 0; i <100 ; i++){
                System.out.print("-");
            }
            Scanner input=new Scanner(System.in);
            System.out.print("\nEnter student ID :");
            String stId=input.nextLine();
            int idIndex=sc.searchId(stId);
            if (!isValidId(stId)){
                System.out.println("Invelid student id ");
                L2:do{
                    System.out.print("Do you want to delete another student(y/n) ");
                    String option=input.nextLine();
                    if(option.equalsIgnoreCase("y")){
                        clearConsole();
                        continue L1;
                    }else {
                        clearConsole();
                        homePage();
                        break;
                    }
                }while(true);
            }else if(idIndex==-1){
                System.out.println(" This student ID does not exsit");
                L2:do{
                    System.out.print("Do you want to delete another student(y/n) ");
                    String option=input.nextLine();
                    if(option.equalsIgnoreCase("y")){
                        clearConsole();
                        continue L1;
                    }else {
                        clearConsole();
                        homePage();
                        break;
                    }
                }while(true);
            }else{
                sc.removeObject(idIndex);
                L2:do{
                    System.out.print("Do you want delete another student(y/n) ");
                    String option=input.nextLine();
                    if(option.equalsIgnoreCase("y")){
                        clearConsole();
                        continue L1;
                    }else {
                        clearConsole();
                        homePage();
                        break;
                    }
                }while(true);
            }
        }while(true);
    }

    public static void updateMarks(){
        L1:do{
            clearConsole();
            for (int i = 0; i <100 ; i++){
                System.out.print("-");
            }
            System.out.printf("\n%s%50s%50s","|","UPDATE STUDENT MARKS ","|\n");
            for (int i = 0; i <100 ; i++){
                System.out.print("-");
            }
            System.out.print("\nEnter student ID :");
            String stId=input.nextLine();
            int idIndex=sc.searchId(stId);
            if (!isValidId(stId)){
                System.out.println("Invelid student id ");
                L2:do{
                    System.out.print("Do you want add another student(y/n) ");
                    String option=input.nextLine();
                    if(option.equalsIgnoreCase("y")){
                        clearConsole();
                        continue L1;
                    }else {
                        clearConsole();
                        homePage();
                        break;
                    }
                }while(true);

            }else if(idIndex==-1){
                System.out.println("can't find this student ");
                L2:do{
                    System.out.print("Do you want add another student(y/n) ");
                    String option=input.nextLine();
                    if(option.equalsIgnoreCase("y")){
                        clearConsole();
                        continue L1;
                    }else {
                        clearConsole();
                        homePage();
                        break;
                    }
                }while(true);
            }else if(sc.marksEmptyCheckUp(idIndex)){
                sc.printStudentName(idIndex);
                System.out.println("This studenr's mark yet to be added");
                L2:do{
                    System.out.print("Do you want update another student(y/n) ");
                    String option=input.nextLine();
                    if(option.equalsIgnoreCase("y")){
                        clearConsole();
                        continue L1;
                    }else {
                        clearConsole();
                        homePage();
                        break;
                    }
                }while(true);
            }else{
                sc.printStudentName(idIndex);
                sc.printStudentMarks(idIndex);
                int prfM,dbmsM;
                L2:do{
                    System.out.print("Enter prf marks : ");
                    prfM= input.nextInt();
                    if (!isValidMarks(prfM)){
                        System.out.println("Invelid marks input again ");
                        continue L2;
                    }else{
                        break L2;
                    }

                }while(true);
                L2:do{
                    System.out.print("Enter Dbms marks : ");
                    dbmsM= input.nextInt();
                    if (!isValidMarks(dbmsM)){
                        System.out.println("Invelid marks input again ");
                        continue L2;
                    }else{
                        break L2;
                    }
                }while(true);
                input.nextLine();
                sc.addNewStudentWithMarks(idIndex,prfM,dbmsM);
                L2:do{
                    System.out.print("Do you want update another student's mark(y/n) ");
                    String option=input.nextLine();
                    if(option.equalsIgnoreCase("y")){
                        clearConsole();
                        continue L1;
                    }else {
                        clearConsole();
                        homePage();
                        break;
                    }
                }while(true);
            }

        }while(true);

    }

    public static void updateStudentDetails(){
        L1:do{
            clearConsole();
            for (int i = 0; i <100 ; i++){
                System.out.print("-");
            }
            System.out.printf("\n%s%50s%50s","|","UPDATE STUDENT DETAILS","|\n");
            for (int i = 0; i <100 ; i++){
                System.out.print("-");
            }
            System.out.print("\nEnter student ID :");
            String stId=input.nextLine();
            int idIndex=sc.searchId(stId);

            if (!isValidId((stId))){
                L2:do{
                    System.out.println("Invelid student id ");
                    System.out.print("Do you want search another student(y/n) ");
                    String option=input.nextLine();
                    if(option.equalsIgnoreCase("y")){
                        clearConsole();
                        continue L1;
                    }else {
                        clearConsole();
                        homePage();
                        break;
                    }
                }while(true);
            }else if(idIndex==-1){
                System.out.println("can't find this student ");
                L2:do{
                    System.out.print("Do you want search another student(y/n) ");
                    String option=input.nextLine();
                    if(option.equalsIgnoreCase("y")){
                        clearConsole();
                        continue L1;
                    }else {
                        clearConsole();
                        homePage();
                        break;
                    }
                }while(true);
            }else{
                sc.printStudentName(idIndex);
                System.out.print("Enter new student name : ");
                String newName = input.nextLine();
                sc.updateStudentName(idIndex,newName);
                L2:do{
                    System.out.print("Do you want to update another student(y/n) ");
                    String option=input.nextLine();
                    if(option.equalsIgnoreCase("y")){
                        clearConsole();
                        continue L1;
                    }else {
                        clearConsole();
                        homePage();
                        break;
                    }
                }while(true);
            }


        }while(true);
    }

    public static void addMarks(){
        L1:do{
            clearConsole();
            for (int i = 0; i <100 ; i++){
                System.out.print("-");
            }
            System.out.printf("\n%s%50s%50s","|","ADD MARKS","|\n");
            for (int i = 0; i <100 ; i++){
                System.out.print("-");
            }
            System.out.print("\nEnter student Id : ");
            String stId=input.nextLine();
            int index=sc.searchId(stId);
            if(!isValidId(stId)){
                System.out.println("Invelid Student Id ");
                L2:do{
                    System.out.println("Do you want to search again(y/n)");
                    String option=input.nextLine();
                    if(option.equalsIgnoreCase("y")){
                        clearConsole();
                        continue L1;
                    }else {
                        clearConsole();
                        homePage();
                        break;
                    }
                }while(true);
            }else if(index==-1){
                L2:do{
                    System.out.print("This student ID does not exits.Add student using option (1)\nDo you want add another student(y/n) : ");
                    String option=input.nextLine();
                    if(option.equalsIgnoreCase("y")){
                        clearConsole();
                        continue L1;
                    }else {
                        clearConsole();
                        homePage();
                        break;
                    }
                }while(true);
            }
            if (!sc.marksEmptyCheckUp(index)){
                sc.printStudentName(index);
                System.out.println("This student marks alredy added \nif you want to update marks use option (5)");
                L2:do{
                    System.out.print("Do you want add another student(y/n) : ");
                    String option=input.nextLine();
                    if(option.equalsIgnoreCase("y")){
                        clearConsole();
                        continue L1;
                    }else {
                        clearConsole();
                        homePage();
                        break;
                    }
                }while(true);
            }else{
                sc.printStudentName(index);
                int prfM,dbmsM;
                L2:do{
                    System.out.print("Enter prf marks : ");
                    prfM= input.nextInt();
                    if (!isValidMarks(prfM)){
                        System.out.println("Invalid marks input again ");
                        continue L2;
                    }else{
                        break L2;
                    }

                }while(true);
                L2:do{
                    System.out.print("Enter Dbms marks : ");
                    dbmsM= input.nextInt();
                    if (!isValidMarks(dbmsM)){
                        System.out.println("Invelid marks input again ");
                        continue L2;
                    }else{
                        break L2;
                    }
                }while(true);
                input.nextLine();
                sc.addNewStudentWithMarks(index,prfM,dbmsM);
                L2:do{
                    System.out.print("Do you want add another student(y/n) : ");
                    String option=input.nextLine();
                    if(option.equalsIgnoreCase("y")){
                        clearConsole();
                        continue L1;
                    }else {
                        clearConsole();
                        homePage();
                        break;
                    }
                }while(true);
            }
        }while(true);
    }

    public static void addNewStudentWithMarks(){
        //Beginning of Add New Student With Marks Page
        Scanner input=new Scanner(System.in);
        L1: do{
            for (int i = 0; i < 100; i++){
                System.out.print("-");
            }
            System.out.println();
            System.out.printf("%-15s %40s %43s %n", "|","ADD NEW STUDENT WITH MARKS","|");
            for (int i = 0; i < 100; i++){
                System.out.print("-");
            }
            System.out.println();

            //------------------------------

            //Get Inputs
            L2 : do{
                System.out.print("Enter Student ID   : ");
                String id=input.nextLine();
                if(sc.searchId(id)!=-1){
                    System.out.println(id+" is already exists...");
                    System.out.println();
                    continue L2;

                }
                if(!isValidId(id)){
                    System.out.println("Invalid Student ID..Please check..");
                    System.out.println();
                    continue L2;
                }

                System.out.print("Enter Student Name : ");
                String name=input.nextLine();

                System.out.println();


                L3 : do{
                    System.out.print("Input PRF Marks : ");
                    int prfMarks=input.nextInt();

                    if(isValidMarks(prfMarks)==false){
                        System.out.print("Invalid Marks,Please enter correct marks.\n\n");
                        continue L3;
                    }

                    L4 : do{
                        System.out.print("Input DBMS Marks : ");
                        int dbmsMarks=input.nextInt();

                        if(isValidMarks(dbmsMarks)==false){
                            System.out.print("Invalid Marks,Please enter correct marks.\n\n");
                            continue L4;
                        }

                        input.nextLine();

                        sc.extendArrays();
                        Student ST=new Student(id,name,prfMarks,dbmsMarks);
                        sc.addStudent(ST);

                        System.out.print("\nStudent has been added succefully.\nDo you want to add another student(y/n) : ");
                        String option=input.nextLine();

                        if(option.equalsIgnoreCase("y")){
                            clearConsole();
                            continue L1;
                        }else {
                            clearConsole();
                            homePage();
                            break;

                        }
                    }while(true);
                }while(true);
            }while(true);
        }while(true);
    }

    public static boolean isValidMarks(int marks){ //Checks if valid marks
        if(marks<0 || marks>100){
            return false;

        }return true;
    }

    public static void addNewStudent(){
        //Beginning of Add New Student Page
        L1 :do{
            for (int i = 0; i < 100; i++){
                System.out.print("-");
            }
            System.out.println();
            System.out.printf("%-15s %40s %43s %n", "|","ADD NEW STUDENT","|");
            for (int i = 0; i < 100; i++){
                System.out.print("-");
            }
            System.out.println();
            //------------------------------

            //Get Inputs

            L2 : do{
                System.out.print("Enter Student ID   : ");
                String id=input.nextLine();
                if(sc.searchId(id)!=-1){
                    System.out.println(id+" is already exists...");
                    System.out.println();
                    continue L2;
                }
                if(!isValidId(id)){
                    System.out.println("Invalid Student ID..Please check..");
                    System.out.println();
                    continue L2;

                }

                System.out.print("Enter Student Name : ");
                String name=input.nextLine();

                Student ST=new Student(id,name); //Create and call Student object and refer in as st
                sc.extendArrays(); //Call student collection object extend array method
                sc.addStudent(ST); //Call student collection addNewStudent method to store last element


                System.out.print("\nStudent has been added succefully.\nDo you want to add another student(y/n) : ");
                String option=input.nextLine();

                if(option.equalsIgnoreCase("y")){
                    clearConsole();
                    continue L1;
                }else {
                    clearConsole();
                    homePage();
                    break;
                }

            }while(true);
        }while(true);

    }

    public static boolean isValidId(String id){
        boolean isValidId=false;
        if(id.length() ==4 && id.charAt(0) == 'S'){
            isValidId=true;
            String sDigit=id.substring(1);
            char[] chars=sDigit.toCharArray();
            for (int i = 0; i < chars.length; i++){
                if(!Character.isDigit(chars[i])){
                    isValidId=false;
                    break;
                }
            }

        }
        return isValidId;
    }

    public static void homePage(){
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < 100; i++){
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("%-15s %53s %30s %n", "|","WELCOME TO GDSE MARKS MANAGEMENT SYSTEM","|");
        for (int i = 0; i < 100; i++){
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("%-20s %54s %n","[1] Add New Student","[2]  Add New Student With Marks");
        System.out.printf("%-20s %50s %n","[3] Add Marks","[4]  Update Student Details");
        System.out.printf("%-20s %42s %n","[5] Update Marks","[6]  Delete Student");
        System.out.printf("%-20s %42s %n","[7] Print Student Details","[8]  Print Student Ranks");
        System.out.printf("%-20s %46s %n %n ","[9] Best in Programming Fundamentals","[10] Best in Database Management System");

        System.out.print("\bEnter an option to continue > ");
        int option=input.nextInt();
        switch(option){
            case 1 : clearConsole();
                addNewStudent(); break;
            case 2 : clearConsole();
                addNewStudentWithMarks(); break;
            case 3 : clearConsole();
                addMarks();
            case 4 : clearConsole();
                updateStudentDetails(); break;
            case 5 : clearConsole();
                updateMarks(); break;
            case 6 : clearConsole();
                deleteStudent(); break;
            case 7 : clearConsole();
                printStudentDetails(); break;
            case 8 : clearConsole();
                printStudentRanks(); break;
            case 9 : clearConsole();
                bestinPRF(); break;
            case 10: clearConsole();
                bestinDBMS(); break;
            default :
                System.out.print("Invalid Input\nPlease input valid option.\n");
                System.out.print("\nDo you want to back menu(y) : ");
                String option1=input.nextLine();
                input.nextLine();
                if(option1.equalsIgnoreCase("Y")){
                    clearConsole();
                    homePage();
                }else {
                    clearConsole();
                    homePage();
                }
        }
    }

    public static void main(String args[]){
        homePage();

    }

    public static void clearConsole(){
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }else{
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        }catch (final Exception e) {
            e.printStackTrace();
        }
    }
}
