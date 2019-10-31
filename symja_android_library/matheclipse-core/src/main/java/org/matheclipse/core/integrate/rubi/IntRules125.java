package org.matheclipse.core.integrate.rubi;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctions.*;
import org.matheclipse.core.interfaces.IAST;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules125 { 
  public static IAST RULES = List( 
IIntegrate(3126,Int(Power(Plus(Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),b_DEFAULT),a_,Times(c_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),CN1D2),x_Symbol),
    Condition(Int(Power(Plus(a,Times(Sqrt(Plus(Sqr(b),Sqr(c))),Cos(Subtract(Plus(d,Times(e,x)),ArcTan(b,c))))),CN1D2),x),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Sqr(c)),C0),GtQ(Plus(a,Sqrt(Plus(Sqr(b),Sqr(c)))),C0)))),
IIntegrate(3127,Int(Power(Plus(Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),b_DEFAULT),a_,Times(c_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),CN1D2),x_Symbol),
    Condition(Dist(Times(Sqrt(Times(Plus(a,Times(b,Cos(Plus(d,Times(e,x)))),Times(c,Sin(Plus(d,Times(e,x))))),Power(Plus(a,Sqrt(Plus(Sqr(b),Sqr(c)))),CN1))),Power(Plus(a,Times(b,Cos(Plus(d,Times(e,x)))),Times(c,Sin(Plus(d,Times(e,x))))),CN1D2)),Int(Power(Plus(Times(a,Power(Plus(a,Sqrt(Plus(Sqr(b),Sqr(c)))),CN1)),Times(Sqrt(Plus(Sqr(b),Sqr(c))),Cos(Subtract(Plus(d,Times(e,x)),ArcTan(b,c))),Power(Plus(a,Sqrt(Plus(Sqr(b),Sqr(c)))),CN1))),CN1D2),x),x),And(FreeQ(List(a,b,c,d,e),x),NeQ(Subtract(Subtract(Sqr(a),Sqr(b)),Sqr(c)),C0),NeQ(Plus(Sqr(b),Sqr(c)),C0),Not(GtQ(Plus(a,Sqrt(Plus(Sqr(b),Sqr(c)))),C0))))),
IIntegrate(3128,Int(Power(Plus(Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),b_DEFAULT),a_,Times(c_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),QQ(-3L,2L)),x_Symbol),
    Condition(Plus(Simp(Times(C2,Subtract(Times(c,Cos(Plus(d,Times(e,x)))),Times(b,Sin(Plus(d,Times(e,x))))),Power(Times(e,Subtract(Subtract(Sqr(a),Sqr(b)),Sqr(c)),Sqrt(Plus(a,Times(b,Cos(Plus(d,Times(e,x)))),Times(c,Sin(Plus(d,Times(e,x))))))),CN1)),x),Dist(Power(Subtract(Subtract(Sqr(a),Sqr(b)),Sqr(c)),CN1),Int(Sqrt(Plus(a,Times(b,Cos(Plus(d,Times(e,x)))),Times(c,Sin(Plus(d,Times(e,x)))))),x),x)),And(FreeQ(List(a,b,c,d,e),x),NeQ(Subtract(Subtract(Sqr(a),Sqr(b)),Sqr(c)),C0)))),
IIntegrate(3129,Int(Power(Plus(Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),b_DEFAULT),a_,Times(c_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),n_),x_Symbol),
    Condition(Plus(Simp(Times(Plus(Times(CN1,c,Cos(Plus(d,Times(e,x)))),Times(b,Sin(Plus(d,Times(e,x))))),Power(Plus(a,Times(b,Cos(Plus(d,Times(e,x)))),Times(c,Sin(Plus(d,Times(e,x))))),Plus(n,C1)),Power(Times(e,Plus(n,C1),Subtract(Subtract(Sqr(a),Sqr(b)),Sqr(c))),CN1)),x),Dist(Power(Times(Plus(n,C1),Subtract(Subtract(Sqr(a),Sqr(b)),Sqr(c))),CN1),Int(Times(Subtract(Subtract(Times(a,Plus(n,C1)),Times(b,Plus(n,C2),Cos(Plus(d,Times(e,x))))),Times(c,Plus(n,C2),Sin(Plus(d,Times(e,x))))),Power(Plus(a,Times(b,Cos(Plus(d,Times(e,x)))),Times(c,Sin(Plus(d,Times(e,x))))),Plus(n,C1))),x),x)),And(FreeQ(List(a,b,c,d,e),x),NeQ(Subtract(Subtract(Sqr(a),Sqr(b)),Sqr(c)),C0),LtQ(n,CN1),NeQ(n,QQ(-3L,2L))))),
