import java.util.ArrayList;

public class GetSurvivingIndex {
    public static int getSurvivingIndex(int n, int k) {
        ArrayList<Integer> solders = new ArrayList<>();
        for (int solderNumber = 1; solderNumber <= n; solderNumber++) {
            solders.add(solderNumber);
        }
        int killIndex = 0;
        while (solders.size() > 1) {
            killIndex = (killIndex + k - 1) % solders.size();
            System.out.println(solders.remove(killIndex)+"번 군사가 죽습니다.");
        }
        return solders.get(0);
    }
    public static void main(String[] args) {
        System.out.println("김신은 " + getSurvivingIndex(20, 5) + "번 자리에 서있으면 됩니다.");
    }
}
