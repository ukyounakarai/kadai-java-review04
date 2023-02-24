package animal;

public class Human extends Animal implements Thinkable {
 // フィールド 趣味の情報を保管するフィールドを定義してください
    private String hobby; //趣味
 //
    public Human(String name,int age ,String hobby) {
    super(name,age);
    this.hobby = hobby;
    }


    //think メソッドを実装してください。
    @Override
    public void think() {
        System.out.println(" 私は" + this.hobby + "について考えています。");
    }
}
