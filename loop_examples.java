class ForLoopExample {
    public static void main(String[] args) {
        for(int i =1;i<=5;i++){
        System.out.println(i);
        }
    }
}

class ForLoopCountDown {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--) {
            System.out.println(i);
        }
    }
}

class ForLoopEvenNumbers {
    public static void main(String[] args) {
        for(int i=2;i<=50;i+=2){
            System.out.println(i);
        }
    }
}

class Dowhile {
    public static void main(String[] args) {
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=5);
    }
}