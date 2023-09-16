public class StringBuilderTest {
    static String concat(String[] arr){
        StringBuilder result = new StringBuilder();
        for(String s : arr){
            result.append(s);
            System.out.println("null‚Û");
        }
        return result.toString();
    }
    
    static void stringBuilderToUpperCase(StringBuilder sb){
        for(int i = 0; i < sb.length(); i++){
            char c = sb.charAt(i);
            char uc = Character.toUpperCase(c);
            sb.setCharAt(i, uc);
        }
    }
    
    public static void main(String[] args){
        if(args.length < 1){
            System.out.println("ˆø”‚É•¶Žš—ñ‚ðŽw’è‚µ‚Ä‚­‚¾‚³‚¢");
            System.exit(-1);
        }
        
        //StringBuilder input = new StringBuilder(args[0]);
        //stringBuilderToUpperCase(input);
        //System.out.println(input);

        String s = concat(args);
        System.out.println(s);
        String a = Integer.toString(255, 16);
        System.out.println(a);
    }
}
