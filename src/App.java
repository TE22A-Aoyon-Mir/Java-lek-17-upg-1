public class App {
    public static void main(String[] args) throws Exception {

    String cx="a";
    int nummret =0;
    System.out.println("Då kör vi, vilket nummer avbryter programmet");
    do{
    System.out.println("En gång till");
    nummret=(int) ((Math.random()*5+1)+9);
    System.out.println("Numret xxxx");
    }while(!cx.equals(Integer.toHexString(nummret)));
    System.out.println("Rätt nummer framslumpat SLUT");
    }
    
}
