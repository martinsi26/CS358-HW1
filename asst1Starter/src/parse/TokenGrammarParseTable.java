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
public int getEofSym() { return 171; }
public int getNttSym() { return 172; }
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
"comment",
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
"ds",
"printable**",
"comment_stuff**",
"comment_stuff",
"star_slash",
"comment_printable",
"{\"#\"..\"$\" \"?\"..\"@\" \"\\\" \"^\" \"`\" \"~\"}",
"10",
"13",
"token*",
"printable*",
"digit+",
"idChar*",
"comment_stuff*",
"$",
"$NT",
};
public String symName(int n) {
 return n >= 0 && n < symNameTable.length ? symNameTable[n] : "??";
}
private TokenGrammar actionObject;
public int[][] getParseTable() { return parseTable; }
public int numSymbols() { return 173;}
private static final int MIN_REDUCTION = 1528;
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
0x80000000|1295, // match move
0x80000000|1079, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1
  }
,
{ // state 2
0x80000000|1243, // match move
0x80000000|1263, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 3
2,1493, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 4
2,1294, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 5
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 6
99,146, // "t"
  }
,
{ // state 7
172,MIN_REDUCTION+336, // $NT
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 8
99,1185, // "t"
  }
,
{ // state 9
99,931, // "t"
  }
,
{ // state 10
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 11
172,MIN_REDUCTION+239, // $NT
  }
,
{ // state 12
0x80000000|1, // match move
0x80000000|178, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 13
0x80000000|248, // match move
0x80000000|960, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 14
108,1512, // "u"
  }
,
{ // state 15
2,1086, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 16
102,915, // "i"
  }
,
{ // state 17
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 18
97,855, // "n"
  }
,
{ // state 19
0x80000000|1360, // match move
0x80000000|1166, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 20
0x80000000|1, // match move
0x80000000|620, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 21
2,1319, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 22
2,1158, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 23
116,804, // "="
  }
,
{ // state 24
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 25
0x80000000|801, // match move
0x80000000|1257, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 26
0x80000000|1, // match move
0x80000000|544, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 27
91,746, // "a"
  }
,
{ // state 28
90,202, // "l"
91,954, // "a"
96,18, // "o"
104,396, // "h"
  }
,
{ // state 29
2,729, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 30
102,1419, // "i"
  }
,
{ // state 31
90,461, // "l"
  }
,
{ // state 32
172,MIN_REDUCTION+205, // $NT
  }
,
{ // state 33
99,451, // "t"
  }
,
{ // state 34
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 35
0x80000000|1, // match move
0x80000000|1356, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 36
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 37
90,830, // "l"
  }
,
{ // state 38
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 39
106,206, // "r"
  }
,
{ // state 40
0x80000000|1028, // match move
0x80000000|561, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 41
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 42
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 43
2,1443, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 44
172,MIN_REDUCTION+204, // $NT
  }
,
{ // state 45
90,535, // "l"
91,1340, // "a"
96,740, // "o"
104,916, // "h"
  }
,
{ // state 46
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 47
89,395, // "c"
90,395, // "l"
91,395, // "a"
92,395, // "s"
94,395, // "e"
95,395, // "b"
96,395, // "o"
97,395, // "n"
98,395, // "x"
99,395, // "t"
100,395, // "d"
101,395, // "v"
102,395, // "i"
103,395, // "w"
104,395, // "h"
105,395, // "f"
106,395, // "r"
107,395, // "k"
108,395, // "u"
109,395, // "p"
110,395, // "y"
111,395, // "m"
112,395, // "g"
113,395, // "z"
115,395, // "!"
116,395, // "="
117,395, // "<"
118,395, // ">"
119,395, // "+"
120,395, // "-"
121,395, // "*"
122,395, // "%"
123,395, // "&"
124,395, // "("
125,395, // ")"
126,395, // "{"
127,395, // "}"
128,395, // "["
129,395, // "]"
130,395, // "|"
131,395, // "."
132,395, // ","
133,395, // ":"
134,395, // ";"
136,395, // "/"
142,395, // '"'
148,395, // "'"
150,395, // "_"
151,395, // {"A".."Z" "j" "q"}
152,395, // {"0".."9"}
154,395, // " "
163,395, // {"#".."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 48
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+93, // $NT
  }
,
{ // state 49
94,1120, // "e"
  }
,
{ // state 50
0x80000000|1259, // match move
0x80000000|307, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 51
MIN_REDUCTION+343, // (default reduction)
  }
,
{ // state 52
121,824, // "*"
136,472, // "/"
  }
,
{ // state 53
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 54
164,76, // {10}
  }
,
{ // state 55
0x80000000|1, // match move
0x80000000|263, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 56
172,MIN_REDUCTION+233, // $NT
  }
,
{ // state 57
136,342, // "/"
157,365, // ds
  }
,
{ // state 58
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 59
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 60
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 61
2,180, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 62
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 63
2,568, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 64
108,1307, // "u"
  }
,
{ // state 65
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 66
108,1381, // "u"
  }
,
{ // state 67
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 68
2,813, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 69
0x80000000|890, // match move
0x80000000|340, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 70
2,961, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 71
97,847, // "n"
  }
,
{ // state 72
0x80000000|1184, // match move
0x80000000|1373, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 73
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 74
2,776, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 75
89,1355, // "c"
90,1355, // "l"
91,1355, // "a"
92,1355, // "s"
94,1355, // "e"
95,1355, // "b"
96,1355, // "o"
97,1355, // "n"
98,1355, // "x"
99,1355, // "t"
100,1355, // "d"
101,1355, // "v"
102,1355, // "i"
103,1355, // "w"
104,1355, // "h"
105,1355, // "f"
106,1355, // "r"
107,1355, // "k"
108,1355, // "u"
109,1355, // "p"
110,1355, // "y"
111,1355, // "m"
112,1355, // "g"
113,1355, // "z"
138,1470, // letter
149,525, // digit
150,352, // "_"
151,1355, // {"A".."Z" "j" "q"}
152,542, // {"0".."9"}
  }
,
{ // state 76
172,MIN_REDUCTION+334, // $NT
  }
,
{ // state 77
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 78
92,398, // "s"
  }
,
{ // state 79
89,1489, // "c"
  }
,
{ // state 80
0x80000000|998, // match move
0x80000000|444, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 81
102,1284, // "i"
  }
,
{ // state 82
0x80000000|1, // match move
0x80000000|594, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 83
2,72, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 84
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 85
153,MIN_REDUCTION+327, // white
155,MIN_REDUCTION+327, // {9 12}
164,MIN_REDUCTION+327, // {10}
165,MIN_REDUCTION+327, // {13}
172,MIN_REDUCTION+327, // $NT
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 86
172,MIN_REDUCTION+346, // $NT
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 87
89,1142, // "c"
90,1142, // "l"
91,1142, // "a"
92,1142, // "s"
93,13, // idChar
94,1142, // "e"
95,1142, // "b"
96,1142, // "o"
97,1142, // "n"
98,1142, // "x"
99,1142, // "t"
100,1142, // "d"
101,1142, // "v"
102,1142, // "i"
103,1142, // "w"
104,1142, // "h"
105,1142, // "f"
106,1142, // "r"
107,1142, // "k"
108,1142, // "u"
109,1142, // "p"
110,1142, // "y"
111,1142, // "m"
112,1142, // "g"
113,1142, // "z"
138,825, // letter
139,1150, // idChar**
149,504, // digit
150,464, // "_"
151,1142, // {"A".."Z" "j" "q"}
152,767, // {"0".."9"}
169,822, // idChar*
  }
,
{ // state 88
172,MIN_REDUCTION+203, // $NT
  }
,
{ // state 89
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 90
0x80000000|1066, // match move
0x80000000|1379, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 91
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 92
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 93
121,456, // "*"
159,780, // comment_stuff**
170,1054, // comment_stuff*
  }
,
{ // state 94
0x80000000|1087, // match move
0x80000000|272, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 95
0x80000000|1467, // match move
0x80000000|108, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 96
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 97
172,MIN_REDUCTION+197, // $NT
  }
,
{ // state 98
97,969, // "n"
  }
,
{ // state 99
2,742, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+116, // $NT
  }
,
{ // state 100
92,963, // "s"
  }
,
{ // state 101
94,783, // "e"
  }
,
{ // state 102
104,1272, // "h"
106,1093, // "r"
  }
,
{ // state 103
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 104
0x80000000|1, // match move
0x80000000|565, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 105
106,763, // "r"
  }
,
{ // state 106
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 107
102,1008, // "i"
  }
,
{ // state 108
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 109
99,425, // "t"
  }
,
{ // state 110
104,548, // "h"
  }
,
{ // state 111
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 112
172,MIN_REDUCTION+339, // $NT
  }
,
{ // state 113
0x80000000|449, // match move
0x80000000|1433, // no-match move
0x80000000|870, // NT-test-match state for comment_stuff
  }
,
{ // state 114
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 115
2,1135, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 116
158,1101, // printable**
167,1442, // printable*
172,MIN_REDUCTION+324, // $NT
  }
,
{ // state 117
96,551, // "o"
  }
,
{ // state 118
2,1336, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 119
2,1312, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 120
94,564, // "e"
  }
,
{ // state 121
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 122
89,805, // "c"
90,805, // "l"
91,805, // "a"
92,805, // "s"
94,805, // "e"
95,805, // "b"
96,805, // "o"
97,805, // "n"
98,805, // "x"
99,805, // "t"
100,805, // "d"
101,805, // "v"
102,805, // "i"
103,805, // "w"
104,805, // "h"
105,805, // "f"
106,805, // "r"
107,805, // "k"
108,805, // "u"
109,805, // "p"
110,805, // "y"
111,805, // "m"
112,805, // "g"
113,805, // "z"
115,805, // "!"
116,805, // "="
117,805, // "<"
118,805, // ">"
119,805, // "+"
120,805, // "-"
121,805, // "*"
122,805, // "%"
123,805, // "&"
124,805, // "("
125,805, // ")"
126,805, // "{"
127,805, // "}"
128,805, // "["
129,805, // "]"
130,805, // "|"
131,805, // "."
132,805, // ","
133,805, // ":"
134,805, // ";"
136,805, // "/"
142,805, // '"'
144,764, // printable
148,805, // "'"
150,805, // "_"
151,805, // {"A".."Z" "j" "q"}
152,805, // {"0".."9"}
154,805, // " "
163,805, // {"#".."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 123
152,542, // {"0".."9"}
  }
,
{ // state 124
0x80000000|986, // match move
0x80000000|653, // no-match move
0x80000000|47, // NT-test-match state for printable
  }
,
{ // state 125
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 126
91,1013, // "a"
  }
,
{ // state 127
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 128
172,MIN_REDUCTION+237, // $NT
  }
,
{ // state 129
91,831, // "a"
  }
,
{ // state 130
2,697, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 131
2,881, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 132
0x80000000|806, // match move
0x80000000|164, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 133
0x80000000|1, // match move
0x80000000|1286, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 134
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 135
136,310, // "/"
  }
,
{ // state 136
2,623, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 137
92,1077, // "s"
  }
,
{ // state 138
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+181, // $NT
  }
,
{ // state 139
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 140
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 141
172,MIN_REDUCTION+349, // $NT
  }
,
{ // state 142
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 143
102,1019, // "i"
  }
,
{ // state 144
147,1139, // sq
148,1427, // "'"
  }
,
{ // state 145
96,473, // "o"
  }
,
{ // state 146
0x80000000|1, // match move
0x80000000|408, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 147
99,341, // "t"
  }
,
{ // state 148
2,1063, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 149
91,955, // "a"
  }
,
{ // state 150
102,1040, // "i"
  }
,
{ // state 151
106,1182, // "r"
  }
,
{ // state 152
0x80000000|1, // match move
0x80000000|1141, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 153
136,703, // "/"
  }
,
{ // state 154
92,648, // "s"
  }
,
{ // state 155
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 156
0x80000000|942, // match move
0x80000000|173, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 157
2,161, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 158
2,581, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 159
94,950, // "e"
  }
,
{ // state 160
109,406, // "p"
  }
,
{ // state 161
0x80000000|1475, // match move
0x80000000|1482, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 162
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 163
172,MIN_REDUCTION+321, // $NT
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 164
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 165
2,741, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 166
172,MIN_REDUCTION+350, // $NT
  }
,
{ // state 167
2,1430, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 168
172,MIN_REDUCTION+230, // $NT
  }
,
{ // state 169
0x80000000|1200, // match move
0x80000000|385, // no-match move
0x80000000|870, // NT-test-match state for comment_stuff
  }
,
{ // state 170
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 171
90,432, // "l"
  }
,
{ // state 172
2,1335, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 173
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 174
2,94, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 175
2,573, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 176
0x80000000|1496, // match move
0x80000000|1085, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 177
102,1396, // "i"
  }
,
{ // state 178
2,735, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+112, // $NT
  }
,
{ // state 179
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 180
0x80000000|383, // match move
0x80000000|983, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 181
96,1058, // "o"
  }
,
{ // state 182
1,856, // start
2,1220, // white*
3,162, // $$0
4,1130, // token
5,515, // `boolean
6,1468, // `class
7,569, // `extends
8,673, // `void
9,1520, // `int
10,979, // `while
11,615, // `if
12,1398, // `else
13,140, // `for
14,1154, // `break
15,1226, // `this
16,331, // `false
17,294, // `true
18,926, // `super
19,59, // `null
20,1323, // `return
21,460, // `instanceof
22,1026, // `new
23,650, // `abstract
24,245, // `assert
25,91, // `byte
26,849, // `case
27,1025, // `catch
28,976, // `char
29,111, // `const
30,523, // `continue
31,1029, // `default
32,1140, // `do
33,1232, // `double
34,1308, // `enum
35,699, // `final
36,1313, // `finally
37,1508, // `float
38,429, // `goto
39,134, // `implements
40,700, // `import
41,1076, // `interface
42,478, // `long
43,779, // `native
44,346, // `package
45,251, // `private
46,1348, // `protected
47,678, // `public
48,125, // `short
49,42, // `static
50,524, // `strictfp
51,756, // `switch
52,837, // `synchronized
53,1178, // `throw
54,1279, // `throws
55,323, // `transient
56,543, // `try
57,940, // `volatile
89,45, // "c"
90,440, // "l"
91,1461, // "a"
92,199, // "s"
94,421, // "e"
95,448, // "b"
97,309, // "n"
99,102, // "t"
100,737, // "d"
101,766, // "v"
102,422, // "i"
103,1404, // "w"
105,641, // "f"
106,882, // "r"
109,790, // "p"
112,943, // "g"
166,840, // token*
171,MIN_REDUCTION+1, // $
  }
,
{ // state 183
0x80000000|705, // match move
0x80000000|77, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 184
172,MIN_REDUCTION+220, // $NT
  }
,
{ // state 185
2,1082, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 186
0x80000000|1148, // match move
0x80000000|290, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 187
2,798, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 188
91,743, // "a"
  }
,
{ // state 189
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 190
164,121, // {10}
  }
,
{ // state 191
99,1071, // "t"
  }
,
{ // state 192
0x80000000|1113, // match move
0x80000000|503, // no-match move
0x80000000|47, // NT-test-match state for printable
  }
,
{ // state 193
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 194
100,1370, // "d"
  }
,
{ // state 195
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 196
99,1118, // "t"
  }
,
{ // state 197
172,MIN_REDUCTION+339, // $NT
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 198
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 199
99,439, // "t"
103,207, // "w"
104,255, // "h"
108,330, // "u"
110,750, // "y"
  }
,
{ // state 200
94,1459, // "e"
  }
,
{ // state 201
90,635, // "l"
  }
,
{ // state 202
91,930, // "a"
  }
,
{ // state 203
0x80000000|1, // match move
0x80000000|299, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 204
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 205
172,MIN_REDUCTION+332, // $NT
  }
,
{ // state 206
0x80000000|1, // match move
0x80000000|99, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 207
102,1337, // "i"
  }
,
{ // state 208
97,1215, // "n"
  }
,
{ // state 209
4,426, // token
MIN_REDUCTION+355, // (default reduction)
  }
,
{ // state 210
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 211
0x80000000|89, // match move
0x80000000|560, // no-match move
0x80000000|47, // NT-test-match state for printable
  }
,
{ // state 212
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 213
0x80000000|688, // match move
0x80000000|68, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 214
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+141, // $NT
  }
,
{ // state 215
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 216
97,858, // "n"
105,1358, // "f"
111,1053, // "m"
  }
