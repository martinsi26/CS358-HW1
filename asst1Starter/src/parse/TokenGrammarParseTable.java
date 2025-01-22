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
public int getEofSym() { return 162; }
public int getNttSym() { return 163; }
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
"\"p\"",
"\"y\"",
"\"m\"",
"\"g\"",
"\"z\"",
"reserved",
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
"identifier",
"letter",
"idChar**",
"digit++",
"dq",
"\'\"\'",
"stringChar",
"printable",
"stringChar*",
"$$1",
"sq",
"\"\'\"",
"digit",
"\"_\"",
"{\"A\"..\"Z\" \"j\" \"q\"}",
"{\"0\"..\"9\"}",
"white",
"\" \"",
"{9 12}",
"eol",
"10",
"13",
"{\"#\"..\"$\" \"?\"..\"@\" \"\\\" \"^\" \"`\" \"~\"}",
"token*",
"digit+",
"idChar*",
"$",
"$NT",
};
public String symName(int n) {
 return n >= 0 && n < symNameTable.length ? symNameTable[n] : "??";
}
private TokenGrammar actionObject;
public int[][] getParseTable() { return parseTable; }
public int numSymbols() { return 164;}
private static final int MIN_REDUCTION = 1032;
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
0x80000000|944, // match move
0x80000000|339, // no-match move
0x80000000|550, // NT-test-match state for reserved
  }
,
{ // state 1
  }
,
{ // state 2
94,345, // "e"
  }
,
{ // state 3
91,818, // "a"
  }
,
{ // state 4
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 5
111,994, // "m"
  }
,
{ // state 6
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 7
89,82, // "c"
  }
,
{ // state 8
94,939, // "e"
  }
,
{ // state 9
0x80000000|1, // match move
0x80000000|228, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 10
97,255, // "n"
  }
,
{ // state 11
89,418, // "c"
  }
,
{ // state 12
2,102, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 13
97,1007, // "n"
  }
,
{ // state 14
163,MIN_REDUCTION+239, // $NT
  }
,
{ // state 15
0x80000000|1, // match move
0x80000000|229, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 16
105,829, // "f"
  }
,
{ // state 17
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 18
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 19
2,122, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 20
0x80000000|1, // match move
0x80000000|210, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 21
0x80000000|1, // match move
0x80000000|468, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 22
89,338, // "c"
  }
,
{ // state 23
111,897, // "m"
  }
,
{ // state 24
91,582, // "a"
  }
,
{ // state 25
94,704, // "e"
  }
,
{ // state 26
96,698, // "o"
  }
,
{ // state 27
108,960, // "u"
  }
,
{ // state 28
0x80000000|1, // match move
0x80000000|219, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 29
96,290, // "o"
  }
,
{ // state 30
105,440, // "f"
  }
,
{ // state 31
163,MIN_REDUCTION+205, // $NT
  }
,
{ // state 32
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 33
96,631, // "o"
  }
,
{ // state 34
89,445, // "c"
  }
,
{ // state 35
2,213, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 36
104,478, // "h"
  }
,
{ // state 37
94,715, // "e"
  }
,
{ // state 38
2,450, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+120, // $NT
  }
,
{ // state 39
163,MIN_REDUCTION+204, // $NT
  }
,
{ // state 40
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+93, // $NT
  }
,
{ // state 41
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 42
116,866, // "="
  }
,
{ // state 43
2,490, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 44
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 45
99,318, // "t"
103,664, // "w"
104,29, // "h"
108,61, // "u"
110,671, // "y"
  }
,
{ // state 46
99,420, // "t"
  }
,
{ // state 47
99,627, // "t"
  }
,
{ // state 48
163,MIN_REDUCTION+233, // $NT
  }
,
{ // state 49
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 50
112,334, // "g"
  }
,
{ // state 51
0x80000000|1, // match move
0x80000000|1013, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 52
109,544, // "p"
  }
,
{ // state 53
89,618, // "c"
  }
,
{ // state 54
0x80000000|1, // match move
0x80000000|408, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 55
97,382, // "n"
  }
,
{ // state 56
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 57
92,592, // "s"
  }
,
{ // state 58
2,940, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 59
2,161, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+150, // $NT
  }
,
{ // state 60
89,912, // "c"
90,912, // "l"
91,912, // "a"
92,912, // "s"
94,912, // "e"
95,912, // "b"
96,912, // "o"
97,912, // "n"
98,912, // "x"
99,912, // "t"
100,912, // "d"
101,912, // "v"
102,912, // "i"
103,912, // "w"
104,912, // "h"
105,912, // "f"
106,912, // "r"
107,912, // "k"
108,912, // "u"
109,912, // "p"
110,912, // "y"
111,912, // "m"
112,912, // "g"
113,912, // "z"
137,1000, // letter
148,361, // digit
149,237, // "_"
150,912, // {"A".."Z" "j" "q"}
151,375, // {"0".."9"}
  }
,
{ // state 61
109,792, // "p"
  }
,
{ // state 62
92,359, // "s"
  }
,
{ // state 63
92,669, // "s"
  }
,
{ // state 64
89,776, // "c"
90,776, // "l"
91,776, // "a"
92,776, // "s"
93,184, // idChar
94,776, // "e"
95,776, // "b"
96,776, // "o"
97,776, // "n"
98,776, // "x"
99,776, // "t"
100,776, // "d"
101,776, // "v"
102,776, // "i"
103,776, // "w"
104,776, // "h"
105,776, // "f"
106,776, // "r"
107,776, // "k"
108,776, // "u"
109,776, // "p"
110,776, // "y"
111,776, // "m"
112,776, // "g"
113,776, // "z"
137,556, // letter
138,779, // idChar**
148,348, // digit
149,325, // "_"
150,776, // {"A".."Z" "j" "q"}
151,518, // {"0".."9"}
161,554, // idChar*
  }
,
{ // state 65
163,MIN_REDUCTION+203, // $NT
  }
,
{ // state 66
0x80000000|243, // match move
0x80000000|397, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 67
91,193, // "a"
108,663, // "u"
110,492, // "y"
  }
,
{ // state 68
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 69
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 70
163,MIN_REDUCTION+197, // $NT
  }
,
{ // state 71
94,286, // "e"
  }
,
{ // state 72
2,593, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 73
0x80000000|1, // match move
0x80000000|372, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 74
97,523, // "n"
  }
,
{ // state 75
2,578, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 76
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 77
89,654, // "c"
  }
,
{ // state 78
151,375, // {"0".."9"}
  }
,
{ // state 79
90,260, // "l"
  }
,
{ // state 80
0x80000000|1, // match move
0x80000000|364, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 81
92,167, // "s"
99,840, // "t"
  }
,
{ // state 82
0x80000000|1, // match move
0x80000000|125, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 83
92,1005, // "s"
95,727, // "b"
  }
,
{ // state 84
99,719, // "t"
103,904, // "w"
104,33, // "h"
108,52, // "u"
110,366, // "y"
  }
,
{ // state 85
163,MIN_REDUCTION+237, // $NT
  }
,
{ // state 86
102,519, // "i"
  }
,
{ // state 87
99,195, // "t"
  }
,
{ // state 88
102,403, // "i"
  }
,
{ // state 89
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 90
94,30, // "e"
96,712, // "o"
  }
,
{ // state 91
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+181, // $NT
  }
,
{ // state 92
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 93
109,140, // "p"
  }
,
{ // state 94
108,911, // "u"
  }
,
{ // state 95
0x80000000|1, // match move
0x80000000|854, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 96
92,152, // "s"
  }
,
{ // state 97
2,883, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+172, // $NT
  }
,
{ // state 98
89,526, // "c"
  }
,
{ // state 99
0x80000000|109, // match move
0x80000000|1023, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 100
116,500, // "="
  }
,
{ // state 101
100,436, // "d"
  }
,
{ // state 102
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 103
0x80000000|1, // match move
0x80000000|97, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 104
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 105
163,MIN_REDUCTION+321, // $NT
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 106
163,MIN_REDUCTION+230, // $NT
  }
,
{ // state 107
2,617, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 108
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 109
92,684, // "s"
  }
,
{ // state 110
90,276, // "l"
  }
,
{ // state 111
112,650, // "g"
  }
,
{ // state 112
2,721, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+98, // $NT
  }
,
{ // state 113
99,771, // "t"
  }
,
{ // state 114
94,641, // "e"
  }
,
{ // state 115
0x80000000|1, // match move
0x80000000|112, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 116
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 117
99,21, // "t"
  }
,
{ // state 118
89,853, // "c"
  }
,
{ // state 119
99,220, // "t"
  }
,
{ // state 120
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 121
91,863, // "a"
  }
,
{ // state 122
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 123
163,MIN_REDUCTION+220, // $NT
  }
,
{ // state 124
104,559, // "h"
106,67, // "r"
  }
,
{ // state 125
2,313, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+178, // $NT
  }
,
{ // state 126
110,231, // "y"
  }
,
{ // state 127
95,340, // "b"
  }
,
{ // state 128
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 129
97,753, // "n"
  }
,
{ // state 130
0x80000000|1, // match move
0x80000000|197, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 131
2,234, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 132
100,652, // "d"
  }
,
{ // state 133
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 134
90,857, // "l"
  }
,
{ // state 135
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 136
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+141, // $NT
  }
,
{ // state 137
116,377, // "="
  }
,
{ // state 138
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 139
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 140
0x80000000|1, // match move
0x80000000|298, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 141
2,279, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+184, // $NT
  }
,
{ // state 142
163,MIN_REDUCTION+223, // $NT
  }
,
{ // state 143
99,622, // "t"
  }
,
{ // state 144
94,909, // "e"
  }
,
{ // state 145
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
287, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
861, // `!
925, // `!=
836, // `%
128, // `&&
133, // `*
365, // `(
135, // `)
646, // `{
186, // `}
536, // `-
267, // `+
177, // `=
562, // `==
247, // `[
649, // `]
756, // `||
178, // `<
179, // `<=
643, // `,
373, // `>
294, // `>=
524, // `.
369, // `;
215, // `++
116, // `--
200, // `/
987, // `:
104, // ID
226, // INT_LITERAL
667, // STRING_LITERAL
797, // CHARACTER_LITERAL
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "x"
822, // "t"
822, // "d"
822, // "v"
822, // "i"
822, // "w"
822, // "h"
822, // "f"
822, // "r"
822, // "k"
822, // "u"
822, // "p"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
-1, // reserved
657, // "!"
312, // "="
529, // "<"
66, // ">"
321, // "+"
907, // "-"
567, // "*"
432, // "%"
423, // "&"
932, // "("
814, // ")"
639, // "{"
476, // "}"
307, // "["
746, // "]"
975, // "|"
208, // "."
272, // ","
12, // ":"
166, // ";"
827, // "/"
666, // identifier
844, // letter
-1, // idChar**
586, // digit++
308, // dq
32, // '"'
-1, // stringChar
-1, // printable
-1, // stringChar*
-1, // $$1
966, // sq
563, // "'"
203, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
400, // {"0".."9"}
-1, // white
-1, // " "
-1, // {9 12}
-1, // eol
-1, // {10}
-1, // {13}
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
594, // digit+
-1, // idChar*
MIN_REDUCTION+338, // $
-1, // $NT
  }
,
{ // state 146
96,1025, // "o"
  }
,
{ // state 147
99,701, // "t"
  }
,
{ // state 148
104,419, // "h"
  }
,
{ // state 149
163,MIN_REDUCTION+195, // $NT
  }
,
{ // state 150
0x80000000|1, // match move
0x80000000|806, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 151
89,823, // "c"
90,823, // "l"
91,823, // "a"
92,823, // "s"
94,823, // "e"
95,823, // "b"
96,823, // "o"
97,823, // "n"
98,823, // "x"
99,823, // "t"
100,823, // "d"
101,823, // "v"
102,823, // "i"
103,823, // "w"
104,823, // "h"
105,823, // "f"
106,823, // "r"
107,823, // "k"
108,823, // "u"
109,823, // "p"
110,823, // "y"
111,823, // "m"
112,823, // "g"
113,823, // "z"
115,823, // "!"
116,823, // "="
117,823, // "<"
118,823, // ">"
119,823, // "+"
120,823, // "-"
121,823, // "*"
122,823, // "%"
123,823, // "&"
124,823, // "("
125,823, // ")"
126,823, // "{"
127,823, // "}"
128,823, // "["
129,823, // "]"
130,823, // "|"
131,823, // "."
132,823, // ","
133,823, // ":"
134,823, // ";"
135,823, // "/"
141,823, // '"'
142,44, // stringChar
143,410, // printable
145,538, // $$1
147,823, // "'"
149,823, // "_"
150,823, // {"A".."Z" "j" "q"}
151,823, // {"0".."9"}
153,823, // " "
158,823, // {"#".."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 152
0x80000000|1, // match move
0x80000000|317, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 153
99,630, // "t"
  }