IIntegrate(3130,Int(Times(Power(Plus(Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),b_DEFAULT),a_,Times(c_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),CN1),Plus(A_DEFAULT,Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),B_DEFAULT),Times(C_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Simp(Times(Subtract(Subtract(Times(C2,a,ASymbol),Times(b,BSymbol)),Times(c,C)),x,Power(Times(C2,Sqr(a)),CN1)),x),Negate(Simp(Times(Plus(Times(b,BSymbol),Times(c,C)),Subtract(Times(b,Cos(Plus(d,Times(e,x)))),Times(c,Sin(Plus(d,Times(e,x))))),Power(Times(C2,a,b,c,e),CN1)),x)),Simp(Times(Plus(Times(Sqr(a),Subtract(Times(b,BSymbol),Times(c,C))),Times(CN1,C2,a,ASymbol,Sqr(b)),Times(Sqr(b),Plus(Times(b,BSymbol),Times(c,C)))),Log(RemoveContent(Plus(a,Times(b,Cos(Plus(d,Times(e,x)))),Times(c,Sin(Plus(d,Times(e,x))))),x)),Power(Times(C2,Sqr(a),b,c,e),CN1)),x)),And(FreeQ(List(a,b,c,d,e,ASymbol,BSymbol,C),x),EqQ(Plus(Sqr(b),Sqr(c)),C0)))),
IIntegrate(3131,Int(Times(Power(Plus(Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),b_DEFAULT),a_,Times(c_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),CN1),Plus(A_DEFAULT,Times(C_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Simp(Times(Subtract(Times(C2,a,ASymbol),Times(c,C)),x,Power(Times(C2,Sqr(a)),CN1)),x),Negate(Simp(Times(C,Cos(Plus(d,Times(e,x))),Power(Times(C2,a,e),CN1)),x)),Simp(Times(c,C,Sin(Plus(d,Times(e,x))),Power(Times(C2,a,b,e),CN1)),x),Simp(Times(Plus(Times(CN1,Sqr(a),C),Times(C2,a,c,ASymbol),Times(Sqr(b),C)),Log(RemoveContent(Plus(a,Times(b,Cos(Plus(d,Times(e,x)))),Times(c,Sin(Plus(d,Times(e,x))))),x)),Power(Times(C2,Sqr(a),b,e),CN1)),x)),And(FreeQ(List(a,b,c,d,e,ASymbol,C),x),EqQ(Plus(Sqr(b),Sqr(c)),C0)))),
IIntegrate(3132,Int(Times(Plus(A_DEFAULT,Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),B_DEFAULT)),Power(Plus(Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),b_DEFAULT),a_,Times(c_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Plus(Simp(Times(Subtract(Times(C2,a,ASymbol),Times(b,BSymbol)),x,Power(Times(C2,Sqr(a)),CN1)),x),Simp(Times(BSymbol,Sin(Plus(d,Times(e,x))),Power(Times(C2,a,e),CN1)),x),Negate(Simp(Times(b,BSymbol,Cos(Plus(d,Times(e,x))),Power(Times(C2,a,c,e),CN1)),x)),Simp(Times(Plus(Times(Sqr(a),BSymbol),Times(CN1,C2,a,b,ASymbol),Times(Sqr(b),BSymbol)),Log(RemoveContent(Plus(a,Times(b,Cos(Plus(d,Times(e,x)))),Times(c,Sin(Plus(d,Times(e,x))))),x)),Power(Times(C2,Sqr(a),c,e),CN1)),x)),And(FreeQ(List(a,b,c,d,e,ASymbol,BSymbol),x),EqQ(Plus(Sqr(b),Sqr(c)),C0)))),
IIntegrate(3133,Int(Times(Power(Plus(a_DEFAULT,Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),b_DEFAULT),Times(c_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),CN1),Plus(A_DEFAULT,Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),B_DEFAULT),Times(C_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Simp(Times(Plus(Times(b,BSymbol),Times(c,C)),x,Power(Plus(Sqr(b),Sqr(c)),CN1)),x),Simp(Times(Subtract(Times(c,BSymbol),Times(b,C)),Log(Plus(a,Times(b,Cos(Plus(d,Times(e,x)))),Times(c,Sin(Plus(d,Times(e,x)))))),Power(Times(e,Plus(Sqr(b),Sqr(c))),CN1)),x)),And(FreeQ(List(a,b,c,d,e,ASymbol,BSymbol,C),x),NeQ(Plus(Sqr(b),Sqr(c)),C0),EqQ(Subtract(Times(ASymbol,Plus(Sqr(b),Sqr(c))),Times(a,Plus(Times(b,BSymbol),Times(c,C)))),C0)))),
IIntegrate(3134,Int(Times(Power(Plus(a_DEFAULT,Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),b_DEFAULT),Times(c_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),CN1),Plus(A_DEFAULT,Times(C_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))))),x_Symbol),
    Condition(Subtract(Simp(Times(c,C,x,Power(Plus(Sqr(b),Sqr(c)),CN1)),x),Simp(Times(b,C,Log(Plus(a,Times(b,Cos(Plus(d,Times(e,x)))),Times(c,Sin(Plus(d,Times(e,x)))))),Power(Times(e,Plus(Sqr(b),Sqr(c))),CN1)),x)),And(FreeQ(List(a,b,c,d,e,ASymbol,C),x),NeQ(Plus(Sqr(b),Sqr(c)),C0),EqQ(Subtract(Times(ASymbol,Plus(Sqr(b),Sqr(c))),Times(a,c,C)),C0)))),
