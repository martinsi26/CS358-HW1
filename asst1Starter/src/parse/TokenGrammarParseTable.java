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
0x80000000|176, // match move
0x80000000|791, // no-match move
0x80000000|553, // NT-test-match state for reserved
  }
,
{ // state 1
  }
,
{ // state 2
96,999, // "o"
  }
,
{ // state 3
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 4
91,761, // "a"
  }
,
{ // state 5
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 6
94,927, // "e"
  }
,
{ // state 7
0x80000000|1, // match move
0x80000000|161, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 8
90,493, // "l"
  }
,
{ // state 9
96,361, // "o"
  }
,
{ // state 10
163,MIN_REDUCTION+239, // $NT
  }
,
{ // state 11
0x80000000|1, // match move
0x80000000|952, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 12
2,413, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 13
2,384, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+134, // $NT
  }
,
{ // state 14
94,41, // "e"
  }
,
{ // state 15
0x80000000|1, // match move
0x80000000|88, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 16
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 17
0x80000000|1, // match move
0x80000000|182, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 18
104,165, // "h"
  }
,
{ // state 19
0x80000000|1, // match move
0x80000000|978, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 20
91,452, // "a"
  }
,
{ // state 21
104,178, // "h"
  }
,
{ // state 22
94,822, // "e"
  }
,
{ // state 23
89,423, // "c"
  }
,
{ // state 24
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 25
2,889, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 26
163,MIN_REDUCTION+205, // $NT
  }
,
{ // state 27
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 28
156,353, // {10}
  }
,
{ // state 29
90,754, // "l"
  }
,
{ // state 30
100,218, // "d"
  }
,
{ // state 31
90,836, // "l"
97,802, // "n"
98,650, // "x"
  }
,
{ // state 32
2,747, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 33
94,489, // "e"
  }
,
{ // state 34
163,MIN_REDUCTION+204, // $NT
  }
,
{ // state 35
0x80000000|1, // match move
0x80000000|62, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 36
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 37
99,521, // "t"
  }
,
{ // state 38
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+93, // $NT
  }
,
{ // state 39
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 40
97,672, // "n"
  }
,
{ // state 41
0x80000000|1, // match move
0x80000000|460, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 42
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 43
0x80000000|1, // match move
0x80000000|131, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 44
109,864, // "p"
  }
,
{ // state 45
102,641, // "i"
  }
,
{ // state 46
163,MIN_REDUCTION+233, // $NT
  }
,
{ // state 47
97,780, // "n"
  }
,
{ // state 48
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 49
2,39, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 50
2,3, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 51
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 52
97,714, // "n"
  }
,
{ // state 53
99,782, // "t"
  }
,
{ // state 54
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 55
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 56
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 57
2,253, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+186, // $NT
  }
,
{ // state 58
102,352, // "i"
  }
,
{ // state 59
99,494, // "t"
  }
,
{ // state 60
90,561, // "l"
97,548, // "n"
98,798, // "x"
  }
,
{ // state 61
89,914, // "c"
90,914, // "l"
91,914, // "a"
92,914, // "s"
94,914, // "e"
95,914, // "b"
96,914, // "o"
97,914, // "n"
98,914, // "x"
99,914, // "t"
100,914, // "d"
101,914, // "v"
102,914, // "i"
103,914, // "w"
104,914, // "h"
105,914, // "f"
106,914, // "r"
107,914, // "k"
108,914, // "u"
109,914, // "p"
110,914, // "y"
111,914, // "m"
112,914, // "g"
113,914, // "z"
137,993, // letter
148,360, // digit
149,241, // "_"
150,914, // {"A".."Z" "j" "q"}
151,376, // {"0".."9"}
  }
,
{ // state 62
2,966, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+146, // $NT
  }
,
{ // state 63
140,461, // dq
141,904, // '"'
144,380, // stringChar*
145,537, // $$1
  }
,
{ // state 64
102,608, // "i"
  }
,
{ // state 65
0x80000000|1, // match move
0x80000000|138, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 66
0x80000000|1, // match move
0x80000000|932, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 67
89,781, // "c"
90,781, // "l"
91,781, // "a"
92,781, // "s"
93,770, // idChar
94,781, // "e"
95,781, // "b"
96,781, // "o"
97,781, // "n"
98,781, // "x"
99,781, // "t"
100,781, // "d"
101,781, // "v"
102,781, // "i"
103,781, // "w"
104,781, // "h"
105,781, // "f"
106,781, // "r"
107,781, // "k"
108,781, // "u"
109,781, // "p"
110,781, // "y"
111,781, // "m"
112,781, // "g"
113,781, // "z"
137,563, // letter
138,789, // idChar**
148,343, // digit
149,319, // "_"
150,781, // {"A".."Z" "j" "q"}
151,526, // {"0".."9"}
161,562, // idChar*
  }
,
{ // state 68
163,MIN_REDUCTION+203, // $NT
  }
,
{ // state 69
89,438, // "c"
  }
,
{ // state 70
0x80000000|1026, // match move
0x80000000|910, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 71
2,942, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 72
2,499, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+112, // $NT
  }
,
{ // state 73
96,890, // "o"
  }
,
{ // state 74
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 75
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 76
163,MIN_REDUCTION+197, // $NT
  }
,
{ // state 77
92,821, // "s"
  }
,
{ // state 78
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 79
92,424, // "s"
  }
,
{ // state 80
90,308, // "l"
  }
,
{ // state 81
97,517, // "n"
  }
,
{ // state 82
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 83
151,376, // {"0".."9"}
  }
,
{ // state 84
2,531, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 85
2,211, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 86
92,443, // "s"
  }
,
{ // state 87
163,MIN_REDUCTION+237, // $NT
  }
,
{ // state 88
2,97, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+182, // $NT
  }
,
{ // state 89
94,895, // "e"
  }
,
{ // state 90
97,256, // "n"
  }
,
{ // state 91
111,535, // "m"
  }
,
{ // state 92
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 93
2,385, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 94
97,278, // "n"
  }
,
{ // state 95
130,135, // "|"
  }
,
{ // state 96
108,545, // "u"
  }
,
{ // state 97
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+181, // $NT
  }
,
{ // state 98
106,656, // "r"
  }
,
{ // state 99
94,731, // "e"
  }
,
{ // state 100
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 101
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 102
0x80000000|1, // match move
0x80000000|870, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 103
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 104
94,588, // "e"
  }
,
{ // state 105
99,282, // "t"
  }
,
{ // state 106
92,851, // "s"
95,358, // "b"
  }
,
{ // state 107
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 108
96,1022, // "o"
  }
,
{ // state 109
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 110
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 111
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 112
94,975, // "e"
  }
,
{ // state 113
163,MIN_REDUCTION+321, // $NT
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 114
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 115
163,MIN_REDUCTION+230, // $NT
  }
,
{ // state 116
111,11, // "m"
  }
,
{ // state 117
105,230, // "f"
  }
,
{ // state 118
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 119
100,765, // "d"
  }
,
{ // state 120
0x80000000|1, // match move
0x80000000|365, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 121
92,564, // "s"
95,468, // "b"
  }
,
{ // state 122
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 123
2,643, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 124
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 125
91,297, // "a"
  }
,
{ // state 126
0x80000000|1, // match move
0x80000000|85, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 127
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 128
90,296, // "l"
  }
,
{ // state 129
163,MIN_REDUCTION+220, // $NT
  }
,
{ // state 130
99,263, // "t"
  }
,
{ // state 131
2,611, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 132
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 133
96,764, // "o"
  }
,
{ // state 134
0x80000000|28, // match move
0x80000000|717, // no-match move
// T-test match for 10:
156,
  }
,
{ // state 135
2,625, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 136
2,124, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 137
2,555, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 138
2,614, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+132, // $NT
  }
,
{ // state 139
91,164, // "a"
  }
,
{ // state 140
97,613, // "n"
  }
,
{ // state 141
89,331, // "c"
  }
,
{ // state 142
90,763, // "l"
  }
,
{ // state 143
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+141, // $NT
  }
,
{ // state 144
91,557, // "a"
106,58, // "r"
  }
,
{ // state 145
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 146
102,506, // "i"
  }
,
{ // state 147
91,708, // "a"
  }
,
{ // state 148
99,944, // "t"
  }
