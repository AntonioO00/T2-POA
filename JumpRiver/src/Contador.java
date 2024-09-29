import java.util.HashMap;

public class Contador {
    private String rio;
    private HashMap<Integer, Integer> memo;

    public Contador(String rio) {
        this.rio = rio;
        this.memo = new HashMap<>();
    }

    public int recursivoSimples(int pos) {
        // Se chegou ao final, há uma maneira válida
        if (pos == rio.length()) {
            return 1;
        }

        // Se a posição atual não tem pedra, não há maneiras válidas
        if (pos > rio.length() || rio.charAt(pos) == '0') {
            return 0;
        }


        int contar = recursivoSimples(pos + 1);
        contar += recursivoSimples(pos + 2);
        contar += recursivoSimples(pos + 3);

        return contar;
    }


    public int recursivoMemorizado(int pos) {
        if (pos == rio.length()) {
            return 1;
        }

        if (pos > rio.length() || rio.charAt(pos) == '0') {
            return 0;
        }


        if (memo.containsKey(pos)) {
            return memo.get(pos);
        }

        int contar = recursivoMemorizado(pos + 1);
        contar += recursivoMemorizado(pos + 2);
        contar += recursivoMemorizado(pos + 3);


        memo.put(pos, contar);
        return contar;
    }


    public int naoRecursivo() {
        int n = rio.length();
        if (n == 0 || rio.charAt(0) == '0') return 0;


        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 0; i < n; i++) {
            if (rio.charAt(i) == '0') continue;


            if (i + 1 <= n) dp[i + 1] += dp[i];
            if (i + 2 <= n) dp[i + 2] += dp[i];
            if (i + 3 <= n) dp[i + 3] += dp[i]; 
        }

        return dp[n];
    }
}
