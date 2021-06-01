public class TextEditor{
    private SpellChecker spellChecker;
    
    public TextEditor(SpellChecker spellChecker){
        System.out.println("TextEditor Constructor is invoked.");
        this.spellChecker = spellChecker;
    }
    
    public void spellCheck(){
        System.out.println("SpellCheck Method is invoked.");
        spellChecker.checkSpelling();
    }
}