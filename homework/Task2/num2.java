public class num2 {
    public static void main(String[] args) {
        int n = 3; 
        int m = 1; 

        int pointsTeam1 = 0;
        int pointsTeam2 = 0;

        if (n > m) {
            pointsTeam1 = 3;
            pointsTeam2 = 0;

        } else if (n < m) {
            pointsTeam1 = 0;
            pointsTeam2 = 3;
            
        } else {
            pointsTeam1 = 1;
            pointsTeam2 = 1;
        }
        System.out.println("Счет матча — " + n + ":" + m);
        System.out.println("Очки первой команды: " + pointsTeam1);
        System.out.println("Очки второй команды: " + pointsTeam2);
    }
}