,
{ // state 217
0x80000000|1, // match move
0x80000000|1167, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 218
0x80000000|1, // match move
0x80000000|500, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 219
120,367, // "-"
  }
,
{ // state 220
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 221
90,1269, // "l"
  }
,
{ // state 222
96,674, // "o"
  }
,
{ // state 223
2,435, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+192, // $NT
  }
,
{ // state 224
89,133, // "c"
  }
,
{ // state 225
172,MIN_REDUCTION+223, // $NT
  }
,
{ // state 226
2,957, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 227
0x80000000|1, // match move
0x80000000|319, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 228
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 229
96,643, // "o"
106,259, // "r"
110,285, // "y"
  }
,
{ // state 230
0x80000000|1, // match move
0x80000000|1293, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 231
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 232
0x80000000|1, // match move
0x80000000|492, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 233
108,589, // "u"
  }
,
{ // state 234
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 235
2,95, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 236
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 237
91,1030, // "a"
  }
,
{ // state 238
2,1412, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 239
172,MIN_REDUCTION+195, // $NT
  }
,
{ // state 240
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 241
89,1223, // "c"
90,1223, // "l"
91,1223, // "a"
92,1223, // "s"
94,1223, // "e"
95,1223, // "b"
96,1223, // "o"
97,1223, // "n"
98,1223, // "x"
99,1223, // "t"
100,1223, // "d"
101,1223, // "v"
102,1223, // "i"
103,1223, // "w"
104,1223, // "h"
105,1223, // "f"
106,1223, // "r"
107,1223, // "k"
108,1223, // "u"
109,1223, // "p"
110,1223, // "y"
111,1223, // "m"
112,1223, // "g"
113,1223, // "z"
115,1223, // "!"
116,1223, // "="
117,1223, // "<"
118,1223, // ">"
119,1223, // "+"
120,1223, // "-"
121,1223, // "*"
122,1223, // "%"
123,1223, // "&"
124,1223, // "("
125,1223, // ")"
126,1223, // "{"
127,1223, // "}"
128,1223, // "["
129,1223, // "]"
130,1223, // "|"
131,1223, // "."
132,1223, // ","
133,1223, // ":"
134,1223, // ";"
136,1223, // "/"
142,1223, // '"'
143,51, // stringChar
144,604, // printable
146,792, // $$1
148,1223, // "'"
150,1223, // "_"
151,1223, // {"A".."Z" "j" "q"}
152,1223, // {"0".."9"}
154,1223, // " "
163,1223, // {"#".."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 242
0x80000000|753, // match move
0x80000000|1267, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 243
0x80000000|394, // match move
0x80000000|655, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 244
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 245
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 246
2,349, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 247
0x80000000|1208, // match move
0x80000000|816, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 248
MIN_REDUCTION+352, // (default reduction)
  }
,
{ // state 249
0x80000000|344, // match move
0x80000000|1413, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 250
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 251
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 252
94,1155, // "e"
  }
,
{ // state 253
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+149, // $NT
  }
,
{ // state 254
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 255
96,1119, // "o"
  }
,
{ // state 256
2,335, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+90, // $NT
  }
,
{ // state 257
2,896, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 258
0x80000000|1, // match move
0x80000000|284, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 259
94,1405, // "e"
  }
,
{ // state 260
89,1143, // "c"
  }
,
{ // state 261
94,1326, // "e"
  }
,
{ // state 262
0x80000000|479, // match move
0x80000000|4, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 263
0x80000000|22, // match move
0x80000000|1057, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 264
102,671, // "i"
  }
,
{ // state 265
90,1499, // "l"
96,497, // "o"
  }
,
{ // state 266
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+157, // $NT
  }
,
{ // state 267
0x80000000|1507, // match move
0x80000000|1440, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 268
92,308, // "s"
99,150, // "t"
  }
,
{ // state 269
94,724, // "e"
  }
,
{ // state 270
0x80000000|841, // match move
0x80000000|246, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 271
2,471, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 272
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 273
2,372, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 274
0x80000000|23, // match move
0x80000000|1002, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 275
0x80000000|157, // match move
0x80000000|908, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 276
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 277
89,769, // "c"
  }
,
{ // state 278
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+187, // $NT
  }
,
{ // state 279
99,499, // "t"
  }
,
{ // state 280
116,347, // "="
  }
,
{ // state 281
172,MIN_REDUCTION+334, // $NT
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 282
2,506, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 283
92,1227, // "s"
  }
,
{ // state 284
2,48, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+94, // $NT
  }
,
{ // state 285
99,583, // "t"
  }
,
{ // state 286
0x80000000|100, // match move
0x80000000|1258, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 287
96,475, // "o"
  }
,
{ // state 288
111,417, // "m"
  }
,
{ // state 289
89,562, // "c"
  }
,
{ // state 290
2,904, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 291
99,400, // "t"
  }
,
{ // state 292
0x80000000|1, // match move
0x80000000|223, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 293
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 294
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 295
111,596, // "m"
  }
,
{ // state 296
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 297
2,132, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 298
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 299
2,608, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+166, // $NT
  }
,
{ // state 300
2,627, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 301
172,MIN_REDUCTION+235, // $NT
  }
,
{ // state 302
94,328, // "e"
  }
,
{ // state 303
MIN_REDUCTION+344, // (default reduction)
  }
,
{ // state 304
2,702, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+357, // (default reduction)
  }
,
{ // state 305
0x80000000|1, // match move
0x80000000|364, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 306
0x80000000|212, // match move
0x80000000|836, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 307
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 308
99,322, // "t"
  }
,
{ // state 309
91,1083, // "a"
94,987, // "e"
108,37, // "u"
  }
,
{ // state 310
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 311
0x80000000|1361, // match move
0x80000000|1282, // no-match move
0x80000000|123, // NT-test-match state for digit
  }
,
{ // state 312
0x80000000|231, // match move
0x80000000|1224, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 313
0x80000000|905, // match move
0x80000000|513, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 314
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 315
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 316
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 317
2,1017, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 318
2,1392, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 319
2,1210, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+154, // $NT
  }
,
{ // state 320
94,947, // "e"
  }
,
{ // state 321
0x80000000|996, // match move
0x80000000|41, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 322
0x80000000|1, // match move
0x80000000|373, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 323
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 324
90,920, // "l"
  }
,
{ // state 325
0x80000000|716, // match move
0x80000000|486, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 326
164,586, // {10}
  }
,
{ // state 327
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+173, // $NT
  }
,
{ // state 328
0x80000000|1, // match move
0x80000000|1105, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 329
94,1242, // "e"
  }
,
{ // state 330
109,1015, // "p"
  }
,
{ // state 331
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 332
2,351, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+176, // $NT
  }
,
{ // state 333
102,1425, // "i"
  }
,
{ // state 334
0x80000000|29, // match move
0x80000000|1230, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 335
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+89, // $NT
  }
,
{ // state 336
89,925, // "c"
  }
,
{ // state 337
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 338
2,894, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 339
102,1020, // "i"
  }
,
{ // state 340
2,379, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+186, // $NT
  }
,
{ // state 341
0x80000000|1, // match move
0x80000000|374, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 342
121,777, // "*"
136,382, // "/"
  }
,
{ // state 343
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+109, // $NT
  }
,
{ // state 344
116,1478, // "="
  }
,
{ // state 345
0x80000000|918, // match move
0x80000000|167, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 346
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 347
0x80000000|919, // match move
0x80000000|118, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 348
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 349
0x80000000|727, // match move
0x80000000|788, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 350
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 351
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+175, // $NT
  }
,
{ // state 352
172,MIN_REDUCTION+317, // $NT
  }
,
{ // state 353
91,610, // "a"
  }
,
{ // state 354
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+107, // $NT
  }
,
{ // state 355
99,407, // "t"
  }
,
{ // state 356
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 357
89,1075, // "c"
90,1075, // "l"
91,1075, // "a"
92,1075, // "s"
94,1075, // "e"
95,1075, // "b"
96,1075, // "o"
97,1075, // "n"
98,1075, // "x"
99,1075, // "t"
100,1075, // "d"
101,1075, // "v"
102,1075, // "i"
103,1075, // "w"
104,1075, // "h"
105,1075, // "f"
106,1075, // "r"
107,1075, // "k"
108,1075, // "u"
109,1075, // "p"
110,1075, // "y"
111,1075, // "m"
112,1075, // "g"
113,1075, // "z"
115,1075, // "!"
116,1075, // "="
117,1075, // "<"
118,1075, // ">"
119,1075, // "+"
120,1075, // "-"
121,1075, // "*"
122,1075, // "%"
123,1075, // "&"
124,1075, // "("
125,1075, // ")"
126,1075, // "{"
127,1075, // "}"
128,1075, // "["
129,1075, // "]"
130,1075, // "|"
131,1075, // "."
132,1075, // ","
133,1075, // ":"
134,1075, // ";"
136,1075, // "/"
142,1075, // '"'
144,405, // printable
148,1075, // "'"
150,1075, // "_"
151,1075, // {"A".."Z" "j" "q"}
152,1075, // {"0".."9"}
154,1075, // " "
158,1101, // printable**
163,1075, // {"#".."$" "?".."@" "\" "^" "`" "~"}
167,1442, // printable*
  }
,
{ // state 358
108,1456, // "u"
  }
,
{ // state 359
99,644, // "t"
  }
,
{ // state 360
172,MIN_REDUCTION+225, // $NT
  }
,
{ // state 361
136,103, // "/"
  }
,
{ // state 362
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 363
94,572, // "e"
  }
,
{ // state 364
0x80000000|807, // match move
0x80000000|1177, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 365
0x80000000|357, // match move
0x80000000|116, // no-match move
0x80000000|47, // NT-test-match state for printable
  }
,
{ // state 366
90,154, // "l"
97,358, // "n"
98,413, // "x"
  }
,
{ // state 367
0x80000000|257, // match move
0x80000000|647, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 368
100,1251, // "d"
  }
,
{ // state 369
94,232, // "e"
  }
,
{ // state 370
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 371
172,MIN_REDUCTION+226, // $NT
  }
,
{ // state 372
0x80000000|1519, // match move
0x80000000|1437, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 373
0x80000000|115, // match move
0x80000000|1401, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 374
0x80000000|83, // match move
0x80000000|1265, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 375
94,488, // "e"
  }
,
{ // state 376
99,720, // "t"
  }
,
{ // state 377
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 378
0x80000000|1049, // match move
0x80000000|1511, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 379
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+185, // $NT
  }
,
{ // state 380
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 381
172,MIN_REDUCTION+227, // $NT
  }
,
{ // state 382
0x80000000|817, // match move
0x80000000|556, // no-match move
0x80000000|47, // NT-test-match state for printable
  }
,
{ // state 383
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 384
0x80000000|1454, // match move
0x80000000|1231, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 385
121,624, // "*"
159,1438, // comment_stuff**
170,1054, // comment_stuff*
  }
,
{ // state 386
96,1309, // "o"
  }
,
{ // state 387
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+103, // $NT
  }
,
{ // state 388
2,885, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 389
0x80000000|1219, // match move
0x80000000|43, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 390
172,MIN_REDUCTION+335, // $NT
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 391
91,854, // "a"
106,1132, // "r"
108,481, // "u"
  }
,
{ // state 392
172,MIN_REDUCTION+216, // $NT
  }
,
{ // state 393
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+356, // (default reduction)
  }
,
{ // state 394
2,156, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 395
172,MIN_REDUCTION+336, // $NT
  }
,
{ // state 396
91,886, // "a"
  }
,
{ // state 397
97,258, // "n"
  }
,
{ // state 398
0x80000000|1, // match move
0x80000000|879, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 399
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 400
0x80000000|1, // match move
0x80000000|1078, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 401
2,881, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 402
97,79, // "n"
  }
,
{ // state 403
-1, // $$start
-1, // start
-1, // white*
5, // $$0
1130, // token
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
1097, // `!
1387, // `!=
1159, // `%
593, // `&&
1411, // `*
1096, // `(
1359, // `)
236, // `{
989, // `}
67, // `-
377, // `+
1378, // `=
65, // `==
944, // `[
540, // `]
459, // `||
1051, // `<
866, // `<=
605, // `,
714, // `>
1248, // `>=
53, // `.
350, // `;
1273, // `++
1100, // `--
1301, // `/
1439, // `:
984, // ID
1271, // INT_LITERAL
633, // STRING_LITERAL
1244, // CHARACTER_LITERAL
1222, // "c"
1222, // "l"
1222, // "a"
1222, // "s"
-1, // idChar
1222, // "e"
1222, // "b"
1222, // "o"
1222, // "n"
1222, // "x"
1222, // "t"
1222, // "d"
1222, // "v"
1222, // "i"
1222, // "w"
1222, // "h"
1222, // "f"
1222, // "r"
1222, // "k"
1222, // "u"
1222, // "p"
1222, // "y"
1222, // "m"
1222, // "g"
1222, // "z"
-1, // reserved
1170, // "!"
274, // "="
868, // "<"
249, // ">"
1254, // "+"
1099, // "-"
483, // "*"
758, // "%"
832, // "&"
40, // "("
262, // ")"
453, // "{"
862, // "}"
587, // "["
934, // "]"
1211, // "|"
90, // "."
924, // ","
275, // ":"
25, // ";"
-1, // comment
243, // "/"
522, // identifier
857, // letter
-1, // idChar**
1406, // digit++
1098, // dq
34, // '"'
-1, // stringChar
-1, // printable
-1, // stringChar*
-1, // $$1
842, // sq
833, // "'"
311, // digit
-1, // "_"
1222, // {"A".."Z" "j" "q"}
585, // {"0".."9"}
1035, // white
649, // " "
649, // {9 12}
1145, // eol
-1, // ds
-1, // printable**
-1, // comment_stuff**
-1, // comment_stuff
-1, // star_slash
-1, // comment_printable
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // {10}
794, // {13}
840, // token*
-1, // printable*
883, // digit+
-1, // idChar*
-1, // comment_stuff*
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 404
2,384, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 405
0x80000000|1007, // match move
0x80000000|166, // no-match move
0x80000000|47, // NT-test-match state for printable
  }
,
{ // state 406
0x80000000|1, // match move
0x80000000|584, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 407
0x80000000|1, // match move
0x80000000|247, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 408
0x80000000|1123, // match move
0x80000000|1384, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 409
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 410
106,1332, // "r"
  }
,
{ // state 411
2,1383, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 412
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 413
99,685, // "t"
  }
,
{ // state 414
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 415
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+151, // $NT
  }
,
{ // state 416
150,MIN_REDUCTION+327, // "_"
154,MIN_REDUCTION+327, // " "
158,MIN_REDUCTION+327, // printable**
163,MIN_REDUCTION+327, // {"#".."$" "?".."@" "\" "^" "`" "~"}
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 417
0x80000000|1, // match move
0x80000000|739, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 418
172,MIN_REDUCTION+335, // $NT
  }
,
{ // state 419
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+183, // $NT
  }
,
{ // state 420
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+117, // $NT
  }
,
{ // state 421
90,1513, // "l"
97,1089, // "n"
98,791, // "x"
  }
,
{ // state 422
97,601, // "n"
105,814, // "f"
111,1353, // "m"
  }
,
{ // state 423
139,1150, // idChar**
169,822, // idChar*
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 424
0x80000000|36, // match move
0x80000000|574, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 425
105,819, // "f"
  }
,
{ // state 426
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 427
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 428
0x80000000|446, // match move
0x80000000|1416, // no-match move
0x80000000|870, // NT-test-match state for comment_stuff
  }
,
{ // state 429
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 430
96,1095, // "o"
  }
,
{ // state 431
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 432
90,20, // "l"
  }
,
{ // state 433
92,799, // "s"
  }
,
{ // state 434
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 435
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+191, // $NT
  }
,
{ // state 436
89,1375, // "c"
  }
,
{ // state 437
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 438
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 439
91,677, // "a"
106,1134, // "r"
  }
,
{ // state 440
96,1389, // "o"
  }
,
{ // state 441
94,1042, // "e"
  }
,
{ // state 442
0x80000000|1, // match move
0x80000000|582, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 443
0x80000000|1016, // match move
0x80000000|70, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 444
2,717, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 445
0x80000000|185, // match move
0x80000000|521, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 446
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 447
172,MIN_REDUCTION+323, // $NT
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 448
96,1239, // "o"
106,252, // "r"
110,493, // "y"
  }
