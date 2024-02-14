

class Monkey{
    void jump(){
        System.out.println("Monkey is Jumping.");
    }
    void bite(){
        System.out.println("Monkey is Biting.");
    }
}
interface BasicAnnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnnimal{
    void speak(){
        super.bite();
        System.out.println("Hello sir, I am a Human inherited form a Monkey.");
    }
    public void eat(){
        System.out.println("Eating...");
    }
    public void sleep(){
        System.out.println("Sleeping...");
    }
}
public class Cwh_60_Ps11_P3and5{
    public static void main(String[] args) {
        Human h = new Human();
        h.bite();
        h.speak();

        Monkey m1 = new Human();
        // m1.speak(); --> cannot use 'speak' mehtod because the reference is monkey which does not have 'speak' method
        m1.bite();
        m1.jump();
        
        BasicAnnimal lovish = new Human();
        lovish.eat();
        lovish.sleep();
    }
}