public class App {
    public static void main(String[] args) throws Exception {

        int slump = (int)Math.random()*100;
        slump-=49;
        if(slump<0)
        {
        System.out.println("Slumptalet är negativt");
        }
        else
        {
        System.out.println("Slumptalet");
        }

    }
}
