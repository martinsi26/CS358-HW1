package
parse
;
import
java
.
util
.
List
;
import
errorMsg
.
*
;
public class TokenGrammarParseTable implements wrangLR.runtime.ParseTable {
public int getEofSym() { return 149; }
public int getNttSym() { return 150; }
private String[] symNameTable = {
"$$start",
"start",
"white*",
"$$0",
"token",
"`boolean",
"`class",
"`extends",
"`void",
"`int",
"`while",
"`if",
"`else",
"`for",
"`break",
"`this",
"`false",
"`true",
"`super",
"`null",
"`return",
"`instanceof",
"`new",
"`abstract",
"`assert",
"`byte",
"`case",
"`catch",
"`char",
"`const",
"`continue",
"`default",
"`do",
"`double",
"`enum",
"`final",
"`finally",
"`float",
"`goto",
"`implements",
"`import",
"`interface",
"`long",
"`native",
"`package",
"`private",
"`protected",
"`public",
"`short",
"`static",
"`strictfp",
"`switch",
"`synchronized",
"`throw",
"`throws",
"`transient",
"`try",
"`volatile",
"`!",
"`!=",
"`%",
"`&&",
"`*",
"`(",
"`)",
"`{",
"`}",
"`-",
"`+",
"`=",
"`==",
"`[",
"`]",
"`||",
"`<",
"`<=",
"`,",
"`>",
"`>=",
"`.",
"`;",
"`++",
"`--",
"`/",
"`:",
"ID",
"INT_LITERAL",
"STRING_LITERAL",
"CHARACTER_LITERAL",
"\"c\"",
"\"l\"",
"\"a\"",
"\"s\"",
"idChar",
"\"e\"",
"\"b\"",
"\"o\"",
"\"n\"",
"\"x\"",
"\"t\"",
"\"d\"",
"\"v\"",
"\"i\"",
"\"w\"",
"\"h\"",
"\"f\"",
"\"r\"",
"\"k\"",
"\"u\"",
"255",
"\"!\"",
"\"=\"",
"\"<\"",
"\">\"",
"\"+\"",
"\"-\"",
"\"*\"",
"\"%\"",
"\"&\"",
"\"(\"",
"\")\"",
"\"{\"",
"\"}\"",
"\"[\"",
"\"]\"",
"\"|\"",
"\".\"",
"\",\"",
"\":\"",
"\";\"",
"\"/\"",
"digit++",
"sq",
"\"\'\"",
"printable",
"letter",
"digit",
"\"_\"",
"{\"A\"..\"Z\" \"g\" \"j\" \"m\" \"p\"..\"q\" \"y\"..\"z\"}",
"{\"0\"..\"9\"}",
"white",
"\" \"",
"{9 12}",
"eol",
"10",
"13",
"{\'\"\'..\"$\" \"?\"..\"@\" \"\\\" \"^\" \"`\" \"~\"}",
"token*",
"digit+",
"$",
"$NT",
};
public String symName(int n) {
 return n >= 0 && n < symNameTable.length ? symNameTable[n] : "??";
}
private TokenGrammar actionObject;
public int[][] getParseTable() { return parseTable; }
public int numSymbols() { return 151;}
private static final int MIN_REDUCTION = 287;
public int minReduction() { return MIN_REDUCTION;}
private static final int MAX_ACCEPT_REDUCTION = MIN_REDUCTION+1;
public int maxAcceptReduction() { return MAX_ACCEPT_REDUCTION; }
private final int[][] parseTable;
public void error(int pos, String msg){
 if (((Object)actionObject) instanceof wrangLR.runtime.MessageObject)
 ((wrangLR.runtime.MessageObject)(Object)actionObject).error(pos,msg);
 else System.err.println("file position "+pos+": "+msg);}
public void warning(int pos, String msg){
 if (((Object)actionObject) instanceof wrangLR.runtime.MessageObject)
 ((wrangLR.runtime.MessageObject)(Object)actionObject).warning(pos,msg);
 else System.err.println("file position "+pos+"(warning): "+msg);}
public String filePosString(int pos){
 if (((Object)actionObject) instanceof wrangLR.runtime.FilePosObject)
 return ((wrangLR.runtime.FilePosObject)(Object)actionObject).filePosString(pos);
 else return ""+pos;}
public boolean parse(java.io.InputStream is) {
	return new wrangLR.runtime.BaseParser(this).parse(is);
}
public boolean parse(java.io.InputStream is, int verboseLevel, boolean verboseReductions) {
	return new wrangLR.runtime.BaseParser(this,verboseLevel,verboseReductions).parse(is);
}
private class Initter1{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 0
-1, // $$start
68, // start
20, // white*
163, // $$0
206, // token
207, // `boolean
118, // `class
192, // `extends
117, // `void
62, // `int
254, // `while
275, // `if
95, // `else
242, // `for
71, // `break
224, // `this
173, // `false
272, // `true
223, // `super
15, // `null
211, // `return
56, // `instanceof
124, // `new
280, // `abstract
73, // `assert
209, // `byte
25, // `case
47, // `catch
87, // `char
270, // `const
70, // `continue
170, // `default
237, // `do
111, // `double
151, // `enum
184, // `final
52, // `finally
180, // `float
77, // `goto
175, // `implements
91, // `import
255, // `interface
116, // `long
101, // `native
59, // `package
231, // `private
188, // `protected
19, // `public
145, // `short
26, // `static
45, // `strictfp
44, // `switch
142, // `synchronized
41, // `throw
265, // `throws
12, // `transient
57, // `try
208, // `volatile
79, // `!
105, // `!=
233, // `%
181, // `&&
166, // `*
245, // `(
179, // `)
100, // `{
160, // `}
6, // `-
51, // `+
277, // `=
11, // `==
212, // `[
216, // `]
164, // `||
156, // `<
264, // `<=
186, // `,
30, // `>
134, // `>=
29, // `.
232, // `;
167, // `++
196, // `--
86, // `/
97, // `:
256, // ID
16, // INT_LITERAL
146, // STRING_LITERAL
267, // CHARACTER_LITERAL
284, // "c"
-1, // "l"
-1, // "a"
-1, // "s"
-1, // idChar
194, // "e"
24, // "b"
-1, // "o"
-1, // "n"
-1, // "x"
222, // "t"
-1, // "d"
226, // "v"
258, // "i"
130, // "w"
-1, // "h"
202, // "f"
-1, // "r"
-1, // "k"
-1, // "u"
-1, // {255}
140, // "!"
244, // "="
60, // "<"
103, // ">"
99, // "+"
42, // "-"
229, // "*"
217, // "%"
199, // "&"
278, // "("
37, // ")"
147, // "{"
88, // "}"
55, // "["
81, // "]"
214, // "|"
80, // "."
14, // ","
22, // ":"
190, // ";"
23, // "/"
75, // digit++
195, // sq
61, // "'"
-1, // printable
-1, // letter
234, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "p".."q" "y".."z"}
159, // {"0".."9"}
17, // white
218, // " "
218, // {9 12}
13, // eol
178, // {10}
261, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
63, // token*
94, // digit+
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 1
  }
,
{ // state 2
2,215, // white*
140,76, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 3
94,213, // "e"
  }
,
{ // state 4
2,274, // white*
140,76, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 5
140,98, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 6
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 7
2,247, // white*
140,76, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 8
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 9
140,98, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 10
92,219, // "s"
  }
,
{ // state 11
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 12
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 13
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 14
2,187, // white*
140,76, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 15
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 16
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 17
MIN_REDUCTION+231, // (default reduction)
  }
