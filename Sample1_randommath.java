package sample1;

public class Sample1_randommath {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        int r;
        for ( int i = 0; i < 10; i++ ) {
          r = (int)(Math.random() * 100) + 1; //6行目Math.random()では、0.0 以上 1.0未満のdouble値を返すので 100倍して1を加算。
          System.out.print(r + " ");
        }
    }
}
