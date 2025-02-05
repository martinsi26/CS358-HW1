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
public int getEofSym() { return 197; }
public int getNttSym() { return 198; }
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
"oct_start",
"\"0\"",
"\"X\"",
"oct_digit",
"{\"1\"..\"7\"}",
"oct_literal",
"oct_digit++",
"hex_start",
"hex_digit",
"digit",
"{\"A\"..\"F\"}",
"hex_literal",
"hex_digit++",
"printable",
"digit++",
"character_printable",
"\" \"",
"{\"8\"..\"9\"}",
"{\"G\"..\"W\" \"Y\"..\"Z\" \"j\" \"q\"}",
"\"_\"",
"{\"#\"..\"$\" \"?\"..\"@\" \"^\" \"`\" \"~\"}",
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
"oct_digit+",
"hex_digit+",
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
public int numSymbols() { return 199;}
private static final int MIN_REDUCTION = 1894;
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
0x80000000|1885, // match move
0x80000000|883, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1
  }
,
{ // state 2
0x80000000|828, // match move
0x80000000|1572, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 3
0x80000000|1585, // match move
0x80000000|283, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 4
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 5
198,MIN_REDUCTION+355, // $NT
  }
,
{ // state 6
99,732, // "t"
  }
,
{ // state 7
99,575, // "t"
  }
,
{ // state 8
MIN_REDUCTION+359, // (default reduction)
  }
,
{ // state 9
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 10
198,MIN_REDUCTION+239, // $NT
  }
,
{ // state 11
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 12
97,518, // "n"
  }
,
{ // state 13
0x80000000|521, // match move
0x80000000|1861, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 14
0x80000000|1330, // match move
0x80000000|336, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 15
0x80000000|1, // match move
0x80000000|1324, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 16
0x80000000|88, // match move
0x80000000|245, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 17
2,819, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 18
2,716, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 19
102,888, // "i"
  }
,
{ // state 20
90,294, // "l"
  }
,
{ // state 21
198,MIN_REDUCTION+205, // $NT
  }
,
{ // state 22
99,287, // "t"
  }
,
{ // state 23
0x80000000|1102, // match move
0x80000000|837, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 24
90,1455, // "l"
  }
,
{ // state 25
MIN_REDUCTION+368, // (default reduction)
  }
,
{ // state 26
0x80000000|314, // match move
0x80000000|437, // no-match move
0x80000000|112, // NT-test-match state for comment_stuff
  }
,
{ // state 27
0x80000000|944, // match move
0x80000000|1805, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 28
2,1780, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 29
2,548, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 30
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 31
159,MIN_REDUCTION+351, // "_"
160,MIN_REDUCTION+351, // {"#".."$" "?".."@" "^" "`" "~"}
170,MIN_REDUCTION+351, // "\"
181,MIN_REDUCTION+351, // single_printable**
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 32
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 33
0x80000000|432, // match move
0x80000000|1750, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 34
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 35
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 36
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 37
198,MIN_REDUCTION+204, // $NT
  }
,
{ // state 38
90,338, // "l"
91,1762, // "a"
96,444, // "o"
104,567, // "h"
  }
,
{ // state 39
MIN_REDUCTION+365, // (default reduction)
  }
,
{ // state 40
0x80000000|1806, // match move
0x80000000|938, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 41
94,696, // "e"
  }
,
{ // state 42
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 43
0x80000000|921, // match move
0x80000000|251, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 44
MIN_REDUCTION+377, // (default reduction)
  }
,
{ // state 45
2,1178, // white*
135,1629, // comment
176,1084, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 46
188,59, // {10}
  }
,
{ // state 47
0x80000000|1, // match move
0x80000000|176, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 48
198,MIN_REDUCTION+233, // $NT
  }
,
{ // state 49
0x80000000|1720, // match move
0x80000000|898, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 50
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 51
2,128, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 52
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 53
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 54
108,858, // "u"
  }
,
{ // state 55
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 56
2,1537, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 57
MIN_REDUCTION+352, // (default reduction)
  }
,
{ // state 58
89,842, // "c"
90,842, // "l"
91,842, // "a"
92,842, // "s"
94,842, // "e"
95,842, // "b"
96,842, // "o"
97,842, // "n"
98,842, // "x"
99,842, // "t"
100,842, // "d"
101,842, // "v"
102,842, // "i"
103,842, // "w"
104,842, // "h"
105,842, // "f"
106,842, // "r"
107,842, // "k"
108,842, // "u"
109,842, // "p"
110,842, // "y"
111,842, // "m"
112,842, // "g"
113,842, // "z"
138,1848, // letter
141,342, // "0"
142,842, // "X"
144,342, // {"1".."7"}
149,332, // digit
150,842, // {"A".."F"}
157,342, // {"8".."9"}
158,842, // {"G".."W" "Y".."Z" "j" "q"}
159,227, // "_"
  }
,
{ // state 59
198,MIN_REDUCTION+367, // $NT
  }
,
{ // state 60
2,384, // white*
135,1629, // comment
176,1084, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 61
92,254, // "s"
  }
,
{ // state 62
0x80000000|382, // match move
0x80000000|971, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 63
89,930, // "c"
  }
,
{ // state 64
102,784, // "i"
  }
,
{ // state 65
0x80000000|1, // match move
0x80000000|367, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 66
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 67
2,993, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 68
198,MIN_REDUCTION+380, // $NT
MIN_REDUCTION+380, // (default reduction)
  }
,
{ // state 69
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+395, // (default reduction)
  }
,
{ // state 70
198,MIN_REDUCTION+203, // $NT
  }
,
{ // state 71
2,1049, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 72
121,1225, // "*"
187,1431, // comment_stuff**
195,653, // comment_stuff*
  }
,
{ // state 73
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 74
198,MIN_REDUCTION+197, // $NT
  }
,
{ // state 75
97,1543, // "n"
  }
,
{ // state 76
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 77
2,445, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+116, // $NT
  }
,
{ // state 78
94,471, // "e"
  }
,
{ // state 79
MIN_REDUCTION+388, // (default reduction)
  }
,
{ // state 80
MIN_REDUCTION+364, // (default reduction)
  }
,
{ // state 81
0x80000000|1, // match move
0x80000000|1290, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 82
102,620, // "i"
  }
,
{ // state 83
99,271, // "t"
  }
,
{ // state 84
104,1283, // "h"
  }
,
{ // state 85
1,520, // start
2,754, // white*
3,118, // $$0
4,1631, // token
5,1263, // `boolean
6,1847, // `class
7,1293, // `extends
8,1357, // `void
9,945, // `int
10,1546, // `while
11,1318, // `if
12,1797, // `else
13,103, // `for
14,712, // `break
15,1688, // `this
16,1157, // `false
17,1130, // `true
18,1515, // `super
19,984, // `null
20,1749, // `return
21,292, // `instanceof
22,636, // `new
23,391, // `abstract
24,1093, // `assert
25,1003, // `byte
26,1466, // `case
27,635, // `catch
28,1545, // `char
29,1011, // `const
30,1271, // `continue
31,637, // `default
32,707, // `do
33,759, // `double
34,1739, // `enum
35,1378, // `final
36,814, // `finally
37,1880, // `float
38,1207, // `goto
39,1033, // `implements
40,1379, // `import
41,1601, // `interface
42,300, // `long
43,1430, // `native
44,220, // `package
45,166, // `private
46,1768, // `protected
47,1360, // `public
48,93, // `short
49,36, // `static
50,1272, // `strictfp
51,1416, // `switch
52,1457, // `synchronized
53,1656, // `throw
54,1724, // `throws
55,206, // `transient
56,1281, // `try
57,581, // `volatile
190,1459, // token*
  }
,
{ // state 86
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 87
2,244, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 88
2,1058, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 89
MIN_REDUCTION+367, // (default reduction)
  }
,
{ // state 90
2,1322, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 91
141,342, // "0"
144,342, // {"1".."7"}
157,342, // {"8".."9"}
  }
,
{ // state 92
MIN_REDUCTION+353, // (default reduction)
  }
,
{ // state 93
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 94
2,740, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 95
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 96
2,1499, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 97
198,MIN_REDUCTION+237, // $NT
  }
,
{ // state 98
2,416, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 99
2,539, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 100
0x80000000|530, // match move
0x80000000|2, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 101
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 102
136,1140, // "/"
  }
,
{ // state 103
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 104
MIN_REDUCTION+381, // (default reduction)
  }
,
{ // state 105
0x80000000|856, // match move
0x80000000|977, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 106
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 107
2,487, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 108
102,1570, // "i"
  }
,
{ // state 109
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 110
91,1535, // "a"
  }
,
{ // state 111
102,1586, // "i"
  }
,
{ // state 112
89,163, // "c"
90,163, // "l"
91,163, // "a"
92,163, // "s"
94,163, // "e"
95,163, // "b"
96,163, // "o"
97,163, // "n"
98,163, // "x"
99,163, // "t"
100,163, // "d"
101,163, // "v"
102,163, // "i"
103,163, // "w"
104,163, // "h"
105,163, // "f"
106,163, // "r"
107,163, // "k"
108,163, // "u"
109,163, // "p"
110,163, // "y"
111,163, // "m"
112,163, // "g"
113,163, // "z"
115,163, // "!"
116,163, // "="
117,163, // "<"
118,163, // ">"
119,163, // "+"
120,163, // "-"
121,547, // "*"
122,163, // "%"
123,163, // "&"
124,163, // "("
125,163, // ")"
126,163, // "{"
127,163, // "}"
128,163, // "["
129,163, // "]"
130,163, // "|"
131,163, // "."
132,163, // ","
133,163, // ":"
134,163, // ";"
136,428, // "/"
141,163, // "0"
142,163, // "X"
144,163, // {"1".."7"}
150,163, // {"A".."F"}
156,163, // " "
157,163, // {"8".."9"}
158,163, // {"G".."W" "Y".."Z" "j" "q"}
159,163, // "_"
160,163, // {"#".."$" "?".."@" "^" "`" "~"}
161,163, // "'"
162,163, // '"'
170,163, // "\"
178,141, // eol
182,1589, // star
183,1683, // slash
184,1450, // slash_star
185,431, // comment_printable
188,1561, // {10}
189,1583, // {13}
  }
,
{ // state 113
106,1658, // "r"
  }
,
{ // state 114
136,1381, // "/"
  }
,
{ // state 115
MIN_REDUCTION+367, // (default reduction)
  }
,
{ // state 116
0x80000000|979, // match move
0x80000000|1100, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 117
2,1258, // white*
58,678, // `!
59,866, // `!=
60,1648, // `%
61,365, // `&&
62,1808, // `*
63,677, // `(
64,844, // `)
65,1087, // `{
66,1551, // `}
67,55, // `-
68,242, // `+
69,1787, // `=
70,53, // `==
71,1524, // `[
72,341, // `]
73,1227, // `||
74,650, // `<
75,531, // `<=
76,1311, // `,
77,1388, // `>
78,1702, // `>=
79,983, // `.
80,225, // `;
81,1717, // `++
82,683, // `--
83,804, // `/
84,1825, // `:
85,608, // ID
86,1714, // INT_LITERAL
135,1629, // comment
137,1270, // identifier
138,522, // letter
143,1620, // oct_digit
146,MIN_REDUCTION+306, // oct_digit++
149,1141, // digit
154,519, // digit++
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
179,1560, // ds
188,279, // {10}
189,364, // {13}
191,541, // digit+
192,795, // oct_digit+
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 118
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 119
2,1178, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 120
0x80000000|1662, // match move
0x80000000|657, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 121
0x80000000|35, // match move
0x80000000|1376, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 122
2,1403, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 123
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 124
90,276, // "l"
  }
,
{ // state 125
2,1005, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 126
0x80000000|932, // match move
0x80000000|1606, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 127
2,1398, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+112, // $NT
  }
,
{ // state 128
0x80000000|1675, // match move
0x80000000|1678, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 129
96,1594, // "o"
  }
,
{ // state 130
0x80000000|812, // match move
0x80000000|1477, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 131
0x80000000|1051, // match move
0x80000000|1890, // no-match move
0x80000000|1446, // NT-test-match state for reserved
  }
,
{ // state 132
198,MIN_REDUCTION+220, // $NT
  }
,
{ // state 133
2,1605, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 134
0x80000000|1842, // match move
0x80000000|1201, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 135
91,446, // "a"
  }
,
{ // state 136
188,89, // {10}
  }
,
{ // state 137
99,693, // "t"
  }
,
{ // state 138
90,1334, // "l"
  }
,
{ // state 139
0x80000000|1563, // match move
0x80000000|378, // no-match move
// T-test match for {"X" "x"}:
98,
142,
  }
,
{ // state 140
0x80000000|1, // match move
0x80000000|1133, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 141
198,MIN_REDUCTION+363, // $NT
  }
,
{ // state 142
102,833, // "i"
  }
,
{ // state 143
97,750, // "n"
  }
,
{ // state 144
0x80000000|857, // match move
0x80000000|839, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 145
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+141, // $NT
  }
,
{ // state 146
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 147
MIN_REDUCTION+380, // (default reduction)
  }
,
{ // state 148
97,1472, // "n"
105,1774, // "f"
111,652, // "m"
  }
,
{ // state 149
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 150
0x80000000|1, // match move
0x80000000|1257, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 151
120,238, // "-"
  }
,
{ // state 152
0x80000000|119, // match move
0x80000000|1498, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 153
2,278, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+192, // $NT
  }
,
{ // state 154
198,MIN_REDUCTION+223, // $NT
  }
,
{ // state 155
96,1342, // "o"
106,1101, // "r"
110,1120, // "y"
  }
,
{ // state 156
198,MIN_REDUCTION+195, // $NT
  }
,
{ // state 157
0x80000000|90, // match move
0x80000000|249, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 158
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 159
121,1493, // "*"
  }
,
{ // state 160
0x80000000|730, // match move
0x80000000|1607, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 161
2,1164, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 162
0x80000000|744, // match move
0x80000000|1449, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 163
198,MIN_REDUCTION+358, // $NT
  }
,
{ // state 164
MIN_REDUCTION+387, // (default reduction)
  }
,
{ // state 165
0x80000000|1163, // match move
0x80000000|885, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 166
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 167
94,713, // "e"
  }
,
{ // state 168
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 169
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 170
0x80000000|1, // match move
0x80000000|1118, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 171
MIN_REDUCTION+360, // (default reduction)
  }
,
{ // state 172
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 173
89,1641, // "c"
  }
,
{ // state 174
94,1754, // "e"
  }
,
{ // state 175
0x80000000|902, // match move
0x80000000|1816, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 176
0x80000000|18, // match move
0x80000000|656, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 177
102,406, // "i"
  }
,
{ // state 178
0x80000000|1460, // match move
0x80000000|161, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 179
141,1390, // "0"
143,689, // oct_digit
144,1390, // {"1".."7"}
  }
,
{ // state 180
0x80000000|964, // match move
0x80000000|618, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 181
89,1424, // "c"
  }
,
{ // state 182
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+187, // $NT
  }
,
{ // state 183
116,222, // "="
  }
,
{ // state 184
198,MIN_REDUCTION+367, // $NT
MIN_REDUCTION+367, // (default reduction)
  }
,
{ // state 185
2,318, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 186
92,1689, // "s"
  }
,
{ // state 187
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 188
0x80000000|1007, // match move
0x80000000|770, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 189
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 190
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 191
0x80000000|256, // match move
0x80000000|71, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 192
198,MIN_REDUCTION+235, // $NT
  }
,
{ // state 193
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 194
0x80000000|1385, // match move
0x80000000|675, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 195
99,1150, // "t"
  }
,
{ // state 196
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 197
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 198
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 199
121,1015, // "*"
136,1615, // "/"
  }
,
{ // state 200
2,1516, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 201
2,630, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 202
2,869, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 203
-1, // $$start
520, // start
754, // white*
118, // $$0
1631, // token
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
678, // `!
866, // `!=
1648, // `%
365, // `&&
1808, // `*
677, // `(
844, // `)
1087, // `{
1551, // `}
55, // `-
242, // `+
1787, // `=
53, // `==
1524, // `[
341, // `]
1227, // `||
650, // `<
531, // `<=
1311, // `,
1388, // `>
1702, // `>=
983, // `.
225, // `;
1717, // `++
683, // `--
804, // `/
1825, // `:
608, // ID
1714, // INT_LITERAL
1332, // STRING_LITERAL
1700, // CHARACTER_LITERAL
756, // "c"
756, // "l"
756, // "a"
756, // "s"
-1, // idChar
756, // "e"
756, // "b"
756, // "o"
756, // "n"
756, // "x"
756, // "t"
756, // "d"
756, // "v"
756, // "i"
756, // "w"
756, // "h"
756, // "f"
756, // "r"
756, // "k"
756, // "u"
756, // "p"
756, // "y"
756, // "m"
756, // "g"
756, // "z"
-1, // reserved
1652, // "!"
180, // "="
1479, // "<"
165, // ">"
769, // "+"
680, // "-"
301, // "*"
1417, // "%"
504, // "&"
33, // "("
175, // ")"
1224, // "{"
525, // "}"
363, // "["
1520, // "]"
747, // "|"
1004, // "."
570, // ","
1109, // ":"
965, // ";"
-1, // comment
1090, // "/"
1270, // identifier
522, // letter
-1, // idChar**
-1, // oct_start
362, // "0"
756, // "X"
-1, // oct_digit
362, // {"1".."7"}
-1, // oct_literal
-1, // oct_digit++
-1, // hex_start
-1, // hex_digit
1141, // digit
756, // {"A".."F"}
-1, // hex_literal
-1, // hex_digit++
-1, // printable
519, // digit++
-1, // character_printable
1344, // " "
362, // {"8".."9"}
756, // {"G".."W" "Y".."Z" "j" "q"}
-1, // "_"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
601, // "'"
970, // '"'
-1, // back_back
-1, // back_dquote
-1, // back_squote
-1, // back_n
-1, // back_tab
-1, // back_form
-1, // back_return
-1, // "\"
679, // dq
-1, // stringChar
-1, // stringChar*
-1, // $$1
741, // sq
147, // white
1344, // {9 12}
1644, // eol
-1, // ds
-1, // single_printable
-1, // single_printable**
-1, // star
-1, // slash
-1, // slash_star
-1, // comment_printable
-1, // comment_stuff
-1, // comment_stuff**
1659, // {10}
479, // {13}
1459, // token*
541, // digit+
-1, // oct_digit+
-1, // hex_digit+
-1, // idChar*
-1, // comment_stuff*
-1, // single_printable*
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 204
2,746, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+154, // $NT
  }
,
{ // state 205
0x80000000|997, // match move
0x80000000|1110, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 206
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 207
90,1510, // "l"
  }
,
{ // state 208
0x80000000|792, // match move
0x80000000|1642, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 209
2,1809, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 210
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 211
0x80000000|1811, // match move
0x80000000|549, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 212
94,1699, // "e"
  }
,
{ // state 213
2,226, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+176, // $NT
  }
,
{ // state 214
0x80000000|1701, // match move
0x80000000|1173, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 215
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+89, // $NT
  }
,
{ // state 216
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 217
102,1571, // "i"
  }
,
{ // state 218
2,1184, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+186, // $NT
  }
,
{ // state 219
0x80000000|568, // match move
0x80000000|1053, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 220
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 221
0x80000000|1254, // match move
0x80000000|1014, // no-match move
0x80000000|941, // NT-test-match state for single_printable
  }
,
{ // state 222
0x80000000|1849, // match move
0x80000000|664, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 223
MIN_REDUCTION+358, // (default reduction)
  }
,
{ // state 224
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 225
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 226
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+175, // $NT
  }
,
{ // state 227
198,MIN_REDUCTION+345, // $NT
  }
,
{ // state 228
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+107, // $NT
  }
,
{ // state 229
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 230
108,912, // "u"
  }
,
{ // state 231
99,390, // "t"
  }
,
{ // state 232
2,244, // white*
135,1629, // comment
176,1084, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 233
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 234
94,356, // "e"
  }
,
{ // state 235
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 236
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 237
90,1044, // "l"
97,230, // "n"
98,265, // "x"
  }
,
{ // state 238
0x80000000|402, // match move
0x80000000|1022, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 239
94,1082, // "e"
  }
,
{ // state 240
2,1637, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 241
94,1249, // "e"
  }
,
{ // state 242
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 243
0x80000000|647, // match move
0x80000000|1882, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 244
0x80000000|293, // match move
0x80000000|1383, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 245
2,1058, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 246
121,1326, // "*"
187,1824, // comment_stuff**
195,653, // comment_stuff*
  }
,
{ // state 247
2,1487, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 248
0x80000000|753, // match move
0x80000000|978, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 249
2,1322, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 250
91,1489, // "a"
  }
,
{ // state 251
0x80000000|815, // match move
0x80000000|1555, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 252
97,170, // "n"
  }
,
{ // state 253
121,497, // "*"
136,1112, // "/"
  }
,
{ // state 254
0x80000000|1, // match move
0x80000000|1486, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 255
0x80000000|1, // match move
0x80000000|665, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 256
2,1049, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 257
MIN_REDUCTION+357, // (default reduction)
  }
,
{ // state 258
198,MIN_REDUCTION+353, // $NT
  }
,
{ // state 259
2,539, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 260
97,63, // "n"
  }
,
{ // state 261
2,1499, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 262
0x80000000|513, // match move
0x80000000|295, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 263
0x80000000|1744, // match move
0x80000000|502, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 264
0x80000000|1, // match move
0x80000000|162, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 265
99,412, // "t"
  }
,
{ // state 266
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 267
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 268
90,1884, // "l"
97,670, // "n"
98,1436, // "x"
  }