,
{ // state 449
89,428, // "c"
90,428, // "l"
91,428, // "a"
92,428, // "s"
94,428, // "e"
95,428, // "b"
96,428, // "o"
97,428, // "n"
98,428, // "x"
99,428, // "t"
100,428, // "d"
101,428, // "v"
102,428, // "i"
103,428, // "w"
104,428, // "h"
105,428, // "f"
106,428, // "r"
107,428, // "k"
108,428, // "u"
109,428, // "p"
110,428, // "y"
111,428, // "m"
112,428, // "g"
113,428, // "z"
115,428, // "!"
116,428, // "="
117,428, // "<"
118,428, // ">"
119,428, // "+"
120,428, // "-"
121,914, // "*"
122,428, // "%"
123,428, // "&"
124,428, // "("
125,428, // ")"
126,428, // "{"
127,428, // "}"
128,428, // "["
129,428, // "]"
130,428, // "|"
131,428, // "."
132,428, // ","
133,428, // ":"
134,428, // ";"
136,428, // "/"
142,428, // '"'
148,428, // "'"
150,428, // "_"
151,428, // {"A".."Z" "j" "q"}
152,428, // {"0".."9"}
154,428, // " "
156,1068, // eol
159,640, // comment_stuff**
160,820, // comment_stuff
161,1492, // star_slash
162,1479, // comment_printable
163,428, // {"#".."$" "?".."@" "\" "^" "`" "~"}
164,576, // {10}
165,1168, // {13}
170,1054, // comment_stuff*
  }
,
{ // state 450
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+177, // $NT
  }
,
{ // state 451
106,1091, // "r"
  }
,
{ // state 452
0x80000000|337, // match move
0x80000000|999, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 453
0x80000000|869, // match move
0x80000000|529, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 454
2,452, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 455
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 456
136,981, // "/"
  }
,
{ // state 457
2,702, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+357, // (default reduction)
  }
,
{ // state 458
94,669, // "e"
  }
,
{ // state 459
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 460
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 461
92,922, // "s"
  }
,
{ // state 462
104,410, // "h"
  }
,
{ // state 463
0x80000000|646, // match move
0x80000000|921, // no-match move
0x80000000|47, // NT-test-match state for printable
  }
,
{ // state 464
0x80000000|1247, // match move
0x80000000|539, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 465
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 466
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 467
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 468
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+123, // $NT
  }
,
{ // state 469
0x80000000|457, // match move
0x80000000|304, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 470
172,MIN_REDUCTION+328, // $NT
  }
,
{ // state 471
0x80000000|139, // match move
0x80000000|722, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 472
0x80000000|817, // match move
0x80000000|85, // no-match move
0x80000000|47, // NT-test-match state for printable
  }
,
{ // state 473
105,1280, // "f"
  }
,
{ // state 474
99,49, // "t"
  }
,
{ // state 475
97,889, // "n"
  }
,
{ // state 476
2,941, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+114, // $NT
  }
,
{ // state 477
2,1412, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 478
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 479
2,1294, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 480
2,1011, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 481
95,982, // "b"
  }
,
{ // state 482
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 483
0x80000000|651, // match move
0x80000000|937, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 484
0x80000000|1190, // match move
0x80000000|851, // no-match move
0x80000000|870, // NT-test-match state for comment_stuff
  }
,
{ // state 485
2,776, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 486
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 487
0x80000000|1041, // match move
0x80000000|404, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 488
97,1144, // "n"
  }
,
{ // state 489
0x80000000|89, // match move
0x80000000|141, // no-match move
0x80000000|47, // NT-test-match state for printable
  }
,
{ // state 490
2,581, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 491
104,143, // "h"
  }
,
{ // state 492
2,1432, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+146, // $NT
  }
,
{ // state 493
99,1161, // "t"
  }
,
{ // state 494
172,MIN_REDUCTION+245, // $NT
  }
,
{ // state 495
97,196, // "n"
  }
,
{ // state 496
0x80000000|1, // match move
0x80000000|510, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 497
106,821, // "r"
  }
,
{ // state 498
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+147, // $NT
  }
,
{ // state 499
94,1518, // "e"
  }
,
{ // state 500
2,552, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+130, // $NT
  }
,
{ // state 501
2,1241, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 502
90,1525, // "l"
  }
,
{ // state 503
158,370, // printable**
167,859, // printable*
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 504
0x80000000|142, // match move
0x80000000|60, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 505
92,107, // "s"
  }
,
{ // state 506
0x80000000|1038, // match move
0x80000000|316, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 507
0x80000000|297, // match move
0x80000000|786, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 508
99,1072, // "t"
  }
,
{ // state 509
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+105, // $NT
  }
,
{ // state 510
2,354, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+108, // $NT
  }
,
{ // state 511
94,1193, // "e"
  }
,
{ // state 512
172,MIN_REDUCTION+222, // $NT
  }
,
{ // state 513
2,1362, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 514
94,1447, // "e"
  }
,
{ // state 515
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 516
0x80000000|1, // match move
0x80000000|530, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 517
0x80000000|617, // match move
0x80000000|155, // no-match move
0x80000000|870, // NT-test-match state for comment_stuff
  }
,
{ // state 518
2,1445, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+162, // $NT
  }
,
{ // state 519
2,498, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+148, // $NT
  }
,
{ // state 520
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 521
2,1082, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 522
0x80000000|501, // match move
0x80000000|1422, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 523
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 524
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 525
172,MIN_REDUCTION+316, // $NT
  }
,
{ // state 526
90,619, // "l"
  }
,
{ // state 527
2,573, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 528
91,1106, // "a"
  }
,
{ // state 529
2,1197, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 530
0x80000000|927, // match move
0x80000000|172, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 531
2,138, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+182, // $NT
  }
,
{ // state 532
0x80000000|871, // match move
0x80000000|235, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 533
172,MIN_REDUCTION+208, // $NT
  }
,
{ // state 534
0x80000000|1, // match move
0x80000000|519, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 535
91,1421, // "a"
  }
,
{ // state 536
0x80000000|1, // match move
0x80000000|607, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 537
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 538
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 539
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 540
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 541
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 542
172,MIN_REDUCTION+319, // $NT
  }
,
{ // state 543
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 544
0x80000000|1328, // match move
0x80000000|877, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 545
101,631, // "v"
  }
,
{ // state 546
172,MIN_REDUCTION+247, // $NT
  }
,
{ // state 547
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 548
0x80000000|1, // match move
0x80000000|531, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 549
0x80000000|1, // match move
0x80000000|518, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 550
0x80000000|1164, // match move
0x80000000|241, // no-match move
0x80000000|846, // NT-test-match state for dq
  }
,
{ // state 551
97,752, // "n"
  }
,
{ // state 552
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+129, // $NT
  }
,
{ // state 553
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+133, // $NT
  }
,
{ // state 554
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+356, // (default reduction)
  }
,
{ // state 555
0x80000000|636, // match move
0x80000000|708, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 556
172,MIN_REDUCTION+327, // $NT
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 557
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 558
90,1225, // "l"
  }
,
{ // state 559
2,1344, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+136, // $NT
  }
,
{ // state 560
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 561
2,1094, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 562
104,104, // "h"
  }
,
{ // state 563
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 564
0x80000000|1, // match move
0x80000000|476, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 565
2,553, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+134, // $NT
  }
,
{ // state 566
116,213, // "="
  }
,
{ // state 567
96,1216, // "o"
  }
,
{ // state 568
0x80000000|58, // match move
0x80000000|1317, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 569
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 570
172,MIN_REDUCTION+198, // $NT
  }
,
{ // state 571
94,549, // "e"
  }
,
{ // state 572
100,442, // "d"
  }
,
{ // state 573
0x80000000|1395, // match move
0x80000000|1189, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 574
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 575
3,5, // $$0
4,1130, // token
135,482, // comment
136,1067, // "/"
153,1035, // white
154,649, // " "
155,649, // {9 12}
157,192, // ds
166,840, // token*
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 576
0x80000000|1366, // match move
0x80000000|580, // no-match move
0x80000000|870, // NT-test-match state for comment_stuff
  }
,
{ // state 577
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 578
95,1341, // "b"
  }
,
{ // state 579
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 580
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 581
0x80000000|1469, // match move
0x80000000|1334, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 582
2,419, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+184, // $NT
  }
,
{ // state 583
94,218, // "e"
  }
,
{ // state 584
0x80000000|1212, // match move
0x80000000|808, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 585
0x80000000|254, // match move
0x80000000|170, // no-match move
0x80000000|123, // NT-test-match state for digit
  }
,
{ // state 586
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 587
0x80000000|770, // match move
0x80000000|300, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 588
97,305, // "n"
  }
,
{ // state 589
106,933, // "r"
  }
,
{ // state 590
0x80000000|190, // match move
0x80000000|38, // no-match move
// T-test match for 10:
164,
  }
,
{ // state 591
0x80000000|1351, // match move
0x80000000|165, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 592
106,1261, // "r"
  }
,
{ // state 593
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 594
0x80000000|1081, // match move
0x80000000|61, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 595
0x80000000|1160, // match move
0x80000000|195, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 596
94,597, // "e"
  }
,
{ // state 597
97,1033, // "n"
  }
,
{ // state 598
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 599
92,261, // "s"
  }
,
{ // state 600
2,1017, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 601
92,738, // "s"
99,1343, // "t"
  }
,
{ // state 602
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 603
2,1392, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 604
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 605
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 606
172,MIN_REDUCTION+325, // $NT
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 607
0x80000000|975, // match move
0x80000000|690, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 608
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+165, // $NT
  }
,
{ // state 609
2,997, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 610
99,227, // "t"
  }
,
{ // state 611
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 612
0x80000000|1252, // match move
0x80000000|1464, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 613
2,424, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 614
2,929, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 615
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 616
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 617
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 618
0x80000000|988, // match move
0x80000000|348, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 619
0x80000000|659, // match move
0x80000000|754, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 620
2,420, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+118, // $NT
  }
,
{ // state 621
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 622
94,1173, // "e"
  }
,
{ // state 623
0x80000000|598, // match move
0x80000000|434, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 624
136,46, // "/"
  }
,
{ // state 625
99,181, // "t"
  }
,
{ // state 626
172,MIN_REDUCTION+219, // $NT
  }
,
{ // state 627
0x80000000|1146, // match move
0x80000000|210, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 628
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+159, // $NT
  }