,
{ // state 154
97,1027, // "n"
  }
,
{ // state 155
102,795, // "i"
  }
,
{ // state 156
94,335, // "e"
  }
,
{ // state 157
120,395, // "-"
  }
,
{ // state 158
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 159
92,605, // "s"
95,739, // "b"
  }
,
{ // state 160
91,465, // "a"
  }
,
{ // state 161
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+149, // $NT
  }
,
{ // state 162
4,287, // token
5,709, // `boolean
6,986, // `class
7,404, // `extends
8,439, // `void
9,620, // `int
10,889, // `while
11,139, // `if
12,934, // `else
13,459, // `for
14,281, // `break
15,808, // `this
16,680, // `false
17,859, // `true
18,241, // `super
19,557, // `null
20,1028, // `return
21,209, // `instanceof
22,165, // `new
23,675, // `abstract
24,717, // `assert
25,498, // `byte
26,466, // `case
27,76, // `catch
28,163, // `char
29,561, // `const
30,245, // `continue
31,371, // `default
32,824, // `do
33,190, // `double
34,1022, // `enum
35,333, // `final
36,791, // `finally
37,929, // `float
38,456, // `goto
39,462, // `implements
40,573, // `import
41,327, // `interface
42,475, // `long
43,17, // `native
44,626, // `package
45,874, // `private
46,919, // `protected
47,585, // `public
48,673, // `short
49,555, // `static
50,191, // `strictfp
51,1026, // `switch
52,997, // `synchronized
53,781, // `throw
54,983, // `throws
55,540, // `transient
56,233, // `try
57,138, // `volatile
89,941, // "c"
90,183, // "l"
91,159, // "a"
92,84, // "s"
94,845, // "e"
95,240, // "b"
97,542, // "n"
99,250, // "t"
100,90, // "d"
101,235, // "v"
102,577, // "i"
103,780, // "w"
105,915, // "f"
106,993, // "r"
109,451, // "p"
112,782, // "g"
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 163
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 164
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 165
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 166
2,172, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 167
94,574, // "e"
  }
,
{ // state 168
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 169
2,329, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+124, // $NT
  }
,
{ // state 170
89,399, // "c"
  }
,
{ // state 171
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+157, // $NT
  }
,
{ // state 172
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 173
99,794, // "t"
  }
,
{ // state 174
96,763, // "o"
  }
,
{ // state 175
96,734, // "o"
  }
,
{ // state 176
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+187, // $NT
  }
,
{ // state 177
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 178
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 179
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 180
94,628, // "e"
  }
,
{ // state 181
91,129, // "a"
108,752, // "u"
110,747, // "y"
  }
,
{ // state 182
0x80000000|63, // match move
0x80000000|668, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 183
96,535, // "o"
  }
,
{ // state 184
0x80000000|332, // match move
0x80000000|982, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 185
106,665, // "r"
  }
,
{ // state 186
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 187
91,438, // "a"
  }
,
{ // state 188
2,509, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 189
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 190
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 191
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 192
97,659, // "n"
  }
,
{ // state 193
97,949, // "n"
  }
,
{ // state 194
0x80000000|1, // match move
0x80000000|303, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 195
0x80000000|1, // match move
0x80000000|242, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 196
163,MIN_REDUCTION+235, // $NT
  }
,
{ // state 197
2,955, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+168, // $NT
  }
,
{ // state 198
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 199
102,785, // "i"
  }
,
{ // state 200
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 201
100,115, // "d"
  }
,
{ // state 202
94,612, // "e"
  }
,
{ // state 203
0x80000000|914, // match move
0x80000000|856, // no-match move
0x80000000|78, // NT-test-match state for digit
  }
,
{ // state 204
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 205
102,510, // "i"
  }
,
{ // state 206
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 207
106,516, // "r"
  }
,
{ // state 208
2,216, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 209
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 210
2,976, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+138, // $NT
  }
,
{ // state 211
90,520, // "l"
  }
,
{ // state 212
94,130, // "e"
  }
,
{ // state 213
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 214
163,MIN_REDUCTION+324, // $NT
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 215
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 216
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 217
2,479, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 218
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+173, // $NT
  }
,
{ // state 219
2,352, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+106, // $NT
  }
,
{ // state 220
0x80000000|1, // match move
0x80000000|58, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 221
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+89, // $NT
  }
,
{ // state 222
2,136, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+142, // $NT
  }
,
{ // state 223
97,452, // "n"
  }
,
{ // state 224
0x80000000|590, // match move
0x80000000|591, // no-match move
// T-test match for 10:
156,
  }
,
{ // state 225
2,916, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 226
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 227
106,472, // "r"
  }
,
{ // state 228
2,770, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 229
2,56, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 230
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+109, // $NT
  }
,
{ // state 231
0x80000000|1, // match move
0x80000000|714, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 232
2,496, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 233
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 234
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 235
96,992, // "o"
  }
,
{ // state 236
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+175, // $NT
  }
,
{ // state 237
163,MIN_REDUCTION+317, // $NT
  }
,
{ // state 238
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+107, // $NT
  }
,
{ // state 239
102,921, // "i"
  }
,
{ // state 240
96,670, // "o"
106,880, // "r"
110,711, // "y"
  }
,
{ // state 241
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 242
2,735, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+128, // $NT
  }
,
{ // state 243
116,679, // "="
  }
,
{ // state 244
163,MIN_REDUCTION+225, // $NT
  }
,
{ // state 245
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 246
2,971, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 247
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 248
106,288, // "r"
  }
,
{ // state 249
90,344, // "l"
  }
,
{ // state 250
104,481, // "h"
106,181, // "r"
  }
,
{ // state 251
91,589, // "a"
  }
,
{ // state 252
163,MIN_REDUCTION+226, // $NT
  }
,
{ // state 253
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 254
2,601, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+132, // $NT
  }
,
{ // state 255
0x80000000|1, // match move
0x80000000|19, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 256
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+185, // $NT
  }
,
{ // state 257
163,MIN_REDUCTION+227, // $NT
  }
,
{ // state 258
2,331, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 259
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 260
110,728, // "y"
  }
,
{ // state 261
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+103, // $NT
  }
,
{ // state 262
112,875, // "g"
  }
,
{ // state 263
163,MIN_REDUCTION+216, // $NT
  }
,
{ // state 264
99,458, // "t"
  }
,
{ // state 265
92,672, // "s"
  }
,
{ // state 266
99,202, // "t"
  }
,
{ // state 267
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 268
0x80000000|686, // match move
0x80000000|901, // no-match move
0x80000000|550, // NT-test-match state for reserved
  }
,
{ // state 269
99,886, // "t"
  }
,
{ // state 270
94,121, // "e"
  }
,
{ // state 271
2,603, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 272
2,958, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 273
94,192, // "e"
  }
,
{ // state 274
106,1004, // "r"
  }
,
{ // state 275
90,962, // "l"
  }
,
{ // state 276
94,292, // "e"
  }
,
{ // state 277
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+151, // $NT
  }
,
{ // state 278
95,1030, // "b"
  }
,
{ // state 279
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+183, // $NT
  }
,
{ // state 280
2,511, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+140, // $NT
  }
,
{ // state 281
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 282
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+117, // $NT
  }
,
{ // state 283
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 284
0x80000000|1, // match move
0x80000000|326, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 285
2,543, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 286
97,514, // "n"
  }
,
{ // state 287
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 288
0x80000000|1, // match move
0x80000000|72, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 289
2,879, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 290
106,767, // "r"
  }
,
{ // state 291
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 292
0x80000000|1, // match move
0x80000000|337, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 293
89,512, // "c"
  }
,
{ // state 294
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 295
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+191, // $NT
  }
,
{ // state 296
2,694, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 297
96,812, // "o"
  }
,
{ // state 298
2,430, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+180, // $NT
  }
,
{ // state 299
0x80000000|304, // match move
0x80000000|503, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 300
0x80000000|1, // match move
0x80000000|442, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 301
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 302
2,4, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 303
2,783, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 304
94,227, // "e"
  }
,
{ // state 305
106,87, // "r"
  }
,
{ // state 306
0x80000000|1, // match move
0x80000000|441, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 307
2,427, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 308
0x80000000|726, // match move
0x80000000|947, // no-match move
0x80000000|570, // NT-test-match state for dq
  }
,
{ // state 309
96,815, // "o"
  }
,
{ // state 310
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 311
96,959, // "o"
  }
,
{ // state 312
0x80000000|42, // match move
0x80000000|702, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 313
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+177, // $NT
  }
,
{ // state 314
108,23, // "u"
  }
,
{ // state 315
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 316
107,284, // "k"
  }
,
{ // state 317
2,415, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 318
91,690, // "a"
106,205, // "r"
  }
,
{ // state 319
0x80000000|1, // match move
0x80000000|169, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 320
2,946, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 321
0x80000000|560, // match move
0x80000000|232, // no-match move
// T-test match for "+":
119,
  }
,
{ // state 322
103,319, // "w"
  }
,
{ // state 323
90,416, // "l"
96,790, // "o"
  }
,
{ // state 324
99,937, // "t"
  }
,
{ // state 325
0x80000000|837, // match move
0x80000000|370, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 326
2,238, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+108, // $NT
  }
,
{ // state 327
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 328
102,963, // "i"
  }
,
{ // state 329
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+123, // $NT
  }
,
{ // state 330
0x80000000|1, // match move
0x80000000|141, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 331
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 332
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 333
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 334
0x80000000|1, // match move
0x80000000|401, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 335
0x80000000|1, // match move
0x80000000|407, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 336
2,474, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 337
2,700, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+102, // $NT
  }
,
{ // state 338
107,614, // "k"
  }
,
{ // state 339
-1, // $$start
572, // start
268, // white*
168, // $$0
301, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
861, // `!
925, // `!=
836, // `%
128, // `&&
133, // `*
365, // `(
135, // `)
646, // `{
186, // `}
536, // `-
267, // `+
177, // `=
562, // `==
247, // `[
649, // `]
756, // `||
178, // `<
179, // `<=
643, // `,
373, // `>
294, // `>=
524, // `.
369, // `;
215, // `++
116, // `--
200, // `/
987, // `:
104, // ID
226, // INT_LITERAL
667, // STRING_LITERAL
797, // CHARACTER_LITERAL
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "x"
822, // "t"
822, // "d"
822, // "v"
822, // "i"
822, // "w"
822, // "h"
822, // "f"
822, // "r"
822, // "k"
822, // "u"
822, // "p"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
-1, // reserved
657, // "!"
312, // "="
529, // "<"
66, // ">"
321, // "+"
907, // "-"
567, // "*"
432, // "%"
423, // "&"
932, // "("
814, // ")"
639, // "{"
476, // "}"
307, // "["
746, // "]"
975, // "|"
208, // "."
272, // ","
12, // ":"
166, // ";"
827, // "/"
666, // identifier
844, // letter
-1, // idChar**
586, // digit++
308, // dq
32, // '"'
-1, // stringChar
-1, // printable
-1, // stringChar*
-1, // $$1
966, // sq
563, // "'"
203, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
400, // {"0".."9"}
488, // white
444, // " "
444, // {9 12}
778, // eol
595, // {10}
443, // {13}
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
568, // token*
594, // digit+
-1, // idChar*
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 340
90,564, // "l"
  }
,
{ // state 341
163,MIN_REDUCTION+245, // $NT
  }
,
{ // state 342
94,358, // "e"
  }
,
{ // state 343
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+147, // $NT
  }
,
{ // state 344
99,765, // "t"
  }
,
{ // state 345
0x80000000|1, // match move
0x80000000|676, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 346
94,828, // "e"
  }
,
{ // state 347
99,985, // "t"
  }
,
{ // state 348
0x80000000|92, // match move
0x80000000|49, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 349
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 350
91,655, // "a"
  }
,
{ // state 351
102,972, // "i"
  }