IIntegrate(3135,Int(Times(Plus(A_DEFAULT,Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),B_DEFAULT)),Power(Plus(a_DEFAULT,Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),b_DEFAULT),Times(c_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Plus(Simp(Times(b,BSymbol,x,Power(Plus(Sqr(b),Sqr(c)),CN1)),x),Simp(Times(c,BSymbol,Log(Plus(a,Times(b,Cos(Plus(d,Times(e,x)))),Times(c,Sin(Plus(d,Times(e,x)))))),Power(Times(e,Plus(Sqr(b),Sqr(c))),CN1)),x)),And(FreeQ(List(a,b,c,d,e,ASymbol,BSymbol),x),NeQ(Plus(Sqr(b),Sqr(c)),C0),EqQ(Subtract(Times(ASymbol,Plus(Sqr(b),Sqr(c))),Times(a,b,BSymbol)),C0)))),
IIntegrate(3136,Int(Times(Power(Plus(a_DEFAULT,Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),b_DEFAULT),Times(c_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),CN1),Plus(A_DEFAULT,Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),B_DEFAULT),Times(C_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Simp(Times(Plus(Times(b,BSymbol),Times(c,C)),x,Power(Plus(Sqr(b),Sqr(c)),CN1)),x),Dist(Times(Subtract(Times(ASymbol,Plus(Sqr(b),Sqr(c))),Times(a,Plus(Times(b,BSymbol),Times(c,C)))),Power(Plus(Sqr(b),Sqr(c)),CN1)),Int(Power(Plus(a,Times(b,Cos(Plus(d,Times(e,x)))),Times(c,Sin(Plus(d,Times(e,x))))),CN1),x),x),Simp(Times(Subtract(Times(c,BSymbol),Times(b,C)),Log(Plus(a,Times(b,Cos(Plus(d,Times(e,x)))),Times(c,Sin(Plus(d,Times(e,x)))))),Power(Times(e,Plus(Sqr(b),Sqr(c))),CN1)),x)),And(FreeQ(List(a,b,c,d,e,ASymbol,BSymbol,C),x),NeQ(Plus(Sqr(b),Sqr(c)),C0),NeQ(Subtract(Times(ASymbol,Plus(Sqr(b),Sqr(c))),Times(a,Plus(Times(b,BSymbol),Times(c,C)))),C0)))),
IIntegrate(3137,Int(Times(Power(Plus(a_DEFAULT,Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),b_DEFAULT),Times(c_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),CN1),Plus(A_DEFAULT,Times(C_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Simp(Times(c,C,Plus(d,Times(e,x)),Power(Times(e,Plus(Sqr(b),Sqr(c))),CN1)),x),Dist(Times(Subtract(Times(ASymbol,Plus(Sqr(b),Sqr(c))),Times(a,c,C)),Power(Plus(Sqr(b),Sqr(c)),CN1)),Int(Power(Plus(a,Times(b,Cos(Plus(d,Times(e,x)))),Times(c,Sin(Plus(d,Times(e,x))))),CN1),x),x),Negate(Simp(Times(b,C,Log(Plus(a,Times(b,Cos(Plus(d,Times(e,x)))),Times(c,Sin(Plus(d,Times(e,x)))))),Power(Times(e,Plus(Sqr(b),Sqr(c))),CN1)),x))),And(FreeQ(List(a,b,c,d,e,ASymbol,C),x),NeQ(Plus(Sqr(b),Sqr(c)),C0),NeQ(Subtract(Times(ASymbol,Plus(Sqr(b),Sqr(c))),Times(a,c,C)),C0)))),
IIntegrate(3138,Int(Times(Plus(A_DEFAULT,Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),B_DEFAULT)),Power(Plus(a_DEFAULT,Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),b_DEFAULT),Times(c_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Plus(Simp(Times(b,BSymbol,Plus(d,Times(e,x)),Power(Times(e,Plus(Sqr(b),Sqr(c))),CN1)),x),Dist(Times(Subtract(Times(ASymbol,Plus(Sqr(b),Sqr(c))),Times(a,b,BSymbol)),Power(Plus(Sqr(b),Sqr(c)),CN1)),Int(Power(Plus(a,Times(b,Cos(Plus(d,Times(e,x)))),Times(c,Sin(Plus(d,Times(e,x))))),CN1),x),x),Simp(Times(c,BSymbol,Log(Plus(a,Times(b,Cos(Plus(d,Times(e,x)))),Times(c,Sin(Plus(d,Times(e,x)))))),Power(Times(e,Plus(Sqr(b),Sqr(c))),CN1)),x)),And(FreeQ(List(a,b,c,d,e,ASymbol,BSymbol),x),NeQ(Plus(Sqr(b),Sqr(c)),C0),NeQ(Subtract(Times(ASymbol,Plus(Sqr(b),Sqr(c))),Times(a,b,BSymbol)),C0)))),
IIntegrate(3139,Int(Times(Power(Plus(Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),b_DEFAULT),a_,Times(c_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),n_DEFAULT),Plus(A_DEFAULT,Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),B_DEFAULT),Times(C_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))))),x_Symbol),
    Condition(Simp(Times(Plus(Times(BSymbol,c),Times(CN1,b,C),Times(CN1,a,C,Cos(Plus(d,Times(e,x)))),Times(a,BSymbol,Sin(Plus(d,Times(e,x))))),Power(Plus(a,Times(b,Cos(Plus(d,Times(e,x)))),Times(c,Sin(Plus(d,Times(e,x))))),n),Power(Times(a,e,Plus(n,C1)),CN1)),x),And(FreeQ(List(a,b,c,d,e,ASymbol,BSymbol,C,n),x),NeQ(n,CN1),EqQ(Subtract(Subtract(Sqr(a),Sqr(b)),Sqr(c)),C0),EqQ(Plus(Times(Plus(Times(b,BSymbol),Times(c,C)),n),Times(a,ASymbol,Plus(n,C1))),C0)))),
