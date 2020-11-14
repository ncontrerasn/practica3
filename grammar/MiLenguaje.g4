grammar MiLenguaje;

prog	: prog_fn main_prog ;

prog_fn	: fn_decl_list prog_fn
	    | /*Epsilon*/
	    ;

main_prog	: VAR var_decl ';' main_stmt TK_END
		    | main_stmt TK_END
		    ;

main_stmt	: stmt main_stmt
		    | /*Epsilon*/
		    ;

stmt	: TK_PRINT lexpr ';'
	    | TK_INPUT ID ';'
	    | TK_WHEN '(' lexpr ')' TK_DO stmt_block
	    | TK_IF '(' lexpr ')' TK_DO stmt_block TK_ELSE stmt_block
	    | TK_UNLESS '(' lexpr ')' TK_DO stmt_block
	    | TK_WHILE '(' lexpr ')' TK_DO stmt_block
	    | TK_RETURN lexpr ';'
	    | TK_UNTIL '(' lexpr ')' TK_DO stmt_block
	    | TK_LOOP stmt_block
	    | TK_DO stmt_block do_sig
	    | TK_REPEAT TK_NUM ':' stmt_block
	    | TK_FOR '(' lexpr ';' lexpr ';' lexpr ')' TK_DO stmt_block
	    | TK_NEXT ';'
	    | TK_BREAK ';'
	    | ID signo
	    | INCR ID ';'
	    | DCR ID ';'
	    ;

do_sig	: TK_WHILE '(' lexpr ')'
	    | TK_UNTIL '(' lexpr ')'
	    ;

signo	: ASIGOP lexpr2 ';'
	    | INCR ';'
	    | DCR ';'
	    ;

fn_decl_list	: TK_FUNCTION FID ':' DATATYPE '(' var_decl ')' fn_decl_list_withVAR stmt_block ;

fn_decl_list_withVAR	: VAR var_decl ';'
			            | /*Epsilon*/
			            ;

var_decl	: ID ':' DATATYPE cont_data ;

cont_data	: COLON ID ':' DATATYPE cont_data
		    | /*Epsilon*/
		    ;

stmt_block	: CORIZQ stmt stmt_mas '}'
		    | stmt
		    ;

stmt_mas	: stmt stmt_mas
		    | /*Epsilon*/
		    ;

lexpr	: nexpr nexpr_prima ;
lexpr2	: nexpr nexpr_prima_l2 ;

nexpr_prima_l2	: TK_AND lexpr_and
		        | TK_OR lexpr_or
		        | /*Epsilon*/
		        ;

nexpr_prima	: TK_AND lexpr_and
		    | TK_OR lexpr_or
		    | /*Epsilon*/
		    ;

lexpr_and	: nexpr nexpr_primab ;

nexpr_primab	: TK_AND lexpr_and
		        | /*Epsilon*/
		        ;

lexpr_or	: nexpr nexpr_primac ;

nexpr_primac	: TK_OR lexpr_or
		        | /*Epsilon*/
		        ;

nexpr	: TK_NOT '(' lexpr ')'
	    | rexpr
	    ;

rexpr	: simple_expr sig ;

sig	: ROP simple_expr
	| /*Epsilon*/
	;

simple_expr	: term t2 ;

t2	: SUMOP term t2
	| /*Epsilon*/
	;

term	: factor fa ;

fa	: MULOP factor fa
	| MODOP factor fa
	| /*Epsilon*/
	;

factor	: TK_NUM
	    | TK_BOOL
	    | ID s
	    | INCR ID
	    | DCR ID
	    | PIZQ lexpr ')'
	    | FID '(' lexpr f2 ')'
	    ;

s	: INCR
	| DCR
	| /*Epsilon*/
	;

f2	: COLON lexpr f2
	| /*Epsilon*/
	;

TK_AND  : ('and');
TK_OR   : ('or');
DATATYPE	: 'num'
		    | 'bool'
		    ;
WS		: [ \t\r\n]+ -> skip ;
LINE_COMMENT 	: '#' ~[\r\n]* -> skip ;
TK_BOOL	: ('true' | 'false') ;
TK_FUNCTION : 'function';
FID : [@][a-zA-Z]+;
VAR :'var';
TK_PRINT :'print' ;
TK_INPUT :'input' ;
TK_WHEN : 'when' ;
TK_IF : 'if' ;
TK_UNLESS : 'unless' ;
TK_END : 'end' ;
TK_WHILE : 'while' ;
TK_RETURN : 'return' ;
TK_UNTIL : 'until' ;
TK_LOOP : 'loop' ;
TK_DO : 'do' ;
TK_REPEAT : 'repeat' ;
TK_FOR : 'for' ;
TK_NEXT : 'next' ;
TK_BREAK : 'break' ;
TK_ELSE: 'else';
PIZQ	: '(' ;
PDER	: ')' ;
CORIZQ  : '{' ;
CORDER  : '}' ;
ROP		: ( '<' | '<=' | '>=' | '>' | '==' | '!=' ) ;
ASIGOP  : ( ':=' | '+=' | '-=' | '*=' | '/=' | '%=' ) ;
SMCOLON : ';' ;
MULOP	: ( '*' | '/' );
SUMOP	: ('+' | '-') ;
MODOP   : '%';
COLON   : ',';
INCR    : '++';
DCR     : '--';
TK_NOT  : 'not';
TK_NUM: [0-9]+;
DOUBLE	: [0-9]+( | [.][0-9]+);
ID	:[a-zA-Z][a-zA-Z0-9_]*;