,
{ // state 149
91,549, // "a"
  }
,
{ // state 150
94,449, // "e"
  }
,
{ // state 151
112,584, // "g"
  }
,
{ // state 152
163,MIN_REDUCTION+223, // $NT
  }
,
{ // state 153
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 154
96,573, // "o"
  }
,
{ // state 155
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
284, // token
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
598, // `!
351, // `!=
457, // `%
955, // `&&
402, // `*
739, // `(
416, // `)
101, // `{
145, // `}
779, // `-
55, // `+
501, // `=
783, // `==
973, // `[
979, // `]
940, // `||
653, // `<
1012, // `<=
957, // `,
24, // `>
122, // `>=
807, // `.
720, // `;
403, // `++
687, // `--
603, // `/
345, // `:
224, // ID
523, // INT_LITERAL
922, // STRING_LITERAL
233, // CHARACTER_LITERAL
842, // "c"
842, // "l"
842, // "a"
842, // "s"
-1, // idChar
842, // "e"
842, // "b"
842, // "o"
842, // "n"
842, // "x"
842, // "t"
842, // "d"
842, // "v"
842, // "i"
842, // "w"
842, // "h"
842, // "f"
842, // "r"
842, // "k"
842, // "u"
842, // "p"
842, // "y"
842, // "m"
842, // "g"
842, // "z"
-1, // reserved
289, // "!"
669, // "="
70, // "<"
704, // ">"
294, // "+"
238, // "-"
596, // "*"
258, // "%"
322, // "&"
814, // "("
762, // ")"
639, // "{"
320, // "}"
646, // "["
852, // "]"
95, // "|"
983, // "."
189, // ","
237, // ":"
801, // ";"
892, // "/"
558, // identifier
469, // letter
-1, // idChar**
328, // digit++
528, // dq
27, // '"'
-1, // stringChar
-1, // printable
-1, // stringChar*
-1, // $$1
909, // sq
574, // "'"
210, // digit
-1, // "_"
842, // {"A".."Z" "j" "q"}
399, // {"0".."9"}
-1, // white
-1, // " "
-1, // {9 12}
-1, // eol
-1, // {10}
-1, // {13}
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
610, // digit+
-1, // idChar*
MIN_REDUCTION+338, // $
-1, // $NT
  }
,
{ // state 156
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 157
2,54, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 158
106,768, // "r"
  }
,
{ // state 159
163,MIN_REDUCTION+195, // $NT
  }
,
{ // state 160
89,843, // "c"
90,843, // "l"
91,843, // "a"
92,843, // "s"
94,843, // "e"
95,843, // "b"
96,843, // "o"
97,843, // "n"
98,843, // "x"
99,843, // "t"
100,843, // "d"
101,843, // "v"
102,843, // "i"
103,843, // "w"
104,843, // "h"
105,843, // "f"
106,843, // "r"
107,843, // "k"
108,843, // "u"
109,843, // "p"
110,843, // "y"
111,843, // "m"
112,843, // "g"
113,843, // "z"
115,843, // "!"
116,843, // "="
117,843, // "<"
118,843, // ">"
119,843, // "+"
120,843, // "-"
121,843, // "*"
122,843, // "%"
123,843, // "&"
124,843, // "("
125,843, // ")"
126,843, // "{"
127,843, // "}"
128,843, // "["
129,843, // "]"
130,843, // "|"
131,843, // "."
132,843, // ","
133,843, // ":"
134,843, // ";"
135,843, // "/"
141,843, // '"'
142,42, // stringChar
143,408, // printable
145,538, // $$1
147,843, // "'"
149,843, // "_"
150,843, // {"A".."Z" "j" "q"}
151,843, // {"0".."9"}
153,843, // " "
158,843, // {"#".."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 161
2,651, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 162
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 163
2,901, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 164
106,693, // "r"
  }
,
{ // state 165
0x80000000|1, // match move
0x80000000|25, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 166
0x80000000|1, // match move
0x80000000|302, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 167
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 168
89,766, // "c"
  }
,
{ // state 169
90,250, // "l"
  }
,
{ // state 170
96,726, // "o"
102,200, // "i"
  }
,
{ // state 171
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 172
0x80000000|1, // match move
0x80000000|50, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 173
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+149, // $NT
  }
,
{ // state 174
4,284, // token
5,968, // `boolean
6,111, // `class
7,961, // `extends
8,899, // `void
9,314, // `int
10,744, // `while
11,1024, // `if
12,344, // `else
13,733, // `for
14,78, // `break
15,707, // `this
16,156, // `false
17,239, // `true
18,444, // `super
19,266, // `null
20,186, // `return
21,568, // `instanceof
22,114, // `new
23,1027, // `abstract
24,866, // `assert
25,185, // `byte
26,799, // `case
27,838, // `catch
28,605, // `char
29,756, // `const
30,591, // `continue
31,153, // `default
32,727, // `do
33,107, // `double
34,132, // `enum
35,956, // `final
36,56, // `finally
37,417, // `float
38,82, // `goto
39,162, // `implements
40,882, // `import
41,745, // `interface
42,110, // `long
43,350, // `native
44,848, // `package
45,207, // `private
46,167, // `protected
47,795, // `public
48,923, // `short
49,800, // `static
50,552, // `strictfp
51,293, // `switch
52,386, // `synchronized
53,36, // `throw
54,229, // `throws
55,785, // `transient
56,567, // `try
57,184, // `volatile
89,524, // "c"
90,108, // "l"
91,121, // "a"
92,419, // "s"
94,60, // "e"
95,638, // "b"
97,330, // "n"
99,1013, // "t"
100,679, // "d"
101,9, // "v"
102,855, // "i"
103,945, // "w"
105,607, // "f"
106,880, // "r"
109,522, // "p"
112,154, // "g"
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 175
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 176
1,589, // start
2,483, // white*
3,304, // $$0
4,699, // token
5,968, // `boolean
6,111, // `class
7,961, // `extends
8,899, // `void
9,314, // `int
10,744, // `while
11,1024, // `if
12,344, // `else
13,733, // `for
14,78, // `break
15,707, // `this
16,156, // `false
17,239, // `true
18,444, // `super
19,266, // `null
20,186, // `return
21,568, // `instanceof
22,114, // `new
23,1027, // `abstract
24,866, // `assert
25,185, // `byte
26,799, // `case
27,838, // `catch
28,605, // `char
29,756, // `const
30,591, // `continue
31,153, // `default
32,727, // `do
33,107, // `double
34,132, // `enum
35,956, // `final
36,56, // `finally
37,417, // `float
38,82, // `goto
39,162, // `implements
40,882, // `import
41,745, // `interface
42,110, // `long
43,350, // `native
44,848, // `package
45,207, // `private
46,167, // `protected
47,795, // `public
48,923, // `short
49,800, // `static
50,552, // `strictfp
51,293, // `switch
52,386, // `synchronized
53,36, // `throw
54,229, // `throws
55,785, // `transient
56,567, // `try
57,184, // `volatile
89,524, // "c"
90,108, // "l"
91,121, // "a"
92,419, // "s"
94,60, // "e"
95,638, // "b"
97,330, // "n"
99,1013, // "t"
100,679, // "d"
101,9, // "v"
102,855, // "i"
103,945, // "w"
105,607, // "f"
106,880, // "r"
109,522, // "p"
112,154, // "g"
159,579, // token*
162,MIN_REDUCTION+1, // $
  }
,
{ // state 177
113,680, // "z"
  }
,
{ // state 178
0x80000000|1, // match move
0x80000000|13, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 179
89,375, // "c"
  }
,
{ // state 180
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+157, // $NT
  }
,
{ // state 181
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 182
2,447, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 183
97,518, // "n"
  }
,
{ // state 184
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 185
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 186
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 187
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+187, // $NT
  }
,
{ // state 188
2,617, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 189
2,958, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 190
100,849, // "d"
  }
,
{ // state 191
105,1021, // "f"
  }
,
{ // state 192
105,740, // "f"
  }
,
{ // state 193
2,713, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 194
0x80000000|290, // match move
0x80000000|32, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 195
95,988, // "b"
  }
,
{ // state 196
104,529, // "h"
  }
,
{ // state 197
92,826, // "s"
99,498, // "t"
  }
