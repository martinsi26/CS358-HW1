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
public int getEofSym() { return 182; }
public int getNttSym() { return 183; }
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
"character_printable",
"{\"A\"..\"Z\" \"j\" \"q\"}",
"\" \"",
"\"_\"",
"{\"#\"..\"$\" \"?\"..\"@\" \"^\" \"`\" \"~\"}",
"{\"0\"..\"9\"}",
"\"\'\"",
"\'\"\'",
"back_back",
"back_dquote",
"back_squote",
"back_n",
"back_tab",
"back_form",
"back_return",
"\"\\\"",
"dq",
"stringChar",
"stringChar*",
"$$1",
"sq",
"digit",
"white",
"{9 12}",
"eol",
"ds",
"single_printable",
"single_printable**",
"star",
"slash",
"slash_star",
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
public int numSymbols() { return 184;}
private static final int MIN_REDUCTION = 1576;
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
0x80000000|706, // match move
0x80000000|270, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1
  }
,
{ // state 2
97,335, // "n"
  }
,
{ // state 3
111,1552, // "m"
  }
,
{ // state 4
2,830, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 5
0x80000000|620, // match move
0x80000000|1413, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 6
147,733, // "'"
161,893, // sq
  }
,
{ // state 7
94,391, // "e"
  }
,
{ // state 8
111,455, // "m"
  }
,
{ // state 9
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 10
89,154, // "c"
  }
,
{ // state 11
0x80000000|504, // match move
0x80000000|1533, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 12
183,MIN_REDUCTION+342, // $NT
  }
,
{ // state 13
89,1497, // "c"
  }
,
{ // state 14
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 15
183,MIN_REDUCTION+239, // $NT
  }
,
{ // state 16
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 17
94,900, // "e"
  }
,
{ // state 18
0x80000000|1458, // match move
0x80000000|583, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 19
0x80000000|826, // match move
0x80000000|618, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 20
2,1310, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+126, // $NT
  }
,
{ // state 21
0x80000000|351, // match move
0x80000000|191, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 22
183,MIN_REDUCTION+355, // $NT
  }
,
{ // state 23
2,524, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 24
0x80000000|668, // match move
0x80000000|1009, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 25
89,1320, // "c"
  }
,
{ // state 26
183,MIN_REDUCTION+205, // $NT
  }
,
{ // state 27
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 28
89,1419, // "c"
  }
,
{ // state 29
105,525, // "f"
  }
,
{ // state 30
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 31
89,1262, // "c"
  }
,
{ // state 32
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 33
144,MIN_REDUCTION+338, // "_"
145,MIN_REDUCTION+338, // {"#".."$" "?".."@" "^" "`" "~"}
156,MIN_REDUCTION+338, // "\"
168,MIN_REDUCTION+338, // single_printable**
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 34
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 35
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 36
183,MIN_REDUCTION+204, // $NT
  }
,
{ // state 37
0x80000000|916, // match move
0x80000000|962, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 38
2,39, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 39
0x80000000|630, // match move
0x80000000|919, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 40
0x80000000|911, // match move
0x80000000|1515, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 41
MIN_REDUCTION+361, // (default reduction)
  }
,
{ // state 42
183,MIN_REDUCTION+233, // $NT
  }
,
{ // state 43
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 44
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 45
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 46
0x80000000|1360, // match move
0x80000000|156, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 47
2,979, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+184, // $NT
  }
,
{ // state 48
0x80000000|445, // match move
0x80000000|122, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 49
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 50
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 51
100,810, // "d"
  }
,
{ // state 52
92,1211, // "s"
  }
,
{ // state 53
89,694, // "c"
90,694, // "l"
91,694, // "a"
92,694, // "s"
94,694, // "e"
95,694, // "b"
96,694, // "o"
97,694, // "n"
98,694, // "x"
99,694, // "t"
100,694, // "d"
101,694, // "v"
102,694, // "i"
103,694, // "w"
104,694, // "h"
105,694, // "f"
106,694, // "r"
107,694, // "k"
108,694, // "u"
109,694, // "p"
110,694, // "y"
111,694, // "m"
112,694, // "g"
113,694, // "z"
138,1539, // letter
142,694, // {"A".."Z" "j" "q"}
144,186, // "_"
146,285, // {"0".."9"}
162,277, // digit
  }
,
{ // state 54
109,208, // "p"
  }
,
{ // state 55
0x80000000|1, // match move
0x80000000|323, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 56
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 57
136,1543, // "/"
  }
,
{ // state 58
2,1239, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 59
109,457, // "p"
  }
,
{ // state 60
2,1386, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 61
183,MIN_REDUCTION+203, // $NT
  }
,
{ // state 62
0x80000000|1, // match move
0x80000000|815, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 63
100,846, // "d"
  }
,
{ // state 64
0x80000000|1, // match move
0x80000000|790, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 65
2,120, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+142, // $NT
  }
,
{ // state 66
183,MIN_REDUCTION+197, // $NT
  }
,
{ // state 67
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 68
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 69
106,1148, // "r"
  }
,
{ // state 70
99,1122, // "t"
  }
,
{ // state 71
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 72
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 73
146,285, // {"0".."9"}
  }
,
{ // state 74
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 75
112,310, // "g"
  }
,
{ // state 76
183,MIN_REDUCTION+237, // $NT
  }
,
{ // state 77
0x80000000|1193, // match move
0x80000000|863, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 78
121,1094, // "*"
174,1519, // comment_stuff**
180,545, // comment_stuff*
  }
,
{ // state 79
97,428, // "n"
  }
,
{ // state 80
0x80000000|272, // match move
0x80000000|1257, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 81
0x80000000|1, // match move
0x80000000|1417, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 82
94,384, // "e"
96,472, // "o"
  }
,
{ // state 83
97,1433, // "n"
  }
,
{ // state 84
MIN_REDUCTION+365, // (default reduction)
  }
,
{ // state 85
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 86
136,1141, // "/"
  }
,
{ // state 87
0x80000000|1, // match move
0x80000000|866, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 88
0x80000000|490, // match move
0x80000000|95, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 89
2,1230, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 90
0x80000000|1, // match move
0x80000000|864, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 91
106,1434, // "r"
  }
,
{ // state 92
92,997, // "s"
95,1021, // "b"
  }
,
{ // state 93
89,1084, // "c"
  }
,
{ // state 94
0x80000000|1, // match move
0x80000000|684, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 95
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 96
89,136, // "c"
90,136, // "l"
91,136, // "a"
92,136, // "s"
94,136, // "e"
95,136, // "b"
96,136, // "o"
97,136, // "n"
98,136, // "x"
99,136, // "t"
100,136, // "d"
101,136, // "v"
102,136, // "i"
103,136, // "w"
104,136, // "h"
105,136, // "f"
106,136, // "r"
107,136, // "k"
108,136, // "u"
109,136, // "p"
110,136, // "y"
111,136, // "m"
112,136, // "g"
113,136, // "z"
115,136, // "!"
116,136, // "="
117,136, // "<"
118,136, // ">"
119,136, // "+"
120,136, // "-"
121,471, // "*"
122,136, // "%"
123,136, // "&"
124,136, // "("
125,136, // ")"
126,136, // "{"
127,136, // "}"
128,136, // "["
129,136, // "]"
130,136, // "|"
131,136, // "."
132,136, // ","
133,136, // ":"
134,136, // ";"
136,1374, // "/"
142,136, // {"A".."Z" "j" "q"}
143,136, // " "
144,136, // "_"
145,136, // {"#".."$" "?".."@" "^" "`" "~"}
146,136, // {"0".."9"}
147,136, // "'"
148,136, // '"'
156,136, // "\"
165,118, // eol
169,1308, // star
170,1389, // slash
171,429, // slash_star
172,371, // comment_printable
175,1565, // {10}
176,168, // {13}
  }
,
{ // state 97
2,903, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 98
2,1274, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 99
2,944, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 100
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 101
0x80000000|199, // match move
0x80000000|509, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 102
183,MIN_REDUCTION+220, // $NT
  }
,
{ // state 103
110,1487, // "y"
  }
,
{ // state 104
2,1117, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+120, // $NT
  }
,
{ // state 105
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 106
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 107
99,1231, // "t"
  }
,
{ // state 108
168,204, // single_printable**
181,925, // single_printable*
183,MIN_REDUCTION+341, // $NT
  }
,
{ // state 109
136,1541, // "/"
  }
,
{ // state 110
99,447, // "t"
  }
,
{ // state 111
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 112
106,1546, // "r"
  }
,
{ // state 113
2,1496, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 114
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 115
121,1467, // "*"
136,1334, // "/"
  }
,
{ // state 116
2,200, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 117
0x80000000|1, // match move
0x80000000|1047, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 118
183,MIN_REDUCTION+350, // $NT
  }
,
{ // state 119
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 120
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+141, // $NT
  }
,
{ // state 121
94,1304, // "e"
  }
,
{ // state 122
2,77, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 123
183,MIN_REDUCTION+223, // $NT
  }
,
{ // state 124
100,94, // "d"
  }
,
{ // state 125
102,1202, // "i"
  }
,
{ // state 126
2,1404, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 127
0x80000000|567, // match move
0x80000000|365, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 128
183,MIN_REDUCTION+195, // $NT
  }
,
{ // state 129
2,1315, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+98, // $NT
  }
,
{ // state 130
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 131
0x80000000|737, // match move
0x80000000|252, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 132
2,1438, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+172, // $NT
  }
,
{ // state 133
90,1184, // "l"
  }
,
{ // state 134
2,598, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 135
92,465, // "s"
95,1554, // "b"
  }
,
{ // state 136
183,MIN_REDUCTION+345, // $NT
  }
,
{ // state 137
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 138
2,1227, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 139
2,1376, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 140
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 141
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 142
94,29, // "e"
96,1013, // "o"
  }
,
{ // state 143
94,64, // "e"
  }
,
{ // state 144
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 145
99,209, // "t"
  }
,
{ // state 146
130,861, // "|"
  }
,
{ // state 147
94,1501, // "e"
  }
,
{ // state 148
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 149
94,792, // "e"
  }
,
{ // state 150
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+187, // $NT
  }
,
{ // state 151
0x80000000|1138, // match move
0x80000000|764, // no-match move
0x80000000|776, // NT-test-match state for single_printable
  }
,
{ // state 152
91,1322, // "a"
  }
,
{ // state 153
2,686, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 154
0x80000000|1, // match move
0x80000000|961, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 155
94,297, // "e"
  }
,
{ // state 156
2,726, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 157
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 158
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 159
109,1191, // "p"
  }
,
{ // state 160
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 161
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 162
89,506, // "c"
  }
,
{ // state 163
183,MIN_REDUCTION+235, // $NT
  }
,
{ // state 164
0x80000000|119, // match move
0x80000000|431, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 165
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 166
2,707, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 167
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 168
0x80000000|550, // match move
0x80000000|22, // no-match move
// T-test match for 10:
175,
  }
,
{ // state 169
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 170
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 171
0x80000000|519, // match move
0x80000000|35, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 172
99,240, // "t"
  }
,
{ // state 173
104,256, // "h"
  }
,
{ // state 174
0x80000000|374, // match move
0x80000000|254, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 175
116,952, // "="
  }
,
{ // state 176
104,1233, // "h"
  }
,
{ // state 177
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+89, // $NT
  }
,
{ // state 178
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 179
97,1174, // "n"
  }
,
{ // state 180
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 181
0x80000000|1026, // match move
0x80000000|838, // no-match move
0x80000000|776, // NT-test-match state for single_printable
  }
,
{ // state 182
MIN_REDUCTION+345, // (default reduction)
  }
,
{ // state 183
2,849, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+182, // $NT
  }
,
{ // state 184
96,839, // "o"
  }
,
{ // state 185
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+175, // $NT
  }
,
{ // state 186
183,MIN_REDUCTION+332, // $NT
  }
,
{ // state 187
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+107, // $NT
  }
,
{ // state 188
96,1214, // "o"
  }
,
{ // state 189
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 190
0x80000000|621, // match move
0x80000000|1171, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 191
2,88, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 192
2,1190, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 193
0x80000000|1, // match move
0x80000000|190, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 194
91,458, // "a"
  }
,
{ // state 195
99,1346, // "t"
103,692, // "w"
104,188, // "h"
108,59, // "u"
110,654, // "y"
  }
,
{ // state 196
109,380, // "p"
  }
,
{ // state 197
0x80000000|870, // match move
0x80000000|318, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 198
89,891, // "c"
  }
,
{ // state 199
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 200
0x80000000|1530, // match move
0x80000000|616, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 201
MIN_REDUCTION+344, // (default reduction)
  }
,
{ // state 202
0x80000000|691, // match move
0x80000000|276, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 203
0x80000000|134, // match move
0x80000000|1494, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 204
183,MIN_REDUCTION+340, // $NT
  }
,
{ // state 205
90,1502, // "l"
  }
,
{ // state 206
2,444, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 207
97,28, // "n"
  }
,
{ // state 208
94,1212, // "e"
  }
,
{ // state 209
0x80000000|1, // match move
0x80000000|326, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 210
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 211
90,1421, // "l"
  }
,
{ // state 212
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 213
101,936, // "v"
  }
,
{ // state 214
92,741, // "s"
  }
,
{ // state 215
99,1570, // "t"
  }
,
{ // state 216
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 217
99,1440, // "t"
  }
,
{ // state 218
MIN_REDUCTION+355, // (default reduction)
  }
,
{ // state 219
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 220
89,373, // "c"
90,373, // "l"
91,373, // "a"
92,373, // "s"
94,373, // "e"
95,373, // "b"
96,373, // "o"
97,373, // "n"
98,373, // "x"
99,373, // "t"
100,373, // "d"
101,373, // "v"
102,373, // "i"
103,373, // "w"
104,373, // "h"
105,373, // "f"
106,373, // "r"
107,373, // "k"
108,373, // "u"
109,373, // "p"
110,373, // "y"
111,373, // "m"
112,373, // "g"
113,373, // "z"
115,373, // "!"
116,373, // "="
117,373, // "<"
118,373, // ">"
119,373, // "+"
120,373, // "-"
121,373, // "*"
122,373, // "%"
123,373, // "&"
124,373, // "("
125,373, // ")"
126,373, // "{"
127,373, // "}"
128,373, // "["
129,373, // "]"
130,373, // "|"
131,373, // "."
132,373, // ","
133,373, // ":"
134,373, // ";"
136,373, // "/"
142,373, // {"A".."Z" "j" "q"}
143,373, // " "
144,373, // "_"
145,373, // {"#".."$" "?".."@" "^" "`" "~"}
146,373, // {"0".."9"}
147,373, // "'"
148,373, // '"'
156,373, // "\"
164,373, // {9 12}
167,1449, // single_printable
  }
,
{ // state 221
0x80000000|780, // match move
0x80000000|419, // no-match move
0x80000000|96, // NT-test-match state for comment_stuff
  }
,
{ // state 222
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 223
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+191, // $NT
  }
,
{ // state 224
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 225
2,932, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+174, // $NT
  }
,
{ // state 226
0x80000000|1118, // match move
0x80000000|592, // no-match move
0x80000000|96, // NT-test-match state for comment_stuff
  }
,
{ // state 227
2,1314, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+96, // $NT
  }
,
{ // state 228
90,155, // "l"
96,1394, // "o"
  }
,
{ // state 229
0x80000000|175, // match move
0x80000000|203, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 230
2,1115, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 231
183,MIN_REDUCTION+369, // $NT
MIN_REDUCTION+369, // (default reduction)
  }
,
{ // state 232
106,728, // "r"
  }
,
{ // state 233
89,680, // "c"
90,680, // "l"
91,680, // "a"
92,680, // "s"
94,680, // "e"
95,680, // "b"
96,680, // "o"
97,680, // "n"
98,680, // "x"
99,680, // "t"
100,680, // "d"
101,680, // "v"
102,680, // "i"
103,680, // "w"
104,680, // "h"
105,680, // "f"
106,680, // "r"
107,680, // "k"
108,680, // "u"
109,680, // "p"
110,680, // "y"
111,680, // "m"
112,680, // "g"
113,680, // "z"
115,680, // "!"
116,680, // "="
117,680, // "<"
118,680, // ">"
119,680, // "+"
120,680, // "-"
121,413, // "*"
122,680, // "%"
123,680, // "&"
124,680, // "("
125,680, // ")"
126,680, // "{"
127,680, // "}"
128,680, // "["
129,680, // "]"
130,680, // "|"
131,680, // "."
132,680, // ","
133,680, // ":"
134,680, // ";"
136,871, // "/"
142,680, // {"A".."Z" "j" "q"}
143,680, // " "
144,680, // "_"
145,680, // {"#".."$" "?".."@" "^" "`" "~"}
146,680, // {"0".."9"}
147,680, // "'"
148,680, // '"'
156,680, // "\"
165,1319, // eol
169,1203, // star
170,273, // slash
171,1074, // slash_star
172,1545, // comment_printable
173,226, // comment_stuff
174,1109, // comment_stuff**
175,976, // {10}
176,753, // {13}
180,545, // comment_stuff*
  }