,
{ // state 352
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+105, // $NT
  }
,
{ // state 353
163,MIN_REDUCTION+222, // $NT
  }
,
{ // state 354
0x80000000|1, // match move
0x80000000|360, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 355
0x80000000|1, // match move
0x80000000|363, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 356
0x80000000|27, // match move
0x80000000|884, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 357
2,640, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+114, // $NT
  }
,
{ // state 358
0x80000000|1, // match move
0x80000000|75, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 359
92,832, // "s"
  }
,
{ // state 360
2,171, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+158, // $NT
  }
,
{ // state 361
163,MIN_REDUCTION+316, // $NT
  }
,
{ // state 362
0x80000000|1, // match move
0x80000000|357, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 363
2,91, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+182, // $NT
  }
,
{ // state 364
2,905, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+136, // $NT
  }
,
{ // state 365
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 366
97,772, // "n"
  }
,
{ // state 367
99,150, // "t"
  }
,
{ // state 368
163,MIN_REDUCTION+208, // $NT
  }
,
{ // state 369
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 370
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 371
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 372
2,685, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 373
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 374
91,991, // "a"
  }
,
{ // state 375
163,MIN_REDUCTION+319, // $NT
  }
,
{ // state 376
163,MIN_REDUCTION+247, // $NT
  }
,
{ // state 377
2,899, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 378
2,961, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 379
0x80000000|786, // match move
0x80000000|151, // no-match move
0x80000000|570, // NT-test-match state for dq
  }
,
{ // state 380
94,651, // "e"
  }
,
{ // state 381
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+129, // $NT
  }
,
{ // state 382
99,547, // "t"
  }
,
{ // state 383
2,384, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+134, // $NT
  }
,
{ // state 384
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+133, // $NT
  }
,
{ // state 385
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 386
94,398, // "e"
  }
,
{ // state 387
89,422, // "c"
  }
,
{ // state 388
90,173, // "l"
  }
,
{ // state 389
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 390
163,MIN_REDUCTION+198, // $NT
  }
,
{ // state 391
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 392
94,545, // "e"
  }
,
{ // state 393
101,579, // "v"
  }
,
{ // state 394
90,156, // "l"
  }
,
{ // state 395
2,609, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 396
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 397
2,528, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 398
99,722, // "t"
  }
,
{ // state 399
99,732, // "t"
  }
,
{ // state 400
0x80000000|164, // match move
0x80000000|108, // no-match move
0x80000000|78, // NT-test-match state for digit
  }
,
{ // state 401
2,470, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+164, // $NT
  }
,
{ // state 402
2,389, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 403
113,692, // "z"
  }
,
{ // state 404
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 405
156,447, // {10}
  }
,
{ // state 406
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 407
2,661, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+194, // $NT
  }
,
{ // state 408
2,218, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+174, // $NT
  }
,
{ // state 409
102,154, // "i"
  }
,
{ // state 410
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 411
0x80000000|1, // match move
0x80000000|302, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 412
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+165, // $NT
  }
,
{ // state 413
92,153, // "s"
99,299, // "t"
  }
,
{ // state 414
0x80000000|1, // match move
0x80000000|258, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 415
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 416
94,648, // "e"
  }
,
{ // state 417
90,970, // "l"
97,314, // "n"
98,860, // "x"
  }
,
{ // state 418
0x80000000|1, // match move
0x80000000|320, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 419
0x80000000|1, // match move
0x80000000|454, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 420
0x80000000|1, // match move
0x80000000|546, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 421
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 422
104,207, // "h"
  }
,
{ // state 423
123,271, // "&"
  }
,
{ // state 424
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 425
163,MIN_REDUCTION+219, // $NT
  }
,
{ // state 426
92,847, // "s"
  }
,
{ // state 427
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 428
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+159, // $NT
  }
,
{ // state 429
96,1024, // "o"
106,745, // "r"
110,766, // "y"
  }
,
{ // state 430
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+179, // $NT
  }
,
{ // state 431
91,965, // "a"
  }
,
{ // state 432
2,421, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 433
0x80000000|1, // match move
0x80000000|565, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 434
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 435
94,800, // "e"
  }
,
{ // state 436
0x80000000|1, // match move
0x80000000|35, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 437
2,713, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+126, // $NT
  }
,
{ // state 438
106,80, // "r"
  }
,
{ // state 439
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 440
91,873, // "a"
  }
,
{ // state 441
2,602, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 442
2,596, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 443
0x80000000|405, // match move
0x80000000|501, // no-match move
// T-test match for 10:
156,
  }
,
{ // state 444
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 445
94,691, // "e"
  }
,
{ // state 446
97,113, // "n"
  }
,
{ // state 447
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 448
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 449
91,316, // "a"
  }
,
{ // state 450
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+119, // $NT
  }
,
{ // state 451
91,53, // "a"
106,623, // "r"
108,278, // "u"
  }
,
{ // state 452
100,525, // "d"
  }
,
{ // state 453
2,674, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 454
2,885, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 455
163,MIN_REDUCTION+199, // $NT
  }
,
{ // state 456
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 457
163,MIN_REDUCTION+241, // $NT
  }
,
{ // state 458
0x80000000|1, // match move
0x80000000|437, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 459
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 460
163,MIN_REDUCTION+196, // $NT
  }
,
{ // state 461
148,584, // digit
151,400, // {"0".."9"}
  }
,
{ // state 462
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 463
0x80000000|1, // match move
0x80000000|485, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 464
106,28, // "r"
  }
,
{ // state 465
89,264, // "c"
  }
,
{ // state 466
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 467
2,283, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 468
2,428, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+160, // $NT
  }
,
{ // state 469
104,606, // "h"
  }
,
{ // state 470
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+163, // $NT
  }
,
{ // state 471
163,MIN_REDUCTION+234, // $NT
  }
,
{ // state 472
105,658, // "f"
  }
,
{ // state 473
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 474
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 475
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 476
2,922, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 477
109,801, // "p"
  }
,
{ // state 478
0x80000000|1, // match move
0x80000000|453, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 479
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 480
99,239, // "t"
  }
,
{ // state 481
102,695, // "i"
106,974, // "r"
  }
,
{ // state 482
91,597, // "a"
  }
,
{ // state 483
97,571, // "n"
  }
,
{ // state 484
2,295, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+192, // $NT
  }
,
{ // state 485
2,720, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+96, // $NT
  }
,
{ // state 486
113,867, // "z"
  }
,
{ // state 487
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+155, // $NT
  }
,
{ // state 488
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 489
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 490
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 491
94,16, // "e"
96,356, // "o"
  }
,
{ // state 492
0x80000000|1, // match move
0x80000000|484, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 493
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 494
0x80000000|1, // match move
0x80000000|280, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 495
146,688, // sq
147,969, // "'"
  }
,
{ // state 496
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 497
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 498
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 499
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+111, // $NT
  }
,
{ // state 500
2,552, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 501
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 502
92,693, // "s"
99,409, // "t"
  }
,
{ // state 503
2,1018, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+100, // $NT
  }
,
{ // state 504
94,964, // "e"
  }
,
{ // state 505
102,849, // "i"
  }
,
{ // state 506
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 507
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+115, // $NT
  }
,
{ // state 508
99,293, // "t"
  }
,
{ // state 509
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 510
89,522, // "c"
  }
,
{ // state 511
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+139, // $NT
  }
,
{ // state 512
104,355, // "h"
  }
,
{ // state 513
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 514
99,1019, // "t"
  }
,
{ // state 515
163,MIN_REDUCTION+238, // $NT
  }
,
{ // state 516
96,817, // "o"
  }
,
{ // state 517
0x80000000|1, // match move
0x80000000|957, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 518
0x80000000|656, // match move
0x80000000|206, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 519
89,73, // "c"
  }
,
{ // state 520
94,431, // "e"
  }
,
{ // state 521
103,517, // "w"
  }
,
{ // state 522
99,868, // "t"
  }
,
{ // state 523
99,426, // "t"
  }
,
{ // state 524
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 525
92,463, // "s"
  }
,
{ // state 526
99,645, // "t"
  }
,
{ // state 527
0x80000000|616, // match move
0x80000000|214, // no-match move
// T-test match for 10:
156,
  }
,
{ // state 528
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 529
0x80000000|100, // match move
0x80000000|537, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 530
0x80000000|1, // match move
0x80000000|467, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 531
94,494, // "e"
  }
,
{ // state 532
94,587, // "e"
  }
,
{ // state 533
92,569, // "s"
99,743, // "t"
  }
,
{ // state 534
99,504, // "t"
  }
,
{ // state 535
97,111, // "n"
  }
,
{ // state 536
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 537
2,805, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 538
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 539
97,77, // "n"
  }
,
{ // state 540
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 541
91,22, // "a"
106,850, // "r"
108,127, // "u"
  }
,
{ // state 542
91,619, // "a"
94,521, // "e"
108,134, // "u"
  }
,
{ // state 543
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 544
94,248, // "e"
  }
,
{ // state 545
0x80000000|1, // match move
0x80000000|930, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 546
2,816, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+154, // $NT
  }
,
{ // state 547
92,354, // "s"
  }
,
{ // state 548
138,779, // idChar**
161,554, // idChar*
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 549
89,776, // "c"
90,776, // "l"
91,776, // "a"
92,776, // "s"
93,943, // idChar
94,776, // "e"
95,776, // "b"
96,776, // "o"
97,776, // "n"
98,776, // "x"
99,776, // "t"
100,776, // "d"
101,776, // "v"
102,776, // "i"
103,776, // "w"
104,776, // "h"
105,776, // "f"
106,776, // "r"
107,776, // "k"
108,776, // "u"
109,776, // "p"
110,776, // "y"
111,776, // "m"
112,776, // "g"
113,776, // "z"
137,556, // letter
148,348, // digit
149,325, // "_"
150,776, // {"A".."Z" "j" "q"}
151,518, // {"0".."9"}
  }
,
{ // state 550
5,70, // `boolean
6,149, // `class
7,390, // `extends
8,455, // `void
9,924, // `int
10,838, // `while
11,848, // `if
12,460, // `else
13,65, // `for
14,39, // `break
15,31, // `this
16,878, // `false
17,611, // `true
18,368, // `super
19,621, // `null
20,716, // `return
21,811, // `instanceof
22,1021, // `new
23,647, // `abstract
24,583, // `assert
25,890, // `byte
26,263, // `case
27,1011, // `catch
28,938, // `char
29,425, // `const
30,123, // `continue
31,625, // `default
32,353, // `do
33,142, // `double
34,750, // `enum
35,244, // `final
36,252, // `finally
37,257, // `float
38,1009, // `goto
39,551, // `implements
40,106, // `import
41,793, // `interface
42,678, // `long
43,48, // `native
44,471, // `package
45,196, // `private
46,831, // `protected
47,85, // `public
48,515, // `short
49,14, // `static
50,642, // `strictfp
51,457, // `switch
52,871, // `synchronized
53,769, // `throw
54,998, // `throws
55,341, // `transient
56,882, // `try
57,376, // `volatile
89,634, // "c"
90,760, // "l"
91,83, // "a"
92,45, // "s"
94,417, // "e"
95,429, // "b"
97,796, // "n"
99,124, // "t"
100,491, // "d"
101,175, // "v"
102,821, // "i"
103,951, // "w"
105,575, // "f"
106,386, // "r"
109,541, // "p"
112,146, // "g"
  }
,
{ // state 551
163,MIN_REDUCTION+229, // $NT
  }
,
{ // state 552
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 553
0x80000000|1, // match move
0x80000000|682, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 554
0x80000000|549, // match move
0x80000000|291, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 555
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 556
0x80000000|768, // match move
0x80000000|1008, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 557
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 558
96,1016, // "o"
  }
,
{ // state 559
102,754, // "i"
106,297, // "r"
  }
,
{ // state 560
119,1003, // "+"
  }
,
{ // state 561
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 562
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 563
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 564
102,787, // "i"
  }
,
{ // state 565
2,507, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+116, // $NT
  }
,
{ // state 566
90,896, // "l"
  }
,
{ // state 567
2,775, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 568
0x80000000|162, // match move
0x80000000|145, // no-match move
0x80000000|550, // NT-test-match state for reserved
  }
,
{ // state 569
94,749, // "e"
  }
,
{ // state 570
141,893, // '"'
  }
,
{ // state 571
91,895, // "a"
  }
