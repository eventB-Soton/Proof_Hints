package ac.soton.xeventb.xproofassistant.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXProofAssistantLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_INT=7;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int RULE_XLABEL=6;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators

    public InternalXProofAssistantLexer() {;} 
    public InternalXProofAssistantLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalXProofAssistantLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalXProofAssistant.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:11:7: ( 'ProofAssistant' )
            // InternalXProofAssistant.g:11:9: 'ProofAssistant'
            {
            match("ProofAssistant"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:12:7: ( 'supports' )
            // InternalXProofAssistant.g:12:9: 'supports'
            {
            match("supports"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:13:7: ( 'hints' )
            // InternalXProofAssistant.g:13:9: 'hints'
            {
            match("hints"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:14:7: ( 'end' )
            // InternalXProofAssistant.g:14:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:15:7: ( 'for' )
            // InternalXProofAssistant.g:15:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:16:7: ( 'selects' )
            // InternalXProofAssistant.g:16:9: 'selects'
            {
            match("selects"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:17:7: ( 'cases' )
            // InternalXProofAssistant.g:17:9: 'cases'
            {
            match("cases"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:18:7: ( 'BOOL' )
            // InternalXProofAssistant.g:18:9: 'BOOL'
            {
            match("BOOL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:19:7: ( 'FALSE' )
            // InternalXProofAssistant.g:19:9: 'FALSE'
            {
            match("FALSE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:20:7: ( 'TRUE' )
            // InternalXProofAssistant.g:20:9: 'TRUE'
            {
            match("TRUE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:21:7: ( 'bool' )
            // InternalXProofAssistant.g:21:9: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:22:7: ( 'card' )
            // InternalXProofAssistant.g:22:9: 'card'
            {
            match("card"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:23:7: ( 'dom' )
            // InternalXProofAssistant.g:23:9: 'dom'
            {
            match("dom"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:24:7: ( 'finite' )
            // InternalXProofAssistant.g:24:9: 'finite'
            {
            match("finite"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:25:7: ( 'id' )
            // InternalXProofAssistant.g:25:9: 'id'
            {
            match("id"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:26:7: ( 'inter' )
            // InternalXProofAssistant.g:26:9: 'inter'
            {
            match("inter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:27:7: ( 'max' )
            // InternalXProofAssistant.g:27:9: 'max'
            {
            match("max"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:28:7: ( 'min' )
            // InternalXProofAssistant.g:28:9: 'min'
            {
            match("min"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:29:7: ( 'mod' )
            // InternalXProofAssistant.g:29:9: 'mod'
            {
            match("mod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:30:7: ( 'pred' )
            // InternalXProofAssistant.g:30:9: 'pred'
            {
            match("pred"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:31:7: ( 'prj1' )
            // InternalXProofAssistant.g:31:9: 'prj1'
            {
            match("prj1"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:32:7: ( 'prj2' )
            // InternalXProofAssistant.g:32:9: 'prj2'
            {
            match("prj2"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:33:7: ( 'ran' )
            // InternalXProofAssistant.g:33:9: 'ran'
            {
            match("ran"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:34:7: ( 'succ' )
            // InternalXProofAssistant.g:34:9: 'succ'
            {
            match("succ"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:35:7: ( 'union' )
            // InternalXProofAssistant.g:35:9: 'union'
            {
            match("union"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:36:7: ( '\\u21151' )
            // InternalXProofAssistant.g:36:9: '\\u21151'
            {
            match("\u21151"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:37:7: ( '\\u2115' )
            // InternalXProofAssistant.g:37:9: '\\u2115'
            {
            match('\u2115'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:38:7: ( '\\u21191' )
            // InternalXProofAssistant.g:38:9: '\\u21191'
            {
            match("\u21191"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:39:7: ( '\\u2119' )
            // InternalXProofAssistant.g:39:9: '\\u2119'
            {
            match('\u2119'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:40:7: ( '\\u2124' )
            // InternalXProofAssistant.g:40:9: '\\u2124'
            {
            match('\u2124'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:41:7: ( '(' )
            // InternalXProofAssistant.g:41:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:42:7: ( ')' )
            // InternalXProofAssistant.g:42:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:43:7: ( '\\u21D4' )
            // InternalXProofAssistant.g:43:9: '\\u21D4'
            {
            match('\u21D4'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:44:7: ( '\\u21D2' )
            // InternalXProofAssistant.g:44:9: '\\u21D2'
            {
            match('\u21D2'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:45:7: ( '\\u2227' )
            // InternalXProofAssistant.g:45:9: '\\u2227'
            {
            match('\u2227'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:46:7: ( '&' )
            // InternalXProofAssistant.g:46:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:47:7: ( '\\u2228' )
            // InternalXProofAssistant.g:47:9: '\\u2228'
            {
            match('\u2228'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:48:7: ( '\\u00AC' )
            // InternalXProofAssistant.g:48:9: '\\u00AC'
            {
            match('\u00AC'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:49:7: ( '\\u22A4' )
            // InternalXProofAssistant.g:49:9: '\\u22A4'
            {
            match('\u22A4'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:50:7: ( '\\u22A5' )
            // InternalXProofAssistant.g:50:9: '\\u22A5'
            {
            match('\u22A5'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:51:7: ( '\\u2200' )
            // InternalXProofAssistant.g:51:9: '\\u2200'
            {
            match('\u2200'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:52:7: ( '!' )
            // InternalXProofAssistant.g:52:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:53:7: ( '\\u2203' )
            // InternalXProofAssistant.g:53:9: '\\u2203'
            {
            match('\u2203'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:54:7: ( '#' )
            // InternalXProofAssistant.g:54:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:55:7: ( ',' )
            // InternalXProofAssistant.g:55:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:56:7: ( '\\u00B7' )
            // InternalXProofAssistant.g:56:9: '\\u00B7'
            {
            match('\u00B7'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:57:7: ( '.' )
            // InternalXProofAssistant.g:57:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:58:7: ( '=' )
            // InternalXProofAssistant.g:58:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:59:7: ( '\\u2260' )
            // InternalXProofAssistant.g:59:9: '\\u2260'
            {
            match('\u2260'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:60:7: ( '\\u2264' )
            // InternalXProofAssistant.g:60:9: '\\u2264'
            {
            match('\u2264'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:61:7: ( '<' )
            // InternalXProofAssistant.g:61:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:62:7: ( '\\u2265' )
            // InternalXProofAssistant.g:62:9: '\\u2265'
            {
            match('\u2265'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:63:7: ( '>' )
            // InternalXProofAssistant.g:63:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:64:7: ( '\\u2208' )
            // InternalXProofAssistant.g:64:9: '\\u2208'
            {
            match('\u2208'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:65:7: ( ':' )
            // InternalXProofAssistant.g:65:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:66:7: ( '\\u2209' )
            // InternalXProofAssistant.g:66:9: '\\u2209'
            {
            match('\u2209'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:67:7: ( '\\u2282' )
            // InternalXProofAssistant.g:67:9: '\\u2282'
            {
            match('\u2282'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:68:7: ( '\\u2284' )
            // InternalXProofAssistant.g:68:9: '\\u2284'
            {
            match('\u2284'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:69:7: ( '\\u2286' )
            // InternalXProofAssistant.g:69:9: '\\u2286'
            {
            match('\u2286'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:70:7: ( '\\u2288' )
            // InternalXProofAssistant.g:70:9: '\\u2288'
            {
            match('\u2288'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:71:7: ( 'partition' )
            // InternalXProofAssistant.g:71:9: 'partition'
            {
            match("partition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:72:7: ( '\\u2194' )
            // InternalXProofAssistant.g:72:9: '\\u2194'
            {
            match('\u2194'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:73:7: ( '\\uE100' )
            // InternalXProofAssistant.g:73:9: '\\uE100'
            {
            match('\uE100'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:74:7: ( '\\uE101' )
            // InternalXProofAssistant.g:74:9: '\\uE101'
            {
            match('\uE101'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:75:7: ( '\\uE102' )
            // InternalXProofAssistant.g:75:9: '\\uE102'
            {
            match('\uE102'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:76:7: ( '\\u21F8' )
            // InternalXProofAssistant.g:76:9: '\\u21F8'
            {
            match('\u21F8'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:77:7: ( '\\u2192' )
            // InternalXProofAssistant.g:77:9: '\\u2192'
            {
            match('\u2192'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:78:7: ( '\\u2914' )
            // InternalXProofAssistant.g:78:9: '\\u2914'
            {
            match('\u2914'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:79:7: ( '\\u21A3' )
            // InternalXProofAssistant.g:79:9: '\\u21A3'
            {
            match('\u21A3'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:80:7: ( '\\u2900' )
            // InternalXProofAssistant.g:80:9: '\\u2900'
            {
            match('\u2900'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:81:7: ( '\\u21A0' )
            // InternalXProofAssistant.g:81:9: '\\u21A0'
            {
            match('\u21A0'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:82:7: ( '\\u2916' )
            // InternalXProofAssistant.g:82:9: '\\u2916'
            {
            match('\u2916'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:83:7: ( '{' )
            // InternalXProofAssistant.g:83:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:84:7: ( '}' )
            // InternalXProofAssistant.g:84:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:85:7: ( '\\u21A6' )
            // InternalXProofAssistant.g:85:9: '\\u21A6'
            {
            match('\u21A6'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:86:7: ( '\\u2205' )
            // InternalXProofAssistant.g:86:9: '\\u2205'
            {
            match('\u2205'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:87:7: ( '\\u2229' )
            // InternalXProofAssistant.g:87:9: '\\u2229'
            {
            match('\u2229'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:88:7: ( '\\u222A' )
            // InternalXProofAssistant.g:88:9: '\\u222A'
            {
            match('\u222A'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:89:7: ( '\\u2216' )
            // InternalXProofAssistant.g:89:9: '\\u2216'
            {
            match('\u2216'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:90:7: ( '\\u00D7' )
            // InternalXProofAssistant.g:90:9: '\\u00D7'
            {
            match('\u00D7'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:91:7: ( '[' )
            // InternalXProofAssistant.g:91:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:92:7: ( ']' )
            // InternalXProofAssistant.g:92:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:93:7: ( '\\uE103' )
            // InternalXProofAssistant.g:93:9: '\\uE103'
            {
            match('\uE103'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:94:7: ( '\\u2218' )
            // InternalXProofAssistant.g:94:9: '\\u2218'
            {
            match('\u2218'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:95:7: ( ';' )
            // InternalXProofAssistant.g:95:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:96:7: ( '\\u2297' )
            // InternalXProofAssistant.g:96:9: '\\u2297'
            {
            match('\u2297'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:97:7: ( '\\u2225' )
            // InternalXProofAssistant.g:97:9: '\\u2225'
            {
            match('\u2225'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:98:7: ( '\\u223C' )
            // InternalXProofAssistant.g:98:9: '\\u223C'
            {
            match('\u223C'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:99:8: ( '\\u25C1' )
            // InternalXProofAssistant.g:99:10: '\\u25C1'
            {
            match('\u25C1'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:100:8: ( '\\u2A64' )
            // InternalXProofAssistant.g:100:10: '\\u2A64'
            {
            match('\u2A64'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:101:8: ( '\\u25B7' )
            // InternalXProofAssistant.g:101:10: '\\u25B7'
            {
            match('\u25B7'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:102:8: ( '\\u2A65' )
            // InternalXProofAssistant.g:102:10: '\\u2A65'
            {
            match('\u2A65'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:103:8: ( '\\u03BB' )
            // InternalXProofAssistant.g:103:10: '\\u03BB'
            {
            match('\u03BB'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:104:8: ( '%' )
            // InternalXProofAssistant.g:104:10: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:105:8: ( '\\u22C2' )
            // InternalXProofAssistant.g:105:10: '\\u22C2'
            {
            match('\u22C2'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:106:8: ( '\\u22C3' )
            // InternalXProofAssistant.g:106:10: '\\u22C3'
            {
            match('\u22C3'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:107:8: ( '\\u2223' )
            // InternalXProofAssistant.g:107:10: '\\u2223'
            {
            match('\u2223'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:108:8: ( '\\u2025' )
            // InternalXProofAssistant.g:108:10: '\\u2025'
            {
            match('\u2025'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:109:8: ( '+' )
            // InternalXProofAssistant.g:109:10: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:110:8: ( '\\u2212' )
            // InternalXProofAssistant.g:110:10: '\\u2212'
            {
            match('\u2212'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:111:8: ( '-' )
            // InternalXProofAssistant.g:111:10: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:112:8: ( '\\u2217' )
            // InternalXProofAssistant.g:112:10: '\\u2217'
            {
            match('\u2217'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:113:8: ( '*' )
            // InternalXProofAssistant.g:113:10: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:114:8: ( '\\u00F7' )
            // InternalXProofAssistant.g:114:10: '\\u00F7'
            {
            match('\u00F7'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:115:8: ( '/' )
            // InternalXProofAssistant.g:115:10: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:116:8: ( '^' )
            // InternalXProofAssistant.g:116:10: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:117:8: ( '\\\\' )
            // InternalXProofAssistant.g:117:10: '\\\\'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "RULE_XLABEL"
    public final void mRULE_XLABEL() throws RecognitionException {
        try {
            int _type = RULE_XLABEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:1123:13: ( '@' (~ ( ':' ) )+ ':' )
            // InternalXProofAssistant.g:1123:15: '@' (~ ( ':' ) )+ ':'
            {
            match('@'); 
            // InternalXProofAssistant.g:1123:19: (~ ( ':' ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='9')||(LA1_0>=';' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalXProofAssistant.g:1123:19: ~ ( ':' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='9')||(input.LA(1)>=';' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_XLABEL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:1125:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | 'i' .. '\\uFFDC' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | 'i' .. '\\uFFDC' | '0' .. '9' | '\\'' )* )
            // InternalXProofAssistant.g:1125:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | 'i' .. '\\uFFDC' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | 'i' .. '\\uFFDC' | '0' .. '9' | '\\'' )*
            {
            // InternalXProofAssistant.g:1125:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalXProofAssistant.g:1125:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='\uFFDC') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalXProofAssistant.g:1125:54: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | 'i' .. '\\uFFDC' | '0' .. '9' | '\\'' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\''||(LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='\uFFDC')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalXProofAssistant.g:
            	    {
            	    if ( input.LA(1)=='\''||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='\uFFDC') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:1127:10: ( ( '0' .. '9' )+ )
            // InternalXProofAssistant.g:1127:12: ( '0' .. '9' )+
            {
            // InternalXProofAssistant.g:1127:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalXProofAssistant.g:1127:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:1129:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalXProofAssistant.g:1129:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalXProofAssistant.g:1129:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalXProofAssistant.g:1129:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalXProofAssistant.g:1129:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalXProofAssistant.g:1129:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalXProofAssistant.g:1129:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalXProofAssistant.g:1129:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalXProofAssistant.g:1129:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalXProofAssistant.g:1129:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalXProofAssistant.g:1129:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:1131:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalXProofAssistant.g:1131:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalXProofAssistant.g:1131:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalXProofAssistant.g:1131:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:1133:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalXProofAssistant.g:1133:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalXProofAssistant.g:1133:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalXProofAssistant.g:1133:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalXProofAssistant.g:1133:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalXProofAssistant.g:1133:41: ( '\\r' )? '\\n'
                    {
                    // InternalXProofAssistant.g:1133:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalXProofAssistant.g:1133:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:1135:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalXProofAssistant.g:1135:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalXProofAssistant.g:1135:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalXProofAssistant.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXProofAssistant.g:1137:16: ( . )
            // InternalXProofAssistant.g:1137:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalXProofAssistant.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | RULE_XLABEL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=115;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalXProofAssistant.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalXProofAssistant.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalXProofAssistant.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalXProofAssistant.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalXProofAssistant.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalXProofAssistant.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalXProofAssistant.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalXProofAssistant.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalXProofAssistant.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalXProofAssistant.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalXProofAssistant.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalXProofAssistant.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalXProofAssistant.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalXProofAssistant.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalXProofAssistant.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalXProofAssistant.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalXProofAssistant.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalXProofAssistant.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalXProofAssistant.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalXProofAssistant.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalXProofAssistant.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalXProofAssistant.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalXProofAssistant.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalXProofAssistant.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalXProofAssistant.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalXProofAssistant.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalXProofAssistant.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalXProofAssistant.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalXProofAssistant.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalXProofAssistant.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalXProofAssistant.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // InternalXProofAssistant.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // InternalXProofAssistant.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // InternalXProofAssistant.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // InternalXProofAssistant.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // InternalXProofAssistant.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // InternalXProofAssistant.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // InternalXProofAssistant.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // InternalXProofAssistant.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // InternalXProofAssistant.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // InternalXProofAssistant.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // InternalXProofAssistant.g:1:256: T__53
                {
                mT__53(); 

                }
                break;
            case 43 :
                // InternalXProofAssistant.g:1:262: T__54
                {
                mT__54(); 

                }
                break;
            case 44 :
                // InternalXProofAssistant.g:1:268: T__55
                {
                mT__55(); 

                }
                break;
            case 45 :
                // InternalXProofAssistant.g:1:274: T__56
                {
                mT__56(); 

                }
                break;
            case 46 :
                // InternalXProofAssistant.g:1:280: T__57
                {
                mT__57(); 

                }
                break;
            case 47 :
                // InternalXProofAssistant.g:1:286: T__58
                {
                mT__58(); 

                }
                break;
            case 48 :
                // InternalXProofAssistant.g:1:292: T__59
                {
                mT__59(); 

                }
                break;
            case 49 :
                // InternalXProofAssistant.g:1:298: T__60
                {
                mT__60(); 

                }
                break;
            case 50 :
                // InternalXProofAssistant.g:1:304: T__61
                {
                mT__61(); 

                }
                break;
            case 51 :
                // InternalXProofAssistant.g:1:310: T__62
                {
                mT__62(); 

                }
                break;
            case 52 :
                // InternalXProofAssistant.g:1:316: T__63
                {
                mT__63(); 

                }
                break;
            case 53 :
                // InternalXProofAssistant.g:1:322: T__64
                {
                mT__64(); 

                }
                break;
            case 54 :
                // InternalXProofAssistant.g:1:328: T__65
                {
                mT__65(); 

                }
                break;
            case 55 :
                // InternalXProofAssistant.g:1:334: T__66
                {
                mT__66(); 

                }
                break;
            case 56 :
                // InternalXProofAssistant.g:1:340: T__67
                {
                mT__67(); 

                }
                break;
            case 57 :
                // InternalXProofAssistant.g:1:346: T__68
                {
                mT__68(); 

                }
                break;
            case 58 :
                // InternalXProofAssistant.g:1:352: T__69
                {
                mT__69(); 

                }
                break;
            case 59 :
                // InternalXProofAssistant.g:1:358: T__70
                {
                mT__70(); 

                }
                break;
            case 60 :
                // InternalXProofAssistant.g:1:364: T__71
                {
                mT__71(); 

                }
                break;
            case 61 :
                // InternalXProofAssistant.g:1:370: T__72
                {
                mT__72(); 

                }
                break;
            case 62 :
                // InternalXProofAssistant.g:1:376: T__73
                {
                mT__73(); 

                }
                break;
            case 63 :
                // InternalXProofAssistant.g:1:382: T__74
                {
                mT__74(); 

                }
                break;
            case 64 :
                // InternalXProofAssistant.g:1:388: T__75
                {
                mT__75(); 

                }
                break;
            case 65 :
                // InternalXProofAssistant.g:1:394: T__76
                {
                mT__76(); 

                }
                break;
            case 66 :
                // InternalXProofAssistant.g:1:400: T__77
                {
                mT__77(); 

                }
                break;
            case 67 :
                // InternalXProofAssistant.g:1:406: T__78
                {
                mT__78(); 

                }
                break;
            case 68 :
                // InternalXProofAssistant.g:1:412: T__79
                {
                mT__79(); 

                }
                break;
            case 69 :
                // InternalXProofAssistant.g:1:418: T__80
                {
                mT__80(); 

                }
                break;
            case 70 :
                // InternalXProofAssistant.g:1:424: T__81
                {
                mT__81(); 

                }
                break;
            case 71 :
                // InternalXProofAssistant.g:1:430: T__82
                {
                mT__82(); 

                }
                break;
            case 72 :
                // InternalXProofAssistant.g:1:436: T__83
                {
                mT__83(); 

                }
                break;
            case 73 :
                // InternalXProofAssistant.g:1:442: T__84
                {
                mT__84(); 

                }
                break;
            case 74 :
                // InternalXProofAssistant.g:1:448: T__85
                {
                mT__85(); 

                }
                break;
            case 75 :
                // InternalXProofAssistant.g:1:454: T__86
                {
                mT__86(); 

                }
                break;
            case 76 :
                // InternalXProofAssistant.g:1:460: T__87
                {
                mT__87(); 

                }
                break;
            case 77 :
                // InternalXProofAssistant.g:1:466: T__88
                {
                mT__88(); 

                }
                break;
            case 78 :
                // InternalXProofAssistant.g:1:472: T__89
                {
                mT__89(); 

                }
                break;
            case 79 :
                // InternalXProofAssistant.g:1:478: T__90
                {
                mT__90(); 

                }
                break;
            case 80 :
                // InternalXProofAssistant.g:1:484: T__91
                {
                mT__91(); 

                }
                break;
            case 81 :
                // InternalXProofAssistant.g:1:490: T__92
                {
                mT__92(); 

                }
                break;
            case 82 :
                // InternalXProofAssistant.g:1:496: T__93
                {
                mT__93(); 

                }
                break;
            case 83 :
                // InternalXProofAssistant.g:1:502: T__94
                {
                mT__94(); 

                }
                break;
            case 84 :
                // InternalXProofAssistant.g:1:508: T__95
                {
                mT__95(); 

                }
                break;
            case 85 :
                // InternalXProofAssistant.g:1:514: T__96
                {
                mT__96(); 

                }
                break;
            case 86 :
                // InternalXProofAssistant.g:1:520: T__97
                {
                mT__97(); 

                }
                break;
            case 87 :
                // InternalXProofAssistant.g:1:526: T__98
                {
                mT__98(); 

                }
                break;
            case 88 :
                // InternalXProofAssistant.g:1:532: T__99
                {
                mT__99(); 

                }
                break;
            case 89 :
                // InternalXProofAssistant.g:1:538: T__100
                {
                mT__100(); 

                }
                break;
            case 90 :
                // InternalXProofAssistant.g:1:545: T__101
                {
                mT__101(); 

                }
                break;
            case 91 :
                // InternalXProofAssistant.g:1:552: T__102
                {
                mT__102(); 

                }
                break;
            case 92 :
                // InternalXProofAssistant.g:1:559: T__103
                {
                mT__103(); 

                }
                break;
            case 93 :
                // InternalXProofAssistant.g:1:566: T__104
                {
                mT__104(); 

                }
                break;
            case 94 :
                // InternalXProofAssistant.g:1:573: T__105
                {
                mT__105(); 

                }
                break;
            case 95 :
                // InternalXProofAssistant.g:1:580: T__106
                {
                mT__106(); 

                }
                break;
            case 96 :
                // InternalXProofAssistant.g:1:587: T__107
                {
                mT__107(); 

                }
                break;
            case 97 :
                // InternalXProofAssistant.g:1:594: T__108
                {
                mT__108(); 

                }
                break;
            case 98 :
                // InternalXProofAssistant.g:1:601: T__109
                {
                mT__109(); 

                }
                break;
            case 99 :
                // InternalXProofAssistant.g:1:608: T__110
                {
                mT__110(); 

                }
                break;
            case 100 :
                // InternalXProofAssistant.g:1:615: T__111
                {
                mT__111(); 

                }
                break;
            case 101 :
                // InternalXProofAssistant.g:1:622: T__112
                {
                mT__112(); 

                }
                break;
            case 102 :
                // InternalXProofAssistant.g:1:629: T__113
                {
                mT__113(); 

                }
                break;
            case 103 :
                // InternalXProofAssistant.g:1:636: T__114
                {
                mT__114(); 

                }
                break;
            case 104 :
                // InternalXProofAssistant.g:1:643: T__115
                {
                mT__115(); 

                }
                break;
            case 105 :
                // InternalXProofAssistant.g:1:650: T__116
                {
                mT__116(); 

                }
                break;
            case 106 :
                // InternalXProofAssistant.g:1:657: T__117
                {
                mT__117(); 

                }
                break;
            case 107 :
                // InternalXProofAssistant.g:1:664: T__118
                {
                mT__118(); 

                }
                break;
            case 108 :
                // InternalXProofAssistant.g:1:671: RULE_XLABEL
                {
                mRULE_XLABEL(); 

                }
                break;
            case 109 :
                // InternalXProofAssistant.g:1:683: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 110 :
                // InternalXProofAssistant.g:1:691: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 111 :
                // InternalXProofAssistant.g:1:700: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 112 :
                // InternalXProofAssistant.g:1:712: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 113 :
                // InternalXProofAssistant.g:1:728: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 114 :
                // InternalXProofAssistant.g:1:744: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 115 :
                // InternalXProofAssistant.g:1:752: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\20\150\1\177\1\u0081\1\u0082\2\uffff\1\u0085\1\u0086\1\u0087\1\uffff\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d\1\uffff\1\u008f\2\uffff\1\u0092\2\uffff\1\u0095\1\u0096\1\uffff\1\u0098\1\uffff\1\u009a\1\uffff\1\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\2\uffff\1\u00b6\1\u00b7\1\uffff\1\u00b9\1\u00ba\1\u00bb\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\uffff\1\u00c2\1\u00c3\1\u00c4\1\u00c5\1\uffff\1\u00c7\1\uffff\1\u00c9\1\uffff\1\u00cb\1\u00ce\1\u00cf\1\uffff\1\146\2\uffff\2\146\2\uffff\1\150\1\uffff\14\150\1\u00e4\10\150\1\u00ee\1\uffff\1\u00ef\124\uffff\5\150\1\u00f5\1\u00f6\7\150\1\u00fe\1\uffff\1\150\1\u0100\1\u0101\1\u0102\3\150\1\u0107\1\150\2\uffff\2\150\1\u010b\2\150\2\uffff\2\150\1\u0110\1\u0111\1\150\1\u0113\1\u0114\1\uffff\1\150\3\uffff\1\u0116\1\u0117\1\u0118\1\150\1\uffff\3\150\1\uffff\1\150\1\u011e\1\150\1\u0120\2\uffff\1\u0121\2\uffff\1\u0122\3\uffff\1\150\1\u0124\3\150\1\uffff\1\u0128\3\uffff\1\150\1\uffff\2\150\1\u012c\1\uffff\2\150\1\u012f\1\uffff\2\150\1\uffff\1\u0132\1\150\1\uffff\3\150\1\u0137\1\uffff";
    static final String DFA13_eofS =
        "\u0138\uffff";
    static final String DFA13_minS =
        "\1\0\1\162\1\145\1\151\1\156\1\151\1\141\1\117\1\101\1\122\2\157\1\144\3\141\1\156\3\47\2\uffff\3\47\1\uffff\5\47\1\uffff\1\47\2\uffff\1\47\2\uffff\2\47\1\uffff\1\47\1\uffff\1\47\1\uffff\30\47\2\uffff\2\47\1\uffff\10\47\1\uffff\4\47\1\uffff\1\47\1\uffff\1\47\1\uffff\1\47\1\52\1\101\1\uffff\1\0\2\uffff\2\0\2\uffff\1\157\1\uffff\1\143\1\154\1\156\1\144\1\162\1\156\1\162\1\117\1\114\1\125\1\157\1\155\1\47\1\164\1\170\1\156\1\144\1\145\1\162\1\156\1\151\1\47\1\uffff\1\47\124\uffff\1\157\1\160\1\143\1\145\1\164\2\47\1\151\1\145\1\144\1\114\1\123\1\105\1\154\1\47\1\uffff\1\145\3\47\1\144\1\61\1\164\1\47\1\157\2\uffff\1\146\1\157\1\47\1\143\1\163\2\uffff\1\164\1\163\2\47\1\105\2\47\1\uffff\1\162\3\uffff\3\47\1\151\1\uffff\1\156\1\101\1\162\1\uffff\1\164\1\47\1\145\1\47\2\uffff\1\47\2\uffff\1\47\3\uffff\1\164\1\47\1\163\1\164\1\163\1\uffff\1\47\3\uffff\1\151\1\uffff\2\163\1\47\1\uffff\1\157\1\151\1\47\1\uffff\1\156\1\163\1\uffff\1\47\1\164\1\uffff\1\141\1\156\1\164\1\47\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\162\1\165\1\151\1\156\1\157\1\141\1\117\1\101\1\122\2\157\1\156\1\157\1\162\1\141\1\156\3\uffdc\2\uffff\3\uffdc\1\uffff\5\uffdc\1\uffff\1\uffdc\2\uffff\1\uffdc\2\uffff\2\uffdc\1\uffff\1\uffdc\1\uffff\1\uffdc\1\uffff\30\uffdc\2\uffff\2\uffdc\1\uffff\10\uffdc\1\uffff\4\uffdc\1\uffff\1\uffdc\1\uffff\1\uffdc\1\uffff\1\uffdc\1\57\1\uffdc\1\uffff\1\uffff\2\uffff\2\uffff\2\uffff\1\157\1\uffff\1\160\1\154\1\156\1\144\1\162\1\156\1\163\1\117\1\114\1\125\1\157\1\155\1\uffdc\1\164\1\170\1\156\1\144\1\152\1\162\1\156\1\151\1\uffdc\1\uffff\1\uffdc\124\uffff\1\157\1\160\1\143\1\145\1\164\2\uffdc\1\151\1\145\1\144\1\114\1\123\1\105\1\154\1\uffdc\1\uffff\1\145\3\uffdc\1\144\1\62\1\164\1\uffdc\1\157\2\uffff\1\146\1\157\1\uffdc\1\143\1\163\2\uffff\1\164\1\163\2\uffdc\1\105\2\uffdc\1\uffff\1\162\3\uffff\3\uffdc\1\151\1\uffff\1\156\1\101\1\162\1\uffff\1\164\1\uffdc\1\145\1\uffdc\2\uffff\1\uffdc\2\uffff\1\uffdc\3\uffff\1\164\1\uffdc\1\163\1\164\1\163\1\uffff\1\uffdc\3\uffff\1\151\1\uffff\2\163\1\uffdc\1\uffff\1\157\1\151\1\uffdc\1\uffff\1\156\1\163\1\uffff\1\uffdc\1\164\1\uffff\1\141\1\156\1\164\1\uffdc\1\uffff";
    static final String DFA13_acceptS =
        "\24\uffff\1\37\1\40\3\uffff\1\44\5\uffff\1\52\1\uffff\1\54\1\55\1\uffff\1\57\1\60\2\uffff\1\63\1\uffff\1\65\1\uffff\1\67\30\uffff\1\121\1\122\2\uffff\1\125\10\uffff\1\136\4\uffff\1\143\1\uffff\1\145\1\uffff\1\147\3\uffff\1\153\1\uffff\1\155\1\156\2\uffff\1\162\1\163\1\uffff\1\155\26\uffff\1\33\1\uffff\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\132\1\133\1\134\1\135\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\1\150\1\160\1\161\1\151\1\152\1\153\1\154\1\156\1\157\1\162\17\uffff\1\17\11\uffff\1\32\1\34\5\uffff\1\4\1\5\7\uffff\1\15\1\uffff\1\21\1\22\1\23\4\uffff\1\27\3\uffff\1\30\4\uffff\1\14\1\10\1\uffff\1\12\1\13\1\uffff\1\24\1\25\1\26\5\uffff\1\3\1\uffff\1\7\1\11\1\20\1\uffff\1\31\3\uffff\1\16\3\uffff\1\6\2\uffff\1\2\2\uffff\1\75\4\uffff\1\1";
    static final String DFA13_specialS =
        "\1\2\137\uffff\1\3\2\uffff\1\0\1\1\u00d3\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\146\2\145\2\146\1\145\22\146\1\145\1\37\1\143\1\41\1\146\1\122\1\31\1\144\1\24\1\25\1\133\1\127\1\42\1\131\1\44\1\135\12\142\1\54\1\111\1\50\1\45\1\52\1\146\1\140\1\141\1\7\3\141\1\10\11\141\1\1\3\141\1\11\6\141\1\105\1\137\1\106\1\136\1\141\1\146\1\141\1\12\1\6\1\13\1\4\1\5\1\141\1\3\1\14\3\141\1\15\2\141\1\16\1\141\1\17\1\2\1\141\1\20\5\141\1\75\1\141\1\76\56\141\1\33\12\141\1\43\37\141\1\104\37\141\1\134\u02c3\141\1\121\u1c69\141\1\126\u00ef\141\1\21\3\141\1\22\12\141\1\23\155\141\1\67\1\141\1\62\13\141\1\73\2\141\1\71\2\141\1\77\53\141\1\27\1\141\1\26\43\141\1\66\7\141\1\36\2\141\1\40\1\141\1\100\2\141\1\53\1\55\10\141\1\130\3\141\1\103\1\132\1\110\12\141\1\125\1\141\1\113\1\141\1\30\1\32\1\101\1\102\21\141\1\114\43\141\1\46\3\141\1\47\1\51\34\141\1\56\1\141\1\57\1\141\1\60\1\141\1\61\16\141\1\112\14\141\1\34\1\35\34\141\1\123\1\124\u02f3\141\1\117\11\141\1\115\u033e\141\1\72\23\141\1\70\1\141\1\74\u014d\141\1\116\1\120\ub69a\141\1\63\1\64\1\65\1\107\u1ed9\141\43\146",
            "\1\147",
            "\1\152\17\uffff\1\151",
            "\1\153",
            "\1\154",
            "\1\156\5\uffff\1\155",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165\11\uffff\1\166",
            "\1\167\7\uffff\1\170\5\uffff\1\171",
            "\1\173\20\uffff\1\172",
            "\1\174",
            "\1\175",
            "\1\150\10\uffff\1\150\1\176\10\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\1\150\1\u0080\10\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "",
            "",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "",
            "",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "",
            "",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "",
            "",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\u00cc\4\uffff\1\u00cd",
            "\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "",
            "\72\u00d1\1\uffff\uffc5\u00d1",
            "",
            "",
            "\0\u00d3",
            "\0\u00d3",
            "",
            "",
            "\1\u00d5",
            "",
            "\1\u00d7\14\uffff\1\u00d6",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00de\1\u00dd",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9\4\uffff\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "",
            "\1\u00ff",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\u0103",
            "\1\u0104\1\u0105",
            "\1\u0106",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\u0108",
            "",
            "",
            "\1\u0109",
            "\1\u010a",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\u010c",
            "\1\u010d",
            "",
            "",
            "\1\u010e",
            "\1\u010f",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\u0112",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "",
            "\1\u0115",
            "",
            "",
            "",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\u0119",
            "",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "",
            "\1\u011d",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\u011f",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "",
            "",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "",
            "",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "",
            "",
            "",
            "\1\u0123",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "",
            "",
            "",
            "\1\u0129",
            "",
            "\1\u012a",
            "\1\u012b",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "",
            "\1\u012d",
            "\1\u012e",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "",
            "\1\u0130",
            "\1\u0131",
            "",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            "\1\u0133",
            "",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\150\10\uffff\12\150\7\uffff\32\150\4\uffff\1\150\1\uffff\uff7c\150",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | RULE_XLABEL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_99 = input.LA(1);

                        s = -1;
                        if ( ((LA13_99>='\u0000' && LA13_99<='\uFFFF')) ) {s = 211;}

                        else s = 102;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_100 = input.LA(1);

                        s = -1;
                        if ( ((LA13_100>='\u0000' && LA13_100<='\uFFFF')) ) {s = 211;}

                        else s = 102;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='P') ) {s = 1;}

                        else if ( (LA13_0=='s') ) {s = 2;}

                        else if ( (LA13_0=='h') ) {s = 3;}

                        else if ( (LA13_0=='e') ) {s = 4;}

                        else if ( (LA13_0=='f') ) {s = 5;}

                        else if ( (LA13_0=='c') ) {s = 6;}

                        else if ( (LA13_0=='B') ) {s = 7;}

                        else if ( (LA13_0=='F') ) {s = 8;}

                        else if ( (LA13_0=='T') ) {s = 9;}

                        else if ( (LA13_0=='b') ) {s = 10;}

                        else if ( (LA13_0=='d') ) {s = 11;}

                        else if ( (LA13_0=='i') ) {s = 12;}

                        else if ( (LA13_0=='m') ) {s = 13;}

                        else if ( (LA13_0=='p') ) {s = 14;}

                        else if ( (LA13_0=='r') ) {s = 15;}

                        else if ( (LA13_0=='u') ) {s = 16;}

                        else if ( (LA13_0=='\u2115') ) {s = 17;}

                        else if ( (LA13_0=='\u2119') ) {s = 18;}

                        else if ( (LA13_0=='\u2124') ) {s = 19;}

                        else if ( (LA13_0=='(') ) {s = 20;}

                        else if ( (LA13_0==')') ) {s = 21;}

                        else if ( (LA13_0=='\u21D4') ) {s = 22;}

                        else if ( (LA13_0=='\u21D2') ) {s = 23;}

                        else if ( (LA13_0=='\u2227') ) {s = 24;}

                        else if ( (LA13_0=='&') ) {s = 25;}

                        else if ( (LA13_0=='\u2228') ) {s = 26;}

                        else if ( (LA13_0=='\u00AC') ) {s = 27;}

                        else if ( (LA13_0=='\u22A4') ) {s = 28;}

                        else if ( (LA13_0=='\u22A5') ) {s = 29;}

                        else if ( (LA13_0=='\u2200') ) {s = 30;}

                        else if ( (LA13_0=='!') ) {s = 31;}

                        else if ( (LA13_0=='\u2203') ) {s = 32;}

                        else if ( (LA13_0=='#') ) {s = 33;}

                        else if ( (LA13_0==',') ) {s = 34;}

                        else if ( (LA13_0=='\u00B7') ) {s = 35;}

                        else if ( (LA13_0=='.') ) {s = 36;}

                        else if ( (LA13_0=='=') ) {s = 37;}

                        else if ( (LA13_0=='\u2260') ) {s = 38;}

                        else if ( (LA13_0=='\u2264') ) {s = 39;}

                        else if ( (LA13_0=='<') ) {s = 40;}

                        else if ( (LA13_0=='\u2265') ) {s = 41;}

                        else if ( (LA13_0=='>') ) {s = 42;}

                        else if ( (LA13_0=='\u2208') ) {s = 43;}

                        else if ( (LA13_0==':') ) {s = 44;}

                        else if ( (LA13_0=='\u2209') ) {s = 45;}

                        else if ( (LA13_0=='\u2282') ) {s = 46;}

                        else if ( (LA13_0=='\u2284') ) {s = 47;}

                        else if ( (LA13_0=='\u2286') ) {s = 48;}

                        else if ( (LA13_0=='\u2288') ) {s = 49;}

                        else if ( (LA13_0=='\u2194') ) {s = 50;}

                        else if ( (LA13_0=='\uE100') ) {s = 51;}

                        else if ( (LA13_0=='\uE101') ) {s = 52;}

                        else if ( (LA13_0=='\uE102') ) {s = 53;}

                        else if ( (LA13_0=='\u21F8') ) {s = 54;}

                        else if ( (LA13_0=='\u2192') ) {s = 55;}

                        else if ( (LA13_0=='\u2914') ) {s = 56;}

                        else if ( (LA13_0=='\u21A3') ) {s = 57;}

                        else if ( (LA13_0=='\u2900') ) {s = 58;}

                        else if ( (LA13_0=='\u21A0') ) {s = 59;}

                        else if ( (LA13_0=='\u2916') ) {s = 60;}

                        else if ( (LA13_0=='{') ) {s = 61;}

                        else if ( (LA13_0=='}') ) {s = 62;}

                        else if ( (LA13_0=='\u21A6') ) {s = 63;}

                        else if ( (LA13_0=='\u2205') ) {s = 64;}

                        else if ( (LA13_0=='\u2229') ) {s = 65;}

                        else if ( (LA13_0=='\u222A') ) {s = 66;}

                        else if ( (LA13_0=='\u2216') ) {s = 67;}

                        else if ( (LA13_0=='\u00D7') ) {s = 68;}

                        else if ( (LA13_0=='[') ) {s = 69;}

                        else if ( (LA13_0==']') ) {s = 70;}

                        else if ( (LA13_0=='\uE103') ) {s = 71;}

                        else if ( (LA13_0=='\u2218') ) {s = 72;}

                        else if ( (LA13_0==';') ) {s = 73;}

                        else if ( (LA13_0=='\u2297') ) {s = 74;}

                        else if ( (LA13_0=='\u2225') ) {s = 75;}

                        else if ( (LA13_0=='\u223C') ) {s = 76;}

                        else if ( (LA13_0=='\u25C1') ) {s = 77;}

                        else if ( (LA13_0=='\u2A64') ) {s = 78;}

                        else if ( (LA13_0=='\u25B7') ) {s = 79;}

                        else if ( (LA13_0=='\u2A65') ) {s = 80;}

                        else if ( (LA13_0=='\u03BB') ) {s = 81;}

                        else if ( (LA13_0=='%') ) {s = 82;}

                        else if ( (LA13_0=='\u22C2') ) {s = 83;}

                        else if ( (LA13_0=='\u22C3') ) {s = 84;}

                        else if ( (LA13_0=='\u2223') ) {s = 85;}

                        else if ( (LA13_0=='\u2025') ) {s = 86;}

                        else if ( (LA13_0=='+') ) {s = 87;}

                        else if ( (LA13_0=='\u2212') ) {s = 88;}

                        else if ( (LA13_0=='-') ) {s = 89;}

                        else if ( (LA13_0=='\u2217') ) {s = 90;}

                        else if ( (LA13_0=='*') ) {s = 91;}

                        else if ( (LA13_0=='\u00F7') ) {s = 92;}

                        else if ( (LA13_0=='/') ) {s = 93;}

                        else if ( (LA13_0=='^') ) {s = 94;}

                        else if ( (LA13_0=='\\') ) {s = 95;}

                        else if ( (LA13_0=='@') ) {s = 96;}

                        else if ( (LA13_0=='A'||(LA13_0>='C' && LA13_0<='E')||(LA13_0>='G' && LA13_0<='O')||(LA13_0>='Q' && LA13_0<='S')||(LA13_0>='U' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='a'||LA13_0=='g'||(LA13_0>='j' && LA13_0<='l')||(LA13_0>='n' && LA13_0<='o')||LA13_0=='q'||LA13_0=='t'||(LA13_0>='v' && LA13_0<='z')||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\u00AB')||(LA13_0>='\u00AD' && LA13_0<='\u00B6')||(LA13_0>='\u00B8' && LA13_0<='\u00D6')||(LA13_0>='\u00D8' && LA13_0<='\u00F6')||(LA13_0>='\u00F8' && LA13_0<='\u03BA')||(LA13_0>='\u03BC' && LA13_0<='\u2024')||(LA13_0>='\u2026' && LA13_0<='\u2114')||(LA13_0>='\u2116' && LA13_0<='\u2118')||(LA13_0>='\u211A' && LA13_0<='\u2123')||(LA13_0>='\u2125' && LA13_0<='\u2191')||LA13_0=='\u2193'||(LA13_0>='\u2195' && LA13_0<='\u219F')||(LA13_0>='\u21A1' && LA13_0<='\u21A2')||(LA13_0>='\u21A4' && LA13_0<='\u21A5')||(LA13_0>='\u21A7' && LA13_0<='\u21D1')||LA13_0=='\u21D3'||(LA13_0>='\u21D5' && LA13_0<='\u21F7')||(LA13_0>='\u21F9' && LA13_0<='\u21FF')||(LA13_0>='\u2201' && LA13_0<='\u2202')||LA13_0=='\u2204'||(LA13_0>='\u2206' && LA13_0<='\u2207')||(LA13_0>='\u220A' && LA13_0<='\u2211')||(LA13_0>='\u2213' && LA13_0<='\u2215')||(LA13_0>='\u2219' && LA13_0<='\u2222')||LA13_0=='\u2224'||LA13_0=='\u2226'||(LA13_0>='\u222B' && LA13_0<='\u223B')||(LA13_0>='\u223D' && LA13_0<='\u225F')||(LA13_0>='\u2261' && LA13_0<='\u2263')||(LA13_0>='\u2266' && LA13_0<='\u2281')||LA13_0=='\u2283'||LA13_0=='\u2285'||LA13_0=='\u2287'||(LA13_0>='\u2289' && LA13_0<='\u2296')||(LA13_0>='\u2298' && LA13_0<='\u22A3')||(LA13_0>='\u22A6' && LA13_0<='\u22C1')||(LA13_0>='\u22C4' && LA13_0<='\u25B6')||(LA13_0>='\u25B8' && LA13_0<='\u25C0')||(LA13_0>='\u25C2' && LA13_0<='\u28FF')||(LA13_0>='\u2901' && LA13_0<='\u2913')||LA13_0=='\u2915'||(LA13_0>='\u2917' && LA13_0<='\u2A63')||(LA13_0>='\u2A66' && LA13_0<='\uE0FF')||(LA13_0>='\uE104' && LA13_0<='\uFFDC')) ) {s = 97;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 98;}

                        else if ( (LA13_0=='\"') ) {s = 99;}

                        else if ( (LA13_0=='\'') ) {s = 100;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 101;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='$'||LA13_0=='?'||LA13_0=='`'||(LA13_0>='\uFFDD' && LA13_0<='\uFFFF')) ) {s = 102;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_96 = input.LA(1);

                        s = -1;
                        if ( ((LA13_96>='\u0000' && LA13_96<='9')||(LA13_96>=';' && LA13_96<='\uFFFF')) ) {s = 209;}

                        else s = 102;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}