,
{ // state 234
112,676, // "g"
  }
,
{ // state 235
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+177, // $NT
  }
,
{ // state 236
0x80000000|178, // match move
0x80000000|520, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 237
0x80000000|1340, // match move
0x80000000|218, // no-match move
// T-test match for 10:
175,
  }
,
{ // state 238
2,830, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 239
97,1246, // "n"
  }
,
{ // state 240
0x80000000|1, // match move
0x80000000|999, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 241
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 242
99,7, // "t"
  }
,
{ // state 243
168,74, // single_printable**
181,624, // single_printable*
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 244
0x80000000|1408, // match move
0x80000000|1050, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 245
175,769, // {10}
  }
,
{ // state 246
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 247
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 248
0x80000000|1, // match move
0x80000000|40, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 249
108,1188, // "u"
  }
,
{ // state 250
94,1387, // "e"
  }
,
{ // state 251
95,613, // "b"
  }
,
{ // state 252
2,1553, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 253
90,1093, // "l"
97,526, // "n"
98,1330, // "x"
  }
,
{ // state 254
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 255
96,456, // "o"
  }
,
{ // state 256
106,484, // "r"
  }
,
{ // state 257
2,530, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 258
2,473, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 259
183,MIN_REDUCTION+245, // $NT
  }
,
{ // state 260
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 261
90,744, // "l"
  }
,
{ // state 262
2,715, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 263
0x80000000|1198, // match move
0x80000000|230, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 264
0x80000000|854, // match move
0x80000000|809, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 265
0x80000000|541, // match move
0x80000000|170, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 266
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+105, // $NT
  }
,
{ // state 267
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 268
105,1504, // "f"
  }
,
{ // state 269
91,714, // "a"
  }
,
{ // state 270
0x80000000|1215, // match move
0x80000000|1337, // no-match move
0x80000000|1197, // NT-test-match state for reserved
  }
,
{ // state 271
2,459, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 272
92,1559, // "s"
  }
,
{ // state 273
0x80000000|638, // match move
0x80000000|672, // no-match move
0x80000000|96, // NT-test-match state for comment_stuff
  }
,
{ // state 274
0x80000000|1, // match move
0x80000000|131, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 275
2,389, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+140, // $NT
  }
,
{ // state 276
2,873, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 277
183,MIN_REDUCTION+331, // $NT
  }
,
{ // state 278
92,479, // "s"
  }
,
{ // state 279
102,1339, // "i"
  }
,
{ // state 280
2,944, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 281
0x80000000|245, // match move
0x80000000|1562, // no-match move
// T-test match for 10:
175,
  }
,
{ // state 282
2,236, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 283
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 284
121,698, // "*"
174,1109, // comment_stuff**
180,545, // comment_stuff*
  }
,
{ // state 285
183,MIN_REDUCTION+334, // $NT
  }
,
{ // state 286
183,MIN_REDUCTION+247, // $NT
  }
,
{ // state 287
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+129, // $NT
  }
,
{ // state 288
0x80000000|339, // match move
0x80000000|366, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 289
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 290
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 291
2,1324, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 292
92,147, // "s"
  }
,
{ // state 293
2,707, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 294
0x80000000|1485, // match move
0x80000000|591, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 295
2,1236, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 296
91,1196, // "a"
  }
,
{ // state 297
111,1020, // "m"
  }
,
{ // state 298
0x80000000|1538, // match move
0x80000000|683, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 299
92,477, // "s"
  }
,
{ // state 300
0x80000000|898, // match move
0x80000000|869, // no-match move
0x80000000|73, // NT-test-match state for digit
  }
,
{ // state 301
104,469, // "h"
  }
,
{ // state 302
0x80000000|1, // match move
0x80000000|992, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 303
2,333, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 304
0x80000000|358, // match move
0x80000000|1336, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 305
100,857, // "d"
  }
,
{ // state 306
0x80000000|973, // match move
0x80000000|950, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 307
168,799, // single_printable**
181,1368, // single_printable*
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 308
94,397, // "e"
  }
,
{ // state 309
100,718, // "d"
  }
,
{ // state 310
0x80000000|1, // match move
0x80000000|37, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 311
0x80000000|1, // match move
0x80000000|48, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 312
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 313
0x80000000|1, // match move
0x80000000|363, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 314
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 315
0x80000000|1, // match move
0x80000000|446, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 316
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 317
MIN_REDUCTION+353, // (default reduction)
  }
,
{ // state 318
0x80000000|337, // match move
0x80000000|116, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 319
0x80000000|1409, // match move
0x80000000|748, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 320
0x80000000|581, // match move
0x80000000|97, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 321
0x80000000|824, // match move
0x80000000|1015, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 322
97,249, // "n"
  }
,
{ // state 323
0x80000000|879, // match move
0x80000000|1022, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 324
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 325
99,739, // "t"
  }
,
{ // state 326
0x80000000|1348, // match move
0x80000000|772, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 327
90,292, // "l"
  }
,
{ // state 328
108,766, // "u"
  }
,
{ // state 329
2,1229, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+132, // $NT
  }
,
{ // state 330
99,112, // "t"
  }
,
{ // state 331
0x80000000|1080, // match move
0x80000000|222, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 332
96,777, // "o"
  }
,
{ // state 333
0x80000000|1357, // match move
0x80000000|882, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 334
99,1531, // "t"
  }
,
{ // state 335
0x80000000|1, // match move
0x80000000|202, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 336
2,1239, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 337
2,200, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 338
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 339
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 340
92,890, // "s"
99,1255, // "t"
  }
,
{ // state 341
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 342
2,902, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+158, // $NT
  }
,
{ // state 343
2,1227, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 344
0x80000000|636, // match move
0x80000000|1259, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 345
121,1091, // "*"
  }
,
{ // state 346
94,63, // "e"
  }
,
{ // state 347
2,101, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 348
106,1460, // "r"
  }
,
{ // state 349
89,373, // "c"
90,373, // "l"
91,373, // "a"
92,373, // "s"
94,373, // "e"
95,373, // "b"
96,373, // "o"
97,373, // "n"
98,373, // "x"
99,373, // "t"
100,373, // "d"
101,373, // "v"
102,373, // "i"
103,373, // "w"
104,373, // "h"
105,373, // "f"
106,373, // "r"
107,373, // "k"
108,373, // "u"
109,373, // "p"
110,373, // "y"
111,373, // "m"
112,373, // "g"
113,373, // "z"
115,373, // "!"
116,373, // "="
117,373, // "<"
118,373, // ">"
119,373, // "+"
120,373, // "-"
121,373, // "*"
122,373, // "%"
123,373, // "&"
124,373, // "("
125,373, // ")"
126,373, // "{"
127,373, // "}"
128,373, // "["
129,373, // "]"
130,373, // "|"
131,373, // "."
132,373, // ","
133,373, // ":"
134,373, // ";"
136,373, // "/"
142,373, // {"A".."Z" "j" "q"}
143,373, // " "
144,373, // "_"
145,373, // {"#".."$" "?".."@" "^" "`" "~"}
146,373, // {"0".."9"}
147,373, // "'"
148,373, // '"'
156,373, // "\"
164,373, // {9 12}
167,151, // single_printable
168,799, // single_printable**
181,1368, // single_printable*
  }
,
{ // state 350
0x80000000|735, // match move
0x80000000|1451, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 351
2,88, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 352
105,196, // "f"
  }
,
{ // state 353
183,MIN_REDUCTION+241, // $NT
  }
,
{ // state 354
183,MIN_REDUCTION+234, // $NT
  }
,
{ // state 355
0x80000000|914, // match move
0x80000000|454, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 356
2,1376, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 357
0x80000000|462, // match move
0x80000000|1075, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 358
2,1306, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 359
2,1016, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+124, // $NT
  }
,
{ // state 360
0x80000000|1059, // match move
0x80000000|972, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 361
183,MIN_REDUCTION+354, // $NT
  }
,
{ // state 362
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 363
0x80000000|98, // match move
0x80000000|674, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 364
183,MIN_REDUCTION+338, // $NT
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 365
2,842, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 366
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 367
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+155, // $NT
  }
,
{ // state 368
90,787, // "l"
102,51, // "i"
  }
,
{ // state 369
90,681, // "l"
  }
,
{ // state 370
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 371
183,MIN_REDUCTION+346, // $NT
  }
,
{ // state 372
2,403, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 373
0x80000000|411, // match move
0x80000000|49, // no-match move
0x80000000|776, // NT-test-match state for single_printable
  }
,
{ // state 374
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 375
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 376
102,10, // "i"
  }
,
{ // state 377
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 378
0x80000000|1470, // match move
0x80000000|646, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 379
2,1096, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 380
0x80000000|1, // match move
0x80000000|1150, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 381
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 382
2,5, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 383
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 384
105,1309, // "f"
  }
,
{ // state 385
94,91, // "e"
  }
,
{ // state 386
2,1430, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+170, // $NT
  }
,
{ // state 387
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+115, // $NT
  }
,
{ // state 388
0x80000000|1529, // match move
0x80000000|427, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 389
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+139, // $NT
  }
,
{ // state 390
MIN_REDUCTION+315, // (default reduction)
  }
,
{ // state 391
0x80000000|1, // match move
0x80000000|386, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 392
2,177, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+90, // $NT
  }
,
{ // state 393
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 394
0x80000000|1, // match move
0x80000000|304, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 395
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 396
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 397
0x80000000|1, // match move
0x80000000|321, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 398
183,MIN_REDUCTION+238, // $NT
  }
,
{ // state 399
0x80000000|1276, // match move
0x80000000|924, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 400
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 401
0x80000000|1, // match move
0x80000000|1287, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 402
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 403
0x80000000|951, // match move
0x80000000|451, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 404
0x80000000|1, // match move
0x80000000|708, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 405
99,352, // "t"
  }
,
{ // state 406
94,152, // "e"
  }
,
{ // state 407
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 408
MIN_REDUCTION+364, // (default reduction)
  }
,
{ // state 409
104,1372, // "h"
  }
,
{ // state 410
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 411
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 412
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 413
0x80000000|1, // match move
0x80000000|1200, // no-match move
// T-test match for "/":
136,
  }
,
{ // state 414
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 415
97,93, // "n"
  }
,
{ // state 416
91,25, // "a"
106,641, // "r"
108,889, // "u"
  }
,
{ // state 417
183,MIN_REDUCTION+229, // $NT
  }
,
{ // state 418
0x80000000|732, // match move
0x80000000|1572, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 419
121,109, // "*"
174,702, // comment_stuff**
180,545, // comment_stuff*
  }
,
{ // state 420
0x80000000|349, // match move
0x80000000|307, // no-match move
0x80000000|776, // NT-test-match state for single_printable
  }
,
{ // state 421
0x80000000|1195, // match move
0x80000000|991, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 422
0x80000000|1349, // match move
0x80000000|1544, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 423
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 424
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 425
0x80000000|555, // match move
0x80000000|23, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 426
94,1092, // "e"
  }
,
{ // state 427
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 428
99,930, // "t"
  }
,
{ // state 429
183,MIN_REDUCTION+349, // $NT
  }
,
{ // state 430
102,198, // "i"
  }
,
{ // state 431
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 432
2,185, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+176, // $NT
  }
,
{ // state 433
2,803, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+94, // $NT
  }
,
{ // state 434
0x80000000|1, // match move
0x80000000|1002, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 435
90,369, // "l"
  }
,
{ // state 436
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 437
182,MIN_REDUCTION+0, // $
  }
,
{ // state 438
0x80000000|291, // match move
0x80000000|1422, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 439
0x80000000|807, // match move
0x80000000|1285, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 440
2,1382, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+92, // $NT
  }
,
{ // state 441
2,984, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 442
0x80000000|347, // match move
0x80000000|497, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 443
0x80000000|1, // match move
0x80000000|653, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 444
0x80000000|1061, // match move
0x80000000|396, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 445
2,77, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 446
2,1302, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+102, // $NT
  }
,
{ // state 447
108,1053, // "u"
  }
,
{ // state 448
2,1350, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 449
0x80000000|1311, // match move
0x80000000|382, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 450
2,978, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+152, // $NT
  }
,
{ // state 451
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 452
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 453
183,MIN_REDUCTION+214, // $NT
  }
,
{ // state 454
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 455
0x80000000|1, // match move
0x80000000|993, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 456
90,573, // "l"
  }
,
{ // state 457
94,778, // "e"
  }
,
{ // state 458
99,725, // "t"
  }
,
{ // state 459
0x80000000|1468, // match move
0x80000000|395, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 460
2,331, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 461
0x80000000|1124, // match move
0x80000000|1135, // no-match move
0x80000000|73, // NT-test-match state for digit
  }
,
{ // state 462
2,164, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 463
0x80000000|1, // match move
0x80000000|639, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 464
106,145, // "r"
  }
,
{ // state 465
92,819, // "s"
  }
,
{ // state 466
2,1404, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 467
2,223, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+192, // $NT
  }
,
{ // state 468
0x80000000|1499, // match move
0x80000000|500, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 469
0x80000000|1, // match move
0x80000000|486, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 470
183,MIN_REDUCTION+364, // $NT
MIN_REDUCTION+364, // (default reduction)
  }
,
{ // state 471
0x80000000|1, // match move
0x80000000|12, // no-match move
// T-test match for "/":
136,
  }
,
{ // state 472
0x80000000|909, // match move
0x80000000|1379, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 473
0x80000000|587, // match move
0x80000000|1490, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 474
MIN_REDUCTION+367, // (default reduction)
  }
,
{ // state 475
183,MIN_REDUCTION+207, // $NT
  }
,
{ // state 476
2,606, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+154, // $NT
  }
,
{ // state 477
0x80000000|1, // match move
0x80000000|1235, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 478
96,987, // "o"
  }
,
{ // state 479
0x80000000|1, // match move
0x80000000|1187, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 480
183,MIN_REDUCTION+209, // $NT
  }
,
{ // state 481
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 482
183,MIN_REDUCTION+221, // $NT
  }
,
{ // state 483
94,597, // "e"
  }
,
{ // state 484
96,610, // "o"
  }
,
{ // state 485
175,966, // {10}
  }
,
{ // state 486
0x80000000|736, // match move
0x80000000|1003, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 487
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 488
2,388, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 489
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+113, // $NT
  }
,
{ // state 490
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 491
102,322, // "i"
  }
,
{ // state 492
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 493
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 494
2,578, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 495
0x80000000|1484, // match move
0x80000000|617, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 496
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 497
2,101, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 498
113,346, // "z"
  }
,
{ // state 499
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 500
2,1435, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 501
0x80000000|1, // match move
0x80000000|1321, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 502
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+193, // $NT
  }
,
{ // state 503
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 504
2,860, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 505
0x80000000|485, // match move
0x80000000|1420, // no-match move
// T-test match for 10:
175,
  }
,
{ // state 506
94,274, // "e"
  }
,
{ // state 507
3,9, // $$0
4,1222, // token
135,1018, // comment
136,798, // "/"
143,1113, // " "
163,540, // white
164,1113, // {9 12}
166,1275, // ds
177,1201, // token*
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 508
MIN_REDUCTION+345, // (default reduction)
  }
,
{ // state 509
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 510
94,394, // "e"
  }
,
{ // state 511
2,489, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+114, // $NT
  }
,
{ // state 512
2,1352, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+122, // $NT
  }
,
{ // state 513
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 514
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 515
102,774, // "i"
  }
,
{ // state 516
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 517
0x80000000|1, // match move
0x80000000|439, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 518
89,215, // "c"
  }
,
{ // state 519
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 520
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 521
183,MIN_REDUCTION+232, // $NT
  }
,
{ // state 522
183,MIN_REDUCTION+339, // $NT
  }
,
{ // state 523
0x80000000|559, // match move
0x80000000|379, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 524
0x80000000|1367, // match move
0x80000000|775, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 525
91,644, // "a"
  }
,
{ // state 526
108,8, // "u"
  }
,
{ // state 527
0x80000000|1488, // match move
0x80000000|635, // no-match move
0x80000000|1206, // NT-test-match state for dq
  }
,
{ // state 528
99,572, // "t"
  }
,
{ // state 529
136,MIN_REDUCTION+338, // "/"
143,MIN_REDUCTION+338, // " "
163,MIN_REDUCTION+338, // white
164,MIN_REDUCTION+338, // {9 12}
175,MIN_REDUCTION+338, // {10}
176,MIN_REDUCTION+338, // {13}
183,MIN_REDUCTION+338, // $NT
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 530
0x80000000|189, // match move
0x80000000|513, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 531
99,376, // "t"
  }
