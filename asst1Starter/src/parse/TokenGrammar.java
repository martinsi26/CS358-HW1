
package parse;
import java.util.List;

// enhancements in assignment:
// - none

import errorMsg.*;

public class TokenGrammar implements wrangLR.runtime.MessageObject
{

    public TokenGrammar(ErrorMsg em)
    {
        errorMsg = em;
    }
    private ErrorMsg errorMsg;

    public void error(int pos, CompError err)
    {
        errorMsg.error(pos, err);
    }

    public void warning(int pos, CompWarning warn)
    {
        errorMsg.warning(pos, warn);
    }


    public void reportTok(int pos, String s)
    {
        errorMsg.token(pos, s);
    }

    // These 2 methods are needed by WrangLR
    // DO NOT USE THEM! They will not pass tests
    public void warning(int pos, String warn)
    {
        errorMsg.info(pos, warn);
    }
    public void error(int pos, String err)
    {
        errorMsg.error(pos, err);
    }


    //////////////////////////////////////////////////////////////////////
    //////// Syntactic-level grammar, which simply recognizes any sequence
    //////// of tokens, and  prints each one
    //////////////////////////////////////////////////////////////////////

    // start-production
    //: start ::= white* token*

    // productions that recognize and print each type of token
    //: token ::= # `boolean =>
    public void sawBoolean(int pos)
    {
        reportTok(pos, "`boolean");
    }
    //: token ::= # `class =>
    public void sawClass(int pos)
    {
        reportTok(pos, "`class");
    }
    //: token ::= # `extends =>
    public void sawExtends(int pos)
    {
        reportTok(pos, "`extends");
    }
    //: token ::= # `void =>
    public void sawVoid(int pos)
    {
        reportTok(pos, "`void");
    }
    //: token ::= # `int =>
    public void sawInt(int pos)
    {
        reportTok(pos, "`int");
    }
    //: token ::= # `while =>
    public void sawWhile(int pos)
    {
        reportTok(pos, "`while");
    }
    //: token ::= # `if =>
    public void sawIf(int pos)
    {
        reportTok(pos, "`if");
    }
    //: token ::= # `else =>
    public void sawElse(int pos)
    {
        reportTok(pos, "`else");
    }
    //: token ::= # `for =>
    public void sawFor(int pos)
    {
        reportTok(pos, "`for");
    }
    //: token ::= # `break =>
    public void sawBreak(int pos)
    {
        reportTok(pos, "`break");
    }
    //: token ::= # `this =>
    public void sawThis(int pos)
    {
        reportTok(pos, "`this");
    }
    //: token ::= # `false =>
    public void sawFalse(int pos)
    {
        reportTok(pos, "`false");
    }
    //: token ::= # `true =>
    public void sawTrue(int pos)
    {
        reportTok(pos, "`true");
    }
    //: token ::= # `super =>
    public void sawSuper(int pos)
    {
        reportTok(pos, "`super");
    }
    //: token ::= # `null =>
    public void sawNull(int pos)
    {
        reportTok(pos, "`null");
    }
    //: token ::= # `return =>
    public void sawReturn(int pos)
    {
        reportTok(pos, "`return");
    }
    //: token ::= # `instanceof =>
    public void sawInstanceof(int pos)
    {
        reportTok(pos, "`instanceof");
    }
    //: token ::= # `new =>
    public void sawNew(int pos)
    {
        reportTok(pos, "`new");
    }
    //: token ::= # `abstract =>
    public void sawAbstract(int pos)
    {
        reportTok(pos, "`abstract");
    }
    //: token ::= # `assert =>
    public void sawAssert(int pos)
    {
        reportTok(pos, "`assert");
    }
    //: token ::= # `byte =>
    public void sawByte(int pos)
    {
        reportTok(pos, "`byte");
    }
    //: token ::= # `case =>
    public void sawCase(int pos)
    {
        reportTok(pos, "`case");
    }
    //: token ::= # `catch =>
    public void sawCatch(int pos)
    {
        reportTok(pos, "`catch");
    }
    //: token ::= # `char =>
    public void sawChar(int pos)
    {
        reportTok(pos, "`char");
    }
    //: token ::= # `const =>
    public void sawConst(int pos)
    {
        reportTok(pos, "`const");
    }
    //: token ::= # `continue =>
    public void sawContinue(int pos)
    {
        reportTok(pos, "`continue");
    }
    //: token ::= # `default =>
    public void sawDefault(int pos)
    {
        reportTok(pos, "`default");
    }
    //: token ::= # `do =>
    public void sawDo(int pos)
    {
        reportTok(pos, "`do");
    }
    //: token ::= # `double =>
    public void sawDouble(int pos)
    {
        reportTok(pos, "`double");
    }
    //: token ::= # `enum =>
    public void sawEnum(int pos)
    {
        reportTok(pos, "`enum");
    }
    //: token ::= # `final =>
    public void sawFinal(int pos)
    {
        reportTok(pos, "`final");
    }
    //: token ::= # `finally =>
    public void sawFinally(int pos)
    {
        reportTok(pos, "`finally");
    }
    //: token ::= # `float =>
    public void sawFloat(int pos)
    {
        reportTok(pos, "`float");
    }
    //: token ::= # `goto =>
    public void sawGoto(int pos)
    {
        reportTok(pos, "`goto");
    }
    //: token ::= # `implements =>
    public void sawImplements(int pos)
    {
        reportTok(pos, "`implements");
    }
    //: token ::= # `import =>
    public void sawImport(int pos)
    {
        reportTok(pos, "`import");
    }
    //: token ::= # `interface =>
    public void sawInterface(int pos)
    {
        reportTok(pos, "`interface");
    }
    //: token ::= # `long =>
    public void sawLong(int pos)
    {
        reportTok(pos, "`long");
    }
    //: token ::= # `native =>
    public void sawNative(int pos)
    {
        reportTok(pos, "`native");
    }
    //: token ::= # `package =>
    public void sawPackage(int pos)
    {
        reportTok(pos, "`package");
    }
    //: token ::= # `private =>
    public void sawPrivate(int pos)
    {
        reportTok(pos, "`private");
    }
    //: token ::= # `protected =>
    public void sawProtected(int pos)
    {
        reportTok(pos, "`protected");
    }
    //: token ::= # `public =>
    public void sawPublic(int pos)
    {
        reportTok(pos, "`public");
    }
    //: token ::= # `short =>
    public void sawShort(int pos)
    {
        reportTok(pos, "`short");
    }
    //: token ::= # `static =>
    public void sawStatic(int pos)
    {
        reportTok(pos, "`static");
    }
    //: token ::= # `strictfp =>
    public void sawStrictfp(int pos)
    {
        reportTok(pos, "`strictfp");
    }
    //: token ::= # `switch =>
    public void sawSwitch(int pos)
    {
        reportTok(pos, "`switch");
    }
    //: token ::= # `synchronized =>
    public void sawSynchronized(int pos)
    {
        reportTok(pos, "`synchronized");
    }
    //: token ::= # `throw =>
    public void sawThrow(int pos)
    {
        reportTok(pos, "`throw");
    }
    //: token ::= # `throws =>
    public void sawThrows(int pos)
    {
        reportTok(pos, "`throws");
    }
    //: token ::= # `transient =>
    public void sawTransient(int pos)
    {
        reportTok(pos, "`transient");
    }
    //: token ::= # `try =>
    public void sawTry(int pos)
    {
        reportTok(pos, "`try");
    }
    //: token ::= # `volatile =>
    public void sawVolatile(int pos)
    {
        reportTok(pos, "`volatile");
    }