IIntegrate(3140,Int(Times(Power(Plus(Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),b_DEFAULT),a_,Times(c_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),n_DEFAULT),Plus(A_DEFAULT,Times(C_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))))),x_Symbol),
    Condition(Negate(Simp(Times(Plus(Times(b,C),Times(a,C,Cos(Plus(d,Times(e,x))))),Power(Plus(a,Times(b,Cos(Plus(d,Times(e,x)))),Times(c,Sin(Plus(d,Times(e,x))))),n),Power(Times(a,e,Plus(n,C1)),CN1)),x)),And(FreeQ(List(a,b,c,d,e,ASymbol,C,n),x),NeQ(n,CN1),EqQ(Subtract(Subtract(Sqr(a),Sqr(b)),Sqr(c)),C0),EqQ(Plus(Times(c,C,n),Times(a,ASymbol,Plus(n,C1))),C0)))),
IIntegrate(3141,Int(Times(Plus(A_DEFAULT,Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),B_DEFAULT)),Power(Plus(Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),b_DEFAULT),a_,Times(c_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Simp(Times(Plus(Times(BSymbol,c),Times(a,BSymbol,Sin(Plus(d,Times(e,x))))),Power(Plus(a,Times(b,Cos(Plus(d,Times(e,x)))),Times(c,Sin(Plus(d,Times(e,x))))),n),Power(Times(a,e,Plus(n,C1)),CN1)),x),And(FreeQ(List(a,b,c,d,e,ASymbol,BSymbol,n),x),NeQ(n,CN1),EqQ(Subtract(Subtract(Sqr(a),Sqr(b)),Sqr(c)),C0),EqQ(Plus(Times(b,BSymbol,n),Times(a,ASymbol,Plus(n,C1))),C0)))),
IIntegrate(3142,Int(Times(Power(Plus(Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),b_DEFAULT),a_,Times(c_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),n_DEFAULT),Plus(A_DEFAULT,Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),B_DEFAULT),Times(C_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Simp(Times(Plus(Times(BSymbol,c),Times(CN1,b,C),Times(CN1,a,C,Cos(Plus(d,Times(e,x)))),Times(a,BSymbol,Sin(Plus(d,Times(e,x))))),Power(Plus(a,Times(b,Cos(Plus(d,Times(e,x)))),Times(c,Sin(Plus(d,Times(e,x))))),n),Power(Times(a,e,Plus(n,C1)),CN1)),x),Dist(Times(Plus(Times(Plus(Times(b,BSymbol),Times(c,C)),n),Times(a,ASymbol,Plus(n,C1))),Power(Times(a,Plus(n,C1)),CN1)),Int(Power(Plus(a,Times(b,Cos(Plus(d,Times(e,x)))),Times(c,Sin(Plus(d,Times(e,x))))),n),x),x)),And(FreeQ(List(a,b,c,d,e,ASymbol,BSymbol,C,n),x),NeQ(n,CN1),EqQ(Subtract(Subtract(Sqr(a),Sqr(b)),Sqr(c)),C0),NeQ(Plus(Times(Plus(Times(b,BSymbol),Times(c,C)),n),Times(a,ASymbol,Plus(n,C1))),C0)))),
IIntegrate(3143,Int(Times(Power(Plus(Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),b_DEFAULT),a_,Times(c_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),n_DEFAULT),Plus(A_DEFAULT,Times(C_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Plus(Times(b,C),Times(a,C,Cos(Plus(d,Times(e,x))))),Power(Plus(a,Times(b,Cos(Plus(d,Times(e,x)))),Times(c,Sin(Plus(d,Times(e,x))))),n),Power(Times(a,e,Plus(n,C1)),CN1)),x)),Dist(Times(Plus(Times(c,C,n),Times(a,ASymbol,Plus(n,C1))),Power(Times(a,Plus(n,C1)),CN1)),Int(Power(Plus(a,Times(b,Cos(Plus(d,Times(e,x)))),Times(c,Sin(Plus(d,Times(e,x))))),n),x),x)),And(FreeQ(List(a,b,c,d,e,ASymbol,C,n),x),NeQ(n,CN1),EqQ(Subtract(Subtract(Sqr(a),Sqr(b)),Sqr(c)),C0),NeQ(Plus(Times(c,C,n),Times(a,ASymbol,Plus(n,C1))),C0)))),
IIntegrate(3144,Int(Times(Plus(A_DEFAULT,Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),B_DEFAULT)),Power(Plus(Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),b_DEFAULT),a_,Times(c_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Plus(Times(BSymbol,c),Times(a,BSymbol,Sin(Plus(d,Times(e,x))))),Power(Plus(a,Times(b,Cos(Plus(d,Times(e,x)))),Times(c,Sin(Plus(d,Times(e,x))))),n),Power(Times(a,e,Plus(n,C1)),CN1)),x),Dist(Times(Plus(Times(b,BSymbol,n),Times(a,ASymbol,Plus(n,C1))),Power(Times(a,Plus(n,C1)),CN1)),Int(Power(Plus(a,Times(b,Cos(Plus(d,Times(e,x)))),Times(c,Sin(Plus(d,Times(e,x))))),n),x),x)),And(FreeQ(List(a,b,c,d,e,ASymbol,BSymbol,n),x),NeQ(n,CN1),EqQ(Subtract(Subtract(Sqr(a),Sqr(b)),Sqr(c)),C0),NeQ(Plus(Times(b,BSymbol,n),Times(a,ASymbol,Plus(n,C1))),C0)))),
IIntegrate(3145,Int(Times(Power(Plus(Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),b_DEFAULT),Times(c_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),n_DEFAULT),Plus(Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),B_DEFAULT),Times(C_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))))),x_Symbol),
    Condition(Simp(Times(Subtract(Times(c,BSymbol),Times(b,C)),Power(Plus(Times(b,Cos(Plus(d,Times(e,x)))),Times(c,Sin(Plus(d,Times(e,x))))),Plus(n,C1)),Power(Times(e,Plus(n,C1),Plus(Sqr(b),Sqr(c))),CN1)),x),And(FreeQ(List(b,c,d,e,BSymbol,C),x),NeQ(n,CN1),NeQ(Plus(Sqr(b),Sqr(c)),C0),EqQ(Plus(Times(b,BSymbol),Times(c,C)),C0)))),
