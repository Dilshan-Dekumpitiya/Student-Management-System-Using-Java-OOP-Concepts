import java.util.*;
public class StudentCollection{
    private Student[] students = new Student[0];

    public void extendArrays(){
        Student[] tempStArray=new Student[students.length+1]; //Create temporary StArray of +1(Adding one new element) element(Student object type)
        for (int i = 0; i < students.length; i++){
            tempStArray[i]=students[i];
        }
        students = tempStArray;
    }

    public int searchId(String id){
        for(int i=0; i<students.length; i++){
            if(students[i].getId().equalsIgnoreCase(id)){
                return i;
            }
        }
        return -1;
    }

    public void addStudent(Student ST){ //In Student object array, assign st detail to the last element
        students[students.length-1]=ST;
    }

    public void addNewStudentWithMarks(int index,int prfM,int dbmsM){
        students[index].setPrfMarks(prfM);
        students[index].setDbmsMarks(dbmsM);
    }

    public boolean marksEmptyCheckUp(int index){ //To option 3
        if (students[index].getPrfMarks()==-1){
            return true;
        }
        return false;
    }
    public void printStudentName(int index){ //To option 3
        System.out.printf("Student Name :%5s\n",students[index].getName());
    }

    public void updateStudentName(int index,String newName){
        students[index].setName(newName);
    }
    public void printStudentMarks(int index){
        System.out.printf("PRF marks : %10d\n",students[index].getPrfMarks());
        System.out.printf("DBMS marks : %10d\n",students[index].getDbmsMarks());

    }

    public void removeObject(int index){
        Student[]tempStudents=new Student[students.length-1];
        for (int i = index; i <students.length-1 ; i++){
            students[i]=students[i+1];
        }
        for (int i = 0; i <tempStudents.length ; i++){
            tempStudents[i]=students[i];
        }
        students=tempStudents;
        System.out.println("Student Delete successfully ");
    }
    public void printStudentDetails(int index){
        int total=0;
        double avg=0.0;
        total=students[index].getPrfMarks()+students[index].getDbmsMarks();
        avg=(double)total/2;
        System.out.printf("Student Name :%5s\n",students[index].getName());
        System.out.printf("Programming Fundamental Marks %13d\nDatabase Management System marks%11d\nTotal Marks%32d\nAvarage marks%30.2f\nRank%39d",students[index].getPrfMarks(),students[index].getDbmsMarks(),total,avg,(index+1));
    }
    public void printStudentRanks(){
        int[] total = new int[students.length];
        double[]avarge=new double[students.length];
        for (int i = 0; i <students.length ; i++){
            total[i]=students[i].getPrfMarks()+students[i].getDbmsMarks();
            avarge[i]=(double)total[i]/2;
        }
        for (int i = 0; i <total.length-1 ; i++){
            for (int j = 0; j <total.length-1 ; j++){
                if (total[j]<total[j+1]){


                    int tempTot =total[j];
                    total[j]=total[j+1];
                    total[j+1]=tempTot;
                    //--------------------------------------
                    double tempAvg=avarge[j];
                    avarge[j]=avarge[j+1];
                    avarge[j+1]=tempAvg;
                    //--------------------------------------
                    Student tempObj=students[j];
                    students[j]=students[j+1];
                    students[j+1]=tempObj;
                }
            }
        }

        System.out.printf("\nRank  ID      Name          Total Marks   Avg. marks\n");
        System.out.printf("----  ------  -------------   -----------  ------------\n");
        for (int i = 0; i <students.length ; i++){
            if (marksEmptyCheckUp(i)){
                continue;

            }else{
                System.out.printf("\n%d%9s%11s%15d%15.2f\n",(i+1),students[i].getId(),students[i].getName(),total[i],avarge[i]);

            }
        }


    }
    public void shortByPrf(){
        for (int i = 0; i <students.length-1 ; i++){
            for (int j = 0; j <students.length-1 ; j++){
                if (students[j].getPrfMarks()<students[j+1].getPrfMarks()){
                    Student temp =students[j];
                    students[j]=students[j+1];
                    students[j+1]=temp;
                }

            }

        }

        System.out.printf("\nID            Name            PRF MARKS      DBMS MARKS    \n");
        System.out.printf("----  --------------        -------------   -------------   \n");

        for (int i = 0; i <students.length ; i++){
            if (marksEmptyCheckUp(i)){
                continue;

            }else{

                System.out.printf("%s%10s%22d%15d\n",students[i].getId(),students[i].getName(),students[i].getPrfMarks(),students[i].getDbmsMarks());

            }
        }
    }
    public void shortByDbms(){
        for (int i = 0; i <students.length-1 ; i++){
            for (int j = 0; j <students.length-1 ; j++){
                if (students[j].getDbmsMarks()<students[j+1].getDbmsMarks()){
                    Student temp =students[j];
                    students[j]=students[j+1];
                    students[j+1]=temp;
                }

            }
        }
        System.out.printf("\nID            Name            PRF MARKS      DBMS MARKS    \n");
        System.out.printf("----  --------------        -------------   -------------   \n");
        for (int i = 0; i <students.length ; i++){
            if (marksEmptyCheckUp(i)){
                continue;

            }else{

                System.out.printf("%s%10s%22d%15d\n",students[i].getId(),students[i].getName(),students[i].getPrfMarks(),students[i].getDbmsMarks());

            }
        }
    }
}
