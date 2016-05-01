package inheritanceVI;
public class Fakultas {
    private String univ;
    private String rektor;
    private String faculty;
    public Fakultas(String u, String r, String f){
        univ = u;
        rektor = r;
        faculty = f;
    }
    public String getUniversity(){
        return univ;
    }
    public String getRektor(){
        return rektor;
    }
    public String getFaculty(){
        return faculty;
    }
    public void displayMessage(){
        System.out.println("Fakultas "+getFaculty()+", Universitas "+getUniversity());
        System.out.println("  Rektor : "+getRektor());
        
    }
}