,
{ // state 269
97,1310, // "n"
105,488, // "f"
111,1772, // "m"
  }
,
{ // state 270
139,711, // idChar**
194,495, // idChar*
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 271
105,492, // "f"
  }
,
{ // state 272
2,1232, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 273
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 274
96,674, // "o"
  }
,
{ // state 275
89,433, // "c"
90,433, // "l"
91,433, // "a"
92,433, // "s"
94,433, // "e"
95,433, // "b"
96,433, // "o"
97,433, // "n"
98,433, // "x"
99,433, // "t"
100,433, // "d"
101,433, // "v"
102,433, // "i"
103,433, // "w"
104,433, // "h"
105,433, // "f"
106,433, // "r"
107,433, // "k"
108,433, // "u"
109,433, // "p"
110,433, // "y"
111,433, // "m"
112,433, // "g"
113,433, // "z"
115,433, // "!"
116,433, // "="
117,433, // "<"
118,433, // ">"
119,433, // "+"
120,433, // "-"
121,433, // "*"
122,433, // "%"
123,433, // "&"
124,433, // "("
125,433, // ")"
126,433, // "{"
127,433, // "}"
128,433, // "["
129,433, // "]"
130,433, // "|"
131,433, // "."
132,433, // ","
133,433, // ":"
134,433, // ";"
136,433, // "/"
141,433, // "0"
142,433, // "X"
144,433, // {"1".."7"}
150,433, // {"A".."F"}
156,433, // " "
157,433, // {"8".."9"}
158,433, // {"G".."W" "Y".."Z" "j" "q"}
159,433, // "_"
160,433, // {"#".."$" "?".."@" "^" "`" "~"}
161,433, // "'"
162,433, // '"'
170,433, // "\"
177,433, // {9 12}
180,1761, // single_printable
  }
,
{ // state 276
90,15, // "l"
  }
,
{ // state 277
92,481, // "s"
  }
,
{ // state 278
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+191, // $NT
  }
,
{ // state 279
MIN_REDUCTION+366, // (default reduction)
  }
,
{ // state 280
0x80000000|1095, // match move
0x80000000|1614, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 281
96,1793, // "o"
  }
,
{ // state 282
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 283
0x80000000|1151, // match move
0x80000000|1476, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 284
96,1696, // "o"
106,167, // "r"
110,308, // "y"
  }
,
{ // state 285
89,826, // "c"
90,826, // "l"
91,826, // "a"
92,826, // "s"
94,826, // "e"
95,826, // "b"
96,826, // "o"
97,826, // "n"
98,826, // "x"
99,826, // "t"
100,826, // "d"
101,826, // "v"
102,826, // "i"
103,826, // "w"
104,826, // "h"
105,826, // "f"
106,826, // "r"
107,826, // "k"
108,826, // "u"
109,826, // "p"
110,826, // "y"
111,826, // "m"
112,826, // "g"
113,826, // "z"
115,826, // "!"
116,826, // "="
117,826, // "<"
118,826, // ">"
119,826, // "+"
120,826, // "-"
121,482, // "*"
122,826, // "%"
123,826, // "&"
124,826, // "("
125,826, // ")"
126,826, // "{"
127,826, // "}"
128,826, // "["
129,826, // "]"
130,826, // "|"
131,826, // "."
132,826, // ","
133,826, // ":"
134,826, // ";"
136,613, // "/"
141,826, // "0"
142,826, // "X"
144,826, // {"1".."7"}
150,826, // {"A".."F"}
156,826, // " "
157,826, // {"8".."9"}
158,826, // {"G".."W" "Y".."Z" "j" "q"}
159,826, // "_"
160,826, // {"#".."$" "?".."@" "^" "`" "~"}
161,826, // "'"
162,826, // '"'
170,826, // "\"
178,1597, // eol
182,1461, // star
183,330, // slash
184,26, // slash_star
185,1856, // comment_printable
186,493, // comment_stuff
187,1339, // comment_stuff**
188,1297, // {10}
189,1651, // {13}
195,653, // comment_stuff*
  }
,
{ // state 286
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+177, // $NT
  }
,
{ // state 287
106,671, // "r"
  }
,
{ // state 288
0x80000000|1635, // match move
0x80000000|1558, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 289
2,288, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 290
0x80000000|1569, // match move
0x80000000|954, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 291
2,1780, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 292
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 293
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 294
92,569, // "s"
  }
,
{ // state 295
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 296
0x80000000|1703, // match move
0x80000000|1279, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 297
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 298
0x80000000|573, // match move
0x80000000|1868, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 299
99,41, // "t"
  }
,
{ // state 300
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 301
0x80000000|343, // match move
0x80000000|1859, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 302
198,MIN_REDUCTION+311, // $NT
  }
,
{ // state 303
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 304
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 305
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 306
104,108, // "h"
  }
,
{ // state 307
2,895, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+146, // $NT
  }
,
{ // state 308
99,1649, // "t"
  }
,
{ // state 309
198,MIN_REDUCTION+245, // $NT
  }
,
{ // state 310
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 311
94,1887, // "e"
  }
,
{ // state 312
0x80000000|1726, // match move
0x80000000|933, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 313
90,949, // "l"
  }
,
{ // state 314
MIN_REDUCTION+362, // (default reduction)
  }
,
{ // state 315
0x80000000|1722, // match move
0x80000000|95, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 316
0x80000000|1039, // match move
0x80000000|985, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 317
92,82, // "s"
  }
,
{ // state 318
0x80000000|1777, // match move
0x80000000|1091, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 319
99,1599, // "t"
  }
,
{ // state 320
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+105, // $NT
  }
,
{ // state 321
2,228, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+108, // $NT
  }
,
{ // state 322
94,1667, // "e"
  }
,
{ // state 323
94,903, // "e"
  }
,
{ // state 324
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 325
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 326
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 327
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 328
0x80000000|1, // match move
0x80000000|334, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 329
2,1830, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+162, // $NT
  }
,
{ // state 330
0x80000000|774, // match move
0x80000000|820, // no-match move
0x80000000|112, // NT-test-match state for comment_stuff
  }
,
{ // state 331
2,1605, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 332
198,MIN_REDUCTION+344, // $NT
  }
,
{ // state 333
91,1619, // "a"
  }
,
{ // state 334
0x80000000|572, // match move
0x80000000|1061, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 335
2,1036, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+182, // $NT
  }
,
{ // state 336
0x80000000|1264, // match move
0x80000000|149, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 337
0x80000000|1, // match move
0x80000000|1268, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 338
91,890, // "a"
  }
,
{ // state 339
0x80000000|1, // match move
0x80000000|372, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 340
2,1671, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 341
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 342
198,MIN_REDUCTION+347, // $NT
  }
,
{ // state 343
2,1637, // white*
135,1629, // comment
176,1084, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 344
101,385, // "v"
  }
,
{ // state 345
198,MIN_REDUCTION+247, // $NT
  }
,
{ // state 346
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 347
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+129, // $NT
  }
,
{ // state 348
0x80000000|1719, // match move
0x80000000|1706, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 349
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 350
90,757, // "l"
  }
,
{ // state 351
2,1765, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+136, // $NT
  }
,
{ // state 352
4,1206, // token
MIN_REDUCTION+394, // (default reduction)
  }
,
{ // state 353
0x80000000|1, // match move
0x80000000|1238, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 354
96,1682, // "o"
  }
,
{ // state 355
94,1284, // "e"
  }
,
{ // state 356
100,1217, // "d"
  }
,
{ // state 357
0x80000000|1285, // match move
0x80000000|383, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 358
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 359
MIN_REDUCTION+368, // (default reduction)
  }
,
{ // state 360
0x80000000|1313, // match move
0x80000000|434, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 361
2,1203, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+184, // $NT
  }
,
{ // state 362
0x80000000|1097, // match move
0x80000000|1057, // no-match move
0x80000000|91, // NT-test-match state for digit
  }
,
{ // state 363
0x80000000|60, // match move
0x80000000|1497, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 364
0x80000000|136, // match move
0x80000000|25, // no-match move
// T-test match for 10:
188,
  }
,
{ // state 365
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 366
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 367
0x80000000|1604, // match move
0x80000000|51, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 368
92,174, // "s"
  }
,
{ // state 369
2,630, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 370
2,869, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 371
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 372
0x80000000|603, // match move
0x80000000|414, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 373
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 374
2,740, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 375
0x80000000|1018, // match move
0x80000000|1222, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 376
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 377
2,740, // white*
135,1629, // comment
176,1084, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 378
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 379
94,1653, // "e"
  }
,
{ // state 380
0x80000000|1119, // match move
0x80000000|1800, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 381
99,129, // "t"
  }
,
{ // state 382
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 383
0x80000000|794, // match move
0x80000000|1841, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 384
0x80000000|425, // match move
0x80000000|312, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 385
94,140, // "e"
  }
,
{ // state 386
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 387
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 388
99,1871, // "t"
  }
,
{ // state 389
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 390
94,1741, // "e"
  }
,
{ // state 391
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 392
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 393
90,239, // "l"
  }
,
{ // state 394
90,762, // "l"
  }
,
{ // state 395
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 396
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 397
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 398
96,1823, // "o"
  }
,
{ // state 399
89,433, // "c"
90,433, // "l"
91,433, // "a"
92,433, // "s"
94,433, // "e"
95,433, // "b"
96,433, // "o"
97,433, // "n"
98,433, // "x"
99,433, // "t"
100,433, // "d"
101,433, // "v"
102,433, // "i"
103,433, // "w"
104,433, // "h"
105,433, // "f"
106,433, // "r"
107,433, // "k"
108,433, // "u"
109,433, // "p"
110,433, // "y"
111,433, // "m"
112,433, // "g"
113,433, // "z"
115,433, // "!"
116,433, // "="
117,433, // "<"
118,433, // ">"
119,433, // "+"
120,433, // "-"
121,433, // "*"
122,433, // "%"
123,433, // "&"
124,433, // "("
125,433, // ")"
126,433, // "{"
127,433, // "}"
128,433, // "["
129,433, // "]"
130,433, // "|"
131,433, // "."
132,433, // ","
133,433, // ":"
134,433, // ";"
136,433, // "/"
141,433, // "0"
142,433, // "X"
144,433, // {"1".."7"}
150,433, // {"A".."F"}
156,433, // " "
157,433, // {"8".."9"}
158,433, // {"G".."W" "Y".."Z" "j" "q"}
159,433, // "_"
160,433, // {"#".."$" "?".."@" "^" "`" "~"}
161,433, // "'"
162,433, // '"'
170,433, // "\"
177,433, // {9 12}
180,1840, // single_printable
181,973, // single_printable**
196,1665, // single_printable*
  }
,
{ // state 400
102,729, // "i"
  }
,
{ // state 401
94,724, // "e"
  }
,
{ // state 402
2,1499, // white*
135,1629, // comment
176,1084, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 403
2,899, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+138, // $NT
  }
,
{ // state 404
0x80000000|377, // match move
0x80000000|655, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 405
0x80000000|1, // match move
0x80000000|1369, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 406
89,1496, // "c"
  }
,
{ // state 407
103,188, // "w"
  }
,
{ // state 408
198,MIN_REDUCTION+241, // $NT
  }
,
{ // state 409
99,1674, // "t"
  }
,
{ // state 410
0x80000000|193, // match move
0x80000000|498, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 411
97,959, // "n"
  }
,
{ // state 412
94,632, // "e"
  }
,
{ // state 413
198,MIN_REDUCTION+234, // $NT
  }
,
{ // state 414
2,1582, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 415
96,887, // "o"
  }
,
{ // state 416
0x80000000|396, // match move
0x80000000|704, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 417
0x80000000|371, // match move
0x80000000|951, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 418
0x80000000|516, // match move
0x80000000|121, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 419
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 420
99,1337, // "t"
103,1158, // "w"
104,686, // "h"
108,1610, // "u"
110,260, // "y"
  }
,
{ // state 421
0x80000000|889, // match move
0x80000000|1758, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 422
2,1394, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 423
99,64, // "t"
  }
,
{ // state 424
198,MIN_REDUCTION+351, // $NT
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 425
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 426
0x80000000|1, // match move
0x80000000|1393, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 427
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+155, // $NT
  }
,
{ // state 428
0x80000000|1709, // match move
0x80000000|749, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 429
91,1737, // "a"
  }
,
{ // state 430
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 431
198,MIN_REDUCTION+359, // $NT
  }
,
{ // state 432
2,1613, // white*
135,1629, // comment
176,1084, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 433
0x80000000|477, // match move
0x80000000|57, // no-match move
0x80000000|941, // NT-test-match state for single_printable
  }
,
{ // state 434
0x80000000|994, // match move
0x80000000|1769, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 435
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 436
92,1074, // "s"
  }
,
{ // state 437
MIN_REDUCTION+362, // (default reduction)
  }
,
{ // state 438
0x80000000|1, // match move
0x80000000|403, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 439
2,1199, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+152, // $NT
  }
,
{ // state 440
0x80000000|1, // match move
0x80000000|248, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 441
102,742, // "i"
  }
,
{ // state 442
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 443
106,1042, // "r"
  }
,
{ // state 444
97,1106, // "n"
  }
,
{ // state 445
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+115, // $NT
  }
,
{ // state 446
97,662, // "n"
  }
,
{ // state 447
0x80000000|1229, // match move
0x80000000|1434, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 448
2,1049, // white*
135,1629, // comment
176,1084, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 449
2,1698, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 450
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+139, // $NT
  }
,
{ // state 451
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 452
97,868, // "n"
  }
,
{ // state 453
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 454
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 455
0x80000000|685, // match move
0x80000000|29, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 456
0x80000000|1, // match move
0x80000000|1838, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 457
105,429, // "f"
  }
,
{ // state 458
0x80000000|1495, // match move
0x80000000|1152, // no-match move
0x80000000|941, // NT-test-match state for single_printable
  }
,
{ // state 459
198,MIN_REDUCTION+238, // $NT
  }
,
{ // state 460
0x80000000|1538, // match move
0x80000000|1144, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 461
0x80000000|974, // match move
0x80000000|873, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 462
2,1730, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 463
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 464
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 465
0x80000000|392, // match move
0x80000000|700, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 466
2,1258, // white*
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 467
0x80000000|1114, // match move
0x80000000|1539, // no-match move
0x80000000|941, // NT-test-match state for single_printable
  }
,
{ // state 468
1,520, // start
2,754, // white*
3,118, // $$0
4,1631, // token
135,1244, // comment
136,1380, // "/"
156,1344, // " "
176,147, // white
177,1344, // {9 12}
179,458, // ds
190,1459, // token*
197,MIN_REDUCTION+1, // $
  }
,
{ // state 469
198,MIN_REDUCTION+312, // $NT
  }
,
{ // state 470
2,1353, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+120, // $NT
  }
,
{ // state 471
89,1111, // "c"
  }
,
{ // state 472
95,393, // "b"
  }
,
{ // state 473
2,100, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 474
108,472, // "u"
  }
,
{ // state 475
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 476
0x80000000|185, // match move
0x80000000|1820, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 477
MIN_REDUCTION+352, // (default reduction)
  }
,
{ // state 478
2,288, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 479
0x80000000|1153, // match move
0x80000000|1029, // no-match move
// T-test match for 10:
188,
  }
,
{ // state 480
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 481
0x80000000|1, // match move
0x80000000|777, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 482
0x80000000|1, // match move
0x80000000|1451, // no-match move
// T-test match for "/":
136,
  }
,
{ // state 483
94,1009, // "e"
  }
,
{ // state 484
0x80000000|1407, // match move
0x80000000|708, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 485
2,208, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 486
198,MIN_REDUCTION+229, // $NT
  }
,
{ // state 487
0x80000000|1715, // match move
0x80000000|1251, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 488
0x80000000|1, // match move
0x80000000|848, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 489
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 490
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 491
104,1756, // "h"
106,1818, // "r"
  }
,
{ // state 492
109,1799, // "p"
  }
,
{ // state 493
0x80000000|725, // match move
0x80000000|1611, // no-match move
0x80000000|112, // NT-test-match state for comment_stuff
  }
,
{ // state 494
99,690, // "t"
  }
,
{ // state 495
0x80000000|1444, // match move
0x80000000|1209, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 496
0x80000000|1857, // match move
0x80000000|922, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 497
0x80000000|1814, // match move
0x80000000|72, // no-match move
0x80000000|112, // NT-test-match state for comment_stuff
  }
,
{ // state 498
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 499
0x80000000|1633, // match move
0x80000000|1853, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 500
99,821, // "t"
  }
,
{ // state 501
2,1516, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 502
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 503
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 504
123,1632, // "&"
  }
,
{ // state 505
2,1205, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 506
0x80000000|359, // match move
0x80000000|1325, // no-match move
0x80000000|112, // NT-test-match state for comment_stuff
  }
,
{ // state 507
106,718, // "r"
  }
,
{ // state 508
0x80000000|1, // match move
0x80000000|1305, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 509
2,860, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 510
101,882, // "v"
  }
,
{ // state 511
0x80000000|1, // match move
0x80000000|797, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 512
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 513
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 514
MIN_REDUCTION+363, // (default reduction)
  }
,
{ // state 515
89,734, // "c"
  }
,
{ // state 516
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 517
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 518
92,1182, // "s"
99,1851, // "t"
  }
,
{ // state 519
0x80000000|1687, // match move
0x80000000|565, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 520
197,MIN_REDUCTION+0, // $
  }
,
{ // state 521
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 522
0x80000000|1000, // match move
0x80000000|270, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 523
2,1745, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+172, // $NT
  }
,
{ // state 524
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 525
0x80000000|1554, // match move
0x80000000|1663, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 526
0x80000000|325, // match move
0x80000000|536, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 527
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 528
4,1206, // token
58,678, // `!
59,866, // `!=
60,1648, // `%
61,365, // `&&
62,1808, // `*
63,677, // `(
64,844, // `)
65,1087, // `{
66,1551, // `}
67,55, // `-
68,242, // `+
69,1787, // `=
70,53, // `==
71,1524, // `[
72,341, // `]
73,1227, // `||
74,650, // `<
75,531, // `<=
76,1311, // `,
77,1388, // `>
78,1702, // `>=
79,983, // `.
80,225, // `;
81,1717, // `++
82,683, // `--
83,804, // `/
84,1825, // `:
85,608, // ID
86,1714, // INT_LITERAL
87,1332, // STRING_LITERAL
88,1700, // CHARACTER_LITERAL
89,756, // "c"
90,756, // "l"
91,756, // "a"
92,756, // "s"
94,756, // "e"
95,756, // "b"
96,756, // "o"
97,756, // "n"
98,756, // "x"
99,756, // "t"
100,756, // "d"
101,756, // "v"
102,756, // "i"
103,756, // "w"
104,756, // "h"
105,756, // "f"
106,756, // "r"
107,756, // "k"
108,756, // "u"
109,756, // "p"
110,756, // "y"
111,756, // "m"
112,756, // "g"
113,756, // "z"
115,1652, // "!"
116,180, // "="
117,1479, // "<"
118,165, // ">"
119,769, // "+"
120,680, // "-"
121,301, // "*"
122,1417, // "%"
123,504, // "&"
124,33, // "("
125,175, // ")"
126,1224, // "{"
127,525, // "}"
128,363, // "["
129,1520, // "]"
130,747, // "|"
131,1004, // "."
132,570, // ","
133,1109, // ":"
134,965, // ";"
136,1090, // "/"
137,1270, // identifier
138,522, // letter
141,362, // "0"
142,756, // "X"
144,362, // {"1".."7"}
149,1141, // digit
150,756, // {"A".."F"}
154,519, // digit++
157,362, // {"8".."9"}
158,756, // {"G".."W" "Y".."Z" "j" "q"}
161,601, // "'"
162,970, // '"'
171,679, // dq
175,741, // sq
191,541, // digit+
MIN_REDUCTION+394, // (default reduction)
  }
,
{ // state 529
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 530
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 531
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 532
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 533
2,1006, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 534
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 535
198,MIN_REDUCTION+214, // $NT
  }
,
{ // state 536
0x80000000|235, // match move
0x80000000|464, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 537
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 538
94,1684, // "e"
  }
,
{ // state 539
0x80000000|1211, // match move
0x80000000|1517, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 540
94,1066, // "e"
  }
,
{ // state 541
0x80000000|1364, // match move
0x80000000|1375, // no-match move
0x80000000|91, // NT-test-match state for digit
  }
,
{ // state 542
0x80000000|1, // match move
0x80000000|351, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 543
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 544
112,1691, // "g"
  }
,
{ // state 545
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 546
92,1845, // "s"
  }
,
{ // state 547
0x80000000|1, // match move
0x80000000|5, // no-match move
// T-test match for "/":
136,
  }
,
{ // state 548
0x80000000|101, // match move
0x80000000|1269, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 549
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 550
0x80000000|352, // match move
0x80000000|1889, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 551
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 552
MIN_REDUCTION+383, // (default reduction)
  }
,
{ // state 553
0x80000000|1831, // match move
0x80000000|87, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 554
2,286, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+178, // $NT
  }
,
{ // state 555
2,487, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 556
198,MIN_REDUCTION+207, // $NT
  }
,
{ // state 557
99,939, // "t"
  }
,
{ // state 558
2,846, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 559
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 560
198,MIN_REDUCTION+209, // $NT
  }
,
{ // state 561
2,1671, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 562
0x80000000|721, // match move
0x80000000|1627, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 563
198,MIN_REDUCTION+221, // $NT
  }
