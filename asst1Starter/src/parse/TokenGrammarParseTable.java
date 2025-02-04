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
public int getEofSym() { return 172; }
public int getNttSym() { return 173; }
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
"single_printable",
"{\"#\"..\"$\" \"?\"..\"@\" \"\\\" \"^\" \"`\" \"~\"}",
"single_printable**",
"star",
"comment_printable",
"comment_stuff",
"comment_stuff**",
"10",
"13",
"token*",
"digit+",
"idChar*",
"comment_stuff*",
"single_printable*",
"$",
"$NT",
};
public String symName(int n) {
 return n >= 0 && n < symNameTable.length ? symNameTable[n] : "??";
}
private TokenGrammar actionObject;
public int[][] getParseTable() { return parseTable; }
public int numSymbols() { return 174;}
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
0x80000000|1350, // match move
0x80000000|510, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1
  }
,
{ // state 2
97,636, // "n"
  }
,
{ // state 3
111,1484, // "m"
  }
,
{ // state 4
2,104, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 5
0x80000000|1201, // match move
0x80000000|1223, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 6
94,747, // "e"
  }
,
{ // state 7
97,117, // "n"
  }
,
{ // state 8
111,868, // "m"
  }
,
{ // state 9
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 10
89,271, // "c"
  }
,
{ // state 11
MIN_REDUCTION+353, // (default reduction)
  }
,
{ // state 12
0x80000000|967, // match move
0x80000000|1451, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 13
173,MIN_REDUCTION+327, // $NT
  }
,
{ // state 14
89,1395, // "c"
  }
,
{ // state 15
0x80000000|1114, // match move
0x80000000|1019, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 16
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 17
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 18
173,MIN_REDUCTION+239, // $NT
  }
,
{ // state 19
91,445, // "a"
  }
,
{ // state 20
104,851, // "h"
  }
,
{ // state 21
92,1055, // "s"
  }
,
{ // state 22
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 23
2,966, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+194, // $NT
  }
,
{ // state 24
94,251, // "e"
  }
,
{ // state 25
2,1261, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 26
0x80000000|1325, // match move
0x80000000|1126, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 27
0x80000000|98, // match move
0x80000000|1193, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 28
0x80000000|1, // match move
0x80000000|1359, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 29
2,1035, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+126, // $NT
  }
,
{ // state 30
0x80000000|666, // match move
0x80000000|345, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 31
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 32
173,MIN_REDUCTION+336, // $NT
  }
,
{ // state 33
2,1004, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 34
0x80000000|1231, // match move
0x80000000|1363, // no-match move
0x80000000|804, // NT-test-match state for reserved
  }
,
{ // state 35
99,468, // "t"
  }
,
{ // state 36
96,1449, // "o"
  }
,
{ // state 37
0x80000000|1282, // match move
0x80000000|456, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 38
89,1051, // "c"
  }
,
{ // state 39
173,MIN_REDUCTION+205, // $NT
  }
,
{ // state 40
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 41
121,291, // "*"
136,1264, // "/"
  }
,
{ // state 42
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 43
89,1236, // "c"
  }
,
{ // state 44
105,1006, // "f"
  }
,
{ // state 45
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 46
89,936, // "c"
  }
,
{ // state 47
99,916, // "t"
  }
,
{ // state 48
150,MIN_REDUCTION+323, // "_"
159,MIN_REDUCTION+323, // {"#".."$" "?".."@" "\" "^" "`" "~"}
160,MIN_REDUCTION+323, // single_printable**
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 49
96,1175, // "o"
  }
,
{ // state 50
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 51
173,MIN_REDUCTION+204, // $NT
  }
,
{ // state 52
0x80000000|286, // match move
0x80000000|364, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 53
0x80000000|1, // match move
0x80000000|275, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 54
2,57, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 55
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+93, // $NT
  }
,
{ // state 56
0x80000000|262, // match move
0x80000000|1091, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 57
0x80000000|1218, // match move
0x80000000|290, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 58
97,1117, // "n"
  }
,
{ // state 59
0x80000000|273, // match move
0x80000000|1424, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 60
MIN_REDUCTION+343, // (default reduction)
  }
,
{ // state 61
0x80000000|779, // match move
0x80000000|347, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 62
2,607, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 63
173,MIN_REDUCTION+233, // $NT
  }
,
{ // state 64
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 65
112,105, // "g"
  }
,
{ // state 66
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 67
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 68
0x80000000|1116, // match move
0x80000000|276, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 69
0x80000000|1, // match move
0x80000000|227, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 70
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 71
2,399, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+184, // $NT
  }
,
{ // state 72
99,934, // "t"
  }
,
{ // state 73
0x80000000|853, // match move
0x80000000|217, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 74
0x80000000|1135, // match move
0x80000000|1343, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 75
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 76
92,655, // "s"
99,1224, // "t"
  }
,
{ // state 77
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 78
2,679, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+164, // $NT
  }
,
{ // state 79
100,69, // "d"
  }
,
{ // state 80
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 81
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 82
92,842, // "s"
  }
,
{ // state 83
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 84
89,1322, // "c"
90,1322, // "l"
91,1322, // "a"
92,1322, // "s"
94,1322, // "e"
95,1322, // "b"
96,1322, // "o"
97,1322, // "n"
98,1322, // "x"
99,1322, // "t"
100,1322, // "d"
101,1322, // "v"
102,1322, // "i"
103,1322, // "w"
104,1322, // "h"
105,1322, // "f"
106,1322, // "r"
107,1322, // "k"
108,1322, // "u"
109,1322, // "p"
110,1322, // "y"
111,1322, // "m"
112,1322, // "g"
113,1322, // "z"
138,1460, // letter
149,520, // digit
150,336, // "_"
151,1322, // {"A".."Z" "j" "q"}
152,538, // {"0".."9"}
  }
,
{ // state 85
109,388, // "p"
  }
,
{ // state 86
0x80000000|1, // match move
0x80000000|613, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 87
94,660, // "e"
  }
,
{ // state 88
0x80000000|1, // match move
0x80000000|234, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 89
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 90
2,1419, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 91
136,1469, // "/"
  }
,
{ // state 92
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 93
2,904, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 94
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 95
2,1304, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 96
109,870, // "p"
  }
,
{ // state 97
97,512, // "n"
  }
,
{ // state 98
89,1109, // "c"
90,1109, // "l"
91,1109, // "a"
92,1109, // "s"
93,827, // idChar
94,1109, // "e"
95,1109, // "b"
96,1109, // "o"
97,1109, // "n"
98,1109, // "x"
99,1109, // "t"
100,1109, // "d"
101,1109, // "v"
102,1109, // "i"
103,1109, // "w"
104,1109, // "h"
105,1109, // "f"
106,1109, // "r"
107,1109, // "k"
108,1109, // "u"
109,1109, // "p"
110,1109, // "y"
111,1109, // "m"
112,1109, // "g"
113,1109, // "z"
138,813, // letter
139,1118, // idChar**
149,497, // digit
150,460, // "_"
151,1109, // {"A".."Z" "j" "q"}
152,763, // {"0".."9"}
169,811, // idChar*
  }
,
{ // state 99
2,1170, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 100
173,MIN_REDUCTION+203, // $NT
  }
,
{ // state 101
0x80000000|116, // match move
0x80000000|937, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 102
0x80000000|1, // match move
0x80000000|29, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 103
102,1288, // "i"
  }
,
{ // state 104
0x80000000|1063, // match move
0x80000000|263, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 105
0x80000000|1, // match move
0x80000000|78, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 106
0x80000000|1458, // match move
0x80000000|113, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 107
100,134, // "d"
  }
,
{ // state 108
0x80000000|1, // match move
0x80000000|23, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 109
2,212, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+142, // $NT
  }
,
{ // state 110
173,MIN_REDUCTION+197, // $NT
  }
,
{ // state 111
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 112
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 113
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 114
106,716, // "r"
  }
,
{ // state 115
99,672, // "t"
  }
,
{ // state 116
2,744, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 117
0x80000000|1, // match move
0x80000000|186, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 118
91,449, // "a"
  }
,
{ // state 119
150,MIN_REDUCTION+323, // "_"
159,MIN_REDUCTION+323, // {"#".."$" "?".."@" "\" "^" "`" "~"}
160,MIN_REDUCTION+323, // single_printable**
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 120
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 121
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 122
90,356, // "l"
102,220, // "i"
  }
,
{ // state 123
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 124
0x80000000|843, // match move
0x80000000|1307, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 125
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 126
152,538, // {"0".."9"}
  }
,
{ // state 127
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 128
112,590, // "g"
  }
,
{ // state 129
0x80000000|1014, // match move
0x80000000|293, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 130
0x80000000|1, // match move
0x80000000|101, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 131
0x80000000|691, // match move
0x80000000|858, // no-match move
0x80000000|1511, // NT-test-match state for single_printable
  }
,
{ // state 132
173,MIN_REDUCTION+237, // $NT
  }
,
{ // state 133
121,608, // "*"
136,268, // "/"
  }
,
{ // state 134
0x80000000|1, // match move
0x80000000|71, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 135
0x80000000|800, // match move
0x80000000|165, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 136
121,617, // "*"
164,1431, // comment_stuff**
170,1040, // comment_stuff*
  }
,
{ // state 137
94,1125, // "e"
  }
,
{ // state 138
97,819, // "n"
  }
,
{ // state 139
0x80000000|514, // match move
0x80000000|928, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 140
0x80000000|1, // match move
0x80000000|1233, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 141
2,949, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 142
94,735, // "e"
96,893, // "o"
  }
,
{ // state 143
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+181, // $NT
  }
,
{ // state 144
104,1186, // "h"
  }
,
{ // state 145
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 146
0x80000000|571, // match move
0x80000000|1259, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 147
97,1268, // "n"
  }
,
{ // state 148
89,770, // "c"
  }
,
{ // state 149
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 150
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 151
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 152
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 153
2,720, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 154
92,989, // "s"
  }
,
{ // state 155
102,554, // "i"
  }
,
{ // state 156
136,698, // "/"
  }
,
{ // state 157
0x80000000|1, // match move
0x80000000|168, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 158
0x80000000|939, // match move
0x80000000|175, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 159
2,887, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 160
0x80000000|1467, // match move
0x80000000|1476, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 161
0x80000000|1, // match move
0x80000000|166, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 162
106,1272, // "r"
  }
,
{ // state 163
0x80000000|93, // match move
0x80000000|642, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 164
173,MIN_REDUCTION+321, // $NT
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 165
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 166
2,1027, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+190, // $NT
  }
,
{ // state 167
173,MIN_REDUCTION+230, // $NT
  }
,
{ // state 168
2,708, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+156, // $NT
  }
,
{ // state 169
92,429, // "s"
95,480, // "b"
  }
,
{ // state 170
2,557, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 171
2,696, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+358, // (default reduction)
  }
,
{ // state 172
89,600, // "c"
  }
,
{ // state 173
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 174
0x80000000|1, // match move
0x80000000|1302, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 175
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 176
116,376, // "="
  }
,
{ // state 177
2,256, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 178
2,958, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 179
2,332, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 180
99,427, // "t"
  }
,
{ // state 181
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 182
0x80000000|368, // match move
0x80000000|973, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 183
0x80000000|701, // match move
0x80000000|89, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 184
173,MIN_REDUCTION+220, // $NT
  }
,
{ // state 185
110,1374, // "y"
  }
,
{ // state 186
2,664, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+120, // $NT
  }
,
{ // state 187
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 188
2,1163, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 189
0x80000000|580, // match move
0x80000000|338, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 190
112,1274, // "g"
  }
,
{ // state 191
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 192
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 193
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 194
99,889, // "t"
  }
,
{ // state 195
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 196
160,383, // single_printable**
171,301, // single_printable*
173,MIN_REDUCTION+326, // $NT
  }
,
{ // state 197
136,1466, // "/"
  }
,
{ // state 198
99,855, // "t"
  }
,
{ // state 199
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 200
106,1473, // "r"
  }
,
{ // state 201
2,1393, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 202
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 203
121,1341, // "*"
136,1071, // "/"
  }
,
{ // state 204
2,369, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 205
0x80000000|1, // match move
0x80000000|527, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 206
2,1328, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 207
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 208
173,MIN_REDUCTION+331, // $NT
  }
,
{ // state 209
4,410, // token
MIN_REDUCTION+356, // (default reduction)
  }
,
{ // state 210
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 211
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 212
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+141, // $NT
  }
,
{ // state 213
2,1433, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 214
97,1076, // "n"
  }
,
{ // state 215
94,1023, // "e"
  }
,
{ // state 216
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 217
2,135, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 218
173,MIN_REDUCTION+223, // $NT
  }
,
{ // state 219
0x80000000|564, // match move
0x80000000|1021, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 220
100,174, // "d"
  }
,
{ // state 221
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 222
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 223
102,825, // "i"
  }
,
{ // state 224
2,1200, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 225
0x80000000|1099, // match move
0x80000000|704, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 226
173,MIN_REDUCTION+195, // $NT
  }
,
{ // state 227
2,1044, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+98, // $NT
  }
,
{ // state 228
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 229
89,1180, // "c"
90,1180, // "l"
91,1180, // "a"
92,1180, // "s"
94,1180, // "e"
95,1180, // "b"
96,1180, // "o"
97,1180, // "n"
98,1180, // "x"
99,1180, // "t"
100,1180, // "d"
101,1180, // "v"
102,1180, // "i"
103,1180, // "w"
104,1180, // "h"
105,1180, // "f"
106,1180, // "r"
107,1180, // "k"
108,1180, // "u"
109,1180, // "p"
110,1180, // "y"
111,1180, // "m"
112,1180, // "g"
113,1180, // "z"
115,1180, // "!"
116,1180, // "="
117,1180, // "<"
118,1180, // ">"
119,1180, // "+"
120,1180, // "-"
121,1180, // "*"
122,1180, // "%"
123,1180, // "&"
124,1180, // "("
125,1180, // ")"
126,1180, // "{"
127,1180, // "}"
128,1180, // "["
129,1180, // "]"
130,1180, // "|"
131,1180, // "."
132,1180, // ","
133,1180, // ":"
134,1180, // ";"
136,1180, // "/"
142,1180, // '"'
143,60, // stringChar
144,597, // printable
146,790, // $$1
148,1180, // "'"
150,1180, // "_"
151,1180, // {"A".."Z" "j" "q"}
152,1180, // {"0".."9"}
154,1180, // " "
159,1180, // {"#".."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 230
95,1497, // "b"
  }
,
{ // state 231
0x80000000|1426, // match move
0x80000000|474, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 232
99,743, // "t"
  }
,
{ // state 233
0x80000000|1, // match move
0x80000000|422, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 234
2,1281, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+172, // $NT
  }
,
{ // state 235
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 236
90,780, // "l"
  }
,
{ // state 237
2,1152, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 238
MIN_REDUCTION+344, // (default reduction)
  }
,
{ // state 239
92,882, // "s"
95,1488, // "b"
  }
,
{ // state 240
2,295, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 241
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 242
102,1397, // "i"
106,693, // "r"
  }
,
{ // state 243
2,879, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 244
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+149, // $NT
  }
,
{ // state 245
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 246
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 247
2,1151, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 248
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 249
94,44, // "e"
96,463, // "o"
  }
,
{ // state 250
94,108, // "e"
  }
,
{ // state 251
0x80000000|1, // match move
0x80000000|315, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 252
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 253
99,391, // "t"
  }