,
{ // state 572
162,MIN_REDUCTION+0, // $
  }
,
{ // state 573
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 574
0x80000000|1, // match move
0x80000000|687, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 575
90,632, // "l"
91,729, // "a"
96,464, // "o"
102,1002, // "i"
  }
,
{ // state 576
2,819, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 577
97,807, // "n"
105,530, // "f"
111,604, // "m"
  }
,
{ // state 578
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 579
91,834, // "a"
  }
,
{ // state 580
2,448, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 581
108,5, // "u"
  }
,
{ // state 582
99,155, // "t"
  }
,
{ // state 583
163,MIN_REDUCTION+214, // $NT
  }
,
{ // state 584
0x80000000|718, // match move
0x80000000|610, // no-match move
0x80000000|78, // NT-test-match state for digit
  }
,
{ // state 585
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 586
2,1029, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 587
0x80000000|1, // match move
0x80000000|598, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 588
92,979, // "s"
99,505, // "t"
  }
,
{ // state 589
107,613, // "k"
  }
,
{ // state 590
156,813, // {10}
  }
,
{ // state 591
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 592
92,414, // "s"
  }
,
{ // state 593
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 594
0x80000000|461, // match move
0x80000000|473, // no-match move
0x80000000|78, // NT-test-match state for digit
  }
,
{ // state 595
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 596
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 597
99,8, // "t"
  }
,
{ // state 598
2,396, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 599
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 600
106,936, // "r"
  }
,
{ // state 601
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+131, // $NT
  }
,
{ // state 602
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 603
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 604
109,703, // "p"
  }
,
{ // state 605
92,25, // "s"
  }
,
{ // state 606
106,26, // "r"
  }
,
{ // state 607
2,898, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 608
2,499, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+112, // $NT
  }
,
{ // state 609
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 610
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 611
163,MIN_REDUCTION+207, // $NT
  }
,
{ // state 612
100,306, // "d"
  }
,
{ // state 613
0x80000000|1, // match move
0x80000000|402, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 614
91,920, // "a"
  }
,
{ // state 615
94,170, // "e"
  }
,
{ // state 616
156,839, // {10}
  }
,
{ // state 617
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 618
107,1006, // "k"
  }
,
{ // state 619
99,199, // "t"
  }
,
{ // state 620
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 621
163,MIN_REDUCTION+209, // $NT
  }
,
{ // state 622
0x80000000|1, // match move
0x80000000|285, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 623
96,534, // "o"
102,788, // "i"
  }
,
{ // state 624
0x80000000|1, // match move
0x80000000|383, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 625
163,MIN_REDUCTION+221, // $NT
  }
,
{ // state 626
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 627
105,477, // "f"
  }
,
{ // state 628
0x80000000|1, // match move
0x80000000|608, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 629
90,683, // "l"
  }
,
{ // state 630
91,826, // "a"
  }
,
{ // state 631
106,143, // "r"
  }
,
{ // state 632
96,862, // "o"
  }
,
{ // state 633
163,MIN_REDUCTION+333, // $NT
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 634
90,751, // "l"
91,533, // "a"
96,956, // "o"
104,187, // "h"
  }
,
{ // state 635
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 636
0x80000000|1, // match move
0x80000000|576, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 637
91,825, // "a"
  }
,
{ // state 638
2,68, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 639
2,804, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 640
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+113, // $NT
  }
,
{ // state 641
0x80000000|1, // match move
0x80000000|708, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 642
163,MIN_REDUCTION+240, // $NT
  }
,
{ // state 643
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 644
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 645
0x80000000|1, // match move
0x80000000|841, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 646
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 647
163,MIN_REDUCTION+213, // $NT
  }
,
{ // state 648
111,999, // "m"
  }
,
{ // state 649
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 650
0x80000000|1, // match move
0x80000000|887, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 651
0x80000000|1, // match move
0x80000000|906, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 652
0x80000000|1, // match move
0x80000000|378, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 653
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 654
94,309, // "e"
  }
,
{ // state 655
90,761, // "l"
  }
,
{ // state 656
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 657
0x80000000|137, // match move
0x80000000|928, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 658
91,118, // "a"
  }
,
{ // state 659
100,96, // "d"
  }
,
{ // state 660
2,635, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 661
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+193, // $NT
  }
,
{ // state 662
138,MIN_REDUCTION+318, // idChar**
149,MIN_REDUCTION+318, // "_"
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 663
94,362, // "e"
  }
,
{ // state 664
102,508, // "i"
  }
,
{ // state 665
105,374, // "f"
  }
,
{ // state 666
2,835, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 667
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 668
2,385, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 669
0x80000000|1, // match move
0x80000000|336, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 670
96,211, // "o"
  }
,
{ // state 671
97,387, // "n"
  }
,
{ // state 672
94,51, // "e"
  }
,
{ // state 673
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 674
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 675
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 676
2,872, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+170, // $NT
  }
,
{ // state 677
102,110, // "i"
  }
,
{ // state 678
163,MIN_REDUCTION+232, // $NT
  }
,
{ // state 679
2,253, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 680
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 681
0x80000000|1, // match move
0x80000000|296, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 682
2,282, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+118, // $NT
  }
,
{ // state 683
94,954, // "e"
  }
,
{ // state 684
0x80000000|1, // match move
0x80000000|699, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 685
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 686
3,6, // $$0
4,301, // token
5,709, // `boolean
6,986, // `class
7,404, // `extends
8,439, // `void
9,620, // `int
10,889, // `while
11,139, // `if
12,934, // `else
13,459, // `for
14,281, // `break
15,808, // `this
16,680, // `false
17,859, // `true
18,241, // `super
19,557, // `null
20,1028, // `return
21,209, // `instanceof
22,165, // `new
23,675, // `abstract
24,717, // `assert
25,498, // `byte
26,466, // `case
27,76, // `catch
28,163, // `char
29,561, // `const
30,245, // `continue
31,371, // `default
32,824, // `do
33,190, // `double
34,1022, // `enum
35,333, // `final
36,791, // `finally
37,929, // `float
38,456, // `goto
39,462, // `implements
40,573, // `import
41,327, // `interface
42,475, // `long
43,17, // `native
44,626, // `package
45,874, // `private
46,919, // `protected
47,585, // `public
48,673, // `short
49,555, // `static
50,191, // `strictfp
51,1026, // `switch
52,997, // `synchronized
53,781, // `throw
54,983, // `throws
55,540, // `transient
56,233, // `try
57,138, // `volatile
89,941, // "c"
90,183, // "l"
91,159, // "a"
92,84, // "s"
94,845, // "e"
95,240, // "b"
97,542, // "n"
99,250, // "t"
100,90, // "d"
101,235, // "v"
102,577, // "i"
103,780, // "w"
105,915, // "f"
106,993, // "r"
109,451, // "p"
112,782, // "g"
159,568, // token*
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 687
2,349, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 688
2,810, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 689
102,71, // "i"
  }
,
{ // state 690
99,903, // "t"
  }
,
{ // state 691
96,942, // "o"
  }
,
{ // state 692
94,995, // "e"
  }
,
{ // state 693
99,20, // "t"
  }
,
{ // state 694
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 695
92,681, // "s"
  }
,
{ // state 696
108,37, // "u"
  }
,
{ // state 697
2,230, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+110, // $NT
  }
,
{ // state 698
97,952, // "n"
  }
,
{ // state 699
2,176, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+188, // $NT
  }
,
{ // state 700
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+101, // $NT
  }
,
{ // state 701
89,36, // "c"
  }
,
{ // state 702
2,933, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 703
90,346, // "l"
96,600, // "o"
  }
,
{ // state 704
106,367, // "r"
  }
,
{ // state 705
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+189, // $NT
  }
,
{ // state 706
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 707
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 708
2,809, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+92, // $NT
  }
,
{ // state 709
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 710
89,47, // "c"
  }
,
{ // state 711
99,144, // "t"
  }
,
{ // state 712
0x80000000|94, // match move
0x80000000|989, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 713
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+125, // $NT
  }
,
{ // state 714
2,277, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+152, // $NT
  }
,
{ // state 715
0x80000000|1, // match move
0x80000000|758, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 716
163,MIN_REDUCTION+210, // $NT
  }
,
{ // state 717
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 718
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 719
91,347, // "a"
106,927, // "r"
  }
,
{ // state 720
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+95, // $NT
  }
,
{ // state 721
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+97, // $NT
  }
};
}
private class Initter2{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 722
108,1020, // "u"
  }
,
{ // state 723
106,10, // "r"
  }
,
{ // state 724
106,433, // "r"
  }
,
{ // state 725
90,270, // "l"
  }
,
{ // state 726
140,217, // dq
141,900, // '"'
144,379, // stringChar*
145,310, // $$1
  }
,
{ // state 727
92,968, // "s"
  }
,
{ // state 728
0x80000000|1, // match move
0x80000000|737, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 729
90,931, // "l"
  }
,
{ // state 730
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 731
90,126, // "l"
  }
,
{ // state 732
94,855, // "e"
  }
,
{ // state 733
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 734
90,3, // "l"
102,201, // "i"
  }
,
{ // state 735
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+127, // $NT
  }
,
{ // state 736
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 737
2,315, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 738
94,74, // "e"
  }
,
{ // state 739
92,894, // "s"
  }
,
{ // state 740
99,174, // "t"
  }
,
{ // state 741
106,95, // "r"
  }
,
{ // state 742
108,388, // "u"
  }
,
{ // state 743
89,990, // "c"
  }
,
{ // state 744
91,57, // "a"
  }
,
{ // state 745
94,449, // "e"
  }
,
{ // state 746
2,198, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 747
0x80000000|1, // match move
0x80000000|188, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 748
2,733, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 749
0x80000000|1, // match move
0x80000000|254, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 750
163,MIN_REDUCTION+224, // $NT
  }
,
{ // state 751
91,62, // "a"
  }
,
{ // state 752
94,300, // "e"
  }
,
{ // state 753
92,351, // "s"
  }
,
{ // state 754
92,833, // "s"
  }
,
{ // state 755
103,182, // "w"
  }
,
{ // state 756
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 757
102,394, // "i"
  }
,
{ // state 758
2,644, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 759
0x80000000|967, // match move
0x80000000|289, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 760
96,777, // "o"
  }
,
{ // state 761
0x80000000|731, // match move
0x80000000|59, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 762
94,305, // "e"
  }
,
{ // state 763
0x80000000|1, // match move
0x80000000|225, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 764
2,204, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 765
0x80000000|1, // match move
0x80000000|638, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 766
99,988, // "t"
  }
,
{ // state 767
99,1010, // "t"
  }
,
{ // state 768
MIN_REDUCTION+315, // (default reduction)
  }
,
{ // state 769
163,MIN_REDUCTION+243, // $NT
  }
,
{ // state 770
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 771
0x80000000|1, // match move
0x80000000|748, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 772
89,469, // "c"
  }
,
{ // state 773
99,615, // "t"
  }
,
{ // state 774
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+121, // $NT
  }
,
{ // state 775
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 776
0x80000000|189, // match move
0x80000000|513, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 777
97,50, // "n"
  }
,
{ // state 778
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 779
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 780
104,328, // "h"
  }
,
{ // state 781
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 782
96,740, // "o"
  }
,
{ // state 783
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 784
0x80000000|1, // match move
0x80000000|948, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 785
101,342, // "v"
  }
,
{ // state 786
140,217, // dq
141,900, // '"'
145,538, // $$1
  }
,
{ // state 787
89,54, // "c"
  }
,
{ // state 788
101,482, // "v"
  }
,
{ // state 789
2,343, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+148, // $NT
  }
,
{ // state 790
106,117, // "r"
  }
,
{ // state 791
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 792
94,724, // "e"
  }
,
{ // state 793
163,MIN_REDUCTION+231, // $NT
  }
,
{ // state 794
0x80000000|1, // match move
0x80000000|222, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 795
90,380, // "l"
  }
,
{ // state 796
91,480, // "a"
94,322, // "e"
108,566, // "u"
  }
,
{ // state 797
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 798
163,MIN_REDUCTION+332, // $NT
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 799
0x80000000|1, // match move
0x80000000|764, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 800
0x80000000|1, // match move
0x80000000|246, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 801
0x80000000|1, // match move
0x80000000|978, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 802
2,774, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+122, // $NT
  }
,
{ // state 803
97,588, // "n"
  }