,
{ // state 564
0x80000000|1, // match move
0x80000000|1519, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 565
0x80000000|1351, // match move
0x80000000|272, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 566
113,212, // "z"
  }
,
{ // state 567
91,909, // "a"
  }
,
{ // state 568
2,1819, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 569
94,955, // "e"
  }
,
{ // state 570
0x80000000|1165, // match move
0x80000000|1680, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 571
94,398, // "e"
  }
,
{ // state 572
2,831, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 573
2,421, // white*
135,1629, // comment
176,1084, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+396, // (default reduction)
  }
,
{ // state 574
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 575
0x80000000|1, // match move
0x80000000|779, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 576
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 577
97,1624, // "n"
  }
,
{ // state 578
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 579
97,196, // "n"
99,1129, // "t"
105,346, // "f"
106,1646, // "r"
161,863, // "'"
162,1527, // '"'
170,387, // "\"
  }
,
{ // state 580
2,624, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 581
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 582
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+113, // $NT
  }
,
{ // state 583
2,1058, // white*
135,1629, // comment
176,1084, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 584
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 585
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 586
0x80000000|1, // match move
0x80000000|476, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 587
2,1692, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+144, // $NT
  }
,
{ // state 588
2,1370, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+164, // $NT
  }
,
{ // state 589
0x80000000|106, // match move
0x80000000|1319, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 590
198,MIN_REDUCTION+357, // $NT
  }
,
{ // state 591
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 592
2,465, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 593
0x80000000|1, // match move
0x80000000|562, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 594
MIN_REDUCTION+387, // (default reduction)
  }
,
{ // state 595
2,1592, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+96, // $NT
  }
,
{ // state 596
0x80000000|1, // match move
0x80000000|760, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 597
2,600, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+194, // $NT
  }
,
{ // state 598
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 599
2,886, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 600
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+193, // $NT
  }
,
{ // state 601
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 602
2,375, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 603
2,1582, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 604
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 605
106,1020, // "r"
  }
,
{ // state 606
198,MIN_REDUCTION+365, // $NT
MIN_REDUCTION+365, // (default reduction)
  }
,
{ // state 607
MIN_REDUCTION+358, // (default reduction)
  }
,
{ // state 608
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 609
2,427, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+156, // $NT
  }
,
{ // state 610
103,508, // "w"
  }
,
{ // state 611
0x80000000|1, // match move
0x80000000|1320, // no-match move
// T-test match for {"X" "x"}:
98,
142,
  }