,
{ // state 254
91,797, // "a"
  }
,
{ // state 255
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+157, // $NT
  }
,
{ // state 256
0x80000000|1503, // match move
0x80000000|1432, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 257
130,163, // "|"
  }
,
{ // state 258
0x80000000|1, // match move
0x80000000|61, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 259
94,1401, // "e"
  }
,
{ // state 260
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 261
102,756, // "i"
  }
,
{ // state 262
90,1107, // "l"
  }
,
{ // state 263
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 264
94,28, // "e"
  }
,
{ // state 265
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+187, // $NT
  }
,
{ // state 266
0x80000000|691, // match move
0x80000000|1490, // no-match move
0x80000000|1511, // NT-test-match state for single_printable
  }
,
{ // state 267
91,1053, // "a"
  }
,
{ // state 268
0x80000000|152, // match move
0x80000000|1012, // no-match move
0x80000000|1511, // NT-test-match state for single_printable
  }
,
{ // state 269
2,1305, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 270
108,638, // "u"
  }
,
{ // state 271
0x80000000|1, // match move
0x80000000|363, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 272
99,572, // "t"
  }
,
{ // state 273
2,1060, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 274
94,567, // "e"
  }
,
{ // state 275
0x80000000|1031, // match move
0x80000000|385, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 276
2,1394, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 277
2,570, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 278
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 279
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 280
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 281
109,794, // "p"
  }
,
{ // state 282
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 283
94,1382, // "e"
  }
,
{ // state 284
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 285
89,971, // "c"
  }
,
{ // state 286
2,106, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 287
173,MIN_REDUCTION+235, // $NT
  }
,
{ // state 288
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 289
0x80000000|211, // match move
0x80000000|822, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 290
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 291
0x80000000|1156, // match move
0x80000000|136, // no-match move
0x80000000|637, // NT-test-match state for comment_stuff
  }
,
{ // state 292
2,1354, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 293
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 294
0x80000000|1327, // match move
0x80000000|1247, // no-match move
0x80000000|126, // NT-test-match state for digit
  }
,
{ // state 295
0x80000000|222, // match move
0x80000000|1181, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 296
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 297
0x80000000|1062, // match move
0x80000000|32, // no-match move
// T-test match for 10:
165,
  }
,
{ // state 298
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 299
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 300
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 301
0x80000000|1525, // match move
0x80000000|839, // no-match move
0x80000000|1511, // NT-test-match state for single_printable
  }
,
{ // state 302
2,1361, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 303
97,507, // "n"
  }
,
{ // state 304
2,561, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 305
0x80000000|994, // match move
0x80000000|50, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 306
99,451, // "t"
  }
,
{ // state 307
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 308
92,834, // "s"
  }
,
{ // state 309
104,482, // "h"
  }
,
{ // state 310
0x80000000|719, // match move
0x80000000|477, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 311
2,806, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 312
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+173, // $NT
  }
,
{ // state 313
116,349, // "="
  }
,
{ // state 314
91,442, // "a"
  }
,
{ // state 315
0x80000000|213, // match move
0x80000000|917, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 316
94,114, // "e"
  }
,
{ // state 317
104,895, // "h"
  }
,
{ // state 318
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+89, // $NT
  }
,
{ // state 319
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 320
97,764, // "n"
  }
,
{ // state 321
91,848, // "a"
  }
,
{ // state 322
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 323
0x80000000|1, // match move
0x80000000|355, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 324
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+109, // $NT
  }
,
{ // state 325
0x80000000|489, // match move
0x80000000|120, // no-match move
0x80000000|1511, // NT-test-match state for single_printable
  }
,
{ // state 326
2,143, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+182, // $NT
  }
,
{ // state 327
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 328
99,1172, // "t"
103,1351, // "w"
104,49, // "h"
108,85, // "u"
110,992, // "y"
  }
,
{ // state 329
94,789, // "e"
  }
,
{ // state 330
2,26, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 331
96,122, // "o"
  }
,
{ // state 332
0x80000000|726, // match move
0x80000000|785, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 333
94,991, // "e"
  }
,
{ // state 334
0x80000000|1, // match move
0x80000000|15, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 335
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+175, // $NT
  }
,
{ // state 336
173,MIN_REDUCTION+317, // $NT
  }
,
{ // state 337
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+107, // $NT
  }
,
{ // state 338
2,1067, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 339
96,846, // "o"
  }
,
{ // state 340
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 341
0x80000000|1202, // match move
0x80000000|759, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 342
147,641, // sq
148,1417, // "'"
  }
,
{ // state 343
173,MIN_REDUCTION+225, // $NT
  }
,
{ // state 344
136,111, // "/"
  }
,
{ // state 345
2,158, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 346
2,931, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 347
2,793, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 348
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 349
0x80000000|311, // match move
0x80000000|1494, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 350
91,682, // "a"
  }
,
{ // state 351
173,MIN_REDUCTION+226, // $NT
  }
,
{ // state 352
0x80000000|1519, // match move
0x80000000|1429, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 353
0x80000000|1, // match move
0x80000000|341, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 354
102,1266, // "i"
  }
,
{ // state 355
0x80000000|511, // match move
0x80000000|522, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 356
91,871, // "a"
  }
,
{ // state 357
99,1092, // "t"
103,1319, // "w"
104,339, // "h"
108,96, // "u"
110,1258, // "y"
  }
,
{ // state 358
109,730, // "p"
  }
,
{ // state 359
2,548, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 360
0x80000000|176, // match move
0x80000000|605, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 361
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+185, // $NT
  }
,
{ // state 362
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 363
2,444, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+178, // $NT
  }
,
{ // state 364
2,106, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 365
173,MIN_REDUCTION+227, // $NT
  }
,
{ // state 366
89,233, // "c"
  }
,
{ // state 367
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 368
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 369
0x80000000|1445, // match move
0x80000000|1190, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 370
173,MIN_REDUCTION+325, // $NT
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 371
0x80000000|1317, // match move
0x80000000|519, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 372
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 373
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+103, // $NT
  }
,
{ // state 374
2,949, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 375
0x80000000|791, // match move
0x80000000|1413, // no-match move
0x80000000|1511, // NT-test-match state for single_printable
  }
,
{ // state 376
0x80000000|269, // match move
0x80000000|1159, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 377
173,MIN_REDUCTION+216, // $NT
  }
,
{ // state 378
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+357, // (default reduction)
  }
,
{ // state 379
2,931, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 380
0x80000000|237, // match move
0x80000000|1387, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 381
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 382
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 383
173,MIN_REDUCTION+325, // $NT
  }
,
{ // state 384
90,1406, // "l"
  }
,
{ // state 385
2,852, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 386
97,43, // "n"
  }
,
{ // state 387
0x80000000|595, // match move
0x80000000|1337, // no-match move
0x80000000|637, // NT-test-match state for comment_stuff
  }
,
{ // state 388
94,844, // "e"
  }
,
{ // state 389
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 390
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 391
0x80000000|1, // match move
0x80000000|620, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 392
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 393
90,1240, // "l"
  }
,
{ // state 394
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 395
101,321, // "v"
  }
,
{ // state 396
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+151, // $NT
  }
,
{ // state 397
92,1439, // "s"
  }
,
{ // state 398
99,1518, // "t"
  }
,
{ // state 399
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+183, // $NT
  }
,
{ // state 400
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+117, // $NT
  }
,
{ // state 401
0x80000000|948, // match move
0x80000000|1221, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 402
96,628, // "o"
106,1238, // "r"
110,1207, // "y"
  }
,
{ // state 403
0x80000000|487, // match move
0x80000000|1353, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 404
0x80000000|42, // match move
0x80000000|562, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 405
94,1440, // "e"
  }
,
{ // state 406
99,1287, // "t"
  }
,
{ // state 407
99,1080, // "t"
  }
,
{ // state 408
97,65, // "n"
  }
,
{ // state 409
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 410
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 411
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 412
0x80000000|1, // match move
0x80000000|649, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 413
0x80000000|431, // match move
0x80000000|1399, // no-match move
0x80000000|637, // NT-test-match state for comment_stuff
  }
,
{ // state 414
89,715, // "c"
90,715, // "l"
91,715, // "a"
92,715, // "s"
94,715, // "e"
95,715, // "b"
96,715, // "o"
97,715, // "n"
98,715, // "x"
99,715, // "t"
100,715, // "d"
101,715, // "v"
102,715, // "i"
103,715, // "w"
104,715, // "h"
105,715, // "f"
106,715, // "r"
107,715, // "k"
108,715, // "u"
109,715, // "p"
110,715, // "y"
111,715, // "m"
112,715, // "g"
113,715, // "z"
115,715, // "!"
116,715, // "="
117,715, // "<"
118,715, // ">"
119,715, // "+"
120,715, // "-"
121,715, // "*"
122,715, // "%"
123,715, // "&"
124,715, // "("
125,715, // ")"
126,715, // "{"
127,715, // "}"
128,715, // "["
129,715, // "]"
130,715, // "|"
131,715, // "."
132,715, // ","
133,715, // ":"
134,715, // ";"
136,715, // "/"
142,715, // '"'
148,715, // "'"
150,715, // "_"
151,715, // {"A".."Z" "j" "q"}
152,715, // {"0".."9"}
154,715, // " "
155,715, // {9 12}
158,1311, // single_printable
159,715, // {"#".."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 415
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 416
2,500, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+106, // $NT
  }
,
{ // state 417
0x80000000|1521, // match move
0x80000000|808, // no-match move
0x80000000|637, // NT-test-match state for comment_stuff
  }
,
{ // state 418
0x80000000|1368, // match move
0x80000000|875, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 419
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 420
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+191, // $NT
  }
,
{ // state 421
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 422
2,312, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+174, // $NT
  }
,
{ // state 423
173,MIN_REDUCTION+350, // $NT
  }
,
{ // state 424
0x80000000|665, // match move
0x80000000|1141, // no-match move
0x80000000|637, // NT-test-match state for comment_stuff
  }
,
{ // state 425
2,1043, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+96, // $NT
  }
,
{ // state 426
90,274, // "l"
96,1182, // "o"
  }
,
{ // state 427
89,788, // "c"
  }
,
{ // state 428
90,56, // "l"
  }
,
{ // state 429
92,921, // "s"
  }
,
{ // state 430
2,1486, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+100, // $NT
  }
,
{ // state 431
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 432
2,1066, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+128, // $NT
  }
,
{ // state 433
0x80000000|1, // match move
0x80000000|425, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 434
100,88, // "d"
  }
,
{ // state 435
0x80000000|313, // match move
0x80000000|380, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 436
2,659, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 437
173,MIN_REDUCTION+351, // $NT
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 438
106,1402, // "r"
  }
,
{ // state 439
0x80000000|141, // match move
0x80000000|374, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 440
2,1286, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 441
89,413, // "c"
90,413, // "l"
91,413, // "a"
92,413, // "s"
94,413, // "e"
95,413, // "b"
96,413, // "o"
97,413, // "n"
98,413, // "x"
99,413, // "t"
100,413, // "d"
101,413, // "v"
102,413, // "i"
103,413, // "w"
104,413, // "h"
105,413, // "f"
106,413, // "r"
107,413, // "k"
108,413, // "u"
109,413, // "p"
110,413, // "y"
111,413, // "m"
112,413, // "g"
113,413, // "z"
115,413, // "!"
116,413, // "="
117,413, // "<"
118,413, // ">"
119,413, // "+"
120,413, // "-"
121,795, // "*"
122,413, // "%"
123,413, // "&"
124,413, // "("
125,413, // ")"
126,413, // "{"
127,413, // "}"
128,413, // "["
129,413, // "]"
130,413, // "|"
131,413, // "."
132,413, // ","
133,413, // ":"
134,413, // ";"
136,413, // "/"
142,413, // '"'
148,413, // "'"
150,413, // "_"
151,413, // {"A".."Z" "j" "q"}
152,413, // {"0".."9"}
154,413, // " "
156,1050, // eol
159,413, // {"#".."$" "?".."@" "\" "^" "`" "~"}
161,826, // star
162,1471, // comment_printable
163,424, // comment_stuff
164,650, // comment_stuff**
165,387, // {10}
166,1465, // {13}
170,1040, // comment_stuff*
  }
,
{ // state 442
112,1292, // "g"
  }
,
{ // state 443
101,1263, // "v"
  }
,
{ // state 444
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+177, // $NT
  }
,
{ // state 445
99,914, // "t"
  }
,
{ // state 446
0x80000000|319, // match move
0x80000000|997, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 447
0x80000000|1078, // match move
0x80000000|409, // no-match move
// T-test match for 10:
165,
  }
,
{ // state 448
2,104, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 449
107,1005, // "k"
  }
,
{ // state 450
97,915, // "n"
  }
,
{ // state 451
0x80000000|1, // match move
0x80000000|432, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 452
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 453
89,317, // "c"
  }
,
{ // state 454
99,6, // "t"
  }
,
{ // state 455
160,127, // single_printable**
171,1206, // single_printable*
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 456
0x80000000|560, // match move
0x80000000|292, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 457
2,1419, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 458
2,1121, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 459
0x80000000|152, // match move
0x80000000|703, // no-match move
0x80000000|1511, // NT-test-match state for single_printable
  }
,
{ // state 460
0x80000000|1210, // match move
0x80000000|534, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 461
165,1499, // {10}
  }
,
{ // state 462
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 463
0x80000000|1174, // match move
0x80000000|837, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 464
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 465
2,1304, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 466
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+123, // $NT
  }
,
{ // state 467
0x80000000|145, // match move
0x80000000|722, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 468
0x80000000|1, // match move
0x80000000|59, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 469
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 470
108,786, // "u"
  }
,
{ // state 471
0x80000000|1140, // match move
0x80000000|833, // no-match move
0x80000000|637, // NT-test-match state for comment_stuff
  }
,
{ // state 472
94,1171, // "e"
  }
,
{ // state 473
95,1187, // "b"
  }
,
{ // state 474
2,1485, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 475
2,1163, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 476
90,615, // "l"
97,1007, // "n"
98,1065, // "x"
  }
,
{ // state 477
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 478
96,869, // "o"
  }
,
{ // state 479
94,58, // "e"
  }
,
{ // state 480
92,626, // "s"
  }
,
{ // state 481
2,1328, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 482
106,924, // "r"
  }
,
{ // state 483
99,1103, // "t"
  }
,
{ // state 484
0x80000000|316, // match move
0x80000000|885, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 485
2,1013, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 486
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 487
2,894, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 488
173,MIN_REDUCTION+245, // $NT
  }
,
{ // state 489
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 490
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+147, // $NT
  }
,
{ // state 491
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 492
90,1447, // "l"
  }
,
{ // state 493
103,146, // "w"
  }
,
{ // state 494
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 495
2,1370, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 496
0x80000000|807, // match move
0x80000000|436, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 497
0x80000000|150, // match move
0x80000000|66, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 498
0x80000000|1030, // match move
0x80000000|300, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 499
0x80000000|1, // match move
0x80000000|518, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 500
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+105, // $NT
  }
,
{ // state 501
90,644, // "l"
97,1203, // "n"
98,676, // "x"
  }
,
{ // state 502
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 503
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 504
173,MIN_REDUCTION+222, // $NT
  }
,
{ // state 505
99,137, // "t"
  }
,
{ // state 506
105,1409, // "f"
  }
