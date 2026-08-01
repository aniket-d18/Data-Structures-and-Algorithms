
    void print(int i, int n) {
        System.out.println("Aniket ");


        if (i > n) {
            return;
        }
        print(i + 1, n);
    }

    void main() {
        int n = 10;
        print(1, n);
    }