,
{ // state 629
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 630
4,426, // token
5,515, // `boolean
6,1468, // `class
7,569, // `extends
8,673, // `void
9,1520, // `int
10,979, // `while
11,615, // `if
12,1398, // `else
13,140, // `for
14,1154, // `break
15,1226, // `this
16,331, // `false
17,294, // `true
18,926, // `super
19,59, // `null
20,1323, // `return
21,460, // `instanceof
22,1026, // `new
23,650, // `abstract
24,245, // `assert
25,91, // `byte
26,849, // `case
27,1025, // `catch
28,976, // `char
29,111, // `const
30,523, // `continue
31,1029, // `default
32,1140, // `do
33,1232, // `double
34,1308, // `enum
35,699, // `final
36,1313, // `finally
37,1508, // `float
38,429, // `goto
39,134, // `implements
40,700, // `import
41,1076, // `interface
42,478, // `long
43,779, // `native
44,346, // `package
45,251, // `private
46,1348, // `protected
47,678, // `public
48,125, // `short
49,42, // `static
50,524, // `strictfp
51,756, // `switch
52,837, // `synchronized
53,1178, // `throw
54,1279, // `throws
55,323, // `transient
56,543, // `try
57,940, // `volatile
89,45, // "c"
90,440, // "l"
91,1461, // "a"
92,199, // "s"
94,421, // "e"
95,448, // "b"
97,309, // "n"
99,102, // "t"
100,737, // "d"
101,766, // "v"
102,422, // "i"
103,1404, // "w"
105,641, // "f"
106,882, // "r"
109,790, // "p"
112,943, // "g"
MIN_REDUCTION+355, // (default reduction)
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
{ // state 631
94,203, // "e"
  }
,
{ // state 632
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+179, // $NT
  }
,
{ // state 633
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 634
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 635
110,990, // "y"
  }
,
{ // state 636
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 637
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 638
91,1333, // "a"
106,968, // "r"
  }
,
{ // state 639
99,1491, // "t"
  }
,
{ // state 640
121,153, // "*"
  }
,
{ // state 641
90,567, // "l"
91,324, // "a"
96,1350, // "o"
102,208, // "i"
  }
,
{ // state 642
2,555, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 643
96,221, // "o"
  }
,
{ // state 644
94,1310, // "e"
  }
,
{ // state 645
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 646
89,805, // "c"
90,805, // "l"
91,805, // "a"
92,805, // "s"
94,805, // "e"
95,805, // "b"
96,805, // "o"
97,805, // "n"
98,805, // "x"
99,805, // "t"
100,805, // "d"
101,805, // "v"
102,805, // "i"
103,805, // "w"
104,805, // "h"
105,805, // "f"
106,805, // "r"
107,805, // "k"
108,805, // "u"
109,805, // "p"
110,805, // "y"
111,805, // "m"
112,805, // "g"
113,805, // "z"
115,805, // "!"
116,805, // "="
117,805, // "<"
118,805, // ">"
119,805, // "+"
120,805, // "-"
121,805, // "*"
122,805, // "%"
123,805, // "&"
124,805, // "("
125,805, // ")"
126,805, // "{"
127,805, // "}"
128,805, // "["
129,805, // "]"
130,805, // "|"
131,805, // "."
132,805, // ","
133,805, // ":"
134,805, // ";"
136,805, // "/"
142,805, // '"'
144,706, // printable
148,805, // "'"
150,805, // "_"
151,805, // {"A".."Z" "j" "q"}
152,805, // {"0".."9"}
154,805, // " "
158,447, // printable**
163,805, // {"#".."$" "?".."@" "\" "^" "`" "~"}
167,1104, // printable*
  }
,
{ // state 647
2,896, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 648
94,1524, // "e"
  }
,
{ // state 649
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 650
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 651
2,1137, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 652
0x80000000|1297, // match move
0x80000000|390, // no-match move
// T-test match for 10:
164,
  }
,
{ // state 653
158,96, // printable**
167,1325, // printable*
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 654
108,159, // "u"
  }
,
{ // state 655
2,156, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 656
2,1086, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 657
0x80000000|1446, // match move
0x80000000|1349, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 658
90,369, // "l"
  }
,
{ // state 659
90,1240, // "l"
  }
,
{ // state 660
89,1223, // "c"
90,1223, // "l"
91,1223, // "a"
92,1223, // "s"
94,1223, // "e"
95,1223, // "b"
96,1223, // "o"
97,1223, // "n"
98,1223, // "x"
99,1223, // "t"
100,1223, // "d"
101,1223, // "v"
102,1223, // "i"
103,1223, // "w"
104,1223, // "h"
105,1223, // "f"
106,1223, // "r"
107,1223, // "k"
108,1223, // "u"
109,1223, // "p"
110,1223, // "y"
111,1223, // "m"
112,1223, // "g"
113,1223, // "z"
115,1223, // "!"
116,1223, // "="
117,1223, // "<"
118,1223, // ">"
119,1223, // "+"
120,1223, // "-"
121,1223, // "*"
122,1223, // "%"
123,1223, // "&"
124,1223, // "("
125,1223, // ")"
126,1223, // "{"
127,1223, // "}"
128,1223, // "["
129,1223, // "]"
130,1223, // "|"
131,1223, // "."
132,1223, // ","
133,1223, // ":"
134,1223, // ";"
136,1223, // "/"
142,1223, // '"'
143,303, // stringChar
144,604, // printable
145,550, // stringChar*
146,1382, // $$1
148,1223, // "'"
150,1223, // "_"
151,1223, // {"A".."Z" "j" "q"}
152,1223, // {"0".."9"}
154,1223, // " "
163,1223, // {"#".."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 661
0x80000000|201, // match move
0x80000000|80, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 662
96,1435, // "o"
  }
,
{ // state 663
102,1180, // "i"
  }
,
{ // state 664
112,898, // "g"
  }
,
{ // state 665
94,1172, // "e"
  }
,
{ // state 666
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+119, // $NT
  }
,
{ // state 667
2,1436, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+138, // $NT
  }
,
{ // state 668
0x80000000|913, // match move
0x80000000|1157, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 669
0x80000000|1, // match move
0x80000000|686, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 670
2,798, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 671
89,893, // "c"
  }
,
{ // state 672
94,39, // "e"
  }
,
{ // state 673
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 674
103,286, // "w"
  }
,
{ // state 675
172,MIN_REDUCTION+199, // $NT
  }
,
{ // state 676
172,MIN_REDUCTION+241, // $NT
  }
,
{ // state 677
99,1201, // "t"
  }
,
{ // state 678
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 679
94,872, // "e"
  }
,
{ // state 680
172,MIN_REDUCTION+196, // $NT
  }
,
{ // state 681
97,16, // "n"
  }
,
{ // state 682
92,848, // "s"
  }
,
{ // state 683
149,875, // digit
152,585, // {"0".."9"}
  }
,
{ // state 684
0x80000000|89, // match move
0x80000000|1498, // no-match move
0x80000000|47, // NT-test-match state for printable
  }
,
{ // state 685
94,1018, // "e"
  }
,
{ // state 686
0x80000000|3, // match move
0x80000000|1285, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 687
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+163, // $NT
  }
,
{ // state 688
2,813, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 689
172,MIN_REDUCTION+234, // $NT
  }
,
{ // state 690
2,1036, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 691
94,82, // "e"
  }
,
{ // state 692
107,923, // "k"
  }
,
{ // state 693
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 694
99,1048, // "t"
  }
,
{ // state 695
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 696
96,1418, // "o"
  }
,
{ // state 697
0x80000000|296, // match move
0x80000000|876, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 698
107,149, // "k"
  }
,
{ // state 699
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 700
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 701
99,638, // "t"
103,333, // "w"
104,1107, // "h"
108,1088, // "u"
110,402, // "y"
  }
,
{ // state 702
0x80000000|554, // match move
0x80000000|393, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 703
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 704
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 705
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 706
0x80000000|1007, // match move
0x80000000|1292, // no-match move
0x80000000|47, // NT-test-match state for printable
  }
,
{ // state 707
99,81, // "t"
  }
,
{ // state 708
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 709
0x80000000|1, // match move
0x80000000|728, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 710
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+155, // $NT
  }
,
{ // state 711
2,894, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 712
91,1300, // "a"
  }
,
{ // state 713
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 714
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 715
172,MIN_REDUCTION+330, // $NT
  }
,
{ // state 716
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 717
0x80000000|538, // match move
0x80000000|298, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 718
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 719
92,217, // "s"
  }
,
{ // state 720
0x80000000|1, // match move
0x80000000|667, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 721
164,517, // {10}
  }
,
{ // state 722
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 723
2,415, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+152, // $NT
  }
,
{ // state 724
0x80000000|1, // match move
0x80000000|389, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 725
102,1202, // "i"
  }
,
{ // state 726
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 727
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 728
2,1407, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+168, // $NT
  }
,
{ // state 729
0x80000000|772, // match move
0x80000000|198, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 730
0x80000000|1, // match move
0x80000000|723, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 731
2,1205, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 732
106,147, // "r"
  }
,
{ // state 733
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 734
2,612, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 735
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+111, // $NT
  }
,
{ // state 736
2,1368, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 737
94,1376, // "e"
96,994, // "o"
  }
,
{ // state 738
99,1147, // "t"
  }
,
{ // state 739
0x80000000|1162, // match move
0x80000000|136, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 740
97,268, // "n"
  }
,
{ // state 741
0x80000000|774, // match move
0x80000000|240, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 742
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+115, // $NT
  }
,
{ // state 743
97,1069, // "n"
  }
,
{ // state 744
0x80000000|1450, // match move
0x80000000|828, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 745
91,64, // "a"
  }
,
{ // state 746
112,1006, // "g"
  }
,
{ // state 747
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+139, // $NT
  }
,
{ // state 748
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 749
97,1397, // "n"
  }
,
{ // state 750
97,1390, // "n"
  }
,
{ // state 751
99,1471, // "t"
  }
,
{ // state 752
102,1483, // "i"
  }
,
{ // state 753
2,1302, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 754
2,253, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+150, // $NT
  }
,
{ // state 755
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 756
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 757
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 758
0x80000000|1262, // match move
0x80000000|768, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 759
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 760
97,505, // "n"
  }
,
{ // state 761
0x80000000|1, // match move
0x80000000|1455, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 762
141,469, // dq
142,1339, // '"'
145,550, // stringChar*
146,1382, // $$1
  }
,
{ // state 763
105,712, // "f"
  }
,
{ // state 764
0x80000000|89, // match move
0x80000000|1073, // no-match move
0x80000000|47, // NT-test-match state for printable
  }
,
{ // state 765
172,MIN_REDUCTION+238, // $NT
  }
,
{ // state 766
96,1061, // "o"
  }
,
{ // state 767
0x80000000|964, // match move
0x80000000|315, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 768
2,618, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 769
0x80000000|1, // match move
0x80000000|1062, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 770
2,627, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 771
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 772
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 773
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 774
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 775
100,911, // "d"
  }
,
{ // state 776
0x80000000|362, // match move
0x80000000|867, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 777
0x80000000|1521, // match move
0x80000000|1110, // no-match move
0x80000000|870, // NT-test-match state for comment_stuff
  }
,
{ // state 778
102,545, // "i"
  }
,
{ // state 779
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 780
121,1345, // "*"
  }
,
{ // state 781
2,312, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 782
2,666, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+120, // $NT
  }
,
{ // state 783
89,279, // "c"
  }
,
{ // state 784
95,658, // "b"
  }
,
{ // state 785
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 786
2,132, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 787
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 788
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 789
108,784, // "u"
  }
,
{ // state 790
91,1448, // "a"
106,1299, // "r"
108,578, // "u"
  }
,
{ // state 791
99,375, // "t"
  }
,
{ // state 792
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 793
0x80000000|282, // match move
0x80000000|1431, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 794
0x80000000|326, // match move
0x80000000|127, // no-match move
// T-test match for 10:
164,
  }
,
{ // state 795
119,242, // "+"
  }
,
{ // state 796
2,452, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 797
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 798
0x80000000|62, // match move
0x80000000|748, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 799
0x80000000|1, // match move
0x80000000|1274, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 800
91,397, // "a"
  }
,
{ // state 801
2,267, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 802
2,2, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 803
94,105, // "e"
  }
,
{ // state 804
0x80000000|527, // match move
0x80000000|175, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 805
0x80000000|895, // match move
0x80000000|7, // no-match move
0x80000000|47, // NT-test-match state for printable
  }
,
{ // state 806
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 807
2,183, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 808
2,19, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 809
89,1142, // "c"
90,1142, // "l"
91,1142, // "a"
92,1142, // "s"
93,1391, // idChar
94,1142, // "e"
95,1142, // "b"
96,1142, // "o"
97,1142, // "n"
98,1142, // "x"
99,1142, // "t"
100,1142, // "d"
101,1142, // "v"
102,1142, // "i"
103,1142, // "w"
104,1142, // "h"
105,1142, // "f"
106,1142, // "r"
107,1142, // "k"
108,1142, // "u"
109,1142, // "p"
110,1142, // "y"
111,1142, // "m"
112,1142, // "g"
113,1142, // "z"
138,825, // letter
149,504, // digit
150,464, // "_"
151,1142, // {"A".."Z" "j" "q"}
152,767, // {"0".."9"}
  }
,
{ // state 810
91,66, // "a"
  }
,
{ // state 811
5,97, // `boolean
6,239, // `class
7,570, // `extends
8,675, // `void
9,1374, // `int
10,1253, // `while
11,1268, // `if
12,680, // `else
13,88, // `for
14,44, // `break
15,32, // `this
16,1311, // `false
17,901, // `true
18,533, // `super
19,907, // `null
20,1050, // `return
21,1206, // `instanceof
22,1500, // `new
23,958, // `abstract
24,873, // `assert
25,1327, // `byte
26,392, // `case
27,1487, // `catch
28,1386, // `char
29,626, // `const
30,184, // `continue
31,910, // `default
32,512, // `do
33,225, // `double
34,1111, // `enum
35,360, // `final
36,371, // `finally
37,381, // `float
38,1480, // `goto
39,812, // `implements
40,168, // `import
41,1181, // `interface
42,1000, // `long
43,56, // `native
44,689, // `package
45,301, // `private
46,1236, // `protected
47,128, // `public
48,765, // `short
49,11, // `static
50,946, // `strictfp
51,676, // `switch
52,1296, // `synchronized
53,1133, // `throw
54,1465, // `throws
55,494, // `transient
56,1315, // `try
57,546, // `volatile
89,28, // "c"
90,287, // "l"
91,1209, // "a"
92,701, // "s"
94,366, // "e"
95,229, // "b"
97,815, // "n"
99,818, // "t"
100,1014, // "d"
101,386, // "v"
102,216, // "i"
103,491, // "w"
105,1497, // "f"
106,1237, // "r"
109,391, // "p"
112,1027, // "g"
  }
,
{ // state 812
172,MIN_REDUCTION+229, // $NT
  }
,
{ // state 813
0x80000000|1420, // match move
0x80000000|1522, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 814
0x80000000|1, // match move
0x80000000|1364, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 815
91,1186, // "a"
94,1516, // "e"
108,171, // "u"
  }
,
{ // state 816
2,1388, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 817
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 818
104,1330, // "h"
106,1429, // "r"
  }
,
{ // state 819
109,1402, // "p"
  }
,
{ // state 820
0x80000000|1174, // match move
0x80000000|1090, // no-match move
0x80000000|870, // NT-test-match state for comment_stuff
  }
,
{ // state 821
99,1116, // "t"
  }
,
{ // state 822
0x80000000|809, // match move
0x80000000|431, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 823
0x80000000|1354, // match move
0x80000000|403, // no-match move
0x80000000|811, // NT-test-match state for reserved
  }
,
{ // state 824
0x80000000|1424, // match move
0x80000000|93, // no-match move
0x80000000|870, // NT-test-match state for comment_stuff
  }
,
{ // state 825
0x80000000|1131, // match move
0x80000000|1476, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 826
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 827
121,113, // "*"
136,1517, // "/"
  }
,
{ // state 828
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 829
99,1321, // "t"
  }
,
{ // state 830
90,55, // "l"
  }
,
{ // state 831
97,1045, // "n"
  }
,
{ // state 832
123,1129, // "&"
  }
,
{ // state 833
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 834
2,424, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 835
0x80000000|579, // match move
0x80000000|621, // no-match move
0x80000000|870, // NT-test-match state for comment_stuff
  }
,
{ // state 836
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 837
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 838
106,1163, // "r"
  }
,
{ // state 839
0x80000000|1, // match move
0x80000000|591, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 840
0x80000000|209, // match move
0x80000000|1318, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 841
2,349, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 842
89,1403, // "c"
90,1403, // "l"
91,1403, // "a"
92,1403, // "s"
94,1403, // "e"
95,1403, // "b"
96,1403, // "o"
97,1403, // "n"
98,1403, // "x"
99,1403, // "t"
100,1403, // "d"
101,1403, // "v"
102,1403, // "i"
103,1403, // "w"
104,1403, // "h"
105,1403, // "f"
106,1403, // "r"
107,1403, // "k"
108,1403, // "u"
109,1403, // "p"
110,1403, // "y"
111,1403, // "m"
112,1403, // "g"
113,1403, // "z"
115,1403, // "!"
116,1403, // "="
117,1403, // "<"
118,1403, // ">"
119,1403, // "+"
120,1403, // "-"
121,1403, // "*"
122,1403, // "%"
123,1403, // "&"
124,1403, // "("
125,1403, // ")"
126,1403, // "{"
127,1403, // "}"
128,1403, // "["
129,1403, // "]"
130,1403, // "|"
131,1403, // "."
132,1403, // ","
133,1403, // ":"
134,1403, // ";"
136,1403, // "/"
142,1403, // '"'
144,144, // printable
148,1403, // "'"
150,1403, // "_"
151,1403, // {"A".."Z" "j" "q"}
152,1403, // {"0".."9"}
154,1403, // " "
163,1403, // {"#".."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 843
2,306, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 844
101,1408, // "v"
  }
,
{ // state 845
0x80000000|817, // match move
0x80000000|416, // no-match move
0x80000000|47, // NT-test-match state for printable
  }
,
{ // state 846
142,1331, // '"'
  }
,
{ // state 847
92,725, // "s"
  }
,
{ // state 848
0x80000000|1, // match move
0x80000000|1291, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 849
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 850
0x80000000|1021, // match move
0x80000000|63, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 851
MIN_REDUCTION+353, // (default reduction)
  }
,
{ // state 852
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 853
172,MIN_REDUCTION+326, // $NT
  }
,
{ // state 854
89,1192, // "c"
  }
,
{ // state 855
92,376, // "s"
99,1473, // "t"
  }
,
{ // state 856
171,MIN_REDUCTION+0, // $
  }
,
{ // state 857
0x80000000|87, // match move
0x80000000|423, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 858
92,874, // "s"
99,1103, // "t"
  }
,
{ // state 859
0x80000000|1347, // match move
0x80000000|1415, // no-match move
0x80000000|47, // NT-test-match state for printable
  }
,
{ // state 860
2,1316, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+172, // $NT
  }
,
{ // state 861
2,885, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 862
0x80000000|736, // match move
0x80000000|1124, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 863
0x80000000|490, // match move
0x80000000|158, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 864
0x80000000|563, // match move
0x80000000|759, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 865
92,1526, // "s"
  }
,
{ // state 866
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 867
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 868
0x80000000|566, // match move
0x80000000|668, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 869
2,1197, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 870
89,1287, // "c"
90,1287, // "l"
91,1287, // "a"
92,1287, // "s"
94,1287, // "e"
95,1287, // "b"
96,1287, // "o"
97,1287, // "n"
98,1287, // "x"
99,1287, // "t"
100,1287, // "d"
101,1287, // "v"
102,1287, // "i"
103,1287, // "w"
104,1287, // "h"
105,1287, // "f"
106,1287, // "r"
107,1287, // "k"
108,1287, // "u"
109,1287, // "p"
110,1287, // "y"
111,1287, // "m"
112,1287, // "g"
113,1287, // "z"
115,1287, // "!"
116,1287, // "="
117,1287, // "<"
118,1287, // ">"
119,1287, // "+"
120,1287, // "-"
121,1338, // "*"
122,1287, // "%"
123,1287, // "&"
124,1287, // "("
125,1287, // ")"
126,1287, // "{"
127,1287, // "}"
128,1287, // "["
129,1287, // "]"
130,1287, // "|"
131,1287, // "."
132,1287, // ","
133,1287, // ":"
134,1287, // ";"
136,1287, // "/"
142,1287, // '"'
148,1287, // "'"
150,1287, // "_"
151,1287, // {"A".."Z" "j" "q"}
152,1287, // {"0".."9"}
154,1287, // " "
156,205, // eol
161,1329, // star_slash
162,715, // comment_printable
163,1287, // {"#".."$" "?".."@" "\" "^" "`" "~"}
164,1005, // {10}
165,1039, // {13}
  }
,
{ // state 871
2,95, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 872
0x80000000|1, // match move
0x80000000|507, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 873
172,MIN_REDUCTION+214, // $NT
  }
,
{ // state 874
99,188, // "t"
  }
,
{ // state 875
0x80000000|1055, // match move
0x80000000|897, // no-match move
0x80000000|123, // NT-test-match state for digit
  }
,
{ // state 876
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 877
2,595, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 878
89,428, // "c"
90,428, // "l"
91,428, // "a"
92,428, // "s"
94,428, // "e"
95,428, // "b"
96,428, // "o"
97,428, // "n"
98,428, // "x"
99,428, // "t"
100,428, // "d"
101,428, // "v"
102,428, // "i"
103,428, // "w"
104,428, // "h"
105,428, // "f"
106,428, // "r"
107,428, // "k"
108,428, // "u"
109,428, // "p"
110,428, // "y"
111,428, // "m"
112,428, // "g"
113,428, // "z"
115,428, // "!"
116,428, // "="
117,428, // "<"
118,428, // ">"
119,428, // "+"
120,428, // "-"
121,914, // "*"
122,428, // "%"
123,428, // "&"
124,428, // "("
125,428, // ")"
126,428, // "{"
127,428, // "}"
128,428, // "["
129,428, // "]"
130,428, // "|"
131,428, // "."
132,428, // ","
133,428, // ":"
134,428, // ";"
136,428, // "/"
142,428, // '"'
148,428, // "'"
150,428, // "_"
151,428, // {"A".."Z" "j" "q"}
152,428, // {"0".."9"}
154,428, // " "
156,1068, // eol
160,484, // comment_stuff
161,1492, // star_slash
162,1479, // comment_printable
163,428, // {"#".."$" "?".."@" "\" "^" "`" "~"}
164,576, // {10}
165,1168, // {13}
  }
,
{ // state 879
0x80000000|1458, // match move
0x80000000|936, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 880
94,1217, // "e"
  }
,
{ // state 881
0x80000000|1372, // match move
0x80000000|757, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 882
94,191, // "e"
  }
,
{ // state 883
0x80000000|683, // match move
0x80000000|695, // no-match move
0x80000000|123, // NT-test-match state for digit
  }
,
{ // state 884
0x80000000|1, // match move
0x80000000|559, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 885
0x80000000|189, // match move
0x80000000|1152, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 886
106,884, // "r"
  }
,
{ // state 887
MIN_REDUCTION+345, // (default reduction)
  }
,
{ // state 888
0x80000000|1, // match move
0x80000000|1346, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 889
112,1229, // "g"
  }
,
{ // state 890
92,1462, // "s"
  }
,
{ // state 891
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+131, // $NT
  }
,
{ // state 892
0x80000000|948, // match move
0x80000000|17, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 893
0x80000000|1, // match move
0x80000000|900, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 894
0x80000000|1175, // match move
0x80000000|1400, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 895
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 896
0x80000000|73, // match move
0x80000000|912, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 897
MIN_REDUCTION+348, // (default reduction)
  }
,
{ // state 898
0x80000000|1, // match move
0x80000000|532, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 899
2,1383, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 900
2,450, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+178, // $NT
  }
,
{ // state 901
172,MIN_REDUCTION+207, // $NT
  }
,
{ // state 902
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 903
99,1503, // "t"
  }
,
{ // state 904
0x80000000|193, // match move
0x80000000|399, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 905
2,1362, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 906
2,94, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 907
172,MIN_REDUCTION+209, // $NT
  }
,
{ // state 908
2,161, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 909
0x80000000|1165, // match move
0x80000000|1122, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 910
172,MIN_REDUCTION+221, // $NT
  }
,
{ // state 911
0x80000000|1, // match move
0x80000000|932, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 912
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 913
2,1199, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 914
0x80000000|1, // match move
0x80000000|938, // no-match move
// T-test match for "/":
136,
  }
,
{ // state 915
113,329, // "z"
  }
,
{ // state 916
91,1453, // "a"
  }
,
{ // state 917
90,661, // "l"
  }
,
{ // state 918
2,1430, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 919
2,1336, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 920
92,691, // "s"
  }
,
{ // state 921
158,447, // printable**
167,1104, // printable*
172,MIN_REDUCTION+324, // $NT
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 922
94,12, // "e"
  }
,
{ // state 923
0x80000000|1, // match move
0x80000000|850, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 924
0x80000000|477, // match move
0x80000000|238, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 925
94,662, // "e"
  }
,
{ // state 926
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 927
2,1335, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 928
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 929
0x80000000|1203, // match move
0x80000000|1128, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 930
92,1218, // "s"
  }
,
{ // state 931
0x80000000|1, // match move
0x80000000|1277, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 932
2,1059, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+98, // $NT
  }
,
{ // state 933
97,1112, // "n"
  }
,
{ // state 934
0x80000000|1191, // match move
0x80000000|843, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 935
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 936
2,657, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 937
2,1137, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 938
0x80000000|1003, // match move
0x80000000|276, // no-match move
0x80000000|870, // NT-test-match state for comment_stuff
  }
,
{ // state 939
2,1011, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 940
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 941
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+113, // $NT
  }
,
{ // state 942
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 943
96,1342, // "o"
  }
,
{ // state 944
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 945
0x80000000|1, // match move
0x80000000|378, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 946
172,MIN_REDUCTION+240, // $NT
  }
,
{ // state 947
111,1304, // "m"
  }
,
{ // state 948
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 949
172,MIN_REDUCTION+336, // $NT
  }
,
{ // state 950
0x80000000|1, // match move
0x80000000|1060, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 951
2,1047, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+126, // $NT
  }
,
{ // state 952
0x80000000|1, // match move
0x80000000|793, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 953
2,1235, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+144, // $NT
  }
,
{ // state 954
92,200, // "s"
99,289, // "t"
  }
,
{ // state 955
112,302, // "g"
  }
,
{ // state 956
2,687, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+164, // $NT
  }
,
{ // state 957
0x80000000|1394, // match move
0x80000000|1234, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 958
172,MIN_REDUCTION+213, // $NT
  }
,
{ // state 959
0x80000000|1, // match move
0x80000000|909, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 960
MIN_REDUCTION+352, // (default reduction)
  }
,
{ // state 961
0x80000000|1506, // match move
0x80000000|106, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 962
2,1056, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+96, // $NT
  }
,
{ // state 963
0x80000000|1, // match move
0x80000000|1233, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 964
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 965
2,971, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+194, // $NT
  }
,
{ // state 966
2,892, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 967
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 968
102,1410, // "i"
  }
,
{ // state 969
91,526, // "a"
  }
,
{ // state 970
2,1414, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 971
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+193, // $NT
  }
,
{ // state 972
0x80000000|895, // match move
0x80000000|967, // no-match move
0x80000000|47, // NT-test-match state for printable
  }
,
{ // state 973
2,612, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 974
139,MIN_REDUCTION+318, // idChar**
150,MIN_REDUCTION+318, // "_"
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 975
2,1036, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 976
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 977
106,117, // "r"
  }
,
{ // state 978
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 979
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 980
0x80000000|1, // match move
0x80000000|863, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 981
172,MIN_REDUCTION+326, // $NT
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 982
90,1515, // "l"
  }
,
{ // state 983
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 984
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 985
2,710, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+156, // $NT
  }
,
{ // state 986
89,972, // "c"
90,972, // "l"
91,972, // "a"
92,972, // "s"
94,972, // "e"
95,972, // "b"
96,972, // "o"
97,972, // "n"
98,972, // "x"
99,972, // "t"
100,972, // "d"
101,972, // "v"
102,972, // "i"
103,972, // "w"
104,972, // "h"
105,972, // "f"
106,972, // "r"
107,972, // "k"
108,972, // "u"
109,972, // "p"
110,972, // "y"
111,972, // "m"
112,972, // "g"
113,972, // "z"
115,972, // "!"
116,972, // "="
117,972, // "<"
118,972, // ">"
119,972, // "+"
120,972, // "-"
121,972, // "*"
122,972, // "%"
123,972, // "&"
124,972, // "("
125,972, // ")"
126,972, // "{"
127,972, // "}"
128,972, // "["
129,972, // "]"
130,972, // "|"
131,972, // "."
132,972, // ","
133,972, // ":"
134,972, // ";"
136,972, // "/"
142,972, // '"'
144,1084, // printable
148,972, // "'"
150,972, // "_"
151,972, // {"A".."Z" "j" "q"}
152,972, // {"0".."9"}
154,972, // " "
158,96, // printable**
163,972, // {"#".."$" "?".."@" "\" "^" "`" "~"}
167,1325, // printable*
  }
,
{ // state 987
103,839, // "w"
  }
,
{ // state 988
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 989
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 990
0x80000000|1, // match move
0x80000000|1043, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 991
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 992
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 993
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 994
0x80000000|14, // match move
0x80000000|445, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 995
0x80000000|1007, // match move
0x80000000|1213, // no-match move
0x80000000|47, // NT-test-match state for printable
  }
,
{ // state 996
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 997
0x80000000|978, // match move
0x80000000|1171, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 998
2,717, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 999
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 1000
172,MIN_REDUCTION+232, // $NT
  }
,
{ // state 1001
2,929, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 1002
0x80000000|411, // match move
0x80000000|899, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1003
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 1004
94,980, // "e"
  }
,
{ // state 1005
172,MIN_REDUCTION+333, // $NT
  }
,
{ // state 1006
94,709, // "e"
  }
,
{ // state 1007
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 1008
94,1501, // "e"
  }
,
{ // state 1009
2,555, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 1010
97,336, // "n"
  }
,
{ // state 1011
0x80000000|1187, // match move
0x80000000|1514, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1012
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 1013
89,571, // "c"
  }
,
{ // state 1014
94,1046, // "e"
96,1065, // "o"
  }
,
{ // state 1015
94,151, // "e"
  }
,
{ // state 1016
2,961, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 1017
0x80000000|356, // match move
0x80000000|992, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1018
97,1365, // "n"
  }
,
{ // state 1019
90,1504, // "l"
  }
,
{ // state 1020
89,35, // "c"
  }
,
{ // state 1021
2,568, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 1022
89,1075, // "c"
90,1075, // "l"
91,1075, // "a"
92,1075, // "s"
94,1075, // "e"
95,1075, // "b"
96,1075, // "o"
97,1075, // "n"
98,1075, // "x"
99,1075, // "t"
100,1075, // "d"
101,1075, // "v"
102,1075, // "i"
103,1075, // "w"
104,1075, // "h"
105,1075, // "f"
106,1075, // "r"
107,1075, // "k"
108,1075, // "u"
109,1075, // "p"
110,1075, // "y"
111,1075, // "m"
112,1075, // "g"
113,1075, // "z"
115,1075, // "!"
116,1075, // "="
117,1075, // "<"
118,1075, // ">"
119,1075, // "+"
120,1075, // "-"
121,1075, // "*"
122,1075, // "%"
123,1075, // "&"
124,1075, // "("
125,1075, // ")"
126,1075, // "{"
127,1075, // "}"
128,1075, // "["
129,1075, // "]"
130,1075, // "|"
131,1075, // "."
132,1075, // ","
133,1075, // ":"
134,1075, // ";"
136,1075, // "/"
142,1075, // '"'
144,489, // printable
148,1075, // "'"
150,1075, // "_"
151,1075, // {"A".."Z" "j" "q"}
152,1075, // {"0".."9"}
154,1075, // " "
163,1075, // {"#".."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 1023
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+101, // $NT
  }
,
{ // state 1024
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 1025
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 1026
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 1027
96,625, // "o"
  }
,
{ // state 1028
2,1094, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 1029
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 1030
99,30, // "t"
  }
,
{ // state 1031
2,321, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 1032
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+189, // $NT
  }
,
{ // state 1033
99,1490, // "t"
  }
,
{ // state 1034
2,628, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+160, // $NT
  }
,
{ // state 1035
MIN_REDUCTION+345, // (default reduction)
  }
,
{ // state 1036
0x80000000|637, // match move
0x80000000|537, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1037
0x80000000|895, // match move
0x80000000|1012, // no-match move
0x80000000|47, // NT-test-match state for printable
  }
,
{ // state 1038
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 1039
0x80000000|54, // match move
0x80000000|418, // no-match move
// T-test match for 10:
164,
  }
,
{ // state 1040
97,1151, // "n"
  }
,
{ // state 1041
2,384, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 1042
0x80000000|1, // match move
0x80000000|345, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 1043
0x80000000|796, // match move
0x80000000|454, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1044
172,MIN_REDUCTION+325, // $NT
  }
,
{ // state 1045
0x80000000|1, // match move
0x80000000|270, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 1046
105,745, // "f"
  }
,
{ // state 1047
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+125, // $NT
  }
,
{ // state 1048
0x80000000|1, // match move
0x80000000|1121, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 1049
2,744, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 1050
172,MIN_REDUCTION+210, // $NT
  }
,
{ // state 1051
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 1052
172,MIN_REDUCTION+333, // $NT
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 1053
109,265, // "p"
  }
,
{ // state 1054
0x80000000|878, // match move
0x80000000|1474, // no-match move
0x80000000|870, // NT-test-match state for comment_stuff
  }
,
{ // state 1055
MIN_REDUCTION+348, // (default reduction)
  }
,
{ // state 1056
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+95, // $NT
  }
,
{ // state 1057
2,1158, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 1058
0x80000000|1, // match move
0x80000000|985, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 1059
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+97, // $NT
  }
,
{ // state 1060
2,747, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+140, // $NT
  }
,
{ // state 1061
90,237, // "l"
102,368, // "i"
  }
,
{ // state 1062
2,327, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+174, // $NT
  }
,
{ // state 1063
0x80000000|1472, // match move
0x80000000|1486, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1064
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 1065
0x80000000|789, // match move
0x80000000|953, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 1066
2,325, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 1067
121,169, // "*"
136,845, // "/"
  }
,
{ // state 1068
0x80000000|1278, // match move
0x80000000|852, // no-match move
0x80000000|870, // NT-test-match state for comment_stuff
  }
,
{ // state 1069
89,1156, // "c"
  }
,
{ // state 1070
0x80000000|1, // match move
0x80000000|951, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 1071
108,1320, // "u"
  }
,
{ // state 1072
0x80000000|1, // match move
0x80000000|443, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 1073
172,MIN_REDUCTION+349, // $NT
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 1074
91,707, // "a"
  }
,
{ // state 1075
0x80000000|895, // match move
0x80000000|949, // no-match move
0x80000000|47, // NT-test-match state for printable
  }
,
{ // state 1076
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 1077
0x80000000|1, // match move
0x80000000|962, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 1078
2,1032, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+190, // $NT
  }
,
{ // state 1079
0x80000000|182, // match move
0x80000000|1510, // no-match move
0x80000000|811, // NT-test-match state for reserved
  }
,
{ // state 1080
0x80000000|1001, // match move
0x80000000|614, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1081
2,180, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 1082
0x80000000|466, // match move
0x80000000|467, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1083
99,177, // "t"
  }
,
{ // state 1084
0x80000000|1007, // match move
0x80000000|465, // no-match move
0x80000000|47, // NT-test-match state for printable
  }
,
{ // state 1085
2,864, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 1086
0x80000000|771, // match move
0x80000000|645, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1087
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 1088
109,672, // "p"
  }
,
{ // state 1089
108,288, // "u"
  }
,
{ // state 1090
MIN_REDUCTION+354, // (default reduction)
  }
,
{ // state 1091
91,1399, // "a"
  }
,
{ // state 1092
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+127, // $NT
  }
,
{ // state 1093
91,71, // "a"
108,511, // "u"
110,945, // "y"
  }
,
{ // state 1094
0x80000000|244, // match move
0x80000000|928, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1095
0x80000000|1, // match move
0x80000000|313, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 1096
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 1097
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 1098
0x80000000|762, // match move
0x80000000|660, // no-match move
0x80000000|846, // NT-test-match state for dq
  }
,
{ // state 1099
0x80000000|219, // match move
0x80000000|1080, // no-match move
// T-test match for "-":
120,
  }
,
{ // state 1100
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1101
172,MIN_REDUCTION+323, // $NT
  }
,
{ // state 1102
2,1205, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 1103
0x80000000|1179, // match move
0x80000000|1109, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 1104
0x80000000|122, // match move
0x80000000|197, // no-match move
0x80000000|47, // NT-test-match state for printable
  }
,
{ // state 1105
0x80000000|781, // match move
0x80000000|1306, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1106
99,269, // "t"
  }
,
{ // state 1107
96,1484, // "o"
  }
,
{ // state 1108
97,654, // "n"
  }
,
{ // state 1109
2,1494, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+100, // $NT
  }
,
{ // state 1110
121,1207, // "*"
159,1371, // comment_stuff**
170,1054, // comment_stuff*
  }
,
{ // state 1111
172,MIN_REDUCTION+224, // $NT
  }
,
{ // state 1112
0x80000000|1, // match move
0x80000000|782, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 1113
89,1037, // "c"
90,1037, // "l"
91,1037, // "a"
92,1037, // "s"
94,1037, // "e"
95,1037, // "b"
96,1037, // "o"
97,1037, // "n"
98,1037, // "x"
99,1037, // "t"
100,1037, // "d"
101,1037, // "v"
102,1037, // "i"
103,1037, // "w"
104,1037, // "h"
105,1037, // "f"
106,1037, // "r"
107,1037, // "k"
108,1037, // "u"
109,1037, // "p"
110,1037, // "y"
111,1037, // "m"
112,1037, // "g"
113,1037, // "z"
115,1037, // "!"
116,1037, // "="
117,1037, // "<"
118,1037, // ">"
119,1037, // "+"
120,1037, // "-"
121,1037, // "*"
122,1037, // "%"
123,1037, // "&"
124,1037, // "("
125,1037, // ")"
126,1037, // "{"
127,1037, // "}"
128,1037, // "["
129,1037, // "]"
130,1037, // "|"
131,1037, // "."
132,1037, // ","
133,1037, // ":"
134,1037, // ";"
136,1037, // "/"
142,1037, // '"'
144,995, // printable
148,1037, // "'"
150,1037, // "_"
151,1037, // {"A".."Z" "j" "q"}
152,1037, // {"0".."9"}
154,1037, // " "
158,370, // printable**
163,1037, // {"#".."$" "?".."@" "\" "^" "`" "~"}
167,859, // printable*
  }
,
{ // state 1114
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 1115
92,514, // "s"
  }
,
{ // state 1116
0x80000000|1, // match move
0x80000000|1034, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 1117
0x80000000|656, // match move
0x80000000|15, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1118
0x80000000|1, // match move
0x80000000|1117, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 1119
106,9, // "r"
  }
,
{ // state 1120
89,829, // "c"
  }
,
{ // state 1121
0x80000000|906, // match move
0x80000000|174, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1122
2,1214, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 1123
2,50, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 1124
2,1368, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 1125
89,972, // "c"
90,972, // "l"
91,972, // "a"
92,972, // "s"
94,972, // "e"
95,972, // "b"
96,972, // "o"
97,972, // "n"
98,972, // "x"
99,972, // "t"
100,972, // "d"
101,972, // "v"
102,972, // "i"
103,972, // "w"
104,972, // "h"
105,972, // "f"
106,972, // "r"
107,972, // "k"
108,972, // "u"
109,972, // "p"
110,972, // "y"
111,972, // "m"
112,972, // "g"
113,972, // "z"
115,972, // "!"
116,972, // "="
117,972, // "<"
118,972, // ">"
119,972, // "+"
120,972, // "-"
121,972, // "*"
122,972, // "%"
123,972, // "&"
124,972, // "("
125,972, // ")"
126,972, // "{"
127,972, // "}"
128,972, // "["
129,972, // "]"
130,972, // "|"
131,972, // "."
132,972, // ","
133,972, // ":"
134,972, // ";"
136,972, // "/"
142,972, // '"'
144,684, // printable
148,972, // "'"
150,972, // "_"
151,972, // {"A".."Z" "j" "q"}
152,972, // {"0".."9"}
154,972, // " "
163,972, // {"#".."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 1126
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 1127
0x80000000|1477, // match move
0x80000000|226, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1128
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 1129
0x80000000|711, // match move
0x80000000|338, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1130
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 1131
MIN_REDUCTION+315, // (default reduction)
  }
,
{ // state 1132
96,474, // "o"
102,844, // "i"
  }
,
{ // state 1133
172,MIN_REDUCTION+243, // $NT
  }
,
{ // state 1134
102,1303, // "i"
  }
,
{ // state 1135
0x80000000|412, // match move
0x80000000|204, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1136
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+121, // $NT
  }
,
{ // state 1137
0x80000000|935, // match move
0x80000000|629, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1138
2,1312, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 1139
0x80000000|1102, // match move
0x80000000|731, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1140
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 1141
0x80000000|1428, // match move
0x80000000|802, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1142
0x80000000|293, // match move
0x80000000|755, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 1143
104,1423, // "h"
  }
,
{ // state 1144
100,719, // "d"
  }
,
{ // state 1145
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 1146
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 1147
91,1010, // "a"
  }
,
{ // state 1148
2,904, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 1149
2,697, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 1150
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 1151
108,622, // "u"
  }
,
{ // state 1152
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 1153
0x80000000|1, // match move
0x80000000|1495, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 1154
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 1155
91,692, // "a"
  }
,
{ // state 1156
94,145, // "e"
  }
,
{ // state 1157
2,1199, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 1158
0x80000000|1114, // match move
0x80000000|993, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1159
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 1160
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 1161
94,516, // "e"
  }
,
{ // state 1162
2,623, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 1163
105,126, // "f"
  }
,
{ // state 1164
141,469, // dq
142,1339, // '"'
146,792, // $$1
  }
,
{ // state 1165
2,1214, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 1166
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 1167
0x80000000|973, // match move
0x80000000|734, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1168
0x80000000|721, // match move
0x80000000|835, // no-match move
// T-test match for 10:
164,
  }
,
{ // state 1169
136,1044, // "/"
  }
,
{ // state 1170
0x80000000|280, // match move
0x80000000|487, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 1171
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 1172
0x80000000|1, // match move
0x80000000|176, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 1173
0x80000000|1, // match move
0x80000000|1127, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 1174
MIN_REDUCTION+354, // (default reduction)
  }
,
{ // state 1175
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 1176
89,508, // "c"
  }
,
{ // state 1177
2,183, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 1178
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 1179
94,838, // "e"
  }
,
{ // state 1180
90,1004, // "l"
  }
,
{ // state 1181
172,MIN_REDUCTION+231, // $NT
  }
,
{ // state 1182
0x80000000|1, // match move
0x80000000|1449, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 1183
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 1184
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 1185
0x80000000|1, // match move
0x80000000|332, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 1186
99,778, // "t"
  }
,
{ // state 1187
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 1188
172,MIN_REDUCTION+345, // $NT
MIN_REDUCTION+345, // (default reduction)
  }
,
{ // state 1189
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 1190
MIN_REDUCTION+353, // (default reduction)
  }
,
{ // state 1191
2,306, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 1192
107,27, // "k"
  }
,
{ // state 1193
0x80000000|1, // match move
0x80000000|1441, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 1194
2,1136, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+122, // $NT
  }
,
{ // state 1195
0x80000000|1, // match move
0x80000000|1434, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 1196
94,952, // "e"
  }
,
{ // state 1197
0x80000000|438, // match move
0x80000000|611, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1198
0x80000000|1, // match move
0x80000000|256, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 1199
0x80000000|557, // match move
0x80000000|785, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1200
89,428, // "c"
90,428, // "l"
91,428, // "a"
92,428, // "s"
94,428, // "e"
95,428, // "b"
96,428, // "o"
97,428, // "n"
98,428, // "x"
99,428, // "t"
100,428, // "d"
101,428, // "v"
102,428, // "i"
103,428, // "w"
104,428, // "h"
105,428, // "f"
106,428, // "r"
107,428, // "k"
108,428, // "u"
109,428, // "p"
110,428, // "y"
111,428, // "m"
112,428, // "g"
113,428, // "z"
115,428, // "!"
116,428, // "="
117,428, // "<"
118,428, // ">"
119,428, // "+"
120,428, // "-"
121,914, // "*"
122,428, // "%"
123,428, // "&"
124,428, // "("
125,428, // ")"
126,428, // "{"
127,428, // "}"
128,428, // "["
129,428, // "]"
130,428, // "|"
131,428, // "."
132,428, // ","
133,428, // ":"
134,428, // ";"
136,428, // "/"
142,428, // '"'
148,428, // "'"
150,428, // "_"
151,428, // {"A".."Z" "j" "q"}
152,428, // {"0".."9"}
154,428, // " "
156,1068, // eol
159,1438, // comment_stuff**
160,820, // comment_stuff
161,1492, // star_slash
162,1479, // comment_printable
163,428, // {"#".."$" "?".."@" "\" "^" "`" "~"}
164,576, // {10}
165,1168, // {13}
170,1054, // comment_stuff*
  }
,
{ // state 1201
102,224, // "i"
  }
,
{ // state 1202
94,495, // "e"
  }
,
{ // state 1203
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 1204
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+91, // $NT
  }
,
{ // state 1205
0x80000000|409, // match move
0x80000000|220, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1206
172,MIN_REDUCTION+211, // $NT
  }
,
{ // state 1207
136,853, // "/"
  }
,
{ // state 1208
2,1388, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 1209
92,599, // "s"
95,1324, // "b"
  }
,
{ // state 1210
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+153, // $NT
  }
,
{ // state 1211
130,186, // "|"
  }
,
{ // state 1212
2,19, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 1213
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 1214
0x80000000|314, // match move
0x80000000|547, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1215
91,917, // "a"
  }
,
{ // state 1216
91,355, // "a"
  }
,
{ // state 1217
0x80000000|1, // match move
0x80000000|965, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 1218
92,1198, // "s"
  }
,
{ // state 1219
2,1443, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 1220
0x80000000|575, // match move
0x80000000|823, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1221
2,1023, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+102, // $NT
  }
,
{ // state 1222
0x80000000|726, // match move
0x80000000|974, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 1223
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 1224
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+167, // (default reduction)
  }
};
}
private class Initter3{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 1225
94,536, // "e"
  }
