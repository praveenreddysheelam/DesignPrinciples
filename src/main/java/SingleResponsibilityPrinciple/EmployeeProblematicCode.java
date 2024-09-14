package SingleResponsibilityPrinciple;
// This class handles many things like employee details(set,get employee details) ,employee bio data ,
// calculating salary,PerformanceReport).Change in any of those cause class to change
//
public class EmployeeProblematicCode {
    // Any new attribute can be added then class has to change with more getter setters
    private int id;
    private int name;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public int getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(int name) {
        this.name = name;
    }
    //Bio data implementation can change like retrieving bio data from different sources that cause change in class
    public String getBioData(){
        return "some Bio data";
    }
    // Salary Calculation implementaion can change based on tac regime,pf etc
    public int calculateSalary(){
        return  0;
    }
    // if we need performance report in some other format then we need to change this
    public void printPerformanceReport(){
        System.out.println("Print some report ");
    }



}