,
{ // state 198
105,946, // "f"
  }
,
{ // state 199
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 200
101,505, // "v"
  }
,
{ // state 201
90,1029, // "l"
  }
,
{ // state 202
109,939, // "p"
  }
,
{ // state 203
163,MIN_REDUCTION+235, // $NT
  }
,
{ // state 204
105,737, // "f"
  }
,
{ // state 205
91,954, // "a"
  }
,
{ // state 206
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 207
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 208
94,273, // "e"
  }
,
{ // state 209
0x80000000|1, // match move
0x80000000|193, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 210
0x80000000|917, // match move
0x80000000|867, // no-match move
0x80000000|83, // NT-test-match state for digit
  }
,
{ // state 211
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 212
94,198, // "e"
96,987, // "o"
  }
,
{ // state 213
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 214
91,539, // "a"
  }
,
{ // state 215
89,784, // "c"
  }
,
{ // state 216
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 217
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 218
0x80000000|1, // match move
0x80000000|805, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 219
0x80000000|1, // match move
0x80000000|228, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 220
2,828, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+92, // $NT
  }
,
{ // state 221
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 222
0x80000000|1, // match move
0x80000000|163, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 223
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+173, // $NT
  }
,
{ // state 224
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 225
109,915, // "p"
  }
,
{ // state 226
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+89, // $NT
  }
,
{ // state 227
2,793, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 228
2,143, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+142, // $NT
  }
,
{ // state 229
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 230
0x80000000|1, // match move
0x80000000|268, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 231
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+109, // $NT
  }
,
{ // state 232
91,572, // "a"
  }
,
{ // state 233
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 234
96,682, // "o"
  }
,
{ // state 235
89,313, // "c"
  }
,
{ // state 236
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 237
2,109, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 238
0x80000000|678, // match move
0x80000000|123, // no-match move
// T-test match for "-":
120,
  }
,
{ // state 239
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 240
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+175, // $NT
  }
,
{ // state 241
163,MIN_REDUCTION+317, // $NT
  }
,
{ // state 242
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+107, // $NT
  }
,
{ // state 243
96,441, // "o"
  }
,
{ // state 244
2,277, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+118, // $NT
  }
,
{ // state 245
163,MIN_REDUCTION+225, // $NT
  }
,
{ // state 246
163,MIN_REDUCTION+226, // $NT
  }
,
{ // state 247
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 248
92,17, // "s"
  }
,
{ // state 249
90,527, // "l"
  }
,
{ // state 250
0x80000000|1, // match move
0x80000000|244, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 251
0x80000000|1, // match move
0x80000000|750, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 252
97,681, // "n"
  }
,
{ // state 253
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+185, // $NT
  }
,
{ // state 254
91,69, // "a"
106,170, // "r"
108,990, // "u"
  }
,
{ // state 255
90,790, // "l"
91,398, // "a"
96,905, // "o"
104,139, // "h"
  }
,
{ // state 256
100,569, // "d"
  }
,
{ // state 257
163,MIN_REDUCTION+227, // $NT
  }
,
{ // state 258
2,420, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 259
99,969, // "t"
  }
,
{ // state 260
0x80000000|1, // match move
0x80000000|410, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 261
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 262
2,187, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+188, // $NT
  }
,
{ // state 263
0x80000000|1, // match move
0x80000000|692, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 264
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+103, // $NT
  }
,
{ // state 265
163,MIN_REDUCTION+216, // $NT
  }
,
{ // state 266
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 267
99,270, // "t"
  }
,
{ // state 268
2,835, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 269
99,89, // "t"
  }
,
{ // state 270
0x80000000|1, // match move
0x80000000|437, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 271
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 272
102,1017, // "i"
  }
,
{ // state 273
89,891, // "c"
  }
,
{ // state 274
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+151, // $NT
  }
,
{ // state 275
91,140, // "a"
108,369, // "u"
110,1009, // "y"
  }
,
{ // state 276
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+183, // $NT
  }
,
{ // state 277
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+117, // $NT
  }
,
{ // state 278
0x80000000|1, // match move
0x80000000|478, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 279
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 280
2,226, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+90, // $NT
  }
,
{ // state 281
92,767, // "s"
  }
,
{ // state 282
89,724, // "c"
  }
,
{ // state 283
0x80000000|1, // match move
0x80000000|318, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 284
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 285
97,661, // "n"
  }
,
{ // state 286
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 287
106,559, // "r"
  }
,
{ // state 288
90,913, // "l"
  }
,
{ // state 289
0x80000000|590, // match move
0x80000000|587, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 290
108,839, // "u"
  }
,
{ // state 291
109,66, // "p"
  }
,
{ // state 292
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+191, // $NT
  }
,
{ // state 293
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 294
0x80000000|329, // match move
0x80000000|379, // no-match move
// T-test match for "+":
119,
  }
,
{ // state 295
2,240, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+176, // $NT
  }
,
{ // state 296
99,219, // "t"
  }
,
{ // state 297
107,735, // "k"
  }
,
{ // state 298
99,144, // "t"
103,859, // "w"
104,243, // "h"
108,44, // "u"
110,967, // "y"
  }
,
{ // state 299
91,984, // "a"
  }
,
{ // state 300
0x80000000|1, // match move
0x80000000|316, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 301
90,445, // "l"
91,701, // "a"
96,377, // "o"
102,773, // "i"
  }
,
{ // state 302
2,391, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 303
100,536, // "d"
  }
,
{ // state 304
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 305
106,631, // "r"
  }
,
{ // state 306
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+177, // $NT
  }
,
{ // state 307
94,485, // "e"
  }
,
{ // state 308
94,949, // "e"
  }
,
{ // state 309
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 310
102,948, // "i"
  }
,
{ // state 311
99,514, // "t"
  }
,
{ // state 312
91,453, // "a"
106,64, // "r"
  }
,
{ // state 313
0x80000000|1, // match move
0x80000000|71, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 314
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 315
163,MIN_REDUCTION+322, // $NT
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 316
2,888, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+172, // $NT
  }
,
{ // state 317
2,127, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 318
2,411, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+166, // $NT
  }
,
{ // state 319
0x80000000|853, // match move
0x80000000|373, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 320
2,925, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 321
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+123, // $NT
  }
,
{ // state 322
123,188, // "&"
  }
,
{ // state 323
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 324
106,797, // "r"
  }
,
{ // state 325
0x80000000|1, // match move
0x80000000|157, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 326
90,473, // "l"
  }
,
{ // state 327
112,718, // "g"
  }
,
{ // state 328
2,387, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 329
119,753, // "+"
  }
,
{ // state 330
91,871, // "a"
94,663, // "e"
108,288, // "u"
  }
,
{ // state 331
99,618, // "t"
  }
,
{ // state 332
103,677, // "w"
  }
,
{ // state 333
89,920, // "c"
  }
,
{ // state 334
99,14, // "t"
  }
,
{ // state 335
163,MIN_REDUCTION+245, // $NT
  }
,
{ // state 336
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+147, // $NT
  }
,
{ // state 337
2,264, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+104, // $NT
  }
,
{ // state 338
106,393, // "r"
  }
,
{ // state 339
90,982, // "l"
  }
,
{ // state 340
91,252, // "a"
  }
,
{ // state 341
89,21, // "c"
  }
,
{ // state 342
107,857, // "k"
  }
,
{ // state 343
0x80000000|100, // match move
0x80000000|48, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 344
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 345
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 346
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 347
89,844, // "c"
  }
,
{ // state 348
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+105, // $NT
  }
,
{ // state 349
163,MIN_REDUCTION+222, // $NT
  }
,
{ // state 350
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 351
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 352
89,586, // "c"
  }
,
{ // state 353
163,MIN_REDUCTION+323, // $NT
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 354
0x80000000|1, // match move
0x80000000|363, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 355
0x80000000|837, // match move
0x80000000|432, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 356
108,929, // "u"
  }
,
{ // state 357
0x80000000|1, // match move
0x80000000|280, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 358
92,700, // "s"
  }
,
{ // state 359
0x80000000|1, // match move
0x80000000|515, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 360
163,MIN_REDUCTION+316, // $NT
  }
,
{ // state 361
90,147, // "l"
102,303, // "i"
  }
