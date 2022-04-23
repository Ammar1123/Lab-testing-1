public class Physics {

    public boolean S(int n, int x[], int y[], int z[]) {
        if (n <= 0)
            throw new IllegalArgumentException("N positive integer");

        int X = 0, Y = 0, Z = 0;

        while (n > 0) {
            X = X + x[n-1];
            Y = Y + y[n-1];
            Z = Z + z[n-1];
            n--;
        }
        if (X == 0 && Y == 0 && Z == 0)
            return true;
        else
            return false;
    }

}