,
{ // state 507
91,1369, // "a"
  }
,
{ // state 508
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 509
173,MIN_REDUCTION+347, // $NT
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 510
0x80000000|847, // match move
0x80000000|1074, // no-match move
0x80000000|804, // NT-test-match state for reserved
  }
,
{ // state 511
2,874, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 512
92,1001, // "s"
  }
,
{ // state 513
94,1198, // "e"
  }
,
{ // state 514
92,1495, // "s"
  }
,
{ // state 515
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 516
2,720, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 517
0x80000000|1, // match move
0x80000000|231, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 518
2,746, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+140, // $NT
  }
,
{ // state 519
2,183, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 520
173,MIN_REDUCTION+316, // $NT
  }
,
{ // state 521
92,910, // "s"
  }
,
{ // state 522
2,874, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 523
102,1077, // "i"
  }
,
{ // state 524
89,144, // "c"
  }
,
{ // state 525
119,1038, // "+"
  }
,
{ // state 526
99,801, // "t"
  }
,
{ // state 527
2,632, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+160, // $NT
  }
,
{ // state 528
2,332, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 529
173,MIN_REDUCTION+208, // $NT
  }
,
{ // state 530
0x80000000|461, // match move
0x80000000|1505, // no-match move
// T-test match for 10:
165,
  }
,
{ // state 531
2,446, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 532
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 533
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 534
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 535
99,102, // "t"
  }
,
{ // state 536
121,1333, // "*"
164,650, // comment_stuff**
170,1040, // comment_stuff*
  }
,
{ // state 537
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 538
173,MIN_REDUCTION+319, // $NT
  }
,
{ // state 539
106,7, // "r"
  }
,
{ // state 540
173,MIN_REDUCTION+247, // $NT
  }
,
{ // state 541
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 542
2,1106, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 543
0x80000000|1, // match move
0x80000000|849, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 544
0x80000000|1123, // match move
0x80000000|229, // no-match move
0x80000000|831, // NT-test-match state for dq
  }
,
{ // state 545
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+129, // $NT
  }
,
{ // state 546
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+133, // $NT
  }
,
{ // state 547
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+357, // (default reduction)
  }
,
{ // state 548
0x80000000|646, // match move
0x80000000|706, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 549
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 550
2,1056, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 551
90,1388, // "l"
91,76, // "a"
96,450, // "o"
104,1335, // "h"
  }
,
{ // state 552
92,259, // "s"
  }
,
{ // state 553
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 554
101,1054, // "v"
  }
,
{ // state 555
96,526, // "o"
  }
,
{ // state 556
0x80000000|179, // match move
0x80000000|528, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 557
0x80000000|64, // match move
0x80000000|1284, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 558
173,MIN_REDUCTION+198, // $NT
  }
,
{ // state 559
104,985, // "h"
  }
,
{ // state 560
2,1354, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 561
0x80000000|1372, // match move
0x80000000|1138, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 562
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 563
90,1195, // "l"
91,1321, // "a"
96,717, // "o"
102,1475, // "i"
  }
,
{ // state 564
2,898, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 565
91,803, // "a"
  }
,
{ // state 566
0x80000000|1, // match move
0x80000000|695, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 567
111,479, // "m"
  }
,
{ // state 568
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 569
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 570
0x80000000|1459, // match move
0x80000000|1301, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 571
92,907, // "s"
  }
,
{ // state 572
0x80000000|1, // match move
0x80000000|109, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 573
0x80000000|245, // match move
0x80000000|173, // no-match move
0x80000000|126, // NT-test-match state for digit
  }
,
{ // state 574
104,888, // "h"
  }
,
{ // state 575
0x80000000|1, // match move
0x80000000|416, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 576
2,289, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 577
105,1000, // "f"
  }
,
{ // state 578
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 579
2,630, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 580
2,1067, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 581
0x80000000|694, // match move
0x80000000|1073, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 582
100,154, // "d"
  }
,
{ // state 583
0x80000000|379, // match move
0x80000000|346, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 584
0x80000000|1122, // match move
0x80000000|192, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 585
160,45, // single_printable**
171,1139, // single_printable*
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 586
94,761, // "e"
  }
,
{ // state 587
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 588
0x80000000|1384, // match move
0x80000000|196, // no-match move
0x80000000|1511, // NT-test-match state for single_printable
  }
,
{ // state 589
100,1383, // "d"
  }
,
{ // state 590
0x80000000|1, // match move
0x80000000|52, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 591
0x80000000|1, // match move
0x80000000|73, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 592
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 593
0x80000000|1, // match move
0x80000000|702, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 594
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 595
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 596
0x80000000|1, // match move
0x80000000|854, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 597
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 598
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 599
173,MIN_REDUCTION+332, // $NT
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 600
94,1216, // "e"
  }
,
{ // state 601
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 602
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+165, // $NT
  }
,
{ // state 603
100,140, // "d"
  }
,
{ // state 604
2,584, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 605
0x80000000|643, // match move
0x80000000|204, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 606
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 607
0x80000000|1211, // match move
0x80000000|1455, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 608
0x80000000|1415, // match move
0x80000000|1526, // no-match move
0x80000000|637, // NT-test-match state for comment_stuff
  }
,
{ // state 609
0x80000000|1124, // match move
0x80000000|177, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 610
0x80000000|95, // match move
0x80000000|465, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 611
0x80000000|277, // match move
0x80000000|1352, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 612
97,470, // "n"
  }
,
{ // state 613
0x80000000|206, // match move
0x80000000|481, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 614
0x80000000|1, // match move
0x80000000|624, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 615
92,264, // "s"
  }
,
{ // state 616
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 617
136,1165, // "/"
  }
,
{ // state 618
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 619
99,1430, // "t"
  }
,
{ // state 620
0x80000000|1095, // match move
0x80000000|1502, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 621
0x80000000|975, // match move
0x80000000|327, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 622
90,552, // "l"
  }
,
{ // state 623
108,1492, // "u"
  }
,
{ // state 624
2,886, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+132, // $NT
  }
,
{ // state 625
MIN_REDUCTION+353, // (default reduction)
  }
,
{ // state 626
99,200, // "t"
  }
,
{ // state 627
0x80000000|587, // match move
0x80000000|419, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 628
96,1515, // "o"
  }
,
{ // state 629
173,MIN_REDUCTION+219, // $NT
  }
,
{ // state 630
0x80000000|1113, // match move
0x80000000|210, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 631
99,1446, // "t"
  }
,
{ // state 632
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+159, // $NT
  }
,
{ // state 633
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 634
4,410, // token
5,382, // `boolean
6,1184, // `class
7,688, // `extends
8,92, // `void
9,1336, // `int
10,1069, // `while
11,658, // `if
12,1400, // `else
13,199, // `for
14,1295, // `break
15,1131, // `this
16,83, // `false
17,322, // `true
18,861, // `super
19,288, // `null
20,1244, // `return
21,503, // `instanceof
22,1155, // `new
23,594, // `abstract
24,195, // `assert
25,151, // `byte
26,982, // `case
27,986, // `catch
28,1010, // `char
29,246, // `const
30,569, // `continue
31,1102, // `default
32,1153, // `do
33,1144, // `double
34,1315, // `enum
35,737, // `final
36,1228, // `finally
37,1462, // `float
38,367, // `goto
39,80, // `implements
40,16, // `import
41,942, // `interface
42,598, // `long
43,906, // `native
44,299, // `package
45,202, // `private
46,1278, // `protected
47,618, // `public
48,77, // `short
49,280, // `static
50,578, // `strictfp
51,922, // `switch
52,754, // `synchronized
53,1506, // `throw
54,1191, // `throws
55,252, // `transient
56,494, // `try
57,1064, // `volatile
89,551, // "c"
90,1423, // "l"
91,239, // "a"
92,357, // "s"
94,476, // "e"
95,402, // "b"
97,1514, // "n"
99,1149, // "t"
100,249, // "d"
101,331, // "v"
102,1024, // "i"
103,750, // "w"
105,563, // "f"
106,1022, // "r"
109,639, // "p"
112,1323, // "g"
MIN_REDUCTION+356, // (default reduction)
  }
,
{ // state 635
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+179, // $NT
  }
,
{ // state 636
0x80000000|1, // match move
0x80000000|371, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 637
89,1250, // "c"
90,1250, // "l"
91,1250, // "a"
92,1250, // "s"
94,1250, // "e"
95,1250, // "b"
96,1250, // "o"
97,1250, // "n"
98,1250, // "x"
99,1250, // "t"
100,1250, // "d"
101,1250, // "v"
102,1250, // "i"
103,1250, // "w"
104,1250, // "h"
105,1250, // "f"
106,1250, // "r"
107,1250, // "k"
108,1250, // "u"
109,1250, // "p"
110,1250, // "y"
111,1250, // "m"
112,1250, // "g"
113,1250, // "z"
115,1250, // "!"
116,1250, // "="
117,1250, // "<"
118,1250, // ">"
119,1250, // "+"
120,1250, // "-"
121,892, // "*"
122,1250, // "%"
123,1250, // "&"
124,1250, // "("
125,1250, // ")"
126,1250, // "{"
127,1250, // "}"
128,1250, // "["
129,1250, // "]"
130,1250, // "|"
131,1250, // "."
132,1250, // ","
133,1250, // ":"
134,1250, // ";"
136,1250, // "/"
142,1250, // '"'
148,1250, // "'"
150,1250, // "_"
151,1250, // {"A".."Z" "j" "q"}
152,1250, // {"0".."9"}
154,1250, // " "
156,208, // eol
159,1250, // {"#".."$" "?".."@" "\" "^" "`" "~"}
161,1033, // star
162,713, // comment_printable
165,1510, // {10}
166,297, // {13}
  }
,
{ // state 638
95,1089, // "b"
  }
,
{ // state 639
91,46, // "a"
106,1347, // "r"
108,1127, // "u"
  }
,
{ // state 640
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 641
0x80000000|475, // match move
0x80000000|188, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 642
2,904, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 643
2,369, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 644
92,329, // "s"
  }
,
{ // state 645
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 646
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 647
92,232, // "s"
99,926, // "t"
  }
,
{ // state 648
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 649
2,255, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+158, // $NT
  }
,
{ // state 650
121,156, // "*"
  }
,
{ // state 651
2,879, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 652
0x80000000|1227, // match move
0x80000000|930, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 653
94,107, // "e"
  }
,
{ // state 654
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 655
94,1267, // "e"
  }
,
{ // state 656
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 657
2,182, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 658
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 659
0x80000000|1438, // match move
0x80000000|1320, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 660
106,1329, // "r"
  }