,
{ // state 362
163,MIN_REDUCTION+333, // $NT
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 363
2,279, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 364
99,1014, // "t"
  }
,
{ // state 365
2,688, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 366
163,MIN_REDUCTION+208, // $NT
  }
,
{ // state 367
92,504, // "s"
  }
,
{ // state 368
110,903, // "y"
  }
,
{ // state 369
94,565, // "e"
  }
,
{ // state 370
97,986, // "n"
  }
,
{ // state 371
2,216, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 372
2,173, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+150, // $NT
  }
,
{ // state 373
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 374
102,602, // "i"
  }
,
{ // state 375
94,415, // "e"
  }
,
{ // state 376
163,MIN_REDUCTION+319, // $NT
  }
,
{ // state 377
106,659, // "r"
  }
,
{ // state 378
163,MIN_REDUCTION+247, // $NT
  }
,
{ // state 379
2,497, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 380
0x80000000|794, // match move
0x80000000|160, // no-match move
0x80000000|582, // NT-test-match state for dq
  }
,
{ // state 381
2,394, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 382
104,491, // "h"
106,275, // "r"
  }
,
{ // state 383
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+129, // $NT
  }
,
{ // state 384
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+133, // $NT
  }
,
{ // state 385
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 386
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 387
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 388
111,995, // "m"
  }
,
{ // state 389
0x80000000|1, // match move
0x80000000|458, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 390
2,934, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 391
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 392
163,MIN_REDUCTION+198, // $NT
  }
,
{ // state 393
99,686, // "t"
  }
,
{ // state 394
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 395
0x80000000|1, // match move
0x80000000|72, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 396
95,716, // "b"
  }
,
{ // state 397
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 398
92,512, // "s"
99,341, // "t"
  }
,
{ // state 399
0x80000000|175, // match move
0x80000000|118, // no-match move
0x80000000|83, // NT-test-match state for digit
  }
,
{ // state 400
106,825, // "r"
  }
,
{ // state 401
90,169, // "l"
  }
,
{ // state 402
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 403
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 404
97,621, // "n"
  }
,
{ // state 405
0x80000000|1, // match move
0x80000000|295, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 406
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 407
2,592, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 408
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 409
2,609, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 410
2,698, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 411
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+165, // $NT
  }
,
{ // state 412
96,332, // "o"
  }
,
{ // state 413
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 414
2,977, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+162, // $NT
  }
,
{ // state 415
96,204, // "o"
  }
,
{ // state 416
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 417
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 418
97,738, // "n"
105,696, // "f"
111,202, // "m"
  }
,
{ // state 419
99,312, // "t"
103,649, // "w"
104,234, // "h"
108,225, // "u"
110,285, // "y"
  }
,
{ // state 420
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 421
94,43, // "e"
  }
,
{ // state 422
94,1025, // "e"
  }
,
{ // state 423
99,702, // "t"
  }
,
{ // state 424
92,357, // "s"
  }
,
{ // state 425
94,581, // "e"
  }
,
{ // state 426
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 427
99,374, // "t"
  }
,
{ // state 428
91,168, // "a"
  }
,
{ // state 429
163,MIN_REDUCTION+219, // $NT
  }
,
{ // state 430
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 431
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+159, // $NT
  }
,
{ // state 432
2,886, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 433
0x80000000|1, // match move
0x80000000|414, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 434
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+179, // $NT
  }
,
{ // state 435
99,4, // "t"
  }
,
{ // state 436
102,99, // "i"
  }
,
{ // state 437
2,544, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 438
107,760, // "k"
  }
,
{ // state 439
102,29, // "i"
  }
,
{ // state 440
91,215, // "a"
  }
,
{ // state 441
106,655, // "r"
  }
,
{ // state 442
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 443
0x80000000|1, // match move
0x80000000|12, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 444
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 445
96,755, // "o"
  }
,
{ // state 446
96,117, // "o"
  }
,
{ // state 447
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 448
0x80000000|1, // match move
0x80000000|495, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 449
99,546, // "t"
  }
,
{ // state 450
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+119, // $NT
  }
,
{ // state 451
99,873, // "t"
  }
,
{ // state 452
107,166, // "k"
  }
,
{ // state 453
99,629, // "t"
  }
,
{ // state 454
163,MIN_REDUCTION+199, // $NT
  }
,
{ // state 455
2,323, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 456
163,MIN_REDUCTION+241, // $NT
  }
,
{ // state 457
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 458
2,711, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+190, // $NT
  }
,
{ // state 459
163,MIN_REDUCTION+196, // $NT
  }
,
{ // state 460
2,383, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+130, // $NT
  }
,
{ // state 461
2,477, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 462
148,601, // digit
151,399, // {"0".."9"}
  }
,
{ // state 463
0x80000000|660, // match move
0x80000000|816, // no-match move
// T-test match for 10:
156,
  }
,
{ // state 464
97,796, // "n"
  }
,
{ // state 465
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+163, // $NT
  }
,
{ // state 466
103,102, // "w"
  }
,
{ // state 467
163,MIN_REDUCTION+234, // $NT
  }
,
{ // state 468
92,832, // "s"
  }
,
{ // state 469
0x80000000|67, // match move
0x80000000|928, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 470
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 471
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 472
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 473
110,715, // "y"
  }
,
{ // state 474
94,808, // "e"
  }
,
{ // state 475
94,578, // "e"
  }
,
{ // state 476
96,642, // "o"
  }
,
{ // state 477
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 478
2,450, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+120, // $NT
  }
,
{ // state 479
104,305, // "h"
  }
,
{ // state 480
2,38, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+94, // $NT
  }
,
{ // state 481
0x80000000|1, // match move
0x80000000|407, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 482
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+155, // $NT
  }
,
{ // state 483
0x80000000|530, // match move
0x80000000|1008, // no-match move
0x80000000|553, // NT-test-match state for reserved
  }
,
{ // state 484
90,970, // "l"
  }
,
{ // state 485
91,665, // "a"
  }
,
{ // state 486
92,19, // "s"
  }
,
{ // state 487
96,671, // "o"
  }
,
{ // state 488
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 489
97,709, // "n"
  }
,
{ // state 490
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 491
102,281, // "i"
106,476, // "r"
  }
,
{ // state 492
94,7, // "e"
  }
,
{ // state 493
94,985, // "e"
  }
,
{ // state 494
89,931, // "c"
  }
,
{ // state 495
2,482, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+156, // $NT
  }
,
{ // state 496
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 497
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 498
102,47, // "i"
  }
,
{ // state 499
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+111, // $NT
  }
,
{ // state 500
0x80000000|1, // match move
0x80000000|480, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 501
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 502
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 503
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+115, // $NT
  }
,
{ // state 504
0x80000000|1, // match move
0x80000000|455, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 505
91,269, // "a"
  }
,
{ // state 506
113,736, // "z"
  }
,
{ // state 507
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 508
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 509
99,878, // "t"
  }
,
{ // state 510
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+139, // $NT
  }
,
{ // state 511
2,846, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+144, // $NT
  }
,
{ // state 512
94,65, // "e"
  }
,
{ // state 513
0x80000000|1, // match move
0x80000000|994, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 514
91,1004, // "a"
  }
,
{ // state 515
2,508, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 516
2,830, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 517
100,86, // "d"
  }
,
{ // state 518
108,492, // "u"
  }
,
{ // state 519
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 520
2,471, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 521
0x80000000|1, // match move
0x80000000|689, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 522
91,924, // "a"
106,965, // "r"
108,396, // "u"
  }
,
{ // state 523
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 524
90,560, // "l"
91,775, // "a"
96,616, // "o"
104,299, // "h"
  }
,
{ // state 525
163,MIN_REDUCTION+238, // $NT
  }
,
{ // state 526
0x80000000|658, // match move
0x80000000|213, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 527
102,333, // "i"
  }
,
{ // state 528
0x80000000|63, // match move
0x80000000|728, // no-match move
0x80000000|582, // NT-test-match state for dq
  }
,
{ // state 529
106,960, // "r"
  }
