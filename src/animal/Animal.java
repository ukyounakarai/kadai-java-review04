package animal;

import animal.Animal;

public class Animal {
 // フィールド 名前を格納するフィールドと年齢を格納するフィールドを定義してください
    private String name; //名
    private int age;      // 年齢

    //引数ありのコンストラクタ コンストラクタに名前・年齢の情報を格納する引数を設定
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // 表示 say という名前のpublicなメソッドを定義してください。
    public void say() {
            // say 表示
    System.out.println(this.name + " です。" + this.age + " 歳です。");
    }
}
