/* Welcome to project
    @author: tienb
    Date: 11/5/2022
    Time: 4:27 PM
    
    ProjectName: Bai3
*/public class CandidateC extends Candidate{
    public static final String MON_VAN = "Van";
    public static final String MON_SU = "Su";
    public static final String MON_DIA = "Dia";
    public CandidateC(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }
    @Override
    public String toString() {
        return "CandidateB{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority=" + priority + ", Subject" + MON_VAN +"-"+ MON_SU + "-"+ MON_DIA+
                '}';
    }
}