,
{ // state 1226
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 1227
0x80000000|1, // match move
0x80000000|1409, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 1228
0x80000000|1, // match move
0x80000000|1221, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 1229
0x80000000|1, // match move
0x80000000|956, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 1230
2,729, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 1231
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 1232
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 1233
0x80000000|130, // match move
0x80000000|1149, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1234
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 1235
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+143, // $NT
  }
,
{ // state 1236
172,MIN_REDUCTION+236, // $NT
  }
,
{ // state 1237
94,1452, // "e"
  }
,
{ // state 1238
0x80000000|1, // match move
0x80000000|1255, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 1239
96,502, // "o"
  }
,
{ // state 1240
110,730, // "y"
  }
,
{ // state 1241
0x80000000|718, // match move
0x80000000|455, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1242
100,888, // "d"
  }
,
{ // state 1243
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 1244
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 1245
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 1246
90,320, // "l"
96,732, // "o"
  }
,
{ // state 1247
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 1248
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 1249
0x80000000|21, // match move
0x80000000|1352, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1250
2,372, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 1251
0x80000000|1, // match move
0x80000000|1460, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 1252
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 1253
172,MIN_REDUCTION+201, // $NT
  }
,
{ // state 1254
0x80000000|795, // match move
0x80000000|334, // no-match move
// T-test match for "+":
119,
  }
