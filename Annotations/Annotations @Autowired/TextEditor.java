import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor{
    
    private SpellChecker spellCheck;
    TextEditor(){
        System.out.println("TextEditor Constructor is invoked.");
    }
    @Autowired
    public void setSpellCheck(SpellChecker spellCheck){
        System.out.println("SetSpellChecker Method is invoked.");
        this.spellCheck = spellCheck;
    }
    
    public SpellChecker getSpellCheck(){
        return spellCheck;
    }
    
    public void display(){
        spellCheck.checkSpelling();
    }
}