,
{ // state 532
2,187, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+108, // $NT
  }
,
{ // state 533
2,1017, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 534
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 535
2,1236, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 536
94,217, // "e"
  }
,
{ // state 537
121,221, // "*"
136,1012, // "/"
  }
,
{ // state 538
0x80000000|1, // match move
0x80000000|425, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 539
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+189, // $NT
  }
,
{ // state 540
MIN_REDUCTION+363, // (default reduction)
  }
,
{ // state 541
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 542
183,MIN_REDUCTION+351, // $NT
  }
,
{ // state 543
183,MIN_REDUCTION+210, // $NT
  }
,
{ // state 544
91,853, // "a"
  }
,
{ // state 545
0x80000000|1226, // match move
0x80000000|751, // no-match move
0x80000000|96, // NT-test-match state for comment_stuff
  }
,
{ // state 546
MIN_REDUCTION+367, // (default reduction)
  }
,
{ // state 547
103,80, // "w"
  }
,
{ // state 548
92,989, // "s"
  }
,
{ // state 549
92,1327, // "s"
  }
,
{ // state 550
175,361, // {10}
  }
,
{ // state 551
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 552
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 553
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+127, // $NT
  }
,
{ // state 554
2,387, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+116, // $NT
  }
,
{ // state 555
2,524, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 556
90,906, // "l"
  }
,
{ // state 557
0x80000000|1026, // match move
0x80000000|648, // no-match move
0x80000000|776, // NT-test-match state for single_printable
  }
,
{ // state 558
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 559
2,1096, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 560
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 561
92,1427, // "s"
99,1024, // "t"
  }
,
{ // state 562
90,752, // "l"
  }
,
{ // state 563
0x80000000|1042, // match move
0x80000000|856, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 564
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 565
0x80000000|411, // match move
0x80000000|1503, // no-match move
0x80000000|776, // NT-test-match state for single_printable
  }
,
{ // state 566
183,MIN_REDUCTION+243, // $NT
  }
,
{ // state 567
2,842, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 568
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 569
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 570
106,544, // "r"
  }
,
{ // state 571
0x80000000|1, // match move
0x80000000|1523, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 572
0x80000000|1, // match move
0x80000000|724, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 573
94,953, // "e"
  }
,
{ // state 574
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 575
99,548, // "t"
  }
,
{ // state 576
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 577
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 578
0x80000000|558, // match move
0x80000000|1290, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 579
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 580
148,687, // '"'
157,765, // dq
160,410, // $$1
  }
,
{ // state 581
2,903, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 582
0x80000000|1, // match move
0x80000000|1512, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 583
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 584
95,556, // "b"
  }
,
{ // state 585
136,542, // "/"
  }
,
{ // state 586
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 587
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 588
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 589
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 590
183,MIN_REDUCTION+363, // $NT
MIN_REDUCTION+363, // (default reduction)
  }
,
{ // state 591
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 592
MIN_REDUCTION+373, // (default reduction)
  }
,
{ // state 593
0x80000000|1, // match move
0x80000000|1426, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 594
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 595
94,315, // "e"
  }
,
{ // state 596
2,1156, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+112, // $NT
  }
,
{ // state 597
106,172, // "r"
  }
,
{ // state 598
0x80000000|290, // match move
0x80000000|1186, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 599
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 600
102,121, // "i"
  }
,
{ // state 601
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 602
2,39, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 603
183,MIN_REDUCTION+211, // $NT
  }
,
{ // state 604
2,1107, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 605
MIN_REDUCTION+352, // (default reduction)
  }
,
{ // state 606
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+153, // $NT
  }
,
{ // state 607
183,MIN_REDUCTION+343, // $NT
  }
,
{ // state 608
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 609
108,251, // "u"
  }
,
{ // state 610
97,760, // "n"
  }
,
{ // state 611
0x80000000|377, // match move
0x80000000|1280, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 612
0x80000000|1, // match move
0x80000000|1384, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 613
90,510, // "l"
  }
,
{ // state 614
2,1429, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 615
0x80000000|619, // match move
0x80000000|303, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 616
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 617
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 618
139,576, // idChar**
179,421, // idChar*
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 619
2,333, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 620
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 621
2,1158, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 622
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 623
96,1028, // "o"
  }
,
{ // state 624
0x80000000|625, // match move
0x80000000|1547, // no-match move
0x80000000|776, // NT-test-match state for single_printable
  }
,
{ // state 625
89,1457, // "c"
90,1457, // "l"
91,1457, // "a"
92,1457, // "s"
94,1457, // "e"
95,1457, // "b"
96,1457, // "o"
97,1457, // "n"
98,1457, // "x"
99,1457, // "t"
100,1457, // "d"
101,1457, // "v"
102,1457, // "i"
103,1457, // "w"
104,1457, // "h"
105,1457, // "f"
106,1457, // "r"
107,1457, // "k"
108,1457, // "u"
109,1457, // "p"
110,1457, // "y"
111,1457, // "m"
112,1457, // "g"
113,1457, // "z"
115,1457, // "!"
116,1457, // "="
117,1457, // "<"
118,1457, // ">"
119,1457, // "+"
120,1457, // "-"
121,1457, // "*"
122,1457, // "%"
123,1457, // "&"
124,1457, // "("
125,1457, // ")"
126,1457, // "{"
127,1457, // "}"
128,1457, // "["
129,1457, // "]"
130,1457, // "|"
131,1457, // "."
132,1457, // ","
133,1457, // ":"
134,1457, // ";"
136,1457, // "/"
142,1457, // {"A".."Z" "j" "q"}
143,1457, // " "
144,1457, // "_"
145,1457, // {"#".."$" "?".."@" "^" "`" "~"}
146,1457, // {"0".."9"}
147,1457, // "'"
148,1457, // '"'
156,1457, // "\"
164,1457, // {9 12}
167,181, // single_printable
  }
,
{ // state 626
183,MIN_REDUCTION+201, // $NT
  }
,
{ // state 627
0x80000000|1, // match move
0x80000000|710, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 628
0x80000000|1, // match move
0x80000000|1385, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 629
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 630
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 631
4,988, // token
58,499, // `!
59,649, // `!=
60,1407, // `%
61,383, // `&&
62,1532, // `*
63,568, // `(
64,650, // `)
65,905, // `{
66,1412, // `}
67,72, // `-
68,161, // `+
69,1506, // `=
70,338, // `==
71,1240, // `[
72,260, // `]
73,1033, // `||
74,414, // `<
75,423, // `<=
76,1162, // `,
77,1164, // `>
78,1423, // `>=
79,1121, // `.
80,1361, // `;
81,1391, // `++
82,560, // `--
83,496, // `/
84,1511, // `:
85,492, // ID
86,1442, // INT_LITERAL
87,1127, // STRING_LITERAL
88,929, // CHARACTER_LITERAL
89,611, // "c"
90,611, // "l"
91,611, // "a"
92,611, // "s"
94,611, // "e"
95,611, // "b"
96,611, // "o"
97,611, // "n"
98,611, // "x"
99,611, // "t"
100,611, // "d"
101,611, // "v"
102,611, // "i"
103,611, // "w"
104,611, // "h"
105,611, // "f"
106,611, // "r"
107,611, // "k"
108,611, // "u"
109,611, // "p"
110,611, // "y"
111,611, // "m"
112,611, // "g"
113,611, // "z"
115,197, // "!"
116,24, // "="
117,229, // "<"
118,350, // ">"
119,1548, // "+"
120,1170, // "-"
121,1217, // "*"
122,523, // "%"
123,1288, // "&"
124,875, // "("
125,1329, // ")"
126,1465, // "{"
127,1318, // "}"
128,615, // "["
129,357, // "]"
130,146, // "|"
131,378, // "."
132,1371, // ","
133,11, // ":"
134,320, // ";"
136,21, // "/"
137,1477, // identifier
138,19, // letter
140,127, // digit++
142,611, // {"A".."Z" "j" "q"}
146,300, // {"0".."9"}
147,503, // "'"
148,797, // '"'
157,527, // dq
161,1106, // sq
162,922, // digit
178,461, // digit+
MIN_REDUCTION+374, // (default reduction)
  }
,
{ // state 632
2,1155, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 633
91,730, // "a"
  }
,
{ // state 634
MIN_REDUCTION+370, // (default reduction)
  }
,
{ // state 635
89,1441, // "c"
90,1441, // "l"
91,1441, // "a"
92,1441, // "s"
94,1441, // "e"
95,1441, // "b"
96,1441, // "o"
97,1441, // "n"
98,1441, // "x"
99,1441, // "t"
100,1441, // "d"
101,1441, // "v"
102,1441, // "i"
103,1441, // "w"
104,1441, // "h"
105,1441, // "f"
106,1441, // "r"
107,1441, // "k"
108,1441, // "u"
109,1441, // "p"
110,1441, // "y"
111,1441, // "m"
112,1441, // "g"
113,1441, // "z"
115,1441, // "!"
116,1441, // "="
117,1441, // "<"
118,1441, // ">"
119,1441, // "+"
120,1441, // "-"
121,1441, // "*"
122,1441, // "%"
123,1441, // "&"
124,1441, // "("
125,1441, // ")"
126,1441, // "{"
127,1441, // "}"
128,1441, // "["
129,1441, // "]"
130,1441, // "|"
131,1441, // "."
132,1441, // ","
133,1441, // ":"
134,1441, // ";"
136,1441, // "/"
141,452, // character_printable
142,1441, // {"A".."Z" "j" "q"}
143,1441, // " "
144,1441, // "_"
145,1441, // {"#".."$" "?".."@" "^" "`" "~"}
146,1441, // {"0".."9"}
147,1441, // "'"
148,1441, // '"'
149,393, // back_back
150,32, // back_dquote
151,1415, // back_squote
152,493, // back_n
153,44, // back_tab
154,246, // back_form
155,1555, // back_return
156,742, // "\"
158,894, // stringChar
159,1057, // stringChar*
160,608, // $$1
  }
,
{ // state 636
2,955, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 637
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 638
MIN_REDUCTION+348, // (default reduction)
  }