,
{ // state 612
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 613
0x80000000|159, // match move
0x80000000|1509, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 614
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 615
2,1389, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 616
2,1613, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+279, // (default reduction)
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
{ // state 617
198,MIN_REDUCTION+232, // $NT
  }
,
{ // state 618
0x80000000|1422, // match move
0x80000000|758, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 619
94,1548, // "e"
  }
,
{ // state 620
94,937, // "e"
  }
,
{ // state 621
198,MIN_REDUCTION+352, // $NT
  }
,
{ // state 622
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 623
2,348, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 624
0x80000000|1038, // match move
0x80000000|1260, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 625
89,355, // "c"
  }
,
{ // state 626
94,1590, // "e"
96,661, // "o"
  }
,
{ // state 627
136,MIN_REDUCTION+351, // "/"
156,MIN_REDUCTION+351, // " "
176,MIN_REDUCTION+351, // white
177,MIN_REDUCTION+351, // {9 12}
188,MIN_REDUCTION+351, // {10}
189,MIN_REDUCTION+351, // {13}
198,MIN_REDUCTION+351, // $NT
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 628
2,1502, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 629
2,1537, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 630
0x80000000|1386, // match move
0x80000000|691, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 631
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 632
97,851, // "n"
  }
,
{ // state 633
2,1292, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 634
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 635
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 636
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 637
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 638
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+189, // $NT
  }
,
{ // state 639
MIN_REDUCTION+379, // (default reduction)
  }
,
{ // state 640
0x80000000|864, // match move
0x80000000|1669, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 641
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 642
0x80000000|1, // match move
0x80000000|219, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 643
198,MIN_REDUCTION+364, // $NT
  }
,
{ // state 644
0x80000000|1, // match move
0x80000000|178, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 645
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 646
0x80000000|1, // match move
0x80000000|697, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 647
2,447, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 648
198,MIN_REDUCTION+210, // $NT
  }
,
{ // state 649
0x80000000|1085, // match move
0x80000000|1712, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 650
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 651
198,MIN_REDUCTION+366, // $NT
MIN_REDUCTION+366, // (default reduction)
  }
,
{ // state 652
109,1103, // "p"
  }
,
{ // state 653
0x80000000|1485, // match move
0x80000000|924, // no-match move
0x80000000|112, // NT-test-match state for comment_stuff
  }
,
{ // state 654
MIN_REDUCTION+383, // (default reduction)
  }
,
{ // state 655
0x80000000|374, // match move
0x80000000|94, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 656
2,716, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 657
0x80000000|1079, // match move
0x80000000|1474, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 658
2,450, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+140, // $NT
  }
,
{ // state 659
90,1088, // "l"
102,1175, // "i"
  }
,
{ // state 660
2,1154, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+174, // $NT
  }
,
{ // state 661
0x80000000|474, // match move
0x80000000|587, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 662
89,714, // "c"
  }
,
{ // state 663
0x80000000|1, // match move
0x80000000|1533, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 664
0x80000000|1001, // match move
0x80000000|1528, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 665
2,638, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+190, // $NT
  }
,
{ // state 666
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 667
0x80000000|1366, // match move
0x80000000|1721, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 668
99,1063, // "t"
  }
,
{ // state 669
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 670
108,1123, // "u"
  }
,
{ // state 671
91,877, // "a"
  }
,
{ // state 672
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+127, // $NT
  }
,
{ // state 673
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 674
0x80000000|1, // match move
0x80000000|1143, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 675
0x80000000|823, // match move
0x80000000|1672, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 676
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 677
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 678
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 679
0x80000000|1419, // match move
0x80000000|1349, // no-match move
0x80000000|1464, // NT-test-match state for dq
  }
,
{ // state 680
0x80000000|151, // match move
0x80000000|667, // no-match move
// T-test match for "-":
120,
  }
,
{ // state 681
2,357, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 682
2,194, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 683
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 684
2,384, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 685
2,548, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 686
96,929, // "o"
  }
,
{ // state 687
0x80000000|1254, // match move
0x80000000|791, // no-match move
0x80000000|941, // NT-test-match state for single_printable
  }
,
{ // state 688
121,1677, // "*"
187,854, // comment_stuff**
195,653, // comment_stuff*
  }
,
{ // state 689
0x80000000|699, // match move
0x80000000|1792, // no-match move
0x80000000|1137, // NT-test-match state for oct_digit
  }
,
{ // state 690
0x80000000|1, // match move
0x80000000|1580, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 691
0x80000000|917, // match move
0x80000000|999, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 692
0x80000000|1347, // match move
0x80000000|958, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 693
0x80000000|1, // match move
0x80000000|692, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 694
106,7, // "r"
  }
,
{ // state 695
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 696
89,500, // "c"
  }
,
{ // state 697
0x80000000|1504, // match move
0x80000000|125, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 698
0x80000000|598, // match move
0x80000000|9, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 699
MIN_REDUCTION+393, // (default reduction)
  }
,
{ // state 700
0x80000000|1139, // match move
0x80000000|1603, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 701
96,299, // "o"
102,510, // "i"
  }
,
{ // state 702
0x80000000|477, // match move
0x80000000|1812, // no-match move
0x80000000|941, // NT-test-match state for single_printable
  }
,
{ // state 703
198,MIN_REDUCTION+243, // $NT
  }
,
{ // state 704
0x80000000|1559, // match move
0x80000000|34, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 705
102,806, // "i"
  }
,
{ // state 706
181,1186, // single_printable**
196,1463, // single_printable*
198,MIN_REDUCTION+354, // $NT
MIN_REDUCTION+354, // (default reduction)
  }
,
{ // state 707
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 708
0x80000000|1867, // match move
0x80000000|681, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 709
100,436, // "d"
  }
,
{ // state 710
2,416, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 711
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 712
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 713
91,1373, // "a"
  }
,
{ // state 714
94,1040, // "e"
  }
,
{ // state 715
0x80000000|1839, // match move
0x80000000|66, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 716
0x80000000|676, // match move
0x80000000|698, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 717
2,380, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 718
105,1028, // "f"
  }
,
{ // state 719
162,834, // '"'
171,298, // dq
174,475, // $$1
  }
,
{ // state 720
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 721
2,1679, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 722
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 723
136,643, // "/"
  }
,
{ // state 724
0x80000000|1, // match move
0x80000000|126, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 725
MIN_REDUCTION+391, // (default reduction)
  }
,
{ // state 726
89,319, // "c"
  }
,
{ // state 727
2,1064, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 728
94,507, // "e"
  }
,
{ // state 729
90,619, // "l"
  }
,
{ // state 730
2,805, // white*
135,1629, // comment
176,1084, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 731
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 732
0x80000000|1, // match move
0x80000000|213, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 733
198,MIN_REDUCTION+379, // $NT
MIN_REDUCTION+379, // (default reduction)
  }
,
{ // state 734
107,967, // "k"
  }
,
{ // state 735
2,1322, // white*
135,1629, // comment
176,1084, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 736
0x80000000|1, // match move
0x80000000|897, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 737
94,586, // "e"
  }
,
{ // state 738
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 739
0x80000000|1, // match move
0x80000000|1099, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 740
0x80000000|1266, // match move
0x80000000|943, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 741
89,349, // "c"
90,349, // "l"
91,349, // "a"
92,349, // "s"
94,349, // "e"
95,349, // "b"
96,349, // "o"
97,349, // "n"
98,349, // "x"
99,349, // "t"
100,349, // "d"
101,349, // "v"
102,349, // "i"
103,349, // "w"
104,349, // "h"
105,349, // "f"
106,349, // "r"
107,349, // "k"
108,349, // "u"
109,349, // "p"
110,349, // "y"
111,349, // "m"
112,349, // "g"
113,349, // "z"
115,349, // "!"
116,349, // "="
117,349, // "<"
118,349, // ">"
119,349, // "+"
120,349, // "-"
121,349, // "*"
122,349, // "%"
123,349, // "&"
124,349, // "("
125,349, // ")"
126,349, // "{"
127,349, // "}"
128,349, // "["
129,349, // "]"
130,349, // "|"
131,349, // "."
132,349, // ","
133,349, // ":"
134,349, // ";"
136,349, // "/"
141,349, // "0"
142,349, // "X"
144,349, // {"1".."7"}
150,349, // {"A".."F"}
155,1333, // character_printable
156,349, // " "
157,349, // {"8".."9"}
158,349, // {"G".."W" "Y".."Z" "j" "q"}
159,349, // "_"
160,349, // {"#".."$" "?".."@" "^" "`" "~"}
161,349, // "'"
162,349, // '"'
163,32, // back_back
164,267, // back_dquote
165,1338, // back_squote
166,1013, // back_n
167,1670, // back_tab
168,172, // back_form
169,451, // back_return
170,803, // "\"
  }
,
{ // state 742
94,1252, // "e"
  }
,
{ // state 743
198,MIN_REDUCTION+211, // $NT
  }
,
{ // state 744
2,1791, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 745
92,368, // "s"
95,1751, // "b"
  }
,
{ // state 746
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+153, // $NT
  }
,
{ // state 747
130,134, // "|"
  }
,
{ // state 748
2,14, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 749
198,MIN_REDUCTION+356, // $NT
  }
,
{ // state 750
91,1508, // "a"
  }
,
{ // state 751
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 752
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 753
2,1829, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 754
0x80000000|850, // match move
0x80000000|1488, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 755
2,1573, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+102, // $NT
  }
,
{ // state 756
0x80000000|442, // match move
0x80000000|1544, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 757
94,339, // "e"
  }
,
{ // state 758
0x80000000|1296, // match move
0x80000000|509, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 759
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 760
0x80000000|98, // match move
0x80000000|710, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 761
0x80000000|1, // match move
0x80000000|1707, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 762
110,1396, // "y"
  }
,
{ // state 763
MIN_REDUCTION+359, // (default reduction)
  }
,
{ // state 764
0x80000000|766, // match move
0x80000000|1862, // no-match move
0x80000000|941, // NT-test-match state for single_printable
  }
,
{ // state 765
90,1147, // "l"
96,443, // "o"
  }
,
{ // state 766
89,1776, // "c"
90,1776, // "l"
91,1776, // "a"
92,1776, // "s"
94,1776, // "e"
95,1776, // "b"
96,1776, // "o"
97,1776, // "n"
98,1776, // "x"
99,1776, // "t"
100,1776, // "d"
101,1776, // "v"
102,1776, // "i"
103,1776, // "w"
104,1776, // "h"
105,1776, // "f"
106,1776, // "r"
107,1776, // "k"
108,1776, // "u"
109,1776, // "p"
110,1776, // "y"
111,1776, // "m"
112,1776, // "g"
113,1776, // "z"
115,1776, // "!"
116,1776, // "="
117,1776, // "<"
118,1776, // ">"
119,1776, // "+"
120,1776, // "-"
121,1776, // "*"
122,1776, // "%"
123,1776, // "&"
124,1776, // "("
125,1776, // ")"
126,1776, // "{"
127,1776, // "}"
128,1776, // "["
129,1776, // "]"
130,1776, // "|"
131,1776, // "."
132,1776, // ","
133,1776, // ":"
134,1776, // ";"
136,1776, // "/"
141,1776, // "0"
142,1776, // "X"
144,1776, // {"1".."7"}
150,1776, // {"A".."F"}
156,1776, // " "
157,1776, // {"8".."9"}
158,1776, // {"G".."W" "Y".."Z" "j" "q"}
159,1776, // "_"
160,1776, // {"#".."$" "?".."@" "^" "`" "~"}
161,1776, // "'"
162,1776, // '"'
170,1776, // "\"
177,1776, // {9 12}
180,221, // single_printable
  }
,
{ // state 767
0x80000000|1821, // match move
0x80000000|963, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 768
198,MIN_REDUCTION+201, // $NT
  }
,
{ // state 769
0x80000000|1437, // match move
0x80000000|214, // no-match move
// T-test match for "+":
119,
  }
,
{ // state 770
0x80000000|623, // match move
0x80000000|1341, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 771
91,726, // "a"
  }
,
{ // state 772
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 773
MIN_REDUCTION+386, // (default reduction)
  }
,
{ // state 774
MIN_REDUCTION+361, // (default reduction)
  }
,
{ // state 775
198,MIN_REDUCTION+202, // $NT
  }
,
{ // state 776
2,1188, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+104, // $NT
  }
,
{ // state 777
0x80000000|369, // match move
0x80000000|201, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 778
2,1494, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 779
0x80000000|1065, // match move
0x80000000|1355, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 780
0x80000000|1, // match move
0x80000000|1668, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 781
2,1329, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+180, // $NT
  }
,
{ // state 782
MIN_REDUCTION+382, // (default reduction)
  }
,
{ // state 783
2,465, // white*
135,1629, // comment
176,1084, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 784
90,538, // "l"
  }
,
{ // state 785
0x80000000|373, // match move
0x80000000|1195, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 786
2,418, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 787
2,1872, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 788
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 789
0x80000000|370, // match move
0x80000000|202, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 790
99,663, // "t"
  }
,
{ // state 791
198,MIN_REDUCTION+384, // $NT
MIN_REDUCTION+384, // (default reduction)
  }
,
{ // state 792
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 793
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 794
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 795
0x80000000|179, // match move
0x80000000|1037, // no-match move
0x80000000|1137, // NT-test-match state for oct_digit
  }
,
{ // state 796
2,208, // white*
135,1629, // comment
176,1084, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 797
0x80000000|1108, // match move
0x80000000|1817, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 798
2,1104, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+158, // $NT
  }
,
{ // state 799
1,520, // start
2,754, // white*
3,118, // $$0
4,1631, // token
5,1263, // `boolean
6,1847, // `class
7,1293, // `extends
8,1357, // `void
9,945, // `int
10,1546, // `while
11,1318, // `if
12,1797, // `else
13,103, // `for
14,712, // `break
15,1688, // `this
16,1157, // `false
17,1130, // `true
18,1515, // `super
19,984, // `null
20,1749, // `return
21,292, // `instanceof
22,636, // `new
23,391, // `abstract
24,1093, // `assert
25,1003, // `byte
26,1466, // `case
27,635, // `catch
28,1545, // `char
29,1011, // `const
30,1271, // `continue
31,637, // `default
32,707, // `do
33,759, // `double
34,1739, // `enum
35,1378, // `final
36,814, // `finally
37,1880, // `float
38,1207, // `goto
39,1033, // `implements
40,1379, // `import
41,1601, // `interface
42,300, // `long
43,1430, // `native
44,220, // `package
45,166, // `private
46,1768, // `protected
47,1360, // `public
48,93, // `short
49,36, // `static
50,1272, // `strictfp
51,1416, // `switch
52,1457, // `synchronized
53,1656, // `throw
54,1724, // `throws
55,206, // `transient
56,1281, // `try
57,581, // `volatile
89,38, // "c"
90,281, // "l"
91,918, // "a"
92,1068, // "s"
94,268, // "e"
95,284, // "b"
97,1138, // "n"
99,1008, // "t"
100,1399, // "d"
101,1420, // "v"
102,269, // "i"
103,1801, // "w"
105,1340, // "f"
106,540, // "r"
109,1435, // "p"
112,1523, // "g"
190,1459, // token*
197,MIN_REDUCTION+1, // $
  }
,
{ // state 800
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 801
198,MIN_REDUCTION+242, // $NT
  }
,
{ // state 802
0x80000000|109, // match move
0x80000000|31, // no-match move
0x80000000|941, // NT-test-match state for single_printable
  }
,
{ // state 803
97,1655, // "n"
99,1660, // "t"
105,578, // "f"
106,358, // "r"
161,1852, // "'"
162,534, // '"'
170,1148, // "\"
  }
,
{ // state 804
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 805
0x80000000|818, // match move
0x80000000|1854, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 806
89,388, // "c"
  }
,
{ // state 807
198,MIN_REDUCTION+348, // $NT
MIN_REDUCTION+348, // (default reduction)
  }
,
{ // state 808
2,1142, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 809
90,557, // "l"
  }
,
{ // state 810
0x80000000|799, // match move
0x80000000|203, // no-match move
0x80000000|1446, // NT-test-match state for reserved
  }
,
{ // state 811
198,MIN_REDUCTION+206, // $NT
  }
,
{ // state 812
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 813
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 814
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 815
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 816
198,MIN_REDUCTION+246, // $NT
  }
,
{ // state 817
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 818
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 819
0x80000000|641, // match move
0x80000000|290, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 820
MIN_REDUCTION+361, // (default reduction)
  }
,
{ // state 821
94,1067, // "e"
  }
,
{ // state 822
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 823
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 824
198,MIN_REDUCTION+215, // $NT
  }
,
{ // state 825
0x80000000|1240, // match move
0x80000000|1280, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 826
0x80000000|223, // match move
0x80000000|607, // no-match move
0x80000000|112, // NT-test-match state for comment_stuff
  }
,
{ // state 827
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 828
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 829
2,1307, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 830
0x80000000|960, // match move
0x80000000|1866, // no-match move
0x80000000|1115, // NT-test-match state for hex_digit
  }
,
{ // state 831
0x80000000|305, // match move
0x80000000|925, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 832
0x80000000|574, // match move
0x80000000|263, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 833
99,1212, // "t"
  }
,
{ // state 834
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 835
3,4, // $$0
4,1631, // token
135,1244, // comment
136,1380, // "/"
156,1344, // " "
176,639, // white
177,1344, // {9 12}
179,458, // ds
190,1459, // token*
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 836
90,217, // "l"
  }
,
{ // state 837
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 838
106,966, // "r"
  }
,
{ // state 839
0x80000000|107, // match move
0x80000000|555, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 840
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 841
2,819, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 842
198,MIN_REDUCTION+346, // $NT
  }
,
{ // state 843
89,84, // "c"
  }
,
{ // state 844
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 845
MIN_REDUCTION+382, // (default reduction)
  }
,
{ // state 846
0x80000000|517, // match move
0x80000000|927, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 847
MIN_REDUCTION+386, // (default reduction)
  }
,
{ // state 848
0x80000000|1317, // match move
0x80000000|505, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 849
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 850
0x80000000|1274, // match move
0x80000000|900, // no-match move
0x80000000|1446, // NT-test-match state for reserved
  }
,
{ // state 851
100,1035, // "d"
  }
,
{ // state 852
2,1733, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+170, // $NT
  }
,
{ // state 853
101,333, // "v"
  }
,
{ // state 854
121,723, // "*"
  }
,
{ // state 855
198,MIN_REDUCTION+200, // $NT
  }
,
{ // state 856
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 857
2,487, // white*
135,1629, // comment
176,1084, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 858
90,1374, // "l"
  }
,
{ // state 859
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 860
0x80000000|527, // match move
0x80000000|130, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 861
2,43, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 862
2,205, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 863
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 864
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 865
198,MIN_REDUCTION+218, // $NT
  }
,
{ // state 866
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 867
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 868
89,1231, // "c"
  }
,
{ // state 869
0x80000000|490, // match move
0x80000000|715, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 870
106,456, // "r"
  }
,
{ // state 871
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 872
0x80000000|916, // match move
0x80000000|1743, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 873
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 874
99,61, // "t"
  }
,
{ // state 875
MIN_REDUCTION+385, // (default reduction)
  }
,
{ // state 876
0x80000000|673, // match move
0x80000000|1221, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 877
89,790, // "c"
  }
,
{ // state 878
89,1002, // "c"
91,1002, // "a"
94,1002, // "e"
95,1002, // "b"
100,1002, // "d"
105,1002, // "f"
141,1019, // "0"
144,1019, // {"1".."7"}
148,1149, // hex_digit
149,1584, // digit
150,1002, // {"A".."F"}
152,1685, // hex_digit++
157,1019, // {"8".."9"}
193,1193, // hex_digit+
  }
,
{ // state 879
2,1634, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 880
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+167, // $NT
  }
,
{ // state 881
89,1190, // "c"
90,1190, // "l"
91,1190, // "a"
92,1190, // "s"
94,1190, // "e"
95,1190, // "b"
96,1190, // "o"
97,1190, // "n"
98,1190, // "x"
99,1190, // "t"
100,1190, // "d"
101,1190, // "v"
102,1190, // "i"
103,1190, // "w"
104,1190, // "h"
105,1190, // "f"
106,1190, // "r"
107,1190, // "k"
108,1190, // "u"
109,1190, // "p"
110,1190, // "y"
111,1190, // "m"
112,1190, // "g"
113,1190, // "z"
115,1190, // "!"
116,1190, // "="
117,1190, // "<"
118,1190, // ">"
119,1190, // "+"
120,1190, // "-"
121,1190, // "*"
122,1190, // "%"
123,1190, // "&"
124,1190, // "("
125,1190, // ")"
126,1190, // "{"
127,1190, // "}"
128,1190, // "["
129,1190, // "]"
130,1190, // "|"
131,1190, // "."
132,1190, // ","
133,1190, // ":"
134,1190, // ";"
136,1190, // "/"
141,1190, // "0"
142,1190, // "X"
144,1190, // {"1".."7"}
150,1190, // {"A".."F"}
156,1190, // " "
157,1190, // {"8".."9"}
158,1190, // {"G".."W" "Y".."Z" "j" "q"}
159,1190, // "_"
160,1190, // {"#".."$" "?".."@" "^" "`" "~"}
161,1190, // "'"
162,1190, // '"'
170,1190, // "\"
177,1190, // {9 12}
180,1387, // single_printable
181,258, // single_printable**
196,1145, // single_printable*
  }
,
{ // state 882
91,231, // "a"
  }
,
{ // state 883
0x80000000|468, // match move
0x80000000|810, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 884
2,1162, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+110, // $NT
  }
,
{ // state 885
0x80000000|783, // match move
0x80000000|976, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 886
0x80000000|210, // match move
0x80000000|969, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 887
103,991, // "w"
  }
,
{ // state 888
90,1361, // "l"
  }
,
{ // state 889
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+395, // (default reduction)
  }
,
{ // state 890
92,1363, // "s"
  }
,
{ // state 891
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 892
99,843, // "t"
  }
,
{ // state 893
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 894
2,3, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 895
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+145, // $NT
  }
,
{ // state 896
121,102, // "*"
187,1339, // comment_stuff**
195,653, // comment_stuff*
  }
,
{ // state 897
0x80000000|1540, // match move
0x80000000|778, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 898
0x80000000|786, // match move
0x80000000|1062, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 899
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+137, // $NT
  }
,
{ // state 900
3,4, // $$0
4,1631, // token
58,678, // `!
59,866, // `!=
60,1648, // `%
61,365, // `&&
62,1808, // `*
63,677, // `(
64,844, // `)
65,1087, // `{
66,1551, // `}
67,55, // `-
68,242, // `+
69,1787, // `=
70,53, // `==
71,1524, // `[
72,341, // `]
73,1227, // `||
74,650, // `<
75,531, // `<=
76,1311, // `,
77,1388, // `>
78,1702, // `>=
79,983, // `.
80,225, // `;
81,1717, // `++
82,683, // `--
83,804, // `/
84,1825, // `:
85,608, // ID
86,1714, // INT_LITERAL
87,1332, // STRING_LITERAL
88,1700, // CHARACTER_LITERAL
135,1244, // comment
137,1270, // identifier
138,522, // letter
140,1234, // oct_start
141,1553, // "0"
145,905, // oct_literal
147,878, // hex_start
151,827, // hex_literal
171,679, // dq
175,741, // sq
176,639, // white
178,1644, // eol
179,458, // ds
190,1459, // token*
  }
,
{ // state 901
2,182, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+188, // $NT
  }
,
{ // state 902
2,1730, // white*
135,1629, // comment
176,1084, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 903
106,952, // "r"
  }
,
{ // state 904
89,1377, // "c"
  }
,
{ // state 905
MIN_REDUCTION+315, // (default reduction)
  }
,
{ // state 906
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 907
96,1166, // "o"
  }
,
{ // state 908
0x80000000|524, // match move
0x80000000|1863, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 909
106,1043, // "r"
  }
,
{ // state 910
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 911
2,805, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 912
111,337, // "m"
  }
,
{ // state 913
198,MIN_REDUCTION+350, // $NT
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 914
2,1348, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 915
0x80000000|1, // match move
0x80000000|1879, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 916
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 917
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 918
92,1625, // "s"
95,1478, // "b"
  }
,
{ // state 919
198,MIN_REDUCTION+244, // $NT
  }
,
{ // state 920
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 921
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 922
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 923
0x80000000|1, // match move
0x80000000|1786, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 924
MIN_REDUCTION+376, // (default reduction)
  }
,
{ // state 925
0x80000000|187, // match move
0x80000000|788, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 926
0x80000000|45, // match move
0x80000000|152, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 927
0x80000000|168, // match move
0x80000000|731, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 928
198,MIN_REDUCTION+228, // $NT
  }
,
{ // state 929
106,6, // "r"
  }
,
{ // state 930
104,605, // "h"
  }
,
{ // state 931
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+99, // $NT
  }
,
{ // state 932
2,526, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 933
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 934
90,907, // "l"
91,20, // "a"
96,870, // "o"
102,75, // "i"
  }
,
{ // state 935
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 936
94,1131, // "e"
  }
,
{ // state 937
97,1127, // "n"
  }
,
{ // state 938
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 939
0x80000000|1, // match move
0x80000000|1858, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 940
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 941
89,621, // "c"
90,621, // "l"
91,621, // "a"
92,621, // "s"
94,621, // "e"
95,621, // "b"
96,621, // "o"
97,621, // "n"
98,621, // "x"
99,621, // "t"
100,621, // "d"
101,621, // "v"
102,621, // "i"
103,621, // "w"
104,621, // "h"
105,621, // "f"
106,621, // "r"
107,621, // "k"
108,621, // "u"
109,621, // "p"
110,621, // "y"
111,621, // "m"
112,621, // "g"
113,621, // "z"
115,621, // "!"
116,621, // "="
117,621, // "<"
118,621, // ">"
119,621, // "+"
120,621, // "-"
121,621, // "*"
122,621, // "%"
123,621, // "&"
124,621, // "("
125,621, // ")"
126,621, // "{"
127,621, // "}"
128,621, // "["
129,621, // "]"
130,621, // "|"
131,621, // "."
132,621, // ","
133,621, // ":"
134,621, // ";"
136,621, // "/"
141,621, // "0"
142,621, // "X"
144,621, // {"1".."7"}
150,621, // {"A".."F"}
156,621, // " "
157,621, // {"8".."9"}
158,621, // {"G".."W" "Y".."Z" "j" "q"}
159,621, // "_"
160,621, // {"#".."$" "?".."@" "^" "`" "~"}
161,621, // "'"
162,621, // '"'
170,621, // "\"
177,621, // {9 12}
  }
,
{ // state 942
103,761, // "w"
  }
,
{ // state 943
0x80000000|935, // match move
0x80000000|1804, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 944
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 945
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 946
89,826, // "c"
90,826, // "l"
91,826, // "a"
92,826, // "s"
94,826, // "e"
95,826, // "b"
96,826, // "o"
97,826, // "n"
98,826, // "x"
99,826, // "t"
100,826, // "d"
101,826, // "v"
102,826, // "i"
103,826, // "w"
104,826, // "h"
105,826, // "f"
106,826, // "r"
107,826, // "k"
108,826, // "u"
109,826, // "p"
110,826, // "y"
111,826, // "m"
112,826, // "g"
113,826, // "z"
115,826, // "!"
116,826, // "="
117,826, // "<"
118,826, // ">"
119,826, // "+"
120,826, // "-"
121,482, // "*"
122,826, // "%"
123,826, // "&"
124,826, // "("
125,826, // ")"
126,826, // "{"
127,826, // "}"
128,826, // "["
129,826, // "]"
130,826, // "|"
131,826, // "."
132,826, // ","
133,826, // ":"
134,826, // ";"
136,613, // "/"
141,826, // "0"
142,826, // "X"
144,826, // {"1".."7"}
150,826, // {"A".."F"}
156,826, // " "
157,826, // {"8".."9"}
158,826, // {"G".."W" "Y".."Z" "j" "q"}
159,826, // "_"
160,826, // {"#".."$" "?".."@" "^" "`" "~"}
161,826, // "'"
162,826, // '"'
170,826, // "\"
178,1597, // eol
182,1461, // star
183,330, // slash
184,26, // slash_star
185,1856, // comment_printable
186,493, // comment_stuff
187,854, // comment_stuff**
188,1297, // {10}
189,1651, // {13}
195,653, // comment_stuff*
  }
,
{ // state 947
0x80000000|1, // match move
0x80000000|1881, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 948
89,1190, // "c"
90,1190, // "l"
91,1190, // "a"
92,1190, // "s"
94,1190, // "e"
95,1190, // "b"
96,1190, // "o"
97,1190, // "n"
98,1190, // "x"
99,1190, // "t"
100,1190, // "d"
101,1190, // "v"
102,1190, // "i"
103,1190, // "w"
104,1190, // "h"
105,1190, // "f"
106,1190, // "r"
107,1190, // "k"
108,1190, // "u"
109,1190, // "p"
110,1190, // "y"
111,1190, // "m"
112,1190, // "g"
113,1190, // "z"
115,1190, // "!"
116,1190, // "="
117,1190, // "<"
118,1190, // ">"
119,1190, // "+"
120,1190, // "-"
121,1190, // "*"
122,1190, // "%"
123,1190, // "&"
124,1190, // "("
125,1190, // ")"
126,1190, // "{"
127,1190, // "}"
128,1190, // "["
129,1190, // "]"
130,1190, // "|"
131,1190, // "."
132,1190, // ","
133,1190, // ":"
134,1190, // ";"
136,1190, // "/"
141,1190, // "0"
142,1190, // "X"
144,1190, // {"1".."7"}
150,1190, // {"A".."F"}
156,1190, // " "
157,1190, // {"8".."9"}
158,1190, // {"G".."W" "Y".."Z" "j" "q"}
159,1190, // "_"
160,1190, // {"#".."$" "?".."@" "^" "`" "~"}
161,1190, // "'"
162,1190, // '"'
170,1190, // "\"
177,1190, // {9 12}
180,1511, // single_printable
  }
,
{ // state 949
94,1031, // "e"
  }
,
{ // state 950
2,1872, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 951
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 952
99,1041, // "t"
  }
,
{ // state 953
0x80000000|454, // match move
0x80000000|1125, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 954
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 955
0x80000000|1, // match move
0x80000000|127, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 956
0x80000000|164, // match move
0x80000000|594, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 957
108,1883, // "u"
  }
,
{ // state 958
2,1608, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 959
102,566, // "i"
  }
,
{ // state 960
MIN_REDUCTION+389, // (default reduction)
  }
,
{ // state 961
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 962
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 963
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 964
116,484, // "="
  }
,
{ // state 965
0x80000000|982, // match move
0x80000000|649, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 966
0x80000000|1, // match move
0x80000000|1282, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 967
91,1408, // "a"
  }
,
{ // state 968
90,1071, // "l"
91,1534, // "a"
96,12, // "o"
104,250, // "h"
  }
,
{ // state 969
0x80000000|303, // match move
0x80000000|666, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 970
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 971
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 972
0x80000000|1, // match move
0x80000000|1773, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 973
MIN_REDUCTION+353, // (default reduction)
  }
,
{ // state 974
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 975
106,1072, // "r"
  }
,
{ // state 976
0x80000000|592, // match move
0x80000000|1367, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 977
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 978
2,1829, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 979
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 980
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+93, // $NT
  }
,
{ // state 981
89,1194, // "c"
90,1194, // "l"
91,1194, // "a"
92,1194, // "s"
94,1194, // "e"
95,1194, // "b"
96,1194, // "o"
97,1194, // "n"
98,1194, // "x"
99,1194, // "t"
100,1194, // "d"
101,1194, // "v"
102,1194, // "i"
103,1194, // "w"
104,1194, // "h"
105,1194, // "f"
106,1194, // "r"
107,1194, // "k"
108,1194, // "u"
109,1194, // "p"
110,1194, // "y"
111,1194, // "m"
112,1194, // "g"
113,1194, // "z"
115,1194, // "!"
116,1194, // "="
117,1194, // "<"
118,1194, // ">"
119,1194, // "+"
120,1194, // "-"
121,1194, // "*"
122,1194, // "%"
123,1194, // "&"
124,1194, // "("
125,1194, // ")"
126,1194, // "{"
127,1194, // "}"
128,1194, // "["
129,1194, // "]"
130,1194, // "|"
131,1194, // "."
132,1194, // ","
133,1194, // ":"
134,1194, // ";"
136,1194, // "/"
141,1194, // "0"
142,1194, // "X"
144,1194, // {"1".."7"}
150,1194, // {"A".."F"}
156,1194, // " "
157,1194, // {"8".."9"}
158,1194, // {"G".."W" "Y".."Z" "j" "q"}
159,1194, // "_"
160,1194, // {"#".."$" "?".."@" "^" "`" "~"}
161,1194, // "'"
162,1194, // '"'
170,1194, // "\"
  }
,
{ // state 982
2,1105, // white*
135,1629, // comment
176,1084, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 983
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 984
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 985
MIN_REDUCTION+344, // (default reduction)
  }
,
{ // state 986
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 987
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 988
2,1292, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 989
MIN_REDUCTION+352, // (default reduction)
  }
,
{ // state 990
108,809, // "u"
  }
,
{ // state 991
0x80000000|546, // match move
0x80000000|218, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 992
97,1465, // "n"
  }
,
{ // state 993
0x80000000|1512, // match move
0x80000000|417, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 994
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 995
136,1208, // "/"
179,1046, // ds
  }
,
{ // state 996
0x80000000|615, // match move
0x80000000|1219, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 997
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 998
2,1671, // white*
135,1629, // comment
176,1084, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 999
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 1000
89,1640, // "c"
90,1640, // "l"
91,1640, // "a"
92,1640, // "s"
93,956, // idChar
94,1640, // "e"
95,1640, // "b"
96,1640, // "o"
97,1640, // "n"
98,1640, // "x"
99,1640, // "t"
100,1640, // "d"
101,1640, // "v"
102,1640, // "i"
103,1640, // "w"
104,1640, // "h"
105,1640, // "f"
106,1640, // "r"
107,1640, // "k"
108,1640, // "u"
109,1640, // "p"
110,1640, // "y"
111,1640, // "m"
112,1640, // "g"
113,1640, // "z"
138,499, // letter
139,711, // idChar**
141,460, // "0"
142,1640, // "X"
144,460, // {"1".."7"}
149,316, // digit
150,1640, // {"A".."F"}
157,460, // {"8".."9"}
158,1640, // {"G".."W" "Y".."Z" "j" "q"}
159,296, // "_"
194,495, // idChar*
  }
,
{ // state 1001
2,832, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 1002
0x80000000|435, // match move
0x80000000|752, // no-match move
0x80000000|1115, // NT-test-match state for hex_digit
  }
,
{ // state 1003
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 1004
0x80000000|796, // match move
0x80000000|1454, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1005
0x80000000|940, // match move
0x80000000|1159, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1006
0x80000000|1483, // match move
0x80000000|23, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1007
92,596, // "s"
  }
,
{ // state 1008
104,1716, // "h"
106,1612, // "r"
  }
,
{ // state 1009
106,457, // "r"
  }
,
{ // state 1010
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 1011
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 1012
159,MIN_REDUCTION+351, // "_"
160,MIN_REDUCTION+351, // {"#".."$" "?".."@" "^" "`" "~"}
170,MIN_REDUCTION+351, // "\"
181,MIN_REDUCTION+351, // single_printable**
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 1013
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 1014
MIN_REDUCTION+384, // (default reduction)
  }
,
{ // state 1015
0x80000000|285, // match move
0x80000000|896, // no-match move
0x80000000|112, // NT-test-match state for comment_stuff
  }
,
{ // state 1016
2,1634, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 1017
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 1018
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 1019
0x80000000|229, // match move
0x80000000|86, // no-match move
0x80000000|1115, // NT-test-match state for hex_digit
  }
,
{ // state 1020
96,1287, // "o"
  }
,
{ // state 1021
0x80000000|1094, // match move
0x80000000|822, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1022
0x80000000|96, // match move
0x80000000|261, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1023
2,1742, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 1024
0x80000000|1116, // match move
0x80000000|1410, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1025
94,353, // "e"
  }
,
{ // state 1026
MIN_REDUCTION+360, // (default reduction)
  }
,
{ // state 1027
2,421, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+396, // (default reduction)
  }
,
{ // state 1028
91,625, // "a"
  }
,
{ // state 1029
MIN_REDUCTION+368, // (default reduction)
  }
,
{ // state 1030
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 1031
91,1456, // "a"
  }
,
{ // state 1032
0x80000000|1, // match move
0x80000000|789, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1033
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 1034
2,380, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 1035
92,1602, // "s"
  }
,
{ // state 1036
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+181, // $NT
  }
,
{ // state 1037
MIN_REDUCTION+373, // (default reduction)
  }
,
{ // state 1038
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 1039
MIN_REDUCTION+344, // (default reduction)
  }
,
{ // state 1040
96,1236, // "o"
  }
,
{ // state 1041
0x80000000|1, // match move
0x80000000|1197, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1042
99,1161, // "t"
  }
,
{ // state 1043
0x80000000|1, // match move
0x80000000|1639, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1044
92,1343, // "s"
  }
,
{ // state 1045
2,360, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 1046
0x80000000|881, // match move
0x80000000|1421, // no-match move
0x80000000|941, // NT-test-match state for single_printable
  }
,
{ // state 1047
94,1532, // "e"
  }
,
{ // state 1048
109,1196, // "p"
  }
,
{ // state 1049
0x80000000|1056, // match move
0x80000000|953, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1050
198,MIN_REDUCTION+349, // $NT
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 1051
4,1206, // token
5,1263, // `boolean
6,1847, // `class
7,1293, // `extends
8,1357, // `void
9,945, // `int
10,1546, // `while
11,1318, // `if
12,1797, // `else
13,103, // `for
14,712, // `break
15,1688, // `this
16,1157, // `false
17,1130, // `true
18,1515, // `super
19,984, // `null
20,1749, // `return
21,292, // `instanceof
22,636, // `new
23,391, // `abstract
24,1093, // `assert
25,1003, // `byte
26,1466, // `case
27,635, // `catch
28,1545, // `char
29,1011, // `const
30,1271, // `continue
31,637, // `default
32,707, // `do
33,759, // `double
34,1739, // `enum
35,1378, // `final
36,814, // `finally
37,1880, // `float
38,1207, // `goto
39,1033, // `implements
40,1379, // `import
41,1601, // `interface
42,300, // `long
43,1430, // `native
44,220, // `package
45,166, // `private
46,1768, // `protected
47,1360, // `public
48,93, // `short
49,36, // `static
50,1272, // `strictfp
51,1416, // `switch
52,1457, // `synchronized
53,1656, // `throw
54,1724, // `throws
55,206, // `transient
56,1281, // `try
57,581, // `volatile
  }
,
{ // state 1052
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 1053
2,1819, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 1054
198,MIN_REDUCTION+230, // $NT
  }
,
{ // state 1055
0x80000000|1673, // match move
0x80000000|246, // no-match move
0x80000000|112, // NT-test-match state for comment_stuff
  }
,
{ // state 1056
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 1057
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 1058
0x80000000|545, // match move
0x80000000|40, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1059
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 1060
0x80000000|1452, // match move
0x80000000|1168, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1061
2,831, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 1062
2,418, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 1063
102,1795, // "i"
  }
,
{ // state 1064
0x80000000|123, // match move
0x80000000|876, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1065
2,1438, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 1066
99,1598, // "t"
  }
,
{ // state 1067
100,1782, // "d"
  }
,
{ // state 1068
99,1213, // "t"
103,142, // "w"
104,1098, // "h"
108,1156, // "u"
110,452, // "y"
  }
,
{ // state 1069
94,915, // "e"
  }
,
{ // state 1070
0x80000000|466, // match move
0x80000000|117, // no-match move
0x80000000|1446, // NT-test-match state for reserved
  }
,
{ // state 1071
91,1518, // "a"
  }
,
{ // state 1072
0x80000000|1, // match move
0x80000000|77, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1073
-1, // $$start
-1, // start
-1, // white*
4, // $$0
1631, // token
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
678, // `!
866, // `!=
1648, // `%
365, // `&&
1808, // `*
677, // `(
844, // `)
1087, // `{
1551, // `}
55, // `-
242, // `+
1787, // `=
53, // `==
1524, // `[
341, // `]
1227, // `||
650, // `<
531, // `<=
1311, // `,
1388, // `>
1702, // `>=
983, // `.
225, // `;
1717, // `++
683, // `--
804, // `/
1825, // `:
608, // ID
1714, // INT_LITERAL
1332, // STRING_LITERAL
1700, // CHARACTER_LITERAL
756, // "c"
756, // "l"
756, // "a"
756, // "s"
-1, // idChar
756, // "e"
756, // "b"
756, // "o"
756, // "n"
756, // "x"
756, // "t"
756, // "d"
756, // "v"
756, // "i"
756, // "w"
756, // "h"
756, // "f"
756, // "r"
756, // "k"
756, // "u"
756, // "p"
756, // "y"
756, // "m"
756, // "g"
756, // "z"
-1, // reserved
1652, // "!"
180, // "="
1479, // "<"
165, // ">"
769, // "+"
680, // "-"
301, // "*"
1417, // "%"
504, // "&"
33, // "("
175, // ")"
1224, // "{"
525, // "}"
363, // "["
1520, // "]"
747, // "|"
1004, // "."
570, // ","
1109, // ":"
965, // ";"
-1, // comment
1090, // "/"
1270, // identifier
522, // letter
-1, // idChar**
-1, // oct_start
362, // "0"
756, // "X"
-1, // oct_digit
362, // {"1".."7"}
-1, // oct_literal
-1, // oct_digit++
-1, // hex_start
-1, // hex_digit
1141, // digit
756, // {"A".."F"}
-1, // hex_literal
-1, // hex_digit++
-1, // printable
519, // digit++
-1, // character_printable
1344, // " "
362, // {"8".."9"}
756, // {"G".."W" "Y".."Z" "j" "q"}
-1, // "_"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
601, // "'"
970, // '"'
-1, // back_back
-1, // back_dquote
-1, // back_squote
-1, // back_n
-1, // back_tab
-1, // back_form
-1, // back_return
-1, // "\"
679, // dq
-1, // stringChar
-1, // stringChar*
-1, // $$1
741, // sq
639, // white
1344, // {9 12}
1644, // eol
-1, // ds
-1, // single_printable
-1, // single_printable**
-1, // star
-1, // slash
-1, // slash_star
-1, // comment_printable
-1, // comment_stuff
-1, // comment_stuff**
1659, // {10}
479, // {13}
1459, // token*
541, // digit+
-1, // oct_digit+
-1, // hex_digit+
-1, // idChar*
-1, // comment_stuff*
-1, // single_printable*
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 1074
0x80000000|1, // match move
0x80000000|1650, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1075
90,1713, // "l"
  }
,
{ // state 1076
96,407, // "o"
  }
,
{ // state 1077
89,1032, // "c"
  }
,
{ // state 1078
2,589, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 1079
2,1336, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 1080
0x80000000|1, // match move
0x80000000|204, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1081
0x80000000|1, // match move
0x80000000|798, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1082
0x80000000|1, // match move
0x80000000|307, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1083
108,1304, // "u"
  }
,
{ // state 1084
MIN_REDUCTION+380, // (default reduction)
  }
,
{ // state 1085
2,1105, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 1086
2,1006, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 1087
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 1088
91,1576, // "a"
  }
,
{ // state 1089
89,1748, // "c"
90,1748, // "l"
91,1748, // "a"
92,1748, // "s"
94,1748, // "e"
95,1748, // "b"
96,1748, // "o"
97,1748, // "n"
98,1748, // "x"
99,1748, // "t"
100,1748, // "d"
101,1748, // "v"
102,1748, // "i"
103,1748, // "w"
104,1748, // "h"
105,1748, // "f"
106,1748, // "r"
107,1748, // "k"
108,1748, // "u"
109,1748, // "p"
110,1748, // "y"
111,1748, // "m"
112,1748, // "g"
113,1748, // "z"
115,1748, // "!"
116,1748, // "="
117,1748, // "<"
118,1748, // ">"
119,1748, // "+"
120,1748, // "-"
121,1748, // "*"
122,1748, // "%"
123,1748, // "&"
124,1748, // "("
125,1748, // ")"
126,1748, // "{"
127,1748, // "}"
128,1748, // "["
129,1748, // "]"
130,1748, // "|"
131,1748, // "."
132,1748, // ","
133,1748, // ":"
134,1748, // ";"
136,1748, // "/"
141,1748, // "0"
142,1748, // "X"
144,1748, // {"1".."7"}
150,1748, // {"A".."F"}
155,532, // character_printable
156,1748, // " "
157,1748, // {"8".."9"}
158,1748, // {"G".."W" "Y".."Z" "j" "q"}
159,1748, // "_"
160,1748, // {"#".."$" "?".."@" "^" "`" "~"}
161,1748, // "'"
162,1748, // '"'
163,453, // back_back
164,30, // back_dquote
165,1711, // back_squote
166,585, // back_n
167,50, // back_tab
168,297, // back_form
169,1875, // back_return
170,579, // "\"
172,44, // stringChar
174,475, // $$1
  }
,
{ // state 1090
0x80000000|1581, // match move
0x80000000|825, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1091
0x80000000|327, // match move
0x80000000|986, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1092
0x80000000|395, // match move
0x80000000|576, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1093
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 1094
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 1095
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 1096
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+149, // $NT
  }
,
{ // state 1097
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 1098
96,694, // "o"
  }
,
{ // state 1099
2,215, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+90, // $NT
  }
,
{ // state 1100
0x80000000|987, // match move
0x80000000|543, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1101
94,1802, // "e"
  }
,
{ // state 1102
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 1103
90,936, // "l"
96,1255, // "o"
  }
,
{ // state 1104
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+157, // $NT
  }
,
{ // state 1105
0x80000000|1503, // match move
0x80000000|410, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1106
92,195, // "s"
99,111, // "t"
  }
,
{ // state 1107
94,440, // "e"
  }
,
{ // state 1108
2,1235, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 1109
0x80000000|448, // match move
0x80000000|191, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1110
0x80000000|551, // match move
0x80000000|216, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1111
99,311, // "t"
  }
,
{ // state 1112
0x80000000|109, // match move
0x80000000|627, // no-match move
0x80000000|941, // NT-test-match state for single_printable
  }
,
{ // state 1113
198,MIN_REDUCTION+385, // $NT
MIN_REDUCTION+385, // (default reduction)
  }
,
{ // state 1114
MIN_REDUCTION+385, // (default reduction)
  }
,
{ // state 1115
89,469, // "c"
91,469, // "a"
94,469, // "e"
95,469, // "b"
100,469, // "d"
105,469, // "f"
141,342, // "0"
144,342, // {"1".."7"}
149,302, // digit
150,469, // {"A".."F"}
157,342, // {"8".."9"}
  }
,
{ // state 1116
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 1117
0x80000000|772, // match move
0x80000000|1735, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1118
2,980, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+94, // $NT
  }
,
{ // state 1119
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 1120
99,1300, // "t"
  }
,
{ // state 1121
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 1122
96,1237, // "o"
  }
,
{ // state 1123
111,1200, // "m"
  }
,
{ // state 1124
89,1289, // "c"
  }
,
{ // state 1125
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 1126
MIN_REDUCTION+392, // (default reduction)
  }
,
{ // state 1127
99,255, // "t"
  }
,
{ // state 1128
0x80000000|1, // match move
0x80000000|153, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1129
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 1130
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 1131
111,1308, // "m"
  }
,
{ // state 1132
2,100, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 1133
2,1314, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+166, // $NT
  }
,
{ // state 1134
94,1155, // "e"
  }
,
{ // state 1135
MIN_REDUCTION+378, // (default reduction)
  }
,
{ // state 1136
0x80000000|1, // match move
0x80000000|1174, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1137
141,1384, // "0"
144,1384, // {"1".."7"}
  }
,
{ // state 1138
91,668, // "a"
94,610, // "e"
108,24, // "u"
  }
,
{ // state 1139
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 1140
MIN_REDUCTION+365, // (default reduction)
  }
,
{ // state 1141
0x80000000|845, // match move
0x80000000|782, // no-match move
0x80000000|91, // NT-test-match state for digit
  }
,
{ // state 1142
0x80000000|1169, // match move
0x80000000|640, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1143
0x80000000|558, // match move
0x80000000|1262, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1144
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 1145
0x80000000|948, // match move
0x80000000|1471, // no-match move
0x80000000|941, // NT-test-match state for single_printable
  }
,
{ // state 1146
2,1730, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 1147
94,1529, // "e"
  }
,
{ // state 1148
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 1149
0x80000000|79, // match move
0x80000000|1228, // no-match move
0x80000000|1115, // NT-test-match state for hex_digit
  }
,
{ // state 1150
0x80000000|1, // match move
0x80000000|1179, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1151
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 1152
181,92, // single_printable**
196,764, // single_printable*
MIN_REDUCTION+354, // (default reduction)
  }
,
{ // state 1153
188,1302, // {10}
  }
,
{ // state 1154
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+173, // $NT
  }
,
{ // state 1155
0x80000000|1, // match move
0x80000000|1618, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1156
109,1567, // "p"
  }
,
{ // state 1157
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 1158
102,892, // "i"
  }
,
{ // state 1159
0x80000000|622, // match move
0x80000000|236, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1160
89,571, // "c"
  }
,
{ // state 1161
0x80000000|1, // match move
0x80000000|1180, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1162
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+109, // $NT
  }
,
{ // state 1163
116,926, // "="
  }
,
{ // state 1164
0x80000000|1731, // match move
0x80000000|1888, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1165
2,1809, // white*
135,1629, // comment
176,1084, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 1166
91,1316, // "a"
  }
,
{ // state 1167
99,264, // "t"
  }
,
{ // state 1168
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 1169
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 1170
198,MIN_REDUCTION+225, // $NT
  }
,
{ // state 1171
136,80, // "/"
  }
,
{ // state 1172
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+153, // (default reduction)
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
{ // state 1173
0x80000000|422, // match move
0x80000000|1541, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1174
0x80000000|1442, // match move
0x80000000|727, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1175
100,1705, // "d"
  }
,
{ // state 1176
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 1177
198,MIN_REDUCTION+226, // $NT
  }
,
{ // state 1178
0x80000000|849, // match move
0x80000000|1395, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1179
0x80000000|1016, // match move
0x80000000|879, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1180
0x80000000|67, // match move
0x80000000|1710, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1181
0x80000000|1626, // match move
0x80000000|449, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1182
99,438, // "t"
  }
,
{ // state 1183
0x80000000|1850, // match move
0x80000000|682, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1184
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+185, // $NT
  }
,
{ // state 1185
198,MIN_REDUCTION+227, // $NT
  }
,
{ // state 1186
198,MIN_REDUCTION+353, // $NT
MIN_REDUCTION+353, // (default reduction)
  }
,
{ // state 1187
96,1740, // "o"
  }
,
{ // state 1188
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+103, // $NT
  }
,
{ // state 1189
198,MIN_REDUCTION+368, // $NT
MIN_REDUCTION+368, // (default reduction)
  }
,
{ // state 1190
0x80000000|477, // match move
0x80000000|1815, // no-match move
0x80000000|941, // NT-test-match state for single_printable
  }
,
{ // state 1191
91,515, // "a"
106,701, // "r"
108,1242, // "u"
  }
,
{ // state 1192
198,MIN_REDUCTION+216, // $NT
  }
,
{ // state 1193
0x80000000|1371, // match move
0x80000000|1822, // no-match move
0x80000000|1115, // NT-test-match state for hex_digit
  }
,
{ // state 1194
198,MIN_REDUCTION+369, // $NT
  }
,
{ // state 1195
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 1196
0x80000000|1, // match move
0x80000000|1301, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1197
0x80000000|1628, // match move
0x80000000|861, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1198
106,1759, // "r"
  }
,
{ // state 1199
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+151, // $NT
  }
,
{ // state 1200
0x80000000|1, // match move
0x80000000|1401, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1201
0x80000000|1239, // match move
0x80000000|628, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1202
198,MIN_REDUCTION+368, // $NT
  }
,
{ // state 1203
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+183, // $NT
  }
,
{ // state 1204
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+117, // $NT
  }
,
{ // state 1205
0x80000000|389, // match move
0x80000000|496, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1206
MIN_REDUCTION+370, // (default reduction)
  }
,
{ // state 1207
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 1208
121,1429, // "*"
136,1230, // "/"
  }
,
{ // state 1209
MIN_REDUCTION+375, // (default reduction)
  }
,
{ // state 1210
2,1698, // white*
135,1629, // comment
176,1084, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 1211
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 1212
89,1784, // "c"
  }
,
{ // state 1213
91,409, // "a"
106,705, // "r"
  }
,
{ // state 1214
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 1215
198,MIN_REDUCTION+384, // $NT
  }
,
{ // state 1216
94,642, // "e"
  }
,
{ // state 1217
0x80000000|1, // match move
0x80000000|361, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1218
0x80000000|629, // match move
0x80000000|56, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1219
2,1389, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 1220
0x80000000|133, // match move
0x80000000|331, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1221
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 1222
0x80000000|76, // match move
0x80000000|1832, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1223
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 1224
0x80000000|998, // match move
0x80000000|1458, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1225
136,606, // "/"
  }
,
{ // state 1226
94,405, // "e"
  }
,
{ // state 1227
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 1228
MIN_REDUCTION+388, // (default reduction)
  }
,
{ // state 1229
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 1230
0x80000000|109, // match move
0x80000000|424, // no-match move
0x80000000|941, // NT-test-match state for single_printable
  }
,
{ // state 1231
104,1198, // "h"
  }
,
{ // state 1232
0x80000000|1616, // match move
0x80000000|1729, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1233
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+123, // $NT
  }
,
{ // state 1234
141,1390, // "0"
143,1620, // oct_digit
144,1390, // {"1".."7"}
146,49, // oct_digit++
192,795, // oct_digit+
  }
,
{ // state 1235
0x80000000|813, // match move
0x80000000|1423, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1236
105,780, // "f"
  }
,
{ // state 1237
97,544, // "n"
  }
,
{ // state 1238
2,582, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+114, // $NT
  }
,
{ // state 1239
2,1502, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 1240
2,116, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 1241
2,624, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 1242
95,1549, // "b"
  }
,
{ // state 1243
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 1244
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 1245
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 1246
0x80000000|1666, // match move
0x80000000|1468, // no-match move
0x80000000|112, // NT-test-match state for comment_stuff
  }
,
{ // state 1247
0x80000000|232, // match move
0x80000000|553, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1248
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 1249
97,709, // "n"
  }
,
{ // state 1250
2,360, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 1251
0x80000000|304, // match move
0x80000000|1010, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1252
97,137, // "n"
  }
,
{ // state 1253
0x80000000|1, // match move
0x80000000|321, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1254
MIN_REDUCTION+384, // (default reduction)
  }
,
{ // state 1255
106,494, // "r"
  }
,
{ // state 1256
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+147, // $NT
  }
,
{ // state 1257
2,347, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+130, // $NT
  }
,
{ // state 1258
0x80000000|669, // match move
0x80000000|105, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1259
0x80000000|1132, // match move
0x80000000|473, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1260
0x80000000|1681, // match move
0x80000000|817, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1261
198,MIN_REDUCTION+222, // $NT
  }
,
{ // state 1262
2,846, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 1263
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 1264
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 1265
198,MIN_REDUCTION+381, // $NT
MIN_REDUCTION+381, // (default reduction)
  }
,
{ // state 1266
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 1267
0x80000000|1321, // match move
0x80000000|115, // no-match move
0x80000000|112, // NT-test-match state for comment_stuff
  }
,
{ // state 1268
2,1256, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+148, // $NT
  }
,
{ // state 1269
0x80000000|463, // match move
0x80000000|146, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1270
0x80000000|1210, // match move
0x80000000|1181, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1271
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 1272
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 1273
90,1323, // "l"
  }
,
{ // state 1274
3,4, // $$0
4,1631, // token
5,1263, // `boolean
6,1847, // `class
7,1293, // `extends
8,1357, // `void
9,945, // `int
10,1546, // `while
11,1318, // `if
12,1797, // `else
13,103, // `for
14,712, // `break
15,1688, // `this
16,1157, // `false
17,1130, // `true
18,1515, // `super
19,984, // `null
20,1749, // `return
21,292, // `instanceof
22,636, // `new
23,391, // `abstract
24,1093, // `assert
25,1003, // `byte
26,1466, // `case
27,635, // `catch
28,1545, // `char
29,1011, // `const
30,1271, // `continue
31,637, // `default
32,707, // `do
33,759, // `double
34,1739, // `enum
35,1378, // `final
36,814, // `finally
37,1880, // `float
38,1207, // `goto
39,1033, // `implements
40,1379, // `import
41,1601, // `interface
42,300, // `long
43,1430, // `native
44,220, // `package
45,166, // `private
46,1768, // `protected
47,1360, // `public
48,93, // `short
49,36, // `static
50,1272, // `strictfp
51,1416, // `switch
52,1457, // `synchronized
53,1656, // `throw
54,1724, // `throws
55,206, // `transient
56,1281, // `try
57,581, // `volatile
190,1459, // token*
  }
,
{ // state 1275
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 1276
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 1277
0x80000000|533, // match move
0x80000000|1086, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1278
198,MIN_REDUCTION+208, // $NT
  }
,
{ // state 1279
MIN_REDUCTION+345, // (default reduction)
  }
,
{ // state 1280
2,116, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 1281
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 1282
0x80000000|829, // match move
0x80000000|1484, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1283
0x80000000|1, // match move
0x80000000|335, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1284
0x80000000|1, // match move
0x80000000|329, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1285
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 1286
0x80000000|719, // match move
0x80000000|1089, // no-match move
0x80000000|1464, // NT-test-match state for dq
  }
,
{ // state 1287
97,1413, // "n"
  }
,
{ // state 1288
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+133, // $NT
  }
,
{ // state 1289
104,81, // "h"
  }
,
{ // state 1290
2,1288, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+134, // $NT
  }
,
{ // state 1291
116,144, // "="
  }
,
{ // state 1292
0x80000000|591, // match move
0x80000000|1593, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1293
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 1294
198,MIN_REDUCTION+198, // $NT
  }
,
{ // state 1295
1,520, // start
2,754, // white*
3,118, // $$0
4,1631, // token
58,678, // `!
59,866, // `!=
60,1648, // `%
61,365, // `&&
62,1808, // `*
63,677, // `(
64,844, // `)
65,1087, // `{
66,1551, // `}
67,55, // `-
68,242, // `+
69,1787, // `=
70,53, // `==
71,1524, // `[
72,341, // `]
73,1227, // `||
74,650, // `<
75,531, // `<=
76,1311, // `,
77,1388, // `>
78,1702, // `>=
79,983, // `.
80,225, // `;
81,1717, // `++
82,683, // `--
83,804, // `/
84,1825, // `:
85,608, // ID
86,1714, // INT_LITERAL
87,1332, // STRING_LITERAL
88,1700, // CHARACTER_LITERAL
135,1244, // comment
137,1270, // identifier
138,522, // letter
140,1234, // oct_start
141,1553, // "0"
145,905, // oct_literal
147,878, // hex_start
151,827, // hex_literal
171,679, // dq
175,741, // sq
176,147, // white
178,1644, // eol
179,458, // ds
190,1459, // token*
  }
,
{ // state 1296
2,860, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 1297
0x80000000|1778, // match move
0x80000000|1299, // no-match move
0x80000000|112, // NT-test-match state for comment_stuff
  }
,
{ // state 1298
95,836, // "b"
  }
,
{ // state 1299
MIN_REDUCTION+366, // (default reduction)
  }
,
{ // state 1300
94,150, // "e"
  }
,
{ // state 1301
0x80000000|748, // match move
0x80000000|1443, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1302
MIN_REDUCTION+367, // (default reduction)
  }
,
{ // state 1303
97,1136, // "n"
  }
,
{ // state 1304
106,577, // "r"
  }
,
{ // state 1305
0x80000000|1770, // match move
0x80000000|122, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1306
106,771, // "r"
  }
,
{ // state 1307
0x80000000|1873, // match move
0x80000000|315, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1308
94,1309, // "e"
  }
,
{ // state 1309
97,1579, // "n"
  }
,
{ // state 1310
92,1400, // "s"
99,1764, // "t"
  }
,
{ // state 1311
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 1312
198,MIN_REDUCTION+364, // $NT
MIN_REDUCTION+364, // (default reduction)
  }
,
{ // state 1313
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 1314
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+165, // $NT
  }
,
{ // state 1315
2,1557, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 1316
99,1080, // "t"
  }
,
{ // state 1317
2,1205, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 1318
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 1319
0x80000000|224, // match move
0x80000000|1223, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1320
0x80000000|1, // match move
0x80000000|1070, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1321
MIN_REDUCTION+367, // (default reduction)
  }
,
{ // state 1322
0x80000000|1359, // match move
0x80000000|62, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1323
0x80000000|394, // match move
0x80000000|1414, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1324
2,1204, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+118, // $NT
  }
,
{ // state 1325
MIN_REDUCTION+368, // (default reduction)
  }
,
{ // state 1326
136,39, // "/"
  }
,
{ // state 1327
198,MIN_REDUCTION+219, // $NT
  }
,
{ // state 1328
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+159, // $NT
  }
,
{ // state 1329
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+179, // $NT
  }
,
{ // state 1330
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 1331
0x80000000|1176, // match move
0x80000000|1441, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1332
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 1333
161,893, // "'"
175,120, // sq
  }
,
{ // state 1334
110,1552, // "y"
  }
,
{ // state 1335
MIN_REDUCTION+357, // (default reduction)
  }
,
{ // state 1336
0x80000000|840, // match move
0x80000000|1368, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1337
91,1760, // "a"
106,1542, // "r"
  }
,
{ // state 1338
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 1339
121,114, // "*"
  }
,
{ // state 1340
90,354, // "l"
91,207, // "a"
96,838, // "o"
102,143, // "i"
  }
,
{ // state 1341
2,348, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 1342
96,1075, // "o"
  }
,
{ // state 1343
94,947, // "e"
  }
,
{ // state 1344
MIN_REDUCTION+348, // (default reduction)
  }
,
{ // state 1345
0x80000000|1732, // match move
0x80000000|1189, // no-match move
// T-test match for 10:
188,
  }
,
{ // state 1346
108,1047, // "u"
  }
,
{ // state 1347
2,1608, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 1348
0x80000000|376, // match move
0x80000000|1331, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1349
89,1748, // "c"
90,1748, // "l"
91,1748, // "a"
92,1748, // "s"
94,1748, // "e"
95,1748, // "b"
96,1748, // "o"
97,1748, // "n"
98,1748, // "x"
99,1748, // "t"
100,1748, // "d"
101,1748, // "v"
102,1748, // "i"
103,1748, // "w"
104,1748, // "h"
105,1748, // "f"
106,1748, // "r"
107,1748, // "k"
108,1748, // "u"
109,1748, // "p"
110,1748, // "y"
111,1748, // "m"
112,1748, // "g"
113,1748, // "z"
115,1748, // "!"
116,1748, // "="
117,1748, // "<"
118,1748, // ">"
119,1748, // "+"
120,1748, // "-"
121,1748, // "*"
122,1748, // "%"
123,1748, // "&"
124,1748, // "("
125,1748, // ")"
126,1748, // "{"
127,1748, // "}"
128,1748, // "["
129,1748, // "]"
130,1748, // "|"
131,1748, // "."
132,1748, // ","
133,1748, // ":"
134,1748, // ";"
136,1748, // "/"
141,1748, // "0"
142,1748, // "X"
144,1748, // {"1".."7"}
150,1748, // {"A".."F"}
155,532, // character_printable
156,1748, // " "
157,1748, // {"8".."9"}
158,1748, // {"G".."W" "Y".."Z" "j" "q"}
159,1748, // "_"
160,1748, // {"#".."$" "?".."@" "^" "`" "~"}
161,1748, // "'"
162,1748, // '"'
163,453, // back_back
164,30, // back_dquote
165,1711, // back_squote
166,585, // back_n
167,50, // back_tab
168,297, // back_form
169,1875, // back_return
170,579, // "\"
172,1135, // stringChar
173,1286, // stringChar*
174,859, // $$1
  }
,
{ // state 1350
0x80000000|138, // match move
0x80000000|996, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1351
2,1232, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 1352
112,1501, // "g"
  }
,
{ // state 1353
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+119, // $NT
  }
,
{ // state 1354
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 1355
2,1438, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 1356
94,975, // "e"
  }
,
{ // state 1357
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 1358
198,MIN_REDUCTION+199, // $NT
  }
,
{ // state 1359
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 1360
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 1361
94,1480, // "e"
  }
,
{ // state 1362
198,MIN_REDUCTION+196, // $NT
  }
,
{ // state 1363
92,511, // "s"
  }
,
{ // state 1364
141,362, // "0"
144,362, // {"1".."7"}
149,1482, // digit
157,362, // {"8".."9"}
  }
,
{ // state 1365
89,702, // "c"
90,702, // "l"
91,702, // "a"
92,702, // "s"
94,702, // "e"
95,702, // "b"
96,702, // "o"
97,702, // "n"
98,702, // "x"
99,702, // "t"
100,702, // "d"
101,702, // "v"
102,702, // "i"
103,702, // "w"
104,702, // "h"
105,702, // "f"
106,702, // "r"
107,702, // "k"
108,702, // "u"
109,702, // "p"
110,702, // "y"
111,702, // "m"
112,702, // "g"
113,702, // "z"
115,702, // "!"
116,702, // "="
117,702, // "<"
118,702, // ">"
119,702, // "+"
120,702, // "-"
121,702, // "*"
122,702, // "%"
123,702, // "&"
124,702, // "("
125,702, // ")"
126,702, // "{"
127,702, // "}"
128,702, // "["
129,702, // "]"
130,702, // "|"
131,702, // "."
132,702, // ","
133,702, // ":"
134,702, // ";"
136,702, // "/"
141,702, // "0"
142,702, // "X"
144,702, // {"1".."7"}
150,702, // {"A".."F"}
156,702, // " "
157,702, // {"8".."9"}
158,702, // {"G".."W" "Y".."Z" "j" "q"}
159,702, // "_"
160,702, // {"#".."$" "?".."@" "^" "`" "~"}
161,702, // "'"
162,702, // '"'
170,702, // "\"
177,702, // {9 12}
180,687, // single_printable
  }
,
{ // state 1366
2,1516, // white*
135,1629, // comment
176,1084, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 1367
2,465, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 1368
0x80000000|198, // match move
0x80000000|1564, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1369
0x80000000|950, // match move
0x80000000|787, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1370
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+163, // $NT
  }
,
{ // state 1371
89,1002, // "c"
91,1002, // "a"
94,1002, // "e"
95,1002, // "b"
100,1002, // "d"
105,1002, // "f"
141,1019, // "0"
144,1019, // {"1".."7"}
148,830, // hex_digit
149,1584, // digit
150,1002, // {"A".."F"}
157,1019, // {"8".."9"}
  }
,
{ // state 1372
94,65, // "e"
  }
,
{ // state 1373
107,1514, // "k"
  }
,
{ // state 1374
99,646, // "t"
  }
,
{ // state 1375
MIN_REDUCTION+372, // (default reduction)
  }
,
{ // state 1376
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 1377
107,110, // "k"
  }
,
{ // state 1378
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 1379
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 1380
121,1055, // "*"
136,802, // "/"
  }
,
{ // state 1381
MIN_REDUCTION+364, // (default reduction)
  }
,
{ // state 1382
0x80000000|266, // match move
0x80000000|1172, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1383
0x80000000|720, // match move
0x80000000|1771, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1384
198,MIN_REDUCTION+307, // $NT
  }
,
{ // state 1385
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 1386
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 1387
0x80000000|1114, // match move
0x80000000|1453, // no-match move
0x80000000|941, // NT-test-match state for single_printable
  }
,
{ // state 1388
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 1389
0x80000000|11, // match move
0x80000000|1775, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1390
0x80000000|397, // match move
0x80000000|867, // no-match move
0x80000000|1137, // NT-test-match state for oct_digit
  }
,
{ // state 1391
188,1267, // {10}
  }
,
{ // state 1392
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 1393
2,880, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+168, // $NT
  }
,
{ // state 1394
0x80000000|1803, // match move
0x80000000|1021, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1395
0x80000000|1596, // match move
0x80000000|197, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1396
0x80000000|1, // match move
0x80000000|439, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1397
2,375, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 1398
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+111, // $NT
  }
,
{ // state 1399
94,1785, // "e"
96,1556, // "o"
  }
,
{ // state 1400
99,1643, // "t"
  }
,
{ // state 1401
0x80000000|717, // match move
0x80000000|1034, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1402
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 1403
0x80000000|871, // match move
0x80000000|1060, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1404
0x80000000|537, // match move
0x80000000|1243, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1405
181,973, // single_printable**
196,1665, // single_printable*
MIN_REDUCTION+354, // (default reduction)
  }
,
{ // state 1406
91,990, // "a"
  }
,
{ // state 1407
2,357, // white*
135,1629, // comment
176,1084, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 1408
112,1562, // "g"
  }
,
{ // state 1409
97,874, // "n"
  }
,
{ // state 1410
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 1411
99,923, // "t"
  }
,
{ // state 1412
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 1413
102,1860, // "i"
  }
,
{ // state 1414
2,1096, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+150, // $NT
  }
,
{ // state 1415
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 1416
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 1417
0x80000000|735, // match move
0x80000000|157, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1418
97,317, // "n"
  }
,
{ // state 1419
162,834, // '"'
171,298, // dq
173,1286, // stringChar*
174,859, // $$1
  }
,
{ // state 1420
96,659, // "o"
  }
,
{ // state 1421
181,258, // single_printable**
196,1145, // single_printable*
198,MIN_REDUCTION+354, // $NT
  }
,
{ // state 1422
2,860, // white*
135,1629, // comment
176,1084, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 1423
0x80000000|1030, // match move
0x80000000|645, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1424
0x80000000|1, // match move
0x80000000|660, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1425
0x80000000|366, // match move
0x80000000|962, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1426
2,548, // white*
135,1629, // comment
176,1084, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 1427
100,564, // "d"
  }
,
{ // state 1428
102,344, // "i"
  }
,
{ // state 1429
0x80000000|946, // match move
0x80000000|688, // no-match move
0x80000000|112, // NT-test-match state for comment_stuff
  }
,
{ // state 1430
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 1431
121,1766, // "*"
  }
,
{ // state 1432
2,1142, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 1433
0x80000000|1736, // match move
0x80000000|906, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1434
0x80000000|1052, // match move
0x80000000|614, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1435
91,904, // "a"
106,1734, // "r"
108,1298, // "u"
  }
,
{ // state 1436
99,241, // "t"
  }
,
{ // state 1437
119,160, // "+"
  }
,
{ // state 1438
0x80000000|1755, // match move
0x80000000|1433, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1439
91,252, // "a"
  }
,
{ // state 1440
2,3, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 1441
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 1442
2,1064, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 1443
2,14, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 1444
89,1640, // "c"
90,1640, // "l"
91,1640, // "a"
92,1640, // "s"
93,1794, // idChar
94,1640, // "e"
95,1640, // "b"
96,1640, // "o"
97,1640, // "n"
98,1640, // "x"
99,1640, // "t"
100,1640, // "d"
101,1640, // "v"
102,1640, // "i"
103,1640, // "w"
104,1640, // "h"
105,1640, // "f"
106,1640, // "r"
107,1640, // "k"
108,1640, // "u"
109,1640, // "p"
110,1640, // "y"
111,1640, // "m"
112,1640, // "g"
113,1640, // "z"
138,499, // letter
141,460, // "0"
142,1640, // "X"
144,460, // {"1".."7"}
149,316, // digit
150,1640, // {"A".."F"}
157,460, // {"8".."9"}
158,1640, // {"G".."W" "Y".."Z" "j" "q"}
159,296, // "_"
  }
,
{ // state 1445
91,54, // "a"
  }
,
{ // state 1446
5,74, // `boolean
6,156, // `class
7,1294, // `extends
8,1358, // `void
9,855, // `int
10,768, // `while
11,775, // `if
12,1362, // `else
13,70, // `for
14,37, // `break
15,21, // `this
16,811, // `false
17,556, // `true
18,1278, // `super
19,560, // `null
20,648, // `return
21,743, // `instanceof
22,1876, // `new
23,1536, // `abstract
24,535, // `assert
25,824, // `byte
26,1192, // `case
27,1864, // `catch
28,865, // `char
29,1327, // `const
30,132, // `continue
31,563, // `default
32,1261, // `do
33,154, // `double
34,1623, // `enum
35,1170, // `final
36,1177, // `finally
37,1185, // `float
38,928, // `goto
39,486, // `implements
40,1054, // `import
41,1657, // `interface
42,617, // `long
43,48, // `native
44,413, // `package
45,192, // `private
46,1694, // `protected
47,97, // `public
48,459, // `short
49,10, // `static
50,1526, // `strictfp
51,408, // `switch
52,801, // `synchronized
53,703, // `throw
54,919, // `throws
55,309, // `transient
56,816, // `try
57,345, // `volatile
89,968, // "c"
90,1122, // "l"
91,745, // "a"
92,420, // "s"
94,237, // "e"
95,155, // "b"
97,1447, // "n"
99,491, // "t"
100,626, // "d"
101,1187, // "v"
102,148, // "i"
103,306, // "w"
105,934, // "f"
106,1695, // "r"
109,1191, // "p"
112,1575, // "g"
  }
,
{ // state 1447
91,1661, // "a"
94,942, // "e"
108,124, // "u"
  }
,
{ // state 1448
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 1449
2,1791, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 1450
198,MIN_REDUCTION+362, // $NT
  }
,
{ // state 1451
0x80000000|1727, // match move
0x80000000|1550, // no-match move
0x80000000|112, // NT-test-match state for comment_stuff
  }
,
{ // state 1452
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 1453
198,MIN_REDUCTION+385, // $NT
  }
,
{ // state 1454
0x80000000|1810, // match move
0x80000000|485, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1455
90,47, // "l"
  }
,
{ // state 1456
97,644, // "n"
  }
,
{ // state 1457
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 1458
0x80000000|561, // match move
0x80000000|340, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1459
0x80000000|131, // match move
0x80000000|550, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1460
2,1164, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 1461
0x80000000|1026, // match move
0x80000000|171, // no-match move
0x80000000|112, // NT-test-match state for comment_stuff
  }
,
{ // state 1462
0x80000000|1505, // match move
0x80000000|706, // no-match move
0x80000000|941, // NT-test-match state for single_printable
  }
,
{ // state 1463
0x80000000|1365, // match move
0x80000000|1265, // no-match move
0x80000000|941, // NT-test-match state for single_printable
  }
,
{ // state 1464
162,1757, // '"'
  }
,
{ // state 1465
92,441, // "s"
  }
,
{ // state 1466
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 1467
0x80000000|633, // match move
0x80000000|988, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1468
MIN_REDUCTION+390, // (default reduction)
  }
,
{ // state 1469
198,MIN_REDUCTION+365, // $NT
  }
,
{ // state 1470
2,194, // white*
135,1629, // comment
176,1084, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 1471
198,MIN_REDUCTION+381, // $NT
  }
,
{ // state 1472
92,1481, // "s"
99,1617, // "t"
  }
,
{ // state 1473
2,1487, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 1474
2,1336, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 1475
0x80000000|1250, // match move
0x80000000|1045, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1476
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 1477
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 1478
92,1892, // "s"
  }
,
{ // state 1479
0x80000000|1291, // match move
0x80000000|404, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 1480
0x80000000|1, // match move
0x80000000|1259, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1481
99,135, // "t"
  }
,
{ // state 1482
0x80000000|654, // match move
0x80000000|552, // no-match move
0x80000000|91, // NT-test-match state for digit
  }
,
{ // state 1483
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 1484
2,1307, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 1485
89,826, // "c"
90,826, // "l"
91,826, // "a"
92,826, // "s"
94,826, // "e"
95,826, // "b"
96,826, // "o"
97,826, // "n"
98,826, // "x"
99,826, // "t"
100,826, // "d"
101,826, // "v"
102,826, // "i"
103,826, // "w"
104,826, // "h"
105,826, // "f"
106,826, // "r"
107,826, // "k"
108,826, // "u"
109,826, // "p"
110,826, // "y"
111,826, // "m"
112,826, // "g"
113,826, // "z"
115,826, // "!"
116,826, // "="
117,826, // "<"
118,826, // ">"
119,826, // "+"
120,826, // "-"
121,482, // "*"
122,826, // "%"
123,826, // "&"
124,826, // "("
125,826, // ")"
126,826, // "{"
127,826, // "}"
128,826, // "["
129,826, // "]"
130,826, // "|"
131,826, // "."
132,826, // ","
133,826, // ":"
134,826, // ";"
136,613, // "/"
141,826, // "0"
142,826, // "X"
144,826, // {"1".."7"}
150,826, // {"A".."F"}
156,826, // " "
157,826, // {"8".."9"}
158,826, // {"G".."W" "Y".."Z" "j" "q"}
159,826, // "_"
160,826, // {"#".."$" "?".."@" "^" "`" "~"}
161,826, // "'"
162,826, // '"'
170,826, // "\"
178,1597, // eol
182,1461, // star
183,330, // slash
184,26, // slash_star
185,1856, // comment_printable
186,1246, // comment_stuff
188,1297, // {10}
189,1651, // {13}
  }
,
{ // state 1486
0x80000000|914, // match move
0x80000000|1521, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1487
0x80000000|169, // match move
0x80000000|1568, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1488
0x80000000|835, // match move
0x80000000|1827, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1489
106,542, // "r"
  }
,
{ // state 1490
MIN_REDUCTION+379, // (default reduction)
  }
,
{ // state 1491
0x80000000|1, // match move
0x80000000|1767, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1492
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+131, // $NT
  }
,
{ // state 1493
0x80000000|1335, // match move
0x80000000|257, // no-match move
0x80000000|112, // NT-test-match state for comment_stuff
  }
,
{ // state 1494
0x80000000|52, // match move
0x80000000|1117, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1495
89,1776, // "c"
90,1776, // "l"
91,1776, // "a"
92,1776, // "s"
94,1776, // "e"
95,1776, // "b"
96,1776, // "o"
97,1776, // "n"
98,1776, // "x"
99,1776, // "t"
100,1776, // "d"
101,1776, // "v"
102,1776, // "i"
103,1776, // "w"
104,1776, // "h"
105,1776, // "f"
106,1776, // "r"
107,1776, // "k"
108,1776, // "u"
109,1776, // "p"
110,1776, // "y"
111,1776, // "m"
112,1776, // "g"
113,1776, // "z"
115,1776, // "!"
116,1776, // "="
117,1776, // "<"
118,1776, // ">"
119,1776, // "+"
120,1776, // "-"
121,1776, // "*"
122,1776, // "%"
123,1776, // "&"
124,1776, // "("
125,1776, // ")"
126,1776, // "{"
127,1776, // "}"
128,1776, // "["
129,1776, // "]"
130,1776, // "|"
131,1776, // "."
132,1776, // ","
133,1776, // ":"
134,1776, // ";"
136,1776, // "/"
141,1776, // "0"
142,1776, // "X"
144,1776, // {"1".."7"}
150,1776, // {"A".."F"}
156,1776, // " "
157,1776, // {"8".."9"}
158,1776, // {"G".."W" "Y".."Z" "j" "q"}
159,1776, // "_"
160,1776, // {"#".."$" "?".."@" "^" "`" "~"}
161,1776, // "'"
162,1776, // '"'
170,1776, // "\"
177,1776, // {9 12}
180,467, // single_printable
181,92, // single_printable**
196,764, // single_printable*
  }
,
{ // state 1496
0x80000000|1, // match move
0x80000000|554, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1497
0x80000000|1869, // match move
0x80000000|684, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1498
2,1178, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 1499
0x80000000|1843, // match move
0x80000000|1425, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1500
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 1501
0x80000000|1, // match move
0x80000000|1277, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1502
0x80000000|1609, // match move
0x80000000|1753, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1503
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 1504
2,1005, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 1505
89,702, // "c"
90,702, // "l"
91,702, // "a"
92,702, // "s"
94,702, // "e"
95,702, // "b"
96,702, // "o"
97,702, // "n"
98,702, // "x"
99,702, // "t"
100,702, // "d"
101,702, // "v"
102,702, // "i"
103,702, // "w"
104,702, // "h"
105,702, // "f"
106,702, // "r"
107,702, // "k"
108,702, // "u"
109,702, // "p"
110,702, // "y"
111,702, // "m"
112,702, // "g"
113,702, // "z"
115,702, // "!"
116,702, // "="
117,702, // "<"
118,702, // ">"
119,702, // "+"
120,702, // "-"
121,702, // "*"
122,702, // "%"
123,702, // "&"
124,702, // "("
125,702, // ")"
126,702, // "{"
127,702, // "}"
128,702, // "["
129,702, // "]"
130,702, // "|"
131,702, // "."
132,702, // ","
133,702, // ":"
134,702, // ";"
136,702, // "/"
141,702, // "0"
142,702, // "X"
144,702, // {"1".."7"}
150,702, // {"A".."F"}
156,702, // " "
157,702, // {"8".."9"}
158,702, // {"G".."W" "Y".."Z" "j" "q"}
159,702, // "_"
160,702, // {"#".."$" "?".."@" "^" "`" "~"}
161,702, // "'"
162,702, // '"'
170,702, // "\"
177,702, // {9 12}
180,1506, // single_printable
181,1186, // single_printable**
196,1463, // single_printable*
  }
,
{ // state 1506
0x80000000|1114, // match move
0x80000000|1113, // no-match move
0x80000000|941, // NT-test-match state for single_printable
  }
,
{ // state 1507
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 1508
90,1350, // "l"
  }
,
{ // state 1509
MIN_REDUCTION+356, // (default reduction)
  }
,
{ // state 1510
92,1372, // "s"
  }
,
{ // state 1511
0x80000000|1254, // match move
0x80000000|1215, // no-match move
0x80000000|941, // NT-test-match state for single_printable
  }
,
{ // state 1512
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 1513
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 1514
0x80000000|1, // match move
0x80000000|1467, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1515
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 1516
0x80000000|1392, // match move
0x80000000|262, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1517
0x80000000|612, // match move
0x80000000|42, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1518
92,1686, // "s"
  }
,
{ // state 1519
2,1595, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+98, // $NT
  }
,
{ // state 1520
0x80000000|1470, // match move
0x80000000|1183, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1521
2,1348, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 1522
2,805, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 1523
96,1763, // "o"
  }
,
{ // state 1524
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 1525
0x80000000|1, // match move
0x80000000|243, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1526
198,MIN_REDUCTION+240, // $NT
  }
,
{ // state 1527
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 1528
2,832, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 1529
111,1738, // "m"
  }
,
{ // state 1530
0x80000000|1718, // match move
0x80000000|910, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1531
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 1532
0x80000000|1, // match move
0x80000000|658, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1533
2,1591, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+126, // $NT
  }
,
{ // state 1534
92,1069, // "s"
99,1124, // "t"
  }
,
{ // state 1535
112,1134, // "g"
  }
,
{ // state 1536
198,MIN_REDUCTION+213, // $NT
  }
,
{ // state 1537
0x80000000|1017, // match move
0x80000000|1404, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1538
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 1539
MIN_REDUCTION+385, // (default reduction)
  }
,
{ // state 1540
2,1494, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 1541
2,1394, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 1542
102,1807, // "i"
  }
,
{ // state 1543
91,1273, // "a"
  }
,
{ // state 1544
139,MIN_REDUCTION+346, // idChar**
159,MIN_REDUCTION+346, // "_"
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 1545
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 1546
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 1547
0x80000000|233, // match move
0x80000000|1531, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1548
0x80000000|1, // match move
0x80000000|1475, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1549
90,1886, // "l"
  }
,
{ // state 1550
MIN_REDUCTION+355, // (default reduction)
  }
,
{ // state 1551
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 1552
0x80000000|1, // match move
0x80000000|1587, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1553
0x80000000|139, // match move
0x80000000|611, // no-match move
0x80000000|981, // NT-test-match state for printable
  }
,
{ // state 1554
2,1780, // white*
135,1629, // comment
176,1084, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 1555
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 1556
0x80000000|957, // match move
0x80000000|1220, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1557
0x80000000|158, // match move
0x80000000|1092, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1558
0x80000000|1796, // match move
0x80000000|722, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1559
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 1560
0x80000000|399, // match move
0x80000000|1405, // no-match move
0x80000000|941, // NT-test-match state for single_printable
  }
,
{ // state 1561
198,MIN_REDUCTION+366, // $NT
  }
,
{ // state 1562
94,426, // "e"
  }
,
{ // state 1563
98,489, // "x"
142,489, // "X"
  }
,
{ // state 1564
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 1565
97,1160, // "n"
  }
,
{ // state 1566
MIN_REDUCTION+392, // (default reduction)
  }
,
{ // state 1567
94,113, // "e"
  }
,
{ // state 1568
0x80000000|631, // match move
0x80000000|326, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1569
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 1570
90,1878, // "l"
  }
,
{ // state 1571
89,972, // "c"
  }
,
{ // state 1572
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 1573
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+101, // $NT
  }
,
{ // state 1574
0x80000000|189, // match move
0x80000000|1588, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1575
96,381, // "o"
  }
,
{ // state 1576
99,19, // "t"
  }
,
{ // state 1577
2,205, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 1578
4,1206, // token
5,1263, // `boolean
6,1847, // `class
7,1293, // `extends
8,1357, // `void
9,945, // `int
10,1546, // `while
11,1318, // `if
12,1797, // `else
13,103, // `for
14,712, // `break
15,1688, // `this
16,1157, // `false
17,1130, // `true
18,1515, // `super
19,984, // `null
20,1749, // `return
21,292, // `instanceof
22,636, // `new
23,391, // `abstract
24,1093, // `assert
25,1003, // `byte
26,1466, // `case
27,635, // `catch
28,1545, // `char
29,1011, // `const
30,1271, // `continue
31,637, // `default
32,707, // `do
33,759, // `double
34,1739, // `enum
35,1378, // `final
36,814, // `finally
37,1880, // `float
38,1207, // `goto
39,1033, // `implements
40,1379, // `import
41,1601, // `interface
42,300, // `long
43,1430, // `native
44,220, // `package
45,166, // `private
46,1768, // `protected
47,1360, // `public
48,93, // `short
49,36, // `static
50,1272, // `strictfp
51,1416, // `switch
52,1457, // `synchronized
53,1656, // `throw
54,1724, // `throws
55,206, // `transient
56,1281, // `try
57,581, // `volatile
89,38, // "c"
90,281, // "l"
91,918, // "a"
92,1068, // "s"
94,268, // "e"
95,284, // "b"
97,1138, // "n"
99,1008, // "t"
100,1399, // "d"
101,1420, // "v"
102,269, // "i"
103,1801, // "w"
105,1340, // "f"
106,540, // "r"
109,1435, // "p"
112,1523, // "g"
MIN_REDUCTION+394, // (default reduction)
  }
,
{ // state 1579
99,1870, // "t"
  }
,
{ // state 1580
2,1328, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+160, // $NT
  }
,
{ // state 1581
2,116, // white*
135,1629, // comment
176,1084, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 1582
0x80000000|1248, // match move
0x80000000|908, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1583
0x80000000|46, // match move
0x80000000|1202, // no-match move
// T-test match for 10:
188,
  }
,
{ // state 1584
0x80000000|1448, // match move
0x80000000|1412, // no-match move
0x80000000|1115, // NT-test-match state for hex_digit
  }
,
{ // state 1585
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 1586
97,1645, // "n"
  }
,
{ // state 1587
0x80000000|478, // match move
0x80000000|289, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1588
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 1589
198,MIN_REDUCTION+360, // $NT
  }
,
{ // state 1590
105,1406, // "f"
  }
,
{ // state 1591
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+125, // $NT
  }
,
{ // state 1592
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+95, // $NT
  }
,
{ // state 1593
0x80000000|73, // match move
0x80000000|1245, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1594
0x80000000|1, // match move
0x80000000|609, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1595
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+97, // $NT
  }
,
{ // state 1596
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 1597
0x80000000|1723, // match move
0x80000000|514, // no-match move
0x80000000|112, // NT-test-match state for comment_stuff
  }
,
{ // state 1598
108,1746, // "u"
  }
,
{ // state 1599
0x80000000|1, // match move
0x80000000|1218, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1600
91,423, // "a"
  }
,
{ // state 1601
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 1602
0x80000000|1, // match move
0x80000000|595, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1603
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 1604
2,128, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 1605
0x80000000|512, // match move
0x80000000|767, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1606
2,526, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 1607
0x80000000|911, // match move
0x80000000|1522, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1608
0x80000000|1500, // match move
0x80000000|27, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1609
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 1610
109,1356, // "p"
  }
,
{ // state 1611
MIN_REDUCTION+391, // (default reduction)
  }
,
{ // state 1612
91,992, // "a"
108,322, // "u"
110,1525, // "y"
  }
,
{ // state 1613
0x80000000|1654, // match move
0x80000000|1530, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1614
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 1615
0x80000000|109, // match move
0x80000000|1012, // no-match move
0x80000000|941, // NT-test-match state for single_printable
  }
,
{ // state 1616
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 1617
0x80000000|728, // match move
0x80000000|1622, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1618
0x80000000|1432, // match move
0x80000000|808, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1619
99,1107, // "t"
  }
,
{ // state 1620
0x80000000|1126, // match move
0x80000000|1566, // no-match move
0x80000000|1137, // NT-test-match state for oct_digit
  }
,
{ // state 1621
97,1346, // "n"
  }
,
{ // state 1622
2,931, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+100, // $NT
  }
,
{ // state 1623
198,MIN_REDUCTION+224, // $NT
  }
,
{ // state 1624
0x80000000|1, // match move
0x80000000|470, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1625
92,323, // "s"
  }
,
{ // state 1626
2,1698, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 1627
2,1679, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 1628
2,43, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 1629
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 1630
0x80000000|1855, // match move
0x80000000|1078, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1631
MIN_REDUCTION+371, // (default reduction)
  }
,
{ // state 1632
0x80000000|1426, // match move
0x80000000|455, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1633
MIN_REDUCTION+343, // (default reduction)
  }
,
{ // state 1634
0x80000000|695, // match move
0x80000000|211, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1635
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 1636
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+121, // $NT
  }
,
{ // state 1637
0x80000000|891, // match move
0x80000000|13, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1638
2,1742, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 1639
0x80000000|894, // match move
0x80000000|1440, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1640
0x80000000|190, // match move
0x80000000|1415, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1641
104,1813, // "h"
  }
,
{ // state 1642
0x80000000|793, // match move
0x80000000|1828, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1643
91,1565, // "a"
  }
,
{ // state 1644
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 1645
108,379, // "u"
  }
,
{ // state 1646
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 1647
0x80000000|1, // match move
0x80000000|1874, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1648
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 1649
94,328, // "e"
  }
,
{ // state 1650
0x80000000|602, // match move
0x80000000|1397, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1651
0x80000000|1391, // match move
0x80000000|506, // no-match move
// T-test match for 10:
188,
  }
,
{ // state 1652
0x80000000|183, // match move
0x80000000|1247, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 1653
0x80000000|1, // match move
0x80000000|1630, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1654
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 1655
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 1656
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 1657
198,MIN_REDUCTION+231, // $NT
  }
,
{ // state 1658
0x80000000|1, // match move
0x80000000|1834, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1659
MIN_REDUCTION+366, // (default reduction)
  }
,
{ // state 1660
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 1661
99,1428, // "t"
  }
,
{ // state 1662
2,1336, // white*
135,1629, // comment
176,1084, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 1663
0x80000000|291, // match move
0x80000000|28, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1664
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 1665
0x80000000|275, // match move
0x80000000|104, // no-match move
0x80000000|941, // NT-test-match state for single_printable
  }
,
{ // state 1666
MIN_REDUCTION+390, // (default reduction)
  }
,
{ // state 1667
0x80000000|1, // match move
0x80000000|1826, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1668
2,1636, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+122, // $NT
  }
,
{ // state 1669
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 1670
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 1671
0x80000000|503, // match move
0x80000000|1697, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1672
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 1673
89,826, // "c"
90,826, // "l"
91,826, // "a"
92,826, // "s"
94,826, // "e"
95,826, // "b"
96,826, // "o"
97,826, // "n"
98,826, // "x"
99,826, // "t"
100,826, // "d"
101,826, // "v"
102,826, // "i"
103,826, // "w"
104,826, // "h"
105,826, // "f"
106,826, // "r"
107,826, // "k"
108,826, // "u"
109,826, // "p"
110,826, // "y"
111,826, // "m"
112,826, // "g"
113,826, // "z"
115,826, // "!"
116,826, // "="
117,826, // "<"
118,826, // ">"
119,826, // "+"
120,826, // "-"
121,482, // "*"
122,826, // "%"
123,826, // "&"
124,826, // "("
125,826, // ")"
126,826, // "{"
127,826, // "}"
128,826, // "["
129,826, // "]"
130,826, // "|"
131,826, // "."
132,826, // ","
133,826, // ":"
134,826, // ";"
136,613, // "/"
141,826, // "0"
142,826, // "X"
144,826, // {"1".."7"}
150,826, // {"A".."F"}
156,826, // " "
157,826, // {"8".."9"}
158,826, // {"G".."W" "Y".."Z" "j" "q"}
159,826, // "_"
160,826, // {"#".."$" "?".."@" "^" "`" "~"}
161,826, // "'"
162,826, // '"'
170,826, // "\"
178,1597, // eol
182,1461, // star
183,330, // slash
184,26, // slash_star
185,1856, // comment_printable
186,493, // comment_stuff
187,1824, // comment_stuff**
188,1297, // {10}
189,1651, // {13}
195,653, // comment_stuff*
  }
,
{ // state 1674
102,1077, // "i"
  }
,
{ // state 1675
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 1676
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+91, // $NT
  }
,
{ // state 1677
136,1469, // "/"
  }
,
{ // state 1678
0x80000000|529, // match move
0x80000000|419, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1679
0x80000000|1781, // match move
0x80000000|1547, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1680
0x80000000|1789, // match move
0x80000000|209, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1681
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 1682
91,1167, // "a"
  }
,
{ // state 1683
198,MIN_REDUCTION+361, // $NT
  }
,
{ // state 1684
0x80000000|1, // match move
0x80000000|597, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1685
0x80000000|583, // match move
0x80000000|16, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1686
92,739, // "s"
  }
,
{ // state 1687
2,1232, // white*
135,1629, // comment
176,1084, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 1688
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 1689
0x80000000|1, // match move
0x80000000|884, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1690
0x80000000|1, // match move
0x80000000|755, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1691
0x80000000|1, // match move
0x80000000|588, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1692
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+143, // $NT
  }
,
{ // state 1693
2,421, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+396, // (default reduction)
  }
,
{ // state 1694
198,MIN_REDUCTION+236, // $NT
  }
,
{ // state 1695
94,1837, // "e"
  }
,
{ // state 1696
96,313, // "o"
  }
,
{ // state 1697
0x80000000|310, // match move
0x80000000|273, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1698
0x80000000|1059, // match move
0x80000000|872, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1699
100,1491, // "d"
  }
,
{ // state 1700
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 1701
2,1394, // white*
135,1629, // comment
176,1084, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 1702
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 1703
MIN_REDUCTION+345, // (default reduction)
  }
,
{ // state 1704
0x80000000|17, // match move
0x80000000|841, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1705
0x80000000|1, // match move
0x80000000|1844, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1706
0x80000000|738, // match move
0x80000000|1877, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1707
2,1233, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+124, // $NT
  }
,
{ // state 1708
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 1709
121,590, // "*"
  }
,
{ // state 1710
2,993, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 1711
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 1712
2,1105, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 1713
94,1439, // "e"
  }
,
{ // state 1714
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 1715
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 1716
102,277, // "i"
106,1076, // "r"
  }
,
{ // state 1717
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 1718
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 1719
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 1720
2,418, // white*
135,1629, // comment
176,1084, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 1721
0x80000000|200, // match move
0x80000000|501, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1722
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 1723
MIN_REDUCTION+363, // (default reduction)
  }
,
{ // state 1724
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 1725
0x80000000|1023, // match move
0x80000000|1638, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1726
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 1727
MIN_REDUCTION+355, // (default reduction)
  }
,
{ // state 1728
2,1557, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 1729
0x80000000|1752, // match move
0x80000000|751, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1730
0x80000000|386, // match move
0x80000000|785, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1731
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 1732
188,184, // {10}
  }
,
{ // state 1733
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+169, // $NT
  }
,
{ // state 1734
96,1788, // "o"
102,853, // "i"
  }
,
{ // state 1735
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 1736
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 1737
89,1226, // "c"
  }
,
{ // state 1738
94,1409, // "e"
  }
,
{ // state 1739
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 1740
90,1600, // "l"
102,1427, // "i"
  }
,
{ // state 1741
0x80000000|1, // match move
0x80000000|852, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1742
0x80000000|559, // match move
0x80000000|280, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1743
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 1744
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 1745
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+171, // $NT
  }
,
{ // state 1746
106,1303, // "r"
  }
,
{ // state 1747
107,1253, // "k"
  }
,
{ // state 1748
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 1749
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 1750
0x80000000|1798, // match move
0x80000000|616, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1751
92,22, // "s"
  }
,
{ // state 1752
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 1753
0x80000000|324, // match move
0x80000000|634, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1754
106,1411, // "r"
  }
,
{ // state 1755
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 1756
102,186, // "i"
106,415, // "r"
  }
,
{ // state 1757
198,MIN_REDUCTION+336, // $NT
  }
,
{ // state 1758
0x80000000|69, // match move
0x80000000|1779, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1759
96,411, // "o"
  }
,
{ // state 1760
99,177, // "t"
  }
,
{ // state 1761
0x80000000|1254, // match move
0x80000000|1835, // no-match move
0x80000000|941, // NT-test-match state for single_printable
  }
,
{ // state 1762
92,737, // "s"
99,173, // "t"
  }
,
{ // state 1763
99,274, // "t"
  }
,
{ // state 1764
0x80000000|483, // match move
0x80000000|1725, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1765
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+135, // $NT
  }
,
{ // state 1766
136,1312, // "/"
  }
,
{ // state 1767
0x80000000|599, // match move
0x80000000|1865, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1768
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 1769
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 1770
2,1403, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 1771
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 1772
109,765, // "p"
  }
,
{ // state 1773
0x80000000|1241, // match move
0x80000000|580, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1774
0x80000000|1, // match move
0x80000000|776, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1775
0x80000000|1708, // match move
0x80000000|800, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1776
0x80000000|477, // match move
0x80000000|989, // no-match move
0x80000000|941, // NT-test-match state for single_printable
  }
,
{ // state 1777
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 1778
MIN_REDUCTION+366, // (default reduction)
  }
,
{ // state 1779
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+395, // (default reduction)
  }
,
{ // state 1780
0x80000000|1664, // match move
0x80000000|1790, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1781
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 1782
0x80000000|1, // match move
0x80000000|523, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1783
2,1637, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 1784
104,1647, // "h"
  }
,
{ // state 1785
105,1445, // "f"
  }
,
{ // state 1786
2,672, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+128, // $NT
  }
,
{ // state 1787
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 1788
99,78, // "t"
  }
,
{ // state 1789
2,1809, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 1790
0x80000000|480, // match move
0x80000000|1275, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1791
0x80000000|1276, // match move
0x80000000|1382, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1792
MIN_REDUCTION+393, // (default reduction)
  }
,
{ // state 1793
97,1352, // "n"
  }
,
{ // state 1794
0x80000000|847, // match move
0x80000000|773, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1795
101,401, // "v"
  }
,
{ // state 1796
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 1797
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 1798
2,1613, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 1799
0x80000000|1, // match move
0x80000000|781, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1800
0x80000000|961, // match move
0x80000000|584, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1801
104,400, // "h"
  }
,
{ // state 1802
91,1747, // "a"
  }
,
{ // state 1803
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 1804
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 1805
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 1806
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 1807
89,83, // "c"
  }
,
{ // state 1808
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 1809
0x80000000|1507, // match move
0x80000000|1833, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1810
2,208, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 1811
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 1812
198,MIN_REDUCTION+352, // $NT
MIN_REDUCTION+352, // (default reduction)
  }
,
{ // state 1813
0x80000000|1, // match move
0x80000000|1704, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1814
89,826, // "c"
90,826, // "l"
91,826, // "a"
92,826, // "s"
94,826, // "e"
95,826, // "b"
96,826, // "o"
97,826, // "n"
98,826, // "x"
99,826, // "t"
100,826, // "d"
101,826, // "v"
102,826, // "i"
103,826, // "w"
104,826, // "h"
105,826, // "f"
106,826, // "r"
107,826, // "k"
108,826, // "u"
109,826, // "p"
110,826, // "y"
111,826, // "m"
112,826, // "g"
113,826, // "z"
115,826, // "!"
116,826, // "="
117,826, // "<"
118,826, // ">"
119,826, // "+"
120,826, // "-"
121,482, // "*"
122,826, // "%"
123,826, // "&"
124,826, // "("
125,826, // ")"
126,826, // "{"
127,826, // "}"
128,826, // "["
129,826, // "]"
130,826, // "|"
131,826, // "."
132,826, // ","
133,826, // ":"
134,826, // ";"
136,613, // "/"
141,826, // "0"
142,826, // "X"
144,826, // {"1".."7"}
150,826, // {"A".."F"}
156,826, // " "
157,826, // {"8".."9"}
158,826, // {"G".."W" "Y".."Z" "j" "q"}
159,826, // "_"
160,826, // {"#".."$" "?".."@" "^" "`" "~"}
161,826, // "'"
162,826, // '"'
170,826, // "\"
178,1597, // eol
182,1461, // star
183,330, // slash
184,26, // slash_star
185,1856, // comment_printable
186,493, // comment_stuff
187,1431, // comment_stuff**
188,1297, // {10}
189,1651, // {13}
195,653, // comment_stuff*
  }
};
}
private class Initter4{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 1815
198,MIN_REDUCTION+352, // $NT
  }
