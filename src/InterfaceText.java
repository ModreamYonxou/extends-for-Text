import java.util.Scanner;
public class InterfaceText {
     public static void main(String[] args) {
//          Scanner in = new Scanner(System.in);
//          int m = in.nextInt();
         double sum=0;
         int days=0;
         for (days=1;sum<=100;days++){
              sum+=2.5;
              if (days%5==0) sum -= 6;
              System.out.println(days+":"+sum);
              System.out.println(days+":"+sum);
         }
       System.out.println(days);
//               judge(m);
         Animal dag = new Dog();
         dag.setName("旺财");
         dag.setAge(10);
         Cat cat = new Cat();
         cat.setName("小米");
         cat.setAge(10);
         System.out.println(dag.getName());
         System.out.println(cat.getName());
         System.out.println(dag.ageEquals(cat));
     }
     public static void judge(int a){
          int m;
   }

}
