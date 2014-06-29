// Generated from Field.g4 by ANTLR 4.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FieldParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, Name=7, Int=8, WS=9, NL=10;
	public static final String[] tokenNames = {
		"<INVALID>", "'is'", "'at'", "','", "'scores'", "'points'", "'buried'", 
		"Name", "Int", "WS", "NL"
	};
	public static final int
		RULE_field = 0, RULE_points = 1, RULE_burial = 2, RULE_location = 3;
	public static final String[] ruleNames = {
		"field", "points", "burial", "location"
	};

	@Override
	public String getGrammarFileName() { return "Field.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public FieldParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FieldContext extends ParserRuleContext {
		public Token name;
		public TerminalNode Name() { return getToken(FieldParser.Name, 0); }
		public PointsContext points(int i) {
			return getRuleContext(PointsContext.class,i);
		}
		public BurialContext burial(int i) {
			return getRuleContext(BurialContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(FieldParser.NL); }
		public TerminalNode EOF() { return getToken(FieldParser.EOF, 0); }
		public List<PointsContext> points() {
			return getRuleContexts(PointsContext.class);
		}
		public List<BurialContext> burial() {
			return getRuleContexts(BurialContext.class);
		}
		public TerminalNode NL(int i) {
			return getToken(FieldParser.NL, i);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FieldListener ) ((FieldListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FieldListener ) ((FieldListener)listener).exitField(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_field);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(8); ((FieldContext)_localctx).name = match(Name);
			setState(9); match(NL);
			setState(13); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(10); points();
					setState(11); match(NL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(15); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(20); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(17); burial();
				setState(18); match(NL);
				}
				}
				setState(22); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Name );
			setState(24); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointsContext extends ParserRuleContext {
		public Token treasure;
		public Token value;
		public TerminalNode Name() { return getToken(FieldParser.Name, 0); }
		public List<TerminalNode> WS() { return getTokens(FieldParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FieldParser.WS, i);
		}
		public TerminalNode Int() { return getToken(FieldParser.Int, 0); }
		public PointsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_points; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FieldListener ) ((FieldListener)listener).enterPoints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FieldListener ) ((FieldListener)listener).exitPoints(this);
		}
	}

	public final PointsContext points() throws RecognitionException {
		PointsContext _localctx = new PointsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_points);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); ((PointsContext)_localctx).treasure = match(Name);
			setState(27); match(WS);
			setState(28); match(4);
			setState(29); match(WS);
			setState(30); ((PointsContext)_localctx).value = match(Int);
			setState(31); match(WS);
			setState(32); match(5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BurialContext extends ParserRuleContext {
		public Token treasure;
		public LocationContext at;
		public TerminalNode Name() { return getToken(FieldParser.Name, 0); }
		public List<TerminalNode> WS() { return getTokens(FieldParser.WS); }
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(FieldParser.WS, i);
		}
		public BurialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_burial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FieldListener ) ((FieldListener)listener).enterBurial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FieldListener ) ((FieldListener)listener).exitBurial(this);
		}
	}

	public final BurialContext burial() throws RecognitionException {
		BurialContext _localctx = new BurialContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_burial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); ((BurialContext)_localctx).treasure = match(Name);
			setState(35); match(WS);
			setState(36); match(1);
			setState(37); match(WS);
			setState(38); match(6);
			setState(39); match(WS);
			setState(40); match(2);
			setState(41); match(WS);
			setState(42); ((BurialContext)_localctx).at = location();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationContext extends ParserRuleContext {
		public Token x;
		public Token y;
		public TerminalNode Int(int i) {
			return getToken(FieldParser.Int, i);
		}
		public List<TerminalNode> Int() { return getTokens(FieldParser.Int); }
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FieldListener ) ((FieldListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FieldListener ) ((FieldListener)listener).exitLocation(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_location);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); ((LocationContext)_localctx).x = match(Int);
			setState(45); match(3);
			setState(46); ((LocationContext)_localctx).y = match(Int);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\2\3\f\63\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\2\6\2\20\n"+
		"\2\r\2\16\2\21\3\2\3\2\3\2\6\2\27\n\2\r\2\16\2\30\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\2\6\2\4\6\b\2\2\60\2\n\3\2\2\2\4\34\3\2\2\2\6$\3\2\2\2\b.\3"+
		"\2\2\2\n\13\7\t\2\2\13\17\7\f\2\2\f\r\5\4\3\2\r\16\7\f\2\2\16\20\3\2\2"+
		"\2\17\f\3\2\2\2\20\21\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\26\3\2\2"+
		"\2\23\24\5\6\4\2\24\25\7\f\2\2\25\27\3\2\2\2\26\23\3\2\2\2\27\30\3\2\2"+
		"\2\30\26\3\2\2\2\30\31\3\2\2\2\31\32\3\2\2\2\32\33\7\1\2\2\33\3\3\2\2"+
		"\2\34\35\7\t\2\2\35\36\7\13\2\2\36\37\7\6\2\2\37 \7\13\2\2 !\7\n\2\2!"+
		"\"\7\13\2\2\"#\7\7\2\2#\5\3\2\2\2$%\7\t\2\2%&\7\13\2\2&\'\7\3\2\2\'(\7"+
		"\13\2\2()\7\b\2\2)*\7\13\2\2*+\7\4\2\2+,\7\13\2\2,-\5\b\5\2-\7\3\2\2\2"+
		"./\7\n\2\2/\60\7\5\2\2\60\61\7\n\2\2\61\t\3\2\2\2\4\21\30";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}