    //: token ::= # `! =>
    public void sawNot(int pos)
    {
        reportTok(pos, "`!");
    }
    //: token ::= # `!= =>
    public void sawNotEqual(int pos)
    {
        reportTok(pos, "`!=");
    }
    //: token ::= # `% =>
    public void sawRemainder(int pos)
    {
        reportTok(pos, "`%");
    }
    //: token ::= # `&& =>
    public void sawAnd(int pos)
    {
        reportTok(pos, "`&&");
    }
    //: token ::= # `* =>
    public void sawTimes(int pos)
    {
        reportTok(pos, "`*");
    }
    //: token ::= # `( =>
    public void sawLpar(int pos)
    {
        reportTok(pos, "`(");
    }
    //: token ::= # `) =>
    public void sawRpar(int pos)
    {
        reportTok(pos, "`)");
    }
    //: token ::= # `{ =>
    public void sawLbrace(int pos)
    {
        reportTok(pos, "`{");
    }
    //: token ::= # `} =>
    public void sawRbrace(int pos)
    {
        reportTok(pos, "`}");
    }
    //: token ::= # `- =>
    public void sawMinus(int pos)
    {
        reportTok(pos, "`-");
    }
    //: token ::= # `+ =>
    public void sawPlus(int pos)
    {
        reportTok(pos, "`+");
    }
    //: token ::= # `= =>
    public void sawAssign(int pos)
    {
        reportTok(pos, "`=");
    }
    //: token ::= # `== =>
    public void sawEqual(int pos)
    {
        reportTok(pos, "`==");
    }
    //: token ::= # `[ =>
    public void sawLbrack(int pos)
    {
        reportTok(pos, "`[");
    }
    //: token ::= # `] =>
    public void sawRbrack(int pos)
    {
        reportTok(pos, "`]");
    }
    //: token ::= # `|| =>
    public void sawOr(int pos)
    {
        reportTok(pos, "`||");
    }
    //: token ::= # `< =>
    public void sawLess(int pos)
    {
        reportTok(pos, "`<");
    }
    //: token ::= # `<= =>
    public void sawLessEq(int pos)
    {
        reportTok(pos, "`<=");
    }
    //: token ::= # `, =>
    public void sawComma(int pos)
    {
        reportTok(pos, "`,");
    }
    //: token ::= # `> =>
    public void sawGreater(int pos)
    {
        reportTok(pos, "`>");
    }
    //: token ::= # `>= =>
    public void sawGreaterEq(int pos)
    {
        reportTok(pos, "`>=");
    }
    //: token ::= # `. =>
    public void sawDot(int pos)
    {
        reportTok(pos, "`.");
    }
    //: token ::= # `; =>
    public void sawSemi(int pos)
    {
        reportTok(pos, "`;");
    }
    //: token ::= # `++ =>
    public void sawPlusPlus(int pos)
    {
        reportTok(pos, "`++");
    }
    //: token ::= # `-- =>
    public void sawMinusMinus(int pos)
    {
        reportTok(pos, "`--");
    }
    //: token ::= # `/ =>
    public void sawSlash(int pos)
    {
        reportTok(pos, "`/");
    }
    //: token ::= # `: =>
    public void sawColon(int pos)
    {
        reportTok(pos, "`:");
    }

