public class zad2 {
    public static String[] getwords(String in){
        return in.split("[, .]");
    }
    public static int wordam(String in){
        return getwords(in).length;
    }
    public static String getShortestWorld(String in){
        String[] words = getwords(in);
        String shortest = words[0];
        for (int i = 1; i < words.length; i++) {
            if(shortest.length()>words[i].length()){
                shortest = words[i];
            }

        }
        return shortest;
    }
    public static String getLongestWorld(String in){
        String[] words = getwords(in);
        String shortest = words[0];
        for (int i = 1; i < words.length; i++) {
            if(shortest.length()<words[i].length()){
                shortest = words[i];
            }

        }
        return shortest;
    }
    public static String getFirstAlfabeticalWorld(String in){
        String[] words = getwords(in);
        String shortest = words[0];
        for (int i = 1; i < words.length; i++) {
            if(compareWorlds(words[i],shortest)){
                shortest = words[i];
            }

        }
        return shortest;
    }
    public static String getLastAlfabeticalWorld(String in){
        String[] words = getwords(in);
        String shortest = words[0];
        for (int i = 1; i < words.length; i++) {
            if(compareWorlds(shortest,words[i])){
                shortest = words[i];
            }

        }
        return shortest;
    }

    public static boolean compareWorlds(String a,String b){
        for (int i = 0; i < Math.min(a.length(),b.length()); i++) {
            if (a.charAt(i)<b.charAt(i)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(getLastAlfabeticalWorld("Ala ma kota, a ola ma psa"));
        System.out.println(getFirstAlfabeticalWorld("Ala ma kota, a ola ma psa"));
    }
}
