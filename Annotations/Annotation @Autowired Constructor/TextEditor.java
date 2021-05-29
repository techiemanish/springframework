import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor{
    
    private SpellChecker spellCheck;
    @Autowired
    TextEditor(SpellChecker spellCheck){
        System.out.println("TextEditor Constructor is invoked.");
        this.spellCheck = spellCheck;
    }
    
    public void display(){
        spellCheck.checkSpelling();
    }
}