    //: token ::= # ID =>
    public void identifier(int pos, String s)
    {
        reportTok(pos, "identifier: "+s);
    }

    //: token ::= # INT_LITERAL =>
    public void intLit(int pos, int n)
    {
        reportTok(pos, "integer literal: "+n);
    }

    //: token ::= # STRING_LITERAL =>
    public void stringLit(int pos, String s)
    {
        reportTok(pos, "string literal: "+s);
    }

    //: token ::= # CHARACTER_LITERAL =>
    public void charLit(int pos, int n)
    {
        reportTok(pos, "character literal with ASCII value: "+n);
    }

    //////////////////////////////////////////
    ////Your modifications should start here
    //////////////////////////////////////////

    //================================================================
    // the actual tokens
    //================================================================

    // reserved words
    //: `class ::= "class" !idChar white*
    //: `else ::= "else" !idChar white*
    //: `boolean ::= "boolean" !idChar white*
    //: `extends ::= "extends" !idChar white*
    //: `void ::= "void" !idChar white*
    //: `int ::= "int" !idChar white*
    //: `while ::= "while" !idChar white*
    //: `if ::= "if" !idChar white*
    //: `for ::= "for" !idChar white*
    //: `break ::= "break" !idChar white*
    //: `this ::= "this" !idChar white*
    //: `false ::= "false" !idChar white*
    //: `true ::= "true" !idChar white*
    //: `super ::= "super" !idChar white*
    //: `null ::= "null" !idChar white*
    //: `return ::= "return" !idChar white*
    //: `instanceof ::= "instanceof" !idChar white*
    //: `new ::= "new" !idChar white*
    //: `abstract ::= "abstract" !idChar white*
    //: `assert ::= "assert" !idChar white*
    //: `byte ::= "byte" !idChar white*
    //: `case ::= "case" !idChar white*
    //: `catch ::= "catch" !idChar white*
    //: `char ::= "char" !idChar white*
    //: `const ::= "const" !idChar white*
    //: `continue ::= "continue" !idChar white*
    //: `default ::= "default" !idChar white*
    //: `do ::= "do" !idChar white*
    //: `double ::= "double" !idChar white*
    //: `enum ::= "enum" !idChar white*
    //: `final ::= "final" !idChar white*
    //: `finally ::= "finally" !idChar white*
    //: `float ::= "float" !idChar white*
    //: `goto ::= "goto" !idChar white*
    //: `implements ::= "implements" !idChar white*
    //: `import ::= "import" !idChar white*
    //: `interface ::= "interface" !idChar white*
    //: `long ::= "long" !idChar white*
    //: `native ::= "native" !idChar white*
    //: `package ::= "package" !idChar white*
    //: `private ::= "private" !idChar white*
    //: `protected ::= "protected" !idChar white*
    //: `public ::= "public" !idChar white*
    //: `short ::= "short" !idChar white*
    //: `static ::= "static" !idChar white*
    //: `strictfp ::= "strictfp" !idChar white*
    //: `switch ::= "switch" !idChar white*
    //: `synchronized ::= "synchronized" !idChar white*
    //: `throw ::= "throw" !idChar white*
    //: `throws ::= "throws" !idChar white*
    //: `transient ::= "transient" !idChar white*
    //: `try ::= "try" !idChar white*
    //: `volatile ::= "volatile" !idChar white*

