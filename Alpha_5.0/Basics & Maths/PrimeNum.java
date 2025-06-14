class PrimeNum {

    public static void checkPrime(int num) {

        // Loop till root num
        for (int i = 2; i < (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime");
    }

    public static void main(String[] args) {
        int num = 12;
        checkPrime(num);
    }
}