public class Phrase {
   private String Phrase;

   private Phrase nextPhrase;

    public void addWorld(String world){
        if(Phrase == null)Phrase = world;
        else {
            if (nextPhrase == null) nextPhrase = new Phrase();
            nextPhrase.addWorld(world);
        }
    }
    public void show(){

        if (nextPhrase != null){
            System.out.print(Phrase+" ");
            nextPhrase.show();
        }else {
        System.out.println(Phrase);
        }

    }
}