,
{ // state 1816
0x80000000|462, // match move
0x80000000|1146, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1817
2,1235, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 1818
91,1418, // "a"
108,1025, // "u"
110,1128, // "y"
  }
,
{ // state 1819
0x80000000|1891, // match move
0x80000000|1574, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1820
2,318, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 1821
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 1822
MIN_REDUCTION+374, // (default reduction)
  }
,
{ // state 1823
105,593, // "f"
  }
,
{ // state 1824
121,1171, // "*"
  }
,
{ // state 1825
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 1826
0x80000000|1473, // match move
0x80000000|247, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1827
0x80000000|1836, // match move
0x80000000|1073, // no-match move
0x80000000|1446, // NT-test-match state for reserved
  }
,
{ // state 1828
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 1829
0x80000000|1354, // match move
0x80000000|461, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1830
135,913, // comment
136,253, // "/"
156,807, // " "
176,733, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+161, // $NT
  }
,
{ // state 1831
2,244, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 1832
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 1833
0x80000000|1513, // match move
0x80000000|920, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1834
0x80000000|99, // match move
0x80000000|259, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1835
MIN_REDUCTION+384, // (default reduction)
  }
,
{ // state 1836
3,4, // $$0
4,1631, // token
5,1263, // `boolean
6,1847, // `class
7,1293, // `extends
8,1357, // `void
9,945, // `int
10,1546, // `while
11,1318, // `if
12,1797, // `else
13,103, // `for
14,712, // `break
15,1688, // `this
16,1157, // `false
17,1130, // `true
18,1515, // `super
19,984, // `null
20,1749, // `return
21,292, // `instanceof
22,636, // `new
23,391, // `abstract
24,1093, // `assert
25,1003, // `byte
26,1466, // `case
27,635, // `catch
28,1545, // `char
29,1011, // `const
30,1271, // `continue
31,637, // `default
32,707, // `do
33,759, // `double
34,1739, // `enum
35,1378, // `final
36,814, // `finally
37,1880, // `float
38,1207, // `goto
39,1033, // `implements
40,1379, // `import
41,1601, // `interface
42,300, // `long
43,1430, // `native
44,220, // `package
45,166, // `private
46,1768, // `protected
47,1360, // `public
48,93, // `short
49,36, // `static
50,1272, // `strictfp
51,1416, // `switch
52,1457, // `synchronized
53,1656, // `throw
54,1724, // `throws
55,206, // `transient
56,1281, // `try
57,581, // `volatile
89,38, // "c"
90,281, // "l"
91,918, // "a"
92,1068, // "s"
94,268, // "e"
95,284, // "b"
97,1138, // "n"
99,1008, // "t"
100,1399, // "d"
101,1420, // "v"
102,269, // "i"
103,1801, // "w"
105,1340, // "f"
106,540, // "r"
109,1435, // "p"
112,1523, // "g"
190,1459, // token*
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 1837
99,1083, // "t"
  }