,
{ // state 661
89,715, // "c"
90,715, // "l"
91,715, // "a"
92,715, // "s"
94,715, // "e"
95,715, // "b"
96,715, // "o"
97,715, // "n"
98,715, // "x"
99,715, // "t"
100,715, // "d"
101,715, // "v"
102,715, // "i"
103,715, // "w"
104,715, // "h"
105,715, // "f"
106,715, // "r"
107,715, // "k"
108,715, // "u"
109,715, // "p"
110,715, // "y"
111,715, // "m"
112,715, // "g"
113,715, // "z"
115,715, // "!"
116,715, // "="
117,715, // "<"
118,715, // ">"
119,715, // "+"
120,715, // "-"
121,715, // "*"
122,715, // "%"
123,715, // "&"
124,715, // "("
125,715, // ")"
126,715, // "{"
127,715, // "}"
128,715, // "["
129,715, // "]"
130,715, // "|"
131,715, // "."
132,715, // ","
133,715, // ":"
134,715, // ";"
136,715, // "/"
142,715, // '"'
148,715, // "'"
150,715, // "_"
151,715, // {"A".."Z" "j" "q"}
152,715, // {"0".."9"}
154,715, // " "
155,715, // {9 12}
158,266, // single_printable
159,715, // {"#".."$" "?".."@" "\" "^" "`" "~"}
160,45, // single_printable**
171,1139, // single_printable*
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
{ // state 662
0x80000000|1421, // match move
0x80000000|1314, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 663
91,97, // "a"
108,513, // "u"
110,901, // "y"
  }
,
{ // state 664
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+119, // $NT
  }
,
{ // state 665
MIN_REDUCTION+355, // (default reduction)
  }
,
{ // state 666
2,158, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 667
0x80000000|691, // match move
0x80000000|1185, // no-match move
0x80000000|1511, // NT-test-match state for single_printable
  }
,
{ // state 668
105,358, // "f"
  }
,
{ // state 669
173,MIN_REDUCTION+199, // $NT
  }
,
{ // state 670
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 671
173,MIN_REDUCTION+241, // $NT
  }
,
{ // state 672
0x80000000|1, // match move
0x80000000|680, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 673
173,MIN_REDUCTION+196, // $NT
  }
,
{ // state 674
149,866, // digit
152,573, // {"0".."9"}
  }
,
{ // state 675
89,1097, // "c"
90,1097, // "l"
91,1097, // "a"
92,1097, // "s"
94,1097, // "e"
95,1097, // "b"
96,1097, // "o"
97,1097, // "n"
98,1097, // "x"
99,1097, // "t"
100,1097, // "d"
101,1097, // "v"
102,1097, // "i"
103,1097, // "w"
104,1097, // "h"
105,1097, // "f"
106,1097, // "r"
107,1097, // "k"
108,1097, // "u"
109,1097, // "p"
110,1097, // "y"
111,1097, // "m"
112,1097, // "g"
113,1097, // "z"
115,1097, // "!"
116,1097, // "="
117,1097, // "<"
118,1097, // ">"
119,1097, // "+"
120,1097, // "-"
121,1097, // "*"
122,1097, // "%"
123,1097, // "&"
124,1097, // "("
125,1097, // ")"
126,1097, // "{"
127,1097, // "}"
128,1097, // "["
129,1097, // "]"
130,1097, // "|"
131,1097, // "."
132,1097, // ","
133,1097, // ":"
134,1097, // ";"
136,1097, // "/"
142,1097, // '"'
148,1097, // "'"
150,1097, // "_"
151,1097, // {"A".."Z" "j" "q"}
152,1097, // {"0".."9"}
154,1097, // " "
155,1097, // {9 12}
158,1081, // single_printable
159,1097, // {"#".."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 676
99,945, // "t"
  }
,
{ // state 677
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 678
91,72, // "a"
  }
,
{ // state 679
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+163, // $NT
  }
,
{ // state 680
0x80000000|1512, // match move
0x80000000|302, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 681
173,MIN_REDUCTION+234, // $NT
  }
,
{ // state 682
97,768, // "n"
  }
,
{ // state 683
0x80000000|1, // match move
0x80000000|611, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 684
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 685
106,2, // "r"
  }
,
{ // state 686
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 687
0x80000000|279, // match move
0x80000000|867, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 688
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 689
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 690
2,1151, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 691
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 692
0x80000000|877, // match move
0x80000000|576, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 693
96,1045, // "o"
  }
,
{ // state 694
2,1029, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 695
2,466, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+124, // $NT
  }
,
{ // state 696
0x80000000|547, // match move
0x80000000|378, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 697
173,MIN_REDUCTION+335, // $NT
  }
,
{ // state 698
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 699
2,548, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 700
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 701
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 702
0x80000000|178, // match move
0x80000000|1289, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 703
173,MIN_REDUCTION+323, // $NT
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 704
2,129, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 705
89,283, // "c"
  }
,
{ // state 706
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 707
91,190, // "a"
  }
,
{ // state 708
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+155, // $NT
  }
,
{ // state 709
90,19, // "l"
102,79, // "i"
  }
,
{ // state 710
90,1299, // "l"
  }
,
{ // state 711
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 712
94,138, // "e"
  }
,
{ // state 713
173,MIN_REDUCTION+329, // $NT
  }
,
{ // state 714
2,776, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 715
0x80000000|791, // match move
0x80000000|75, // no-match move
0x80000000|1511, // NT-test-match state for single_printable
  }
,
{ // state 716
105,1298, // "f"
  }
,
{ // state 717
106,1157, // "r"
  }
,
{ // state 718
2,635, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+180, // $NT
  }
,
{ // state 719
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 720
0x80000000|533, // match move
0x80000000|282, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 721
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 722
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 723
0x80000000|1, // match move
0x80000000|556, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 724
102,10, // "i"
  }
,
{ // state 725
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 726
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 727
0x80000000|1345, // match move
0x80000000|1246, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 728
2,621, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 729
0x80000000|772, // match move
0x80000000|193, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 730
0x80000000|1, // match move
0x80000000|718, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 731
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 732
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+111, // $NT
  }
,
{ // state 733
2,5, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 734
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 735
105,1034, // "f"
  }
,
{ // state 736
94,162, // "e"
  }
,
{ // state 737
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 738
2,1265, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+170, // $NT
  }
,
{ // state 739
0x80000000|775, // match move
0x80000000|228, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 740
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+115, // $NT
  }
,
{ // state 741
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 742
92,1154, // "s"
  }
,
{ // state 743
91,386, // "a"
  }
,
{ // state 744
0x80000000|1444, // match move
0x80000000|818, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 745
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 746
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+139, // $NT
  }
,
{ // state 747
0x80000000|1, // match move
0x80000000|738, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 748
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 749
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 750
104,1270, // "h"
  }
,
{ // state 751
2,318, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+90, // $NT
  }
,
{ // state 752
103,353, // "w"
  }
,
{ // state 753
0x80000000|1, // match move
0x80000000|581, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 754
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 755
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 756
89,1026, // "c"
  }
,
{ // state 757
0x80000000|1483, // match move
0x80000000|583, // no-match move
// T-test match for "-":
120,
  }
,
{ // state 758
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 759
2,739, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 760
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 761
0x80000000|1, // match move
0x80000000|610, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 762
173,MIN_REDUCTION+238, // $NT
  }
,
{ // state 763
0x80000000|960, // match move
0x80000000|298, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 764
99,161, // "t"
  }
,
{ // state 765
0x80000000|495, // match move
0x80000000|1412, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 766
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 767
97,128, // "n"
  }
,
{ // state 768
0x80000000|1, // match move
0x80000000|828, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 769
99,333, // "t"
  }
,
{ // state 770
99,593, // "t"
  }
,
{ // state 771
92,433, // "s"
  }
,
{ // state 772
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 773
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 774
0x80000000|1, // match move
0x80000000|984, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 775
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 776
0x80000000|348, // match move
0x80000000|864, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 777
0x80000000|1, // match move
0x80000000|1355, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 778
99,668, // "t"
  }
,
{ // state 779
2,793, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 780
94,683, // "e"
  }
,
{ // state 781
121,1318, // "*"
  }
,
{ // state 782
94,267, // "e"
  }
,
{ // state 783
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 784
2,324, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+110, // $NT
  }
,
{ // state 785
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 786
94,499, // "e"
  }
,
{ // state 787
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 788
104,1146, // "h"
  }
,
{ // state 789
0x80000000|1, // match move
0x80000000|841, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 790
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 791
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 792
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 793
0x80000000|67, // match move
0x80000000|748, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 794
0x80000000|1, // match move
0x80000000|1046, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 795
0x80000000|1, // match move
0x80000000|812, // no-match move
// T-test match for "/":
136,
  }
,
{ // state 796
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 797
97,172, // "n"
  }
,
{ // state 798
91,38, // "a"
106,1232, // "r"
108,230, // "u"
  }
,
{ // state 799
92,817, // "s"
99,524, // "t"
  }
,
{ // state 800
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 801
96,157, // "o"
  }
,
{ // state 802
89,1109, // "c"
90,1109, // "l"
91,1109, // "a"
92,1109, // "s"
93,1365, // idChar
94,1109, // "e"
95,1109, // "b"
96,1109, // "o"
97,1109, // "n"
98,1109, // "x"
99,1109, // "t"
100,1109, // "d"
101,1109, // "v"
102,1109, // "i"
103,1109, // "w"
104,1109, // "h"
105,1109, // "f"
106,1109, // "r"
107,1109, // "k"
108,1109, // "u"
109,1109, // "p"
110,1109, // "y"
111,1109, // "m"
112,1109, // "g"
113,1109, // "z"
138,813, // letter
149,497, // digit
150,460, // "_"
151,1109, // {"A".."Z" "j" "q"}
152,763, // {"0".."9"}
  }
,
{ // state 803
107,1213, // "k"
  }
,
{ // state 804
5,110, // `boolean
6,226, // `class
7,558, // `extends
8,669, // `void
9,1344, // `int
10,1212, // `while
11,1235, // `if
12,673, // `else
13,100, // `for
14,51, // `break
15,39, // `this
16,1275, // `false
17,900, // `true
18,529, // `super
19,912, // `null
20,1037, // `return
21,1164, // `instanceof
22,1493, // `new
23,951, // `abstract
24,865, // `assert
25,1296, // `byte
26,377, // `case
27,1480, // `catch
28,1360, // `char
29,629, // `const
30,184, // `continue
31,918, // `default
32,504, // `do
33,218, // `double
34,1082, // `enum
35,343, // `final
36,351, // `finally
37,365, // `float
38,1472, // `goto
39,805, // `implements
40,167, // `import
41,1134, // `interface
42,998, // `long
43,63, // `native
44,681, // `package
45,287, // `private
46,1197, // `protected
47,132, // `public
48,762, // `short
49,18, // `static
50,943, // `strictfp
51,671, // `switch
52,1262, // `synchronized
53,1098, // `throw
54,1456, // `throws
55,488, // `transient
56,1279, // `try
57,540, // `volatile
89,845, // "c"
90,908, // "l"
91,169, // "a"
92,328, // "s"
94,501, // "e"
95,1008, // "b"
97,1215, // "n"
99,1378, // "t"
100,142, // "d"
101,1364, // "v"
102,1489, // "i"
103,559, // "w"
105,1453, // "f"
106,1487, // "r"
109,798, // "p"
112,555, // "g"
  }
,
{ // state 805
173,MIN_REDUCTION+229, // $NT
  }
,
{ // state 806
0x80000000|1408, // match move
0x80000000|1522, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 807
2,659, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 808
121,197, // "*"
164,1339, // comment_stuff**
170,1040, // comment_stuff*
  }
,
{ // state 809
0x80000000|661, // match move
0x80000000|585, // no-match move
0x80000000|1511, // NT-test-match state for single_printable
  }
,
{ // state 810
0x80000000|1390, // match move
0x80000000|1367, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 811
0x80000000|802, // match move
0x80000000|415, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 812
0x80000000|1254, // match move
0x80000000|974, // no-match move
0x80000000|637, // NT-test-match state for comment_stuff
  }
,
{ // state 813
0x80000000|1096, // match move
0x80000000|1470, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 814
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 815
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 816
0x80000000|1075, // match move
0x80000000|33, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 817
94,614, // "e"
  }
,
{ // state 818
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 819
99,308, // "t"
  }
,
{ // state 820
102,366, // "i"
  }
,
{ // state 821
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 822
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 823
2,335, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+176, // $NT
  }
,
{ // state 824
0x80000000|209, // match move
0x80000000|1285, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 825
89,47, // "c"
  }
,
{ // state 826
0x80000000|125, // match move
0x80000000|248, // no-match move
0x80000000|637, // NT-test-match state for comment_stuff
  }
,
{ // state 827
0x80000000|625, // match move
0x80000000|11, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 828
2,55, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+94, // $NT
  }
,
{ // state 829
0x80000000|1, // match move
0x80000000|439, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 830
0x80000000|675, // match move
0x80000000|509, // no-match move
0x80000000|1511, // NT-test-match state for single_printable
  }
,
{ // state 831
142,1297, // '"'
  }
,
{ // state 832
90,710, // "l"
  }
,
{ // state 833
MIN_REDUCTION+354, // (default reduction)
  }
,
{ // state 834
0x80000000|1, // match move
0x80000000|496, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 835
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 836
172,MIN_REDUCTION+0, // $
  }
,
{ // state 837
0x80000000|550, // match move
0x80000000|1241, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 838
0x80000000|62, // match move
0x80000000|981, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 839
173,MIN_REDUCTION+347, // $NT
  }
,
{ // state 840
91,428, // "a"
  }
,
{ // state 841
2,1162, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+92, // $NT
  }
,
{ // state 842
92,334, // "s"
  }
,
{ // state 843
2,404, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 844
106,1086, // "r"
  }
,
{ // state 845
90,1312, // "l"
91,799, // "a"
96,214, // "o"
104,1222, // "h"
  }
,
{ // state 846
106,1428, // "r"
  }
,
{ // state 847
1,836, // start
2,1303, // white*
3,689, // $$0
4,863, // token
5,382, // `boolean
6,1184, // `class
7,688, // `extends
8,92, // `void
9,1336, // `int
10,1069, // `while
11,658, // `if
12,1400, // `else
13,199, // `for
14,1295, // `break
15,1131, // `this
16,83, // `false
17,322, // `true
18,861, // `super
19,288, // `null
20,1244, // `return
21,503, // `instanceof
22,1155, // `new
23,594, // `abstract
24,195, // `assert
25,151, // `byte
26,982, // `case
27,986, // `catch
28,1010, // `char
29,246, // `const
30,569, // `continue
31,1102, // `default
32,1153, // `do
33,1144, // `double
34,1315, // `enum
35,737, // `final
36,1228, // `finally
37,1462, // `float
38,367, // `goto
39,80, // `implements
40,16, // `import
41,942, // `interface
42,598, // `long
43,906, // `native
44,299, // `package
45,202, // `private
46,1278, // `protected
47,618, // `public
48,77, // `short
49,280, // `static
50,578, // `strictfp
51,922, // `switch
52,754, // `synchronized
53,1506, // `throw
54,1191, // `throws
55,252, // `transient
56,494, // `try
57,1064, // `volatile
89,551, // "c"
90,1423, // "l"
91,239, // "a"
92,357, // "s"
94,476, // "e"
95,402, // "b"
97,1514, // "n"
99,1149, // "t"
100,249, // "d"
101,331, // "v"
102,1024, // "i"
103,750, // "w"
105,563, // "f"
106,1022, // "r"
109,639, // "p"
112,1323, // "g"
167,824, // token*
172,MIN_REDUCTION+1, // $
  }
,
{ // state 848
99,24, // "t"
  }
,
{ // state 849
0x80000000|657, // match move
0x80000000|952, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 850
0x80000000|542, // match move
0x80000000|1308, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 851
0x80000000|1, // match move
0x80000000|1257, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 852
0x80000000|553, // match move
0x80000000|760, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 853
2,135, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 854
2,1016, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+102, // $NT
  }
,
{ // state 855
108,539, // "u"
  }
,
{ // state 856
2,1100, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 857
0x80000000|1036, // match move
0x80000000|733, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 858
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 859
89,535, // "c"
  }
,
{ // state 860
2,396, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+152, // $NT
  }
,
{ // state 861
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 862
2,584, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 863
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 864
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 865
173,MIN_REDUCTION+214, // $NT
  }
,
{ // state 866
0x80000000|1041, // match move
0x80000000|899, // no-match move
0x80000000|126, // NT-test-match state for digit
  }
,
{ // state 867
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 868
0x80000000|1, // match move
0x80000000|418, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 869
90,1111, // "l"
  }
,
{ // state 870
94,1517, // "e"
  }
,
{ // state 871
99,1392, // "t"
  }
,
{ // state 872
108,1356, // "u"
  }
,
{ // state 873
89,413, // "c"
90,413, // "l"
91,413, // "a"
92,413, // "s"
94,413, // "e"
95,413, // "b"
96,413, // "o"
97,413, // "n"
98,413, // "x"
99,413, // "t"
100,413, // "d"
101,413, // "v"
102,413, // "i"
103,413, // "w"
104,413, // "h"
105,413, // "f"
106,413, // "r"
107,413, // "k"
108,413, // "u"
109,413, // "p"
110,413, // "y"
111,413, // "m"
112,413, // "g"
113,413, // "z"
115,413, // "!"
116,413, // "="
117,413, // "<"
118,413, // ">"
119,413, // "+"
120,413, // "-"
121,795, // "*"
122,413, // "%"
123,413, // "&"
124,413, // "("
125,413, // ")"
126,413, // "{"
127,413, // "}"
128,413, // "["
129,413, // "]"
130,413, // "|"
131,413, // "."
132,413, // ","
133,413, // ":"
134,413, // ";"
136,413, // "/"
142,413, // '"'
148,413, // "'"
150,413, // "_"
151,413, // {"A".."Z" "j" "q"}
152,413, // {"0".."9"}
154,413, // " "
156,1050, // eol
159,413, // {"#".."$" "?".."@" "\" "^" "`" "~"}
161,826, // star
162,1471, // comment_printable
163,471, // comment_stuff
165,387, // {10}
166,1465, // {13}
  }
,
{ // state 874
0x80000000|1342, // match move
0x80000000|758, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 875
2,627, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 876
0x80000000|674, // match move
0x80000000|686, // no-match move
0x80000000|126, // NT-test-match state for digit
  }
,
{ // state 877
2,289, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 878
0x80000000|1, // match move
0x80000000|1229, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 879
0x80000000|187, // match move
0x80000000|1119, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 880
MIN_REDUCTION+345, // (default reduction)
  }
,
{ // state 881
106,253, // "r"
  }
,
{ // state 882
92,87, // "s"
  }
,
{ // state 883
2,1200, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 884
2,420, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+192, // $NT
  }
,
{ // state 885
0x80000000|1398, // match move
0x80000000|962, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 886
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+131, // $NT
  }
,
{ // state 887
0x80000000|944, // match move
0x80000000|22, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 888
0x80000000|1, // match move
0x80000000|933, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 889
94,434, // "e"
  }
,
{ // state 890
89,1324, // "c"
90,1324, // "l"
91,1324, // "a"
92,1324, // "s"
94,1324, // "e"
95,1324, // "b"
96,1324, // "o"
97,1324, // "n"
98,1324, // "x"
99,1324, // "t"
100,1324, // "d"
101,1324, // "v"
102,1324, // "i"
103,1324, // "w"
104,1324, // "h"
105,1324, // "f"
106,1324, // "r"
107,1324, // "k"
108,1324, // "u"
109,1324, // "p"
110,1324, // "y"
111,1324, // "m"
112,1324, // "g"
113,1324, // "z"
115,1324, // "!"
116,1324, // "="
117,1324, // "<"
118,1324, // ">"
119,1324, // "+"
120,1324, // "-"
121,1324, // "*"
122,1324, // "%"
123,1324, // "&"
124,1324, // "("
125,1324, // ")"
126,1324, // "{"
127,1324, // "}"
128,1324, // "["
129,1324, // "]"
130,1324, // "|"
131,1324, // "."
132,1324, // ","
133,1324, // ":"
134,1324, // ";"
136,1324, // "/"
142,1324, // '"'
148,1324, // "'"
150,1324, // "_"
151,1324, // {"A".."Z" "j" "q"}
152,1324, // {"0".."9"}
154,1324, // " "
155,1324, // {9 12}
158,131, // single_printable
159,1324, // {"#".."$" "?".."@" "\" "^" "`" "~"}
160,127, // single_printable**
171,1206, // single_printable*
  }
,
{ // state 891
173,MIN_REDUCTION+346, // $NT
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 892
0x80000000|1, // match move
0x80000000|13, // no-match move
// T-test match for "/":
136,
  }
,
{ // state 893
0x80000000|270, // match move
0x80000000|1158, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 894
0x80000000|1132, // match move
0x80000000|1377, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 895
106,36, // "r"
  }
,
{ // state 896
0x80000000|1161, // match move
0x80000000|54, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 897
2,265, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+188, // $NT
  }
,
{ // state 898
0x80000000|81, // match move
0x80000000|919, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 899
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 900
173,MIN_REDUCTION+207, // $NT
  }
,
{ // state 901
0x80000000|1, // match move
0x80000000|884, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 902
2,1168, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+154, // $NT
  }
,
{ // state 903
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 904
0x80000000|191, // match move
0x80000000|381, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 905
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 906
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 907
0x80000000|1, // match move
0x80000000|897, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 908
96,408, // "o"
  }
,
{ // state 909
0x80000000|1414, // match move
0x80000000|741, // no-match move
0x80000000|637, // NT-test-match state for comment_stuff
  }
,
{ // state 910
0x80000000|1, // match move
0x80000000|784, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 911
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 912
173,MIN_REDUCTION+209, // $NT
  }
,
{ // state 913
89,1097, // "c"
90,1097, // "l"
91,1097, // "a"
92,1097, // "s"
94,1097, // "e"
95,1097, // "b"
96,1097, // "o"
97,1097, // "n"
98,1097, // "x"
99,1097, // "t"
100,1097, // "d"
101,1097, // "v"
102,1097, // "i"
103,1097, // "w"
104,1097, // "h"
105,1097, // "f"
106,1097, // "r"
107,1097, // "k"
108,1097, // "u"
109,1097, // "p"
110,1097, // "y"
111,1097, // "m"
112,1097, // "g"
113,1097, // "z"
115,1097, // "!"
116,1097, // "="
117,1097, // "<"
118,1097, // ">"
119,1097, // "+"
120,1097, // "-"
121,1097, // "*"
122,1097, // "%"
123,1097, // "&"
124,1097, // "("
125,1097, // ")"
126,1097, // "{"
127,1097, // "}"
128,1097, // "["
129,1097, // "]"
130,1097, // "|"
131,1097, // "."
132,1097, // ","
133,1097, // ":"
134,1097, // ";"
136,1097, // "/"
142,1097, // '"'
148,1097, // "'"
150,1097, // "_"
151,1097, // {"A".."Z" "j" "q"}
152,1097, // {"0".."9"}
154,1097, // " "
155,1097, // {9 12}
158,965, // single_printable
159,1097, // {"#".."$" "?".."@" "\" "^" "`" "~"}
160,370, // single_printable**
171,830, // single_printable*
  }
,
{ // state 914
102,1376, // "i"
  }
,
{ // state 915
92,1011, // "s"
99,354, // "t"
  }
,
{ // state 916
105,281, // "f"
  }
,
{ // state 917
2,1433, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 918
173,MIN_REDUCTION+221, // $NT
  }
,
{ // state 919
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 920
2,498, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 921
94,1150, // "e"
  }
,
{ // state 922
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 923
0x80000000|489, // match move
0x80000000|423, // no-match move
0x80000000|1511, // NT-test-match state for single_printable
  }
,
{ // state 924
96,1178, // "o"
  }
,
{ // state 925
99,1482, // "t"
  }
,
{ // state 926
0x80000000|736, // match move
0x80000000|430, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 927
99,995, // "t"
  }
,
{ // state 928
0x80000000|699, // match move
0x80000000|359, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 929
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 930
2,352, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 931
0x80000000|1160, // match move
0x80000000|1094, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 932
165,372, // {10}
  }
,
{ // state 933
0x80000000|1422, // match move
0x80000000|440, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 934
0x80000000|1, // match move
0x80000000|902, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 935
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 936
107,314, // "k"
  }
,
{ // state 937
2,744, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 938
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+113, // $NT
  }
,
{ // state 939
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 940
102,612, // "i"
  }
,
{ // state 941
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 942
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 943
173,MIN_REDUCTION+240, // $NT
  }
,
{ // state 944
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 945
94,147, // "e"
  }
,
{ // state 946
2,1121, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 947
96,678, // "o"
  }
,
{ // state 948
2,729, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 949
0x80000000|1371, // match move
0x80000000|1192, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 950
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 951
173,MIN_REDUCTION+213, // $NT
  }
,
{ // state 952
2,182, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 953
91,705, // "a"
  }
,
{ // state 954
113,653, // "z"
  }
,
{ // state 955
0x80000000|1, // match move
0x80000000|896, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 956
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 957
2,1170, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 958
0x80000000|1500, // match move
0x80000000|112, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 959
0x80000000|890, // match move
0x80000000|455, // no-match move
0x80000000|1511, // NT-test-match state for single_printable
  }
,
{ // state 960
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 961
0x80000000|486, // match move
0x80000000|508, // no-match move
0x80000000|637, // NT-test-match state for comment_stuff
  }
,
{ // state 962
2,1277, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 963
0x80000000|1, // match move
0x80000000|1052, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 964
2,687, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 965
0x80000000|691, // match move
0x80000000|437, // no-match move
0x80000000|1511, // NT-test-match state for single_printable
  }
,
{ // state 966
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+193, // $NT
  }
,
{ // state 967
2,160, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 968
139,MIN_REDUCTION+318, // idChar**
150,MIN_REDUCTION+318, // "_"
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 969
0x80000000|932, // match move
0x80000000|1237, // no-match move
// T-test match for 10:
165,
  }
,
{ // state 970
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 971
94,517, // "e"
  }
,
{ // state 972
3,9, // $$0
4,863, // token
135,469, // comment
136,41, // "/"
153,1028, // white
154,656, // " "
155,656, // {9 12}
157,959, // ds
167,824, // token*
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 973
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 974
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 975
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 976
94,753, // "e"
  }
,
{ // state 977
2,938, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+114, // $NT
  }
,
{ // state 978
2,1105, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+122, // $NT
  }
,
{ // state 979
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 980
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 981
2,607, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 982
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 983
89,1379, // "c"
90,1379, // "l"
91,1379, // "a"
92,1379, // "s"
94,1379, // "e"
95,1379, // "b"
96,1379, // "o"
97,1379, // "n"
98,1379, // "x"
99,1379, // "t"
100,1379, // "d"
101,1379, // "v"
102,1379, // "i"
103,1379, // "w"
104,1379, // "h"
105,1379, // "f"
106,1379, // "r"
107,1379, // "k"
108,1379, // "u"
109,1379, // "p"
110,1379, // "y"
111,1379, // "m"
112,1379, // "g"
113,1379, // "z"
115,1379, // "!"
116,1379, // "="
117,1379, // "<"
118,1379, // ">"
119,1379, // "+"
120,1379, // "-"
121,1379, // "*"
122,1379, // "%"
123,1379, // "&"
124,1379, // "("
125,1379, // ")"
126,1379, // "{"
127,1379, // "}"
128,1379, // "["
129,1379, // "]"
130,1379, // "|"
131,1379, // "."
132,1379, // ","
133,1379, // ":"
134,1379, // ";"
136,1379, // "/"
142,1379, // '"'
144,342, // printable
148,1379, // "'"
150,1379, // "_"
151,1379, // {"A".."Z" "j" "q"}
152,1379, // {"0".."9"}
154,1379, // " "
159,1379, // {"#".."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 984
2,602, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+166, // $NT
  }
,
{ // state 985
102,1507, // "i"
  }
,
{ // state 986
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 987
123,403, // "&"
  }
,
{ // state 988
2,1334, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 989
0x80000000|1, // match move
0x80000000|838, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 990
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 991
89,398, // "c"
  }
,
{ // state 992
97,1346, // "n"
  }
,
{ // state 993
96,577, // "o"
  }
,
{ // state 994
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 995
0x80000000|1, // match move
0x80000000|823, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 996
0x80000000|970, // match move
0x80000000|1130, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 997
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 998
173,MIN_REDUCTION+232, // $NT
  }
,
{ // state 999
102,14, // "i"
  }
,
{ // state 1000
0x80000000|1, // match move
0x80000000|978, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 1001
102,1452, // "i"
  }
,
{ // state 1002
173,MIN_REDUCTION+324, // $NT
  }
,
{ // state 1003
0x80000000|1085, // match move
0x80000000|728, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1004
0x80000000|1136, // match move
0x80000000|1508, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1005
0x80000000|1, // match move
0x80000000|1017, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 1006
91,1239, // "a"
  }
,
{ // state 1007
108,8, // "u"
  }
,
{ // state 1008
96,478, // "o"
106,1381, // "r"
110,505, // "y"
  }
,
{ // state 1009
0x80000000|1375, // match move
0x80000000|1226, // no-match move
0x80000000|831, // NT-test-match state for dq
  }
,
{ // state 1010
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 1011
99,1110, // "t"
  }
,
{ // state 1012
136,MIN_REDUCTION+323, // "/"
153,MIN_REDUCTION+323, // white
154,MIN_REDUCTION+323, // " "
155,MIN_REDUCTION+323, // {9 12}
165,MIN_REDUCTION+323, // {10}
166,MIN_REDUCTION+323, // {13}
173,MIN_REDUCTION+323, // $NT
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 1013
0x80000000|340, // match move
0x80000000|980, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1014
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 1015
99,724, // "t"
  }
,
{ // state 1016
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+101, // $NT
  }
,
{ // state 1017
2,337, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+108, // $NT
  }
,
{ // state 1018
0x80000000|862, // match move
0x80000000|604, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1019
2,467, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 1020
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 1021
2,898, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1022
94,406, // "e"
  }
,
{ // state 1023
97,35, // "n"
  }
,
{ // state 1024
97,1088, // "n"
105,1294, // "f"
111,1389, // "m"
  }
,
{ // state 1025
121,417, // "*"
136,459, // "/"
  }
,
{ // state 1026
0x80000000|1, // match move
0x80000000|816, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 1027
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+189, // $NT
  }
,
{ // state 1028
MIN_REDUCTION+345, // (default reduction)
  }
,
{ // state 1029
0x80000000|648, // match move
0x80000000|532, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1030
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 1031
2,852, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 1032
173,MIN_REDUCTION+332, // $NT
  }
,
{ // state 1033
173,MIN_REDUCTION+330, // $NT
  }
,
{ // state 1034
91,872, // "a"
  }
,
{ // state 1035
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+125, // $NT
  }
,
{ // state 1036
2,5, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 1037
173,MIN_REDUCTION+210, // $NT
  }
,
{ // state 1038
0x80000000|1183, // match move
0x80000000|1403, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1039
91,148, // "a"
  }
,
{ // state 1040
0x80000000|873, // match move
0x80000000|1463, // no-match move
0x80000000|637, // NT-test-match state for comment_stuff
  }
,
{ // state 1041
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 1042
91,454, // "a"
  }
,
{ // state 1043
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+95, // $NT
  }
,
{ // state 1044
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+97, // $NT
  }
,
{ // state 1045
103,139, // "w"
  }
,
{ // state 1046
0x80000000|1358, // match move
0x80000000|330, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1047
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 1048
92,412, // "s"
  }
,
{ // state 1049
0x80000000|988, // match move
0x80000000|1435, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1050
0x80000000|1245, // match move
0x80000000|835, // no-match move
0x80000000|637, // NT-test-match state for comment_stuff
  }
,
{ // state 1051
107,707, // "k"
  }
,
{ // state 1052
2,373, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+104, // $NT
  }
,
{ // state 1053
97,723, // "n"
  }
,
{ // state 1054
94,774, // "e"
  }
,
{ // state 1055
92,1059, // "s"
  }
,
{ // state 1056
0x80000000|462, // match move
0x80000000|464, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1057
102,521, // "i"
106,1205, // "r"
  }
,
{ // state 1058
2,996, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 1059
0x80000000|1, // match move
0x80000000|751, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 1060
0x80000000|766, // match move
0x80000000|654, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1061
0x80000000|25, // match move
0x80000000|1188, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1062
165,697, // {10}
  }
,
{ // state 1063
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 1064
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 1065
99,405, // "t"
  }
,
{ // state 1066
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+127, // $NT
  }
,
{ // state 1067
0x80000000|235, // match move
0x80000000|929, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1068
2,740, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+116, // $NT
  }
,
{ // state 1069
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 1070
2,776, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 1071
0x80000000|152, // match move
0x80000000|119, // no-match move
0x80000000|1511, // NT-test-match state for single_printable
  }
,
{ // state 1072
91,115, // "a"
  }
,
{ // state 1073
2,1029, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 1074
-1, // $$start
836, // start
1303, // white*
689, // $$0
863, // token
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
956, // `!
1252, // `!=
1208, // `%
734, // `&&
1450, // `*
1101, // `(
1253, // `)
260, // `{
1220, // `}
123, // `-
284, // `+
1411, // `=
645, // `==
905, // `[
491, // `]
502, // `||
796, // `<
814, // `<=
745, // `,
749, // `>
1242, // `>=
670, // `.
1120, // `;
1176, // `++
1087, // `--
950, // `/
1416, // `:
941, // ID
1291, // INT_LITERAL
677, // STRING_LITERAL
307, // CHARACTER_LITERAL
1179, // "c"
1179, // "l"
1179, // "a"
1179, // "s"
-1, // idChar
1179, // "e"
1179, // "b"
1179, // "o"
1179, // "n"
1179, // "x"
1179, // "t"
1179, // "d"
1179, // "v"
1179, // "i"
1179, // "w"
1179, // "h"
1179, // "f"
1179, // "r"
1179, // "k"
1179, // "u"
1179, // "p"
1179, // "y"
1179, // "m"
1179, // "g"
1179, // "z"
-1, // reserved
360, // "!"
37, // "="
435, // "<"
662, // ">"
1479, // "+"
757, // "-"
850, // "*"
1003, // "%"
987, // "&"
189, // "("
1061, // ")"
1338, // "{"
1049, // "}"
1189, // "["
692, // "]"
257, // "|"
727, // "."
1145, // ","
12, // ":"
609, // ";"
-1, // comment
30, // "/"
1357, // identifier
27, // letter
-1, // idChar**
225, // digit++
1009, // dq
40, // '"'
-1, // stringChar
-1, // printable
-1, // stringChar*
-1, // $$1
983, // sq
821, // "'"
294, // digit
-1, // "_"
1179, // {"A".."Z" "j" "q"}
573, // {"0".."9"}
911, // white
656, // " "
656, // {9 12}
1112, // eol
-1, // ds
-1, // single_printable
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
-1, // single_printable**
-1, // star
-1, // comment_printable
-1, // comment_stuff
-1, // comment_stuff**
1496, // {10}
969, // {13}
824, // token*
876, // digit+
-1, // idChar*
-1, // comment_stuff*
-1, // single_printable*
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 1075
2,1004, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 1076
92,1405, // "s"
99,940, // "t"
  }
,
{ // state 1077
113,1199, // "z"
  }
,
{ // state 1078
165,1166, // {10}
  }
,
{ // state 1079
90,261, // "l"
  }
,
{ // state 1080
94,1425, // "e"
  }
,
{ // state 1081
0x80000000|489, // match move
0x80000000|1251, // no-match move
0x80000000|1511, // NT-test-match state for single_printable
  }
,
{ // state 1082
173,MIN_REDUCTION+224, // $NT
  }
,
{ // state 1083
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 1084
2,305, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 1085
2,621, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 1086
0x80000000|1, // match move
0x80000000|1068, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 1087
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1088
92,1249, // "s"
99,484, // "t"
  }
,
{ // state 1089
90,1464, // "l"
  }
,
{ // state 1090
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 1091
0x80000000|516, // match move
0x80000000|153, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1092
91,1410, // "a"
106,223, // "r"
  }
,
{ // state 1093
90,472, // "l"
96,881, // "o"
  }
,
{ // state 1094
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 1095
2,74, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 1096
MIN_REDUCTION+315, // (default reduction)
  }
,
{ // state 1097
0x80000000|791, // match move
0x80000000|1407, // no-match move
0x80000000|1511, // NT-test-match state for single_printable
  }
,
{ // state 1098
173,MIN_REDUCTION+243, // $NT
  }
,
{ // state 1099
2,129, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 1100
0x80000000|392, // match move
0x80000000|207, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1101
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 1102
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 1103
106,1039, // "r"
  }
,
{ // state 1104
103,566, // "w"
  }
,
{ // state 1105
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+121, // $NT
  }
,
{ // state 1106
0x80000000|935, // match move
0x80000000|633, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1107
110,1255, // "y"
  }
,
{ // state 1108
0x80000000|1, // match move
0x80000000|1436, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 1109
0x80000000|278, // match move
0x80000000|755, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 1110
0x80000000|1, // match move
0x80000000|1391, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 1111
94,350, // "e"
  }
,
{ // state 1112
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 1113
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 1114
2,467, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 1115
165,909, // {10}
  }
,
{ // state 1116
2,1394, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 1117
99,1048, // "t"
  }
,
{ // state 1118
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 1119
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 1120
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 1121
0x80000000|1083, // match move
0x80000000|990, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1122
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 1123
141,1491, // dq
142,1306, // '"'
146,790, // $$1
  }
,
{ // state 1124
2,256, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 1125
0x80000000|1, // match move
0x80000000|1418, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 1126
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 1127
95,1079, // "b"
  }
,
{ // state 1128
2,400, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+118, // $NT
  }
,
{ // state 1129
136,1032, // "/"
  }
,
{ // state 1130
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 1131
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 1132
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 1133
160,370, // single_printable**
171,830, // single_printable*
173,MIN_REDUCTION+326, // $NT
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 1134
173,MIN_REDUCTION+231, // $NT
  }
,
{ // state 1135
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 1136
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 1137
173,MIN_REDUCTION+345, // $NT
MIN_REDUCTION+345, // (default reduction)
  }
,
{ // state 1138
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 1139
0x80000000|414, // match move
0x80000000|149, // no-match move
0x80000000|1511, // NT-test-match state for single_printable
  }
,
{ // state 1140
MIN_REDUCTION+354, // (default reduction)
  }
,
{ // state 1141
MIN_REDUCTION+355, // (default reduction)
  }
,
{ // state 1142
0x80000000|1, // match move
0x80000000|1248, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 1143
2,1100, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 1144
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 1145
0x80000000|201, // match move
0x80000000|1461, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1146
0x80000000|1, // match move
0x80000000|326, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 1147
94,596, // "e"
  }
,
{ // state 1148
2,732, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+112, // $NT
  }
,
{ // state 1149
104,242, // "h"
106,1366, // "r"
  }
,
{ // state 1150
106,306, // "r"
  }
,
{ // state 1151
0x80000000|421, // match move
0x80000000|606, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1152
0x80000000|549, // match move
0x80000000|783, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1153
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 1154
102,215, // "i"
  }
,
{ // state 1155
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 1156
89,413, // "c"
90,413, // "l"
91,413, // "a"
92,413, // "s"
94,413, // "e"
95,413, // "b"
96,413, // "o"
97,413, // "n"
98,413, // "x"
99,413, // "t"
100,413, // "d"
101,413, // "v"
102,413, // "i"
103,413, // "w"
104,413, // "h"
105,413, // "f"
106,413, // "r"
107,413, // "k"
108,413, // "u"
109,413, // "p"
110,413, // "y"
111,413, // "m"
112,413, // "g"
113,413, // "z"
115,413, // "!"
116,413, // "="
117,413, // "<"
118,413, // ">"
119,413, // "+"
120,413, // "-"
121,795, // "*"
122,413, // "%"
123,413, // "&"
124,413, // "("
125,413, // ")"
126,413, // "{"
127,413, // "}"
128,413, // "["
129,413, // "]"
130,413, // "|"
131,413, // "."
132,413, // ","
133,413, // ":"
134,413, // ";"
136,413, // "/"
142,413, // '"'
148,413, // "'"
150,413, // "_"
151,413, // {"A".."Z" "j" "q"}
152,413, // {"0".."9"}
154,413, // " "
156,1050, // eol
159,413, // {"#".."$" "?".."@" "\" "^" "`" "~"}
161,826, // star
162,1471, // comment_printable
163,424, // comment_stuff
164,1431, // comment_stuff**
165,387, // {10}
166,1465, // {13}
170,1040, // comment_stuff*
  }
,
{ // state 1157
0x80000000|1, // match move
0x80000000|1018, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 1158
2,1196, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+144, // $NT
  }
,
{ // state 1159
2,1305, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 1160
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 1161
2,57, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 1162
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+91, // $NT
  }
,
{ // state 1163
0x80000000|390, // match move
0x80000000|216, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1164
173,MIN_REDUCTION+211, // $NT
  }
,
{ // state 1165
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 1166
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 1167
2,546, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+134, // $NT
  }
,
{ // state 1168
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+153, // $NT
  }
,
{ // state 1169
2,1316, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+136, // $NT
  }
,
{ // state 1170
0x80000000|296, // match move
0x80000000|541, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1171
111,712, // "m"
  }
,
{ // state 1172
91,1015, // "a"
106,103, // "r"
  }
,
{ // state 1173
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 1174
108,473, // "u"
  }
,
{ // state 1175
106,927, // "r"
  }
,
{ // state 1176
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 1177
0x80000000|1, // match move
0x80000000|1332, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 1178
97,1481, // "n"
  }
,
{ // state 1179
0x80000000|725, // match move
0x80000000|968, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 1180
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 1181
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 1182
106,1516, // "r"
  }
,
{ // state 1183
2,1271, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 1184
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 1185
173,MIN_REDUCTION+351, // $NT
  }
,
{ // state 1186
0x80000000|1, // match move
0x80000000|1167, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 1187
90,976, // "l"
  }
,
{ // state 1188
2,1261, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 1189
0x80000000|1194, // match move
0x80000000|579, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1190
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 1191
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 1192
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 1193
139,1118, // idChar**
169,811, // idChar*
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 1194
2,630, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 1195
96,1072, // "o"
  }
,
{ // state 1196
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+143, // $NT
  }
,
{ // state 1197
173,MIN_REDUCTION+236, // $NT
  }
,
{ // state 1198
0x80000000|1, // match move
0x80000000|977, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 1199
94,589, // "e"
  }
,
{ // state 1200
0x80000000|721, // match move
0x80000000|452, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1201
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 1202
2,739, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 1203
108,3, // "u"
  }
,
{ // state 1204
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 1205
96,493, // "o"
  }
,
{ // state 1206
0x80000000|1209, // match move
0x80000000|1477, // no-match move
0x80000000|1511, // NT-test-match state for single_printable
  }
,
{ // state 1207
99,586, // "t"
  }
,
{ // state 1208
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 1209
89,1324, // "c"
90,1324, // "l"
91,1324, // "a"
92,1324, // "s"
94,1324, // "e"
95,1324, // "b"
96,1324, // "o"
97,1324, // "n"
98,1324, // "x"
99,1324, // "t"
100,1324, // "d"
101,1324, // "v"
102,1324, // "i"
103,1324, // "w"
104,1324, // "h"
105,1324, // "f"
106,1324, // "r"
107,1324, // "k"
108,1324, // "u"
109,1324, // "p"
110,1324, // "y"
111,1324, // "m"
112,1324, // "g"
113,1324, // "z"
115,1324, // "!"
116,1324, // "="
117,1324, // "<"
118,1324, // ">"
119,1324, // "+"
120,1324, // "-"
121,1324, // "*"
122,1324, // "%"
123,1324, // "&"
124,1324, // "("
125,1324, // ")"
126,1324, // "{"
127,1324, // "}"
128,1324, // "["
129,1324, // "]"
130,1324, // "|"
131,1324, // "."
132,1324, // ","
133,1324, // ":"
134,1324, // ";"
136,1324, // "/"
142,1324, // '"'
148,1324, // "'"
150,1324, // "_"
151,1324, // {"A".."Z" "j" "q"}
152,1324, // {"0".."9"}
154,1324, // " "
155,1324, // {9 12}
158,325, // single_printable
159,1324, // {"#".."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 1210
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 1211
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 1212
173,MIN_REDUCTION+201, // $NT
  }
,
{ // state 1213
0x80000000|1, // match move
0x80000000|1362, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 1214
0x80000000|1, // match move
0x80000000|1169, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 1215
91,1260, // "a"
94,1104, // "e"
108,832, // "u"
  }
,
{ // state 1216
96,506, // "o"
  }
,
{ // state 1217
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 1218
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 1219
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
410, // token
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
956, // `!
1252, // `!=
1208, // `%
734, // `&&
1450, // `*
1101, // `(
1253, // `)
260, // `{
1220, // `}
123, // `-
284, // `+
1411, // `=
645, // `==
905, // `[
491, // `]
502, // `||
796, // `<
814, // `<=
745, // `,
749, // `>
1242, // `>=
670, // `.
1120, // `;
1176, // `++
1087, // `--
950, // `/
1416, // `:
941, // ID
1291, // INT_LITERAL
677, // STRING_LITERAL
307, // CHARACTER_LITERAL
1179, // "c"
1179, // "l"
1179, // "a"
1179, // "s"
-1, // idChar
1179, // "e"
1179, // "b"
1179, // "o"
1179, // "n"
1179, // "x"
1179, // "t"
1179, // "d"
1179, // "v"
1179, // "i"
1179, // "w"
1179, // "h"
1179, // "f"
1179, // "r"
1179, // "k"
1179, // "u"
1179, // "p"
1179, // "y"
1179, // "m"
1179, // "g"
1179, // "z"
-1, // reserved
360, // "!"
37, // "="
435, // "<"
662, // ">"
1479, // "+"
757, // "-"
850, // "*"
1003, // "%"
987, // "&"
189, // "("
1061, // ")"
1338, // "{"
1049, // "}"
1189, // "["
692, // "]"
257, // "|"
727, // "."
1145, // ","
12, // ":"
609, // ";"
-1, // comment
30, // "/"
1357, // identifier
27, // letter
-1, // idChar**
225, // digit++
1009, // dq
40, // '"'
-1, // stringChar
-1, // printable
-1, // stringChar*
-1, // $$1
983, // sq
821, // "'"
294, // digit
-1, // "_"
1179, // {"A".."Z" "j" "q"}
573, // {"0".."9"}
-1, // white
-1, // " "
-1, // {9 12}
-1, // eol
-1, // ds
-1, // single_printable
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
-1, // single_printable**
-1, // star
-1, // comment_printable
-1, // comment_stuff
-1, // comment_stuff**
-1, // {10}
-1, // {13}
-1, // token*
876, // digit+
-1, // idChar*
-1, // comment_stuff*
-1, // single_printable*
MIN_REDUCTION+356, // $
-1, // $NT
  }
,
{ // state 1220
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 1221
2,729, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 1222
91,1404, // "a"
  }
,
{ // state 1223
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 1224
89,574, // "c"
  }
,
{ // state 1225
MIN_REDUCTION+352, // (default reduction)
  }
,
{ // state 1226
89,1180, // "c"
90,1180, // "l"
91,1180, // "a"
92,1180, // "s"
94,1180, // "e"
95,1180, // "b"
96,1180, // "o"
97,1180, // "n"
98,1180, // "x"
99,1180, // "t"
100,1180, // "d"
101,1180, // "v"
102,1180, // "i"
103,1180, // "w"
104,1180, // "h"
105,1180, // "f"
106,1180, // "r"
107,1180, // "k"
108,1180, // "u"
109,1180, // "p"
110,1180, // "y"
111,1180, // "m"
112,1180, // "g"
113,1180, // "z"
115,1180, // "!"
116,1180, // "="
117,1180, // "<"
118,1180, // ">"
119,1180, // "+"
120,1180, // "-"
121,1180, // "*"
122,1180, // "%"
123,1180, // "&"
124,1180, // "("
125,1180, // ")"
126,1180, // "{"
127,1180, // "}"
128,1180, // "["
129,1180, // "]"
130,1180, // "|"
131,1180, // "."
132,1180, // ","
133,1180, // ":"
134,1180, // ";"
136,1180, // "/"
142,1180, // '"'
143,238, // stringChar
144,597, // printable
145,544, // stringChar*
146,1173, // $$1
148,1180, // "'"
150,1180, // "_"
151,1180, // {"A".."Z" "j" "q"}
152,1180, // {"0".."9"}
154,1180, // " "
159,1180, // {"#".."$" "?".."@" "\" "^" "`" "~"}
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
{ // state 1227
2,352, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 1228
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 1229
0x80000000|243, // match move
0x80000000|651, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1230
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 1231
3,9, // $$0
4,863, // token
5,382, // `boolean
6,1184, // `class
7,688, // `extends
8,92, // `void
9,1336, // `int
10,1069, // `while
11,658, // `if
12,1400, // `else
13,199, // `for
14,1295, // `break
15,1131, // `this
16,83, // `false
17,322, // `true
18,861, // `super
19,288, // `null
20,1244, // `return
21,503, // `instanceof
22,1155, // `new
23,594, // `abstract
24,195, // `assert
25,151, // `byte
26,982, // `case
27,986, // `catch
28,1010, // `char
29,246, // `const
30,569, // `continue
31,1102, // `default
32,1153, // `do
33,1144, // `double
34,1315, // `enum
35,737, // `final
36,1228, // `finally
37,1462, // `float
38,367, // `goto
39,80, // `implements
40,16, // `import
41,942, // `interface
42,598, // `long
43,906, // `native
44,299, // `package
45,202, // `private
46,1278, // `protected
47,618, // `public
48,77, // `short
49,280, // `static
50,578, // `strictfp
51,922, // `switch
52,754, // `synchronized
53,1506, // `throw
54,1191, // `throws
55,252, // `transient
56,494, // `try
57,1064, // `volatile
89,551, // "c"
90,1423, // "l"
91,239, // "a"
92,357, // "s"
94,476, // "e"
95,402, // "b"
97,1514, // "n"
99,1149, // "t"
100,249, // "d"
101,331, // "v"
102,1024, // "i"
103,750, // "w"
105,563, // "f"
106,1022, // "r"
109,639, // "p"
112,1323, // "g"
167,824, // token*
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 1232
96,407, // "o"
102,1373, // "i"
  }
,
{ // state 1233
0x80000000|1283, // match move
0x80000000|159, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1234
0x80000000|957, // match move
0x80000000|99, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1235
173,MIN_REDUCTION+202, // $NT
  }
,
{ // state 1236
94,993, // "e"
  }
,
{ // state 1237
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 1238
94,565, // "e"
  }
,
{ // state 1239
108,384, // "u"
  }
,
{ // state 1240
94,591, // "e"
  }
,
{ // state 1241
2,1056, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 1242
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 1243
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 1244
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 1245
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 1246
2,310, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 1247
MIN_REDUCTION+348, // (default reduction)
  }
,
{ // state 1248
2,1385, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+168, // $NT
  }
,
{ // state 1249
99,254, // "t"
  }
,
{ // state 1250
173,MIN_REDUCTION+328, // $NT
  }
,
{ // state 1251
173,MIN_REDUCTION+350, // $NT
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 1252
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 1253
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 1254
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 1255
0x80000000|1, // match move
0x80000000|1396, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 1256
109,426, // "p"
  }
,
{ // state 1257
0x80000000|1058, // match move
0x80000000|1386, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1258
97,453, // "n"
  }
,
{ // state 1259
2,361, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+186, // $NT
  }
,
{ // state 1260
99,155, // "t"
  }
,
{ // state 1261
0x80000000|979, // match move
0x80000000|394, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1262
173,MIN_REDUCTION+242, // $NT
  }
,
{ // state 1263
94,53, // "e"
  }
,
{ // state 1264
0x80000000|152, // match move
0x80000000|48, // no-match move
0x80000000|1511, // NT-test-match state for single_printable
  }
,
{ // state 1265
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+169, // $NT
  }
,
{ // state 1266
97,623, // "n"
  }
,
{ // state 1267
0x80000000|1, // match move
0x80000000|1310, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 1268
100,771, // "d"
  }
,
{ // state 1269
0x80000000|304, // match move
0x80000000|1349, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1270
102,236, // "i"
  }
,
{ // state 1271
0x80000000|362, // match move
0x80000000|568, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1272
105,953, // "f"
  }
,
{ // state 1273
173,MIN_REDUCTION+320, // $NT
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 1274
94,1142, // "e"
  }
,
{ // state 1275
173,MIN_REDUCTION+206, // $NT
  }
,
{ // state 1276
2,687, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 1277
0x80000000|1217, // match move
0x80000000|1498, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1278
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 1279
173,MIN_REDUCTION+246, // $NT
  }
,
{ // state 1280
2,295, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 1281
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+171, // $NT
  }
,
{ // state 1282
116,1269, // "="
  }
,
{ // state 1283
2,887, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 1284
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 1285
0x80000000|634, // match move
0x80000000|1219, // no-match move
0x80000000|804, // NT-test-match state for reserved
  }
,
{ // state 1286
0x80000000|1243, // match move
0x80000000|1230, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1287
108,685, // "u"
  }
,
{ // state 1288
89,778, // "c"
  }
,
{ // state 1289
2,958, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 1290
2,696, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+358, // (default reduction)
  }
,
{ // state 1291
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 1292
94,777, // "e"
  }
,
{ // state 1293
2,557, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 1294
0x80000000|1, // match move
0x80000000|124, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 1295
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 1296
173,MIN_REDUCTION+215, // $NT
  }
,
{ // state 1297
173,MIN_REDUCTION+308, // $NT
  }
,
{ // state 1298
91,285, // "a"
  }
,
{ // state 1299
0x80000000|1, // match move
0x80000000|1128, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 1300
2,498, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 1301
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 1302
0x80000000|1468, // match move
0x80000000|1084, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1303
0x80000000|972, // match move
0x80000000|34, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1304
0x80000000|640, // match move
0x80000000|537, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1305
0x80000000|1478, // match move
0x80000000|1457, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1306
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 1307
2,404, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 1308
2,1106, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 1309
2,1427, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+138, // $NT
  }
,
{ // state 1310
0x80000000|920, // match move
0x80000000|1300, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1311
0x80000000|489, // match move
0x80000000|1442, // no-match move
0x80000000|1511, // NT-test-match state for single_printable
  }
,
{ // state 1312
91,21, // "a"
  }
,
{ // state 1313
106,575, // "r"
  }
,
{ // state 1314
0x80000000|1070, // match move
0x80000000|714, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1315
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 1316
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+135, // $NT
  }
,
{ // state 1317
2,183, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 1318
136,599, // "/"
  }
,
{ // state 1319
102,631, // "i"
  }
,
{ // state 1320
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 1321
90,397, // "l"
  }
,
{ // state 1322
173,MIN_REDUCTION+318, // $NT
  }
,
{ // state 1323
96,619, // "o"
  }
,
{ // state 1324
0x80000000|791, // match move
0x80000000|70, // no-match move
0x80000000|1511, // NT-test-match state for single_printable
  }
,
{ // state 1325
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 1326
2,446, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 1327
MIN_REDUCTION+348, // (default reduction)
  }
,
{ // state 1328
0x80000000|731, // match move
0x80000000|94, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1329
99,955, // "t"
  }
,
{ // state 1330
MIN_REDUCTION+352, // (default reduction)
  }
,
{ // state 1331
97,742, // "n"
  }
,
{ // state 1332
0x80000000|4, // match move
0x80000000|448, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1333
136,389, // "/"
  }
,
{ // state 1334
0x80000000|592, // match move
0x80000000|700, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1335
91,438, // "a"
  }
,
{ // state 1336
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 1337
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 1338
0x80000000|690, // match move
0x80000000|247, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1339
121,1129, // "*"
  }
,
{ // state 1340
0x80000000|1, // match move
0x80000000|1309, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 1341
0x80000000|441, // match move
0x80000000|536, // no-match move
0x80000000|637, // NT-test-match state for comment_stuff
  }
,
{ // state 1342
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 1343
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 1344
173,MIN_REDUCTION+200, // $NT
  }
,
{ // state 1345
2,310, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 1346
89,309, // "c"
  }
,
{ // state 1347
96,769, // "o"
102,395, // "i"
  }
,
{ // state 1348
136,1025, // "/"
157,588, // ds
  }
,
{ // state 1349
2,561, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 1350
1,836, // start
2,1303, // white*
3,689, // $$0
4,863, // token
135,469, // comment
136,41, // "/"
153,911, // white
154,656, // " "
155,656, // {9 12}
157,959, // ds
167,824, // token*
172,MIN_REDUCTION+1, // $
  }
,
{ // state 1351
102,180, // "i"
  }
,
{ // state 1352
2,570, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 1353
2,894, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 1354
0x80000000|903, // match move
0x80000000|31, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1355
0x80000000|240, // match move
0x80000000|1280, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1356
90,272, // "l"
  }
,
{ // state 1357
0x80000000|224, // match move
0x80000000|883, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1358
2,26, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 1359
0x80000000|90, // match move
0x80000000|457, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1360
173,MIN_REDUCTION+218, // $NT
  }
,
{ // state 1361
0x80000000|1523, // match move
0x80000000|815, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1362
0x80000000|170, // match move
0x80000000|1293, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1363
-1, // $$start
-1, // start
-1, // white*
9, // $$0
863, // token
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
956, // `!
1252, // `!=
1208, // `%
734, // `&&
1450, // `*
1101, // `(
1253, // `)
260, // `{
1220, // `}
123, // `-
284, // `+
1411, // `=
645, // `==
905, // `[
491, // `]
502, // `||
796, // `<
814, // `<=
745, // `,
749, // `>
1242, // `>=
670, // `.
1120, // `;
1176, // `++
1087, // `--
950, // `/
1416, // `:
941, // ID
1291, // INT_LITERAL
677, // STRING_LITERAL
307, // CHARACTER_LITERAL
1179, // "c"
1179, // "l"
1179, // "a"
1179, // "s"
-1, // idChar
1179, // "e"
1179, // "b"
1179, // "o"
1179, // "n"
1179, // "x"
1179, // "t"
1179, // "d"
1179, // "v"
1179, // "i"
1179, // "w"
1179, // "h"
1179, // "f"
1179, // "r"
1179, // "k"
1179, // "u"
1179, // "p"
1179, // "y"
1179, // "m"
1179, // "g"
1179, // "z"
-1, // reserved
360, // "!"
37, // "="
435, // "<"
662, // ">"
1479, // "+"
757, // "-"
850, // "*"
1003, // "%"
987, // "&"
189, // "("
1061, // ")"
1338, // "{"
1049, // "}"
1189, // "["
692, // "]"
257, // "|"
727, // "."
1145, // ","
12, // ":"
609, // ";"
-1, // comment
30, // "/"
1357, // identifier
27, // letter
-1, // idChar**
225, // digit++
1009, // dq
40, // '"'
-1, // stringChar
-1, // printable
-1, // stringChar*
-1, // $$1
983, // sq
821, // "'"
294, // digit
-1, // "_"
1179, // {"A".."Z" "j" "q"}
573, // {"0".."9"}
1028, // white
656, // " "
656, // {9 12}
1112, // eol
-1, // ds
-1, // single_printable
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
-1, // single_printable**
-1, // star
-1, // comment_printable
-1, // comment_stuff
-1, // comment_stuff**
1496, // {10}
969, // {13}
824, // token*
876, // digit+
-1, // idChar*
-1, // comment_stuff*
-1, // single_printable*
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 1364
96,709, // "o"
  }
,
{ // state 1365
0x80000000|1330, // match move
0x80000000|1225, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 1366
91,1331, // "a"
108,1509, // "u"
110,130, // "y"
  }
,
{ // state 1367
2,244, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+150, // $NT
  }
,
{ // state 1368
2,627, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 1369
90,810, // "l"
  }
,
{ // state 1370
0x80000000|411, // match move
0x80000000|515, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1371
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 1372
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 1373
101,1042, // "v"
  }
,
{ // state 1374
0x80000000|1, // match move
0x80000000|860, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 1375
141,1491, // dq
142,1306, // '"'
145,544, // stringChar*
146,1173, // $$1
  }
,
{ // state 1376
90,250, // "l"
  }
,
{ // state 1377
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 1378
104,1057, // "h"
106,663, // "r"
  }
,
{ // state 1379
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 1380
2,1013, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 1381
94,118, // "e"
  }
,
{ // state 1382
0x80000000|1, // match move
0x80000000|1443, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 1383
0x80000000|1, // match move
0x80000000|68, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 1384
89,375, // "c"
90,375, // "l"
91,375, // "a"
92,375, // "s"
94,375, // "e"
95,375, // "b"
96,375, // "o"
97,375, // "n"
98,375, // "x"
99,375, // "t"
100,375, // "d"
101,375, // "v"
102,375, // "i"
103,375, // "w"
104,375, // "h"
105,375, // "f"
106,375, // "r"
107,375, // "k"
108,375, // "u"
109,375, // "p"
110,375, // "y"
111,375, // "m"
112,375, // "g"
113,375, // "z"
115,375, // "!"
116,375, // "="
117,375, // "<"
118,375, // ">"
119,375, // "+"
120,375, // "-"
121,375, // "*"
122,375, // "%"
123,375, // "&"
124,375, // "("
125,375, // ")"
126,375, // "{"
127,375, // "}"
128,375, // "["
129,375, // "]"
130,375, // "|"
131,375, // "."
132,375, // ","
133,375, // ":"
134,375, // ";"
136,375, // "/"
142,375, // '"'
148,375, // "'"
150,375, // "_"
151,375, // {"A".."Z" "j" "q"}
152,375, // {"0".."9"}
154,375, // " "
155,375, // {9 12}
158,667, // single_printable
159,375, // {"#".."$" "?".."@" "\" "^" "`" "~"}
160,383, // single_printable**
171,301, // single_printable*
  }
,
{ // state 1385
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+167, // $NT
  }
,
{ // state 1386
2,996, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 1387
2,1152, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 1388
91,82, // "a"
  }
,
{ // state 1389
109,1093, // "p"
  }
,
{ // state 1390
90,185, // "l"
  }
,
{ // state 1391
0x80000000|856, // match move
0x80000000|1143, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1392
102,393, // "i"
  }
,
{ // state 1393
0x80000000|616, // match move
0x80000000|684, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1394
0x80000000|1047, // match move
0x80000000|121, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1395
0x80000000|1, // match move
0x80000000|765, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 1396
0x80000000|531, // match move
0x80000000|1326, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1397
92,1504, // "s"
  }
,
{ // state 1398
2,1277, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 1399
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 1400
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 1401
0x80000000|1, // match move
0x80000000|1148, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 1402
0x80000000|1, // match move
0x80000000|857, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 1403
2,1271, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 1404
106,1214, // "r"
  }
,
{ // state 1405
99,1340, // "t"
  }
,
{ // state 1406
99,1177, // "t"
  }
,
{ // state 1407
173,MIN_REDUCTION+324, // $NT
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 1408
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 1409
0x80000000|1, // match move
0x80000000|1234, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 1410
99,999, // "t"
  }
,
{ // state 1411
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 1412
2,1370, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1413
173,MIN_REDUCTION+324, // $NT
  }
,
{ // state 1414
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 1415
89,413, // "c"
90,413, // "l"
91,413, // "a"
92,413, // "s"
94,413, // "e"
95,413, // "b"
96,413, // "o"
97,413, // "n"
98,413, // "x"
99,413, // "t"
100,413, // "d"
101,413, // "v"
102,413, // "i"
103,413, // "w"
104,413, // "h"
105,413, // "f"
106,413, // "r"
107,413, // "k"
108,413, // "u"
109,413, // "p"
110,413, // "y"
111,413, // "m"
112,413, // "g"
113,413, // "z"
115,413, // "!"
116,413, // "="
117,413, // "<"
118,413, // ">"
119,413, // "+"
120,413, // "-"
121,795, // "*"
122,413, // "%"
123,413, // "&"
124,413, // "("
125,413, // ")"
126,413, // "{"
127,413, // "}"
128,413, // "["
129,413, // "]"
130,413, // "|"
131,413, // "."
132,413, // ","
133,413, // ":"
134,413, // ";"
136,413, // "/"
142,413, // '"'
148,413, // "'"
150,413, // "_"
151,413, // {"A".."Z" "j" "q"}
152,413, // {"0".."9"}
154,413, // " "
156,1050, // eol
159,413, // {"#".."$" "?".."@" "\" "^" "`" "~"}
161,826, // star
162,1471, // comment_printable
163,424, // comment_stuff
164,781, // comment_stuff**
165,387, // {10}
166,1465, // {13}
170,1040, // comment_stuff*
  }
,
{ // state 1416
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 1417
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 1418
2,545, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+130, // $NT
  }
,
{ // state 1419
0x80000000|221, // match move
0x80000000|773, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1420
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+145, // $NT
  }
,
{ // state 1421
116,652, // "="
  }
,
{ // state 1422
2,1286, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 1423
96,767, // "o"
  }
,
{ // state 1424
2,1060, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 1425
89,194, // "c"
  }
,
{ // state 1426
2,1485, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 1427
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+137, // $NT
  }
,
{ // state 1428
99,258, // "t"
  }
,
{ // state 1429
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 1430
96,86, // "o"
  }
,
{ // state 1431
121,344, // "*"
  }
,
{ // state 1432
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 1433
0x80000000|181, // match move
0x80000000|1020, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1434
90,492, // "l"
  }
,
{ // state 1435
2,1334, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 1436
2,1420, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+146, // $NT
  }
,
{ // state 1437
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+161, // $NT
  }
,
{ // state 1438
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 1439
94,543, // "e"
  }
,
{ // state 1440
97,582, // "n"
  }
,
{ // state 1441
173,MIN_REDUCTION+334, // $NT
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 1442
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 1443
2,1437, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+162, // $NT
  }
,
{ // state 1444
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 1445
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 1446
89,20, // "c"
  }
,
{ // state 1447
0x80000000|1, // match move
0x80000000|1524, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 1448
173,MIN_REDUCTION+322, // $NT
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 1449
97,523, // "n"
  }
,
{ // state 1450
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 1451
2,160, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 1452
94,320, // "e"
  }
,
{ // state 1453
90,947, // "l"
91,622, // "a"
96,1313, // "o"
102,303, // "i"
  }
,
{ // state 1454
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 1455
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 1456
173,MIN_REDUCTION+244, // $NT
  }
,
{ // state 1457
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 1458
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 1459
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 1460
173,MIN_REDUCTION+315, // $NT
  }
,
{ // state 1461
2,1393, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 1462
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 1463
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 1464
94,1108, // "e"
  }
,
{ // state 1465
0x80000000|1115, // match move
0x80000000|961, // no-match move
// T-test match for 10:
165,
  }
,
{ // state 1466
173,MIN_REDUCTION+333, // $NT
  }
,
{ // state 1467
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 1468
2,305, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 1469
173,MIN_REDUCTION+333, // $NT
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 1470
MIN_REDUCTION+315, // (default reduction)
  }
,
{ // state 1471
0x80000000|17, // match move
0x80000000|1204, // no-match move
0x80000000|637, // NT-test-match state for comment_stuff
  }
,
{ // state 1472
173,MIN_REDUCTION+228, // $NT
  }
,
{ // state 1473
91,859, // "a"
  }
,
{ // state 1474
0x80000000|913, // match move
0x80000000|1133, // no-match move
0x80000000|1511, // NT-test-match state for single_printable
  }
,
{ // state 1475
97,840, // "n"
  }
,
{ // state 1476
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 1477
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 1478
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 1479
0x80000000|525, // match move
0x80000000|401, // no-match move
// T-test match for "+":
119,
  }
,
{ // state 1480
173,MIN_REDUCTION+217, // $NT
  }
,
{ // state 1481
102,954, // "i"
  }
,
{ // state 1482
102,443, // "i"
  }
,
{ // state 1483
120,219, // "-"
  }
,
{ // state 1484
0x80000000|1, // match move
0x80000000|1501, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 1485
0x80000000|792, // match move
0x80000000|241, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1486
135,1448, // comment
136,133, // "/"
153,1137, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+99, // $NT
  }
,
{ // state 1487
94,198, // "e"
  }
,
{ // state 1488
92,483, // "s"
  }
,
{ // state 1489
97,647, // "n"
105,963, // "f"
111,1256, // "m"
  }
,
{ // state 1490
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 1491
0x80000000|171, // match move
0x80000000|1290, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1492
94,829, // "e"
  }
,
{ // state 1493
173,MIN_REDUCTION+212, // $NT
  }
,
{ // state 1494
2,806, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 1495
0x80000000|1, // match move
0x80000000|1520, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 1496
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 1497
90,820, // "l"
  }
,
{ // state 1498
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 1499
173,MIN_REDUCTION+335, // $NT
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 1500
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 1501
2,490, // white*
135,1448, // comment
136,133, // "/"
153,891, // white
154,1273, // " "
155,1273, // {9 12}
156,164, // eol
157,1474, // ds
165,1441, // {10}
166,530, // {13}
173,MIN_REDUCTION+148, // $NT
  }
,
{ // state 1502
2,74, // white*
153,787, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 1503
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 1504
0x80000000|1, // match move
0x80000000|1513, // no-match move
0x80000000|84, // NT-test-match state for idChar
  }
,
{ // state 1505
173,MIN_REDUCTION+336, // $NT
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 1506
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 1507
90,1147, // "l"
  }
,
{ // state 1508
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 1509
94,878, // "e"
  }
,
{ // state 1510
173,MIN_REDUCTION+334, // $NT
  }
,
{ // state 1511
89,1002, // "c"
90,1002, // "l"
91,1002, // "a"
92,1002, // "s"
94,1002, // "e"
95,1002, // "b"
96,1002, // "o"
97,1002, // "n"
98,1002, // "x"
99,1002, // "t"
100,1002, // "d"
101,1002, // "v"
102,1002, // "i"
103,1002, // "w"
104,1002, // "h"
105,1002, // "f"
106,1002, // "r"
107,1002, // "k"
108,1002, // "u"
109,1002, // "p"
110,1002, // "y"
111,1002, // "m"
112,1002, // "g"
113,1002, // "z"
115,1002, // "!"
116,1002, // "="
117,1002, // "<"
118,1002, // ">"
119,1002, // "+"
120,1002, // "-"
121,1002, // "*"
122,1002, // "%"
123,1002, // "&"
124,1002, // "("
125,1002, // ")"
126,1002, // "{"
127,1002, // "}"
128,1002, // "["
129,1002, // "]"
130,1002, // "|"
131,1002, // "."
132,1002, // ","
133,1002, // ":"
134,1002, // ";"
136,1002, // "/"
142,1002, // '"'
148,1002, // "'"
150,1002, // "_"
151,1002, // {"A".."Z" "j" "q"}
152,1002, // {"0".."9"}
154,1002, // " "
155,1002, // {9 12}
159,1002, // {"#".."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 1512
2,1361, // white*
135,1090, // comment
136,203, // "/"
153,787, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 1513
0x80000000|485, // match move
0x80000000|1380, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1514
91,925, // "a"
94,752, // "e"
108,1434, // "u"
  }
,
{ // state 1515
90,782, // "l"
  }
,
{ // state 1516
99,205, // "t"
  }
,
{ // state 1517
106,323, // "r"
  }
,
{ // state 1518
94,603, // "e"
  }
,
{ // state 1519
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 1520
0x80000000|1276, // match move
0x80000000|964, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1521
89,413, // "c"
90,413, // "l"
91,413, // "a"
92,413, // "s"
94,413, // "e"
95,413, // "b"
96,413, // "o"
97,413, // "n"
98,413, // "x"
99,413, // "t"
100,413, // "d"
101,413, // "v"
102,413, // "i"
103,413, // "w"
104,413, // "h"
105,413, // "f"
106,413, // "r"
107,413, // "k"
108,413, // "u"
109,413, // "p"
110,413, // "y"
111,413, // "m"
112,413, // "g"
113,413, // "z"
115,413, // "!"
116,413, // "="
117,413, // "<"
118,413, // ">"
119,413, // "+"
120,413, // "-"
121,795, // "*"
122,413, // "%"
123,413, // "&"
124,413, // "("
125,413, // ")"
126,413, // "{"
127,413, // "}"
128,413, // "["
129,413, // "]"
130,413, // "|"
131,413, // "."
132,413, // ","
133,413, // ":"
134,413, // ";"
136,413, // "/"
142,413, // '"'
148,413, // "'"
150,413, // "_"
151,413, // {"A".."Z" "j" "q"}
152,413, // {"0".."9"}
154,413, // " "
156,1050, // eol
159,413, // {"#".."$" "?".."@" "\" "^" "`" "~"}
161,826, // star
162,1471, // comment_printable
163,424, // comment_stuff
164,1339, // comment_stuff**
165,387, // {10}
166,1465, // {13}
170,1040, // comment_stuff*
  }
,
{ // state 1522
153,880, // white
154,1454, // " "
155,1454, // {9 12}
156,711, // eol
165,601, // {10}
166,447, // {13}
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 1523
135,1090, // comment
136,203, // "/"
153,880, // white
154,1454, // " "
155,1454, // {9 12}
157,809, // ds
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 1524
0x80000000|946, // match move
0x80000000|458, // no-match move
0x80000000|1348, // NT-test-match state for comment
  }
,
{ // state 1525
89,375, // "c"
90,375, // "l"
91,375, // "a"
92,375, // "s"
94,375, // "e"
95,375, // "b"
96,375, // "o"
97,375, // "n"
98,375, // "x"
99,375, // "t"
100,375, // "d"
101,375, // "v"
102,375, // "i"
103,375, // "w"
104,375, // "h"
105,375, // "f"
106,375, // "r"
107,375, // "k"
108,375, // "u"
109,375, // "p"
110,375, // "y"
111,375, // "m"
112,375, // "g"
113,375, // "z"
115,375, // "!"
116,375, // "="
117,375, // "<"
118,375, // ">"
119,375, // "+"
120,375, // "-"
121,375, // "*"
122,375, // "%"
123,375, // "&"
124,375, // "("
125,375, // ")"
126,375, // "{"
127,375, // "}"
128,375, // "["
129,375, // "]"
130,375, // "|"
131,375, // "."
132,375, // ","
133,375, // ":"
134,375, // ";"
136,375, // "/"
142,375, // '"'
148,375, // "'"
150,375, // "_"
151,375, // {"A".."Z" "j" "q"}
152,375, // {"0".."9"}
154,375, // " "
155,375, // {9 12}
158,923, // single_printable
159,375, // {"#".."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 1526
121,91, // "*"
164,781, // comment_stuff**
170,1040, // comment_stuff*
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
// ds ::= "/" "/"
(157<<16)+2,
// single_printable ::= {9 12 " ".."~"}
(158<<16)+1,
// comment ::= ds single_printable**
(135<<16)+2,
// comment ::= ds !single_printable
(135<<16)+1,
// star ::= "*" !"/"
(161<<16)+1,
// comment_printable ::= {" "..")" "+".."~"}
(162<<16)+1,
// comment_stuff ::= comment_printable
(163<<16)+1,
// comment_stuff ::= star
(163<<16)+1,
// comment_stuff ::= eol
(163<<16)+1,
// comment ::= "/" "*" comment_stuff** "*" "/"
(135<<16)+5,
// comment ::= "/" "*" !comment_stuff "*" "/"
(135<<16)+4,
// eol ::= {10}
(156<<16)+1,
// eol ::= {13} {10}
(156<<16)+2,
// eol ::= {13} !10
(156<<16)+1,
// printable ::= {" ".."~"}
(144<<16)+1,
// token* ::= token* token
(167<<16)+2,
// token* ::= token
(167<<16)+1,
// digit++ ::= digit+ !digit
(140<<16)+1,
// idChar** ::= idChar* !idChar
(139<<16)+1,
// comment_stuff** ::= comment_stuff* !comment_stuff
(164<<16)+1,
// stringChar* ::= stringChar* stringChar
(145<<16)+2,
// stringChar* ::= stringChar
(145<<16)+1,
// white* ::= white* white
(2<<16)+2,
// white* ::= white
(2<<16)+1,
// single_printable** ::= single_printable* !single_printable
(160<<16)+1,
// digit+ ::= digit
(168<<16)+1,
// digit+ ::= digit+ digit
(168<<16)+2,
// single_printable* ::= single_printable* single_printable
(171<<16)+2,
// single_printable* ::= single_printable
(171<<16)+1,
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
165, // 10
-1, // 11
155, // 12
166, // 13
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
159, // "#"
159, // "$"
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
159, // "?"
159, // "@"
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
159, // "\"
129, // "]"
159, // "^"
150, // "_"
159, // "`"
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
159, // "~"
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
"", // 337
"token* ::= token* token", // 338
"token* ::= token* token", // 339
"digit++ ::= digit+ !digit", // 340
"idChar** ::= idChar* !idChar", // 341
"comment_stuff** ::= comment_stuff* !comment_stuff", // 342
"stringChar* ::= stringChar* stringChar", // 343
"stringChar* ::= stringChar* stringChar", // 344
"white* ::= white* white", // 345
"white* ::= white* white", // 346
"single_printable** ::= single_printable* !single_printable", // 347
"digit+ ::= digit", // 348
"digit+ ::= digit+ digit", // 349
"single_printable* ::= single_printable* single_printable", // 350
"single_printable* ::= single_printable* single_printable", // 351
"idChar* ::= idChar* idChar", // 352
"idChar* ::= idChar* idChar", // 353
"comment_stuff* ::= comment_stuff* comment_stuff", // 354
"comment_stuff* ::= comment_stuff* comment_stuff", // 355
"", // 356
"", // 357
"", // 358
};
public int[][] getActionTable() { return actionTable; }
private int[][] actionTable = {
    { // 0: $$start ::= start @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 1: $$start ::= [start] @pass
      ((1<<5)|0x6)/*nullProductionAction:1*/,
    },
    { // 2: start ::= white* $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 3: start ::= white* [token*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 4: start ::= [white*] $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((4<<5)|0x6)/*nullProductionAction:4*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
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
    { // 323: ds ::= "/" "/" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 324: single_printable ::= {9 12 " ".."~"} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 325: comment ::= ds single_printable** @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 326: comment ::= ds !single_printable [single_printable**] @void
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 327: star ::= "*" !"/" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 328: comment_printable ::= {" "..")" "+".."~"} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 329: comment_stuff ::= comment_printable @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 330: comment_stuff ::= star @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 331: comment_stuff ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 332: comment ::= "/" "*" comment_stuff** "*" "/" @void
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
    { // 333: comment ::= "/" "*" !comment_stuff [comment_stuff**] "*" "/" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 334: eol ::= {10} [registerNewline] @void
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 335: eol ::= {13} {10} [registerNewline] @void
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 336: eol ::= {13} !10 [registerNewline] @void
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 337: printable ::= {" ".."~"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 338: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 339: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 345: white* ::= white* white @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 346: white* ::= [white*] white @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
    },
    { // 347: single_printable** ::= single_printable* !single_printable @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 348: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 349: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 350: single_printable* ::= single_printable* single_printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 351: single_printable* ::= [single_printable*] single_printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
    },
    { // 352: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 353: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 354: comment_stuff* ::= comment_stuff* comment_stuff @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 355: comment_stuff* ::= [comment_stuff*] comment_stuff @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // 356: $$0 ::= token* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 357: $$1 ::= dq white* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 358: $$1 ::= dq [white*] @pass
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "single_printable** ::= single_printable* !single_printable", // single_printable**
    "", // start
    "comment_stuff* ::=", // comment_stuff*
    "stringChar* ::=", // stringChar*
    "idChar** ::= idChar* !idChar", // idChar**
    "token* ::=", // token*
    "idChar* ::=", // idChar*
    "comment_stuff** ::= comment_stuff* !comment_stuff", // comment_stuff**
    "white* ::=", // white*
    "single_printable* ::=", // single_printable*
    "", // $$start
    "# ::=", // #
    "", // registerNewline
};
public int[][] getNullProductionActionTable() { return nullActionTable; }
private int[][] nullActionTable = {
    { // single_printable**
      ((9<<5)|0x6)/*nullProductionAction:9*/,
    },
    { // start
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
    },
    { // comment_stuff*
    },
    { // stringChar*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // idChar**
      ((6<<5)|0x6)/*nullProductionAction:6*/,
    },
    { // token*
    },
    { // idChar*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // comment_stuff**
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // white*
    },
    { // single_printable*
    },
    { // $$start
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
    0,
    -1,
    0,
    0,
    0,
    0,
    0,
    -1,
    -1,
    0,
    1,
    1,
    0,
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