,
{ // state 1255
2,468, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+124, // $NT
  }
,
{ // state 1256
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 1257
2,267, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 1258
0x80000000|1009, // match move
0x80000000|642, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1259
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 1260
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
426, // token
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
1097, // `!
1387, // `!=
1159, // `%
593, // `&&
1411, // `*
1096, // `(
1359, // `)
236, // `{
989, // `}
67, // `-
377, // `+
1378, // `=
65, // `==
944, // `[
540, // `]
459, // `||
1051, // `<
866, // `<=
605, // `,
714, // `>
1248, // `>=
53, // `.
350, // `;
1273, // `++
1100, // `--
1301, // `/
1439, // `:
984, // ID
1271, // INT_LITERAL
633, // STRING_LITERAL
1244, // CHARACTER_LITERAL
1222, // "c"
1222, // "l"
1222, // "a"
1222, // "s"
-1, // idChar
1222, // "e"
1222, // "b"
1222, // "o"
1222, // "n"
1222, // "x"
1222, // "t"
1222, // "d"
1222, // "v"
1222, // "i"
1222, // "w"
1222, // "h"
1222, // "f"
1222, // "r"
1222, // "k"
1222, // "u"
1222, // "p"
1222, // "y"
1222, // "m"
1222, // "g"
1222, // "z"
-1, // reserved
1170, // "!"
274, // "="
868, // "<"
249, // ">"
1254, // "+"
1099, // "-"
483, // "*"
758, // "%"
832, // "&"
40, // "("
262, // ")"
453, // "{"
862, // "}"
587, // "["
934, // "]"
1211, // "|"
90, // "."
924, // ","
275, // ":"
25, // ";"
-1, // comment
243, // "/"
522, // identifier
857, // letter
-1, // idChar**
1406, // digit++
1098, // dq
34, // '"'
-1, // stringChar
-1, // printable
-1, // stringChar*
-1, // $$1
842, // sq
833, // "'"
311, // digit
-1, // "_"
1222, // {"A".."Z" "j" "q"}
585, // {"0".."9"}
-1, // white
-1, // " "
-1, // {9 12}
-1, // eol
-1, // ds
-1, // printable**
-1, // comment_stuff**
-1, // comment_stuff
-1, // star_slash
-1, // comment_printable
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
-1, // {10}
-1, // {13}
-1, // token*
-1, // printable*
883, // digit+
-1, // idChar*
-1, // comment_stuff*
MIN_REDUCTION+355, // $
-1, // $NT
  }
,
{ // state 1261
91,1176, // "a"
  }
,
{ // state 1262
2,618, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 1263
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 1264
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 1265
2,72, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 1266
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 1267
2,1302, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 1268
172,MIN_REDUCTION+202, // $NT
  }
,
{ // state 1269
94,800, // "e"
  }
,
{ // state 1270
2,387, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+104, // $NT
  }
,
{ // state 1271
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 1272
102,433, // "i"
106,222, // "r"
  }
,
{ // state 1273
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 1274
0x80000000|600, // match move
0x80000000|317, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1275
2,892, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 1276
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 1277
0x80000000|187, // match move
0x80000000|670, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1278
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 1279
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 1280
0x80000000|1, // match move
0x80000000|1194, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 1281
2,632, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+180, // $NT
  }
,
{ // state 1282
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 1283
0x80000000|119, // match move
0x80000000|1138, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1284
90,880, // "l"
  }
,
{ // state 1285
2,1493, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 1286
0x80000000|603, // match move
0x80000000|318, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1287
172,MIN_REDUCTION+329, // $NT
  }
,
{ // state 1288
99,1070, // "t"
  }
,
{ // state 1289
4,MIN_REDUCTION+327, // token
153,MIN_REDUCTION+327, // white
155,MIN_REDUCTION+327, // {9 12}
164,MIN_REDUCTION+327, // {10}
165,MIN_REDUCTION+327, // {13}
171,MIN_REDUCTION+327, // $
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 1290
2,997, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 1291
0x80000000|271, // match move
0x80000000|1426, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1292
172,MIN_REDUCTION+350, // $NT
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 1293
2,266, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+158, // $NT
  }
,
{ // state 1294
0x80000000|991, // match move
0x80000000|414, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1295
1,856, // start
2,1220, // white*
3,162, // $$0
4,1130, // token
135,482, // comment
136,1067, // "/"
153,215, // white
154,649, // " "
155,649, // {9 12}
157,192, // ds
166,840, // token*
171,MIN_REDUCTION+1, // $
  }
,
{ // state 1296
172,MIN_REDUCTION+242, // $NT
  }
,
{ // state 1297
164,281, // {10}
  }
,
{ // state 1298
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+169, // $NT
  }
,
{ // state 1299
96,1380, // "o"
102,1369, // "i"
  }
,
{ // state 1300
89,458, // "c"
  }
,
{ // state 1301
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 1302
0x80000000|380, // match move
0x80000000|577, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1303
89,639, // "c"
  }
,
{ // state 1304
94,749, // "e"
  }
,
{ // state 1305
172,MIN_REDUCTION+320, // $NT
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 1306
2,312, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 1307
90,903, // "l"
  }
,
{ // state 1308
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 1309
90,1074, // "l"
102,775, // "i"
  }
,
{ // state 1310
0x80000000|1, // match move
0x80000000|1367, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 1311
172,MIN_REDUCTION+206, // $NT
  }
,
{ // state 1312
0x80000000|1256, // match move
0x80000000|1502, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1313
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 1314
2,1063, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 1315
172,MIN_REDUCTION+246, // $NT
  }
,
{ // state 1316
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+171, // $NT
  }
,
{ // state 1317
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 1318
0x80000000|630, // match move
0x80000000|1260, // no-match move
0x80000000|811, // NT-test-match state for reserved
  }
,
{ // state 1319
0x80000000|1276, // match move
0x80000000|1266, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1320
106,588, // "r"
  }
,
{ // state 1321
94,194, // "e"
  }
,
{ // state 1322
107,496, // "k"
  }
,
{ // state 1323
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 1324
92,33, // "s"
  }
,
{ // state 1325
0x80000000|1125, // match move
0x80000000|92, // no-match move
0x80000000|47, // NT-test-match state for printable
  }
,
{ // state 1326
106,751, // "r"
  }
,
{ // state 1327
172,MIN_REDUCTION+215, // $NT
  }
,
{ // state 1328
2,595, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 1329
172,MIN_REDUCTION+331, // $NT
  }
,
{ // state 1330
102,283, // "i"
106,696, // "r"
  }
,
{ // state 1331
172,MIN_REDUCTION+308, // $NT
  }
,
{ // state 1332
96,681, // "o"
  }
,
{ // state 1333
99,264, // "t"
  }
,
{ // state 1334
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 1335
0x80000000|634, // match move
0x80000000|541, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1336
0x80000000|1485, // match move
0x80000000|1466, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1337
99,436, // "t"
  }
,
{ // state 1338
0x80000000|1, // match move
0x80000000|470, // no-match move
// T-test match for "/":
136,
  }
,
{ // state 1339
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 1340
92,1196, // "s"
99,260, // "t"
  }
,
{ // state 1341
90,339, // "l"
  }
