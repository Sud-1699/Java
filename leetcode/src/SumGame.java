import java.util.Random;

public class SumGame {
    public static void main(String[] args) {
        SumGame game = new SumGame();
        System.out.println(game.sumGame("?3295???"));

    }

    public boolean sumGame(String num) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < num.length(); i++) {
            if(num.charAt(i) != '?') {
                sb.append(num.charAt(i));
                continue;
            }

            sb.append(random.nextInt(10));
        }

        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0; i < num.length(); i++) {
            if(i < num.length() / 2) {
                sum1 += sb.charAt(i) - '0';
            } else {
                sum2 += sb.charAt(i) - '0';
            }
        }

        return !(sum1 == sum2);
    }
}