,
{ // state 804
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 805
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 806
2,41, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 807
92,324, // "s"
99,759, // "t"
  }
,
{ // state 808
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 809
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+91, // $NT
  }
,
{ // state 810
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 811
163,MIN_REDUCTION+211, // $NT
  }
,
{ // state 812
103,99, // "w"
  }
,
{ // state 813
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 814
2,870, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 815
105,636, // "f"
  }
,
{ // state 816
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+153, // $NT
  }
,
{ // state 817
97,88, // "n"
  }
,
{ // state 818
99,757, // "t"
  }
,
{ // state 819
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 820
2,980, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 821
97,413, // "n"
105,910, // "f"
111,864, // "m"
  }
,
{ // state 822
0x80000000|493, // match move
0x80000000|662, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 823
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 824
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 825
106,411, // "r"
  }
,
{ // state 826
97,34, // "n"
  }
,
{ // state 827
2,158, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 828
111,738, // "m"
  }
,
{ // state 829
91,742, // "a"
  }
,
{ // state 830
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+143, // $NT
  }
,
{ // state 831
163,MIN_REDUCTION+236, // $NT
  }
,
{ // state 832
0x80000000|1, // match move
0x80000000|918, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 833
0x80000000|1, // match move
0x80000000|697, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 834
99,2, // "t"
  }
,
{ // state 835
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 836
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 837
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 838
163,MIN_REDUCTION+201, // $NT
  }
,
{ // state 839
163,MIN_REDUCTION+323, // $NT
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 840
89,148, // "c"
  }
,
{ // state 841
2,653, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 842
0x80000000|1, // match move
0x80000000|131, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 843
2,981, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+162, // $NT
  }
,
{ // state 844
0x80000000|64, // match move
0x80000000|548, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 845
90,888, // "l"
97,581, // "n"
98,1014, // "x"
  }
,
{ // state 846
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 847
0x80000000|1, // match move
0x80000000|580, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 848
163,MIN_REDUCTION+202, // $NT
  }
,
{ // state 849
97,696, // "n"
  }
,
{ // state 850
96,773, // "o"
102,393, // "i"
  }
,
{ // state 851
163,MIN_REDUCTION+322, // $NT
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 852
2,973, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+146, // $NT
  }
,
{ // state 853
94,902, // "e"
  }
,
{ // state 854
2,406, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 855
100,103, // "d"
  }
,
{ // state 856
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 857
90,194, // "l"
  }
,
{ // state 858
90,265, // "l"
  }
,
{ // state 859
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 860
99,926, // "t"
  }
,
{ // state 861
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 862
91,46, // "a"
  }
,
{ // state 863
97,977, // "n"
  }
,
{ // state 864
109,323, // "p"
  }
,
{ // state 865
2,381, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+130, // $NT
  }
,
{ // state 866
2,391, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 867
94,132, // "e"
  }
,
{ // state 868
105,93, // "f"
  }
,
{ // state 869
0x80000000|1, // match move
0x80000000|802, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 870
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 871
163,MIN_REDUCTION+242, // $NT
  }
,
{ // state 872
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+169, // $NT
  }
,
{ // state 873
108,249, // "u"
  }
,
{ // state 874
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 875
94,799, // "e"
  }
,
{ // state 876
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 877
163,MIN_REDUCTION+320, // $NT
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 878
163,MIN_REDUCTION+206, // $NT
  }
,
{ // state 879
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 880
94,251, // "e"
  }
,
{ // state 881
0x80000000|79, // match move
0x80000000|43, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 882
163,MIN_REDUCTION+246, // $NT
  }
,
{ // state 883
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+171, // $NT
  }
,
{ // state 884
2,830, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+144, // $NT
  }
,
{ // state 885
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 886
108,723, // "u"
  }
,
{ // state 887
2,69, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 888
92,435, // "s"
  }
,
{ // state 889
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 890
163,MIN_REDUCTION+215, // $NT
  }
,
{ // state 891
2,261, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+104, // $NT
  }
,
{ // state 892
94,935, // "e"
  }
,
{ // state 893
163,MIN_REDUCTION+308, // $NT
  }
,
{ // state 894
99,274, // "t"
  }
,
{ // state 895
90,881, // "l"
  }
,
{ // state 896
90,553, // "l"
  }
,
{ // state 897
0x80000000|1, // match move
0x80000000|789, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 898
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 899
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 900
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 901
-1, // $$start
-1, // start
-1, // white*
6, // $$0
301, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
861, // `!
925, // `!=
836, // `%
128, // `&&
133, // `*
365, // `(
135, // `)
646, // `{
186, // `}
536, // `-
267, // `+
177, // `=
562, // `==
247, // `[
649, // `]
756, // `||
178, // `<
179, // `<=
643, // `,
373, // `>
294, // `>=
524, // `.
369, // `;
215, // `++
116, // `--
200, // `/
987, // `:
104, // ID
226, // INT_LITERAL
667, // STRING_LITERAL
797, // CHARACTER_LITERAL
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "x"
822, // "t"
822, // "d"
822, // "v"
822, // "i"
822, // "w"
822, // "h"
822, // "f"
822, // "r"
822, // "k"
822, // "u"
822, // "p"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
-1, // reserved
657, // "!"
312, // "="
529, // "<"
66, // ">"
321, // "+"
907, // "-"
567, // "*"
432, // "%"
423, // "&"
932, // "("
814, // ")"
639, // "{"
476, // "}"
307, // "["
746, // "]"
975, // "|"
208, // "."
272, // ","
12, // ":"
166, // ";"
827, // "/"
666, // identifier
844, // letter
-1, // idChar**
586, // digit++
308, // dq
32, // '"'
-1, // stringChar
-1, // printable
-1, // stringChar*
-1, // $$1
966, // sq
563, // "'"
203, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
400, // {"0".."9"}
706, // white
444, // " "
444, // {9 12}
778, // eol
595, // {10}
443, // {13}
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
568, // token*
594, // digit+
-1, // idChar*
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 902
0x80000000|1, // match move
0x80000000|843, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 903
102,7, // "i"
  }
,
{ // state 904
102,147, // "i"
  }
,
{ // state 905
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+135, // $NT
  }
,
{ // state 906
2,89, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 907
0x80000000|157, // match move
0x80000000|660, // no-match move
// T-test match for "-":
120,
  }
,
{ // state 908
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 909
0x80000000|1, // match move
0x80000000|607, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 910
0x80000000|1, // match move
0x80000000|891, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 911
95,275, // "b"
  }
,
{ // state 912
163,MIN_REDUCTION+318, // $NT
  }
,
{ // state 913
106,160, // "r"
  }
,
{ // state 914
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 915
90,311, // "l"
91,858, // "a"
96,741, // "o"
102,483, // "i"
  }
,
{ // state 916
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 917
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 918
2,221, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+90, // $NT
  }
,
{ // state 919
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 920
112,212, // "g"
  }
,
{ // state 921
101,892, // "v"
  }
,
{ // state 922
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 923
0x80000000|1, // match move
0x80000000|865, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 924
163,MIN_REDUCTION+200, // $NT
  }
,
{ // state 925
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 926
94,223, // "e"
  }
,
{ // state 927
102,710, // "i"
  }
,
{ // state 928
2,259, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 929
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 930
2,1017, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 931
92,180, // "s"
  }
,
{ // state 932
2,736, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 933
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 934
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 935
0x80000000|1, // match move
0x80000000|1012, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 936
99,15, // "t"
  }
,
{ // state 937
91,539, // "a"
  }
,
{ // state 938
163,MIN_REDUCTION+218, // $NT
  }
,
{ // state 939
0x80000000|1, // match move
0x80000000|820, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 940
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 941
90,744, // "l"
91,81, // "a"
96,803, // "o"
104,637, // "h"
  }
,
{ // state 942
105,869, // "f"
  }
,
{ // state 943
0x80000000|917, // match move
0x80000000|846, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 944
1,572, // start
2,268, // white*
3,168, // $$0
4,301, // token
5,709, // `boolean
6,986, // `class
7,404, // `extends
8,439, // `void
9,620, // `int
10,889, // `while
11,139, // `if
12,934, // `else
13,459, // `for
14,281, // `break
15,808, // `this
16,680, // `false
17,859, // `true
18,241, // `super
19,557, // `null
20,1028, // `return
21,209, // `instanceof
22,165, // `new
23,675, // `abstract
24,717, // `assert
25,498, // `byte
26,466, // `case
27,76, // `catch
28,163, // `char
29,561, // `const
30,245, // `continue
31,371, // `default
32,824, // `do
33,190, // `double
34,1022, // `enum
35,333, // `final
36,791, // `finally
37,929, // `float
38,456, // `goto
39,462, // `implements
40,573, // `import
41,327, // `interface
42,475, // `long
43,17, // `native
44,626, // `package
45,874, // `private
46,919, // `protected
47,585, // `public
48,673, // `short
49,555, // `static
50,191, // `strictfp
51,1026, // `switch
52,997, // `synchronized
53,781, // `throw
54,983, // `throws
55,540, // `transient
56,233, // `try
57,138, // `volatile
89,941, // "c"
90,183, // "l"
91,159, // "a"
92,84, // "s"
94,845, // "e"
95,240, // "b"
97,542, // "n"
99,250, // "t"
100,90, // "d"
101,235, // "v"
102,577, // "i"
103,780, // "w"
105,915, // "f"
106,993, // "r"
109,451, // "p"
112,782, // "g"
159,568, // token*
162,MIN_REDUCTION+1, // $
  }
,
{ // state 945
2,236, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+176, // $NT
  }
,
{ // state 946
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 947
89,823, // "c"
90,823, // "l"
91,823, // "a"
92,823, // "s"
94,823, // "e"
95,823, // "b"
96,823, // "o"
97,823, // "n"
98,823, // "x"
99,823, // "t"
100,823, // "d"
101,823, // "v"
102,823, // "i"
103,823, // "w"
104,823, // "h"
105,823, // "f"
106,823, // "r"
107,823, // "k"
108,823, // "u"
109,823, // "p"
110,823, // "y"
111,823, // "m"
112,823, // "g"
113,823, // "z"
115,823, // "!"
116,823, // "="
117,823, // "<"
118,823, // ">"
119,823, // "+"
120,823, // "-"
121,823, // "*"
122,823, // "%"
123,823, // "&"
124,823, // "("
125,823, // ")"
126,823, // "{"
127,823, // "}"
128,823, // "["
129,823, // "]"
130,823, // "|"
131,823, // "."
132,823, // ","
133,823, // ":"
134,823, // ";"
135,823, // "/"
141,823, // '"'
142,434, // stringChar
143,410, // printable
144,379, // stringChar*
145,310, // $$1
147,823, // "'"
149,823, // "_"
150,823, // {"A".."Z" "j" "q"}
151,823, // {"0".."9"}
153,823, // " "
158,823, // {"#".."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 948
2,707, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 949
92,689, // "s"
  }
,
{ // state 950
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 951
104,677, // "h"
  }
,
{ // state 952
102,486, // "i"
  }
,
{ // state 953
2,705, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+190, // $NT
  }
,
{ // state 954
0x80000000|1, // match move
0x80000000|852, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 955
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+167, // $NT
  }
,
{ // state 956
97,502, // "n"
  }
,
{ // state 957
2,506, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 958
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 959
91,119, // "a"
  }
,
{ // state 960
95,629, // "b"
  }
,
{ // state 961
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 962
94,784, // "e"
  }
,
{ // state 963
90,532, // "l"
  }
,
{ // state 964
89,266, // "c"
  }
,
{ // state 965
97,842, // "n"
  }
,
{ // state 966
89,950, // "c"
90,950, // "l"
91,950, // "a"
92,950, // "s"
94,950, // "e"
95,950, // "b"
96,950, // "o"
97,950, // "n"
98,950, // "x"
99,950, // "t"
100,950, // "d"
101,950, // "v"
102,950, // "i"
103,950, // "w"
104,950, // "h"
105,950, // "f"
106,950, // "r"
107,950, // "k"
108,950, // "u"
109,950, // "p"
110,950, // "y"
111,950, // "m"
112,950, // "g"
113,950, // "z"
115,950, // "!"
116,950, // "="
117,950, // "<"
118,950, // ">"
119,950, // "+"
120,950, // "-"
121,950, // "*"
122,950, // "%"
123,950, // "&"
124,950, // "("
125,950, // ")"
126,950, // "{"
127,950, // "}"
128,950, // "["
129,950, // "]"
130,950, // "|"
131,950, // "."
132,950, // ","
133,950, // ":"
134,950, // ";"
135,950, // "/"
141,950, // '"'
143,495, // printable
147,950, // "'"
149,950, // "_"
150,950, // {"A".."Z" "j" "q"}
151,950, // {"0".."9"}
153,950, // " "
158,950, // {"#".."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 967
94,185, // "e"
  }