,
{ // state 530
3,5, // $$0
4,699, // token
5,968, // `boolean
6,111, // `class
7,961, // `extends
8,899, // `void
9,314, // `int
10,744, // `while
11,1024, // `if
12,344, // `else
13,733, // `for
14,78, // `break
15,707, // `this
16,156, // `false
17,239, // `true
18,444, // `super
19,266, // `null
20,186, // `return
21,568, // `instanceof
22,114, // `new
23,1027, // `abstract
24,866, // `assert
25,185, // `byte
26,799, // `case
27,838, // `catch
28,605, // `char
29,756, // `const
30,591, // `continue
31,153, // `default
32,727, // `do
33,107, // `double
34,132, // `enum
35,956, // `final
36,56, // `finally
37,417, // `float
38,82, // `goto
39,162, // `implements
40,882, // `import
41,745, // `interface
42,110, // `long
43,350, // `native
44,848, // `package
45,207, // `private
46,167, // `protected
47,795, // `public
48,923, // `short
49,800, // `static
50,552, // `strictfp
51,293, // `switch
52,386, // `synchronized
53,36, // `throw
54,229, // `throws
55,785, // `transient
56,567, // `try
57,184, // `volatile
89,524, // "c"
90,108, // "l"
91,121, // "a"
92,419, // "s"
94,60, // "e"
95,638, // "b"
97,330, // "n"
99,1013, // "t"
100,679, // "d"
101,9, // "v"
102,855, // "i"
103,945, // "w"
105,607, // "f"
106,880, // "r"
109,522, // "p"
112,154, // "g"
159,579, // token*
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 531
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 532
2,959, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 533
96,869, // "o"
  }
,
{ // state 534
96,448, // "o"
  }
,
{ // state 535
0x80000000|1, // match move
0x80000000|593, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 536
0x80000000|1, // match move
0x80000000|371, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 537
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 538
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 539
99,112, // "t"
  }
,
{ // state 540
2,75, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 541
2,306, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+178, // $NT
  }
,
{ // state 542
2,918, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 543
2,657, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 544
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 545
106,404, // "r"
  }
,
{ // state 546
108,906, // "u"
  }
,
{ // state 547
0x80000000|1, // match move
0x80000000|674, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 548
108,116, // "u"
  }
,
{ // state 549
90,695, // "l"
  }
,
{ // state 550
0x80000000|1, // match move
0x80000000|743, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 551
89,781, // "c"
90,781, // "l"
91,781, // "a"
92,781, // "s"
93,941, // idChar
94,781, // "e"
95,781, // "b"
96,781, // "o"
97,781, // "n"
98,781, // "x"
99,781, // "t"
100,781, // "d"
101,781, // "v"
102,781, // "i"
103,781, // "w"
104,781, // "h"
105,781, // "f"
106,781, // "r"
107,781, // "k"
108,781, // "u"
109,781, // "p"
110,781, // "y"
111,781, // "m"
112,781, // "g"
113,781, // "z"
137,563, // letter
148,343, // digit
149,319, // "_"
150,781, // {"A".."Z" "j" "q"}
151,526, // {"0".."9"}
  }
,
{ // state 552
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 553
5,76, // `boolean
6,159, // `class
7,392, // `extends
8,454, // `void
9,926, // `int
10,856, // `while
11,862, // `if
12,459, // `else
13,68, // `for
14,34, // `break
15,26, // `this
16,885, // `false
17,622, // `true
18,366, // `super
19,630, // `null
20,723, // `return
21,831, // `instanceof
22,1020, // `new
23,652, // `abstract
24,600, // `assert
25,894, // `byte
26,265, // `case
27,1007, // `catch
28,937, // `char
29,429, // `const
30,129, // `continue
31,637, // `default
32,349, // `do
33,152, // `double
34,759, // `enum
35,245, // `final
36,246, // `finally
37,257, // `float
38,1001, // `goto
39,554, // `implements
40,115, // `import
41,806, // `interface
42,690, // `long
43,46, // `native
44,467, // `package
45,203, // `private
46,847, // `protected
47,87, // `public
48,525, // `short
49,10, // `static
50,648, // `strictfp
51,456, // `switch
52,875, // `synchronized
53,772, // `throw
54,992, // `throws
55,335, // `transient
56,887, // `try
57,378, // `volatile
89,255, // "c"
90,533, // "l"
91,106, // "a"
92,298, // "s"
94,31, // "e"
95,907, // "b"
97,623, // "n"
99,382, // "t"
100,212, // "d"
101,2, // "v"
102,418, // "i"
103,640, // "w"
105,301, // "f"
106,150, // "r"
109,254, // "p"
112,73, // "g"
  }
,
{ // state 554
163,MIN_REDUCTION+229, // $NT
  }
,
{ // state 555
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 556
2,976, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 557
99,817, // "t"
  }
,
{ // state 558
2,850, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 559
0x80000000|1, // match move
0x80000000|409, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 560
91,1019, // "a"
  }
,
{ // state 561
92,104, // "s"
  }
,
{ // state 562
0x80000000|551, // match move
0x80000000|286, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 563
0x80000000|769, // match move
0x80000000|1000, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 564
92,422, // "s"
  }
,
{ // state 565
0x80000000|1, // match move
0x80000000|580, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 566
106,1010, // "r"
  }
,
{ // state 567
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 568
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 569
92,974, // "s"
  }
,
{ // state 570
2,908, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+136, // $NT
  }
,
{ // state 571
91,370, // "a"
108,421, // "u"
110,359, // "y"
  }
,
{ // state 572
89,364, // "c"
  }
,
{ // state 573
99,487, // "t"
  }
,
{ // state 574
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 575
2,730, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+96, // $NT
  }
,
{ // state 576
2,1016, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+100, // $NT
  }
,
{ // state 577
2,751, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+128, // $NT
  }
,
{ // state 578
100,547, // "d"
  }
,
{ // state 579
0x80000000|174, // match move
0x80000000|155, // no-match move
0x80000000|553, // NT-test-match state for reserved
  }
,
{ // state 580
2,647, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+114, // $NT
  }
,
{ // state 581
111,898, // "m"
  }
,
{ // state 582
141,896, // '"'
  }
,
{ // state 583
2,348, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+106, // $NT
  }
,
{ // state 584
94,126, // "e"
  }
,
{ // state 585
94,481, // "e"
  }
,
{ // state 586
99,191, // "t"
  }
,
{ // state 587
2,261, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 588
0x80000000|1, // match move
0x80000000|633, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 589
162,MIN_REDUCTION+0, // $
  }
,
{ // state 590
116,691, // "="
  }
,
{ // state 591
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 592
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 593
2,336, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+148, // $NT
  }
,
{ // state 594
94,338, // "e"
  }
,
{ // state 595
94,719, // "e"
  }
,
{ // state 596
2,778, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 597
102,627, // "i"
106,412, // "r"
  }
,
{ // state 598
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 599
2,223, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+174, // $NT
  }
,
{ // state 600
163,MIN_REDUCTION+214, // $NT
  }
,
{ // state 601
0x80000000|729, // match move
0x80000000|620, // no-match move
0x80000000|83, // NT-test-match state for digit
  }
,
{ // state 602
101,824, // "v"
  }
,
{ // state 603
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 604
99,1028, // "t"
  }
,
{ // state 605
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 606
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 607
90,133, // "l"
91,339, // "a"
96,566, // "o"
102,950, // "i"
  }
,
{ // state 608
89,509, // "c"
  }
,
{ // state 609
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 610
0x80000000|462, // match move
0x80000000|470, // no-match move
0x80000000|83, // NT-test-match state for digit
  }
,
{ // state 611
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 612
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 613
92,865, // "s"
  }
,
{ // state 614
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+131, // $NT
  }
,
{ // state 615
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 616
97,706, // "n"
  }
,
{ // state 617
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 618
94,787, // "e"
  }
,
{ // state 619
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 620
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 621
0x80000000|1, // match move
0x80000000|317, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 622
163,MIN_REDUCTION+207, // $NT
  }
,
{ // state 623
91,427, // "a"
94,466, // "e"
108,401, // "u"
  }
,
{ // state 624
89,18, // "c"
  }
,
{ // state 625
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 626
94,20, // "e"
  }
,
{ // state 627
92,803, // "s"
  }
,
{ // state 628
94,513, // "e"
  }
,
{ // state 629
102,235, // "i"
  }
,
{ // state 630
163,MIN_REDUCTION+209, // $NT
  }
,
{ // state 631
96,876, // "o"
  }
