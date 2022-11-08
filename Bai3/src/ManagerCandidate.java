import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Welcome to project
    @author: tienb
    Date: 11/5/2022
    Time: 4:28 PM
    
    ProjectName: Bai3
*/public class ManagerCandidate {
    List<Candidate> candidates;
    public ManagerCandidate(){
        this.candidates= new ArrayList<>();
    }
    // add candidate
    public void addCandidate(Candidate candidate){
        this.candidates.add(candidate);
    }
    // insert data
    public void insertCandidate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A : to insert candidate A");
        System.out.println("Enter B : to insert candidate B");
        System.out.println("Enter C : to insert candidate C");
        String type = scanner.nextLine();
        switch(type){
            case "a":{
                candidates.add(createCandidate(scanner, "a"));
                break;
            }
            case "b":{
                candidates.add(createCandidate(scanner,"b"));
                break;
            }
            case "c":{
                candidates.add(createCandidate(scanner,"c"));
                break;
            }
            default:{
                System.out.println("Invalid");
                break;
            }
        }
    }
    // createCandidate
    public Candidate createCandidate(Scanner scanner, String cate){
        System.out.println("Enter ID: ");
        String id = scanner.nextLine();
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter address:");
        String address = scanner.nextLine();
        System.out.println("Enter priority: ");
        int priority = scanner.nextInt();
        scanner.nextLine();
        if(cate.equals("a")){
            return new CandidateA(id, name, address, priority);
        }else if(cate.equals("b")){
            return new CandidateB(id, name, address, priority);
        }else{
            return new CandidateC(id, name, address, priority );
        }
    }
    // show information
    public void showInfor(){
        this.candidates.forEach(o-> System.out.println(o.toString()));
    }
    //search by id
    public Candidate searchById(String id){
        return this.candidates.stream()
                .filter(o->o.getId().equals(id))
                .findFirst().orElse(null);
    }
}