,
{ // state 968
99,913, // "t"
  }
,
{ // state 969
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 970
92,114, // "s"
  }
,
{ // state 971
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 972
94,446, // "e"
  }
,
{ // state 973
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+145, // $NT
  }
,
{ // state 974
96,755, // "o"
  }
,
{ // state 975
130,107, // "|"
  }
,
{ // state 976
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+137, // $NT
  }
,
{ // state 977
0x80000000|1, // match move
0x80000000|984, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 978
2,18, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 979
99,9, // "t"
  }
,
{ // state 980
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 981
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+161, // $NT
  }
,
{ // state 982
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 983
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 984
2,40, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+94, // $NT
  }
,
{ // state 985
102,11, // "i"
  }
,
{ // state 986
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 987
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 988
94,923, // "e"
  }
,
{ // state 989
2,730, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 990
104,624, // "h"
  }
,
{ // state 991
89,392, // "c"
  }
,
{ // state 992
90,24, // "l"
102,101, // "i"
  }
,
{ // state 993
94,269, // "e"
  }
,
{ // state 994
0x80000000|1, // match move
0x80000000|1015, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 995
100,330, // "d"
  }
,
{ // state 996
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 997
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 998
163,MIN_REDUCTION+244, // $NT
  }
,
{ // state 999
94,55, // "e"
  }
,
{ // state 1000
163,MIN_REDUCTION+315, // $NT
  }
,
{ // state 1001
2,487, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+156, // $NT
  }
,
{ // state 1002
97,350, // "n"
  }
,
{ // state 1003
2,876, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 1004
91,98, // "a"
  }
,
{ // state 1005
92,762, // "s"
  }
,
{ // state 1006
91,262, // "a"
  }
,
{ // state 1007
0x80000000|1, // match move
0x80000000|38, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 1008
MIN_REDUCTION+315, // (default reduction)
  }
,
{ // state 1009
163,MIN_REDUCTION+228, // $NT
  }
,
{ // state 1010
0x80000000|1, // match move
0x80000000|945, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 1011
163,MIN_REDUCTION+217, // $NT
  }
,
{ // state 1012
2,412, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+166, // $NT
  }
,
{ // state 1013
2,120, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 1014
99,273, // "t"
  }
,
{ // state 1015
2,424, // white*
152,908, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 1016
0x80000000|1, // match move
0x80000000|1001, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 1017
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 1018
152,798, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+99, // $NT
  }
,
{ // state 1019
0x80000000|1, // match move
0x80000000|953, // no-match move
0x80000000|60, // NT-test-match state for idChar
  }
,
{ // state 1020
106,13, // "r"
  }
,
{ // state 1021
163,MIN_REDUCTION+212, // $NT
  }
,
{ // state 1022
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 1023
2,256, // white*
152,633, // white
153,877, // " "
154,877, // {9 12}
155,105, // eol
156,851, // {10}
157,527, // {13}
163,MIN_REDUCTION+186, // $NT
  }
,
{ // state 1024
96,725, // "o"
  }
,
{ // state 1025
99,558, // "t"
  }
,
{ // state 1026
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 1027
108,531, // "u"
  }