,
{ // state 1838
2,320, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+106, // $NT
  }
,
{ // state 1839
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1840
0x80000000|1114, // match move
0x80000000|875, // no-match move
0x80000000|941, // NT-test-match state for single_printable
  }
,
{ // state 1841
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 1842
2,1502, // white*
135,1629, // comment
176,1084, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 1843
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 1844
0x80000000|1577, // match move
0x80000000|862, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1845
0x80000000|1, // match move
0x80000000|901, // no-match move
0x80000000|58, // NT-test-match state for idChar
  }
,
{ // state 1846
MIN_REDUCTION+348, // (default reduction)
  }
,
{ // state 1847
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 1848
198,MIN_REDUCTION+343, // $NT
  }
,
{ // state 1849
2,832, // white*
135,1629, // comment
176,1084, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 1850
2,194, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 1851
102,1621, // "i"
  }
,
{ // state 1852
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 1853
MIN_REDUCTION+343, // (default reduction)
  }
,
{ // state 1854
0x80000000|1214, // match move
0x80000000|1402, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1855
2,589, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 1856
0x80000000|8, // match move
0x80000000|763, // no-match move
0x80000000|112, // NT-test-match state for comment_stuff
  }
,
{ // state 1857
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 1858
2,145, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+142, // $NT
  }
