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
public class IntRules132 { 
  public static IAST RULES = List( 
IIntegrate(3301,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),CN1),$($s("§sin"),Plus(e_DEFAULT,Times(Complex(C0,$p("fz")),f_DEFAULT,x_)))),x_Symbol),
    Condition(Simp(Times(CoshIntegral(Plus(Times(c,f,$s("fz"),Power(d,CN1)),Times(f,$s("fz"),x))),Power(d,CN1)),x),And(FreeQ(List(c,d,e,f,$s("fz")),x),EqQ(Subtract(Times(d,Subtract(e,CPiHalf)),Times(c,f,$s("fz"),CI)),C0)))),
IIntegrate(3302,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),CN1),$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),x_Symbol),
    Condition(Simp(Times(CosIntegral(Plus(e,Times(CN1,C1D2,Pi),Times(f,x))),Power(d,CN1)),x),And(FreeQ(List(c,d,e,f),x),EqQ(Subtract(Times(d,Subtract(e,CPiHalf)),Times(c,f)),C0)))),
IIntegrate(3303,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),CN1),$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Dist(Cos(Times(Subtract(Times(d,e),Times(c,f)),Power(d,CN1))),Int(Times(Sin(Plus(Times(c,f,Power(d,CN1)),Times(f,x))),Power(Plus(c,Times(d,x)),CN1)),x),x),Dist(Sin(Times(Subtract(Times(d,e),Times(c,f)),Power(d,CN1))),Int(Times(Cos(Plus(Times(c,f,Power(d,CN1)),Times(f,x))),Power(Plus(c,Times(d,x)),CN1)),x),x)),And(FreeQ(List(c,d,e,f),x),NeQ(Subtract(Times(d,e),Times(c,f)),C0)))),
IIntegrate(3304,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),CN1D2),$($s("§sin"),Plus(CPiHalf,e_DEFAULT,Times(f_DEFAULT,x_)))),x_Symbol),
    Condition(Dist(Times(C2,Power(d,CN1)),Subst(Int(Cos(Times(f,Sqr(x),Power(d,CN1))),x),x,Sqrt(Plus(c,Times(d,x)))),x),And(FreeQ(List(c,d,e,f),x),ComplexFreeQ(f),EqQ(Subtract(Times(d,e),Times(c,f)),C0)))),
IIntegrate(3305,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),CN1D2),$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),x_Symbol),
    Condition(Dist(Times(C2,Power(d,CN1)),Subst(Int(Sin(Times(f,Sqr(x),Power(d,CN1))),x),x,Sqrt(Plus(c,Times(d,x)))),x),And(FreeQ(List(c,d,e,f),x),ComplexFreeQ(f),EqQ(Subtract(Times(d,e),Times(c,f)),C0)))),
IIntegrate(3306,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),CN1D2),$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Dist(Cos(Times(Subtract(Times(d,e),Times(c,f)),Power(d,CN1))),Int(Times(Sin(Plus(Times(c,f,Power(d,CN1)),Times(f,x))),Power(Plus(c,Times(d,x)),CN1D2)),x),x),Dist(Sin(Times(Subtract(Times(d,e),Times(c,f)),Power(d,CN1))),Int(Times(Cos(Plus(Times(c,f,Power(d,CN1)),Times(f,x))),Power(Plus(c,Times(d,x)),CN1D2)),x),x)),And(FreeQ(List(c,d,e,f),x),ComplexFreeQ(f),NeQ(Subtract(Times(d,e),Times(c,f)),C0)))),
IIntegrate(3307,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),$($s("§sin"),Plus(e_DEFAULT,Times(Pi,k_DEFAULT),Times(f_DEFAULT,x_)))),x_Symbol),
    Condition(Subtract(Dist(Times(C1D2,CI),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Times(Exp(Times(CI,k,Pi)),Exp(Times(CI,Plus(e,Times(f,x))))),CN1)),x),x),Dist(Times(C1D2,CI),Int(Times(Power(Plus(c,Times(d,x)),m),Exp(Times(CI,k,Pi)),Exp(Times(CI,Plus(e,Times(f,x))))),x),x)),And(FreeQ(List(c,d,e,f,m),x),IntegerQ(Times(C2,k))))),
