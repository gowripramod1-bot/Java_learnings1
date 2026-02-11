class PositiveNegativeZero {
    public static void main(String[] args) {
        int[] numbers = {10, -5, 0, 20, -15};

        System.out.println("Elements of the array:");
        for (int num : numbers) {
            if (num > 0) {
                System.out.println(num + " is positive.");
            } else if (num < 0) {
                System.out.println(num + " is negative.");
            } else {
                System.out.println(num + " is zero.");
            }
        }
    }
}