    //: reserved ::= `class
    //: reserved ::= `else
    //: reserved ::= `boolean
    //: reserved ::= `extends
    //: reserved ::= `void
    //: reserved ::= `int
    //: reserved ::= `while
    //: reserved ::= `if
    //: reserved ::= `for
    //: reserved ::= `break
    //: reserved ::= `this
    //: reserved ::= `false
    //: reserved ::= `true
    //: reserved ::= `super
    //: reserved ::= `null
    //: reserved ::= `return
    //: reserved ::= `instanceof
    //: reserved ::= `new
    //: reserved ::= `abstract
    //: reserved ::= `assert
    //: reserved ::= `byte
    //: reserved ::= `case
    //: reserved ::= `catch
    //: reserved ::= `char
    //: reserved ::= `const
    //: reserved ::= `continue
    //: reserved ::= `default
    //: reserved ::= `do
    //: reserved ::= `double
    //: reserved ::= `enum
    //: reserved ::= `final
    //: reserved ::= `finally
    //: reserved ::= `float
    //: reserved ::= `goto
    //: reserved ::= `implements
    //: reserved ::= `import
    //: reserved ::= `interface
    //: reserved ::= `long
    //: reserved ::= `native
    //: reserved ::= `package
    //: reserved ::= `private
    //: reserved ::= `protected
    //: reserved ::= `public
    //: reserved ::= `short
    //: reserved ::= `static
    //: reserved ::= `strictfp
    //: reserved ::= `switch
    //: reserved ::= `synchronized
    //: reserved ::= `throw
    //: reserved ::= `throws
    //: reserved ::= `transient
    //: reserved ::= `try
    //: reserved ::= `volatile