,
{ // state 1342
99,430, // "t"
  }
,
{ // state 1343
0x80000000|803, // match move
0x80000000|1283, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 1344
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+135, // $NT
  }
,
{ // state 1345
136,606, // "/"
  }
,
{ // state 1346
0x80000000|970, // match move
0x80000000|1488, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1347
89,1037, // "c"
90,1037, // "l"
91,1037, // "a"
92,1037, // "s"
94,1037, // "e"
95,1037, // "b"
96,1037, // "o"
97,1037, // "n"
98,1037, // "x"
99,1037, // "t"
100,1037, // "d"
101,1037, // "v"
102,1037, // "i"
103,1037, // "w"
104,1037, // "h"
105,1037, // "f"
106,1037, // "r"
107,1037, // "k"
108,1037, // "u"
109,1037, // "p"
110,1037, // "y"
111,1037, // "m"
112,1037, // "g"
113,1037, // "z"
115,1037, // "!"
116,1037, // "="
117,1037, // "<"
118,1037, // ">"
119,1037, // "+"
120,1037, // "-"
121,1037, // "*"
122,1037, // "%"
123,1037, // "&"
124,1037, // "("
125,1037, // ")"
126,1037, // "{"
127,1037, // "}"
128,1037, // "["
129,1037, // "]"
130,1037, // "|"
131,1037, // "."
132,1037, // ","
133,1037, // ":"
134,1037, // ";"
136,1037, // "/"
142,1037, // '"'
144,211, // printable
148,1037, // "'"
150,1037, // "_"
151,1037, // {"A".."Z" "j" "q"}
152,1037, // {"0".."9"}
154,1037, // " "
163,1037, // {"#".."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 1348
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 1349
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 1350
106,26, // "r"
  }
,
{ // state 1351
2,741, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 1352
2,1319, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 1353
109,1246, // "p"
  }
,
{ // state 1354
3,5, // $$0
4,1130, // token
5,515, // `boolean
6,1468, // `class
7,569, // `extends
8,673, // `void
9,1520, // `int
10,979, // `while
11,615, // `if
12,1398, // `else
13,140, // `for
14,1154, // `break
15,1226, // `this
16,331, // `false
17,294, // `true
18,926, // `super
19,59, // `null
20,1323, // `return
21,460, // `instanceof
22,1026, // `new
23,650, // `abstract
24,245, // `assert
25,91, // `byte
26,849, // `case
27,1025, // `catch
28,976, // `char
29,111, // `const
30,523, // `continue
31,1029, // `default
32,1140, // `do
33,1232, // `double
34,1308, // `enum
35,699, // `final
36,1313, // `finally
37,1508, // `float
38,429, // `goto
39,134, // `implements
40,700, // `import
41,1076, // `interface
42,478, // `long
43,779, // `native
44,346, // `package
45,251, // `private
46,1348, // `protected
47,678, // `public
48,125, // `short
49,42, // `static
50,524, // `strictfp
51,756, // `switch
52,837, // `synchronized
53,1178, // `throw
54,1279, // `throws
55,323, // `transient
56,543, // `try
57,940, // `volatile
89,45, // "c"
90,440, // "l"
91,1461, // "a"
92,199, // "s"
94,421, // "e"
95,448, // "b"
97,309, // "n"
99,102, // "t"
100,737, // "d"
101,766, // "v"
102,422, // "i"
103,1404, // "w"
105,641, // "f"
106,882, // "r"
109,790, // "p"
112,943, // "g"
166,840, // token*
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 1355
172,MIN_REDUCTION+318, // $NT
  }
,
{ // state 1356
0x80000000|480, // match move
0x80000000|939, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1357
89,110, // "c"
  }
,
{ // state 1358
0x80000000|1, // match move
0x80000000|1270, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 1359
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 1360
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 1361
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 1362
0x80000000|733, // match move
0x80000000|84, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1363
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 1364
0x80000000|613, // match move
0x80000000|834, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1365
100,137, // "d"
  }
,
{ // state 1366
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 1367
2,1298, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+170, // $NT
  }
,
{ // state 1368
0x80000000|602, // match move
0x80000000|704, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1369
101,528, // "v"
  }
,
{ // state 1370
0x80000000|1, // match move
0x80000000|860, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 1371
121,1169, // "*"
  }
,
{ // state 1372
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 1373
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 1374
172,MIN_REDUCTION+200, // $NT
  }
,
{ // state 1375
104,1153, // "h"
  }
,
{ // state 1376
105,810, // "f"
  }
,
{ // state 1377
2,1092, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+128, // $NT
  }
,
{ // state 1378
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 1379
2,325, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 1380
99,101, // "t"
  }
,
{ // state 1381
90,694, // "l"
  }
,
{ // state 1382
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 1383
0x80000000|902, // match move
0x80000000|24, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1384
2,50, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 1385
2,321, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 1386
172,MIN_REDUCTION+218, // $NT
  }
,
{ // state 1387
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 1388
0x80000000|1523, // match move
0x80000000|826, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1389
97,664, // "n"
  }
,
{ // state 1390
89,462, // "c"
  }
,
{ // state 1391
0x80000000|1363, // match move
0x80000000|1264, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 1392
0x80000000|427, // match move
0x80000000|520, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1393
106,761, // "r"
  }
,
{ // state 1394
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 1395
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 1396
101,665, // "v"
  }
,
{ // state 1397
99,78, // "t"
  }
,
{ // state 1398
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 1399
89,1288, // "c"
  }
,
{ // state 1400
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 1401
2,1135, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 1402
0x80000000|1, // match move
0x80000000|1281, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 1403
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 1404
104,663, // "h"
  }
,
{ // state 1405
91,1322, // "a"
  }
,
{ // state 1406
0x80000000|148, // match move
0x80000000|1314, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1407
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+167, // $NT
  }
,
{ // state 1408
91,359, // "a"
  }
,
{ // state 1409
2,343, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+110, // $NT
  }
,
{ // state 1410
89,109, // "c"
  }
,
{ // state 1411
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 1412
0x80000000|616, // match move
0x80000000|693, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1413
0x80000000|74, // match move
0x80000000|485, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1414
0x80000000|1064, // match move
0x80000000|114, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1415
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 1416
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 1417
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 1418
103,69, // "w"
  }
,
{ // state 1419
90,679, // "l"
  }
,
{ // state 1420
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 1421
92,682, // "s"
  }
,
{ // state 1422
2,1241, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 1423
0x80000000|1, // match move
0x80000000|1249, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 1424
89,428, // "c"
90,428, // "l"
91,428, // "a"
92,428, // "s"
94,428, // "e"
95,428, // "b"
96,428, // "o"
97,428, // "n"
98,428, // "x"
99,428, // "t"
100,428, // "d"
101,428, // "v"
102,428, // "i"
103,428, // "w"
104,428, // "h"
105,428, // "f"
106,428, // "r"
107,428, // "k"
108,428, // "u"
109,428, // "p"
110,428, // "y"
111,428, // "m"
112,428, // "g"
113,428, // "z"
115,428, // "!"
116,428, // "="
117,428, // "<"
118,428, // ">"
119,428, // "+"
120,428, // "-"
121,914, // "*"
122,428, // "%"
123,428, // "&"
124,428, // "("
125,428, // ")"
126,428, // "{"
127,428, // "}"
128,428, // "["
129,428, // "]"
130,428, // "|"
131,428, // "."
132,428, // ","
133,428, // ":"
134,428, // ";"
136,428, // "/"
142,428, // '"'
148,428, // "'"
150,428, // "_"
151,428, // {"A".."Z" "j" "q"}
152,428, // {"0".."9"}
154,428, // " "
156,1068, // eol
159,780, // comment_stuff**
160,820, // comment_stuff
161,1492, // star_slash
162,1479, // comment_printable
163,428, // {"#".."$" "?".."@" "\" "^" "`" "~"}
164,576, // {10}
165,1168, // {13}
170,1054, // comment_stuff*
  }
,
{ // state 1425
99,1357, // "t"
  }
,
{ // state 1426
2,471, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 1427
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 1428
2,2, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 1429
91,760, // "a"
108,120, // "u"
110,292, // "y"
  }
,
{ // state 1430
0x80000000|228, // match move
0x80000000|773, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1431
2,506, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 1432
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+145, // $NT
  }
,
{ // state 1433
121,135, // "*"
159,640, // comment_stuff**
170,1054, // comment_stuff*
  }
,
{ // state 1434
0x80000000|966, // match move
0x80000000|1275, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1435
105,959, // "f"
  }
,
{ // state 1436
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+137, // $NT
  }
,
{ // state 1437
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 1438
121,361, // "*"
  }
,
{ // state 1439
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 1440
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 1441
0x80000000|861, // match move
0x80000000|388, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1442
0x80000000|1022, // match move
0x80000000|112, // no-match move
0x80000000|47, // NT-test-match state for printable
  }
,
{ // state 1443
0x80000000|179, // match move
0x80000000|1024, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1444
2,278, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+188, // $NT
  }
,
{ // state 1445
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+161, // $NT
  }
,
{ // state 1446
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 1447
106,6, // "r"
  }
,
{ // state 1448
89,698, // "c"
  }
,
{ // state 1449
0x80000000|131, // match move
0x80000000|401, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1450
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 1451
96,353, // "o"
  }
,
{ // state 1452
99,233, // "t"
  }
,
{ // state 1453
106,152, // "r"
  }
,
{ // state 1454
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 1455
2,509, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+106, // $NT
  }
,
{ // state 1456
111,534, // "m"
  }
,
{ // state 1457
172,MIN_REDUCTION+322, // $NT
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 1458
2,657, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 1459
0x80000000|1, // match move
0x80000000|1505, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 1460
0x80000000|1031, // match move
0x80000000|1385, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1461
92,1115, // "s"
95,865, // "b"
  }
,
{ // state 1462
0x80000000|1, // match move
0x80000000|1444, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 1463
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 1464
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 1465
172,MIN_REDUCTION+244, // $NT
  }
,
{ // state 1466
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 1467
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 1468
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 1469
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 1470
172,MIN_REDUCTION+315, // $NT
  }
,
{ // state 1471
0x80000000|1, // match move
0x80000000|1377, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 1472
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 1473
102,1108, // "i"
  }
,
{ // state 1474
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 1475
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 1476
MIN_REDUCTION+315, // (default reduction)
  }
,
{ // state 1477
2,957, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 1478
0x80000000|273, // match move
0x80000000|1250, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1479
0x80000000|10, // match move
0x80000000|1245, // no-match move
0x80000000|870, // NT-test-match state for comment_stuff
  }
,
{ // state 1480
172,MIN_REDUCTION+228, // $NT
  }
,
{ // state 1481
2,214, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+142, // $NT
  }
,
{ // state 1482
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 1483
113,363, // "z"
  }
,
{ // state 1484
106,8, // "r"
  }
,
{ // state 1485
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 1486
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 1487
172,MIN_REDUCTION+217, // $NT
  }
,
{ // state 1488
2,1414, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 1489
104,977, // "h"
  }
,
{ // state 1490
92,230, // "s"
  }
,
{ // state 1491
105,160, // "f"
  }
,
{ // state 1492
0x80000000|1417, // match move
0x80000000|787, // no-match move
0x80000000|870, // NT-test-match state for comment_stuff
  }
,
{ // state 1493
0x80000000|797, // match move
0x80000000|250, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1494
135,1457, // comment
136,52, // "/"
153,1188, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+99, // $NT
  }
,
{ // state 1495
0x80000000|609, // match move
0x80000000|1290, // no-match move
0x80000000|57, // NT-test-match state for comment
  }
,
{ // state 1496
2,864, // white*
135,1126, // comment
136,827, // "/"
153,234, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 1497
90,1451, // "l"
91,31, // "a"
96,1393, // "o"
102,98, // "i"
  }
,
{ // state 1498
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 1499
94,295, // "e"
  }
,
{ // state 1500
172,MIN_REDUCTION+212, // $NT
  }
,
{ // state 1501
97,291, // "n"
  }
,
{ // state 1502
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 1503
0x80000000|1, // match move
0x80000000|1481, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 1504
94,1228, // "e"
  }
,
{ // state 1505
2,891, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+132, // $NT
  }
,
{ // state 1506
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 1507
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 1508
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 1509
2,1204, // white*
135,1457, // comment
136,52, // "/"
153,86, // white
154,1305, // " "
155,1305, // {9 12}
156,163, // eol
157,463, // ds
164,1052, // {10}
165,652, // {13}
172,MIN_REDUCTION+92, // $NT
  }
,
{ // state 1510
-1, // $$start
856, // start
1220, // white*
162, // $$0
1130, // token
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
1097, // `!
1387, // `!=
1159, // `%
593, // `&&
1411, // `*
1096, // `(
1359, // `)
236, // `{
989, // `}
67, // `-
377, // `+
1378, // `=
65, // `==
944, // `[
540, // `]
459, // `||
1051, // `<
866, // `<=
605, // `,
714, // `>
1248, // `>=
53, // `.
350, // `;
1273, // `++
1100, // `--
1301, // `/
1439, // `:
984, // ID
1271, // INT_LITERAL
633, // STRING_LITERAL
1244, // CHARACTER_LITERAL
1222, // "c"
1222, // "l"
1222, // "a"
1222, // "s"
-1, // idChar
1222, // "e"
1222, // "b"
1222, // "o"
1222, // "n"
1222, // "x"
1222, // "t"
1222, // "d"
1222, // "v"
1222, // "i"
1222, // "w"
1222, // "h"
1222, // "f"
1222, // "r"
1222, // "k"
1222, // "u"
1222, // "p"
1222, // "y"
1222, // "m"
1222, // "g"
1222, // "z"
-1, // reserved
1170, // "!"
274, // "="
868, // "<"
249, // ">"
1254, // "+"
1099, // "-"
483, // "*"
758, // "%"
832, // "&"
40, // "("
262, // ")"
453, // "{"
862, // "}"
587, // "["
934, // "]"
1211, // "|"
90, // "."
924, // ","
275, // ":"
25, // ";"
-1, // comment
243, // "/"
522, // identifier
857, // letter
-1, // idChar**
1406, // digit++
1098, // dq
34, // '"'
-1, // stringChar
-1, // printable
-1, // stringChar*
-1, // $$1
842, // sq
833, // "'"
311, // digit
-1, // "_"
1222, // {"A".."Z" "j" "q"}
585, // {"0".."9"}
215, // white
649, // " "
649, // {9 12}
1145, // eol
-1, // ds
-1, // printable**
-1, // comment_stuff**
-1, // comment_stuff
-1, // star_slash
-1, // comment_printable
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // {10}
794, // {13}
840, // token*
-1, // printable*
883, // digit+
-1, // idChar*
-1, // comment_stuff*
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 1511
2,744, // white*
153,234, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 1512
95,558, // "b"
  }
,
{ // state 1513
92,441, // "s"
  }
,
{ // state 1514
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 1515
102,277, // "i"
  }
,
{ // state 1516
103,1238, // "w"
  }
,
{ // state 1517
0x80000000|817, // match move
0x80000000|1289, // no-match move
0x80000000|47, // NT-test-match state for printable
  }
,
{ // state 1518
100,1195, // "d"
  }
,
{ // state 1519
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 1520
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 1521
89,428, // "c"
90,428, // "l"
91,428, // "a"
92,428, // "s"
94,428, // "e"
95,428, // "b"
96,428, // "o"
97,428, // "n"
98,428, // "x"
99,428, // "t"
100,428, // "d"
101,428, // "v"
102,428, // "i"
103,428, // "w"
104,428, // "h"
105,428, // "f"
106,428, // "r"
107,428, // "k"
108,428, // "u"
109,428, // "p"
110,428, // "y"
111,428, // "m"
112,428, // "g"
113,428, // "z"
115,428, // "!"
116,428, // "="
117,428, // "<"
118,428, // ">"
119,428, // "+"
120,428, // "-"
121,914, // "*"
122,428, // "%"
123,428, // "&"
124,428, // "("
125,428, // ")"
126,428, // "{"
127,428, // "}"
128,428, // "["
129,428, // "]"
130,428, // "|"
131,428, // "."
132,428, // ","
133,428, // ":"
134,428, // ";"
136,428, // "/"
142,428, // '"'
148,428, // "'"
150,428, // "_"
151,428, // {"A".."Z" "j" "q"}
152,428, // {"0".."9"}
154,428, // " "
156,1068, // eol
159,1371, // comment_stuff**
160,820, // comment_stuff
161,1492, // star_slash
162,1479, // comment_printable
163,428, // {"#".."$" "?".."@" "\" "^" "`" "~"}
164,576, // {10}
165,1168, // {13}
170,1054, // comment_stuff*
  }
