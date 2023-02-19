public class Student{

    private String id;
    private String Name;
    private int prfMarks;
    private int dbmsMarks;

    public Student(String stdId,String stdName){
        id=stdId;
        Name=stdName;
        prfMarks=-1;
        dbmsMarks=-1;
    }

    public Student(String stdId,String stdName,int prf,int dbms){
        id=stdId;
        Name=stdName;
        prfMarks=prf;
        dbmsMarks=dbms;
    }

    public void setId(String stId){
        id=stId;
    }
    public void setName(String stName){
        Name=stName;
    }
    public void setPrfMarks(int prfM){
        prfMarks=prfM;
    }
    public void setDbmsMarks(int dbmsM){
        dbmsMarks=dbmsM;
    }

    public String getId(){
        return id;
    }
    public String getName(){
        return Name;
    }
    public int getPrfMarks(){
        return prfMarks;
    }
    public int getDbmsMarks(){
        return dbmsMarks;
    }
}
