
package startedjava;
class Main {
    public static void main(String[] args) {
        int n = 6;
        int num = n + 1;

        while (true) {

            if (num % 7 == 0) {
                num++;
                continue;
            }

            boolean prime = true;

            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
             System.out.println(num);
            }

            num++;
        }
    }
}