    //special-token characters
    //: `! ::= "!" !"=" white*
    //: `!= ::= "!=" white*
    //: `= ::= "=" !"=" white*
    //: `== ::= "==" white*
    //: `< ::= "<" !"=" white*
    //: `<= ::= "<=" white*
    //: `> ::= ">" !"=" white*
    //: `>= ::= ">=" white*
    //: `+ ::= "+" !"+" white*
    //: `++ ::= "++" white*
    //: `- ::= "-" !"-" white*
    //: `-- ::= "--" white*
    //: `* ::= "*" white*
    //: `% ::= "%" white*
    //: `&& ::= "&&" white*
    //: `( ::= "(" white*
    //: `) ::= ")" white*
    //: `{ ::= "{" white*
    //: `} ::= "}" white*
    //: `[ ::= "[" white*
    //: `] ::= "]" white*
    //: `|| ::= "||" white*
    //: `. ::= "." white*
    //: `, ::= "," white*
    //: `: ::= ":" white*
    //: `; ::= ";" white*
    //: `/ ::= !comment "/" white*

    //: identifier ::= letter idChar** => pass
    //: ID ::= !reserved identifier white* =>
    public String makeIdentifier(char letter, List<Character> s) 
    {
        return letter + s.toString();
    }

    // a numeric literal
    //: INT_LITERAL ::= # digit++ white* =>
    public int convertToInt(int pos, List<Character> s)
    {
        try
        {
            return Integer.parseInt(s.toString());
        }
        catch (NumberFormatException nfx)
        {
            error(pos, new OutOfRangeError(s.toString()));
            return 0;
        }
    }

    //: dq ::= '"' => void
    //: stringChar ::= !dq printable => pass
    //: STRING_LITERAL ::= dq stringChar* dq white* =>
    public String makeString(List<Character> s) 
    {
        return s.toString();
    }

    //: sq ::= "'" => void
    //: CHARACTER_LITERAL ::= sq printable sq white* =>
    public int makeChar(char printable)
    {
        return (int)printable;
    }

    //================================================================
    // character patterns -- "helper symbols"
    //================================================================

    // a character that can be a non-first character in an identifier
    //: idChar ::= letter => pass
    //: idChar ::= digit => pass
    //: idChar ::= "_" => pass

    // a letter
    //: letter ::= {"a".."z" "A".."Z"} => pass

    // a digit
    //: digit ::= {"0".."9"} => pass

    //================================================================
    // whitespace
    //================================================================

    // whitespace
    //: white ::= {" " 9 12} // space or tab or form feed
    //: white ::= eol
    //: white ::= comment

    //================================================================
    // comments
    //================================================================

    //======================//
    // single line comments //
    //======================//
    //: ds ::= "//" => void
    //: comment ::= ds printable**

    //=====================//
    // multi line comments //
    //=====================//
    //: star ::= "*" !"/"
    //: comment_printable ::= {32..41 43..126} // exclude *
    //: comment_stuff ::= comment_printable
    //: comment_stuff ::= star
    //: comment_stuff ::= eol
    //: comment ::= "/*" comment_stuff** "*/"

    // to handle the common end-of-line sequences on different types
    // of systems, we treat the sequence CR+LF as an end of line.
    // Otherwise, we treat CR or LF appearing separately each as an
    // end of line.
    //: eol ::= {10} registerNewline
    //: eol ::= {13} {10} registerNewline
    //: eol ::= {13} !{10} registerNewline

    // empty symbol which registers a new line at the position reduced
    //: registerNewline ::= # =>
    public void registerNewline(int pos)
    {
        errorMsg.newline(pos-1);
    }

    // Potentially useful definitions
    // printable is any character than shows up when you type
    //: printable ::= {" ".."~"} => pass

    // eof is the end of file. It does not match any character.
    //: eof ::= !{0..255} => void

    //////////// DUMMY TOKEN AND WHITESPACE DEFINITIONS ////////////
    // Once you create a real definition for one of the below, it will
    // reduce the number of states of you remove (or comment out) the
    // dummy definition.
    ////////////////////////////////////////////////////////////////
    
    public int return0(char dummy) { return 0; }

}