,
{ // state 1859
0x80000000|1783, // match move
0x80000000|240, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1860
113,234, // "z"
  }
,
{ // state 1861
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 1862
MIN_REDUCTION+381, // (default reduction)
  }
,
{ // state 1863
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 1864
198,MIN_REDUCTION+217, // $NT
  }
,
{ // state 1865
2,886, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 1866
MIN_REDUCTION+389, // (default reduction)
  }
,
{ // state 1867
2,357, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 1868
0x80000000|1693, // match move
0x80000000|1027, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1869
2,384, // white*
135,1629, // comment
136,199, // "/"
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
179,1560, // ds
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 1870
92,1081, // "s"
  }
,
{ // state 1871
105,1048, // "f"
  }
,
{ // state 1872
0x80000000|1121, // match move
0x80000000|1024, // no-match move
// T-test match for "0":
141,
  }
,
{ // state 1873
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 1874
0x80000000|1315, // match move
0x80000000|1728, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1875
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 1876
198,MIN_REDUCTION+212, // $NT
  }
,
{ // state 1877
156,1846, // " "
176,1490, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 1878
94,1690, // "e"
  }
,
{ // state 1879
2,1492, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+132, // $NT
  }
,
{ // state 1880
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 1881
2,1676, // white*
135,913, // comment
136,253, // "/"
156,807, // " "
176,68, // white
177,807, // {9 12}
178,1050, // eol
179,1462, // ds
188,651, // {10}
189,1345, // {13}
198,MIN_REDUCTION+92, // $NT
  }