,
{ // state 1028
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 1029
152,599, // white
153,996, // " "
154,996, // {9 12}
155,489, // eol
156,497, // {10}
157,224, // {13}
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 1030
90,86, // "l"
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[1031][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
  doneSoFar += new Initter2().doInit(doneSoFar);
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
// `super ::= "s" "u" "p" "e" "r" !idChar white*
(18<<16)+6,
// `super ::= "s" "u" "p" "e" "r" !idChar
(18<<16)+5,
// `null ::= "n" "u" "l" "l" !idChar white*
(19<<16)+5,
// `null ::= "n" "u" "l" "l" !idChar
(19<<16)+4,
// `return ::= "r" "e" "t" "u" "r" "n" !idChar white*
(20<<16)+7,
// `return ::= "r" "e" "t" "u" "r" "n" !idChar
(20<<16)+6,
// `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar white*
(21<<16)+11,
// `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar
(21<<16)+10,
// `new ::= "n" "e" "w" !idChar white*
(22<<16)+4,
// `new ::= "n" "e" "w" !idChar
(22<<16)+3,
// `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar white*
(23<<16)+9,
// `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar
(23<<16)+8,
// `assert ::= "a" "s" "s" "e" "r" "t" !idChar white*
(24<<16)+7,
// `assert ::= "a" "s" "s" "e" "r" "t" !idChar
(24<<16)+6,
// `byte ::= "b" "y" "t" "e" !idChar white*
(25<<16)+5,
// `byte ::= "b" "y" "t" "e" !idChar
(25<<16)+4,
// `case ::= "c" "a" "s" "e" !idChar white*
(26<<16)+5,
// `case ::= "c" "a" "s" "e" !idChar
(26<<16)+4,
// `catch ::= "c" "a" "t" "c" "h" !idChar white*
(27<<16)+6,
// `catch ::= "c" "a" "t" "c" "h" !idChar
(27<<16)+5,
// `char ::= "c" "h" "a" "r" !idChar white*
(28<<16)+5,
// `char ::= "c" "h" "a" "r" !idChar
(28<<16)+4,
// `const ::= "c" "o" "n" "s" "t" !idChar white*
(29<<16)+6,
// `const ::= "c" "o" "n" "s" "t" !idChar
(29<<16)+5,
// `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar white*
(30<<16)+9,
// `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar
(30<<16)+8,
// `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar white*
(31<<16)+8,
// `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar
(31<<16)+7,
// `do ::= "d" "o" !idChar white*
(32<<16)+3,
// `do ::= "d" "o" !idChar
(32<<16)+2,
// `double ::= "d" "o" "u" "b" "l" "e" !idChar white*
(33<<16)+7,
// `double ::= "d" "o" "u" "b" "l" "e" !idChar
(33<<16)+6,
// `enum ::= "e" "n" "u" "m" !idChar white*
(34<<16)+5,
// `enum ::= "e" "n" "u" "m" !idChar
(34<<16)+4,
// `final ::= "f" "i" "n" "a" "l" !idChar white*
(35<<16)+6,
// `final ::= "f" "i" "n" "a" "l" !idChar
(35<<16)+5,
// `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar white*
(36<<16)+8,
// `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar
(36<<16)+7,
// `float ::= "f" "l" "o" "a" "t" !idChar white*
(37<<16)+6,
// `float ::= "f" "l" "o" "a" "t" !idChar
(37<<16)+5,
// `goto ::= "g" "o" "t" "o" !idChar white*
(38<<16)+5,
// `goto ::= "g" "o" "t" "o" !idChar
(38<<16)+4,
// `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar white*
(39<<16)+11,
// `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar
(39<<16)+10,
// `import ::= "i" "m" "p" "o" "r" "t" !idChar white*
(40<<16)+7,
// `import ::= "i" "m" "p" "o" "r" "t" !idChar
(40<<16)+6,
// `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar white*
(41<<16)+10,
// `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar
(41<<16)+9,
// `long ::= "l" "o" "n" "g" !idChar white*
(42<<16)+5,
// `long ::= "l" "o" "n" "g" !idChar
(42<<16)+4,
// `native ::= "n" "a" "t" "i" "v" "e" !idChar white*
(43<<16)+7,
// `native ::= "n" "a" "t" "i" "v" "e" !idChar
(43<<16)+6,
// `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar white*
(44<<16)+8,
// `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar
(44<<16)+7,
// `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar white*
(45<<16)+8,
// `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar
(45<<16)+7,
// `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar white*
(46<<16)+10,
// `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar
(46<<16)+9,
// `public ::= "p" "u" "b" "l" "i" "c" !idChar white*
(47<<16)+7,
// `public ::= "p" "u" "b" "l" "i" "c" !idChar
(47<<16)+6,
// `short ::= "s" "h" "o" "r" "t" !idChar white*
(48<<16)+6,
// `short ::= "s" "h" "o" "r" "t" !idChar
(48<<16)+5,
// `static ::= "s" "t" "a" "t" "i" "c" !idChar white*
(49<<16)+7,
// `static ::= "s" "t" "a" "t" "i" "c" !idChar
(49<<16)+6,
// `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar white*
(50<<16)+9,
// `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar
(50<<16)+8,
// `switch ::= "s" "w" "i" "t" "c" "h" !idChar white*
(51<<16)+7,
// `switch ::= "s" "w" "i" "t" "c" "h" !idChar
(51<<16)+6,
// `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar white*
(52<<16)+13,
// `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar
(52<<16)+12,
// `throw ::= "t" "h" "r" "o" "w" !idChar white*
(53<<16)+6,
// `throw ::= "t" "h" "r" "o" "w" !idChar
(53<<16)+5,
// `throws ::= "t" "h" "r" "o" "w" "s" !idChar white*
(54<<16)+7,
// `throws ::= "t" "h" "r" "o" "w" "s" !idChar
(54<<16)+6,
// `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar white*
(55<<16)+10,
// `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar
(55<<16)+9,
// `try ::= "t" "r" "y" !idChar white*
(56<<16)+4,
// `try ::= "t" "r" "y" !idChar
(56<<16)+3,
// `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar white*
(57<<16)+9,
// `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar
(57<<16)+8,
// reserved ::= `class
(114<<16)+1,
// reserved ::= `else
(114<<16)+1,
// reserved ::= `boolean
(114<<16)+1,
// reserved ::= `extends
(114<<16)+1,
// reserved ::= `void
(114<<16)+1,
// reserved ::= `int
(114<<16)+1,
// reserved ::= `while
(114<<16)+1,
// reserved ::= `if
(114<<16)+1,
// reserved ::= `for
(114<<16)+1,
// reserved ::= `break
(114<<16)+1,
// reserved ::= `this
(114<<16)+1,
// reserved ::= `false
(114<<16)+1,
// reserved ::= `true
(114<<16)+1,
// reserved ::= `super
(114<<16)+1,
// reserved ::= `null
(114<<16)+1,
// reserved ::= `return
(114<<16)+1,
// reserved ::= `instanceof
(114<<16)+1,
// reserved ::= `new
(114<<16)+1,
// reserved ::= `abstract
(114<<16)+1,
// reserved ::= `assert
(114<<16)+1,
// reserved ::= `byte
(114<<16)+1,
// reserved ::= `case
(114<<16)+1,
// reserved ::= `catch
(114<<16)+1,
// reserved ::= `char
(114<<16)+1,
// reserved ::= `const
(114<<16)+1,
// reserved ::= `continue
(114<<16)+1,
// reserved ::= `default
(114<<16)+1,
// reserved ::= `do
(114<<16)+1,
// reserved ::= `double
(114<<16)+1,
// reserved ::= `enum
(114<<16)+1,
// reserved ::= `final
(114<<16)+1,
// reserved ::= `finally
(114<<16)+1,
// reserved ::= `float
(114<<16)+1,
// reserved ::= `goto
(114<<16)+1,
// reserved ::= `implements
(114<<16)+1,
// reserved ::= `import
(114<<16)+1,
// reserved ::= `interface
(114<<16)+1,
// reserved ::= `long
(114<<16)+1,
// reserved ::= `native
(114<<16)+1,
// reserved ::= `package
(114<<16)+1,
// reserved ::= `private
(114<<16)+1,
// reserved ::= `protected
(114<<16)+1,
// reserved ::= `public
(114<<16)+1,
// reserved ::= `short
(114<<16)+1,
// reserved ::= `static
(114<<16)+1,
// reserved ::= `strictfp
(114<<16)+1,
// reserved ::= `switch
(114<<16)+1,
// reserved ::= `synchronized
(114<<16)+1,
// reserved ::= `throw
(114<<16)+1,
// reserved ::= `throws
(114<<16)+1,
// reserved ::= `transient
(114<<16)+1,
// reserved ::= `try
(114<<16)+1,
// reserved ::= `volatile
(114<<16)+1,
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
// identifier ::= letter idChar**
(136<<16)+2,
// identifier ::= letter !idChar
(136<<16)+1,
// ID ::= !reserved identifier white*
(85<<16)+2,
// ID ::= !reserved identifier
(85<<16)+1,
// INT_LITERAL ::= digit++ white*
(86<<16)+2,
// INT_LITERAL ::= digit++
(86<<16)+1,
// dq ::= '"'
(140<<16)+1,
// stringChar ::= !dq printable
(142<<16)+1,
// STRING_LITERAL ::= dq stringChar* $$1
(87<<16)+3,
// STRING_LITERAL ::= dq $$1
(87<<16)+2,
// sq ::= "'"
(146<<16)+1,
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
(137<<16)+1,
// digit ::= {"0".."9"}
(148<<16)+1,
// white ::= {9 12 " "}
(152<<16)+1,
// white ::= eol
(152<<16)+1,
// eol ::= {10}
(155<<16)+1,
// eol ::= {13} {10}
(155<<16)+2,
// eol ::= {13} !10
(155<<16)+1,
// printable ::= {" ".."~"}
(143<<16)+1,
// token* ::= token* token
(159<<16)+2,
// token* ::= token
(159<<16)+1,
// digit++ ::= digit+ !digit
(139<<16)+1,
// idChar** ::= idChar* !idChar
(138<<16)+1,
// stringChar* ::= stringChar* stringChar
(144<<16)+2,
// stringChar* ::= stringChar
(144<<16)+1,
// white* ::= white* white
(2<<16)+2,
// white* ::= white
(2<<16)+1,
// digit+ ::= digit
(160<<16)+1,
// digit+ ::= digit+ digit
(160<<16)+2,
// idChar* ::= idChar* idChar
(161<<16)+2,
// idChar* ::= idChar
(161<<16)+1,
// $$0 ::= token*
(3<<16)+1,
// $$1 ::= dq white*
(145<<16)+2,
// $$1 ::= dq
(145<<16)+1,
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
154, // 9
156, // 10
-1, // 11
154, // 12
157, // 13
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
153, // " "
115, // "!"
141, // '"'
158, // "#"
158, // "$"
122, // "%"
123, // "&"
147, // "'"
124, // "("
125, // ")"
121, // "*"
119, // "+"
132, // ","
120, // "-"
131, // "."
135, // "/"
151, // "0"
151, // "1"
151, // "2"
151, // "3"
151, // "4"
151, // "5"
151, // "6"
151, // "7"
151, // "8"
151, // "9"
133, // ":"
134, // ";"
117, // "<"
116, // "="
118, // ">"
158, // "?"
158, // "@"
150, // "A"
150, // "B"
150, // "C"
150, // "D"
150, // "E"
150, // "F"
150, // "G"
150, // "H"
150, // "I"
150, // "J"
150, // "K"
150, // "L"
150, // "M"
150, // "N"
150, // "O"
150, // "P"
150, // "Q"
150, // "R"
150, // "S"
150, // "T"
150, // "U"
150, // "V"
150, // "W"
150, // "X"
150, // "Y"
150, // "Z"
128, // "["
158, // "\"
129, // "]"
158, // "^"
149, // "_"
158, // "`"
91, // "a"
95, // "b"
89, // "c"
100, // "d"
94, // "e"
105, // "f"
112, // "g"
104, // "h"
102, // "i"
150, // "j"
107, // "k"
90, // "l"
111, // "m"
97, // "n"
96, // "o"
109, // "p"
150, // "q"
106, // "r"
92, // "s"
99, // "t"
108, // "u"
101, // "v"
103, // "w"
98, // "x"
110, // "y"
113, // "z"
126, // "{"
130, // "|"
127, // "}"
158, // "~"
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
-1, // 255
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
"", // 227
"", // 228
"", // 229
"", // 230
"", // 231
"", // 232
"", // 233
"", // 234
"", // 235
"", // 236
"", // 237
"", // 238
"", // 239
"", // 240
"", // 241
"", // 242
"", // 243
"", // 244
"", // 245
"", // 246
"", // 247
"", // 248
"", // 249
"", // 250
"", // 251
"", // 252
"", // 253
"", // 254
"", // 255
"", // 256
"", // 257
"", // 258
"", // 259
"", // 260
"", // 261
"", // 262
"", // 263
"", // 264
"", // 265
"", // 266
"", // 267
"", // 268
"", // 269
"", // 270
"", // 271
"", // 272
"", // 273
"", // 274
"", // 275
"", // 276
"", // 277
"", // 278
"", // 279
"", // 280
"", // 281
"", // 282
"", // 283
"", // 284
"", // 285
"", // 286
"", // 287
"", // 288
"", // 289
"", // 290
"", // 291
"", // 292
"", // 293
"", // 294
"", // 295
"", // 296
"", // 297
"", // 298
"", // 299
"", // 300
"", // 301
"", // 302
"", // 303
"", // 304
"", // 305
"", // 306
"", // 307
"", // 308
"", // 309
"", // 310
"", // 311
"", // 312
"", // 313
"", // 314
"", // 315
"", // 316
"", // 317
"", // 318
"", // 319
"", // 320
"", // 321
"", // 322
"", // 323
"", // 324
"", // 325
"token* ::= token* token", // 326
"token* ::= token* token", // 327
"digit++ ::= digit+ !digit", // 328
"idChar** ::= idChar* !idChar", // 329
"stringChar* ::= stringChar* stringChar", // 330
"stringChar* ::= stringChar* stringChar", // 331
"white* ::= white* white", // 332
"white* ::= white* white", // 333
"digit+ ::= digit", // 334
"digit+ ::= digit+ digit", // 335
"idChar* ::= idChar* idChar", // 336
"idChar* ::= idChar* idChar", // 337
"", // 338
"", // 339
"", // 340
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
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 4: start ::= [white*] $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
    },
    { // 5: token ::= [#] `boolean @sawBoolean(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 6: token ::= [#] `class @sawClass(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 7: token ::= [#] `extends @sawExtends(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 8: token ::= [#] `void @sawVoid(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 9: token ::= [#] `int @sawInt(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: token ::= [#] `while @sawWhile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 11: token ::= [#] `if @sawIf(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 12: token ::= [#] `else @sawElse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 13: token ::= [#] `for @sawFor(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 14: token ::= [#] `break @sawBreak(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 15: token ::= [#] `this @sawThis(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 16: token ::= [#] `false @sawFalse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 17: token ::= [#] `true @sawTrue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 18: token ::= [#] `super @sawSuper(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 19: token ::= [#] `null @sawNull(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 20: token ::= [#] `return @sawReturn(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 21: token ::= [#] `instanceof @sawInstanceof(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 22: token ::= [#] `new @sawNew(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 23: token ::= [#] `abstract @sawAbstract(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 24: token ::= [#] `assert @sawAssert(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 25: token ::= [#] `byte @sawByte(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 26: token ::= [#] `case @sawCase(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 27: token ::= [#] `catch @sawCatch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 28: token ::= [#] `char @sawChar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 29: token ::= [#] `const @sawConst(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 30: token ::= [#] `continue @sawContinue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 31: token ::= [#] `default @sawDefault(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 32: token ::= [#] `do @sawDo(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 33: token ::= [#] `double @sawDouble(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 34: token ::= [#] `enum @sawEnum(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 35: token ::= [#] `final @sawFinal(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 36: token ::= [#] `finally @sawFinally(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 37: token ::= [#] `float @sawFloat(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 38: token ::= [#] `goto @sawGoto(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 39: token ::= [#] `implements @sawImplements(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 40: token ::= [#] `import @sawImport(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 41: token ::= [#] `interface @sawInterface(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 42: token ::= [#] `long @sawLong(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 43: token ::= [#] `native @sawNative(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 44: token ::= [#] `package @sawPackage(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 45: token ::= [#] `private @sawPrivate(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 46: token ::= [#] `protected @sawProtected(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 47: token ::= [#] `public @sawPublic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 48: token ::= [#] `short @sawShort(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 49: token ::= [#] `static @sawStatic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 50: token ::= [#] `strictfp @sawStrictfp(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 51: token ::= [#] `switch @sawSwitch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 52: token ::= [#] `synchronized @sawSynchronized(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 53: token ::= [#] `throw @sawThrow(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((48<<5)|0x5)/*methodCall:48*/,
    },
    { // 54: token ::= [#] `throws @sawThrows(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((49<<5)|0x5)/*methodCall:49*/,
    },
    { // 55: token ::= [#] `transient @sawTransient(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 56: token ::= [#] `try @sawTry(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 57: token ::= [#] `volatile @sawVolatile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((52<<5)|0x5)/*methodCall:52*/,
    },
    { // 58: token ::= [#] `! @sawNot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((53<<5)|0x5)/*methodCall:53*/,
    },
    { // 59: token ::= [#] `!= @sawNotEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 60: token ::= [#] `% @sawRemainder(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((55<<5)|0x5)/*methodCall:55*/,
    },
    { // 61: token ::= [#] `&& @sawAnd(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 62: token ::= [#] `* @sawTimes(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((57<<5)|0x5)/*methodCall:57*/,
    },
    { // 63: token ::= [#] `( @sawLpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((58<<5)|0x5)/*methodCall:58*/,
    },
    { // 64: token ::= [#] `) @sawRpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((59<<5)|0x5)/*methodCall:59*/,
    },
    { // 65: token ::= [#] `{ @sawLbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((60<<5)|0x5)/*methodCall:60*/,
    },
    { // 66: token ::= [#] `} @sawRbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((61<<5)|0x5)/*methodCall:61*/,
    },
    { // 67: token ::= [#] `- @sawMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((62<<5)|0x5)/*methodCall:62*/,
    },
    { // 68: token ::= [#] `+ @sawPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((63<<5)|0x5)/*methodCall:63*/,
    },
    { // 69: token ::= [#] `= @sawAssign(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((64<<5)|0x5)/*methodCall:64*/,
    },
    { // 70: token ::= [#] `== @sawEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((65<<5)|0x5)/*methodCall:65*/,
    },
    { // 71: token ::= [#] `[ @sawLbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((66<<5)|0x5)/*methodCall:66*/,
    },
    { // 72: token ::= [#] `] @sawRbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((67<<5)|0x5)/*methodCall:67*/,
    },
    { // 73: token ::= [#] `|| @sawOr(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((68<<5)|0x5)/*methodCall:68*/,
    },
    { // 74: token ::= [#] `< @sawLess(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((69<<5)|0x5)/*methodCall:69*/,
    },
    { // 75: token ::= [#] `<= @sawLessEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((70<<5)|0x5)/*methodCall:70*/,
    },
    { // 76: token ::= [#] `, @sawComma(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((71<<5)|0x5)/*methodCall:71*/,
    },
    { // 77: token ::= [#] `> @sawGreater(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((72<<5)|0x5)/*methodCall:72*/,
    },
    { // 78: token ::= [#] `>= @sawGreaterEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((73<<5)|0x5)/*methodCall:73*/,
    },
    { // 79: token ::= [#] `. @sawDot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((74<<5)|0x5)/*methodCall:74*/,
    },
    { // 80: token ::= [#] `; @sawSemi(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((75<<5)|0x5)/*methodCall:75*/,
    },
    { // 81: token ::= [#] `++ @sawPlusPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((76<<5)|0x5)/*methodCall:76*/,
    },
    { // 82: token ::= [#] `-- @sawMinusMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((77<<5)|0x5)/*methodCall:77*/,
    },
    { // 83: token ::= [#] `/ @sawSlash(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((78<<5)|0x5)/*methodCall:78*/,
    },
    { // 84: token ::= [#] `: @sawColon(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((79<<5)|0x5)/*methodCall:79*/,
    },
    { // 85: token ::= [#] ID @identifier(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((80<<5)|0x5)/*methodCall:80*/,
    },
    { // 86: token ::= [#] INT_LITERAL @intLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((81<<5)|0x5)/*methodCall:81*/,
    },
    { // 87: token ::= [#] STRING_LITERAL @stringLit(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((82<<5)|0x5)/*methodCall:82*/,
    },
    { // 88: token ::= [#] CHARACTER_LITERAL @charLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 115: `super ::= "s" "u" "p" "e" "r" !idChar white* @void
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
    { // 116: `super ::= "s" "u" "p" "e" "r" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 117: `null ::= "n" "u" "l" "l" !idChar white* @void
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
    { // 118: `null ::= "n" "u" "l" "l" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 119: `return ::= "r" "e" "t" "u" "r" "n" !idChar white* @void
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
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 120: `return ::= "r" "e" "t" "u" "r" "n" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 121: `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar white* @void
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
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x3)/*popOffPushBack:10*/,
    },
    { // 122: `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x3)/*popOffPushBack:10*/,
    },
    { // 123: `new ::= "n" "e" "w" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 124: `new ::= "n" "e" "w" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 125: `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar white* @void
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
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 126: `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 127: `assert ::= "a" "s" "s" "e" "r" "t" !idChar white* @void
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
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 128: `assert ::= "a" "s" "s" "e" "r" "t" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 129: `byte ::= "b" "y" "t" "e" !idChar white* @void
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
    { // 130: `byte ::= "b" "y" "t" "e" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 131: `case ::= "c" "a" "s" "e" !idChar white* @void
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
    { // 132: `case ::= "c" "a" "s" "e" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 133: `catch ::= "c" "a" "t" "c" "h" !idChar white* @void
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
    { // 134: `catch ::= "c" "a" "t" "c" "h" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 135: `char ::= "c" "h" "a" "r" !idChar white* @void
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
    { // 136: `char ::= "c" "h" "a" "r" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 137: `const ::= "c" "o" "n" "s" "t" !idChar white* @void
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
    { // 138: `const ::= "c" "o" "n" "s" "t" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 139: `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar white* @void
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
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 140: `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 141: `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar white* @void
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
    { // 142: `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 143: `do ::= "d" "o" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 144: `do ::= "d" "o" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 145: `double ::= "d" "o" "u" "b" "l" "e" !idChar white* @void
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
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 146: `double ::= "d" "o" "u" "b" "l" "e" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 147: `enum ::= "e" "n" "u" "m" !idChar white* @void
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
    { // 148: `enum ::= "e" "n" "u" "m" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 149: `final ::= "f" "i" "n" "a" "l" !idChar white* @void
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
    { // 150: `final ::= "f" "i" "n" "a" "l" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 151: `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar white* @void
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
    { // 152: `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 153: `float ::= "f" "l" "o" "a" "t" !idChar white* @void
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
    { // 154: `float ::= "f" "l" "o" "a" "t" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 155: `goto ::= "g" "o" "t" "o" !idChar white* @void
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
    { // 156: `goto ::= "g" "o" "t" "o" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 157: `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar white* @void
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
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x3)/*popOffPushBack:10*/,
    },
    { // 158: `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x3)/*popOffPushBack:10*/,
    },
    { // 159: `import ::= "i" "m" "p" "o" "r" "t" !idChar white* @void
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
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 160: `import ::= "i" "m" "p" "o" "r" "t" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 161: `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar white* @void
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
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 162: `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 163: `long ::= "l" "o" "n" "g" !idChar white* @void
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
    { // 164: `long ::= "l" "o" "n" "g" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 165: `native ::= "n" "a" "t" "i" "v" "e" !idChar white* @void
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
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 166: `native ::= "n" "a" "t" "i" "v" "e" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 167: `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar white* @void
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
    { // 168: `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 169: `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar white* @void
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
    { // 170: `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 171: `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar white* @void
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
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 172: `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 173: `public ::= "p" "u" "b" "l" "i" "c" !idChar white* @void
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
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 174: `public ::= "p" "u" "b" "l" "i" "c" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 175: `short ::= "s" "h" "o" "r" "t" !idChar white* @void
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
    { // 176: `short ::= "s" "h" "o" "r" "t" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 177: `static ::= "s" "t" "a" "t" "i" "c" !idChar white* @void
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
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 178: `static ::= "s" "t" "a" "t" "i" "c" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 179: `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar white* @void
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
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 180: `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 181: `switch ::= "s" "w" "i" "t" "c" "h" !idChar white* @void
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
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 182: `switch ::= "s" "w" "i" "t" "c" "h" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 183: `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar white* @void
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
      ((12<<5)|0x3)/*popOffPushBack:12*/,
    },
    { // 184: `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((12<<5)|0x3)/*popOffPushBack:12*/,
    },
    { // 185: `throw ::= "t" "h" "r" "o" "w" !idChar white* @void
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
    { // 186: `throw ::= "t" "h" "r" "o" "w" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 187: `throws ::= "t" "h" "r" "o" "w" "s" !idChar white* @void
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
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 188: `throws ::= "t" "h" "r" "o" "w" "s" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 189: `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar white* @void
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
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 190: `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 191: `try ::= "t" "r" "y" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 192: `try ::= "t" "r" "y" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 193: `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar white* @void
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
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 194: `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 195: reserved ::= `class @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 196: reserved ::= `else @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 197: reserved ::= `boolean @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 198: reserved ::= `extends @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 199: reserved ::= `void @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 200: reserved ::= `int @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 201: reserved ::= `while @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 202: reserved ::= `if @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 203: reserved ::= `for @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 204: reserved ::= `break @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 205: reserved ::= `this @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 206: reserved ::= `false @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 207: reserved ::= `true @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 208: reserved ::= `super @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 209: reserved ::= `null @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 210: reserved ::= `return @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 211: reserved ::= `instanceof @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 212: reserved ::= `new @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 213: reserved ::= `abstract @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 214: reserved ::= `assert @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 215: reserved ::= `byte @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 216: reserved ::= `case @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 217: reserved ::= `catch @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 218: reserved ::= `char @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 219: reserved ::= `const @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 220: reserved ::= `continue @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 221: reserved ::= `default @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 222: reserved ::= `do @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 223: reserved ::= `double @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 224: reserved ::= `enum @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 225: reserved ::= `final @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 226: reserved ::= `finally @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 227: reserved ::= `float @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 228: reserved ::= `goto @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 229: reserved ::= `implements @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 230: reserved ::= `import @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 231: reserved ::= `interface @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 232: reserved ::= `long @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 233: reserved ::= `native @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 234: reserved ::= `package @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 235: reserved ::= `private @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 236: reserved ::= `protected @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 237: reserved ::= `public @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 238: reserved ::= `short @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 239: reserved ::= `static @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 240: reserved ::= `strictfp @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 241: reserved ::= `switch @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 242: reserved ::= `synchronized @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 243: reserved ::= `throw @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 244: reserved ::= `throws @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 245: reserved ::= `transient @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 246: reserved ::= `try @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 247: reserved ::= `volatile @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 248: `! ::= "!" !"=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 249: `! ::= "!" !"=" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 250: `!= ::= "!" "=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 251: `!= ::= "!" "=" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 252: `= ::= "=" !"=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 253: `= ::= "=" !"=" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 254: `== ::= "=" "=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 255: `== ::= "=" "=" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 256: `< ::= "<" !"=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 257: `< ::= "<" !"=" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 258: `<= ::= "<" "=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 259: `<= ::= "<" "=" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 260: `> ::= ">" !"=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 261: `> ::= ">" !"=" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 262: `>= ::= ">" "=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 263: `>= ::= ">" "=" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 264: `+ ::= "+" !"+" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 265: `+ ::= "+" !"+" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 266: `++ ::= "+" "+" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 267: `++ ::= "+" "+" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 268: `- ::= "-" !"-" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 269: `- ::= "-" !"-" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 270: `-- ::= "-" "-" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 271: `-- ::= "-" "-" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 272: `* ::= "*" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 273: `* ::= "*" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 274: `% ::= "%" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 275: `% ::= "%" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 276: `&& ::= "&" "&" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 277: `&& ::= "&" "&" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 278: `( ::= "(" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 279: `( ::= "(" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 280: `) ::= ")" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 281: `) ::= ")" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 282: `{ ::= "{" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 283: `{ ::= "{" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 284: `} ::= "}" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 285: `} ::= "}" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 286: `[ ::= "[" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 287: `[ ::= "[" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 288: `] ::= "]" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 289: `] ::= "]" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 290: `|| ::= "|" "|" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 291: `|| ::= "|" "|" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 292: `. ::= "." white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 293: `. ::= "." [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 294: `, ::= "," white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 295: `, ::= "," [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 296: `: ::= ":" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 297: `: ::= ":" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 298: `; ::= ";" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 299: `; ::= ";" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 300: `/ ::= "/" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 301: `/ ::= "/" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 302: identifier ::= letter idChar** @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 303: identifier ::= letter !idChar [idChar**] @pass
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 304: ID ::= !reserved identifier white* @makeIdentifier(char,List<Character>)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x0)/*popToPushBack:2*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 305: ID ::= !reserved identifier [white*] @makeIdentifier(char,List<Character>)=>String
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x0)/*popToPushBack:2*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 306: INT_LITERAL ::= [#] digit++ white* @convertToInt(int,List<Character>)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 307: INT_LITERAL ::= [#] digit++ [white*] @convertToInt(int,List<Character>)=>int
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 308: dq ::= '"' @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 309: stringChar ::= !dq printable @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 310: STRING_LITERAL ::= dq stringChar* $$1 @makeString(List<Character>)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((86<<5)|0x5)/*methodCall:86*/,
    },
    { // 311: STRING_LITERAL ::= dq [stringChar*] $$1 @makeString(List<Character>)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((86<<5)|0x5)/*methodCall:86*/,
    },
    { // 312: sq ::= "'" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 313: CHARACTER_LITERAL ::= sq printable sq white* @makeChar(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((87<<5)|0x5)/*methodCall:87*/,
    },
    { // 314: CHARACTER_LITERAL ::= sq printable sq [white*] @makeChar(char)=>int
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((87<<5)|0x5)/*methodCall:87*/,
    },
    { // 315: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 316: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 317: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 318: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 319: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 320: white ::= {9 12 " "} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 321: white ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 322: eol ::= {10} [registerNewline] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 323: eol ::= {13} {10} [registerNewline] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 324: eol ::= {13} !10 [registerNewline] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 325: printable ::= {" ".."~"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 326: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 327: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // 328: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 329: idChar** ::= idChar* !idChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 330: stringChar* ::= stringChar* stringChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 331: stringChar* ::= [stringChar*] stringChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 332: white* ::= white* white @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 333: white* ::= [white*] white @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
    },
    { // 334: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 335: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 336: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 337: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 338: $$0 ::= token* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 339: $$1 ::= dq white* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 340: $$1 ::= dq [white*] @pass
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "", // start
    "stringChar* ::=", // stringChar*
    "idChar** ::= idChar* !idChar", // idChar**
    "token* ::=", // token*
    "idChar* ::=", // idChar*
    "white* ::=", // white*
    "", // $$start
    "# ::=", // #
    "", // registerNewline
};
public int[][] getNullProductionActionTable() { return nullActionTable; }
private int[][] nullActionTable = {
    { // start
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // stringChar*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // idChar**
      ((4<<5)|0x6)/*nullProductionAction:4*/,
    },
    { // token*
    },
    { // idChar*
      ((1<<5)|0x9)/*emptyList:1*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((88<<5)|0x5)/*methodCall:88*/,
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
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      String result = actionObject.makeIdentifier(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 85: {
      int parm0 = (Integer)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 86: {
      List<Character> parm0 = (List<Character>)si.popPb();
      String result = actionObject.makeString(parm0);
      si.pushPb(result);
    }
    break;
    case 87: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.makeChar(parm0);
      si.pushPb(result);
    }
    break;
    case 88: {
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
"String makeIdentifier(char,List<Character>)",
"int convertToInt(int,List<Character>)",
"String makeString(List<Character>)",
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
2,1,
1,1,
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
    0,
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
    2,
    1,
    1,
    1,
    0,
    -1,
    1,
    1,
    1,
    0,
    0,
    -1,
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
    1,
    -1,
    -1,
};
public Object vectorToTuple(java.util.ArrayList<Object> vec) {
  switch (vec.size()) {
    case 2: return new Tuple2<Object,Object>(vec.get(0),vec.get(1));
  }
  System.err.println("Internal error--illegal Tuple size: "+vec.size());
  return null;
}
}
class Tuple2<T0,T1> {
    private T0 val0;
    private T1 val1;
    public Tuple2(T0 parm0 ,T1 parm1) {
        val0 = parm0;
        val1 = parm1;
    }
    public T0 getVal0() { return val0;}
    public T1 getVal1() { return val1;}
    public String toString() {
       return "<<"+val0+","+val1+">>";
    }
}
