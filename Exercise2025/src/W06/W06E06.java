public class W06E06{
    public static void main(String[] args) {
        String str = "Ang,Tan,Fong,Ahmad,Ali";

        String[] names = str.split(",");

        for (String name : names){
            System.out.println(name);
        }
        
    }
}