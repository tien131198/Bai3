import java.util.Scanner;

/* Welcome to project
    @author: tienb
    Date: 11/5/2022
    Time: 4:28 PM
    
    ProjectName: Bai3
*/public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerCandidate managerCandidate= new ManagerCandidate();
        while (true){
            System.out.println("Application Manager Candidate");
            System.out.println("Enter 1: To insert candidate");
            System.out.println("Enter 2: To show information candidate");
            System.out.println("Enter 3: To search candidate by id");
            System.out.println("Enter 4: To exit");
            String line = scanner.nextLine();
            switch (line){
                case "1":{
                    managerCandidate.insertCandidate();
                    break;
                }
                case "2":{
                    managerCandidate.showInfor();
                    break;
                }
                case "3":{
                    System.out.println("Enter ID");
                    String id = scanner.nextLine();
                    Candidate candidate = managerCandidate.searchById(id);
                    if(candidate == null){
                        System.out.println("Not found");
                    }else{
                        System.out.println(candidate.toString());
                    }
                    break;
                }
                case "4":{
                    System.out.println("Exit");
                    System.exit(0);

                }
                default:
                    System.out.println("Invalid");
                    break;

            }
        }
    }
}
