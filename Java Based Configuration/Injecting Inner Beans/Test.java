import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class Test {
    public static void main(String args[]) {
    ApplicationContext ctx = new AnnotationConfigApplicationContext(TextEditorConfig.class);
    TextEditor t1 = ctx.getBean(TextEditor.class);
    t1.spellCheck();
    }
}