,
{ // state 18
0x80000000|1, // match move
0x80000000|285, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 19
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 20
-1, // $$start
-1, // start
-1, // white*
8, // $$0
206, // token
207, // `boolean
118, // `class
192, // `extends
117, // `void
62, // `int
254, // `while
275, // `if
95, // `else
242, // `for
71, // `break
224, // `this
173, // `false
272, // `true
223, // `super
15, // `null
211, // `return
56, // `instanceof
124, // `new
280, // `abstract
73, // `assert
209, // `byte
25, // `case
47, // `catch
87, // `char
270, // `const
70, // `continue
170, // `default
237, // `do
111, // `double
151, // `enum
184, // `final
52, // `finally
180, // `float
77, // `goto
175, // `implements
91, // `import
255, // `interface
116, // `long
101, // `native
59, // `package
231, // `private
188, // `protected
19, // `public
145, // `short
26, // `static
45, // `strictfp
44, // `switch
142, // `synchronized
41, // `throw
265, // `throws
12, // `transient
57, // `try
208, // `volatile
79, // `!
105, // `!=
233, // `%
181, // `&&
166, // `*
245, // `(
179, // `)
100, // `{
160, // `}
6, // `-
51, // `+
277, // `=
11, // `==
212, // `[
216, // `]
164, // `||
156, // `<
264, // `<=
186, // `,
30, // `>
134, // `>=
29, // `.
232, // `;
167, // `++
196, // `--
86, // `/
97, // `:
256, // ID
16, // INT_LITERAL
146, // STRING_LITERAL
267, // CHARACTER_LITERAL
284, // "c"
-1, // "l"
-1, // "a"
-1, // "s"
-1, // idChar
194, // "e"
24, // "b"
-1, // "o"
-1, // "n"
-1, // "x"
222, // "t"
-1, // "d"
226, // "v"
258, // "i"
130, // "w"
-1, // "h"
202, // "f"
-1, // "r"
-1, // "k"
-1, // "u"
-1, // {255}
140, // "!"
244, // "="
60, // "<"
103, // ">"
99, // "+"
42, // "-"
229, // "*"
217, // "%"
199, // "&"
278, // "("
37, // ")"
147, // "{"
88, // "}"
55, // "["
81, // "]"
214, // "|"
80, // "."
14, // ","
22, // ":"
190, // ";"
23, // "/"
75, // digit++
195, // sq
61, // "'"
-1, // printable
-1, // letter
234, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "p".."q" "y".."z"}
159, // {"0".."9"}
227, // white
218, // " "
218, // {9 12}
13, // eol
178, // {10}
261, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
63, // token*
94, // digit+
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 21
2,40, // white*
140,76, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 22
2,114, // white*
140,76, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 23
2,191, // white*
140,76, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 24
96,182, // "o"
106,248, // "r"
  }
,
{ // state 25
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 26
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 27
140,98, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 28
94,64, // "e"
  }
,
{ // state 29
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 30
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 31
2,104, // white*
140,76, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 32
2,92, // white*
140,76, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 33
94,260, // "e"
  }
,
{ // state 34
140,98, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 35
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 36
2,69, // white*
140,76, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 37
2,83, // white*
140,76, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 38
140,98, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 39
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 40
140,98, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 41
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 42
0x80000000|252, // match move
0x80000000|155, // no-match move
// T-test match for "-":
115,
  }
,
{ // state 43
140,98, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 44
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 45
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 46
140,98, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 47
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 48
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 49
107,50, // "k"
  }
,
{ // state 50
0x80000000|1, // match move
0x80000000|154, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 51
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 52
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 53
92,228, // "s"
  }
,
{ // state 54
2,169, // white*
140,76, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 55
2,198, // white*
140,76, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 56
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 57
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 58
89,135, // "c"
90,135, // "l"
91,135, // "a"
92,135, // "s"
94,135, // "e"
95,135, // "b"
96,135, // "o"
97,135, // "n"
98,135, // "x"
99,135, // "t"
100,135, // "d"
101,135, // "v"
102,135, // "i"
103,135, // "w"
104,135, // "h"
105,135, // "f"
106,135, // "r"
107,135, // "k"
108,135, // "u"
135,241, // letter
136,115, // digit
137,273, // "_"
138,135, // {"A".."Z" "g" "j" "m" "p".."q" "y".."z"}
139,133, // {"0".."9"}
  }
,
{ // state 59
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 60
0x80000000|225, // match move
0x80000000|21, // no-match move
// T-test match for "=":
111,
  }
,
{ // state 61
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 62
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 63
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
39, // token
207, // `boolean
118, // `class
192, // `extends
117, // `void
62, // `int
254, // `while
275, // `if
95, // `else
242, // `for
71, // `break
224, // `this
173, // `false
272, // `true
223, // `super
15, // `null
211, // `return
56, // `instanceof
124, // `new
280, // `abstract
73, // `assert
209, // `byte
25, // `case
47, // `catch
87, // `char
270, // `const
70, // `continue
170, // `default
237, // `do
111, // `double
151, // `enum
184, // `final
52, // `finally
180, // `float
77, // `goto
175, // `implements
91, // `import
255, // `interface
116, // `long
101, // `native
59, // `package
231, // `private
188, // `protected
19, // `public
145, // `short
26, // `static
45, // `strictfp
44, // `switch
142, // `synchronized
41, // `throw
265, // `throws
12, // `transient
57, // `try
208, // `volatile
79, // `!
105, // `!=
233, // `%
181, // `&&
166, // `*
245, // `(
179, // `)
100, // `{
160, // `}
6, // `-
51, // `+
277, // `=
11, // `==
212, // `[
216, // `]
164, // `||
156, // `<
264, // `<=
186, // `,
30, // `>
134, // `>=
29, // `.
232, // `;
167, // `++
196, // `--
86, // `/
97, // `:
256, // ID
16, // INT_LITERAL
146, // STRING_LITERAL
267, // CHARACTER_LITERAL
284, // "c"
-1, // "l"
-1, // "a"
-1, // "s"
-1, // idChar
194, // "e"
24, // "b"
-1, // "o"
-1, // "n"
-1, // "x"
222, // "t"
-1, // "d"
226, // "v"
258, // "i"
130, // "w"
-1, // "h"
202, // "f"
-1, // "r"
-1, // "k"
-1, // "u"
-1, // {255}
140, // "!"
244, // "="
60, // "<"
103, // ">"
99, // "+"
42, // "-"
229, // "*"
217, // "%"
199, // "&"
278, // "("
37, // ")"
147, // "{"
88, // "}"
55, // "["
81, // "]"
214, // "|"
80, // "."
14, // ","
22, // ":"
190, // ";"
23, // "/"
75, // digit++
195, // sq
61, // "'"
-1, // printable
-1, // letter
234, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "p".."q" "y".."z"}
159, // {"0".."9"}
-1, // white
-1, // " "
-1, // {9 12}
-1, // eol
-1, // {10}
-1, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
94, // digit+
MIN_REDUCTION+234, // $
-1, // $NT
  }
,
{ // state 64
97,174, // "n"
  }
,
{ // state 65
0x80000000|1, // match move
0x80000000|122, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 66
2,34, // white*
140,76, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 67
0x80000000|1, // match move
0x80000000|109, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 68
149,MIN_REDUCTION+0, // $
  }
,
{ // state 69
140,98, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 70
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 71
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 72
0x80000000|1, // match move
0x80000000|84, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 73
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 74
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 75
2,144, // white*
140,76, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 76
MIN_REDUCTION+231, // (default reduction)
  }
,
{ // state 77
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 78
139,133, // {"0".."9"}
  }
,
{ // state 79
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 80
2,251, // white*
140,76, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 81
2,230, // white*
140,76, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 82
111,239, // "="
  }
,
{ // state 83
140,98, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 84
2,176, // white*
140,76, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 85
0x80000000|240, // match move
0x80000000|108, // no-match move
0x80000000|78, // NT-test-match state for digit
  }
,
{ // state 86
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 87
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 88
2,149, // white*
140,76, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 89
2,90, // white*
140,76, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 90
140,98, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 91
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 92
140,98, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 93
2,203, // white*
140,76, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 94
0x80000000|236, // match move
0x80000000|249, // no-match move
0x80000000|78, // NT-test-match state for digit
  }
,
{ // state 95
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 96
140,98, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 97
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 98
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 99
0x80000000|113, // match move
0x80000000|4, // no-match move
// T-test match for "+":
114,
  }
,
{ // state 100
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 101
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 102
99,28, // "t"
  }
,
{ // state 103
0x80000000|193, // match move
0x80000000|136, // no-match move
// T-test match for "=":
111,
  }
,
{ // state 104
140,98, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 105
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 106
MIN_REDUCTION+222, // (default reduction)
  }
,
{ // state 107
140,98, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 108
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 109
2,137, // white*
140,76, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 110
0x80000000|1, // match move
0x80000000|7, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 111
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 112
140,98, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 113
114,89, // "+"
  }
,
{ // state 114
140,98, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 115
150,MIN_REDUCTION+215, // $NT
  }