,
{ // state 632
0x80000000|1, // match move
0x80000000|644, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 633
2,963, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 634
96,484, // "o"
  }
,
{ // state 635
106,916, // "r"
  }
,
{ // state 636
90,307, // "l"
  }
,
{ // state 637
163,MIN_REDUCTION+221, // $NT
  }
,
{ // state 638
96,634, // "o"
106,626, // "r"
110,604, // "y"
  }
,
{ // state 639
2,818, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 640
104,829, // "h"
  }
,
{ // state 641
89,260, // "c"
  }
,
{ // state 642
103,845, // "w"
  }
,
{ // state 643
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 644
2,434, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+180, // $NT
  }
,
{ // state 645
2,777, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+122, // $NT
  }
,
{ // state 646
2,430, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 647
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+113, // $NT
  }
,
{ // state 648
163,MIN_REDUCTION+240, // $NT
  }
,
{ // state 649
102,59, // "i"
  }
,
{ // state 650
99,964, // "t"
  }
,
{ // state 651
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 652
163,MIN_REDUCTION+213, // $NT
  }
,
{ // state 653
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 654
108,195, // "u"
  }
,
{ // state 655
99,405, // "t"
  }
,
{ // state 656
105,440, // "f"
  }
,
{ // state 657
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 658
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 659
0x80000000|1, // match move
0x80000000|583, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 660
156,103, // {10}
  }
,
{ // state 661
89,196, // "c"
  }
,
{ // state 662
92,435, // "s"
99,355, // "t"
  }
,
{ // state 663
103,1005, // "w"
  }
,
{ // state 664
156,507, // {10}
  }
,
{ // state 665
97,500, // "n"
  }
,
{ // state 666
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+193, // $NT
  }
,
{ // state 667
102,80, // "i"
  }
,
{ // state 668
138,MIN_REDUCTION+318, // idChar**
149,MIN_REDUCTION+318, // "_"
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 669
0x80000000|827, // match move
0x80000000|390, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 670
2,274, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+152, // $NT
  }
,
{ // state 671
0x80000000|1, // match move
0x80000000|542, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 672
99,248, // "t"
  }
,
{ // state 673
0x80000000|1, // match move
0x80000000|742, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 674
2,615, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 675
102,183, // "i"
  }
,
{ // state 676
94,81, // "e"
  }
,
{ // state 677
0x80000000|879, // match move
0x80000000|93, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 678
120,854, // "-"
  }
,
{ // state 679
94,192, // "e"
96,194, // "o"
  }
,
{ // state 680
94,119, // "e"
  }
,
{ // state 681
0x80000000|1, // match move
0x80000000|722, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 682
106,267, // "r"
  }
,
{ // state 683
0x80000000|1, // match move
0x80000000|520, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 684
2,734, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+98, // $NT
  }
,
{ // state 685
2,242, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+108, // $NT
  }
,
{ // state 686
0x80000000|1, // match move
0x80000000|577, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 687
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 688
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 689
2,938, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 690
163,MIN_REDUCTION+232, // $NT
  }
,
{ // state 691
2,902, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 692
2,749, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 693
0x80000000|1, // match move
0x80000000|570, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 694
108,128, // "u"
  }
,
{ // state 695
0x80000000|326, // match move
0x80000000|372, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 696
0x80000000|1, // match move
0x80000000|337, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 697
0x80000000|1, // match move
0x80000000|541, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 698
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 699
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 700
99,998, // "t"
  }
,
{ // state 701
90,77, // "l"
  }
,
{ // state 702
0x80000000|1, // match move
0x80000000|543, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 703
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 704
0x80000000|872, // match move
0x80000000|84, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 705
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+101, // $NT
  }
,
{ // state 706
92,710, // "s"
99,675, // "t"
  }
,
{ // state 707
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 708
99,272, // "t"
  }
,
{ // state 709
99,389, // "t"
  }
,
{ // state 710
99,868, // "t"
  }
,
{ // state 711
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+189, // $NT
  }
,
{ // state 712
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 713
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 714
99,486, // "t"
  }
,
{ // state 715
0x80000000|1, // match move
0x80000000|670, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 716
90,45, // "l"
  }
,
{ // state 717
163,MIN_REDUCTION+324, // $NT
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 718
0x80000000|1, // match move
0x80000000|540, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 719
0x80000000|1, // match move
0x80000000|732, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 720
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 721
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+125, // $NT
  }
,
{ // state 722
2,236, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 723
163,MIN_REDUCTION+210, // $NT
  }
,
{ // state 724
104,15, // "h"
  }
,
{ // state 725
94,388, // "e"
  }
,
{ // state 726
99,1011, // "t"
  }