IIntegrate(3146,Int(Times(Power(Plus(Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),b_DEFAULT),a_,Times(c_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),n_DEFAULT),Plus(A_DEFAULT,Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),B_DEFAULT),Times(C_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Simp(Times(Plus(Times(BSymbol,c),Times(CN1,b,C),Times(CN1,a,C,Cos(Plus(d,Times(e,x)))),Times(a,BSymbol,Sin(Plus(d,Times(e,x))))),Power(Plus(a,Times(b,Cos(Plus(d,Times(e,x)))),Times(c,Sin(Plus(d,Times(e,x))))),n),Power(Times(a,e,Plus(n,C1)),CN1)),x),Dist(Power(Times(a,Plus(n,C1)),CN1),Int(Times(Power(Plus(a,Times(b,Cos(Plus(d,Times(e,x)))),Times(c,Sin(Plus(d,Times(e,x))))),Subtract(n,C1)),Simp(Plus(Times(a,Plus(Times(b,BSymbol),Times(c,C)),n),Times(Sqr(a),ASymbol,Plus(n,C1)),Times(Plus(Times(n,Plus(Times(Sqr(a),BSymbol),Times(CN1,BSymbol,Sqr(c)),Times(b,c,C))),Times(a,b,ASymbol,Plus(n,C1))),Cos(Plus(d,Times(e,x)))),Times(Plus(Times(n,Subtract(Plus(Times(b,BSymbol,c),Times(Sqr(a),C)),Times(Sqr(b),C))),Times(a,c,ASymbol,Plus(n,C1))),Sin(Plus(d,Times(e,x))))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,ASymbol,BSymbol,C),x),GtQ(n,C0),NeQ(Subtract(Subtract(Sqr(a),Sqr(b)),Sqr(c)),C0)))),
IIntegrate(3147,Int(Times(Power(Plus(Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),b_DEFAULT),a_,Times(c_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),n_DEFAULT),Plus(A_DEFAULT,Times(C_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Plus(Times(b,C),Times(a,C,Cos(Plus(d,Times(e,x))))),Power(Plus(a,Times(b,Cos(Plus(d,Times(e,x)))),Times(c,Sin(Plus(d,Times(e,x))))),n),Power(Times(a,e,Plus(n,C1)),CN1)),x)),Dist(Power(Times(a,Plus(n,C1)),CN1),Int(Times(Power(Plus(a,Times(b,Cos(Plus(d,Times(e,x)))),Times(c,Sin(Plus(d,Times(e,x))))),Subtract(n,C1)),Simp(Plus(Times(a,c,C,n),Times(Sqr(a),ASymbol,Plus(n,C1)),Times(Plus(Times(c,b,C,n),Times(a,b,ASymbol,Plus(n,C1))),Cos(Plus(d,Times(e,x)))),Times(Plus(Times(Sqr(a),C,n),Times(CN1,Sqr(b),C,n),Times(a,c,ASymbol,Plus(n,C1))),Sin(Plus(d,Times(e,x))))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,ASymbol,C),x),GtQ(n,C0),NeQ(Subtract(Subtract(Sqr(a),Sqr(b)),Sqr(c)),C0)))),
IIntegrate(3148,Int(Times(Plus(A_DEFAULT,Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),B_DEFAULT)),Power(Plus(Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),b_DEFAULT),a_,Times(c_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Plus(Times(BSymbol,c),Times(a,BSymbol,Sin(Plus(d,Times(e,x))))),Power(Plus(a,Times(b,Cos(Plus(d,Times(e,x)))),Times(c,Sin(Plus(d,Times(e,x))))),n),Power(Times(a,e,Plus(n,C1)),CN1)),x),Dist(Power(Times(a,Plus(n,C1)),CN1),Int(Times(Power(Plus(a,Times(b,Cos(Plus(d,Times(e,x)))),Times(c,Sin(Plus(d,Times(e,x))))),Subtract(n,C1)),Simp(Plus(Times(a,b,BSymbol,n),Times(Sqr(a),ASymbol,Plus(n,C1)),Times(Plus(Times(Sqr(a),BSymbol,n),Times(CN1,Sqr(c),BSymbol,n),Times(a,b,ASymbol,Plus(n,C1))),Cos(Plus(d,Times(e,x)))),Times(Plus(Times(b,c,BSymbol,n),Times(a,c,ASymbol,Plus(n,C1))),Sin(Plus(d,Times(e,x))))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,ASymbol,BSymbol),x),GtQ(n,C0),NeQ(Subtract(Subtract(Sqr(a),Sqr(b)),Sqr(c)),C0)))),
IIntegrate(3149,Int(Times(Power(Plus(Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),b_DEFAULT),a_,Times(c_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),CN1D2),Plus(A_DEFAULT,Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),B_DEFAULT),Times(C_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Dist(Times(BSymbol,Power(b,CN1)),Int(Sqrt(Plus(a,Times(b,Cos(Plus(d,Times(e,x)))),Times(c,Sin(Plus(d,Times(e,x)))))),x),x),Dist(Times(Subtract(Times(ASymbol,b),Times(a,BSymbol)),Power(b,CN1)),Int(Power(Plus(a,Times(b,Cos(Plus(d,Times(e,x)))),Times(c,Sin(Plus(d,Times(e,x))))),CN1D2),x),x)),And(FreeQ(List(a,b,c,d,e,ASymbol,BSymbol,C),x),EqQ(Subtract(Times(BSymbol,c),Times(b,C)),C0),NeQ(Subtract(Times(ASymbol,b),Times(a,BSymbol)),C0)))),
IIntegrate(3150,Int(Times(Power(Plus(a_DEFAULT,Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),b_DEFAULT),Times(c_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),CN2),Plus(A_DEFAULT,Times($($s("§cos"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),B_DEFAULT),Times(C_DEFAULT,$($s("§sin"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))))),x_Symbol),
    Condition(Simp(Times(Plus(Times(c,BSymbol),Times(CN1,b,C),Times(CN1,Subtract(Times(a,C),Times(c,ASymbol)),Cos(Plus(d,Times(e,x)))),Times(Subtract(Times(a,BSymbol),Times(b,ASymbol)),Sin(Plus(d,Times(e,x))))),Power(Times(e,Subtract(Subtract(Sqr(a),Sqr(b)),Sqr(c)),Plus(a,Times(b,Cos(Plus(d,Times(e,x)))),Times(c,Sin(Plus(d,Times(e,x)))))),CN1)),x),And(FreeQ(List(a,b,c,d,e,ASymbol,BSymbol,C),x),NeQ(Subtract(Subtract(Sqr(a),Sqr(b)),Sqr(c)),C0),EqQ(Subtract(Subtract(Times(a,ASymbol),Times(b,BSymbol)),Times(c,C)),C0))))
  );
}
