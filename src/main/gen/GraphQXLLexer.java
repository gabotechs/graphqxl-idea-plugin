/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */


import java.util.Stack;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.github.gabotechs.graphqxlideaplugin.language.psi.GraphQXLTypes.*;

/**
 * This class is a scanner generated by
 * <a href="http://www.jflex.de/">JFlex</a>
 * from the specification file <tt>src/grammars/GraphQXLLexer.flex</tt>
 */

public class GraphQXLLexer implements FlexLexer {
 /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int QUOTED_STRING = 2;
  public static final int BLOCK_STRING = 4;
  public static final int VARIABLE_OR_TEMPLATE = 6;
  public static final int TEMPLATE = 8;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4, 4
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [9, 6, 6]
   * Total runtime size is 1824 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>12]|((ch>>6)&0x3f)]<<6)|(ch&0x3f)];
  }

  /* The ZZ_CMAP_Z table has 272 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\100\1\200\14\100\1\300\u0100\100");

  /* The ZZ_CMAP_Y table has 256 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\175\3\1\4\172\3\1\5\4\3");

  /* The ZZ_CMAP_A table has 384 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\2\1\3\2\5\1\3\22\0\1\2\1\20\1\12\1\4\1\10\1\0\1\35\1\0\1\22\1\23\1"+
    "\0\1\17\1\1\1\14\1\15\1\0\1\7\11\13\1\24\1\0\1\30\1\25\1\32\1\0\1\26\4\6\1"+
    "\16\25\6\1\27\1\11\1\31\1\0\1\6\1\0\1\50\1\53\1\54\1\60\1\46\1\57\1\6\1\55"+
    "\1\36\2\6\1\56\1\37\1\51\1\41\1\40\1\44\1\42\1\52\1\43\1\45\1\61\2\6\1\47"+
    "\1\6\1\21\1\33\1\34\7\0\1\5\242\0\2\5\125\0\1\1");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\5\0\1\1\2\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\5\2\1\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\12\4\1\26\2\27\1\30\3\26\1\31\1\32\1\33"+
    "\1\34\1\35\2\0\1\36\1\37\2\0\3\4\1\40"+
    "\10\4\1\0\1\26\1\0\1\41\1\0\2\42\1\0"+
    "\1\43\1\44\15\4\1\0\1\45\6\4\1\46\2\4"+
    "\1\47\6\4\1\50\3\4\1\51\1\52\4\4\1\53"+
    "\5\4\1\54\1\55\11\4\1\56\4\4\1\57\2\4"+
    "\1\60\1\61\1\62\2\4\1\63";

  private static int [] zzUnpackAction() {
    int [] result = new int[152];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\62\0\144\0\226\0\310\0\372\0\372\0\u012c"+
    "\0\u015e\0\u0190\0\u01c2\0\u01f4\0\u0226\0\u0258\0\u028a\0\u02bc"+
    "\0\372\0\372\0\372\0\372\0\372\0\372\0\372\0\372"+
    "\0\372\0\372\0\372\0\372\0\372\0\372\0\u02ee\0\u0320"+
    "\0\u0352\0\u0384\0\u03b6\0\u03e8\0\u041a\0\u044c\0\u047e\0\u04b0"+
    "\0\u04e2\0\372\0\u0514\0\372\0\u0546\0\u0578\0\u05aa\0\u05dc"+
    "\0\372\0\u060e\0\372\0\372\0\u0640\0\u0672\0\u06a4\0\372"+
    "\0\u06d6\0\u0708\0\u073a\0\u076c\0\u079e\0\u0190\0\u07d0\0\u0802"+
    "\0\u0834\0\u0866\0\u0898\0\u08ca\0\u08fc\0\u092e\0\u0514\0\372"+
    "\0\u0960\0\372\0\u0992\0\u09c4\0\u09f6\0\u09f6\0\372\0\372"+
    "\0\u0a28\0\u0a5a\0\u0a8c\0\u0abe\0\u0af0\0\u0b22\0\u0b54\0\u0b86"+
    "\0\u0bb8\0\u0bea\0\u0c1c\0\u0c4e\0\u0c80\0\u0cb2\0\372\0\u0ce4"+
    "\0\u0d16\0\u0d48\0\u0d7a\0\u0dac\0\u0dde\0\u0190\0\u0e10\0\u0e42"+
    "\0\u0190\0\u0e74\0\u0ea6\0\u0ed8\0\u0f0a\0\u0f3c\0\u0f6e\0\u0190"+
    "\0\u0fa0\0\u0fd2\0\u1004\0\u0190\0\u0190\0\u1036\0\u1068\0\u109a"+
    "\0\u10cc\0\u0190\0\u10fe\0\u1130\0\u1162\0\u1194\0\u11c6\0\u0190"+
    "\0\u0190\0\u11f8\0\u122a\0\u125c\0\u128e\0\u12c0\0\u12f2\0\u1324"+
    "\0\u1356\0\u1388\0\u0190\0\u13ba\0\u13ec\0\u141e\0\u1450\0\u0190"+
    "\0\u1482\0\u14b4\0\u0190\0\u0190\0\u0190\0\u14e6\0\u1518\0\u0190";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[152];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\6\1\7\2\10\1\11\1\6\1\12\1\13\1\14"+
    "\1\6\1\15\1\16\1\17\1\20\1\12\1\6\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\12"+
    "\1\41\1\42\1\43\1\44\1\45\1\46\3\12\1\47"+
    "\5\12\1\50\1\12\3\51\1\52\5\51\1\53\1\54"+
    "\47\51\2\55\2\10\5\55\1\56\1\57\47\55\6\52"+
    "\1\60\7\52\1\60\2\52\1\61\14\52\24\60\21\62"+
    "\1\63\12\62\1\64\25\62\64\0\2\10\56\0\3\11"+
    "\1\0\1\11\1\0\54\11\6\0\2\12\3\0\1\12"+
    "\2\0\1\12\17\0\24\12\15\0\1\65\1\66\27\0"+
    "\1\66\21\0\1\67\7\0\1\67\2\0\1\70\14\0"+
    "\24\67\12\0\1\71\56\0\1\16\3\0\1\16\1\0"+
    "\1\65\1\66\27\0\1\66\22\0\1\13\3\0\1\16"+
    "\63\0\1\72\52\0\2\12\3\0\1\12\2\0\1\12"+
    "\17\0\1\12\1\73\11\12\1\74\10\12\6\0\2\12"+
    "\3\0\1\12\2\0\1\12\17\0\7\12\1\75\14\12"+
    "\6\0\2\12\3\0\1\12\2\0\1\12\17\0\13\12"+
    "\1\76\10\12\6\0\2\12\3\0\1\12\2\0\1\12"+
    "\17\0\10\12\1\77\13\12\6\0\2\12\3\0\1\12"+
    "\2\0\1\12\17\0\11\12\1\100\12\12\6\0\2\12"+
    "\3\0\1\12\2\0\1\12\17\0\7\12\1\101\14\12"+
    "\6\0\2\12\3\0\1\12\2\0\1\12\17\0\13\12"+
    "\1\102\10\12\6\0\2\12\3\0\1\12\2\0\1\12"+
    "\17\0\13\12\1\103\10\12\6\0\2\12\3\0\1\12"+
    "\2\0\1\12\17\0\7\12\1\104\6\12\1\105\5\12"+
    "\6\0\2\12\3\0\1\12\2\0\1\12\17\0\1\106"+
    "\23\12\3\51\1\0\5\51\1\107\1\0\52\51\1\0"+
    "\56\51\2\55\2\0\5\55\2\0\47\55\2\110\2\0"+
    "\5\110\1\0\1\111\47\110\12\112\1\113\47\112\6\0"+
    "\2\60\3\0\1\60\2\0\1\60\17\0\24\60\21\62"+
    "\1\0\12\62\1\0\25\62\7\0\1\114\3\0\1\114"+
    "\55\0\1\115\3\0\1\115\1\116\2\0\1\116\50\0"+
    "\2\67\3\0\1\67\2\0\1\67\17\0\24\67\12\0"+
    "\1\117\64\0\1\120\52\0\2\12\3\0\1\12\2\0"+
    "\1\12\17\0\2\12\1\121\21\12\6\0\2\12\3\0"+
    "\1\12\2\0\1\12\17\0\2\12\1\122\2\12\1\123"+
    "\16\12\6\0\2\12\3\0\1\12\2\0\1\12\17\0"+
    "\5\12\1\124\16\12\6\0\2\12\3\0\1\12\2\0"+
    "\1\12\17\0\2\12\1\125\21\12\6\0\2\12\3\0"+
    "\1\12\2\0\1\12\17\0\2\12\1\126\21\12\6\0"+
    "\2\12\3\0\1\12\2\0\1\12\17\0\10\12\1\127"+
    "\13\12\6\0\2\12\3\0\1\12\2\0\1\12\17\0"+
    "\1\130\23\12\6\0\2\12\3\0\1\12\2\0\1\12"+
    "\17\0\7\12\1\131\14\12\6\0\2\12\3\0\1\12"+
    "\2\0\1\12\17\0\15\12\1\132\6\12\6\0\2\12"+
    "\3\0\1\12\2\0\1\12\17\0\12\12\1\133\4\12"+
    "\1\134\4\12\6\0\2\12\3\0\1\12\2\0\1\12"+
    "\17\0\4\12\1\135\17\12\12\0\1\136\47\0\12\112"+
    "\1\137\47\112\7\0\1\114\3\0\1\114\2\0\1\66"+
    "\27\0\1\66\22\0\1\115\3\0\1\115\54\0\2\12"+
    "\3\0\1\12\2\0\1\12\17\0\3\12\1\140\14\12"+
    "\1\141\3\12\6\0\2\12\3\0\1\12\2\0\1\12"+
    "\17\0\7\12\1\142\14\12\6\0\2\12\3\0\1\12"+
    "\2\0\1\12\17\0\10\12\1\143\13\12\6\0\2\12"+
    "\3\0\1\12\2\0\1\12\17\0\12\12\1\144\11\12"+
    "\6\0\2\12\3\0\1\12\2\0\1\12\17\0\10\12"+
    "\1\145\13\12\6\0\2\12\3\0\1\12\2\0\1\12"+
    "\17\0\10\12\1\146\13\12\6\0\2\12\3\0\1\12"+
    "\2\0\1\12\17\0\4\12\1\147\17\12\6\0\2\12"+
    "\3\0\1\12\2\0\1\12\17\0\3\12\1\150\20\12"+
    "\6\0\2\12\3\0\1\12\2\0\1\12\17\0\1\12"+
    "\1\151\22\12\6\0\2\12\3\0\1\12\2\0\1\12"+
    "\17\0\14\12\1\152\7\12\6\0\2\12\3\0\1\12"+
    "\2\0\1\12\17\0\20\12\1\153\3\12\6\0\2\12"+
    "\3\0\1\12\2\0\1\12\17\0\10\12\1\154\13\12"+
    "\6\0\2\12\3\0\1\12\2\0\1\12\17\0\10\12"+
    "\1\155\13\12\12\0\1\110\55\0\2\12\3\0\1\12"+
    "\2\0\1\12\17\0\4\12\1\156\17\12\6\0\2\12"+
    "\3\0\1\12\2\0\1\12\17\0\10\12\1\157\13\12"+
    "\6\0\2\12\3\0\1\12\2\0\1\12\17\0\5\12"+
    "\1\160\16\12\6\0\2\12\3\0\1\12\2\0\1\12"+
    "\17\0\4\12\1\161\17\12\6\0\2\12\3\0\1\12"+
    "\2\0\1\12\17\0\5\12\1\162\16\12\6\0\2\12"+
    "\3\0\1\12\2\0\1\12\17\0\12\12\1\163\11\12"+
    "\6\0\2\12\3\0\1\12\2\0\1\12\17\0\11\12"+
    "\1\164\12\12\6\0\2\12\3\0\1\12\2\0\1\12"+
    "\17\0\13\12\1\165\10\12\6\0\2\12\3\0\1\12"+
    "\2\0\1\12\17\0\16\12\1\166\5\12\6\0\2\12"+
    "\3\0\1\12\2\0\1\12\17\0\12\12\1\167\11\12"+
    "\6\0\2\12\3\0\1\12\2\0\1\12\17\0\1\12"+
    "\1\170\22\12\6\0\2\12\3\0\1\12\2\0\1\12"+
    "\17\0\16\12\1\171\5\12\6\0\2\12\3\0\1\12"+
    "\2\0\1\12\17\0\5\12\1\172\16\12\6\0\2\12"+
    "\3\0\1\12\2\0\1\12\17\0\1\12\1\173\22\12"+
    "\6\0\2\12\3\0\1\12\2\0\1\12\17\0\21\12"+
    "\1\174\2\12\6\0\2\12\3\0\1\12\2\0\1\12"+
    "\17\0\1\175\23\12\6\0\2\12\3\0\1\12\2\0"+
    "\1\12\17\0\5\12\1\176\16\12\6\0\2\12\3\0"+
    "\1\12\2\0\1\12\17\0\4\12\1\177\17\12\6\0"+
    "\2\12\3\0\1\12\2\0\1\12\17\0\4\12\1\200"+
    "\17\12\6\0\2\12\3\0\1\12\2\0\1\12\17\0"+
    "\12\12\1\201\11\12\6\0\2\12\3\0\1\12\2\0"+
    "\1\12\17\0\5\12\1\202\16\12\6\0\2\12\3\0"+
    "\1\12\2\0\1\12\17\0\10\12\1\203\13\12\6\0"+
    "\2\12\3\0\1\12\2\0\1\12\17\0\12\12\1\204"+
    "\11\12\6\0\2\12\3\0\1\12\2\0\1\12\17\0"+
    "\3\12\1\205\20\12\6\0\2\12\3\0\1\12\2\0"+
    "\1\12\17\0\12\12\1\206\11\12\6\0\2\12\3\0"+
    "\1\12\2\0\1\12\17\0\1\207\23\12\6\0\2\12"+
    "\3\0\1\12\2\0\1\12\17\0\1\210\23\12\6\0"+
    "\2\12\3\0\1\12\2\0\1\12\17\0\13\12\1\211"+
    "\10\12\6\0\2\12\3\0\1\12\2\0\1\12\17\0"+
    "\16\12\1\212\5\12\6\0\2\12\3\0\1\12\2\0"+
    "\1\12\17\0\13\12\1\213\10\12\6\0\2\12\3\0"+
    "\1\12\2\0\1\12\17\0\15\12\1\214\6\12\6\0"+
    "\2\12\3\0\1\12\2\0\1\12\17\0\2\12\1\215"+
    "\21\12\6\0\2\12\3\0\1\12\2\0\1\12\17\0"+
    "\23\12\1\216\6\0\2\12\3\0\1\12\2\0\1\12"+
    "\17\0\5\12\1\217\16\12\6\0\2\12\3\0\1\12"+
    "\2\0\1\12\17\0\10\12\1\220\13\12\6\0\2\12"+
    "\3\0\1\12\2\0\1\12\17\0\20\12\1\221\3\12"+
    "\6\0\2\12\3\0\1\12\2\0\1\12\17\0\5\12"+
    "\1\222\16\12\6\0\2\12\3\0\1\12\2\0\1\12"+
    "\17\0\10\12\1\223\13\12\6\0\2\12\3\0\1\12"+
    "\2\0\1\12\17\0\14\12\1\224\7\12\6\0\2\12"+
    "\3\0\1\12\2\0\1\12\17\0\10\12\1\225\13\12"+
    "\6\0\2\12\3\0\1\12\2\0\1\12\17\0\1\226"+
    "\23\12\6\0\2\12\3\0\1\12\2\0\1\12\17\0"+
    "\3\12\1\227\20\12\6\0\2\12\3\0\1\12\2\0"+
    "\1\12\17\0\13\12\1\230\10\12";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5450];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\5\0\2\11\11\1\16\11\13\1\1\11\1\1\1\11"+
    "\4\1\1\11\1\1\2\11\2\0\1\1\1\11\2\0"+
    "\14\1\1\0\1\11\1\0\1\11\1\0\2\1\1\0"+
    "\2\11\15\1\1\0\1\11\71\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[152];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */

    private static final class State {
        final int lBraceCount;
        final int state;

        public State(int state, int lBraceCount) {
            this.state = state;
            this.lBraceCount = lBraceCount;
        }

        @Override
        public String toString() {
            return "yystate = " + state + (lBraceCount == 0 ? "" : "lBraceCount = " + lBraceCount);
        }
    }

    protected final Stack<State> myStateStack = new Stack<State>();
    protected int myLeftBraceCount;

    private void pushState(int state) {
        myStateStack.push(new State(yystate(), myLeftBraceCount));
        myLeftBraceCount = 0;
        yybegin(state);
    }

    private void popState() {
        State state = myStateStack.pop();
        myLeftBraceCount = state.lBraceCount;
        yybegin(state.state);
    }

  public GraphQXLLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public GraphQXLLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
      myLeftBraceCount = 0;
  myStateStack.clear();

    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return BAD_CHARACTER;
            } 
            // fall through
          case 52: break;
          case 2: 
            { return WHITE_SPACE;
            } 
            // fall through
          case 53: break;
          case 3: 
            { return EOL_COMMENT;
            } 
            // fall through
          case 54: break;
          case 4: 
            { return NAME;
            } 
            // fall through
          case 55: break;
          case 5: 
            { return NUMBER;
            } 
            // fall through
          case 56: break;
          case 6: 
            { pushState(VARIABLE_OR_TEMPLATE); return DOLLAR;
            } 
            // fall through
          case 57: break;
          case 7: 
            { pushState(QUOTED_STRING); return OPEN_QUOTE;
            } 
            // fall through
          case 58: break;
          case 8: 
            { return BANG;
            } 
            // fall through
          case 59: break;
          case 9: 
            { return BRACE_L;
            } 
            // fall through
          case 60: break;
          case 10: 
            { return PAREN_L;
            } 
            // fall through
          case 61: break;
          case 11: 
            { return PAREN_R;
            } 
            // fall through
          case 62: break;
          case 12: 
            { return COLON;
            } 
            // fall through
          case 63: break;
          case 13: 
            { return EQUALS;
            } 
            // fall through
          case 64: break;
          case 14: 
            { return AT;
            } 
            // fall through
          case 65: break;
          case 15: 
            { return BRACKET_L;
            } 
            // fall through
          case 66: break;
          case 16: 
            { return ANGLE_BRACKET_L;
            } 
            // fall through
          case 67: break;
          case 17: 
            { return BRACKET_R;
            } 
            // fall through
          case 68: break;
          case 18: 
            { return ANGLE_BRACKET_R;
            } 
            // fall through
          case 69: break;
          case 19: 
            { return PIPE;
            } 
            // fall through
          case 70: break;
          case 20: 
            { return BRACE_R;
            } 
            // fall through
          case 71: break;
          case 21: 
            { return AMP;
            } 
            // fall through
          case 72: break;
          case 22: 
            { return REGULAR_STRING_PART;
            } 
            // fall through
          case 73: break;
          case 23: 
            { popState(); return BAD_CHARACTER;
            } 
            // fall through
          case 74: break;
          case 24: 
            { popState(); return CLOSING_QUOTE;
            } 
            // fall through
          case 75: break;
          case 25: 
            { popState(); return NAME;
            } 
            // fall through
          case 76: break;
          case 26: 
            { pushState(TEMPLATE); return BRACE_L;
            } 
            // fall through
          case 77: break;
          case 27: 
            { return TEMPLATE_CHAR;
            } 
            // fall through
          case 78: break;
          case 28: 
            { myLeftBraceCount++; return TEMPLATE_CHAR;
            } 
            // fall through
          case 79: break;
          case 29: 
            { if (myLeftBraceCount == 0) { popState(); popState(); return BRACE_R; } myLeftBraceCount--; return TEMPLATE_CHAR;
            } 
            // fall through
          case 80: break;
          case 30: 
            { return VARIABLE_NAME;
            } 
            // fall through
          case 81: break;
          case 31: 
            { return DOLLAR_BRACE_L;
            } 
            // fall through
          case 82: break;
          case 32: 
            { return ON_KEYWORD;
            } 
            // fall through
          case 83: break;
          case 33: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -1);
            { return REGULAR_STRING_PART;
            } 
            // fall through
          case 84: break;
          case 34: 
            { return FLOAT_NUMBER;
            } 
            // fall through
          case 85: break;
          case 35: 
            { pushState(BLOCK_STRING);  return OPEN_TRIPLE_QUOTE;
            } 
            // fall through
          case 86: break;
          case 36: 
            { return SPREAD;
            } 
            // fall through
          case 87: break;
          case 37: 
            { popState(); return CLOSING_TRIPLE_QUOTE;
            } 
            // fall through
          case 88: break;
          case 38: 
            { return TYPE_KEYWORD;
            } 
            // fall through
          case 89: break;
          case 39: 
            { return ENUM_KEYWORD;
            } 
            // fall through
          case 90: break;
          case 40: 
            { return INPUT_KEYWORD;
            } 
            // fall through
          case 91: break;
          case 41: 
            { return QUERY_KEYWORD;
            } 
            // fall through
          case 92: break;
          case 42: 
            { return UNION_KEYWORD;
            } 
            // fall through
          case 93: break;
          case 43: 
            { return IMPORT_KEYWORD;
            } 
            // fall through
          case 94: break;
          case 44: 
            { return SCALAR_KEYWORD;
            } 
            // fall through
          case 95: break;
          case 45: 
            { return SCHEMA_KEYWORD;
            } 
            // fall through
          case 96: break;
          case 46: 
            { return MUTATION_KEYWORD;
            } 
            // fall through
          case 97: break;
          case 47: 
            { return INTERFACE_KEYWORD;
            } 
            // fall through
          case 98: break;
          case 48: 
            { return DIRECTIVE_KEYWORD;
            } 
            // fall through
          case 99: break;
          case 49: 
            { return IMPLEMENTS_KEYWORD;
            } 
            // fall through
          case 100: break;
          case 50: 
            { return REPEATABLE_KEYWORD;
            } 
            // fall through
          case 101: break;
          case 51: 
            { return SUBSCRIPTION_KEYWORD;
            } 
            // fall through
          case 102: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