,
{ // state 639
0x80000000|138, // match move
0x80000000|343, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 640
3,9, // $$0
4,1222, // token
5,975, // `boolean
6,1396, // `class
7,1136, // `extends
8,822, // `void
9,700, // `int
10,1332, // `while
11,1114, // `if
12,1500, // `else
13,111, // `for
14,678, // `break
15,1363, // `this
16,818, // `false
17,937, // `true
18,1220, // `super
19,918, // `null
20,1424, // `return
21,267, // `instanceof
22,601, // `new
23,314, // `abstract
24,878, // `assert
25,855, // `byte
26,1286, // `case
27,516, // `catch
28,1300, // `char
29,899, // `const
30,1072, // `continue
31,569, // `default
32,599, // `do
33,594, // `double
34,1452, // `enum
35,1157, // `final
36,637, // `finally
37,1540, // `float
38,964, // `goto
39,816, // `implements
40,786, // `import
41,1263, // `interface
42,316, // `long
43,1241, // `native
44,169, // `package
45,114, // `private
46,1436, // `protected
47,1095, // `public
48,50, // `short
49,158, // `static
50,1077, // `strictfp
51,1252, // `switch
52,1167, // `synchronized
53,1563, // `throw
54,1398, // `throws
55,144, // `transient
56,1029, // `try
57,552, // `volatile
89,1060, // "c"
90,1514, // "l"
91,135, // "a"
92,195, // "s"
94,253, // "e"
95,982, // "b"
97,1568, // "n"
99,1375, // "t"
100,142, // "d"
101,184, // "v"
102,1305, // "i"
103,1165, // "w"
105,1069, // "f"
106,536, // "r"
109,1104, // "p"
112,1456, // "g"
177,1201, // token*
MIN_REDUCTION+3, // (default reduction)
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
{ // state 641
96,986, // "o"
102,1486, // "i"
  }
,
{ // state 642
183,MIN_REDUCTION+202, // $NT
  }
,
{ // state 643
94,296, // "e"
  }
,
{ // state 644
108,205, // "u"
  }
,
{ // state 645
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 646
2,174, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 647
MIN_REDUCTION+366, // (default reduction)
  }
,
{ // state 648
183,MIN_REDUCTION+368, // $NT
MIN_REDUCTION+368, // (default reduction)
  }
,
{ // state 649
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 650
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 651
0x80000000|1, // match move
0x80000000|727, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 652
109,228, // "p"
  }
,
{ // state 653
0x80000000|1326, // match move
0x80000000|721, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 654
97,1008, // "n"
  }
,
{ // state 655
2,959, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+186, // $NT
  }
,
{ // state 656
99,858, // "t"
  }
,
{ // state 657
183,MIN_REDUCTION+242, // $NT
  }
,
{ // state 658
94,802, // "e"
  }
,
{ // state 659
0x80000000|85, // match move
0x80000000|33, // no-match move
0x80000000|776, // NT-test-match state for single_printable
  }
,
{ // state 660
0x80000000|928, // match move
0x80000000|1472, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 661
102,133, // "i"
  }
,
{ // state 662
0x80000000|960, // match move
0x80000000|1071, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 663
183,MIN_REDUCTION+335, // $NT
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 664
94,593, // "e"
  }
,
{ // state 665
183,MIN_REDUCTION+206, // $NT
  }
,
{ // state 666
2,355, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 667
183,MIN_REDUCTION+246, // $NT
  }
,
{ // state 668
116,660, // "="
  }
,
{ // state 669
2,1230, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 670
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 671
0x80000000|645, // match move
0x80000000|1416, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 672
MIN_REDUCTION+348, // (default reduction)
  }
,
{ // state 673
89,405, // "c"
  }
,
{ // state 674
2,1274, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 675
2,360, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+376, // (default reduction)
  }
,
{ // state 676
94,404, // "e"
  }
,
{ // state 677
2,1065, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 678
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 679
183,MIN_REDUCTION+215, // $NT
  }
,
{ // state 680
0x80000000|182, // match move
0x80000000|508, // no-match move
0x80000000|96, // NT-test-match state for comment_stuff
  }
,
{ // state 681
0x80000000|1, // match move
0x80000000|1362, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 682
2,265, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 683
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 684
0x80000000|754, // match move
0x80000000|1343, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 685
0x80000000|1105, // match move
0x80000000|1052, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 686
0x80000000|759, // match move
0x80000000|1536, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 687
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 688
2,1353, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 689
2,738, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+138, // $NT
  }
,
{ // state 690
91,789, // "a"
  }
,
{ // state 691
2,873, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 692
102,334, // "i"
  }
,
{ // state 693
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 694
183,MIN_REDUCTION+333, // $NT
  }
,
{ // state 695
MIN_REDUCTION+366, // (default reduction)
  }
,
{ // state 696
0x80000000|381, // match move
0x80000000|823, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 697
MIN_REDUCTION+370, // (default reduction)
  }
,
{ // state 698
136,977, // "/"
  }
,
{ // state 699
91,232, // "a"
  }
,
{ // state 700
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 701
MIN_REDUCTION+353, // (default reduction)
  }
,
{ // state 702
121,585, // "*"
  }
,
{ // state 703
183,MIN_REDUCTION+200, // $NT
  }
,
{ // state 704
96,1179, // "o"
102,213, // "i"
  }
,
{ // state 705
136,537, // "/"
166,1081, // ds
  }
,
{ // state 706
1,437, // start
2,1446, // white*
3,1137, // $$0
4,1222, // token
135,1018, // comment
136,798, // "/"
143,1113, // " "
163,1243, // white
164,1113, // {9 12}
166,1275, // ds
177,1201, // token*
182,MIN_REDUCTION+1, // $
  }
,
{ // state 707
0x80000000|1238, // match move
0x80000000|793, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 708
0x80000000|895, // match move
0x80000000|1437, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 709
183,MIN_REDUCTION+218, // $NT
  }
,
{ // state 710
0x80000000|867, // match move
0x80000000|677, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 711
-1, // $$start
-1, // start
-1, // white*
9, // $$0
1222, // token
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
499, // `!
649, // `!=
1407, // `%
383, // `&&
1532, // `*
568, // `(
650, // `)
905, // `{
1412, // `}
72, // `-
161, // `+
1506, // `=
338, // `==
1240, // `[
260, // `]
1033, // `||
414, // `<
423, // `<=
1162, // `,
1164, // `>
1423, // `>=
1121, // `.
1361, // `;
1391, // `++
560, // `--
496, // `/
1511, // `:
492, // ID
1442, // INT_LITERAL
1127, // STRING_LITERAL
929, // CHARACTER_LITERAL
611, // "c"
611, // "l"
611, // "a"
611, // "s"
-1, // idChar
611, // "e"
611, // "b"
611, // "o"
611, // "n"
611, // "x"
611, // "t"
611, // "d"
611, // "v"
611, // "i"
611, // "w"
611, // "h"
611, // "f"
611, // "r"
611, // "k"
611, // "u"
611, // "p"
611, // "y"
611, // "m"
611, // "g"
611, // "z"
-1, // reserved
197, // "!"
24, // "="
229, // "<"
350, // ">"
1548, // "+"
1170, // "-"
1217, // "*"
523, // "%"
1288, // "&"
875, // "("
1329, // ")"
1465, // "{"
1318, // "}"
615, // "["
357, // "]"
146, // "|"
378, // "."
1371, // ","
11, // ":"
320, // ";"
-1, // comment
21, // "/"
1477, // identifier
19, // letter
-1, // idChar**
127, // digit++
-1, // character_printable
611, // {"A".."Z" "j" "q"}
1113, // " "
-1, // "_"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
300, // {"0".."9"}
503, // "'"
797, // '"'
-1, // back_back
-1, // back_dquote
-1, // back_squote
-1, // back_n
-1, // back_tab
-1, // back_form
-1, // back_return
-1, // "\"
527, // dq
-1, // stringChar
-1, // stringChar*
-1, // $$1
1106, // sq
922, // digit
540, // white
1113, // {9 12}
1356, // eol
-1, // ds
-1, // single_printable
-1, // single_printable**
-1, // star
-1, // slash
-1, // slash_star
-1, // comment_printable
-1, // comment_stuff
-1, // comment_stuff**
767, // {10}
505, // {13}
1201, // token*
461, // digit+
-1, // idChar*
-1, // comment_stuff*
-1, // single_printable*
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 712
91,1461, // "a"
108,1564, // "u"
110,843, // "y"
  }
,
{ // state 713
2,897, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+150, // $NT
  }
,
{ // state 714
90,1199, // "l"
  }
,
{ // state 715
0x80000000|219, // match move
0x80000000|1041, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 716
94,835, // "e"
  }
,
{ // state 717
0x80000000|1, // match move
0x80000000|1528, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 718
0x80000000|1, // match move
0x80000000|46, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 719
89,969, // "c"
90,969, // "l"
91,969, // "a"
92,969, // "s"
94,969, // "e"
95,969, // "b"
96,969, // "o"
97,969, // "n"
98,969, // "x"
99,969, // "t"
100,969, // "d"
101,969, // "v"
102,969, // "i"
103,969, // "w"
104,969, // "h"
105,969, // "f"
106,969, // "r"
107,969, // "k"
108,969, // "u"
109,969, // "p"
110,969, // "y"
111,969, // "m"
112,969, // "g"
113,969, // "z"
115,969, // "!"
116,969, // "="
117,969, // "<"
118,969, // ">"
119,969, // "+"
120,969, // "-"
121,969, // "*"
122,969, // "%"
123,969, // "&"
124,969, // "("
125,969, // ")"
126,969, // "{"
127,969, // "}"
128,969, // "["
129,969, // "]"
130,969, // "|"
131,969, // "."
132,969, // ","
133,969, // ":"
134,969, // ";"
136,969, // "/"
142,969, // {"A".."Z" "j" "q"}
143,969, // " "
144,969, // "_"
145,969, // {"#".."$" "?".."@" "^" "`" "~"}
146,969, // {"0".."9"}
147,969, // "'"
148,969, // '"'
156,969, // "\"
164,969, // {9 12}
167,1119, // single_printable
168,204, // single_printable**
181,925, // single_printable*
  }
,
{ // state 720
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+167, // $NT
  }
,
{ // state 721
2,1294, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 722
91,52, // "a"
  }
,
{ // state 723
109,1347, // "p"
  }
,
{ // state 724
0x80000000|448, // match move
0x80000000|1370, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 725
102,211, // "i"
  }
,
{ // state 726
0x80000000|1317, // match move
0x80000000|71, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 727
0x80000000|282, // match move
0x80000000|1459, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 728
0x80000000|1, // match move
0x80000000|449, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 729
2,662, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 730
106,628, // "r"
  }
,
{ // state 731
99,1466, // "t"
  }
,
{ // state 732
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 733
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 734
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+145, // $NT
  }
,
{ // state 735
116,344, // "="
  }
,
{ // state 736
2,671, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 737
2,1553, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 738
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+137, // $NT
  }
,
{ // state 739
96,55, // "o"
  }
,
{ // state 740
2,1463, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 741
94,1056, // "e"
  }
,
{ // state 742
97,165, // "n"
99,859, // "t"
105,514, // "f"
106,1004, // "r"
147,1556, // "'"
148,180, // '"'
156,1172, // "\"
  }
,
{ // state 743
97,305, // "n"
  }
,
{ // state 744
0x80000000|1, // match move
0x80000000|781, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 745
183,MIN_REDUCTION+337, // $NT
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 746
97,279, // "n"
  }
,
{ // state 747
90,1267, // "l"
91,327, // "a"
96,1450, // "o"
102,927, // "i"
  }
,
{ // state 748
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 749
183,MIN_REDUCTION+244, // $NT
  }
,
{ // state 750
2,1496, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 751
MIN_REDUCTION+360, // (default reduction)
  }
,
{ // state 752
94,571, // "e"
  }
,
{ // state 753
0x80000000|1359, // match move
0x80000000|1277, // no-match move
// T-test match for 10:
175,
  }
,
{ // state 754
2,171, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 755
183,MIN_REDUCTION+228, // $NT
  }
,
{ // state 756
0x80000000|1244, // match move
0x80000000|1364, // no-match move
0x80000000|776, // NT-test-match state for single_printable
  }
,
{ // state 757
97,1210, // "n"
  }
,
{ // state 758
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 759
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 760
102,498, // "i"
  }
,
{ // state 761
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+99, // $NT
  }
,
{ // state 762
94,110, // "e"
  }
,
{ // state 763
97,340, // "n"
105,501, // "f"
111,652, // "m"
  }
,
{ // state 764
MIN_REDUCTION+369, // (default reduction)
  }
,
{ // state 765
0x80000000|868, // match move
0x80000000|675, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 766
94,434, // "e"
  }
,
{ // state 767
MIN_REDUCTION+353, // (default reduction)
  }
,
{ // state 768
90,430, // "l"
  }
,
{ // state 769
183,MIN_REDUCTION+354, // $NT
MIN_REDUCTION+354, // (default reduction)
  }
,
{ // state 770
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 771
2,1027, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+148, // $NT
  }
,
{ // state 772
2,813, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 773
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 774
90,595, // "l"
  }
,
{ // state 775
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 776
89,522, // "c"
90,522, // "l"
91,522, // "a"
92,522, // "s"
94,522, // "e"
95,522, // "b"
96,522, // "o"
97,522, // "n"
98,522, // "x"
99,522, // "t"
100,522, // "d"
101,522, // "v"
102,522, // "i"
103,522, // "w"
104,522, // "h"
105,522, // "f"
106,522, // "r"
107,522, // "k"
108,522, // "u"
109,522, // "p"
110,522, // "y"
111,522, // "m"
112,522, // "g"
113,522, // "z"
115,522, // "!"
116,522, // "="
117,522, // "<"
118,522, // ">"
119,522, // "+"
120,522, // "-"
121,522, // "*"
122,522, // "%"
123,522, // "&"
124,522, // "("
125,522, // ")"
126,522, // "{"
127,522, // "}"
128,522, // "["
129,522, // "]"
130,522, // "|"
131,522, // "."
132,522, // ","
133,522, // ":"
134,522, // ";"
136,522, // "/"
142,522, // {"A".."Z" "j" "q"}
143,522, // " "
144,522, // "_"
145,522, // {"#".."$" "?".."@" "^" "`" "~"}
146,522, // {"0".."9"}
147,522, // "'"
148,522, // '"'
156,522, // "\"
164,522, // {9 12}
  }
,
{ // state 777
90,406, // "l"
  }
,
{ // state 778
106,938, // "r"
  }
,
{ // state 779
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 780
89,680, // "c"
90,680, // "l"
91,680, // "a"
92,680, // "s"
94,680, // "e"
95,680, // "b"
96,680, // "o"
97,680, // "n"
98,680, // "x"
99,680, // "t"
100,680, // "d"
101,680, // "v"
102,680, // "i"
103,680, // "w"
104,680, // "h"
105,680, // "f"
106,680, // "r"
107,680, // "k"
108,680, // "u"
109,680, // "p"
110,680, // "y"
111,680, // "m"
112,680, // "g"
113,680, // "z"
115,680, // "!"
116,680, // "="
117,680, // "<"
118,680, // ">"
119,680, // "+"
120,680, // "-"
121,413, // "*"
122,680, // "%"
123,680, // "&"
124,680, // "("
125,680, // ")"
126,680, // "{"
127,680, // "}"
128,680, // "["
129,680, // "]"
130,680, // "|"
131,680, // "."
132,680, // ","
133,680, // ":"
134,680, // ";"
136,871, // "/"
142,680, // {"A".."Z" "j" "q"}
143,680, // " "
144,680, // "_"
145,680, // {"#".."$" "?".."@" "^" "`" "~"}
146,680, // {"0".."9"}
147,680, // "'"
148,680, // '"'
156,680, // "\"
165,1319, // eol
169,1203, // star
170,273, // slash
171,1074, // slash_star
172,1545, // comment_printable
173,226, // comment_stuff
174,702, // comment_stuff**
175,976, // {10}
176,753, // {13}
180,545, // comment_stuff*
  }
,
{ // state 781
0x80000000|494, // match move
0x80000000|1011, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 782
89,969, // "c"
90,969, // "l"
91,969, // "a"
92,969, // "s"
94,969, // "e"
95,969, // "b"
96,969, // "o"
97,969, // "n"
98,969, // "x"
99,969, // "t"
100,969, // "d"
101,969, // "v"
102,969, // "i"
103,969, // "w"
104,969, // "h"
105,969, // "f"
106,969, // "r"
107,969, // "k"
108,969, // "u"
109,969, // "p"
110,969, // "y"
111,969, // "m"
112,969, // "g"
113,969, // "z"
115,969, // "!"
116,969, // "="
117,969, // "<"
118,969, // ">"
119,969, // "+"
120,969, // "-"
121,969, // "*"
122,969, // "%"
123,969, // "&"
124,969, // "("
125,969, // ")"
126,969, // "{"
127,969, // "}"
128,969, // "["
129,969, // "]"
130,969, // "|"
131,969, // "."
132,969, // ","
133,969, // ":"
134,969, // ";"
136,969, // "/"
142,969, // {"A".."Z" "j" "q"}
143,969, // " "
144,969, // "_"
145,969, // {"#".."$" "?".."@" "^" "`" "~"}
146,969, // {"0".."9"}
147,969, // "'"
148,969, // '"'
156,969, // "\"
164,969, // {9 12}
167,1253, // single_printable
  }
,
{ // state 783
97,834, // "n"
  }
,
{ // state 784
MIN_REDUCTION+371, // (default reduction)
  }
,
{ // state 785
0x80000000|1358, // match move
0x80000000|533, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 786
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 787
91,1006, // "a"
  }
,
{ // state 788
104,443, // "h"
  }
,
{ // state 789
92,549, // "s"
  }
,
{ // state 790
2,502, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+194, // $NT
  }
,
{ // state 791
2,1429, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 792
0x80000000|1, // match move
0x80000000|1479, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 793
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 794
0x80000000|640, // match move
0x80000000|711, // no-match move
0x80000000|1197, // NT-test-match state for reserved
  }
,
{ // state 795
99,248, // "t"
  }
,
{ // state 796
96,746, // "o"
  }
,
{ // state 797
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 798
121,920, // "*"
136,659, // "/"
  }
,
{ // state 799
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 800
99,1247, // "t"
  }
,
{ // state 801
96,1390, // "o"
  }
,
{ // state 802
0x80000000|1, // match move
0x80000000|912, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 803
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+93, // $NT
  }
,
{ // state 804
0x80000000|907, // match move
0x80000000|563, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 805
97,575, // "n"
  }
,
{ // state 806
0x80000000|1183, // match move
0x80000000|192, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 807
2,319, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 808
112,62, // "g"
  }
,
{ // state 809
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 810
0x80000000|1, // match move
0x80000000|129, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 811
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 812
99,1261, // "t"
  }
,
{ // state 813
0x80000000|589, // match move
0x80000000|1469, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 814
92,1112, // "s"
99,1414, // "t"
  }
,
{ // state 815
2,1129, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+164, // $NT
  }
,
{ // state 816
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 817
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 818
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 819
94,348, // "e"
  }
,
{ // state 820
0x80000000|1, // match move
0x80000000|132, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 821
2,1513, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 822
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 823
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 824
2,685, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 825
97,1039, // "n"
  }
,
{ // state 826
89,1355, // "c"
90,1355, // "l"
91,1355, // "a"
92,1355, // "s"
93,1204, // idChar
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
138,422, // letter
139,576, // idChar**
142,1355, // {"A".."Z" "j" "q"}
144,244, // "_"
146,399, // {"0".."9"}
162,264, // digit
179,421, // idChar*
  }
,
{ // state 827
0x80000000|833, // match move
0x80000000|488, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 828
0x80000000|1, // match move
0x80000000|20, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 829
102,673, // "i"
  }
,
{ // state 830
0x80000000|551, // match move
0x80000000|148, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 831
0x80000000|1537, // match move
0x80000000|832, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 832
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 833
2,388, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 834
0x80000000|1, // match move
0x80000000|104, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 835
91,1007, // "a"
  }
,
{ // state 836
144,MIN_REDUCTION+338, // "_"
145,MIN_REDUCTION+338, // {"#".."$" "?".."@" "^" "`" "~"}
156,MIN_REDUCTION+338, // "\"
168,MIN_REDUCTION+338, // single_printable**
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 837
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 838
MIN_REDUCTION+368, // (default reduction)
  }
,
{ // state 839
90,194, // "l"
102,124, // "i"
  }
,
{ // state 840
0x80000000|441, // match move
0x80000000|1447, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 841
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 842
0x80000000|1301, // match move
0x80000000|921, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 843
0x80000000|1, // match move
0x80000000|827, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 844
0x80000000|1138, // match move
0x80000000|1218, // no-match move
0x80000000|776, // NT-test-match state for single_printable
  }
,
{ // state 845
121,1089, // "*"
136,908, // "/"
  }
,
{ // state 846
0x80000000|1, // match move
0x80000000|47, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 847
94,582, // "e"
  }
,
{ // state 848
2,495, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 849
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+181, // $NT
  }
,
{ // state 850
104,612, // "h"
  }
,
{ // state 851
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 852
0x80000000|299, // match move
0x80000000|655, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 853
89,1180, // "c"
  }
,
{ // state 854
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 855
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 856
2,1151, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 857
92,517, // "s"
  }
,
{ // state 858
102,1062, // "i"
  }
,
{ // state 859
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 860
0x80000000|1542, // match move
0x80000000|758, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 861
0x80000000|58, // match move
0x80000000|336, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 862
183,MIN_REDUCTION+336, // $NT
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 863
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 864
2,539, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+190, // $NT
  }
,
{ // state 865
183,MIN_REDUCTION+230, // $NT
  }
,
{ // state 866
2,367, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+156, // $NT
  }
,
{ // state 867
2,1065, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 868
2,360, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+376, // (default reduction)
  }
,
{ // state 869
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 870
116,970, // "="
  }
,
{ // state 871
0x80000000|345, // match move
0x80000000|1250, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 872
99,995, // "t"
  }
,
{ // state 873
0x80000000|1143, // match move
0x80000000|56, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 874
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 875
0x80000000|1078, // match move
0x80000000|947, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 876
112,664, // "g"
  }
,
{ // state 877
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 878
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 879
2,696, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 880
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 881
4,988, // token
MIN_REDUCTION+374, // (default reduction)
  }
,
{ // state 882
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 883
2,1521, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 884
97,1338, // "n"
  }
,
{ // state 885
0x80000000|295, // match move
0x80000000|535, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 886
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 887
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 888
89,1441, // "c"
90,1441, // "l"
91,1441, // "a"
92,1441, // "s"
94,1441, // "e"
95,1441, // "b"
96,1441, // "o"
97,1441, // "n"
98,1441, // "x"
99,1441, // "t"
100,1441, // "d"
101,1441, // "v"
102,1441, // "i"
103,1441, // "w"
104,1441, // "h"
105,1441, // "f"
106,1441, // "r"
107,1441, // "k"
108,1441, // "u"
109,1441, // "p"
110,1441, // "y"
111,1441, // "m"
112,1441, // "g"
113,1441, // "z"
115,1441, // "!"
116,1441, // "="
117,1441, // "<"
118,1441, // ">"
119,1441, // "+"
120,1441, // "-"
121,1441, // "*"
122,1441, // "%"
123,1441, // "&"
124,1441, // "("
125,1441, // ")"
126,1441, // "{"
127,1441, // "}"
128,1441, // "["
129,1441, // "]"
130,1441, // "|"
131,1441, // "."
132,1441, // ","
133,1441, // ":"
134,1441, // ";"
136,1441, // "/"
141,452, // character_printable
142,1441, // {"A".."Z" "j" "q"}
143,1441, // " "
144,1441, // "_"
145,1441, // {"#".."$" "?".."@" "^" "`" "~"}
146,1441, // {"0".."9"}
147,1441, // "'"
148,1441, // '"'
149,393, // back_back
150,32, // back_dquote
151,1415, // back_squote
152,493, // back_n
153,44, // back_tab
154,246, // back_form
155,1555, // back_return
156,742, // "\"
158,41, // stringChar
160,410, // $$1
  }
,
{ // state 889
95,768, // "b"
  }
,
{ // state 890
99,1161, // "t"
  }
,
{ // state 891
0x80000000|1, // match move
0x80000000|225, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 892
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 893
0x80000000|604, // match move
0x80000000|1493, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 894
MIN_REDUCTION+362, // (default reduction)
  }
,
{ // state 895
2,923, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 896
102,1498, // "i"
106,1139, // "r"
  }
,
{ // state 897
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+149, // $NT
  }
,
{ // state 898
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 899
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 900
0x80000000|1, // match move
0x80000000|934, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 901
91,415, // "a"
  }
,
{ // state 902
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+157, // $NT
  }
,
{ // state 903
0x80000000|773, // match move
0x80000000|1520, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 904
0x80000000|1, // match move
0x80000000|806, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 905
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 906
102,1169, // "i"
  }
,
{ // state 907
90,1354, // "l"
  }
,
{ // state 908
0x80000000|85, // match move
0x80000000|529, // no-match move
0x80000000|776, // NT-test-match state for single_printable
  }
,
{ // state 909
108,1103, // "u"
  }
,
{ // state 910
99,1073, // "t"
  }
,
{ // state 911
2,1328, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 912
0x80000000|1307, // match move
0x80000000|206, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 913
2,298, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 914
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 915
94,717, // "e"
  }
,
{ // state 916
2,831, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 917
121,1034, // "*"
  }
,
{ // state 918
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 919
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 920
0x80000000|1377, // match move
0x80000000|78, // no-match move
0x80000000|96, // NT-test-match state for comment_stuff
  }
,
{ // state 921
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 922
0x80000000|695, // match move
0x80000000|647, // no-match move
0x80000000|73, // NT-test-match state for digit
  }
,
{ // state 923
0x80000000|887, // match move
0x80000000|1393, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 924
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 925
0x80000000|782, // match move
0x80000000|1209, // no-match move
0x80000000|776, // NT-test-match state for single_printable
  }
,
{ // state 926
2,1480, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 927
97,269, // "n"
  }
,
{ // state 928
2,294, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 929
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 930
92,1208, // "s"
  }
,
{ // state 931
2,418, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 932
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+173, // $NT
  }
,
{ // state 933
91,234, // "a"
  }
,
{ // state 934
0x80000000|883, // match move
0x80000000|1248, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 935
94,69, // "e"
  }
,
{ // state 936
91,1216, // "a"
  }
,
{ // state 937
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 938
0x80000000|1, // match move
0x80000000|957, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 939
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+109, // $NT
  }
,
{ // state 940
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 941
99,1388, // "t"
103,1473, // "w"
104,801, // "h"
108,54, // "u"
110,1291, // "y"
  }
,
{ // state 942
94,1189, // "e"
  }
,
{ // state 943
2,18, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 944
0x80000000|1154, // match move
0x80000000|407, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 945
94,518, // "e"
  }
,
{ // state 946
0x80000000|1, // match move
0x80000000|785, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 947
2,1331, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 948
183,MIN_REDUCTION+225, // $NT
  }
,
{ // state 949
136,67, // "/"
  }
,
{ // state 950
2,1260, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 951
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 952
0x80000000|931, // match move
0x80000000|1558, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 953
91,1131, // "a"
  }
,
{ // state 954
183,MIN_REDUCTION+226, // $NT
  }
,
{ // state 955
0x80000000|779, // match move
0x80000000|1518, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 956
102,1431, // "i"
  }
,
{ // state 957
0x80000000|271, // match move
0x80000000|1043, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 958
2,288, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 959
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+185, // $NT
  }
,
{ // state 960
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 961
2,235, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+178, // $NT
  }
,
{ // state 962
2,831, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 963
183,MIN_REDUCTION+227, // $NT
  }
,
{ // state 964
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 965
183,MIN_REDUCTION+340, // $NT
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 966
MIN_REDUCTION+354, // (default reduction)
  }
,
{ // state 967
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+103, // $NT
  }
,
{ // state 968
2,495, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 969
0x80000000|411, // match move
0x80000000|1508, // no-match move
0x80000000|776, // NT-test-match state for single_printable
  }
,
{ // state 970
0x80000000|153, // match move
0x80000000|1380, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 971
183,MIN_REDUCTION+216, // $NT
  }
,
{ // state 972
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+375, // (default reduction)
  }
,
{ // state 973
2,1260, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 974
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 975
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 976
0x80000000|1082, // match move
0x80000000|701, // no-match move
0x80000000|96, // NT-test-match state for comment_stuff
  }
,
{ // state 977
MIN_REDUCTION+352, // (default reduction)
  }
,
{ // state 978
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+151, // $NT
  }
,
{ // state 979
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+183, // $NT
  }
,
{ // state 980
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+117, // $NT
  }
,
{ // state 981
0x80000000|1269, // match move
0x80000000|632, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 982
96,332, // "o"
106,643, // "r"
110,1406, // "y"
  }
,
{ // state 983
0x80000000|258, // match move
0x80000000|1475, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 984
0x80000000|27, // match move
0x80000000|1068, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 985
94,743, // "e"
  }
,
{ // state 986
99,1341, // "t"
  }
,
{ // state 987
97,808, // "n"
  }
,
{ // state 988
MIN_REDUCTION+356, // (default reduction)
  }
,
{ // state 989
0x80000000|1, // match move
0x80000000|342, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 990
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 991
MIN_REDUCTION+359, // (default reduction)
  }
,
{ // state 992
2,266, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+106, // $NT
  }
,
{ // state 993
0x80000000|1483, // match move
0x80000000|460, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 994
183,MIN_REDUCTION+368, // $NT
  }
,
{ // state 995
89,409, // "c"
  }
,
{ // state 996
90,804, // "l"
  }
,
{ // state 997
92,483, // "s"
  }
,
{ // state 998
2,761, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+100, // $NT
  }
,
{ // state 999
2,553, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+128, // $NT
  }
,
{ // state 1000
0x80000000|1, // match move
0x80000000|227, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 1001
100,820, // "d"
  }
,
{ // state 1002
0x80000000|848, // match move
0x80000000|968, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1003
2,671, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 1004
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 1005
101,658, // "v"
  }
,
{ // state 1006
99,1245, // "t"
  }
,
{ // state 1007
107,1298, // "k"
  }
,
{ // state 1008
89,176, // "c"
  }
,
{ // state 1009
0x80000000|293, // match move
0x80000000|166, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1010
2,1513, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 1011
2,578, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 1012
0x80000000|85, // match move
0x80000000|364, // no-match move
0x80000000|776, // NT-test-match state for single_printable
  }
,
{ // state 1013
0x80000000|609, // match move
0x80000000|438, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 1014
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 1015
2,685, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 1016
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+123, // $NT
  }
,
{ // state 1017
0x80000000|851, // match move
0x80000000|375, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1018
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 1019
0x80000000|1369, // match move
0x80000000|1207, // no-match move
0x80000000|96, // NT-test-match state for comment_stuff
  }
,
{ // state 1020
94,805, // "e"
  }
,
{ // state 1021
92,330, // "s"
  }
,
{ // state 1022
2,696, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 1023
99,570, // "t"
  }
,
{ // state 1024
0x80000000|935, // match move
0x80000000|468, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 1025
MIN_REDUCTION+355, // (default reduction)
  }
,
{ // state 1026
MIN_REDUCTION+368, // (default reduction)
  }
,
{ // state 1027
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+147, // $NT
  }
,
{ // state 1028
103,852, // "w"
  }
,
{ // state 1029
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 1030
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 1031
0x80000000|1, // match move
0x80000000|275, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 1032
90,1108, // "l"
97,1405, // "n"
98,1126, // "x"
  }
,
{ // state 1033
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 1034
183,MIN_REDUCTION+344, // $NT
  }
,
{ // state 1035
183,MIN_REDUCTION+222, // $NT
  }
,
{ // state 1036
99,847, // "t"
  }
,
{ // state 1037
MIN_REDUCTION+355, // (default reduction)
  }
,
{ // state 1038
183,MIN_REDUCTION+365, // $NT
MIN_REDUCTION+365, // (default reduction)
  }
,
{ // state 1039
92,1297, // "s"
  }
,
{ // state 1040
94,1402, // "e"
  }
,
{ // state 1041
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1042
2,1151, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 1043
2,459, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 1044
89,850, // "c"
  }
,
{ // state 1045
119,1312, // "+"
  }
,
{ // state 1046
99,1194, // "t"
  }
,
{ // state 1047
2,1099, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+160, // $NT
  }
,
{ // state 1048
183,MIN_REDUCTION+208, // $NT
  }
,
{ // state 1049
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 1050
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 1051
99,828, // "t"
  }
,
{ // state 1052
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 1053
106,783, // "r"
  }
,
{ // state 1054
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 1055
2,1353, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 1056
0x80000000|1, // match move
0x80000000|442, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 1057
0x80000000|580, // match move
0x80000000|888, // no-match move
0x80000000|1206, // NT-test-match state for dq
  }
,
{ // state 1058
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+133, // $NT
  }
,
{ // state 1059
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+375, // (default reduction)
  }
,
{ // state 1060
90,722, // "l"
91,814, // "a"
96,239, // "o"
104,699, // "h"
  }
,
{ // state 1061
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 1062
101,1323, // "v"
  }
,
{ // state 1063
96,1046, // "o"
  }
,
{ // state 1064
0x80000000|99, // match move
0x80000000|280, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1065
0x80000000|43, // match move
0x80000000|670, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1066
183,MIN_REDUCTION+198, // $NT
  }
,
{ // state 1067
104,515, // "h"
  }
,
{ // state 1068
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 1069
90,1399, // "l"
91,1455, // "a"
96,1149, // "o"
102,757, // "i"
  }
,
{ // state 1070
0x80000000|1, // match move
0x80000000|359, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 1071
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 1072
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 1073
0x80000000|1, // match move
0x80000000|65, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 1074
0x80000000|588, // match move
0x80000000|481, // no-match move
0x80000000|96, // NT-test-match state for comment_stuff
  }
,
{ // state 1075
2,164, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 1076
105,1296, // "f"
  }
,
{ // state 1077
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 1078
2,1331, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 1079
0x80000000|579, // match move
0x80000000|877, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1080
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 1081
0x80000000|719, // match move
0x80000000|108, // no-match move
0x80000000|776, // NT-test-match state for single_printable
  }
,
{ // state 1082
MIN_REDUCTION+353, // (default reduction)
  }
,
{ // state 1083
183,MIN_REDUCTION+351, // $NT
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 1084
94,1411, // "e"
  }
,
{ // state 1085
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+165, // $NT
  }
,
{ // state 1086
100,81, // "d"
  }
,
{ // state 1087
2,1079, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 1088
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 1089
0x80000000|1510, // match move
0x80000000|1574, // no-match move
0x80000000|96, // NT-test-match state for comment_stuff
  }
,
{ // state 1090
0x80000000|913, // match move
0x80000000|1474, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1091
0x80000000|201, // match move
0x80000000|1140, // no-match move
0x80000000|96, // NT-test-match state for comment_stuff
  }
,
{ // state 1092
0x80000000|1, // match move
0x80000000|329, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 1093
92,149, // "s"
  }
,
{ // state 1094
136,605, // "/"
  }
,
{ // state 1095
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 1096
0x80000000|1283, // match move
0x80000000|940, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1097
MIN_REDUCTION+371, // (default reduction)
  }
,
{ // state 1098
183,MIN_REDUCTION+219, // $NT
  }
,
{ // state 1099
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+159, // $NT
  }
,
{ // state 1100
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 1101
4,988, // token
5,975, // `boolean
6,1396, // `class
7,1136, // `extends
8,822, // `void
9,700, // `int
10,1332, // `while
11,1114, // `if
12,1500, // `else
13,111, // `for
14,678, // `break
15,1363, // `this
16,818, // `false
17,937, // `true
18,1220, // `super
19,918, // `null
20,1424, // `return
21,267, // `instanceof
22,601, // `new
23,314, // `abstract
24,878, // `assert
25,855, // `byte
26,1286, // `case
27,516, // `catch
28,1300, // `char
29,899, // `const
30,1072, // `continue
31,569, // `default
32,599, // `do
33,594, // `double
34,1452, // `enum
35,1157, // `final
36,637, // `finally
37,1540, // `float
38,964, // `goto
39,816, // `implements
40,786, // `import
41,1263, // `interface
42,316, // `long
43,1241, // `native
44,169, // `package
45,114, // `private
46,1436, // `protected
47,1095, // `public
48,50, // `short
49,158, // `static
50,1077, // `strictfp
51,1252, // `switch
52,1167, // `synchronized
53,1563, // `throw
54,1398, // `throws
55,144, // `transient
56,1029, // `try
57,552, // `volatile
89,1060, // "c"
90,1514, // "l"
91,135, // "a"
92,195, // "s"
94,253, // "e"
95,982, // "b"
97,1568, // "n"
99,1375, // "t"
100,142, // "d"
101,184, // "v"
102,1305, // "i"
103,1165, // "w"
105,1069, // "f"
106,536, // "r"
109,1104, // "p"
112,1456, // "g"
MIN_REDUCTION+374, // (default reduction)
  }
,
{ // state 1102
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+179, // $NT
  }
,
{ // state 1103
95,562, // "b"
  }
,
{ // state 1104
91,31, // "a"
106,704, // "r"
108,584, // "u"
  }
,
{ // state 1105
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 1106
89,289, // "c"
90,289, // "l"
91,289, // "a"
92,289, // "s"
94,289, // "e"
95,289, // "b"
96,289, // "o"
97,289, // "n"
98,289, // "x"
99,289, // "t"
100,289, // "d"
101,289, // "v"
102,289, // "i"
103,289, // "w"
104,289, // "h"
105,289, // "f"
106,289, // "r"
107,289, // "k"
108,289, // "u"
109,289, // "p"
110,289, // "y"
111,289, // "m"
112,289, // "g"
113,289, // "z"
115,289, // "!"
116,289, // "="
117,289, // "<"
118,289, // ">"
119,289, // "+"
120,289, // "-"
121,289, // "*"
122,289, // "%"
123,289, // "&"
124,289, // "("
125,289, // ")"
126,289, // "{"
127,289, // "}"
128,289, // "["
129,289, // "]"
130,289, // "|"
131,289, // "."
132,289, // ","
133,289, // ":"
134,289, // ";"
136,289, // "/"
141,6, // character_printable
142,289, // {"A".."Z" "j" "q"}
143,289, // " "
144,289, // "_"
145,289, // {"#".."$" "?".."@" "^" "`" "~"}
146,289, // {"0".."9"}
147,289, // "'"
148,289, // '"'
149,34, // back_back
150,216, // back_dquote
151,1110, // back_squote
152,837, // back_n
153,1373, // back_tab
154,141, // back_form
155,390, // back_return
156,1173, // "\"
  }
,
{ // state 1107
0x80000000|574, // match move
0x80000000|1464, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1108
92,942, // "s"
  }
,
{ // state 1109
121,86, // "*"
  }
,
{ // state 1110
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 1111
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 1112
94,1432, // "e"
  }
,
{ // state 1113
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 1114
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 1115
0x80000000|1525, // match move
0x80000000|693, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1116
91,825, // "a"
108,1040, // "u"
110,1237, // "y"
  }
,
{ // state 1117
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+119, // $NT
  }
,
{ // state 1118
MIN_REDUCTION+373, // (default reduction)
  }
,
{ // state 1119
0x80000000|1138, // match move
0x80000000|1397, // no-match move
0x80000000|776, // NT-test-match state for single_printable
  }
,
{ // state 1120
183,MIN_REDUCTION+199, // $NT
  }
,
{ // state 1121
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 1122
0x80000000|1, // match move
0x80000000|1130, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 1123
183,MIN_REDUCTION+196, // $NT
  }
,
{ // state 1124
146,300, // {"0".."9"}
162,1223, // digit
  }
,
{ // state 1125
89,565, // "c"
90,565, // "l"
91,565, // "a"
92,565, // "s"
94,565, // "e"
95,565, // "b"
96,565, // "o"
97,565, // "n"
98,565, // "x"
99,565, // "t"
100,565, // "d"
101,565, // "v"
102,565, // "i"
103,565, // "w"
104,565, // "h"
105,565, // "f"
106,565, // "r"
107,565, // "k"
108,565, // "u"
109,565, // "p"
110,565, // "y"
111,565, // "m"
112,565, // "g"
113,565, // "z"
115,565, // "!"
116,565, // "="
117,565, // "<"
118,565, // ">"
119,565, // "+"
120,565, // "-"
121,565, // "*"
122,565, // "%"
123,565, // "&"
124,565, // "("
125,565, // ")"
126,565, // "{"
127,565, // "}"
128,565, // "["
129,565, // "]"
130,565, // "|"
131,565, // "."
132,565, // ","
133,565, // ":"
134,565, // ";"
136,565, // "/"
142,565, // {"A".."Z" "j" "q"}
143,565, // " "
144,565, // "_"
145,565, // {"#".."$" "?".."@" "^" "`" "~"}
146,565, // {"0".."9"}
147,565, // "'"
148,565, // '"'
156,565, // "\"
164,565, // {9 12}
167,557, // single_printable
  }
,
{ // state 1126
99,1266, // "t"
  }
,
{ // state 1127
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 1128
91,812, // "a"
  }
,
{ // state 1129
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+163, // $NT
  }
,
{ // state 1130
0x80000000|1566, // match move
0x80000000|926, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1131
97,1178, // "n"
  }
,
{ // state 1132
0x80000000|1, // match move
0x80000000|1090, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 1133
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 1134
106,2, // "r"
  }
,
{ // state 1135
MIN_REDUCTION+358, // (default reduction)
  }
,
{ // state 1136
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 1137
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 1138
MIN_REDUCTION+369, // (default reduction)
  }
,
{ // state 1139
96,547, // "o"
  }
,
{ // state 1140
MIN_REDUCTION+344, // (default reduction)
  }
,
{ // state 1141
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 1142
2,288, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 1143
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 1144
89,915, // "c"
  }
,
{ // state 1145
91,876, // "a"
  }
,
{ // state 1146
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 1147
94,79, // "e"
  }
,
{ // state 1148
105,1445, // "f"
  }
,
{ // state 1149
106,1378, // "r"
  }
,
{ // state 1150
2,1102, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+180, // $NT
  }
,
{ // state 1151
0x80000000|1049, // match move
0x80000000|160, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1152
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 1153
0x80000000|1, // match move
0x80000000|1064, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 1154
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 1155
0x80000000|400, // match move
0x80000000|106, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1156
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+111, // $NT
  }
,
{ // state 1157
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 1158
0x80000000|402, // match move
0x80000000|130, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1159
MIN_REDUCTION+354, // (default reduction)
  }
,
{ // state 1160
92,600, // "s"
  }
,
{ // state 1161
91,207, // "a"
  }
,
{ // state 1162
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 1163
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 1164
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 1165
104,661, // "h"
  }
,
{ // state 1166
103,193, // "w"
  }
,
{ // state 1167
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 1168
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 1169
89,538, // "c"
  }
,
{ // state 1170
0x80000000|1551, // match move
0x80000000|306, // no-match move
// T-test match for "-":
120,
  }
,
{ // state 1171
2,1158, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 1172
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 1173
97,1365, // "n"
99,990, // "t"
105,1224, // "f"
106,1268, // "r"
147,1146, // "'"
148,1030, // '"'
156,30, // "\"
  }
,
{ // state 1174
99,90, // "t"
  }
,
{ // state 1175
0x80000000|262, // match move
0x80000000|1507, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1176
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 1177
97,75, // "n"
  }
,
{ // state 1178
0x80000000|1, // match move
0x80000000|433, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 1179
99,945, // "t"
  }
,
{ // state 1180
99,313, // "t"
  }
,
{ // state 1181
92,1000, // "s"
  }
,
{ // state 1182
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 1183
2,1190, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 1184
94,1132, // "e"
  }
,
{ // state 1185
121,1454, // "*"
  }
,
{ // state 1186
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 1187
2,939, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+110, // $NT
  }
,
{ // state 1188
94,1031, // "e"
  }
,
{ // state 1189
0x80000000|1, // match move
0x80000000|440, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 1190
0x80000000|45, // match move
0x80000000|1163, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1191
0x80000000|1, // match move
0x80000000|1316, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 1192
92,426, // "s"
99,1044, // "t"
  }
,
{ // state 1193
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 1194
96,87, // "o"
  }
,
{ // state 1195
89,1355, // "c"
90,1355, // "l"
91,1355, // "a"
92,1355, // "s"
93,1482, // idChar
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
138,422, // letter
142,1355, // {"A".."Z" "j" "q"}
144,244, // "_"
146,399, // {"0".."9"}
162,264, // digit
  }
,
{ // state 1196
107,627, // "k"
  }
,
{ // state 1197
5,66, // `boolean
6,128, // `class
7,1066, // `extends
8,1120, // `void
9,703, // `int
10,626, // `while
11,642, // `if
12,1123, // `else
13,61, // `for
14,36, // `break
15,26, // `this
16,665, // `false
17,475, // `true
18,1048, // `super
19,480, // `null
20,543, // `return
21,603, // `instanceof
22,1557, // `new
23,1270, // `abstract
24,453, // `assert
25,679, // `byte
26,971, // `case
27,1549, // `catch
28,709, // `char
29,1098, // `const
30,102, // `continue
31,482, // `default
32,1035, // `do
33,123, // `double
34,1342, // `enum
35,948, // `final
36,954, // `finally
37,963, // `float
38,755, // `goto
39,417, // `implements
40,865, // `import
41,1366, // `interface
42,521, // `long
43,42, // `native
44,354, // `package
45,163, // `private
46,1401, // `protected
47,76, // `public
48,398, // `short
49,15, // `static
50,1264, // `strictfp
51,353, // `switch
52,657, // `synchronized
53,566, // `throw
54,749, // `throws
55,259, // `transient
56,667, // `try
57,286, // `volatile
89,1213, // "c"
90,478, // "l"
91,92, // "a"
92,941, // "s"
94,1032, // "e"
95,1299, // "b"
97,1410, // "n"
99,1491, // "t"
100,82, // "d"
101,1481, // "v"
102,763, // "i"
103,1067, // "w"
105,747, // "f"
106,762, // "r"
109,416, // "p"
112,1063, // "g"
  }
,
{ // state 1198
2,1115, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 1199
0x80000000|1495, // match move
0x80000000|713, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 1200
0x80000000|1428, // match move
0x80000000|1282, // no-match move
0x80000000|96, // NT-test-match state for comment_stuff
  }
,
{ // state 1201
0x80000000|881, // match move
0x80000000|1439, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1202
89,800, // "c"
  }
,
{ // state 1203
0x80000000|841, // match move
0x80000000|140, // no-match move
0x80000000|96, // NT-test-match state for comment_stuff
  }
,
{ // state 1204
0x80000000|1097, // match move
0x80000000|784, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 1205
0x80000000|1125, // match move
0x80000000|1038, // no-match move
0x80000000|776, // NT-test-match state for single_printable
  }
,
{ // state 1206
148,1444, // '"'
  }
,
{ // state 1207
MIN_REDUCTION+372, // (default reduction)
  }
,
{ // state 1208
0x80000000|1, // match move
0x80000000|263, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 1209
183,MIN_REDUCTION+365, // $NT
  }
,
{ // state 1210
91,996, // "a"
  }
,
{ // state 1211
92,946, // "s"
  }
,
{ // state 1212
106,1344, // "r"
  }
,
{ // state 1213
90,690, // "l"
91,1192, // "a"
96,884, // "o"
104,633, // "h"
  }
,
{ // state 1214
106,1517, // "r"
  }
,
{ // state 1215
1,437, // start
2,1446, // white*
3,1137, // $$0
4,1222, // token
5,975, // `boolean
6,1396, // `class
7,1136, // `extends
8,822, // `void
9,700, // `int
10,1332, // `while
11,1114, // `if
12,1500, // `else
13,111, // `for
14,678, // `break
15,1363, // `this
16,818, // `false
17,937, // `true
18,1220, // `super
19,918, // `null
20,1424, // `return
21,267, // `instanceof
22,601, // `new
23,314, // `abstract
24,878, // `assert
25,855, // `byte
26,1286, // `case
27,516, // `catch
28,1300, // `char
29,899, // `const
30,1072, // `continue
31,569, // `default
32,599, // `do
33,594, // `double
34,1452, // `enum
35,1157, // `final
36,637, // `finally
37,1540, // `float
38,964, // `goto
39,816, // `implements
40,786, // `import
41,1263, // `interface
42,316, // `long
43,1241, // `native
44,169, // `package
45,114, // `private
46,1436, // `protected
47,1095, // `public
48,50, // `short
49,158, // `static
50,1077, // `strictfp
51,1252, // `switch
52,1167, // `synchronized
53,1563, // `throw
54,1398, // `throws
55,144, // `transient
56,1029, // `try
57,552, // `volatile
89,1060, // "c"
90,1514, // "l"
91,135, // "a"
92,195, // "s"
94,253, // "e"
95,982, // "b"
97,1568, // "n"
99,1375, // "t"
100,142, // "d"
101,184, // "v"
102,1305, // "i"
103,1165, // "w"
105,1069, // "f"
106,536, // "r"
109,1104, // "p"
112,1456, // "g"
177,1201, // token*
182,MIN_REDUCTION+1, // $
  }
,
{ // state 1216
99,17, // "t"
  }
,
{ // state 1217
0x80000000|1055, // match move
0x80000000|688, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1218
MIN_REDUCTION+369, // (default reduction)
  }
,
{ // state 1219
89,1051, // "c"
  }
,
{ // state 1220
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 1221
2,1079, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 1222
MIN_REDUCTION+357, // (default reduction)
  }
,
{ // state 1223
0x80000000|546, // match move
0x80000000|474, // no-match move
0x80000000|73, // NT-test-match state for digit
  }
,
{ // state 1224
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 1225
108,1476, // "u"
  }
,
{ // state 1226
89,680, // "c"
90,680, // "l"
91,680, // "a"
92,680, // "s"
94,680, // "e"
95,680, // "b"
96,680, // "o"
97,680, // "n"
98,680, // "x"
99,680, // "t"
100,680, // "d"
101,680, // "v"
102,680, // "i"
103,680, // "w"
104,680, // "h"
105,680, // "f"
106,680, // "r"
107,680, // "k"
108,680, // "u"
109,680, // "p"
110,680, // "y"
111,680, // "m"
112,680, // "g"
113,680, // "z"
115,680, // "!"
116,680, // "="
117,680, // "<"
118,680, // ">"
119,680, // "+"
120,680, // "-"
121,413, // "*"
122,680, // "%"
123,680, // "&"
124,680, // "("
125,680, // ")"
126,680, // "{"
127,680, // "}"
128,680, // "["
129,680, // "]"
130,680, // "|"
131,680, // "."
132,680, // ","
133,680, // ":"
134,680, // ";"
136,871, // "/"
142,680, // {"A".."Z" "j" "q"}
143,680, // " "
144,680, // "_"
145,680, // {"#".."$" "?".."@" "^" "`" "~"}
146,680, // {"0".."9"}
147,680, // "'"
148,680, // '"'
156,680, // "\"
165,1319, // eol
169,1203, // star
170,273, // slash
171,1074, // slash_star
172,1545, // comment_printable
173,1019, // comment_stuff
175,976, // {10}
176,753, // {13}
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
0x80000000|874, // match move
0x80000000|577, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1228
MIN_REDUCTION+363, // (default reduction)
  }
,
{ // state 1229
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+131, // $NT
  }
,
{ // state 1230
0x80000000|1265, // match move
0x80000000|16, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1231
94,1001, // "e"
  }
,
{ // state 1232
89,1457, // "c"
90,1457, // "l"
91,1457, // "a"
92,1457, // "s"
94,1457, // "e"
95,1457, // "b"
96,1457, // "o"
97,1457, // "n"
98,1457, // "x"
99,1457, // "t"
100,1457, // "d"
101,1457, // "v"
102,1457, // "i"
103,1457, // "w"
104,1457, // "h"
105,1457, // "f"
106,1457, // "r"
107,1457, // "k"
108,1457, // "u"
109,1457, // "p"
110,1457, // "y"
111,1457, // "m"
112,1457, // "g"
113,1457, // "z"
115,1457, // "!"
116,1457, // "="
117,1457, // "<"
118,1457, // ">"
119,1457, // "+"
120,1457, // "-"
121,1457, // "*"
122,1457, // "%"
123,1457, // "&"
124,1457, // "("
125,1457, // ")"
126,1457, // "{"
127,1457, // "}"
128,1457, // "["
129,1457, // "]"
130,1457, // "|"
131,1457, // "."
132,1457, // ","
133,1457, // ":"
134,1457, // ";"
136,1457, // "/"
142,1457, // {"A".."Z" "j" "q"}
143,1457, // " "
144,1457, // "_"
145,1457, // {"#".."$" "?".."@" "^" "`" "~"}
146,1457, // {"0".."9"}
147,1457, // "'"
148,1457, // '"'
156,1457, // "\"
164,1457, // {9 12}
167,844, // single_printable
168,74, // single_printable**
181,624, // single_printable*
  }
,
{ // state 1233
106,796, // "r"
  }
,
{ // state 1234
0x80000000|602, // match move
0x80000000|38, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1235
2,150, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+188, // $NT
  }
,
{ // state 1236
0x80000000|817, // match move
0x80000000|1249, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1237
0x80000000|1, // match move
0x80000000|467, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 1238
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 1239
0x80000000|105, // match move
0x80000000|974, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1240
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 1241
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 1242
0x80000000|1509, // match move
0x80000000|1159, // no-match move
0x80000000|96, // NT-test-match state for comment_stuff
  }
,
{ // state 1243
MIN_REDUCTION+364, // (default reduction)
  }
,
{ // state 1244
89,565, // "c"
90,565, // "l"
91,565, // "a"
92,565, // "s"
94,565, // "e"
95,565, // "b"
96,565, // "o"
97,565, // "n"
98,565, // "x"
99,565, // "t"
100,565, // "d"
101,565, // "v"
102,565, // "i"
103,565, // "w"
104,565, // "h"
105,565, // "f"
106,565, // "r"
107,565, // "k"
108,565, // "u"
109,565, // "p"
110,565, // "y"
111,565, // "m"
112,565, // "g"
113,565, // "z"
115,565, // "!"
116,565, // "="
117,565, // "<"
118,565, // ">"
119,565, // "+"
120,565, // "-"
121,565, // "*"
122,565, // "%"
123,565, // "&"
124,565, // "("
125,565, // ")"
126,565, // "{"
127,565, // "}"
128,565, // "["
129,565, // "]"
130,565, // "|"
131,565, // "."
132,565, // ","
133,565, // ":"
134,565, // ";"
136,565, // "/"
142,565, // {"A".."Z" "j" "q"}
143,565, // " "
144,565, // "_"
145,565, // {"#".."$" "?".."@" "^" "`" "~"}
146,565, // {"0".."9"}
147,565, // "'"
148,565, // '"'
156,565, // "\"
164,565, // {9 12}
167,1279, // single_printable
168,965, // single_printable**
181,1205, // single_printable*
  }
,
{ // state 1245
102,1489, // "i"
  }
,
{ // state 1246
92,528, // "s"
99,956, // "t"
  }
,
{ // state 1247
105,159, // "f"
  }
,
{ // state 1248
2,1521, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 1249
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 1250
MIN_REDUCTION+343, // (default reduction)
  }
,
{ // state 1251
2,265, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 1252
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 1253
0x80000000|1026, // match move
0x80000000|994, // no-match move
0x80000000|776, // NT-test-match state for single_printable
  }
,
{ // state 1254
99,1550, // "t"
  }
,
{ // state 1255
0x80000000|385, // match move
0x80000000|998, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 1256
99,1293, // "t"
  }
,
{ // state 1257
0x80000000|1142, // match move
0x80000000|958, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1258
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 1259
2,955, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 1260
0x80000000|1381, // match move
0x80000000|564, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1261
0x80000000|1, // match move
0x80000000|476, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 1262
107,933, // "k"
  }
,
{ // state 1263
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 1264
183,MIN_REDUCTION+240, // $NT
  }
,
{ // state 1265
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 1266
94,83, // "e"
  }
,
{ // state 1267
96,1128, // "o"
  }
,
{ // state 1268
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 1269
2,1155, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 1270
183,MIN_REDUCTION+213, // $NT
  }
,
{ // state 1271
91,1144, // "a"
  }
,
{ // state 1272
0x80000000|1, // match move
0x80000000|1234, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 1273
2,1386, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 1274
0x80000000|770, // match move
0x80000000|68, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1275
0x80000000|1232, // match move
0x80000000|243, // no-match move
0x80000000|776, // NT-test-match state for single_printable
  }
,
{ // state 1276
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 1277
0x80000000|1025, // match move
0x80000000|1037, // no-match move
0x80000000|96, // NT-test-match state for comment_stuff
  }
,
{ // state 1278
2,355, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 1279
0x80000000|1138, // match move
0x80000000|231, // no-match move
0x80000000|776, // NT-test-match state for single_printable
  }
,
{ // state 1280
139,MIN_REDUCTION+333, // idChar**
144,MIN_REDUCTION+333, // "_"
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 1281
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 1282
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 1283
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 1284
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 1285
2,319, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 1286
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 1287
2,1085, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+166, // $NT
  }
,
{ // state 1288
123,983, // "&"
  }
,
{ // state 1289
2,1463, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 1290
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 1291
97,1471, // "n"
  }
,
{ // state 1292
96,1076, // "o"
  }
,
{ // state 1293
0x80000000|1, // match move
0x80000000|432, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 1294
0x80000000|1281, // match move
0x80000000|586, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1295
102,13, // "i"
  }
,
{ // state 1296
0x80000000|1, // match move
0x80000000|512, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 1297
102,1534, // "i"
  }
,
{ // state 1298
0x80000000|1, // match move
0x80000000|532, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 1299
96,255, // "o"
106,716, // "r"
110,1036, // "y"
  }
,
{ // state 1300
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 1301
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 1302
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+101, // $NT
  }
,
{ // state 1303
0x80000000|1221, // match move
0x80000000|1087, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1304
97,795, // "n"
  }
,
{ // state 1305
97,561, // "n"
105,1443, // "f"
111,723, // "m"
  }
,
{ // state 1306
0x80000000|341, // match move
0x80000000|283, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1307
2,444, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 1308
183,MIN_REDUCTION+347, // $NT
  }
,
{ // state 1309
91,1225, // "a"
  }
,
{ // state 1310
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+125, // $NT
  }
,
{ // state 1311
2,5, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 1312
0x80000000|1395, // match move
0x80000000|729, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1313
91,242, // "a"
  }
,
{ // state 1314
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+95, // $NT
  }
,
{ // state 1315
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+97, // $NT
  }
,
{ // state 1316
0x80000000|1478, // match move
0x80000000|943, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1317
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 1318
0x80000000|1289, // match move
0x80000000|740, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1319
0x80000000|1425, // match move
0x80000000|436, // no-match move
0x80000000|96, // NT-test-match state for comment_stuff
  }
,
{ // state 1320
107,1145, // "k"
  }
,
{ // state 1321
2,967, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+104, // $NT
  }
,
{ // state 1322
97,1153, // "n"
  }
,
{ // state 1323
94,401, // "e"
  }
,
{ // state 1324
0x80000000|247, // match move
0x80000000|1014, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1325
102,278, // "i"
106,623, // "r"
  }
,
{ // state 1326
2,1294, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 1327
0x80000000|1, // match move
0x80000000|392, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 1328
0x80000000|1176, // match move
0x80000000|1111, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1329
0x80000000|791, // match move
0x80000000|614, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1330
99,985, // "t"
  }
,
{ // state 1331
0x80000000|892, // match move
0x80000000|1258, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1332
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 1333
2,403, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 1334
0x80000000|85, // match move
0x80000000|836, // no-match move
0x80000000|776, // NT-test-match state for single_printable
  }
,
{ // state 1335
91,70, // "a"
  }
,
{ // state 1336
2,1306, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 1337
-1, // $$start
437, // start
1446, // white*
1137, // $$0
1222, // token
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
499, // `!
649, // `!=
1407, // `%
383, // `&&
1532, // `*
568, // `(
650, // `)
905, // `{
1412, // `}
72, // `-
161, // `+
1506, // `=
338, // `==
1240, // `[
260, // `]
1033, // `||
414, // `<
423, // `<=
1162, // `,
1164, // `>
1423, // `>=
1121, // `.
1361, // `;
1391, // `++
560, // `--
496, // `/
1511, // `:
492, // ID
1442, // INT_LITERAL
1127, // STRING_LITERAL
929, // CHARACTER_LITERAL
611, // "c"
611, // "l"
611, // "a"
611, // "s"
-1, // idChar
611, // "e"
611, // "b"
611, // "o"
611, // "n"
611, // "x"
611, // "t"
611, // "d"
611, // "v"
611, // "i"
611, // "w"
611, // "h"
611, // "f"
611, // "r"
611, // "k"
611, // "u"
611, // "p"
611, // "y"
611, // "m"
611, // "g"
611, // "z"
-1, // reserved
197, // "!"
24, // "="
229, // "<"
350, // ">"
1548, // "+"
1170, // "-"
1217, // "*"
523, // "%"
1288, // "&"
875, // "("
1329, // ")"
1465, // "{"
1318, // "}"
615, // "["
357, // "]"
146, // "|"
378, // "."
1371, // ","
11, // ":"
320, // ";"
-1, // comment
21, // "/"
1477, // identifier
19, // letter
-1, // idChar**
127, // digit++
-1, // character_printable
611, // {"A".."Z" "j" "q"}
1113, // " "
-1, // "_"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
300, // {"0".."9"}
503, // "'"
797, // '"'
-1, // back_back
-1, // back_dquote
-1, // back_squote
-1, // back_n
-1, // back_tab
-1, // back_form
-1, // back_return
-1, // "\"
527, // dq
-1, // stringChar
-1, // stringChar*
-1, // $$1
1106, // sq
922, // digit
1243, // white
1113, // {9 12}
1356, // eol
-1, // ds
-1, // single_printable
-1, // single_printable**
-1, // star
-1, // slash
-1, // slash_star
-1, // comment_printable
-1, // comment_stuff
-1, // comment_stuff**
767, // {10}
505, // {13}
1201, // token*
461, // digit+
-1, // idChar*
-1, // comment_stuff*
-1, // single_printable*
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 1338
92,731, // "s"
99,491, // "t"
  }
,
{ // state 1339
113,1403, // "z"
  }
,
{ // state 1340
175,1383, // {10}
  }
,
{ // state 1341
94,1516, // "e"
  }
,
{ // state 1342
183,MIN_REDUCTION+224, // $NT
  }
,
{ // state 1343
2,171, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 1344
0x80000000|1, // match move
0x80000000|554, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 1345
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 1346
91,1505, // "a"
106,125, // "r"
  }
,
{ // state 1347
90,250, // "l"
96,464, // "o"
  }
,
{ // state 1348
2,813, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 1349
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 1350
0x80000000|210, // match move
0x80000000|880, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1351
103,1070, // "w"
  }
,
{ // state 1352
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+121, // $NT
  }
,
{ // state 1353
0x80000000|487, // match move
0x80000000|1100, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1354
110,651, // "y"
  }
,
{ // state 1355
0x80000000|157, // match move
0x80000000|1168, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 1356
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 1357
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 1358
2,1017, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 1359
175,1242, // {10}
  }
,
{ // state 1360
2,726, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 1361
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 1362
2,980, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+118, // $NT
  }
,
{ // state 1363
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 1364
168,965, // single_printable**
181,1205, // single_printable*
183,MIN_REDUCTION+341, // $NT
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 1365
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 1366
183,MIN_REDUCTION+231, // $NT
  }
,
{ // state 1367
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 1368
0x80000000|220, // match move
0x80000000|84, // no-match move
0x80000000|776, // NT-test-match state for single_printable
  }
,
{ // state 1369
MIN_REDUCTION+372, // (default reduction)
  }
,
{ // state 1370
2,1350, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 1371
0x80000000|113, // match move
0x80000000|750, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1372
0x80000000|1, // match move
0x80000000|183, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 1373
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 1374
0x80000000|917, // match move
0x80000000|607, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1375
104,896, // "h"
106,712, // "r"
  }
,
{ // state 1376
0x80000000|224, // match move
0x80000000|1088, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1377
89,680, // "c"
90,680, // "l"
91,680, // "a"
92,680, // "s"
94,680, // "e"
95,680, // "b"
96,680, // "o"
97,680, // "n"
98,680, // "x"
99,680, // "t"
100,680, // "d"
101,680, // "v"
102,680, // "i"
103,680, // "w"
104,680, // "h"
105,680, // "f"
106,680, // "r"
107,680, // "k"
108,680, // "u"
109,680, // "p"
110,680, // "y"
111,680, // "m"
112,680, // "g"
113,680, // "z"
115,680, // "!"
116,680, // "="
117,680, // "<"
118,680, // ">"
119,680, // "+"
120,680, // "-"
121,413, // "*"
122,680, // "%"
123,680, // "&"
124,680, // "("
125,680, // ")"
126,680, // "{"
127,680, // "}"
128,680, // "["
129,680, // "]"
130,680, // "|"
131,680, // "."
132,680, // ","
133,680, // ":"
134,680, // ";"
136,871, // "/"
142,680, // {"A".."Z" "j" "q"}
143,680, // " "
144,680, // "_"
145,680, // {"#".."$" "?".."@" "^" "`" "~"}
146,680, // {"0".."9"}
147,680, // "'"
148,680, // '"'
156,680, // "\"
165,1319, // eol
169,1203, // star
170,273, // slash
171,1074, // slash_star
172,1545, // comment_printable
173,226, // comment_stuff
174,1519, // comment_stuff**
175,976, // {10}
176,753, // {13}
180,545, // comment_stuff*
  }
,
{ // state 1378
0x80000000|1, // match move
0x80000000|1303, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 1379
2,1400, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+144, // $NT
  }
,
{ // state 1380
2,686, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 1381
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 1382
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+91, // $NT
  }
,
{ // state 1383
MIN_REDUCTION+354, // (default reduction)
  }
,
{ // state 1384
2,1058, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+134, // $NT
  }
,
{ // state 1385
2,1453, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+136, // $NT
  }
,
{ // state 1386
0x80000000|167, // match move
0x80000000|1054, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1387
111,1147, // "m"
  }
,
{ // state 1388
91,531, // "a"
106,829, // "r"
  }
,
{ // state 1389
183,MIN_REDUCTION+348, // $NT
  }
,
{ // state 1390
106,1256, // "r"
  }
,
{ // state 1391
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 1392
0x80000000|1, // match move
0x80000000|1462, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 1393
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 1394
106,1569, // "r"
  }
,
{ // state 1395
2,662, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 1396
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 1397
183,MIN_REDUCTION+369, // $NT
  }
,
{ // state 1398
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 1399
96,1335, // "o"
  }
,
{ // state 1400
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+143, // $NT
  }
,
{ // state 1401
183,MIN_REDUCTION+236, // $NT
  }
,
{ // state 1402
0x80000000|1, // match move
0x80000000|511, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 1403
94,309, // "e"
  }
,
{ // state 1404
0x80000000|1152, // match move
0x80000000|241, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1405
108,3, // "u"
  }
,
{ // state 1406
99,308, // "t"
  }
,
{ // state 1407
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 1408
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 1409
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 1410
91,656, // "a"
94,1351, // "e"
108,435, // "u"
  }
,
{ // state 1411
96,268, // "o"
  }
,
{ // state 1412
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 1413
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 1414
89,301, // "c"
  }
,
{ // state 1415
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 1416
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 1417
0x80000000|669, // match move
0x80000000|89, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1418
0x80000000|1273, // match move
0x80000000|60, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1419
94,1292, // "e"
  }
,
{ // state 1420
MIN_REDUCTION+355, // (default reduction)
  }
,
{ // state 1421
94,311, // "e"
  }
,
{ // state 1422
2,1324, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 1423
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 1424
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 1425
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 1426
2,720, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+168, // $NT
  }
,
{ // state 1427
99,901, // "t"
  }
,
{ // state 1428
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 1429
0x80000000|1284, // match move
0x80000000|212, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1430
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+169, // $NT
  }
,
{ // state 1431
97,328, // "n"
  }
,
{ // state 1432
0x80000000|1, // match move
0x80000000|1448, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 1433
100,1181, // "d"
  }
,
{ // state 1434
105,1271, // "f"
  }
,
{ // state 1435
0x80000000|629, // match move
0x80000000|1560, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1436
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 1437
2,923, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 1438
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+171, // $NT
  }
,
{ // state 1439
0x80000000|1101, // match move
0x80000000|631, // no-match move
0x80000000|1197, // NT-test-match state for reserved
  }
,
{ // state 1440
108,1134, // "u"
  }
,
{ // state 1441
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 1442
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 1443
0x80000000|1, // match move
0x80000000|840, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 1444
183,MIN_REDUCTION+323, // $NT
  }
,
{ // state 1445
91,162, // "a"
  }
,
{ // state 1446
0x80000000|507, // match move
0x80000000|794, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1447
2,984, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 1448
0x80000000|1251, // match move
0x80000000|682, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1449
0x80000000|1026, // match move
0x80000000|1527, // no-match move
0x80000000|776, // NT-test-match state for single_printable
  }
,
{ // state 1450
106,302, // "r"
  }
,
{ // state 1451
0x80000000|1333, // match move
0x80000000|372, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1452
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 1453
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+135, // $NT
  }
,
{ // state 1454
136,1083, // "/"
  }
,
{ // state 1455
90,214, // "l"
  }
,
{ // state 1456
96,325, // "o"
  }
,
{ // state 1457
0x80000000|411, // match move
0x80000000|811, // no-match move
0x80000000|776, // NT-test-match state for single_printable
  }
,
{ // state 1458
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 1459
2,236, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 1460
99,1272, // "t"
  }
,
{ // state 1461
97,1160, // "n"
  }
,
{ // state 1462
0x80000000|4, // match move
0x80000000|238, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1463
0x80000000|312, // match move
0x80000000|362, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1464
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 1465
0x80000000|356, // match move
0x80000000|139, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1466
0x80000000|1, // match move
0x80000000|689, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 1467
0x80000000|233, // match move
0x80000000|284, // no-match move
0x80000000|96, // NT-test-match state for comment_stuff
  }
,
{ // state 1468
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 1469
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 1470
2,174, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 1471
89,173, // "c"
  }
,
{ // state 1472
2,294, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 1473
102,872, // "i"
  }
,
{ // state 1474
2,298, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 1475
2,473, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 1476
90,910, // "l"
  }
,
{ // state 1477
0x80000000|126, // match move
0x80000000|466, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1478
2,18, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 1479
0x80000000|821, // match move
0x80000000|1010, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1480
0x80000000|1573, // match move
0x80000000|424, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1481
96,368, // "o"
  }
,
{ // state 1482
0x80000000|697, // match move
0x80000000|634, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 1483
2,331, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 1484
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 1485
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 1486
101,1313, // "v"
  }
,
{ // state 1487
0x80000000|1, // match move
0x80000000|450, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 1488
148,687, // '"'
157,765, // dq
159,1057, // stringChar*
160,608, // $$1
  }
,
{ // state 1489
90,143, // "l"
  }
,
{ // state 1490
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 1491
104,1325, // "h"
106,1116, // "r"
  }
,
{ // state 1492
2,530, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 1493
2,1107, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 1494
2,598, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 1495
90,103, // "l"
  }
,
{ // state 1496
0x80000000|324, // match move
0x80000000|1133, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1497
0x80000000|1, // match move
0x80000000|1175, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 1498
92,1561, // "s"
  }
,
{ // state 1499
2,1435, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 1500
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 1501
0x80000000|1, // match move
0x80000000|596, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 1502
99,1392, // "t"
  }
,
{ // state 1503
183,MIN_REDUCTION+339, // $NT
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 1504
0x80000000|1, // match move
0x80000000|1418, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 1505
99,1295, // "t"
  }
,
{ // state 1506
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 1507
2,715, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1508
183,MIN_REDUCTION+339, // $NT
  }
,
{ // state 1509
MIN_REDUCTION+354, // (default reduction)
  }
,
{ // state 1510
89,680, // "c"
90,680, // "l"
91,680, // "a"
92,680, // "s"
94,680, // "e"
95,680, // "b"
96,680, // "o"
97,680, // "n"
98,680, // "x"
99,680, // "t"
100,680, // "d"
101,680, // "v"
102,680, // "i"
103,680, // "w"
104,680, // "h"
105,680, // "f"
106,680, // "r"
107,680, // "k"
108,680, // "u"
109,680, // "p"
110,680, // "y"
111,680, // "m"
112,680, // "g"
113,680, // "z"
115,680, // "!"
116,680, // "="
117,680, // "<"
118,680, // ">"
119,680, // "+"
120,680, // "-"
121,413, // "*"
122,680, // "%"
123,680, // "&"
124,680, // "("
125,680, // ")"
126,680, // "{"
127,680, // "}"
128,680, // "["
129,680, // "]"
130,680, // "|"
131,680, // "."
132,680, // ","
133,680, // ":"
134,680, // ";"
136,871, // "/"
142,680, // {"A".."Z" "j" "q"}
143,680, // " "
144,680, // "_"
145,680, // {"#".."$" "?".."@" "^" "`" "~"}
146,680, // {"0".."9"}
147,680, // "'"
148,680, // '"'
156,680, // "\"
165,1319, // eol
169,1203, // star
170,273, // slash
171,1074, // slash_star
172,1545, // comment_printable
173,226, // comment_stuff
174,1185, // comment_stuff**
175,976, // {10}
176,753, // {13}
180,545, // comment_stuff*
  }
,
{ // state 1511
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 1512
2,287, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+130, // $NT
  }
,
{ // state 1513
0x80000000|886, // match move
0x80000000|1182, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1514
96,1177, // "o"
  }
,
{ // state 1515
2,1328, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 1516
89,107, // "c"
  }
,
{ // state 1517
99,904, // "t"
  }
,
{ // state 1518
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 1519
121,949, // "*"
  }
,
{ // state 1520
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 1521
0x80000000|100, // match move
0x80000000|534, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1522
90,261, // "l"
  }
,
{ // state 1523
2,734, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+146, // $NT
  }
,
{ // state 1524
135,745, // comment
136,845, // "/"
143,663, // " "
163,590, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+161, // $NT
  }
,
{ // state 1525
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 1526
183,MIN_REDUCTION+353, // $NT
MIN_REDUCTION+353, // (default reduction)
  }
,
{ // state 1527
MIN_REDUCTION+368, // (default reduction)
  }
,
{ // state 1528
2,1524, // white*
135,745, // comment
136,845, // "/"
143,663, // " "
163,470, // white
164,663, // {9 12}
165,862, // eol
166,756, // ds
175,1526, // {10}
176,281, // {13}
183,MIN_REDUCTION+162, // $NT
  }
,
{ // state 1529
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 1530
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 1531
89,788, // "c"
  }
,
{ // state 1532
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 1533
2,860, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 1534
94,179, // "e"
  }
,
{ // state 1535
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 1536
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 1537
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 1538
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 1539
183,MIN_REDUCTION+330, // $NT
  }
,
{ // state 1540
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 1541
183,MIN_REDUCTION+352, // $NT
  }
,
{ // state 1542
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 1543
183,MIN_REDUCTION+352, // $NT
MIN_REDUCTION+352, // (default reduction)
  }
,
{ // state 1544
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 1545
0x80000000|14, // match move
0x80000000|622, // no-match move
0x80000000|96, // NT-test-match state for comment_stuff
  }
,
{ // state 1546
91,1219, // "a"
  }
,
{ // state 1547
MIN_REDUCTION+365, // (default reduction)
  }
,
{ // state 1548
0x80000000|1045, // match move
0x80000000|981, // no-match move
// T-test match for "+":
119,
  }
,
{ // state 1549
183,MIN_REDUCTION+217, // $NT
  }
,
{ // state 1550
102,1005, // "i"
  }
,
{ // state 1551
120,885, // "-"
  }
,
{ // state 1552
0x80000000|1, // match move
0x80000000|771, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 1553
0x80000000|412, // match move
0x80000000|137, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1554
92,1023, // "s"
  }
,
{ // state 1555
MIN_REDUCTION+315, // (default reduction)
  }
,
{ // state 1556
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 1557
183,MIN_REDUCTION+212, // $NT
  }
,
{ // state 1558
2,418, // white*
143,1535, // " "
163,408, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 1559
0x80000000|1, // match move
0x80000000|1571, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 1560
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 1561
0x80000000|1, // match move
0x80000000|1567, // no-match move
0x80000000|53, // NT-test-match state for idChar
  }
,
{ // state 1562
183,MIN_REDUCTION+355, // $NT
MIN_REDUCTION+355, // (default reduction)
  }
,
{ // state 1563
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 1564
94,463, // "e"
  }
,
{ // state 1565
183,MIN_REDUCTION+353, // $NT
  }
,
{ // state 1566
2,1480, // white*
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,408, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 1567
0x80000000|257, // match move
0x80000000|1492, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1568
91,1254, // "a"
94,1166, // "e"
108,1522, // "u"
  }
,
{ // state 1569
99,117, // "t"
  }
,
{ // state 1570
94,1086, // "e"
  }
,
{ // state 1571
0x80000000|666, // match move
0x80000000|1278, // no-match move
0x80000000|705, // NT-test-match state for comment
  }
,
{ // state 1572
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
165,370, // eol
175,317, // {10}
176,237, // {13}
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 1573
135,1345, // comment
136,115, // "/"
143,1535, // " "
163,1228, // white
164,1535, // {9 12}
166,420, // ds
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 1574
121,57, // "*"
174,1185, // comment_stuff**
180,545, // comment_stuff*
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[1575][];
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
// character_printable ::= {" ".."[" "]".."~"}
(141<<16)+1,
// character_printable ::= back_back
(141<<16)+1,
// character_printable ::= back_dquote
(141<<16)+1,
// character_printable ::= back_squote
(141<<16)+1,
// character_printable ::= back_n
(141<<16)+1,
// character_printable ::= back_tab
(141<<16)+1,
// character_printable ::= back_form
(141<<16)+1,
// character_printable ::= back_return
(141<<16)+1,
// back_back ::= "\" "\"
(149<<16)+2,
// back_dquote ::= "\" '"'
(150<<16)+2,
// back_squote ::= "\" "'"
(151<<16)+2,
// back_n ::= "\" "n"
(152<<16)+2,
// back_tab ::= "\" "t"
(153<<16)+2,
// back_form ::= "\" "f"
(154<<16)+2,
// back_return ::= "\" "r"
(155<<16)+2,
// dq ::= '"'
(157<<16)+1,
// stringChar ::= !dq character_printable
(158<<16)+1,
// STRING_LITERAL ::= dq stringChar* $$1
(87<<16)+3,
// STRING_LITERAL ::= dq $$1
(87<<16)+2,
// sq ::= "'"
(161<<16)+1,
// CHARACTER_LITERAL ::= sq character_printable sq white*
(88<<16)+4,
// CHARACTER_LITERAL ::= sq character_printable sq
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
(162<<16)+1,
// white ::= {9 12 " "}
(163<<16)+1,
// white ::= eol
(163<<16)+1,
// white ::= comment
(163<<16)+1,
// ds ::= "/" "/"
(166<<16)+2,
// single_printable ::= {9 12 " ".."~"}
(167<<16)+1,
// comment ::= ds single_printable**
(135<<16)+2,
// comment ::= ds !single_printable
(135<<16)+1,
// star ::= "*" !"/"
(169<<16)+1,
// slash ::= "/" !"*"
(170<<16)+1,
// slash_star ::= "/" "*"
(171<<16)+2,
// comment_printable ::= {" "..")" "+".."." "0".."~"}
(172<<16)+1,
// comment_stuff ::= comment_printable
(173<<16)+1,
// comment_stuff ::= star
(173<<16)+1,
// comment_stuff ::= slash
(173<<16)+1,
// comment_stuff ::= slash_star
(173<<16)+1,
// comment_stuff ::= eol
(173<<16)+1,
// comment ::= "/" "*" comment_stuff** "*" "/"
(135<<16)+5,
// comment ::= "/" "*" !comment_stuff "*" "/"
(135<<16)+4,
// eol ::= {10}
(165<<16)+1,
// eol ::= {13} {10}
(165<<16)+2,
// eol ::= {13} !10
(165<<16)+1,
// token* ::= token* token
(177<<16)+2,
// token* ::= token
(177<<16)+1,
// digit++ ::= digit+ !digit
(140<<16)+1,
// idChar** ::= idChar* !idChar
(139<<16)+1,
// comment_stuff** ::= comment_stuff* !comment_stuff
(174<<16)+1,
// stringChar* ::= stringChar* stringChar
(159<<16)+2,
// stringChar* ::= stringChar
(159<<16)+1,
// white* ::= white* white
(2<<16)+2,
// white* ::= white
(2<<16)+1,
// single_printable** ::= single_printable* !single_printable
(168<<16)+1,
// digit+ ::= digit
(178<<16)+1,
// digit+ ::= digit+ digit
(178<<16)+2,
// single_printable* ::= single_printable* single_printable
(181<<16)+2,
// single_printable* ::= single_printable
(181<<16)+1,
// idChar* ::= idChar* idChar
(179<<16)+2,
// idChar* ::= idChar
(179<<16)+1,
// comment_stuff* ::= comment_stuff* comment_stuff
(180<<16)+2,
// comment_stuff* ::= comment_stuff
(180<<16)+1,
// $$0 ::= token*
(3<<16)+1,
// $$1 ::= dq white*
(160<<16)+2,
// $$1 ::= dq
(160<<16)+1,
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
164, // 9
175, // 10
-1, // 11
164, // 12
176, // 13
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
143, // " "
115, // "!"
148, // '"'
145, // "#"
145, // "$"
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
136, // "/"
146, // "0"
146, // "1"
146, // "2"
146, // "3"
146, // "4"
146, // "5"
146, // "6"
146, // "7"
146, // "8"
146, // "9"
133, // ":"
134, // ";"
117, // "<"
116, // "="
118, // ">"
145, // "?"
145, // "@"
142, // "A"
142, // "B"
142, // "C"
142, // "D"
142, // "E"
142, // "F"
142, // "G"
142, // "H"
142, // "I"
142, // "J"
142, // "K"
142, // "L"
142, // "M"
142, // "N"
142, // "O"
142, // "P"
142, // "Q"
142, // "R"
142, // "S"
142, // "T"
142, // "U"
142, // "V"
142, // "W"
142, // "X"
142, // "Y"
142, // "Z"
128, // "["
156, // "\"
129, // "]"
145, // "^"
144, // "_"
145, // "`"
91, // "a"
95, // "b"
89, // "c"
100, // "d"
94, // "e"
105, // "f"
112, // "g"
104, // "h"
102, // "i"
142, // "j"
107, // "k"
90, // "l"
111, // "m"
97, // "n"
96, // "o"
109, // "p"
142, // "q"
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
145, // "~"
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
"", // 338
"", // 339
"", // 340
"", // 341
"", // 342
"", // 343
"", // 344
"", // 345
"", // 346
"", // 347
"", // 348
"", // 349
"", // 350
"", // 351
"", // 352
"", // 353
"", // 354
"", // 355
"token* ::= token* token", // 356
"token* ::= token* token", // 357
"digit++ ::= digit+ !digit", // 358
"idChar** ::= idChar* !idChar", // 359
"comment_stuff** ::= comment_stuff* !comment_stuff", // 360
"stringChar* ::= stringChar* stringChar", // 361
"stringChar* ::= stringChar* stringChar", // 362
"white* ::= white* white", // 363
"white* ::= white* white", // 364
"single_printable** ::= single_printable* !single_printable", // 365
"digit+ ::= digit", // 366
"digit+ ::= digit+ digit", // 367
"single_printable* ::= single_printable* single_printable", // 368
"single_printable* ::= single_printable* single_printable", // 369
"idChar* ::= idChar* idChar", // 370
"idChar* ::= idChar* idChar", // 371
"comment_stuff* ::= comment_stuff* comment_stuff", // 372
"comment_stuff* ::= comment_stuff* comment_stuff", // 373
"", // 374
"", // 375
"", // 376
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
    { // 308: character_printable ::= {" ".."[" "]".."~"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 309: character_printable ::= back_back @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 310: character_printable ::= back_dquote @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 311: character_printable ::= back_squote @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 312: character_printable ::= back_n @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 313: character_printable ::= back_tab @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 314: character_printable ::= back_form @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 315: character_printable ::= back_return @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 316: back_back ::= "\" "\" @makeNewLine(char,char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((86<<5)|0x5)/*methodCall:86*/,
    },
    { // 317: back_dquote ::= "\" '"' @makeNewLine(char,char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((86<<5)|0x5)/*methodCall:86*/,
    },
    { // 318: back_squote ::= "\" "'" @makeNewLine(char,char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((86<<5)|0x5)/*methodCall:86*/,
    },
    { // 319: back_n ::= "\" "n" @makeNewLine(char,char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((86<<5)|0x5)/*methodCall:86*/,
    },
    { // 320: back_tab ::= "\" "t" @makeNewLine(char,char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((86<<5)|0x5)/*methodCall:86*/,
    },
    { // 321: back_form ::= "\" "f" @makeNewLine(char,char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((86<<5)|0x5)/*methodCall:86*/,
    },
    { // 322: back_return ::= "\" "r" @makeNewLine(char,char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((86<<5)|0x5)/*methodCall:86*/,
    },
    { // 323: dq ::= '"' @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 324: stringChar ::= !dq character_printable @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 325: STRING_LITERAL ::= dq stringChar* $$1 @makeString(List<Character>)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((87<<5)|0x5)/*methodCall:87*/,
    },
    { // 326: STRING_LITERAL ::= dq [stringChar*] $$1 @makeString(List<Character>)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((87<<5)|0x5)/*methodCall:87*/,
    },
    { // 327: sq ::= "'" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 328: CHARACTER_LITERAL ::= sq character_printable sq white* @makeChar(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((88<<5)|0x5)/*methodCall:88*/,
    },
    { // 329: CHARACTER_LITERAL ::= sq character_printable sq [white*] @makeChar(char)=>int
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((88<<5)|0x5)/*methodCall:88*/,
    },
    { // 330: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 331: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 332: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 333: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 334: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 335: white ::= {9 12 " "} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 336: white ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 337: white ::= comment @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 338: ds ::= "/" "/" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 339: single_printable ::= {9 12 " ".."~"} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 340: comment ::= ds single_printable** @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 341: comment ::= ds !single_printable [single_printable**] @void
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 342: star ::= "*" !"/" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 343: slash ::= "/" !"*" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 344: slash_star ::= [#] "/" "*" @errorMessage(int,char,char)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((89<<5)|0x5)/*methodCall:89*/,
    },
    { // 345: comment_printable ::= {" "..")" "+".."." "0".."~"} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 346: comment_stuff ::= comment_printable @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 347: comment_stuff ::= star @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 348: comment_stuff ::= slash @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 349: comment_stuff ::= [#] slash_star @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 350: comment_stuff ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 351: comment ::= "/" "*" comment_stuff** "*" "/" @void
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
    { // 352: comment ::= "/" "*" !comment_stuff [comment_stuff**] "*" "/" @void
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
    { // 353: eol ::= {10} [registerNewline] @void
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 354: eol ::= {13} {10} [registerNewline] @void
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 355: eol ::= {13} !10 [registerNewline] @void
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 356: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 357: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
    },
    { // 358: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 359: idChar** ::= idChar* !idChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 360: comment_stuff** ::= comment_stuff* !comment_stuff @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 361: stringChar* ::= stringChar* stringChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 362: stringChar* ::= [stringChar*] stringChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 363: white* ::= white* white @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 364: white* ::= [white*] white @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
    },
    { // 365: single_printable** ::= single_printable* !single_printable @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 366: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 367: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 368: single_printable* ::= single_printable* single_printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 369: single_printable* ::= [single_printable*] single_printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
    },
    { // 370: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 371: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 372: comment_stuff* ::= comment_stuff* comment_stuff @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 373: comment_stuff* ::= [comment_stuff*] comment_stuff @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // 374: $$0 ::= token* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 375: $$1 ::= dq white* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 376: $$1 ::= dq [white*] @pass
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
      ((90<<5)|0x5)/*methodCall:90*/,
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
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      char result = actionObject.makeNewLine(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 87: {
      List<Character> parm0 = (List<Character>)si.popPb();
      String result = actionObject.makeString(parm0);
      si.pushPb(result);
    }
    break;
    case 88: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.makeChar(parm0);
      si.pushPb(result);
    }
    break;
    case 89: {
      int parm0 = (Integer)si.popPb();
      char parm1 = (Character)si.popPb();
      char parm2 = (Character)si.popPb();
      actionObject.errorMessage(parm0,parm1,parm2);
    }
    break;
    case 90: {
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
"char makeNewLine(char,char)",
"String makeString(List<Character>)",
"int makeChar(char)",
"void errorMessage(int,char,char)",
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
2,1,
1,1,
1,1,
3,0,
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
    1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    -1,
    0,
    1,
    1,
    0,
    0,
    1,
    0,
    -1,
    0,
    0,
    0,
    0,
    0,
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