,
{ // state 1522
153,887, // white
154,1463, // " "
155,1463, // {9 12}
156,713, // eol
164,437, // {10}
165,590, // {13}
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 1523
135,1126, // comment
136,827, // "/"
153,887, // white
154,1463, // " "
155,1463, // {9 12}
157,124, // ds
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 1524
0x80000000|1, // match move
0x80000000|1509, // no-match move
0x80000000|75, // NT-test-match state for idChar
  }
,
{ // state 1525
94,129, // "e"
  }
,
{ // state 1526
99,592, // "t"
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[1527][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
  doneSoFar += new Initter2().doInit(doneSoFar);
  doneSoFar += new Initter3().doInit(doneSoFar);
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
// `/ ::= !comment "/" white*
(83<<16)+2,
// `/ ::= !comment "/"
(83<<16)+1,
// identifier ::= letter idChar**
(137<<16)+2,
// identifier ::= letter !idChar
(137<<16)+1,
// ID ::= !reserved identifier white*
(85<<16)+2,
// ID ::= !reserved identifier
(85<<16)+1,
// INT_LITERAL ::= digit++ white*
(86<<16)+2,
// INT_LITERAL ::= digit++
(86<<16)+1,
// dq ::= '"'
(141<<16)+1,
// stringChar ::= !dq printable
(143<<16)+1,
// STRING_LITERAL ::= dq stringChar* $$1
(87<<16)+3,
// STRING_LITERAL ::= dq $$1
(87<<16)+2,
// sq ::= "'"
(147<<16)+1,
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
(138<<16)+1,
// digit ::= {"0".."9"}
(149<<16)+1,
// white ::= {9 12 " "}
(153<<16)+1,
// white ::= eol
(153<<16)+1,
// white ::= comment
(153<<16)+1,
// comment ::= ds printable**
(135<<16)+2,
// comment ::= ds !printable
(135<<16)+1,
// comment ::= "/" "*" comment_stuff** "*" "/"
(135<<16)+5,
// comment ::= "/" "*" !comment_stuff "*" "/"
(135<<16)+4,
// ds ::= "/" "/"
(157<<16)+2,
// star_slash ::= "*" !"/"
(161<<16)+1,
// comment_printable ::= {" "..")" "+".."~"}
(162<<16)+1,
// comment_stuff ::= comment_printable
(160<<16)+1,
// comment_stuff ::= star_slash
(160<<16)+1,
// comment_stuff ::= eol
(160<<16)+1,
// eol ::= {10}
(156<<16)+1,
// eol ::= {13} {10}
(156<<16)+2,
// eol ::= {13} !10
(156<<16)+1,
// printable ::= {" ".."~"}
(144<<16)+1,
// token* ::= token* token
(166<<16)+2,
// token* ::= token
(166<<16)+1,
// printable** ::= printable* !printable
(158<<16)+1,
// digit++ ::= digit+ !digit
(140<<16)+1,
// idChar** ::= idChar* !idChar
(139<<16)+1,
// comment_stuff** ::= comment_stuff* !comment_stuff
(159<<16)+1,
// stringChar* ::= stringChar* stringChar
(145<<16)+2,
// stringChar* ::= stringChar
(145<<16)+1,
// white* ::= white* white
(2<<16)+2,
// white* ::= white
(2<<16)+1,
// digit+ ::= digit
(168<<16)+1,
// digit+ ::= digit+ digit
(168<<16)+2,
// printable* ::= printable* printable
(167<<16)+2,
// printable* ::= printable
(167<<16)+1,
// idChar* ::= idChar* idChar
(169<<16)+2,
// idChar* ::= idChar
(169<<16)+1,
// comment_stuff* ::= comment_stuff* comment_stuff
(170<<16)+2,
// comment_stuff* ::= comment_stuff
(170<<16)+1,
// $$0 ::= token*
(3<<16)+1,
// $$1 ::= dq white*
(146<<16)+2,
// $$1 ::= dq
(146<<16)+1,
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
155, // 9
164, // 10
-1, // 11
155, // 12
165, // 13
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
154, // " "
115, // "!"
142, // '"'
163, // "#"
163, // "$"
122, // "%"
123, // "&"
148, // "'"
124, // "("
125, // ")"
121, // "*"
119, // "+"
132, // ","
120, // "-"
131, // "."
136, // "/"
152, // "0"
152, // "1"
152, // "2"
152, // "3"
152, // "4"
152, // "5"
152, // "6"
152, // "7"
152, // "8"
152, // "9"
133, // ":"
134, // ";"
117, // "<"
116, // "="
118, // ">"
163, // "?"
163, // "@"
151, // "A"
151, // "B"
151, // "C"
151, // "D"
151, // "E"
151, // "F"
151, // "G"
151, // "H"
151, // "I"
151, // "J"
151, // "K"
151, // "L"
151, // "M"
151, // "N"
151, // "O"
151, // "P"
151, // "Q"
151, // "R"
151, // "S"
151, // "T"
151, // "U"
151, // "V"
151, // "W"
151, // "X"
151, // "Y"
151, // "Z"
128, // "["
163, // "\"
129, // "]"
163, // "^"
150, // "_"
163, // "`"
91, // "a"
95, // "b"
89, // "c"
100, // "d"
94, // "e"
105, // "f"
112, // "g"
104, // "h"
102, // "i"
151, // "j"
107, // "k"
90, // "l"
111, // "m"
97, // "n"
96, // "o"
109, // "p"
151, // "q"
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
163, // "~"
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
"", // 326
"", // 327
"", // 328
"", // 329
"", // 330
"", // 331
"", // 332
"", // 333
"", // 334
"", // 335
"", // 336
"token* ::= token* token", // 337
"token* ::= token* token", // 338
"printable** ::= printable* !printable", // 339
"digit++ ::= digit+ !digit", // 340
"idChar** ::= idChar* !idChar", // 341
"comment_stuff** ::= comment_stuff* !comment_stuff", // 342
"stringChar* ::= stringChar* stringChar", // 343
"stringChar* ::= stringChar* stringChar", // 344
"white* ::= white* white", // 345
"white* ::= white* white", // 346
"digit+ ::= digit", // 347
"digit+ ::= digit+ digit", // 348
"printable* ::= printable* printable", // 349
"printable* ::= printable* printable", // 350
"idChar* ::= idChar* idChar", // 351
"idChar* ::= idChar* idChar", // 352
"comment_stuff* ::= comment_stuff* comment_stuff", // 353
"comment_stuff* ::= comment_stuff* comment_stuff", // 354
"", // 355
"", // 356
"", // 357
};
public int[][] getActionTable() { return actionTable; }
private int[][] actionTable = {
    { // 0: $$start ::= start @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 1: $$start ::= [start] @pass
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // 2: start ::= white* $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 3: start ::= white* [token*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 4: start ::= [white*] $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
    },
    { // 5: token ::= [#] `boolean @sawBoolean(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 6: token ::= [#] `class @sawClass(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 7: token ::= [#] `extends @sawExtends(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 8: token ::= [#] `void @sawVoid(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 9: token ::= [#] `int @sawInt(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: token ::= [#] `while @sawWhile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 11: token ::= [#] `if @sawIf(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 12: token ::= [#] `else @sawElse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 13: token ::= [#] `for @sawFor(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 14: token ::= [#] `break @sawBreak(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 15: token ::= [#] `this @sawThis(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 16: token ::= [#] `false @sawFalse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 17: token ::= [#] `true @sawTrue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 18: token ::= [#] `super @sawSuper(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 19: token ::= [#] `null @sawNull(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 20: token ::= [#] `return @sawReturn(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 21: token ::= [#] `instanceof @sawInstanceof(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 22: token ::= [#] `new @sawNew(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 23: token ::= [#] `abstract @sawAbstract(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 24: token ::= [#] `assert @sawAssert(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 25: token ::= [#] `byte @sawByte(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 26: token ::= [#] `case @sawCase(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 27: token ::= [#] `catch @sawCatch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 28: token ::= [#] `char @sawChar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 29: token ::= [#] `const @sawConst(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 30: token ::= [#] `continue @sawContinue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 31: token ::= [#] `default @sawDefault(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 32: token ::= [#] `do @sawDo(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 33: token ::= [#] `double @sawDouble(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 34: token ::= [#] `enum @sawEnum(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 35: token ::= [#] `final @sawFinal(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 36: token ::= [#] `finally @sawFinally(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 37: token ::= [#] `float @sawFloat(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 38: token ::= [#] `goto @sawGoto(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 39: token ::= [#] `implements @sawImplements(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 40: token ::= [#] `import @sawImport(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 41: token ::= [#] `interface @sawInterface(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 42: token ::= [#] `long @sawLong(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 43: token ::= [#] `native @sawNative(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 44: token ::= [#] `package @sawPackage(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 45: token ::= [#] `private @sawPrivate(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 46: token ::= [#] `protected @sawProtected(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 47: token ::= [#] `public @sawPublic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 48: token ::= [#] `short @sawShort(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 49: token ::= [#] `static @sawStatic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 50: token ::= [#] `strictfp @sawStrictfp(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 51: token ::= [#] `switch @sawSwitch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 52: token ::= [#] `synchronized @sawSynchronized(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 53: token ::= [#] `throw @sawThrow(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((48<<5)|0x5)/*methodCall:48*/,
    },
    { // 54: token ::= [#] `throws @sawThrows(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((49<<5)|0x5)/*methodCall:49*/,
    },
    { // 55: token ::= [#] `transient @sawTransient(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 56: token ::= [#] `try @sawTry(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 57: token ::= [#] `volatile @sawVolatile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((52<<5)|0x5)/*methodCall:52*/,
    },
    { // 58: token ::= [#] `! @sawNot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((53<<5)|0x5)/*methodCall:53*/,
    },
    { // 59: token ::= [#] `!= @sawNotEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 60: token ::= [#] `% @sawRemainder(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((55<<5)|0x5)/*methodCall:55*/,
    },
    { // 61: token ::= [#] `&& @sawAnd(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 62: token ::= [#] `* @sawTimes(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((57<<5)|0x5)/*methodCall:57*/,
    },
    { // 63: token ::= [#] `( @sawLpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((58<<5)|0x5)/*methodCall:58*/,
    },
    { // 64: token ::= [#] `) @sawRpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((59<<5)|0x5)/*methodCall:59*/,
    },
    { // 65: token ::= [#] `{ @sawLbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((60<<5)|0x5)/*methodCall:60*/,
    },
    { // 66: token ::= [#] `} @sawRbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((61<<5)|0x5)/*methodCall:61*/,
    },
    { // 67: token ::= [#] `- @sawMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((62<<5)|0x5)/*methodCall:62*/,
    },
    { // 68: token ::= [#] `+ @sawPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((63<<5)|0x5)/*methodCall:63*/,
    },
    { // 69: token ::= [#] `= @sawAssign(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((64<<5)|0x5)/*methodCall:64*/,
    },
    { // 70: token ::= [#] `== @sawEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((65<<5)|0x5)/*methodCall:65*/,
    },
    { // 71: token ::= [#] `[ @sawLbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((66<<5)|0x5)/*methodCall:66*/,
    },
    { // 72: token ::= [#] `] @sawRbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((67<<5)|0x5)/*methodCall:67*/,
    },
    { // 73: token ::= [#] `|| @sawOr(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((68<<5)|0x5)/*methodCall:68*/,
    },
    { // 74: token ::= [#] `< @sawLess(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((69<<5)|0x5)/*methodCall:69*/,
    },
    { // 75: token ::= [#] `<= @sawLessEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((70<<5)|0x5)/*methodCall:70*/,
    },
    { // 76: token ::= [#] `, @sawComma(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((71<<5)|0x5)/*methodCall:71*/,
    },
    { // 77: token ::= [#] `> @sawGreater(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((72<<5)|0x5)/*methodCall:72*/,
    },
    { // 78: token ::= [#] `>= @sawGreaterEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((73<<5)|0x5)/*methodCall:73*/,
    },
    { // 79: token ::= [#] `. @sawDot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((74<<5)|0x5)/*methodCall:74*/,
    },
    { // 80: token ::= [#] `; @sawSemi(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((75<<5)|0x5)/*methodCall:75*/,
    },
    { // 81: token ::= [#] `++ @sawPlusPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((76<<5)|0x5)/*methodCall:76*/,
    },
    { // 82: token ::= [#] `-- @sawMinusMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((77<<5)|0x5)/*methodCall:77*/,
    },
    { // 83: token ::= [#] `/ @sawSlash(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((78<<5)|0x5)/*methodCall:78*/,
    },
    { // 84: token ::= [#] `: @sawColon(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((79<<5)|0x5)/*methodCall:79*/,
    },
    { // 85: token ::= [#] ID @identifier(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((80<<5)|0x5)/*methodCall:80*/,
    },
    { // 86: token ::= [#] INT_LITERAL @intLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((81<<5)|0x5)/*methodCall:81*/,
    },
    { // 87: token ::= [#] STRING_LITERAL @stringLit(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((82<<5)|0x5)/*methodCall:82*/,
    },
    { // 88: token ::= [#] CHARACTER_LITERAL @charLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 300: `/ ::= !comment "/" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 301: `/ ::= !comment "/" [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x0)/*popToPushBack:2*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 306: INT_LITERAL ::= [#] digit++ white* @convertToInt(int,List<Character>)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 307: INT_LITERAL ::= [#] digit++ [white*] @convertToInt(int,List<Character>)=>int
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
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
      ((4<<5)|0x6)/*nullProductionAction:4*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
    { // 322: white ::= comment @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 323: comment ::= ds printable** @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 324: comment ::= ds !printable [printable**] @void
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 325: comment ::= "/" "*" comment_stuff** "*" "/" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 326: comment ::= "/" "*" !comment_stuff [comment_stuff**] "*" "/" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 327: ds ::= "/" "/" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 328: star_slash ::= "*" !"/" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 329: comment_printable ::= {" "..")" "+".."~"} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 330: comment_stuff ::= comment_printable @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 331: comment_stuff ::= star_slash @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 332: comment_stuff ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 333: eol ::= {10} [registerNewline] @void
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 334: eol ::= {13} {10} [registerNewline] @void
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 335: eol ::= {13} !10 [registerNewline] @void
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 336: printable ::= {" ".."~"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 337: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 338: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
    },
    { // 339: printable** ::= printable* !printable @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 340: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 341: idChar** ::= idChar* !idChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 342: comment_stuff** ::= comment_stuff* !comment_stuff @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 343: stringChar* ::= stringChar* stringChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 344: stringChar* ::= [stringChar*] stringChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 345: white* ::= white* white @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 346: white* ::= [white*] white @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
    },
    { // 347: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 348: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 349: printable* ::= printable* printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 350: printable* ::= [printable*] printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 351: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 352: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 353: comment_stuff* ::= comment_stuff* comment_stuff @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 354: comment_stuff* ::= [comment_stuff*] comment_stuff @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // 355: $$0 ::= token* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 356: $$1 ::= dq white* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 357: $$1 ::= dq [white*] @pass
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "printable** ::= printable* !printable", // printable**
    "printable* ::=", // printable*
    "", // start
    "comment_stuff* ::=", // comment_stuff*
    "stringChar* ::=", // stringChar*
    "idChar** ::= idChar* !idChar", // idChar**
    "token* ::=", // token*
    "idChar* ::=", // idChar*
    "comment_stuff** ::= comment_stuff* !comment_stuff", // comment_stuff**
    "white* ::=", // white*
    "", // $$start
    "# ::=", // #
    "", // registerNewline
};
public int[][] getNullProductionActionTable() { return nullActionTable; }
private int[][] nullActionTable = {
    { // printable**
      ((1<<5)|0x6)/*nullProductionAction:1*/,
    },
    { // printable*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // start
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
    },
    { // comment_stuff*
    },
    { // stringChar*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // idChar**
      ((7<<5)|0x6)/*nullProductionAction:7*/,
    },
    { // token*
    },
    { // idChar*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // comment_stuff**
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // white*
    },
    { // $$start
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // #
      7/*duplicateTop*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // registerNewline
      ((11<<5)|0x6)/*nullProductionAction:11*/,
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
    0,
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
    0,
    1,
    0,
    0,
    0,
    0,
    -1,
    -1,
    -1,
    0,
    1,
    1,
    1,
    0,
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