,
{ // state 116
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 117
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 118
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 119
102,263, // "i"
  }
,
{ // state 120
106,246, // "r"
  }
,
{ // state 121
140,98, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 122
2,96, // white*
140,76, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 123
0x80000000|1, // match move
0x80000000|93, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 124
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 125
90,3, // "l"
  }
,
{ // state 126
111,276, // "="
  }
,
{ // state 127
0x80000000|1, // match move
0x80000000|66, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 128
2,46, // white*
140,76, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 129
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 130
104,253, // "h"
  }
,
{ // state 131
132,220, // sq
133,201, // "'"
  }
,
{ // state 132
2,158, // white*
140,76, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 133
150,MIN_REDUCTION+218, // $NT
  }
,
{ // state 134
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 135
150,MIN_REDUCTION+217, // $NT
  }
,
{ // state 136
2,27, // white*
140,76, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 137
140,98, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 138
140,98, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 139
94,65, // "e"
  }
,
{ // state 140
0x80000000|126, // match move
0x80000000|165, // no-match move
// T-test match for "=":
111,
  }
,
{ // state 141
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 142
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 143
99,200, // "t"
  }
,
{ // state 144
140,98, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 145
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 146
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 147
2,38, // white*
140,76, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 148
91,49, // "a"
  }
,
{ // state 149
140,98, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 150
0x80000000|1, // match move
0x80000000|36, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 151
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 152
140,98, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 153
140,98, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 154
2,152, // white*
140,76, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 155
2,138, // white*
140,76, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 156
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 157
140,98, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 158
140,98, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 159
0x80000000|197, // match move
0x80000000|129, // no-match move
0x80000000|78, // NT-test-match state for digit
  }
,
{ // state 160
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 161
2,107, // white*
140,76, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 162
144,106, // {10}
  }
,
{ // state 163
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 164
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 165
2,9, // white*
140,76, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 166
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 167
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 168
144,281, // {10}
  }
,
{ // state 169
140,98, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 170
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 171
2,157, // white*
140,76, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 172
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 173
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 174
100,262, // "d"
  }
,
{ // state 175
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 176
140,98, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 177
91,53, // "a"
  }
,
{ // state 178
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 179
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 180
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 181
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 182
96,125, // "o"
  }
,
{ // state 183
97,18, // "n"
  }
,
{ // state 184
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 185
92,269, // "s"
  }
,
{ // state 186
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 187
140,98, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 188
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 189
140,98, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 190
2,204, // white*
140,76, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 191
140,98, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 192
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 193
111,210, // "="
  }
,
{ // state 194
90,259, // "l"
98,102, // "x"
  }
,
{ // state 195
89,172, // "c"
90,172, // "l"
91,172, // "a"
92,172, // "s"
94,172, // "e"
95,172, // "b"
96,172, // "o"
97,172, // "n"
98,172, // "x"
99,172, // "t"
100,172, // "d"
101,172, // "v"
102,172, // "i"
103,172, // "w"
104,172, // "h"
105,172, // "f"
106,172, // "r"
107,172, // "k"
108,172, // "u"
110,172, // "!"
111,172, // "="
112,172, // "<"
113,172, // ">"
114,172, // "+"
115,172, // "-"
116,172, // "*"
117,172, // "%"
118,172, // "&"
119,172, // "("
120,172, // ")"
121,172, // "{"
122,172, // "}"
123,172, // "["
124,172, // "]"
125,172, // "|"
126,172, // "."
127,172, // ","
128,172, // ":"
129,172, // ";"
130,172, // "/"
133,172, // "'"
134,131, // printable
137,172, // "_"
138,172, // {"A".."Z" "g" "j" "m" "p".."q" "y".."z"}
139,172, // {"0".."9"}
141,172, // " "
146,172, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 196
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 197
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 198
140,98, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 199
118,31, // "&"
  }
,
{ // state 200
0x80000000|1, // match move
0x80000000|32, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 201
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 202
91,279, // "a"
96,120, // "o"
  }
,
{ // state 203
140,98, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 204
140,98, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 205
94,123, // "e"
  }
,
{ // state 206
MIN_REDUCTION+228, // (default reduction)
  }
,
{ // state 207
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 208
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 209
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 210
2,282, // white*
140,76, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 211
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 212
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 213
91,183, // "a"
  }
,
{ // state 214
125,283, // "|"
  }
,
{ // state 215
140,98, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 216
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 217
2,189, // white*
140,76, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 218
MIN_REDUCTION+219, // (default reduction)
  }
,
{ // state 219
94,67, // "e"
  }
,
{ // state 220
2,43, // white*
140,76, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 221
90,33, // "l"
  }
,
{ // state 222
104,238, // "h"
106,257, // "r"
  }
,
{ // state 223
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 224
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 225
111,128, // "="
  }
,
{ // state 226
96,119, // "o"
  }
,
{ // state 227
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 228
92,150, // "s"
  }
,
{ // state 229
2,5, // white*
140,76, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 230
140,98, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 231
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 232
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 233
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 234
0x80000000|141, // match move
0x80000000|74, // no-match move
0x80000000|78, // NT-test-match state for digit
  }
,
{ // state 235
MIN_REDUCTION+219, // (default reduction)
  }
,
{ // state 236
136,85, // digit
139,159, // {"0".."9"}
  }
,
{ // state 237
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 238
102,185, // "i"
  }
,
{ // state 239
2,153, // white*
140,76, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 240
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 241
150,MIN_REDUCTION+214, // $NT
  }
,
{ // state 242
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 243
0x80000000|162, // match move
0x80000000|35, // no-match move
// T-test match for 10:
144,
  }
,
{ // state 244
0x80000000|82, // match move
0x80000000|132, // no-match move
// T-test match for "=":
111,
  }
,
{ // state 245
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 246
0x80000000|1, // match move
0x80000000|54, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 247
140,98, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 248
94,148, // "e"
  }
,
{ // state 249
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 250
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 251
140,98, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 252
115,161, // "-"
  }
,
{ // state 253
102,221, // "i"
  }
,
{ // state 254
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 255
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 256
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 257
108,139, // "u"
  }
,
{ // state 258
97,143, // "n"
105,127, // "f"
  }
,
{ // state 259
92,205, // "s"
  }
,
{ // state 260
0x80000000|1, // match move
0x80000000|171, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 261
0x80000000|168, // match move
0x80000000|48, // no-match move
// T-test match for 10:
144,
  }
,
{ // state 262
92,72, // "s"
  }
,
{ // state 263
100,110, // "d"
  }
,
{ // state 264
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 265
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 266
140,98, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 267
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 268
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 269
0x80000000|1, // match move
0x80000000|2, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 270
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 271
140,98, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 272
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 273
150,MIN_REDUCTION+216, // $NT
  }
,
{ // state 274
140,98, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 275
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 276
2,121, // white*
140,76, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 277
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 278
2,266, // white*
140,76, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 279
90,10, // "l"
  }
,
{ // state 280
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 281
MIN_REDUCTION+222, // (default reduction)
  }
,
{ // state 282
140,98, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 283
2,112, // white*
140,76, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 284
90,177, // "l"
  }