,
{ // state 1882
2,447, // white*
156,1846, // " "
176,1084, // white
177,1846, // {9 12}
178,430, // eol
188,279, // {10}
189,364, // {13}
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 1883
95,350, // "b"
  }
,
{ // state 1884
92,1216, // "s"
  }
,
{ // state 1885
0x80000000|85, // match move
0x80000000|1295, // no-match move
0x80000000|1446, // NT-test-match state for reserved
  }
,
{ // state 1886
102,181, // "i"
  }
,
{ // state 1887
100,736, // "d"
  }
,
{ // state 1888
0x80000000|604, // match move
0x80000000|282, // no-match move
0x80000000|995, // NT-test-match state for comment
  }
,
{ // state 1889
0x80000000|1578, // match move
0x80000000|528, // no-match move
0x80000000|1446, // NT-test-match state for reserved
  }
,
{ // state 1890
4,1206, // token
58,678, // `!
59,866, // `!=
60,1648, // `%
61,365, // `&&
62,1808, // `*
63,677, // `(
64,844, // `)
65,1087, // `{
66,1551, // `}
67,55, // `-
68,242, // `+
69,1787, // `=
70,53, // `==
71,1524, // `[
72,341, // `]
73,1227, // `||
74,650, // `<
75,531, // `<=
76,1311, // `,
77,1388, // `>
78,1702, // `>=
79,983, // `.
80,225, // `;
81,1717, // `++
82,683, // `--
83,804, // `/
84,1825, // `:
85,608, // ID
86,1714, // INT_LITERAL
87,1332, // STRING_LITERAL
88,1700, // CHARACTER_LITERAL
137,1270, // identifier
138,522, // letter
140,1234, // oct_start
141,1553, // "0"
145,905, // oct_literal
147,878, // hex_start
151,827, // hex_literal
171,679, // dq
175,741, // sq
  }
,
{ // state 1891
135,1629, // comment
176,1490, // white
178,430, // eol
179,1560, // ds
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 1892
99,1306, // "t"
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[1893][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
  doneSoFar += new Initter2().doInit(doneSoFar);
  doneSoFar += new Initter3().doInit(doneSoFar);
  doneSoFar += new Initter4().doInit(doneSoFar);
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
// oct_start ::= "0" !{"X" "x"}
(140<<16)+1,
// oct_digit ::= {"0".."7"}
(143<<16)+1,
// oct_literal ::= oct_start oct_digit++ white*
(145<<16)+3,
// oct_literal ::= oct_start oct_digit++
(145<<16)+2,
// hex_start ::= "0" {"X" "x"}
(147<<16)+2,
// hex_digit ::= digit
(148<<16)+1,
// hex_digit ::= {"A".."F" "a".."f"}
(148<<16)+1,
// hex_literal ::= hex_start hex_digit++ white*
(151<<16)+3,
// hex_literal ::= hex_start hex_digit++
(151<<16)+2,
// INT_LITERAL ::= oct_literal
(86<<16)+1,
// INT_LITERAL ::= hex_literal
(86<<16)+1,
// INT_LITERAL ::= "0" !printable white*
(86<<16)+2,
// INT_LITERAL ::= "0" !printable
(86<<16)+1,
// INT_LITERAL ::= !"0" digit++ white*
(86<<16)+2,
// INT_LITERAL ::= !"0" digit++
(86<<16)+1,
// character_printable ::= {" ".."[" "]".."~"}
(155<<16)+1,
// character_printable ::= back_back
(155<<16)+1,
// character_printable ::= back_dquote
(155<<16)+1,
// character_printable ::= back_squote
(155<<16)+1,
// character_printable ::= back_n
(155<<16)+1,
// character_printable ::= back_tab
(155<<16)+1,
// character_printable ::= back_form
(155<<16)+1,
// character_printable ::= back_return
(155<<16)+1,
// back_back ::= "\" "\"
(163<<16)+2,
// back_dquote ::= "\" '"'
(164<<16)+2,
// back_squote ::= "\" "'"
(165<<16)+2,
// back_n ::= "\" "n"
(166<<16)+2,
// back_tab ::= "\" "t"
(167<<16)+2,
// back_form ::= "\" "f"
(168<<16)+2,
// back_return ::= "\" "r"
(169<<16)+2,
// dq ::= '"'
(171<<16)+1,
// stringChar ::= !dq character_printable
(172<<16)+1,
// STRING_LITERAL ::= dq stringChar* $$1
(87<<16)+3,
// STRING_LITERAL ::= dq $$1
(87<<16)+2,
// sq ::= "'"
(175<<16)+1,
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
(149<<16)+1,
// white ::= {9 12 " "}
(176<<16)+1,
// white ::= eol
(176<<16)+1,
// white ::= comment
(176<<16)+1,
// ds ::= "/" "/"
(179<<16)+2,
// single_printable ::= {9 12 " ".."~"}
(180<<16)+1,
// comment ::= ds single_printable**
(135<<16)+2,
// comment ::= ds !single_printable
(135<<16)+1,
// star ::= "*" !"/"
(182<<16)+1,
// slash ::= "/" !"*"
(183<<16)+1,
// slash_star ::= "/" "*"
(184<<16)+2,
// comment_printable ::= {" "..")" "+".."." "0".."~"}
(185<<16)+1,
// comment_stuff ::= comment_printable
(186<<16)+1,
// comment_stuff ::= star
(186<<16)+1,
// comment_stuff ::= slash
(186<<16)+1,
// comment_stuff ::= slash_star
(186<<16)+1,
// comment_stuff ::= eol
(186<<16)+1,
// comment ::= "/" "*" comment_stuff** "*" "/"
(135<<16)+5,
// comment ::= "/" "*" !comment_stuff "*" "/"
(135<<16)+4,
// eol ::= {10}
(178<<16)+1,
// eol ::= {13} {10}
(178<<16)+2,
// eol ::= {13} !10
(178<<16)+1,
// printable ::= {" ".."~"}
(153<<16)+1,
// token* ::= token* token
(190<<16)+2,
// token* ::= token
(190<<16)+1,
// digit++ ::= digit+ !digit
(154<<16)+1,
// oct_digit++ ::= oct_digit+ !oct_digit
(146<<16)+1,
// hex_digit++ ::= hex_digit+ !hex_digit
(152<<16)+1,
// idChar** ::= idChar* !idChar
(139<<16)+1,
// comment_stuff** ::= comment_stuff* !comment_stuff
(187<<16)+1,
// stringChar* ::= stringChar* stringChar
(173<<16)+2,
// stringChar* ::= stringChar
(173<<16)+1,
// white* ::= white* white
(2<<16)+2,
// white* ::= white
(2<<16)+1,
// single_printable** ::= single_printable* !single_printable
(181<<16)+1,
// digit+ ::= digit
(191<<16)+1,
// digit+ ::= digit+ digit
(191<<16)+2,
// single_printable* ::= single_printable* single_printable
(196<<16)+2,
// single_printable* ::= single_printable
(196<<16)+1,
// idChar* ::= idChar* idChar
(194<<16)+2,
// idChar* ::= idChar
(194<<16)+1,
// hex_digit+ ::= hex_digit
(193<<16)+1,
// hex_digit+ ::= hex_digit+ hex_digit
(193<<16)+2,
// comment_stuff* ::= comment_stuff* comment_stuff
(195<<16)+2,
// comment_stuff* ::= comment_stuff
(195<<16)+1,
// oct_digit+ ::= oct_digit
(192<<16)+1,
// oct_digit+ ::= oct_digit+ oct_digit
(192<<16)+2,
// $$0 ::= token*
(3<<16)+1,
// $$1 ::= dq white*
(174<<16)+2,
// $$1 ::= dq
(174<<16)+1,
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
177, // 9
188, // 10
-1, // 11
177, // 12
189, // 13
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
156, // " "
115, // "!"
162, // '"'
160, // "#"
160, // "$"
122, // "%"
123, // "&"
161, // "'"
124, // "("
125, // ")"
121, // "*"
119, // "+"
132, // ","
120, // "-"
131, // "."
136, // "/"
141, // "0"
144, // "1"
144, // "2"
144, // "3"
144, // "4"
144, // "5"
144, // "6"
144, // "7"
157, // "8"
157, // "9"
133, // ":"
134, // ";"
117, // "<"
116, // "="
118, // ">"
160, // "?"
160, // "@"
150, // "A"
150, // "B"
150, // "C"
150, // "D"
150, // "E"
150, // "F"
158, // "G"
158, // "H"
158, // "I"
158, // "J"
158, // "K"
158, // "L"
158, // "M"
158, // "N"
158, // "O"
158, // "P"
158, // "Q"
158, // "R"
158, // "S"
158, // "T"
158, // "U"
158, // "V"
158, // "W"
142, // "X"
158, // "Y"
158, // "Z"
128, // "["
170, // "\"
129, // "]"
160, // "^"
159, // "_"
160, // "`"
91, // "a"
95, // "b"
89, // "c"
100, // "d"
94, // "e"
105, // "f"
112, // "g"
104, // "h"
102, // "i"
158, // "j"
107, // "k"
90, // "l"
111, // "m"
97, // "n"
96, // "o"
109, // "p"
158, // "q"
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
160, // "~"
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
"", // 356
"", // 357
"", // 358
"", // 359
"", // 360
"", // 361
"", // 362
"", // 363
"", // 364
"", // 365
"", // 366
"", // 367
"", // 368
"", // 369
"token* ::= token* token", // 370
"token* ::= token* token", // 371
"digit++ ::= digit+ !digit", // 372
"oct_digit++ ::= oct_digit+ !oct_digit", // 373
"hex_digit++ ::= hex_digit+ !hex_digit", // 374
"idChar** ::= idChar* !idChar", // 375
"comment_stuff** ::= comment_stuff* !comment_stuff", // 376
"stringChar* ::= stringChar* stringChar", // 377
"stringChar* ::= stringChar* stringChar", // 378
"white* ::= white* white", // 379
"white* ::= white* white", // 380
"single_printable** ::= single_printable* !single_printable", // 381
"digit+ ::= digit", // 382
"digit+ ::= digit+ digit", // 383
"single_printable* ::= single_printable* single_printable", // 384
"single_printable* ::= single_printable* single_printable", // 385
"idChar* ::= idChar* idChar", // 386
"idChar* ::= idChar* idChar", // 387
"hex_digit+ ::= hex_digit", // 388
"hex_digit+ ::= hex_digit+ hex_digit", // 389
"comment_stuff* ::= comment_stuff* comment_stuff", // 390
"comment_stuff* ::= comment_stuff* comment_stuff", // 391
"oct_digit+ ::= oct_digit", // 392
"oct_digit+ ::= oct_digit+ oct_digit", // 393
"", // 394
"", // 395
"", // 396
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
    { // 306: oct_start ::= "0" !{"X" "x"} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 307: oct_digit ::= {"0".."7"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 308: oct_literal ::= [#] oct_start oct_digit++ white* @convertOctToInt(int,List<Character>)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 309: oct_literal ::= [#] oct_start oct_digit++ [white*] @convertOctToInt(int,List<Character>)=>int
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 310: hex_start ::= "0" {"X" "x"} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 311: hex_digit ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 312: hex_digit ::= {"A".."F" "a".."f"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 313: hex_literal ::= [#] hex_start hex_digit++ white* @convertHexToInt(int,List<Character>)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((86<<5)|0x5)/*methodCall:86*/,
    },
    { // 314: hex_literal ::= [#] hex_start hex_digit++ [white*] @convertHexToInt(int,List<Character>)=>int
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((86<<5)|0x5)/*methodCall:86*/,
    },
    { // 315: INT_LITERAL ::= oct_literal @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 316: INT_LITERAL ::= hex_literal @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 317: INT_LITERAL ::= "0" !printable white* @zero(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((87<<5)|0x5)/*methodCall:87*/,
    },
    { // 318: INT_LITERAL ::= "0" !printable [white*] @zero(char)=>int
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((87<<5)|0x5)/*methodCall:87*/,
    },
    { // 319: INT_LITERAL ::= !"0" [#] digit++ white* @convertToInt(int,List<Character>)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((88<<5)|0x5)/*methodCall:88*/,
    },
    { // 320: INT_LITERAL ::= !"0" [#] digit++ [white*] @convertToInt(int,List<Character>)=>int
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((88<<5)|0x5)/*methodCall:88*/,
    },
    { // 321: character_printable ::= {" ".."[" "]".."~"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 322: character_printable ::= back_back @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 323: character_printable ::= back_dquote @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 324: character_printable ::= back_squote @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 325: character_printable ::= back_n @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 326: character_printable ::= back_tab @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 327: character_printable ::= back_form @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 328: character_printable ::= back_return @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 329: back_back ::= "\" "\" @makeBackSlash(char,char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((89<<5)|0x5)/*methodCall:89*/,
    },
    { // 330: back_dquote ::= "\" '"' @makeDQuote(char,char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((90<<5)|0x5)/*methodCall:90*/,
    },
    { // 331: back_squote ::= "\" "'" @makeSQuote(char,char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((91<<5)|0x5)/*methodCall:91*/,
    },
    { // 332: back_n ::= "\" "n" @makeNewLine(char,char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((92<<5)|0x5)/*methodCall:92*/,
    },
    { // 333: back_tab ::= "\" "t" @makeTab(char,char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((93<<5)|0x5)/*methodCall:93*/,
    },
    { // 334: back_form ::= "\" "f" @makeForm(char,char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((94<<5)|0x5)/*methodCall:94*/,
    },
    { // 335: back_return ::= "\" "r" @makeReturn(char,char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((95<<5)|0x5)/*methodCall:95*/,
    },
    { // 336: dq ::= '"' @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 337: stringChar ::= !dq character_printable @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 338: STRING_LITERAL ::= dq stringChar* $$1 @makeString(List<Character>)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((96<<5)|0x5)/*methodCall:96*/,
    },
    { // 339: STRING_LITERAL ::= dq [stringChar*] $$1 @makeString(List<Character>)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((96<<5)|0x5)/*methodCall:96*/,
    },
    { // 340: sq ::= "'" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 341: CHARACTER_LITERAL ::= sq character_printable sq white* @makeChar(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((97<<5)|0x5)/*methodCall:97*/,
    },
    { // 342: CHARACTER_LITERAL ::= sq character_printable sq [white*] @makeChar(char)=>int
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((97<<5)|0x5)/*methodCall:97*/,
    },
    { // 343: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 344: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 345: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 346: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 347: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 348: white ::= {9 12 " "} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 349: white ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 350: white ::= comment @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 351: ds ::= "/" "/" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 352: single_printable ::= {9 12 " ".."~"} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 353: comment ::= ds single_printable** @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 354: comment ::= ds !single_printable [single_printable**] @void
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 355: star ::= "*" !"/" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 356: slash ::= "/" !"*" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 357: slash_star ::= [#] "/" "*" @errorMessage(int,char,char)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((98<<5)|0x5)/*methodCall:98*/,
    },
    { // 358: comment_printable ::= {" "..")" "+".."." "0".."~"} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 359: comment_stuff ::= comment_printable @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 360: comment_stuff ::= star @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 361: comment_stuff ::= slash @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 362: comment_stuff ::= [#] slash_star @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 363: comment_stuff ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 364: comment ::= "/" "*" comment_stuff** "*" "/" @void
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
    { // 365: comment ::= "/" "*" !comment_stuff [comment_stuff**] "*" "/" @void
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
    { // 366: eol ::= {10} [registerNewline] @void
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 367: eol ::= {13} {10} [registerNewline] @void
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 368: eol ::= {13} !10 [registerNewline] @void
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 369: printable ::= {" ".."~"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 370: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 371: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
    },
    { // 372: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 373: oct_digit++ ::= oct_digit+ !oct_digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 374: hex_digit++ ::= hex_digit+ !hex_digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 375: idChar** ::= idChar* !idChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 376: comment_stuff** ::= comment_stuff* !comment_stuff @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 377: stringChar* ::= stringChar* stringChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 378: stringChar* ::= [stringChar*] stringChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 379: white* ::= white* white @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 380: white* ::= [white*] white @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
    },
    { // 381: single_printable** ::= single_printable* !single_printable @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 382: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 383: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 384: single_printable* ::= single_printable* single_printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 385: single_printable* ::= [single_printable*] single_printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
    },
    { // 386: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 387: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 388: hex_digit+ ::= hex_digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 389: hex_digit+ ::= hex_digit+ hex_digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 390: comment_stuff* ::= comment_stuff* comment_stuff @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 391: comment_stuff* ::= [comment_stuff*] comment_stuff @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // 392: oct_digit+ ::= oct_digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 393: oct_digit+ ::= oct_digit+ oct_digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 394: $$0 ::= token* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 395: $$1 ::= dq white* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 396: $$1 ::= dq [white*] @pass
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
      ((99<<5)|0x5)/*methodCall:99*/,
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
      int result = actionObject.convertOctToInt(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 86: {
      int parm0 = (Integer)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      int result = actionObject.convertHexToInt(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 87: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.zero(parm0);
      si.pushPb(result);
    }
    break;
    case 88: {
      int parm0 = (Integer)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 89: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      char result = actionObject.makeBackSlash(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 90: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      char result = actionObject.makeDQuote(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 91: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      char result = actionObject.makeSQuote(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 92: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      char result = actionObject.makeNewLine(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 93: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      char result = actionObject.makeTab(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 94: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      char result = actionObject.makeForm(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 95: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      char result = actionObject.makeReturn(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 96: {
      List<Character> parm0 = (List<Character>)si.popPb();
      String result = actionObject.makeString(parm0);
      si.pushPb(result);
    }
    break;
    case 97: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.makeChar(parm0);
      si.pushPb(result);
    }
    break;
    case 98: {
      int parm0 = (Integer)si.popPb();
      char parm1 = (Character)si.popPb();
      char parm2 = (Character)si.popPb();
      actionObject.errorMessage(parm0,parm1,parm2);
    }
    break;
    case 99: {
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
"int convertOctToInt(int,List<Character>)",
"int convertHexToInt(int,List<Character>)",
"int zero(char)",
"int convertToInt(int,List<Character>)",
"char makeBackSlash(char,char)",
"char makeDQuote(char,char)",
"char makeSQuote(char,char)",
"char makeNewLine(char,char)",
"char makeTab(char,char)",
"char makeForm(char,char)",
"char makeReturn(char,char)",
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
2,1,
2,1,
2,1,
2,1,
2,1,
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
    0,
    -1,
    -1,
    1,
    -1,
    1,
    1,
    0,
    1,
    1,
    -1,
    1,
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
