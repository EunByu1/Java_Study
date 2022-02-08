package JavaStrandard.com.company;

class Ch2_VarEx2 {

    public static void main3(String[] args) {
        int x   = 10, y = 20;
        int tmp = 0;

        System.out.println("x:" + x + " y:" + y);

        tmp = x;
        x   = y;
        y   = tmp;

        System.out.println("x:" + x + " y:" + y);
    }

}
