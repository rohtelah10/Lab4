public class ajp6 {
    public static void main(String[] args) {
        factors f = new factors();
        f.printFactor(10);
    }
}

class factors{
    void printFactor(int number){
        for (int i = 1; i <= number; ++i) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