,
{ // state 727
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 728
89,843, // "c"
90,843, // "l"
91,843, // "a"
92,843, // "s"
94,843, // "e"
95,843, // "b"
96,843, // "o"
97,843, // "n"
98,843, // "x"
99,843, // "t"
100,843, // "d"
101,843, // "v"
102,843, // "i"
103,843, // "w"
104,843, // "h"
105,843, // "f"
106,843, // "r"
107,843, // "k"
108,843, // "u"
109,843, // "p"
110,843, // "y"
111,843, // "m"
112,843, // "g"
113,843, // "z"
115,843, // "!"
116,843, // "="
117,843, // "<"
118,843, // ">"
119,843, // "+"
120,843, // "-"
121,843, // "*"
122,843, // "%"
123,843, // "&"
124,843, // "("
125,843, // ")"
126,843, // "{"
127,843, // "}"
128,843, // "["
129,843, // "]"
130,843, // "|"
131,843, // "."
132,843, // ","
133,843, // ":"
134,843, // ";"
135,843, // "/"
141,843, // '"'
142,217, // stringChar
143,408, // printable
144,380, // stringChar*
145,537, // $$1
147,843, // "'"
149,843, // "_"
150,843, // {"A".."Z" "j" "q"}
151,843, // {"0".."9"}
153,843, // " "
158,843, // {"#".."$" "?".."@" "\" "^" "`" "~"}
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
{ // state 729
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 730
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+95, // $NT
  }
,
{ // state 731
97,130, // "n"
  }
,
{ // state 732
2,92, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 733
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 734
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+97, // $NT
  }
,
{ // state 735
0x80000000|1, // match move
0x80000000|685, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 736
94,30, // "e"
  }
,
{ // state 737
0x80000000|1, // match move
0x80000000|645, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 738
92,311, // "s"
99,996, // "t"
  }
,
{ // state 739
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 740
91,356, // "a"
  }
,
{ // state 741
89,479, // "c"
  }
,
{ // state 742
2,972, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+138, // $NT
  }
,
{ // state 743
2,951, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+168, // $NT
  }
,
{ // state 744
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 745
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 746
146,516, // sq
147,962, // "'"
  }
,
{ // state 747
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 748
0x80000000|664, // match move
0x80000000|840, // no-match move
// T-test match for 10:
156,
  }
,
{ // state 749
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 750
2,397, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 751
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+127, // $NT
  }
,
{ // state 752
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 753
2,881, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 754
94,251, // "e"
  }
,
{ // state 755
91,53, // "a"
  }
,
{ // state 756
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 757
2,231, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+110, // $NT
  }
,
{ // state 758
2,703, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 759
163,MIN_REDUCTION+224, // $NT
  }
,
{ // state 760
91,1002, // "a"
  }
,
{ // state 761
97,347, // "n"
  }
,
{ // state 762
2,874, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 763
94,209, // "e"
  }
,
{ // state 764
91,37, // "a"
  }
,
{ // state 765
0x80000000|1, // match move
0x80000000|532, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 766
94,893, // "e"
  }
,
{ // state 767
0x80000000|1, // match move
0x80000000|757, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 768
91,23, // "a"
  }
,
{ // state 769
MIN_REDUCTION+315, // (default reduction)
  }
,
{ // state 770
0x80000000|606, // match move
0x80000000|51, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 771
0x80000000|1, // match move
0x80000000|262, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 772
163,MIN_REDUCTION+243, // $NT
  }
,
{ // state 773
97,149, // "n"
  }
,
{ // state 774
99,96, // "t"
  }
,
{ // state 775
92,6, // "s"
99,624, // "t"
  }
,
{ // state 776
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 777
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+121, // $NT
  }
,
{ // state 778
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 779
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 780
108,628, // "u"
  }
,
{ // state 781
0x80000000|199, // match move
0x80000000|519, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 782
0x80000000|1, // match move
0x80000000|1030, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 783
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 784
94,433, // "e"
  }
,
{ // state 785
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 786
2,292, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+192, // $NT
  }
,
{ // state 787
100,300, // "d"
  }
,
{ // state 788
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 789
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 790
91,79, // "a"
  }
,
{ // state 791
-1, // $$start
589, // start
483, // white*
304, // $$0
699, // token
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
598, // `!
351, // `!=
457, // `%
955, // `&&
402, // `*
739, // `(
416, // `)
101, // `{
145, // `}
779, // `-
55, // `+
501, // `=
783, // `==
973, // `[
979, // `]
940, // `||
653, // `<
1012, // `<=
957, // `,
24, // `>
122, // `>=
807, // `.
720, // `;
403, // `++
687, // `--
603, // `/
345, // `:
224, // ID
523, // INT_LITERAL
922, // STRING_LITERAL
233, // CHARACTER_LITERAL
842, // "c"
842, // "l"
842, // "a"
842, // "s"
-1, // idChar
842, // "e"
842, // "b"
842, // "o"
842, // "n"
842, // "x"
842, // "t"
842, // "d"
842, // "v"
842, // "i"
842, // "w"
842, // "h"
842, // "f"
842, // "r"
842, // "k"
842, // "u"
842, // "p"
842, // "y"
842, // "m"
842, // "g"
842, // "z"
-1, // reserved
289, // "!"
669, // "="
70, // "<"
704, // ">"
294, // "+"
238, // "-"
596, // "*"
258, // "%"
322, // "&"
814, // "("
762, // ")"
639, // "{"
320, // "}"
646, // "["
852, // "]"
95, // "|"
983, // "."
189, // ","
237, // ":"
801, // ";"
892, // "/"
558, // identifier
469, // letter
-1, // idChar**
328, // digit++
528, // dq
27, // '"'
-1, // stringChar
-1, // printable
-1, // stringChar*
-1, // $$1
909, // sq
574, // "'"
210, // digit
-1, // "_"
842, // {"A".."Z" "j" "q"}
399, // {"0".."9"}
271, // white
442, // " "
442, // {9 12}
788, // eol
953, // {10}
748, // {13}
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
579, // token*
610, // digit+
-1, // idChar*
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 792
0x80000000|1, // match move
0x80000000|227, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 793
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 794
140,461, // dq
141,904, // '"'
145,538, // $$1
  }
,
{ // state 795
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 796
102,177, // "i"
  }
,
{ // state 797
105,428, // "f"
  }
,
{ // state 798
99,676, // "t"
  }
,
{ // state 799
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 800
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 801
2,181, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 802
108,91, // "u"
  }
,
{ // state 803
0x80000000|1, // match move
0x80000000|758, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 804
2,346, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 805
2,276, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+184, // $NT
  }
,
{ // state 806
163,MIN_REDUCTION+231, // $NT
  }
,
{ // state 807
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 808
0x80000000|1, // match move
0x80000000|136, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 809
2,465, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+164, // $NT
  }
,
{ // state 810
2,666, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+194, // $NT
  }
,
{ // state 811
163,MIN_REDUCTION+332, // $NT
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 812
96,636, // "o"
  }
,
{ // state 813
94,35, // "e"
  }
,
{ // state 814
2,752, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 815
2,490, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 816
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 817
102,989, // "i"
  }
,
{ // state 818
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 819
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 820
91,201, // "a"
  }
,
{ // state 821
94,395, // "e"
  }
,
{ // state 822
0x80000000|1, // match move
0x80000000|220, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 823
94,550, // "e"
  }
,
{ // state 824
94,283, // "e"
  }
,
{ // state 825
99,325, // "t"
  }
,
{ // state 826
99,673, // "t"
  }
,
{ // state 827
116,381, // "="
  }
,
{ // state 828
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+91, // $NT
  }
,
{ // state 829
102,8, // "i"
  }
,
{ // state 830
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 831
163,MIN_REDUCTION+211, // $NT
  }
,
{ // state 832
99,158, // "t"
  }
,
{ // state 833
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+153, // $NT
  }
,
{ // state 834
90,725, // "l"
96,400, // "o"
  }
,
{ // state 835
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 836
92,22, // "s"
  }
,
{ // state 837
94,324, // "e"
  }
,
{ // state 838
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 839
95,142, // "b"
  }
,
{ // state 840
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 841
94,125, // "e"
  }
,
{ // state 842
0x80000000|496, // match move
0x80000000|668, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 843
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 844
94,446, // "e"
  }
,
{ // state 845
0x80000000|971, // match move
0x80000000|57, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 846
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+143, // $NT
  }
,
{ // state 847
163,MIN_REDUCTION+236, // $NT
  }
,
{ // state 848
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 849
0x80000000|1, // match move
0x80000000|684, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 850
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 851
92,594, // "s"
  }
,
{ // state 852
2,206, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 853
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 854
2,619, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 855
97,662, // "n"
105,354, // "f"
111,933, // "m"
  }
,
{ // state 856
163,MIN_REDUCTION+201, // $NT
  }
,
{ // state 857
91,151, // "a"
  }
,
{ // state 858
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 859
102,105, // "i"
  }
,
{ // state 860
2,74, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 861
2,503, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+116, // $NT
  }
,
{ // state 862
163,MIN_REDUCTION+202, // $NT
  }
,
{ // state 863
2,1015, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 864
94,635, // "e"
  }
,
{ // state 865
102,33, // "i"
  }
,
{ // state 866
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 867
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 868
0x80000000|1, // match move
0x80000000|884, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 869
97,980, // "n"
  }
,
{ // state 870
2,321, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+124, // $NT
  }
,
{ // state 871
99,310, // "t"
  }
,
{ // state 872
116,1003, // "="
  }
,
{ // state 873
0x80000000|1, // match move
0x80000000|860, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 874
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 875
163,MIN_REDUCTION+242, // $NT
  }
,
{ // state 876
97,146, // "n"
  }
,
{ // state 877
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+169, // $NT
  }
,
{ // state 878
105,291, // "f"
  }
,
{ // state 879
92,683, // "s"
  }
,
{ // state 880
94,774, // "e"
  }
,
{ // state 881
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 882
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 883
163,MIN_REDUCTION+320, // $NT
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 884
2,776, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 885
163,MIN_REDUCTION+206, // $NT
  }
,
{ // state 886
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 887
163,MIN_REDUCTION+246, // $NT
  }
,
{ // state 888
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+171, // $NT
  }
,
{ // state 889
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 890
99,534, // "t"
  }
,
{ // state 891
99,475, // "t"
  }
,
{ // state 892
2,171, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 893
0x80000000|1, // match move
0x80000000|863, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 894
163,MIN_REDUCTION+215, // $NT
  }
,
{ // state 895
0x80000000|1, // match move
0x80000000|911, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 896
163,MIN_REDUCTION+308, // $NT
  }
,
{ // state 897
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 898
94,52, // "e"
  }
,
{ // state 899
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 900
2,309, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 901
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 902
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 903
0x80000000|1, // match move
0x80000000|900, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 904
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 905
97,197, // "n"
  }
,
{ // state 906
106,94, // "r"
  }
,
{ // state 907
96,812, // "o"
106,841, // "r"
110,334, // "y"
  }
,
{ // state 908
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+135, // $NT
  }
,
{ // state 909
89,947, // "c"
90,947, // "l"
91,947, // "a"
92,947, // "s"
94,947, // "e"
95,947, // "b"
96,947, // "o"
97,947, // "n"
98,947, // "x"
99,947, // "t"
100,947, // "d"
101,947, // "v"
102,947, // "i"
103,947, // "w"
104,947, // "h"
105,947, // "f"
106,947, // "r"
107,947, // "k"
108,947, // "u"
109,947, // "p"
110,947, // "y"
111,947, // "m"
112,947, // "g"
113,947, // "z"
115,947, // "!"
116,947, // "="
117,947, // "<"
118,947, // ">"
119,947, // "+"
120,947, // "-"
121,947, // "*"
122,947, // "%"
123,947, // "&"
124,947, // "("
125,947, // ")"
126,947, // "{"
127,947, // "}"
128,947, // "["
129,947, // "]"
130,947, // "|"
131,947, // "."
132,947, // ","
133,947, // ":"
134,947, // ";"
135,947, // "/"
141,947, // '"'
143,746, // printable
147,947, // "'"
149,947, // "_"
150,947, // {"A".."Z" "j" "q"}
151,947, // {"0".."9"}
153,947, // " "
158,947, // {"#".."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 910
2,819, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 911
2,877, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+170, // $NT
  }
,
{ // state 912
94,98, // "e"
  }
,
{ // state 913
90,792, // "l"
  }
,
{ // state 914
163,MIN_REDUCTION+318, // $NT
  }
,
{ // state 915
94,287, // "e"
  }
,
{ // state 916
0x80000000|1, // match move
0x80000000|861, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 917
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 918
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 919
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 920
0x80000000|1, // match move
0x80000000|599, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 921
101,214, // "v"
  }
,
{ // state 922
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 923
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 924
89,342, // "c"
  }
,
{ // state 925
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 926
163,MIN_REDUCTION+200, // $NT
  }
,
{ // state 927
0x80000000|1, // match move
0x80000000|804, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 928
138,789, // idChar**
161,562, // idChar*
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 929
90,451, // "l"
  }
,
{ // state 930
90,368, // "l"
  }
,
{ // state 931
104,120, // "h"
  }
,
{ // state 932
2,16, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 933
109,834, // "p"
  }
,
{ // state 934
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 935
99,208, // "t"
  }
,
{ // state 936
2,705, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+102, // $NT
  }
,
{ // state 937
163,MIN_REDUCTION+218, // $NT
  }
,
{ // state 938
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 939
90,425, // "l"
96,981, // "o"
  }
,
{ // state 940
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 941
0x80000000|919, // match move
0x80000000|858, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 942
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 943
2,406, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 944
0x80000000|1, // match move
0x80000000|997, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 945
104,439, // "h"
  }
,
{ // state 946
91,694, // "a"
  }
,
{ // state 947
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 948
101,585, // "v"
  }
,
{ // state 949
0x80000000|1, // match move
0x80000000|810, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 950
97,820, // "n"
  }
,
{ // state 951
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+167, // $NT
  }
,
{ // state 952
2,426, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 953
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 954
99,667, // "t"
  }
,
{ // state 955
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 956
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 957
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 958
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 959
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 960
96,464, // "o"
  }
,
{ // state 961
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 962
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 963
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 964
94,90, // "e"
  }
,
{ // state 965
96,935, // "o"
102,921, // "i"
  }
,
{ // state 966
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+145, // $NT
  }
,
{ // state 967
97,741, // "n"
  }
,
{ // state 968
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 969
0x80000000|1, // match move
0x80000000|49, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 970
94,340, // "e"
  }
,
{ // state 971
92,771, // "s"
  }
,
{ // state 972
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+137, // $NT
  }
,
{ // state 973
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 974
0x80000000|1, // match move
0x80000000|575, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 975
0x80000000|1, // match move
0x80000000|556, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 976
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 977
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+161, // $NT
  }
,
{ // state 978
2,180, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+158, // $NT
  }
,
{ // state 979
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 980
112,1006, // "g"
  }
,
{ // state 981
106,148, // "r"
  }
,
{ // state 982
92,474, // "s"
  }
,
{ // state 983
2,221, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 984
106,172, // "r"
  }
,
{ // state 985
0x80000000|1, // match move
0x80000000|936, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 986
92,436, // "s"
  }
,
{ // state 987
0x80000000|654, // match move
0x80000000|511, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 988
90,813, // "l"
  }
,
{ // state 989
89,697, // "c"
  }
,
{ // state 990
95,249, // "b"
  }
,
{ // state 991
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 992
163,MIN_REDUCTION+244, // $NT
  }
,
{ // state 993
163,MIN_REDUCTION+315, // $NT
  }
,
{ // state 994
2,510, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+140, // $NT
  }
,
{ // state 995
94,40, // "e"
  }
,
{ // state 996
0x80000000|912, // match move
0x80000000|576, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 997
2,431, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+160, // $NT
  }
,
{ // state 998
106,232, // "r"
  }
,
{ // state 999
90,205, // "l"
102,190, // "i"
  }
,
{ // state 1000
MIN_REDUCTION+315, // (default reduction)
  }
,
{ // state 1001
163,MIN_REDUCTION+228, // $NT
  }
,
{ // state 1002
112,823, // "g"
  }
,
{ // state 1003
2,247, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 1004
97,179, // "n"
  }
,
{ // state 1005
0x80000000|1, // match move
0x80000000|1018, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 1006
0x80000000|1, // match move
0x80000000|809, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 1007
163,MIN_REDUCTION+217, // $NT
  }
,
{ // state 1008
-1, // $$start
-1, // start
-1, // white*
5, // $$0
699, // token
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
598, // `!
351, // `!=
457, // `%
955, // `&&
402, // `*
739, // `(
416, // `)
101, // `{
145, // `}
779, // `-
55, // `+
501, // `=
783, // `==
973, // `[
979, // `]
940, // `||
653, // `<
1012, // `<=
957, // `,
24, // `>
122, // `>=
807, // `.
720, // `;
403, // `++
687, // `--
603, // `/
345, // `:
224, // ID
523, // INT_LITERAL
922, // STRING_LITERAL
233, // CHARACTER_LITERAL
842, // "c"
842, // "l"
842, // "a"
842, // "s"
-1, // idChar
842, // "e"
842, // "b"
842, // "o"
842, // "n"
842, // "x"
842, // "t"
842, // "d"
842, // "v"
842, // "i"
842, // "w"
842, // "h"
842, // "f"
842, // "r"
842, // "k"
842, // "u"
842, // "p"
842, // "y"
842, // "m"
842, // "g"
842, // "z"
-1, // reserved
289, // "!"
669, // "="
70, // "<"
704, // ">"
294, // "+"
238, // "-"
596, // "*"
258, // "%"
322, // "&"
814, // "("
762, // ")"
639, // "{"
320, // "}"
646, // "["
852, // "]"
95, // "|"
983, // "."
189, // ","
237, // ":"
801, // ";"
892, // "/"
558, // identifier
469, // letter
-1, // idChar**
328, // digit++
528, // dq
27, // '"'
-1, // stringChar
-1, // printable
-1, // stringChar*
-1, // $$1
909, // sq
574, // "'"
210, // digit
-1, // "_"
842, // {"A".."Z" "j" "q"}
399, // {"0".."9"}
712, // white
442, // " "
442, // {9 12}
788, // eol
953, // {10}
748, // {13}
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
579, // token*
610, // digit+
-1, // idChar*
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 1009
0x80000000|1, // match move
0x80000000|786, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 1010
0x80000000|1, // match move
0x80000000|943, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 1011
94,141, // "e"
  }
,
{ // state 1012
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 1013
104,597, // "h"
106,571, // "r"
  }
,
{ // state 1014
0x80000000|1, // match move
0x80000000|1023, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 1015
152,612, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 1016
152,811, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+99, // $NT
  }
,
{ // state 1017
90,595, // "l"
  }
,
{ // state 1018
2,502, // white*
152,897, // white
153,991, // " "
154,991, // {9 12}
155,488, // eol
156,472, // {10}
157,463, // {13}
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 1019
92,367, // "s"
  }
,
{ // state 1020
163,MIN_REDUCTION+212, // $NT
  }
,
{ // state 1021
109,632, // "p"
  }
,
{ // state 1022
97,327, // "n"
  }
,
{ // state 1023
2,721, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+126, // $NT
  }
,
{ // state 1024
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 1025
106,259, // "r"
  }
,
{ // state 1026
116,137, // "="
  }
,
{ // state 1027
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 1028
94,222, // "e"
  }
,
{ // state 1029
0x80000000|930, // match move
0x80000000|815, // no-match move
0x80000000|61, // NT-test-match state for idChar
  }
,
{ // state 1030
2,833, // white*
152,362, // white
153,883, // " "
154,883, // {9 12}
155,113, // eol
156,315, // {10}
157,134, // {13}
163,MIN_REDUCTION+154, // $NT
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
