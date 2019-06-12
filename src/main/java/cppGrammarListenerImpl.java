import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.BufferedWriter;
import java.io.IOException;

public class cppGrammarListenerImpl implements cpp_grammarListener {

    private BufferedWriter writer;
    private int fileSize = 0;
    static int countsigns=0;
    private static String accessoperator="";
    private boolean is_extended=false;
    private boolean is_class=false;

    private String indent="";

    cppGrammarListenerImpl(BufferedWriter writer, int fileSize) {
        this.fileSize = fileSize;
        this.writer = writer;
    }

    public void enterFile(cpp_grammarParser.FileContext ctx) { }

    public void exitFile(cpp_grammarParser.FileContext ctx) { }

    public void enterClassdeclaration(cpp_grammarParser.ClassdeclarationContext ctx) {

        try {
            writer.write("public ");
        } catch (IOException e) {
            e.printStackTrace();
        }
        is_class=true;

    }

    public void exitClassdeclaration(cpp_grammarParser.ClassdeclarationContext ctx) { }

    @Override
    public void enterAccessection1(cpp_grammarParser.Accessection1Context ctx) { }

    @Override
    public void exitAccessection1(cpp_grammarParser.Accessection1Context ctx) { }

    @Override
    public void enterAccessection2(cpp_grammarParser.Accessection2Context ctx) { }

    @Override
    public void exitAccessection2(cpp_grammarParser.Accessection2Context ctx) { }

    @Override
    public void enterExtendsop(cpp_grammarParser.ExtendsopContext ctx) {
        is_extended=true;
    }

    @Override
    public void exitExtendsop(cpp_grammarParser.ExtendsopContext ctx) { }


    public void enterClassprefix(cpp_grammarParser.ClassprefixContext ctx) { }

    public void exitClassprefix(cpp_grammarParser.ClassprefixContext ctx) { }

    public void enterEnumdeclaration(cpp_grammarParser.EnumdeclarationContext ctx) { }

    public void exitEnumdeclaration(cpp_grammarParser.EnumdeclarationContext ctx) {

    }