,
{ // state 285
2,271, // white*
140,76, // white
141,235, // " "
142,235, // {9 12}
143,268, // eol
144,250, // {10}
145,243, // {13}
MIN_REDUCTION+94, // (default reduction)
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[286][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
}
public int[] getProdTable() { return prodTable; }
private static int[] prodTable = {
// $$start ::= start
(0<<16)+1,
// $$start ::=
(0<<16)+0,
// start ::= white* $$0
(1<<16)+2,
// start ::= white*
(1<<16)+1,
// start ::= $$0
(1<<16)+1,
// token ::= `boolean
(4<<16)+1,
// token ::= `class
(4<<16)+1,
// token ::= `extends
(4<<16)+1,
// token ::= `void
(4<<16)+1,
// token ::= `int
(4<<16)+1,
// token ::= `while
(4<<16)+1,
// token ::= `if
(4<<16)+1,
// token ::= `else
(4<<16)+1,
// token ::= `for
(4<<16)+1,
// token ::= `break
(4<<16)+1,
// token ::= `this
(4<<16)+1,
// token ::= `false
(4<<16)+1,
// token ::= `true
(4<<16)+1,
// token ::= `super
(4<<16)+1,
// token ::= `null
(4<<16)+1,
// token ::= `return
(4<<16)+1,
// token ::= `instanceof
(4<<16)+1,
// token ::= `new
(4<<16)+1,
// token ::= `abstract
(4<<16)+1,
// token ::= `assert
(4<<16)+1,
// token ::= `byte
(4<<16)+1,
// token ::= `case
(4<<16)+1,
// token ::= `catch
(4<<16)+1,
// token ::= `char
(4<<16)+1,
// token ::= `const
(4<<16)+1,
// token ::= `continue
(4<<16)+1,
// token ::= `default
(4<<16)+1,
// token ::= `do
(4<<16)+1,
// token ::= `double
(4<<16)+1,
// token ::= `enum
(4<<16)+1,
// token ::= `final
(4<<16)+1,
// token ::= `finally
(4<<16)+1,
// token ::= `float
(4<<16)+1,
// token ::= `goto
(4<<16)+1,
// token ::= `implements
(4<<16)+1,
// token ::= `import
(4<<16)+1,
// token ::= `interface
(4<<16)+1,
// token ::= `long
(4<<16)+1,
// token ::= `native
(4<<16)+1,
// token ::= `package
(4<<16)+1,
// token ::= `private
(4<<16)+1,
// token ::= `protected
(4<<16)+1,
// token ::= `public
(4<<16)+1,
// token ::= `short
(4<<16)+1,
// token ::= `static
(4<<16)+1,
// token ::= `strictfp
(4<<16)+1,
// token ::= `switch
(4<<16)+1,
// token ::= `synchronized
(4<<16)+1,
// token ::= `throw
(4<<16)+1,
// token ::= `throws
(4<<16)+1,
// token ::= `transient
(4<<16)+1,
// token ::= `try
(4<<16)+1,
// token ::= `volatile
(4<<16)+1,
// token ::= `!
(4<<16)+1,
// token ::= `!=
(4<<16)+1,
// token ::= `%
(4<<16)+1,
// token ::= `&&
(4<<16)+1,
// token ::= `*
(4<<16)+1,
// token ::= `(
(4<<16)+1,
// token ::= `)
(4<<16)+1,
// token ::= `{
(4<<16)+1,
// token ::= `}
(4<<16)+1,
// token ::= `-
(4<<16)+1,
// token ::= `+
(4<<16)+1,
// token ::= `=
(4<<16)+1,
// token ::= `==
(4<<16)+1,
// token ::= `[
(4<<16)+1,
// token ::= `]
(4<<16)+1,
// token ::= `||
(4<<16)+1,
// token ::= `<
(4<<16)+1,
// token ::= `<=
(4<<16)+1,
// token ::= `,
(4<<16)+1,
// token ::= `>
(4<<16)+1,
// token ::= `>=
(4<<16)+1,
// token ::= `.
(4<<16)+1,
// token ::= `;
(4<<16)+1,
// token ::= `++
(4<<16)+1,
// token ::= `--
(4<<16)+1,
// token ::= `/
(4<<16)+1,
// token ::= `:
(4<<16)+1,
// token ::= ID
(4<<16)+1,
// token ::= INT_LITERAL
(4<<16)+1,
// token ::= STRING_LITERAL
(4<<16)+1,
// token ::= CHARACTER_LITERAL
(4<<16)+1,
// `class ::= "c" "l" "a" "s" "s" !idChar white*
(6<<16)+6,
// `class ::= "c" "l" "a" "s" "s" !idChar
(6<<16)+5,
// `else ::= "e" "l" "s" "e" !idChar white*
(12<<16)+5,
// `else ::= "e" "l" "s" "e" !idChar
(12<<16)+4,
// `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar white*
(5<<16)+8,
// `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar
(5<<16)+7,
// `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar white*
(7<<16)+8,
// `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar
(7<<16)+7,
// `void ::= "v" "o" "i" "d" !idChar white*
(8<<16)+5,
// `void ::= "v" "o" "i" "d" !idChar
(8<<16)+4,
// `int ::= "i" "n" "t" !idChar white*
(9<<16)+4,
// `int ::= "i" "n" "t" !idChar
(9<<16)+3,
// `while ::= "w" "h" "i" "l" "e" !idChar white*
(10<<16)+6,
// `while ::= "w" "h" "i" "l" "e" !idChar
(10<<16)+5,
// `if ::= "i" "f" !idChar white*
(11<<16)+3,
// `if ::= "i" "f" !idChar
(11<<16)+2,
// `for ::= "f" "o" "r" !idChar white*
(13<<16)+4,
// `for ::= "f" "o" "r" !idChar
(13<<16)+3,
// `break ::= "b" "r" "e" "a" "k" !idChar white*
(14<<16)+6,
// `break ::= "b" "r" "e" "a" "k" !idChar
(14<<16)+5,
// `this ::= "t" "h" "i" "s" !idChar white*
(15<<16)+5,
// `this ::= "t" "h" "i" "s" !idChar
(15<<16)+4,
// `false ::= "f" "a" "l" "s" "e" !idChar white*
(16<<16)+6,
// `false ::= "f" "a" "l" "s" "e" !idChar
(16<<16)+5,
// `true ::= "t" "r" "u" "e" !idChar white*
(17<<16)+5,
// `true ::= "t" "r" "u" "e" !idChar
(17<<16)+4,
// `super ::= !255 {255}
(18<<16)+1,
// `null ::= !255 {255}
(19<<16)+1,
// `return ::= !255 {255}
(20<<16)+1,
// `instanceof ::= !255 {255}
(21<<16)+1,
// `new ::= !255 {255}
(22<<16)+1,
// `abstract ::= !255 {255}
(23<<16)+1,
// `assert ::= !255 {255}
(24<<16)+1,
// `byte ::= !255 {255}
(25<<16)+1,
// `case ::= !255 {255}
(26<<16)+1,
// `catch ::= !255 {255}
(27<<16)+1,
// `char ::= !255 {255}
(28<<16)+1,
// `const ::= !255 {255}
(29<<16)+1,
// `continue ::= !255 {255}
(30<<16)+1,
// `default ::= !255 {255}
(31<<16)+1,
// `do ::= !255 {255}
(32<<16)+1,
// `double ::= !255 {255}
(33<<16)+1,
// `enum ::= !255 {255}
(34<<16)+1,
// `final ::= !255 {255}
(35<<16)+1,
// `finally ::= !255 {255}
(36<<16)+1,
// `float ::= !255 {255}
(37<<16)+1,
// `goto ::= !255 {255}
(38<<16)+1,
// `implements ::= !255 {255}
(39<<16)+1,
// `import ::= !255 {255}
(40<<16)+1,
// `interface ::= !255 {255}
(41<<16)+1,
// `long ::= !255 {255}
(42<<16)+1,
// `native ::= !255 {255}
(43<<16)+1,
// `package ::= !255 {255}
(44<<16)+1,
// `private ::= !255 {255}
(45<<16)+1,
// `protected ::= !255 {255}
(46<<16)+1,
// `public ::= !255 {255}
(47<<16)+1,
// `short ::= !255 {255}
(48<<16)+1,
// `static ::= !255 {255}
(49<<16)+1,
// `strictfp ::= !255 {255}
(50<<16)+1,
// `switch ::= !255 {255}
(51<<16)+1,
// `synchronized ::= !255 {255}
(52<<16)+1,
// `throw ::= !255 {255}
(53<<16)+1,
// `throws ::= !255 {255}
(54<<16)+1,
// `transient ::= !255 {255}
(55<<16)+1,
// `try ::= !255 {255}
(56<<16)+1,
// `volatile ::= !255 {255}
(57<<16)+1,
// `! ::= "!" !"=" white*
(58<<16)+2,
// `! ::= "!" !"="
(58<<16)+1,
// `!= ::= "!" "=" white*
(59<<16)+3,
// `!= ::= "!" "="
(59<<16)+2,
// `= ::= "=" !"=" white*
(69<<16)+2,
// `= ::= "=" !"="
(69<<16)+1,
// `== ::= "=" "=" white*
(70<<16)+3,
// `== ::= "=" "="
(70<<16)+2,
// `< ::= "<" !"=" white*
(74<<16)+2,
// `< ::= "<" !"="
(74<<16)+1,
// `<= ::= "<" "=" white*
(75<<16)+3,
// `<= ::= "<" "="
(75<<16)+2,
// `> ::= ">" !"=" white*
(77<<16)+2,
// `> ::= ">" !"="
(77<<16)+1,
// `>= ::= ">" "=" white*
(78<<16)+3,
// `>= ::= ">" "="
(78<<16)+2,
// `+ ::= "+" !"+" white*
(68<<16)+2,
// `+ ::= "+" !"+"
(68<<16)+1,
// `++ ::= "+" "+" white*
(81<<16)+3,
// `++ ::= "+" "+"
(81<<16)+2,
// `- ::= "-" !"-" white*
(67<<16)+2,
// `- ::= "-" !"-"
(67<<16)+1,
// `-- ::= "-" "-" white*
(82<<16)+3,
// `-- ::= "-" "-"
(82<<16)+2,
// `* ::= "*" white*
(62<<16)+2,
// `* ::= "*"
(62<<16)+1,
// `% ::= "%" white*
(60<<16)+2,
// `% ::= "%"
(60<<16)+1,
// `&& ::= "&" "&" white*
(61<<16)+3,
// `&& ::= "&" "&"
(61<<16)+2,
// `( ::= "(" white*
(63<<16)+2,
// `( ::= "("
(63<<16)+1,
// `) ::= ")" white*
(64<<16)+2,
// `) ::= ")"
(64<<16)+1,
// `{ ::= "{" white*
(65<<16)+2,
// `{ ::= "{"
(65<<16)+1,
// `} ::= "}" white*
(66<<16)+2,
// `} ::= "}"
(66<<16)+1,
// `[ ::= "[" white*
(71<<16)+2,
// `[ ::= "["
(71<<16)+1,
// `] ::= "]" white*
(72<<16)+2,
// `] ::= "]"
(72<<16)+1,
// `|| ::= "|" "|" white*
(73<<16)+3,
// `|| ::= "|" "|"
(73<<16)+2,
// `. ::= "." white*
(79<<16)+2,
// `. ::= "."
(79<<16)+1,
// `, ::= "," white*
(76<<16)+2,
// `, ::= ","
(76<<16)+1,
// `: ::= ":" white*
(84<<16)+2,
// `: ::= ":"
(84<<16)+1,
// `; ::= ";" white*
(80<<16)+2,
// `; ::= ";"
(80<<16)+1,
// `/ ::= "/" white*
(83<<16)+2,
// `/ ::= "/"
(83<<16)+1,
// INT_LITERAL ::= digit++ white*
(86<<16)+2,
// INT_LITERAL ::= digit++
(86<<16)+1,
// sq ::= "'"
(132<<16)+1,
// CHARACTER_LITERAL ::= sq printable sq white*
(88<<16)+4,
// CHARACTER_LITERAL ::= sq printable sq
(88<<16)+3,
// idChar ::= letter
(93<<16)+1,
// idChar ::= digit
(93<<16)+1,
// idChar ::= "_"
(93<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(135<<16)+1,
// digit ::= {"0".."9"}
(136<<16)+1,
// white ::= {9 12 " "}
(140<<16)+1,
// white ::= eol
(140<<16)+1,
// eol ::= {10}
(143<<16)+1,
// eol ::= {13} {10}
(143<<16)+2,
// eol ::= {13} !10
(143<<16)+1,
// printable ::= {" ".."~"}
(134<<16)+1,
// ID ::= !255 {255}
(85<<16)+1,
// STRING_LITERAL ::= !255 {255}
(87<<16)+1,
// token* ::= token* token
(147<<16)+2,
// token* ::= token
(147<<16)+1,
// digit++ ::= digit+ !digit
(131<<16)+1,
// white* ::= white* white
(2<<16)+2,
// white* ::= white
(2<<16)+1,
// digit+ ::= digit
(148<<16)+1,
// digit+ ::= digit+ digit
(148<<16)+2,
// $$0 ::= token*
(3<<16)+1,
};
public int[] getCharMapTable() { return charMapTable; }
private static int[] charMapTable = {
-1, // 0
-1, // 1
-1, // 2
-1, // 3
-1, // 4
-1, // 5
-1, // 6
-1, // 7
-1, // 8
142, // 9
144, // 10
-1, // 11
142, // 12
145, // 13
-1, // 14
-1, // 15
-1, // 16
-1, // 17
-1, // 18
-1, // 19
-1, // 20
-1, // 21
-1, // 22
-1, // 23
-1, // 24
-1, // 25
-1, // 26
-1, // 27
-1, // 28
-1, // 29
-1, // 30
-1, // 31
141, // " "
110, // "!"
146, // '"'
146, // "#"
146, // "$"
117, // "%"
118, // "&"
133, // "'"
119, // "("
120, // ")"
116, // "*"
114, // "+"
127, // ","
115, // "-"
126, // "."
130, // "/"
139, // "0"
139, // "1"
139, // "2"
139, // "3"
139, // "4"
139, // "5"
139, // "6"
139, // "7"
139, // "8"
139, // "9"
128, // ":"
129, // ";"
112, // "<"
111, // "="
113, // ">"
146, // "?"
146, // "@"
138, // "A"
138, // "B"
138, // "C"
138, // "D"
138, // "E"
138, // "F"
138, // "G"
138, // "H"
138, // "I"
138, // "J"
138, // "K"
138, // "L"
138, // "M"
138, // "N"
138, // "O"
138, // "P"
138, // "Q"
138, // "R"
138, // "S"
138, // "T"
138, // "U"
138, // "V"
138, // "W"
138, // "X"
138, // "Y"
138, // "Z"
123, // "["
146, // "\"
124, // "]"
146, // "^"
137, // "_"
146, // "`"
91, // "a"
95, // "b"
89, // "c"
100, // "d"
94, // "e"
105, // "f"
138, // "g"
104, // "h"
102, // "i"
138, // "j"
107, // "k"
90, // "l"
138, // "m"
97, // "n"
96, // "o"
138, // "p"
138, // "q"
106, // "r"
92, // "s"
99, // "t"
108, // "u"
101, // "v"
103, // "w"
98, // "x"
138, // "y"
138, // "z"
121, // "{"
125, // "|"
122, // "}"
146, // "~"
-1, // 127
-1, // 128
-1, // 129
-1, // 130
-1, // 131
-1, // 132
-1, // 133
-1, // 134
-1, // 135
-1, // 136
-1, // 137
-1, // 138
-1, // 139
-1, // 140
-1, // 141
-1, // 142
-1, // 143
-1, // 144
-1, // 145
-1, // 146
-1, // 147
-1, // 148
-1, // 149
-1, // 150
-1, // 151
-1, // 152
-1, // 153
-1, // 154
-1, // 155
-1, // 156
-1, // 157
-1, // 158
-1, // 159
-1, // 160
-1, // 161
-1, // 162
-1, // 163
-1, // 164
-1, // 165
-1, // 166
-1, // 167
-1, // 168
-1, // 169
-1, // 170
-1, // 171
-1, // 172
-1, // 173
-1, // 174
-1, // 175
-1, // 176
-1, // 177
-1, // 178
-1, // 179
-1, // 180
-1, // 181
-1, // 182
-1, // 183
-1, // 184
-1, // 185
-1, // 186
-1, // 187
-1, // 188
-1, // 189
-1, // 190
-1, // 191
-1, // 192
-1, // 193
-1, // 194
-1, // 195
-1, // 196
-1, // 197
-1, // 198
-1, // 199
-1, // 200
-1, // 201
-1, // 202
-1, // 203
-1, // 204
-1, // 205
-1, // 206
-1, // 207
-1, // 208
-1, // 209
-1, // 210
-1, // 211
-1, // 212
-1, // 213
-1, // 214
-1, // 215
-1, // 216
-1, // 217
-1, // 218
-1, // 219
-1, // 220
-1, // 221
-1, // 222
-1, // 223
-1, // 224
-1, // 225
-1, // 226
-1, // 227
-1, // 228
-1, // 229
-1, // 230
-1, // 231
-1, // 232
-1, // 233
-1, // 234
-1, // 235
-1, // 236
-1, // 237
-1, // 238
-1, // 239
-1, // 240
-1, // 241
-1, // 242
-1, // 243
-1, // 244
-1, // 245
-1, // 246
-1, // 247
-1, // 248
-1, // 249
-1, // 250
-1, // 251
-1, // 252
-1, // 253
-1, // 254
109, // 255
};
public String[] getActionProdNameTable() { return actionProdNameTable; }
private String[] actionProdNameTable = {
"", // 0
"", // 1
"", // 2
"", // 3
"", // 4
"", // 5
"", // 6
"", // 7
"", // 8
"", // 9
"", // 10
"", // 11
"", // 12
"", // 13
"", // 14
"", // 15
"", // 16
"", // 17
"", // 18
"", // 19
"", // 20
"", // 21
"", // 22
"", // 23
"", // 24
"", // 25
"", // 26
"", // 27
"", // 28
"", // 29
"", // 30
"", // 31
"", // 32
"", // 33
"", // 34
"", // 35
"", // 36
"", // 37
"", // 38
"", // 39
"", // 40
"", // 41
"", // 42
"", // 43
"", // 44
"", // 45
"", // 46
"", // 47
"", // 48
"", // 49
"", // 50
"", // 51
"", // 52
"", // 53
"", // 54
"", // 55
"", // 56
"", // 57
"", // 58
"", // 59
"", // 60
"", // 61
"", // 62
"", // 63
"", // 64
"", // 65
"", // 66
"", // 67
"", // 68
"", // 69
"", // 70
"", // 71
"", // 72
"", // 73
"", // 74
"", // 75
"", // 76
"", // 77
"", // 78
"", // 79
"", // 80
"", // 81
"", // 82
"", // 83
"", // 84
"", // 85
"", // 86
"", // 87
"", // 88
"", // 89
"", // 90
"", // 91
"", // 92
"", // 93
"", // 94
"", // 95
"", // 96
"", // 97
"", // 98
"", // 99
"", // 100
"", // 101
"", // 102
"", // 103
"", // 104
"", // 105
"", // 106
"", // 107
"", // 108
"", // 109
"", // 110
"", // 111
"", // 112
"", // 113
"", // 114
"", // 115
"", // 116
"", // 117
"", // 118
"", // 119
"", // 120
"", // 121
"", // 122
"", // 123
"", // 124
"", // 125
"", // 126
"", // 127
"", // 128
"", // 129
"", // 130
"", // 131
"", // 132
"", // 133
"", // 134
"", // 135
"", // 136
"", // 137
"", // 138
"", // 139
"", // 140
"", // 141
"", // 142
"", // 143
"", // 144
"", // 145
"", // 146
"", // 147
"", // 148
"", // 149
"", // 150
"", // 151
"", // 152
"", // 153
"", // 154
"", // 155
"", // 156
"", // 157
"", // 158
"", // 159
"", // 160
"", // 161
"", // 162
"", // 163
"", // 164
"", // 165
"", // 166
"", // 167
"", // 168
"", // 169
"", // 170
"", // 171
"", // 172
"", // 173
"", // 174
"", // 175
"", // 176
"", // 177
"", // 178
"", // 179
"", // 180
"", // 181
"", // 182
"", // 183
"", // 184
"", // 185
"", // 186
"", // 187
"", // 188
"", // 189
"", // 190
"", // 191
"", // 192
"", // 193
"", // 194
"", // 195
"", // 196
"", // 197
"", // 198
"", // 199
"", // 200
"", // 201
"", // 202
"", // 203
"", // 204
"", // 205
"", // 206
"", // 207
"", // 208
"", // 209
"", // 210
"", // 211
"", // 212
"", // 213
"", // 214
"", // 215
"", // 216
"", // 217
"", // 218
"", // 219
"", // 220
"", // 221
"", // 222
"", // 223
"", // 224
"", // 225
"", // 226
"token* ::= token* token", // 227
"token* ::= token* token", // 228
"digit++ ::= digit+ !digit", // 229
"white* ::= white* white", // 230
"white* ::= white* white", // 231
"digit+ ::= digit", // 232
"digit+ ::= digit+ digit", // 233
"", // 234
};
public int[][] getActionTable() { return actionTable; }
private int[][] actionTable = {
    { // 0: $$start ::= start @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 1: $$start ::= [start] @pass
      ((0<<5)|0x6)/*nullProductionAction:0*/,
    },
    { // 2: start ::= white* $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 3: start ::= white* [token*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 4: start ::= [white*] $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // 5: token ::= [#] `boolean @sawBoolean(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 6: token ::= [#] `class @sawClass(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 7: token ::= [#] `extends @sawExtends(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 8: token ::= [#] `void @sawVoid(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 9: token ::= [#] `int @sawInt(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: token ::= [#] `while @sawWhile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 11: token ::= [#] `if @sawIf(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 12: token ::= [#] `else @sawElse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 13: token ::= [#] `for @sawFor(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 14: token ::= [#] `break @sawBreak(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 15: token ::= [#] `this @sawThis(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 16: token ::= [#] `false @sawFalse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 17: token ::= [#] `true @sawTrue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 18: token ::= [#] `super @sawSuper(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 19: token ::= [#] `null @sawNull(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 20: token ::= [#] `return @sawReturn(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 21: token ::= [#] `instanceof @sawInstanceof(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 22: token ::= [#] `new @sawNew(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 23: token ::= [#] `abstract @sawAbstract(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 24: token ::= [#] `assert @sawAssert(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 25: token ::= [#] `byte @sawByte(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 26: token ::= [#] `case @sawCase(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 27: token ::= [#] `catch @sawCatch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 28: token ::= [#] `char @sawChar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 29: token ::= [#] `const @sawConst(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 30: token ::= [#] `continue @sawContinue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 31: token ::= [#] `default @sawDefault(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 32: token ::= [#] `do @sawDo(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 33: token ::= [#] `double @sawDouble(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 34: token ::= [#] `enum @sawEnum(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 35: token ::= [#] `final @sawFinal(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 36: token ::= [#] `finally @sawFinally(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 37: token ::= [#] `float @sawFloat(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 38: token ::= [#] `goto @sawGoto(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 39: token ::= [#] `implements @sawImplements(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 40: token ::= [#] `import @sawImport(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 41: token ::= [#] `interface @sawInterface(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 42: token ::= [#] `long @sawLong(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 43: token ::= [#] `native @sawNative(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 44: token ::= [#] `package @sawPackage(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 45: token ::= [#] `private @sawPrivate(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 46: token ::= [#] `protected @sawProtected(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 47: token ::= [#] `public @sawPublic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 48: token ::= [#] `short @sawShort(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 49: token ::= [#] `static @sawStatic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 50: token ::= [#] `strictfp @sawStrictfp(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 51: token ::= [#] `switch @sawSwitch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 52: token ::= [#] `synchronized @sawSynchronized(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 53: token ::= [#] `throw @sawThrow(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((48<<5)|0x5)/*methodCall:48*/,
    },
    { // 54: token ::= [#] `throws @sawThrows(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((49<<5)|0x5)/*methodCall:49*/,
    },
    { // 55: token ::= [#] `transient @sawTransient(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 56: token ::= [#] `try @sawTry(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 57: token ::= [#] `volatile @sawVolatile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((52<<5)|0x5)/*methodCall:52*/,
    },
    { // 58: token ::= [#] `! @sawNot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((53<<5)|0x5)/*methodCall:53*/,
    },
    { // 59: token ::= [#] `!= @sawNotEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 60: token ::= [#] `% @sawRemainder(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((55<<5)|0x5)/*methodCall:55*/,
    },
    { // 61: token ::= [#] `&& @sawAnd(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 62: token ::= [#] `* @sawTimes(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((57<<5)|0x5)/*methodCall:57*/,
    },
    { // 63: token ::= [#] `( @sawLpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((58<<5)|0x5)/*methodCall:58*/,
    },
    { // 64: token ::= [#] `) @sawRpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((59<<5)|0x5)/*methodCall:59*/,
    },
    { // 65: token ::= [#] `{ @sawLbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((60<<5)|0x5)/*methodCall:60*/,
    },
    { // 66: token ::= [#] `} @sawRbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((61<<5)|0x5)/*methodCall:61*/,
    },
    { // 67: token ::= [#] `- @sawMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((62<<5)|0x5)/*methodCall:62*/,
    },
    { // 68: token ::= [#] `+ @sawPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((63<<5)|0x5)/*methodCall:63*/,
    },
    { // 69: token ::= [#] `= @sawAssign(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((64<<5)|0x5)/*methodCall:64*/,
    },
    { // 70: token ::= [#] `== @sawEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((65<<5)|0x5)/*methodCall:65*/,
    },
    { // 71: token ::= [#] `[ @sawLbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((66<<5)|0x5)/*methodCall:66*/,
    },
    { // 72: token ::= [#] `] @sawRbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((67<<5)|0x5)/*methodCall:67*/,
    },
    { // 73: token ::= [#] `|| @sawOr(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((68<<5)|0x5)/*methodCall:68*/,
    },
    { // 74: token ::= [#] `< @sawLess(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((69<<5)|0x5)/*methodCall:69*/,
    },
    { // 75: token ::= [#] `<= @sawLessEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((70<<5)|0x5)/*methodCall:70*/,
    },
    { // 76: token ::= [#] `, @sawComma(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((71<<5)|0x5)/*methodCall:71*/,
    },
    { // 77: token ::= [#] `> @sawGreater(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((72<<5)|0x5)/*methodCall:72*/,
    },
    { // 78: token ::= [#] `>= @sawGreaterEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((73<<5)|0x5)/*methodCall:73*/,
    },
    { // 79: token ::= [#] `. @sawDot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((74<<5)|0x5)/*methodCall:74*/,
    },
    { // 80: token ::= [#] `; @sawSemi(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((75<<5)|0x5)/*methodCall:75*/,
    },
    { // 81: token ::= [#] `++ @sawPlusPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((76<<5)|0x5)/*methodCall:76*/,
    },
    { // 82: token ::= [#] `-- @sawMinusMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((77<<5)|0x5)/*methodCall:77*/,
    },
    { // 83: token ::= [#] `/ @sawSlash(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((78<<5)|0x5)/*methodCall:78*/,
    },
    { // 84: token ::= [#] `: @sawColon(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((79<<5)|0x5)/*methodCall:79*/,
    },
    { // 85: token ::= [#] ID @identifier(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((80<<5)|0x5)/*methodCall:80*/,
    },
    { // 86: token ::= [#] INT_LITERAL @intLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((81<<5)|0x5)/*methodCall:81*/,
    },
    { // 87: token ::= [#] STRING_LITERAL @stringLit(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((82<<5)|0x5)/*methodCall:82*/,
    },
    { // 88: token ::= [#] CHARACTER_LITERAL @charLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((83<<5)|0x5)/*methodCall:83*/,
    },
    { // 89: `class ::= "c" "l" "a" "s" "s" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 90: `class ::= "c" "l" "a" "s" "s" !idChar [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 91: `else ::= "e" "l" "s" "e" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 92: `else ::= "e" "l" "s" "e" !idChar [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 93: `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 94: `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 95: `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 96: `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 97: `void ::= "v" "o" "i" "d" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 98: `void ::= "v" "o" "i" "d" !idChar [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 99: `int ::= "i" "n" "t" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 100: `int ::= "i" "n" "t" !idChar [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 101: `while ::= "w" "h" "i" "l" "e" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 102: `while ::= "w" "h" "i" "l" "e" !idChar [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 103: `if ::= "i" "f" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 104: `if ::= "i" "f" !idChar [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 105: `for ::= "f" "o" "r" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 106: `for ::= "f" "o" "r" !idChar [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 107: `break ::= "b" "r" "e" "a" "k" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 108: `break ::= "b" "r" "e" "a" "k" !idChar [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 109: `this ::= "t" "h" "i" "s" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 110: `this ::= "t" "h" "i" "s" !idChar [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 111: `false ::= "f" "a" "l" "s" "e" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 112: `false ::= "f" "a" "l" "s" "e" !idChar [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 113: `true ::= "t" "r" "u" "e" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 114: `true ::= "t" "r" "u" "e" !idChar [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 115: `super ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 116: `null ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 117: `return ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 118: `instanceof ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 119: `new ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 120: `abstract ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 121: `assert ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 122: `byte ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 123: `case ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 124: `catch ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 125: `char ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 126: `const ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 127: `continue ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 128: `default ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 129: `do ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 130: `double ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 131: `enum ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 132: `final ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 133: `finally ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 134: `float ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 135: `goto ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 136: `implements ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 137: `import ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 138: `interface ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 139: `long ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 140: `native ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 141: `package ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 142: `private ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 143: `protected ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 144: `public ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 145: `short ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 146: `static ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 147: `strictfp ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 148: `switch ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 149: `synchronized ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 150: `throw ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 151: `throws ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 152: `transient ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 153: `try ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 154: `volatile ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 155: `! ::= "!" !"=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 156: `! ::= "!" !"=" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 157: `!= ::= "!" "=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 158: `!= ::= "!" "=" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 159: `= ::= "=" !"=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 160: `= ::= "=" !"=" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 161: `== ::= "=" "=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 162: `== ::= "=" "=" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 163: `< ::= "<" !"=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 164: `< ::= "<" !"=" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 165: `<= ::= "<" "=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 166: `<= ::= "<" "=" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 167: `> ::= ">" !"=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 168: `> ::= ">" !"=" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 169: `>= ::= ">" "=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 170: `>= ::= ">" "=" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 171: `+ ::= "+" !"+" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 172: `+ ::= "+" !"+" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 173: `++ ::= "+" "+" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 174: `++ ::= "+" "+" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 175: `- ::= "-" !"-" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 176: `- ::= "-" !"-" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 177: `-- ::= "-" "-" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 178: `-- ::= "-" "-" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 179: `* ::= "*" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 180: `* ::= "*" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 181: `% ::= "%" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 182: `% ::= "%" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 183: `&& ::= "&" "&" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 184: `&& ::= "&" "&" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 185: `( ::= "(" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 186: `( ::= "(" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 187: `) ::= ")" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 188: `) ::= ")" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 189: `{ ::= "{" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 190: `{ ::= "{" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 191: `} ::= "}" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 192: `} ::= "}" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 193: `[ ::= "[" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 194: `[ ::= "[" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 195: `] ::= "]" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 196: `] ::= "]" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 197: `|| ::= "|" "|" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 198: `|| ::= "|" "|" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 199: `. ::= "." white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 200: `. ::= "." [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 201: `, ::= "," white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 202: `, ::= "," [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 203: `: ::= ":" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 204: `: ::= ":" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 205: `; ::= ";" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 206: `; ::= ";" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 207: `/ ::= "/" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 208: `/ ::= "/" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 209: INT_LITERAL ::= [#] digit++ white* @convertToInt(int,List<Character>)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 210: INT_LITERAL ::= [#] digit++ [white*] @convertToInt(int,List<Character>)=>int
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 211: sq ::= "'" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 212: CHARACTER_LITERAL ::= sq printable sq white* @makeChar(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 213: CHARACTER_LITERAL ::= sq printable sq [white*] @makeChar(char)=>int
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 214: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 215: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 216: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 217: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 218: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 219: white ::= {9 12 " "} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 220: white ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 221: eol ::= {10} [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 222: eol ::= {13} {10} [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 223: eol ::= {13} !10 [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 224: printable ::= {" ".."~"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 225: ID ::= !255 {255} @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 226: STRING_LITERAL ::= !255 {255} @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 227: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 228: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
    },
    { // 229: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 230: white* ::= white* white @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 231: white* ::= [white*] white @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // 232: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 233: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 234: $$0 ::= token* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "", // start
    "token* ::=", // token*
    "white* ::=", // white*
    "", // $$start
    "# ::=", // #
    "", // registerNewline
};
public int[][] getNullProductionActionTable() { return nullActionTable; }
private int[][] nullActionTable = {
    { // start
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
    },
    { // token*
    },
    { // white*
    },
    { // $$start
      ((0<<5)|0x6)/*nullProductionAction:0*/,
    },
    { // #
      7/*duplicateTop*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // registerNewline
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((86<<5)|0x5)/*methodCall:86*/,
    },
};
public void actionCall(int idx, wrangLR.runtime.SemanticInfo si) {
  switch(idx) {
    default: System.err.println("Internal error--illegal action number: "+idx);break;
    case 0: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawBoolean(parm0);
    }
    break;
    case 1: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawClass(parm0);
    }
    break;
    case 2: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawExtends(parm0);
    }
    break;
    case 3: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawVoid(parm0);
    }
    break;
    case 4: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawInt(parm0);
    }
    break;
    case 5: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawWhile(parm0);
    }
    break;
    case 6: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawIf(parm0);
    }
    break;
    case 7: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawElse(parm0);
    }
    break;
    case 8: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFor(parm0);
    }
    break;
    case 9: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawBreak(parm0);
    }
    break;
    case 10: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawThis(parm0);
    }
    break;
    case 11: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFalse(parm0);
    }
    break;
    case 12: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawTrue(parm0);
    }
    break;
    case 13: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSuper(parm0);
    }
    break;
    case 14: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNull(parm0);
    }
    break;
    case 15: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawReturn(parm0);
    }
    break;
    case 16: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawInstanceof(parm0);
    }
    break;
    case 17: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNew(parm0);
    }
    break;
    case 18: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawAbstract(parm0);
    }
    break;
    case 19: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawAssert(parm0);
    }
    break;
    case 20: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawByte(parm0);
    }
    break;
    case 21: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawCase(parm0);
    }
    break;
    case 22: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawCatch(parm0);
    }
    break;
    case 23: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawChar(parm0);
    }
    break;
    case 24: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawConst(parm0);
    }
    break;
    case 25: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawContinue(parm0);
    }
    break;
    case 26: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawDefault(parm0);
    }
    break;
    case 27: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawDo(parm0);
    }
    break;
    case 28: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawDouble(parm0);
    }
    break;
    case 29: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawEnum(parm0);
    }
    break;
    case 30: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFinal(parm0);
    }
    break;
    case 31: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFinally(parm0);
    }
    break;
    case 32: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFloat(parm0);
    }
    break;
    case 33: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawGoto(parm0);
    }
    break;
    case 34: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawImplements(parm0);
    }
    break;
    case 35: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawImport(parm0);
    }
    break;
    case 36: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawInterface(parm0);
    }
    break;
    case 37: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLong(parm0);
    }
    break;
    case 38: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNative(parm0);
    }
    break;
    case 39: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPackage(parm0);
    }
    break;
    case 40: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPrivate(parm0);
    }
    break;
    case 41: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawProtected(parm0);
    }
    break;
    case 42: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPublic(parm0);
    }
    break;
    case 43: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawShort(parm0);
    }
    break;
    case 44: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawStatic(parm0);
    }
    break;
    case 45: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawStrictfp(parm0);
    }
    break;
    case 46: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSwitch(parm0);
    }
    break;
    case 47: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSynchronized(parm0);
    }
    break;
    case 48: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawThrow(parm0);
    }
    break;
    case 49: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawThrows(parm0);
    }
    break;
    case 50: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawTransient(parm0);
    }
    break;
    case 51: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawTry(parm0);
    }
    break;
    case 52: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawVolatile(parm0);
    }
    break;
    case 53: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNot(parm0);
    }
    break;
    case 54: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNotEqual(parm0);
    }
    break;
    case 55: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawRemainder(parm0);
    }
    break;
    case 56: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawAnd(parm0);
    }
    break;
    case 57: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawTimes(parm0);
    }
    break;
    case 58: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLpar(parm0);
    }
    break;
    case 59: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawRpar(parm0);
    }
    break;
    case 60: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLbrace(parm0);
    }
    break;
    case 61: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawRbrace(parm0);
    }
    break;
    case 62: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawMinus(parm0);
    }
    break;
    case 63: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPlus(parm0);
    }
    break;
    case 64: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawAssign(parm0);
    }
    break;
    case 65: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawEqual(parm0);
    }
    break;
    case 66: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLbrack(parm0);
    }
    break;
    case 67: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawRbrack(parm0);
    }
    break;
    case 68: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawOr(parm0);
    }
    break;
    case 69: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLess(parm0);
    }
    break;
    case 70: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLessEq(parm0);
    }
    break;
    case 71: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawComma(parm0);
    }
    break;
    case 72: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawGreater(parm0);
    }
    break;
    case 73: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawGreaterEq(parm0);
    }
    break;
    case 74: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawDot(parm0);
    }
    break;
    case 75: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSemi(parm0);
    }
    break;
    case 76: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPlusPlus(parm0);
    }
    break;
    case 77: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawMinusMinus(parm0);
    }
    break;
    case 78: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSlash(parm0);
    }
    break;
    case 79: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawColon(parm0);
    }
    break;
    case 80: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      actionObject.identifier(parm0,parm1);
    }
    break;
    case 81: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      actionObject.intLit(parm0,parm1);
    }
    break;
    case 82: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      actionObject.stringLit(parm0,parm1);
    }
    break;
    case 83: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      actionObject.charLit(parm0,parm1);
    }
    break;
    case 84: {
      int parm0 = (Integer)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 85: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.makeChar(parm0);
      si.pushPb(result);
    }
    break;
    case 86: {
      int parm0 = (Integer)si.popPb();
      actionObject.registerNewline(parm0);
    }
    break;
  }
}
private String[] saNameSigTable = {
"void sawBoolean(int)",
"void sawClass(int)",
"void sawExtends(int)",
"void sawVoid(int)",
"void sawInt(int)",
"void sawWhile(int)",
"void sawIf(int)",
"void sawElse(int)",
"void sawFor(int)",
"void sawBreak(int)",
"void sawThis(int)",
"void sawFalse(int)",
"void sawTrue(int)",
"void sawSuper(int)",
"void sawNull(int)",
"void sawReturn(int)",
"void sawInstanceof(int)",
"void sawNew(int)",
"void sawAbstract(int)",
"void sawAssert(int)",
"void sawByte(int)",
"void sawCase(int)",
"void sawCatch(int)",
"void sawChar(int)",
"void sawConst(int)",
"void sawContinue(int)",
"void sawDefault(int)",
"void sawDo(int)",
"void sawDouble(int)",
"void sawEnum(int)",
"void sawFinal(int)",
"void sawFinally(int)",
"void sawFloat(int)",
"void sawGoto(int)",
"void sawImplements(int)",
"void sawImport(int)",
"void sawInterface(int)",
"void sawLong(int)",
"void sawNative(int)",
"void sawPackage(int)",
"void sawPrivate(int)",
"void sawProtected(int)",
"void sawPublic(int)",
"void sawShort(int)",
"void sawStatic(int)",
"void sawStrictfp(int)",
"void sawSwitch(int)",
"void sawSynchronized(int)",
"void sawThrow(int)",
"void sawThrows(int)",
"void sawTransient(int)",
"void sawTry(int)",
"void sawVolatile(int)",
"void sawNot(int)",
"void sawNotEqual(int)",
"void sawRemainder(int)",
"void sawAnd(int)",
"void sawTimes(int)",
"void sawLpar(int)",
"void sawRpar(int)",
"void sawLbrace(int)",
"void sawRbrace(int)",
"void sawMinus(int)",
"void sawPlus(int)",
"void sawAssign(int)",
"void sawEqual(int)",
"void sawLbrack(int)",
"void sawRbrack(int)",
"void sawOr(int)",
"void sawLess(int)",
"void sawLessEq(int)",
"void sawComma(int)",
"void sawGreater(int)",
"void sawGreaterEq(int)",
"void sawDot(int)",
"void sawSemi(int)",
"void sawPlusPlus(int)",
"void sawMinusMinus(int)",
"void sawSlash(int)",
"void sawColon(int)",
"void identifier(int,String)",
"void intLit(int,int)",
"void stringLit(int,String)",
"void charLit(int,int)",
"int convertToInt(int,List<Character>)",
"int makeChar(char)",
"void registerNewline(int)",
};
public String[] getSaNameSigTable() {
  return saNameSigTable;
}
private int[] sigCountTable = {
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
2,0,
2,0,
2,0,
2,0,
2,1,
1,1,
1,0,
};
public int[] getSigCountTable() {
  return sigCountTable;
}
public int[] getSymbolSizeTable() { return symbolSizeTable; }
private int[] symbolSizeTable = {
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    1,
    1,
    1,
    1,
    -1,
    -1,
    -1,
    -1,
    1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    1,
    0,
    -1,
    1,
    1,
    1,
    -1,
    -1,
    -1,
    0,
    -1,
    -1,
    0,
    -1,
    -1,
    -1,
    0,
    1,
    -1,
    -1,
};
public Object vectorToTuple(java.util.ArrayList<Object> vec) {
  switch (vec.size()) {
  }
  System.err.println("Internal error--illegal Tuple size: "+vec.size());
  return null;
}
}