IIntegrate(3308,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),x_Symbol),
    Condition(Subtract(Dist(Times(C1D2,CI),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Exp(Times(CI,Plus(e,Times(f,x)))),CN1)),x),x),Dist(Times(C1D2,CI),Int(Times(Power(Plus(c,Times(d,x)),m),Exp(Times(CI,Plus(e,Times(f,x))))),x),x)),FreeQ(List(c,d,e,f,m),x))),
IIntegrate(3309,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Sqr($($s("§sin"),Plus(e_DEFAULT,Times(C1D2,f_DEFAULT,x_))))),x_Symbol),
    Condition(Subtract(Dist(C1D2,Int(Power(Plus(c,Times(d,x)),m),x),x),Dist(C1D2,Int(Times(Power(Plus(c,Times(d,x)),m),Cos(Plus(Times(C2,e),Times(f,x)))),x),x)),FreeQ(List(c,d,e,f,m),x))),
IIntegrate(3310,Int(Times(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),Power(Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(d,Power(Times(b,Sin(Plus(e,Times(f,x)))),n),Power(Times(Sqr(f),Sqr(n)),CN1)),x),Dist(Times(Sqr(b),Subtract(n,C1),Power(n,CN1)),Int(Times(Plus(c,Times(d,x)),Power(Times(b,Sin(Plus(e,Times(f,x)))),Subtract(n,C2))),x),x),Negate(Simp(Times(b,Plus(c,Times(d,x)),Cos(Plus(e,Times(f,x))),Power(Times(b,Sin(Plus(e,Times(f,x)))),Subtract(n,C1)),Power(Times(f,n),CN1)),x))),And(FreeQ(List(b,c,d,e,f),x),GtQ(n,C1)))),
IIntegrate(3311,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_),Power(Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(d,m,Power(Plus(c,Times(d,x)),Subtract(m,C1)),Power(Times(b,Sin(Plus(e,Times(f,x)))),n),Power(Times(Sqr(f),Sqr(n)),CN1)),x),Dist(Times(Sqr(b),Subtract(n,C1),Power(n,CN1)),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Times(b,Sin(Plus(e,Times(f,x)))),Subtract(n,C2))),x),x),Negate(Dist(Times(Sqr(d),m,Subtract(m,C1),Power(Times(Sqr(f),Sqr(n)),CN1)),Int(Times(Power(Plus(c,Times(d,x)),Subtract(m,C2)),Power(Times(b,Sin(Plus(e,Times(f,x)))),n)),x),x)),Negate(Simp(Times(b,Power(Plus(c,Times(d,x)),m),Cos(Plus(e,Times(f,x))),Power(Times(b,Sin(Plus(e,Times(f,x)))),Subtract(n,C1)),Power(Times(f,n),CN1)),x))),And(FreeQ(List(b,c,d,e,f),x),GtQ(n,C1),GtQ(m,C1)))),
IIntegrate(3312,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_),Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Int(ExpandTrigReduce(Power(Plus(c,Times(d,x)),m),Power(Sin(Plus(e,Times(f,x))),n),x),x),And(FreeQ(List(c,d,e,f,m),x),IGtQ(n,C1),Or(Not(RationalQ(m)),And(GeQ(m,CN1),LtQ(m,C1)))))),
IIntegrate(3313,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_),Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Power(Sin(Plus(e,Times(f,x))),n),Power(Times(d,Plus(m,C1)),CN1)),x),Dist(Times(f,n,Power(Times(d,Plus(m,C1)),CN1)),Int(ExpandTrigReduce(Power(Plus(c,Times(d,x)),Plus(m,C1)),Times(Cos(Plus(e,Times(f,x))),Power(Sin(Plus(e,Times(f,x))),Subtract(n,C1))),x),x),x)),And(FreeQ(List(c,d,e,f,m),x),IGtQ(n,C1),GeQ(m,CN2),LtQ(m,CN1)))),
IIntegrate(3314,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_),Power(Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Power(Times(b,Sin(Plus(e,Times(f,x)))),n),Power(Times(d,Plus(m,C1)),CN1)),x),Dist(Times(Sqr(b),Sqr(f),n,Subtract(n,C1),Power(Times(Sqr(d),Plus(m,C1),Plus(m,C2)),CN1)),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,C2)),Power(Times(b,Sin(Plus(e,Times(f,x)))),Subtract(n,C2))),x),x),Negate(Dist(Times(Sqr(f),Sqr(n),Power(Times(Sqr(d),Plus(m,C1),Plus(m,C2)),CN1)),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,C2)),Power(Times(b,Sin(Plus(e,Times(f,x)))),n)),x),x)),Negate(Simp(Times(b,f,n,Power(Plus(c,Times(d,x)),Plus(m,C2)),Cos(Plus(e,Times(f,x))),Power(Times(b,Sin(Plus(e,Times(f,x)))),Subtract(n,C1)),Power(Times(Sqr(d),Plus(m,C1),Plus(m,C2)),CN1)),x))),And(FreeQ(List(b,c,d,e,f),x),GtQ(n,C1),LtQ(m,CN2)))),
IIntegrate(3315,Int(Times(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),Power(Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(Plus(c,Times(d,x)),Cos(Plus(e,Times(f,x))),Power(Times(b,Sin(Plus(e,Times(f,x)))),Plus(n,C1)),Power(Times(b,f,Plus(n,C1)),CN1)),x),Dist(Times(Plus(n,C2),Power(Times(Sqr(b),Plus(n,C1)),CN1)),Int(Times(Plus(c,Times(d,x)),Power(Times(b,Sin(Plus(e,Times(f,x)))),Plus(n,C2))),x),x),Negate(Simp(Times(d,Power(Times(b,Sin(Plus(e,Times(f,x)))),Plus(n,C2)),Power(Times(Sqr(b),Sqr(f),Plus(n,C1),Plus(n,C2)),CN1)),x))),And(FreeQ(List(b,c,d,e,f),x),LtQ(n,CN1),NeQ(n,CN2)))),
IIntegrate(3316,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(c,Times(d,x)),m),Cos(Plus(e,Times(f,x))),Power(Times(b,Sin(Plus(e,Times(f,x)))),Plus(n,C1)),Power(Times(b,f,Plus(n,C1)),CN1)),x),Dist(Times(Plus(n,C2),Power(Times(Sqr(b),Plus(n,C1)),CN1)),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Times(b,Sin(Plus(e,Times(f,x)))),Plus(n,C2))),x),x),Dist(Times(Sqr(d),m,Subtract(m,C1),Power(Times(Sqr(b),Sqr(f),Plus(n,C1),Plus(n,C2)),CN1)),Int(Times(Power(Plus(c,Times(d,x)),Subtract(m,C2)),Power(Times(b,Sin(Plus(e,Times(f,x)))),Plus(n,C2))),x),x),Negate(Simp(Times(d,m,Power(Plus(c,Times(d,x)),Subtract(m,C1)),Power(Times(b,Sin(Plus(e,Times(f,x)))),Plus(n,C2)),Power(Times(Sqr(b),Sqr(f),Plus(n,C1),Plus(n,C2)),CN1)),x))),And(FreeQ(List(b,c,d,e,f),x),LtQ(n,CN1),NeQ(n,CN2),GtQ(m,C1)))),
IIntegrate(3317,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(c,Times(d,x)),m),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),n),x),x),And(FreeQ(List(a,b,c,d,e,f,m),x),IGtQ(n,C0),Or(EqQ(n,C1),IGtQ(m,C0),NeQ(Subtract(Sqr(a),Sqr(b)),C0))))),
IIntegrate(3318,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Times(C2,a),n),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Sin(Plus(Times(C1D2,C1,Plus(e,Times(Pi,a,Power(Times(C2,b),CN1)))),Times(C1D2,f,x))),Times(C2,n))),x),x),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(Subtract(Sqr(a),Sqr(b)),C0),IntegerQ(n),Or(GtQ(n,C0),IGtQ(m,C0))))),
IIntegrate(3319,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Dist(Times(Power(Times(C2,a),IntPart(n)),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),FracPart(n)),Power(Power(Sin(Plus(Times(C1D2,e),Times(a,Pi,Power(Times(C4,b),CN1)),Times(C1D2,f,x))),Times(C2,FracPart(n))),CN1)),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Sin(Plus(Times(C1D2,e),Times(a,Pi,Power(Times(C4,b),CN1)),Times(C1D2,f,x))),Times(C2,n))),x),x),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ(Subtract(Sqr(a),Sqr(b)),C0),IntegerQ(Plus(n,C1D2)),Or(GtQ(n,C0),IGtQ(m,C0))))),
IIntegrate(3320,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(Pi,k_DEFAULT),Times(Complex(C0,$p("fz")),f_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Dist(C2,Int(Times(Power(Plus(c,Times(d,x)),m),Exp(Plus(Times(CN1,CI,e),Times(f,$s("fz"),x))),Power(Times(Exp(Times(CI,Pi,Subtract(k,C1D2))),Subtract(Plus(b,Times(C2,a,Exp(Plus(Times(CN1,CI,e),Times(f,$s("fz"),x))),Power(Exp(Times(CI,Pi,Subtract(k,C1D2))),CN1))),Times(b,Exp(Times(C2,Plus(Times(CN1,CI,e),Times(f,$s("fz"),x)))),Power(Exp(Times(C2,CI,k,Pi)),CN1)))),CN1)),x),x),And(FreeQ(List(a,b,c,d,e,f,$s("fz")),x),IntegerQ(Times(C2,k)),NeQ(Subtract(Sqr(a),Sqr(b)),C0),IGtQ(m,C0)))),
IIntegrate(3321,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(Pi,k_DEFAULT),Times(f_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Dist(C2,Int(Times(Power(Plus(c,Times(d,x)),m),Exp(Times(CI,Pi,Subtract(k,C1D2))),Exp(Times(CI,Plus(e,Times(f,x)))),Power(Subtract(Plus(b,Times(C2,a,Exp(Times(CI,Pi,Subtract(k,C1D2))),Exp(Times(CI,Plus(e,Times(f,x)))))),Times(b,Exp(Times(C2,CI,k,Pi)),Exp(Times(C2,CI,Plus(e,Times(f,x)))))),CN1)),x),x),And(FreeQ(List(a,b,c,d,e,f),x),IntegerQ(Times(C2,k)),NeQ(Subtract(Sqr(a),Sqr(b)),C0),IGtQ(m,C0)))),
IIntegrate(3322,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(Complex(C0,$p("fz")),f_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Dist(C2,Int(Times(Power(Plus(c,Times(d,x)),m),Exp(Plus(Times(CN1,CI,e),Times(f,$s("fz"),x))),Power(Plus(Times(CN1,CI,b),Times(C2,a,Exp(Plus(Times(CN1,CI,e),Times(f,$s("fz"),x)))),Times(CI,b,Exp(Times(C2,Plus(Times(CN1,CI,e),Times(f,$s("fz"),x)))))),CN1)),x),x),And(FreeQ(List(a,b,c,d,e,f,$s("fz")),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0),IGtQ(m,C0)))),
IIntegrate(3323,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Dist(C2,Int(Times(Power(Plus(c,Times(d,x)),m),Exp(Times(CI,Plus(e,Times(f,x)))),Power(Subtract(Plus(Times(CI,b),Times(C2,a,Exp(Times(CI,Plus(e,Times(f,x)))))),Times(CI,b,Exp(Times(C2,CI,Plus(e,Times(f,x)))))),CN1)),x),x),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0),IGtQ(m,C0)))),
IIntegrate(3324,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN2)),x_Symbol),
    Condition(Plus(Simp(Times(b,Power(Plus(c,Times(d,x)),m),Cos(Plus(e,Times(f,x))),Power(Times(f,Subtract(Sqr(a),Sqr(b)),Plus(a,Times(b,Sin(Plus(e,Times(f,x)))))),CN1)),x),Dist(Times(a,Power(Subtract(Sqr(a),Sqr(b)),CN1)),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),CN1)),x),x),Negate(Dist(Times(b,d,m,Power(Times(f,Subtract(Sqr(a),Sqr(b))),CN1)),Int(Times(Power(Plus(c,Times(d,x)),Subtract(m,C1)),Cos(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),CN1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0),IGtQ(m,C0)))),
IIntegrate(3325,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Power(Plus(c,Times(d,x)),m),Cos(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(n,C1)),Power(Times(f,Plus(n,C1),Subtract(Sqr(a),Sqr(b))),CN1)),x)),Dist(Times(a,Power(Subtract(Sqr(a),Sqr(b)),CN1)),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(n,C1))),x),x),Negate(Dist(Times(b,Plus(n,C2),Power(Times(Plus(n,C1),Subtract(Sqr(a),Sqr(b))),CN1)),Int(Times(Power(Plus(c,Times(d,x)),m),Sin(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(n,C1))),x),x)),Dist(Times(b,d,m,Power(Times(f,Plus(n,C1),Subtract(Sqr(a),Sqr(b))),CN1)),Int(Times(Power(Plus(c,Times(d,x)),Subtract(m,C1)),Cos(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(n,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0),ILtQ(n,CN2),IGtQ(m,C0))))
  );
}
