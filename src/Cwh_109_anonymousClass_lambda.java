    @FunctionalInterface
    interface DemoAno{
        void eth1(int a);
      //  void eth2();
    }
    class HarryFunc implements DemoAno{
        @Override
        public void eth1(int a){
            System.out.println("This is ETH1.");
        }
    }
//   class AnonyDemo implements DemoAno{
//     public void display(){
//         System.out.println("Hello!");
//     }
//     @Override
//     public void eth1(){
//         System.out.println("I am Eth1.");
//     }
//     @Override
//     public void eth2(){
//         System.out.println("I am Eth2.");
//     }
// }
public class Cwh_109_anonymousClass_lambda { 
  public static void main(String[] args) {
    // DemoAno obj = new AnonyDemo();
    // obj.eth1();

    //Anonymous Class
    // DemoAno obj = new DemoAno() {
    //     @Override
    //     public void eth1(){
    //         System.out.println("I am Eth1.");
    //     }
    //     @Override
    //     public void eth2(){
    //         System.out.println("I am Eth2.");
    //     }
    // };
    // obj.eth1();

    //Lambda Expressions 

    // DemoAno obj1 = new HarryFunc();
    // obj1.eth1();
    DemoAno obj3 = (a)->{
        System.out.println("I am method 1 from this lambda."+a);
    };
    obj3.eth1(6);
  } 
}

