// Generated from MyLange.g4 by ANTLR 4.7.2
package com.company;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyLangeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, OPERATOR=5, Print=6, LeftParen=7, RightParen=8, 
		IF=9, DO=10, While=11, Less=12, Greater=13, MinusMinus=14, PlusPlus=15, 
		Term=16, Equal=17, Asign=18, LeftBrace=19, RightBrace=20, Identifier=21, 
		LangDigit=22, Whitespace=23, Newline=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "OPERATOR", "Print", "LeftParen", "RightParen", 
			"IF", "DO", "While", "Less", "Greater", "MinusMinus", "PlusPlus", "Term", 
			"Equal", "Asign", "LeftBrace", "RightBrace", "Identifier", "Nondigit", 
			"LangDigit", "TDigit", "HexdecimalConstant", "HexdecimalDigit", "Whitespace", 
			"Newline"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'script:'", "'endscript'", "','", "'else'", null, "'print'", "'('", 
			"')'", "'if'", "'do'", "'while'", "'<'", "'>'", "'--'", "'++'", "';'", 
			"'='", "':='", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "OPERATOR", "Print", "LeftParen", "RightParen", 
			"IF", "DO", "While", "Less", "Greater", "MinusMinus", "PlusPlus", "Term", 
			"Equal", "Asign", "LeftBrace", "RightBrace", "Identifier", "LangDigit", 
			"Whitespace", "Newline"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public MyLangeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyLange.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00ab\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\26\7\26\u0085\n\26\f\26\16\26\u0088\13\26\3\27\3\27\3\30\3"+
		"\30\7\30\u008e\n\30\f\30\16\30\u0091\13\30\3\31\3\31\3\32\6\32\u0096\n"+
		"\32\r\32\16\32\u0097\3\33\3\33\3\34\6\34\u009d\n\34\r\34\16\34\u009e\3"+
		"\34\3\34\3\35\3\35\5\35\u00a5\n\35\3\35\5\35\u00a8\n\35\3\35\3\35\2\2"+
		"\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\2/\30\61\2\63\2\65\2\67\319\32\3\2"+
		"\7\5\2,-//\61\61\5\2C\\aac|\3\2\62;\5\2\62;CHch\4\2\13\13\"\"\2\u00ad"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2/\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\3;\3\2\2\2\5C\3\2\2\2\7M\3\2\2\2\tO\3\2\2\2\13T\3\2\2"+
		"\2\rV\3\2\2\2\17\\\3\2\2\2\21^\3\2\2\2\23`\3\2\2\2\25c\3\2\2\2\27f\3\2"+
		"\2\2\31l\3\2\2\2\33n\3\2\2\2\35p\3\2\2\2\37s\3\2\2\2!v\3\2\2\2#x\3\2\2"+
		"\2%z\3\2\2\2\'}\3\2\2\2)\177\3\2\2\2+\u0081\3\2\2\2-\u0089\3\2\2\2/\u008b"+
		"\3\2\2\2\61\u0092\3\2\2\2\63\u0095\3\2\2\2\65\u0099\3\2\2\2\67\u009c\3"+
		"\2\2\29\u00a7\3\2\2\2;<\7u\2\2<=\7e\2\2=>\7t\2\2>?\7k\2\2?@\7r\2\2@A\7"+
		"v\2\2AB\7<\2\2B\4\3\2\2\2CD\7g\2\2DE\7p\2\2EF\7f\2\2FG\7u\2\2GH\7e\2\2"+
		"HI\7t\2\2IJ\7k\2\2JK\7r\2\2KL\7v\2\2L\6\3\2\2\2MN\7.\2\2N\b\3\2\2\2OP"+
		"\7g\2\2PQ\7n\2\2QR\7u\2\2RS\7g\2\2S\n\3\2\2\2TU\t\2\2\2U\f\3\2\2\2VW\7"+
		"r\2\2WX\7t\2\2XY\7k\2\2YZ\7p\2\2Z[\7v\2\2[\16\3\2\2\2\\]\7*\2\2]\20\3"+
		"\2\2\2^_\7+\2\2_\22\3\2\2\2`a\7k\2\2ab\7h\2\2b\24\3\2\2\2cd\7f\2\2de\7"+
		"q\2\2e\26\3\2\2\2fg\7y\2\2gh\7j\2\2hi\7k\2\2ij\7n\2\2jk\7g\2\2k\30\3\2"+
		"\2\2lm\7>\2\2m\32\3\2\2\2no\7@\2\2o\34\3\2\2\2pq\7/\2\2qr\7/\2\2r\36\3"+
		"\2\2\2st\7-\2\2tu\7-\2\2u \3\2\2\2vw\7=\2\2w\"\3\2\2\2xy\7?\2\2y$\3\2"+
		"\2\2z{\7<\2\2{|\7?\2\2|&\3\2\2\2}~\7}\2\2~(\3\2\2\2\177\u0080\7\177\2"+
		"\2\u0080*\3\2\2\2\u0081\u0086\5-\27\2\u0082\u0085\5-\27\2\u0083\u0085"+
		"\5/\30\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087,\3\2\2\2\u0088\u0086\3\2\2\2"+
		"\u0089\u008a\t\3\2\2\u008a.\3\2\2\2\u008b\u008f\5\61\31\2\u008c\u008e"+
		"\5\65\33\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2"+
		"\u008f\u0090\3\2\2\2\u0090\60\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093"+
		"\t\4\2\2\u0093\62\3\2\2\2\u0094\u0096\5\65\33\2\u0095\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\64\3\2\2"+
		"\2\u0099\u009a\t\5\2\2\u009a\66\3\2\2\2\u009b\u009d\t\6\2\2\u009c\u009b"+
		"\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a1\b\34\2\2\u00a18\3\2\2\2\u00a2\u00a4\7\17\2"+
		"\2\u00a3\u00a5\7\f\2\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a8"+
		"\3\2\2\2\u00a6\u00a8\7\f\2\2\u00a7\u00a2\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00aa\b\35\2\2\u00aa:\3\2\2\2\n\2\u0084\u0086\u008f"+
		"\u0097\u009e\u00a4\u00a7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}