    @Override
    public void enterConstructor(cpp_grammarParser.ConstructorContext ctx) {

        try {
            writer.write("\n");
            writer.write(indent);
            writer.write(accessoperator+" ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitConstructor(cpp_grammarParser.ConstructorContext ctx) { }

    @Override
    public void enterDestructor(cpp_grammarParser.DestructorContext ctx) { }

    @Override
    public void exitDestructor(cpp_grammarParser.DestructorContext ctx) { }

    public void enterFunction(cpp_grammarParser.FunctionContext ctx) {
        try {
            writer.write("\n");
            writer.write(indent);
            if(!accessoperator.equals(""))
                writer.write(accessoperator+" ");
            else
                writer.write("");
        } catch (IOException e) {
            e.printStackTrace();
        }
        indent+=" ";

    }

    public void exitFunction(cpp_grammarParser.FunctionContext ctx) { }

    @Override
    public void enterNoargfunction(cpp_grammarParser.NoargfunctionContext ctx) {

        try {
            writer.write("\n");
            writer.write(indent);
            if(!accessoperator.equals(""))
                writer.write(accessoperator+" ");
            else
                writer.write("");
        } catch (IOException e) {
            e.printStackTrace();
        }
        indent+=" ";

    }

    @Override
    public void exitNoargfunction(cpp_grammarParser.NoargfunctionContext ctx) { }

    public void enterSwitchloop(cpp_grammarParser.SwitchloopContext ctx) { }

    public void exitSwitchloop(cpp_grammarParser.SwitchloopContext ctx) { }

    @Override
    public void enterIfstatement(cpp_grammarParser.IfstatementContext ctx) { }

    @Override
    public void exitIfstatement(cpp_grammarParser.IfstatementContext ctx) { }

    public void enterForloop(cpp_grammarParser.ForloopContext ctx) { }

    public void exitForloop(cpp_grammarParser.ForloopContext ctx) { }

    public void enterWhileloop(cpp_grammarParser.WhileloopContext ctx) { }

    public void exitWhileloop(cpp_grammarParser.WhileloopContext ctx) {


        try {
            writer.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public void enterBody(cpp_grammarParser.BodyContext ctx) { }

    public void exitBody(cpp_grammarParser.BodyContext ctx) {
        try {
            writer.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void enterOperation(cpp_grammarParser.OperationContext ctx) { }

    public void exitOperation(cpp_grammarParser.OperationContext ctx) {

        try {
            writer.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public void enterCondition(cpp_grammarParser.ConditionContext ctx) { }

    public void exitCondition(cpp_grammarParser.ConditionContext ctx) { }

    public void enterNamespacedeclaration(cpp_grammarParser.NamespacedeclarationContext ctx) { }

    public void exitNamespacedeclaration(cpp_grammarParser.NamespacedeclarationContext ctx) { }

    @Override
    public void enterPointerassign(cpp_grammarParser.PointerassignContext ctx) {

        try {
            writer.write(indent);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void exitPointerassign(cpp_grammarParser.PointerassignContext ctx) { }

    public void enterPreprocessordirective(cpp_grammarParser.PreprocessordirectiveContext ctx) { }

    public void exitPreprocessordirective(cpp_grammarParser.PreprocessordirectiveContext ctx) { }

    public void enterFunctiondeclaration(cpp_grammarParser.FunctiondeclarationContext ctx) {

        try {
            writer.write(indent);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void exitFunctiondeclaration(cpp_grammarParser.FunctiondeclarationContext ctx) { }

    public void enterTabledeclaration(cpp_grammarParser.TabledeclarationContext ctx) { }

    public void exitTabledeclaration(cpp_grammarParser.TabledeclarationContext ctx) { }

    public void enterVariabledeclaration(cpp_grammarParser.VariabledeclarationContext ctx) {
        try {
            writer.write(indent);
            if(!accessoperator.equals(null)) {
                writer.write(accessoperator+" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void exitVariabledeclaration(cpp_grammarParser.VariabledeclarationContext ctx) {

        try {
            writer.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void enterPrinttext(cpp_grammarParser.PrinttextContext ctx) { }

    public void exitPrinttext(cpp_grammarParser.PrinttextContext ctx) {

        try {
            writer.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void enterInputtext(cpp_grammarParser.InputtextContext ctx) { }

    public void exitInputtext(cpp_grammarParser.InputtextContext ctx) {
        try {
            writer.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public void enterTable(cpp_grammarParser.TableContext ctx) {

        try {
            writer.write(ctx.getText());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void exitTable(cpp_grammarParser.TableContext ctx) { }

    @Override
    public void enterSpecialtypes(cpp_grammarParser.SpecialtypesContext ctx) {

        try {
            writer.write(ctx.getText()+" ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitSpecialtypes(cpp_grammarParser.SpecialtypesContext ctx) {

    }

    public void enterAccessoperator(cpp_grammarParser.AccessoperatorContext ctx) {

        accessoperator=ctx.getText();

       /* try {
            writer.write(indent+ctx.getText()+" ");
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
        indent+="";

    }

    public void exitAccessoperator(cpp_grammarParser.AccessoperatorContext ctx) {


    }

    public void enterSimpleoperators(cpp_grammarParser.SimpleoperatorsContext ctx) {

        try {
            writer.write(ctx.getText());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void exitSimpleoperators(cpp_grammarParser.SimpleoperatorsContext ctx) {


    }

    public void enterAssignoperatior(cpp_grammarParser.AssignoperatiorContext ctx) {

        try {
            writer.write(ctx.getText());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void exitAssignoperatior(cpp_grammarParser.AssignoperatiorContext ctx) {

      /*  try {
            writer.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        */
    }

    public void enterDecincoperator(cpp_grammarParser.DecincoperatorContext ctx) {

        try {
            writer.write(ctx.getText());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void exitDecincoperator(cpp_grammarParser.DecincoperatorContext ctx) {

    }

    public void enterCincout(cpp_grammarParser.CincoutContext ctx) {
        String text=ctx.getText();
        if(text.equals("cout")){
            try {
                writer.write(indent+"System.println.out");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(text.equals("cin")) {
            try {
                writer.write(indent+"Scanner reader = new Scanner(System.in);\n");
                writer.write(indent+"int x=");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void exitCincout(cpp_grammarParser.CincoutContext ctx) {
        String text=ctx.getText();

        if(text.equals("cin")) {
            try {
                writer.write("reader.nextInt");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void enterIfoperator(cpp_grammarParser.IfoperatorContext ctx) {

        try {
            writer.write(ctx.getText());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitIfoperator(cpp_grammarParser.IfoperatorContext ctx) {

    }

    public void enterExproperator(cpp_grammarParser.ExproperatorContext ctx) {

        try {
            if(ctx.getText().equals("return")){
                writer.write(indent+ctx.getText()+" ");
            }
            else
            writer.write(indent+ctx.getText());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void exitExproperator(cpp_grammarParser.ExproperatorContext ctx) {

    }

    @Override
    public void enterClasssign(cpp_grammarParser.ClasssignContext ctx) {

        try {
            writer.write(ctx.getText()+" ");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void exitClasssign(cpp_grammarParser.ClasssignContext ctx) { }

    @Override
    public void enterPointer(cpp_grammarParser.PointerContext ctx) {

        try {
            writer.write(".");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void exitPointer(cpp_grammarParser.PointerContext ctx) { }

    public void enterLogicoperators(cpp_grammarParser.LogicoperatorsContext ctx) {

        try {
            writer.write(ctx.getText());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void exitLogicoperators(cpp_grammarParser.LogicoperatorsContext ctx) { }

    public void enterSimpletypespecifier(cpp_grammarParser.SimpletypespecifierContext ctx) {

        try {
            writer.write(ctx.getText()+" ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void exitSimpletypespecifier(cpp_grammarParser.SimpletypespecifierContext ctx) { }

    public void enterTextsign(cpp_grammarParser.TextsignContext ctx) {

        if(countsigns==0) {
            countsigns++;
            try {
                writer.write("(");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(countsigns==1){
            countsigns=0;
            try {
                writer.write(")");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void exitTextsign(cpp_grammarParser.TextsignContext ctx) { }

    public void enterStylesign(cpp_grammarParser.StylesignContext ctx) {

        try {
            if(ctx.getText().equals("{")||ctx.getText().equals("}")) {

                if(ctx.getText().equals("{")) {
                    indent+=" ";
                    writer.write(ctx.getText());
                    if(is_class==true){
                        writer.write("\n");
                        is_class=false;
                    }
                    writer.write("\n");
                }
                else {
                    indent = indent.substring(0, indent.length() - 1);
                    writer.write("\n");
                    writer.write(indent + ctx.getText());
                    //writer.write("\n");
                }
            }
            else if(ctx.getText().equals(":"))
                writer.write(ctx.getText()+"\n");
            else
                writer.write(ctx.getText());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void exitStylesign(cpp_grammarParser.StylesignContext ctx) { }


    @Override
    public void enterColon(cpp_grammarParser.ColonContext ctx) {

        if(is_extended==true){

            try {
                writer.write(" extends ");
            } catch (IOException e) {
                e.printStackTrace();
            }
        is_extended=false;
        }

    }

    @Override
    public void exitColon(cpp_grammarParser.ColonContext ctx) { }

    public void enterVariablevalue(cpp_grammarParser.VariablevalueContext ctx) {

        try {
            writer.write(ctx.getText());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void exitVariablevalue(cpp_grammarParser.VariablevalueContext ctx) { }

    @Override
    public void enterClassname(cpp_grammarParser.ClassnameContext ctx) { }

    @Override
    public void exitClassname(cpp_grammarParser.ClassnameContext ctx) { }

    public void enterVariablename(cpp_grammarParser.VariablenameContext ctx) {

        try {
            writer.write(ctx.getText());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void exitVariablename(cpp_grammarParser.VariablenameContext ctx) { }

    @Override
    public void enterText(cpp_grammarParser.TextContext ctx) {
        try {
            writer.write(ctx.getText());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void exitText(cpp_grammarParser.TextContext ctx) { }


    public void visitTerminal(TerminalNode terminalNode) { }

    public void visitErrorNode(ErrorNode errorNode) { }

    public void enterEveryRule(ParserRuleContext parserRuleContext) { }

    public void exitEveryRule(ParserRuleContext parserRuleContext) { }
}