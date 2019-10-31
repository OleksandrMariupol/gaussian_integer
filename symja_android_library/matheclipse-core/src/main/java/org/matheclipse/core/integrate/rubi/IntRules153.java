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
public class IntRules153 { 
  public static IAST RULES = List( 
IIntegrate(3826,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
    Condition(Negate(Dist(Times(Power(Times(CN1,a,d,Power(b,CN1)),n),Cot(Plus(e,Times(f,x))),Power(Times(Power(a,Subtract(n,C1)),f,Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Sqrt(Subtract(a,Times(b,Csc(Plus(e,Times(f,x))))))),CN1)),Subst(Int(Times(Power(x,Subtract(m,C1D2)),Power(Subtract(a,x),Subtract(n,C1)),Power(Subtract(Times(C2,a),x),CN1D2)),x),x,Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),x)),And(FreeQ(List(a,b,d,e,f,m,n),x),EqQ(Subtract(Sqr(a),Sqr(b)),C0),Not(IntegerQ(m)),GtQ(a,C0),Not(IntegerQ(n)),LtQ(Times(a,d,Power(b,CN1)),C0)))),
IIntegrate(3827,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_DEFAULT),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
    Condition(Dist(Times(Sqr(a),d,Cot(Plus(e,Times(f,x))),Power(Times(f,Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Sqrt(Subtract(a,Times(b,Csc(Plus(e,Times(f,x))))))),CN1)),Subst(Int(Times(Power(Times(d,x),Subtract(n,C1)),Power(Plus(a,Times(b,x)),Subtract(m,C1D2)),Power(Subtract(a,Times(b,x)),CN1D2)),x),x,Csc(Plus(e,Times(f,x)))),x),And(FreeQ(List(a,b,d,e,f,m,n),x),EqQ(Subtract(Sqr(a),Sqr(b)),C0),Not(IntegerQ(m)),GtQ(a,C0)))),
IIntegrate(3828,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_DEFAULT),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
    Condition(Dist(Times(Power(a,IntPart(m)),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),FracPart(m)),Power(Power(Plus(C1,Times(b,Csc(Plus(e,Times(f,x))),Power(a,CN1))),FracPart(m)),CN1)),Int(Times(Power(Plus(C1,Times(b,Csc(Plus(e,Times(f,x))),Power(a,CN1))),m),Power(Times(d,Csc(Plus(e,Times(f,x)))),n)),x),x),And(FreeQ(List(a,b,d,e,f,m,n),x),EqQ(Subtract(Sqr(a),Sqr(b)),C0),Not(IntegerQ(m)),Not(GtQ(a,C0))))),
IIntegrate(3829,Int(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),Sqrt(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_))),x_Symbol),
    Condition(Plus(Dist(Subtract(a,b),Int(Times(Csc(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x),x),Dist(b,Int(Times(Csc(Plus(e,Times(f,x))),Plus(C1,Csc(Plus(e,Times(f,x)))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x),x)),And(FreeQ(List(a,b,e,f),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0)))),
IIntegrate(3830,Int(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Subtract(m,C1)),Power(Times(f,m),CN1)),x)),Dist(Power(m,CN1),Int(Times(Csc(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Subtract(m,C2)),Plus(Times(Sqr(b),Subtract(m,C1)),Times(Sqr(a),m),Times(a,b,Subtract(Times(C2,m),C1),Csc(Plus(e,Times(f,x)))))),x),x)),And(FreeQ(List(a,b,e,f),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0),GtQ(m,C1),IntegerQ(Times(C2,m))))),
IIntegrate(3831,Int(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),CN1)),x_Symbol),
    Condition(Dist(Power(b,CN1),Int(Power(Plus(C1,Times(a,Sin(Plus(e,Times(f,x))),Power(b,CN1))),CN1),x),x),And(FreeQ(List(a,b,e,f),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0)))),
IIntegrate(3832,Int(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),CN1D2)),x_Symbol),
    Condition(Simp(Times(CN2,Rt(Plus(a,b),C2),Sqrt(Times(b,Subtract(C1,Csc(Plus(e,Times(f,x)))),Power(Plus(a,b),CN1))),Sqrt(Times(CN1,b,Plus(C1,Csc(Plus(e,Times(f,x)))),Power(Subtract(a,b),CN1))),EllipticF(ArcSin(Times(Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Power(Rt(Plus(a,b),C2),CN1))),Times(Plus(a,b),Power(Subtract(a,b),CN1))),Power(Times(b,f,Cot(Plus(e,Times(f,x)))),CN1)),x),And(FreeQ(List(a,b,e,f),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0)))),
IIntegrate(3833,Int(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(f,Plus(m,C1),Subtract(Sqr(a),Sqr(b))),CN1)),x)),Dist(Power(Times(Plus(m,C1),Subtract(Sqr(a),Sqr(b))),CN1),Int(Times(Csc(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Subtract(Times(a,Plus(m,C1)),Times(b,Plus(m,C2),Csc(Plus(e,Times(f,x)))))),x),x)),And(FreeQ(List(a,b,e,f),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0),LtQ(m,CN1),IntegerQ(Times(C2,m))))),
IIntegrate(3834,Int(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
    Condition(Dist(Times(Cot(Plus(e,Times(f,x))),Power(Times(f,Sqrt(Plus(C1,Csc(Plus(e,Times(f,x))))),Sqrt(Subtract(C1,Csc(Plus(e,Times(f,x)))))),CN1)),Subst(Int(Times(Power(Plus(a,Times(b,x)),m),Power(Times(Sqrt(Plus(C1,x)),Sqrt(Subtract(C1,x))),CN1)),x),x,Csc(Plus(e,Times(f,x)))),x),And(FreeQ(List(a,b,e,f,m),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0),Not(IntegerQ(Times(C2,m)))))),
IIntegrate(3835,Int(Times(Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Times(f,Plus(m,C1)),CN1)),x)),Dist(Times(m,Power(Plus(m,C1),CN1)),Int(Times(Csc(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Subtract(m,C1)),Plus(b,Times(a,Csc(Plus(e,Times(f,x)))))),x),x)),And(FreeQ(List(a,b,e,f),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0),GtQ(m,C0)))),
IIntegrate(3836,Int(Times(Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
    Condition(Subtract(Simp(Times(a,Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(f,Plus(m,C1),Subtract(Sqr(a),Sqr(b))),CN1)),x),Dist(Power(Times(Plus(m,C1),Subtract(Sqr(a),Sqr(b))),CN1),Int(Times(Csc(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Subtract(Times(b,Plus(m,C1)),Times(a,Plus(m,C2),Csc(Plus(e,Times(f,x)))))),x),x)),And(FreeQ(List(a,b,e,f),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0),LtQ(m,CN1)))),
IIntegrate(3837,Int(Times(Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),CN1D2)),x_Symbol),
    Condition(Plus(Negate(Int(Times(Csc(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x)),Int(Times(Csc(Plus(e,Times(f,x))),Plus(C1,Csc(Plus(e,Times(f,x)))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x)),And(FreeQ(List(a,b,e,f),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0)))),
IIntegrate(3838,Int(Times(Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
    Condition(Plus(Negate(Dist(Times(a,Power(b,CN1)),Int(Times(Csc(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m)),x),x)),Dist(Power(b,CN1),Int(Times(Csc(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1))),x),x)),And(FreeQ(List(a,b,e,f,m),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0)))),
IIntegrate(3839,Int(Times(Power($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),C3),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Sqr(a),Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(b,f,Plus(m,C1),Subtract(Sqr(a),Sqr(b))),CN1)),x)),Dist(Power(Times(b,Plus(m,C1),Subtract(Sqr(a),Sqr(b))),CN1),Int(Times(Csc(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Simp(Subtract(Times(a,b,Plus(m,C1)),Times(Plus(Sqr(a),Times(Sqr(b),Plus(m,C1))),Csc(Plus(e,Times(f,x))))),x)),x),x)),And(FreeQ(List(a,b,e,f),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0),LtQ(m,CN1)))),
IIntegrate(3840,Int(Times(Power($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),C3),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(b,f,Plus(m,C2)),CN1)),x)),Dist(Power(Times(b,Plus(m,C2)),CN1),Int(Times(Csc(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Subtract(Times(b,Plus(m,C1)),Times(a,Csc(Plus(e,Times(f,x)))))),x),x)),And(FreeQ(List(a,b,e,f,m),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0),Not(LtQ(m,CN1))))),
IIntegrate(3841,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
    Condition(Subtract(Simp(Times(Sqr(a),Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Subtract(m,C2)),Power(Times(d,Csc(Plus(e,Times(f,x)))),n),Power(Times(f,n),CN1)),x),Dist(Power(Times(d,n),CN1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Subtract(m,C3)),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,C1)),Simp(Subtract(Subtract(Times(Sqr(a),b,Subtract(Subtract(m,Times(C2,n)),C2)),Times(a,Plus(Times(C3,Sqr(b),n),Times(Sqr(a),Plus(n,C1))),Csc(Plus(e,Times(f,x))))),Times(b,Plus(Times(Sqr(b),n),Times(Sqr(a),Subtract(Plus(m,n),C1))),Sqr(Csc(Plus(e,Times(f,x)))))),x)),x),x)),And(FreeQ(List(a,b,d,e,f),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0),GtQ(m,C2),Or(And(IntegerQ(m),LtQ(n,CN1)),And(IntegersQ(Plus(m,C1D2),Times(C2,n)),LeQ(n,CN1)))))),
IIntegrate(3842,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Sqr(b),Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Subtract(m,C2)),Power(Times(d,Csc(Plus(e,Times(f,x)))),n),Power(Times(f,Subtract(Plus(m,n),C1)),CN1)),x)),Dist(Power(Times(d,Subtract(Plus(m,n),C1)),CN1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Subtract(m,C3)),Power(Times(d,Csc(Plus(e,Times(f,x)))),n),Simp(Plus(Times(Power(a,C3),d,Subtract(Plus(m,n),C1)),Times(a,Sqr(b),d,n),Times(b,Plus(Times(Sqr(b),d,Subtract(Plus(m,n),C2)),Times(C3,Sqr(a),d,Subtract(Plus(m,n),C1))),Csc(Plus(e,Times(f,x)))),Times(a,Sqr(b),d,Subtract(Plus(Times(C3,m),Times(C2,n)),C4),Sqr(Csc(Plus(e,Times(f,x)))))),x)),x),x)),And(FreeQ(List(a,b,d,e,f,n),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0),GtQ(m,C2),Or(IntegerQ(m),IntegersQ(Times(C2,m),Times(C2,n))),Not(And(IGtQ(n,C2),Not(IntegerQ(m))))))),
IIntegrate(3843,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,d,Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Csc(Plus(e,Times(f,x)))),Subtract(n,C1)),Power(Times(f,Plus(m,C1),Subtract(Sqr(a),Sqr(b))),CN1)),x)),Dist(Power(Times(Plus(m,C1),Subtract(Sqr(a),Sqr(b))),CN1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Csc(Plus(e,Times(f,x)))),Subtract(n,C1)),Simp(Subtract(Plus(Times(b,d,Subtract(n,C1)),Times(a,d,Plus(m,C1),Csc(Plus(e,Times(f,x))))),Times(b,d,Plus(m,n,C1),Sqr(Csc(Plus(e,Times(f,x)))))),x)),x),x)),And(FreeQ(List(a,b,d,e,f),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0),LtQ(m,CN1),LtQ(C0,n,C1),IntegersQ(Times(C2,m),Times(C2,n))))),
IIntegrate(3844,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
    Condition(Subtract(Simp(Times(a,Sqr(d),Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Csc(Plus(e,Times(f,x)))),Subtract(n,C2)),Power(Times(f,Plus(m,C1),Subtract(Sqr(a),Sqr(b))),CN1)),x),Dist(Times(Sqr(d),Power(Times(Plus(m,C1),Subtract(Sqr(a),Sqr(b))),CN1)),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Csc(Plus(e,Times(f,x)))),Subtract(n,C2)),Subtract(Plus(Times(a,Subtract(n,C2)),Times(b,Plus(m,C1),Csc(Plus(e,Times(f,x))))),Times(a,Plus(m,n),Sqr(Csc(Plus(e,Times(f,x))))))),x),x)),And(FreeQ(List(a,b,d,e,f),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0),LtQ(m,CN1),LtQ(C1,n,C2),IntegersQ(Times(C2,m),Times(C2,n))))),
IIntegrate(3845,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Sqr(a),Power(d,C3),Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Csc(Plus(e,Times(f,x)))),Subtract(n,C3)),Power(Times(b,f,Plus(m,C1),Subtract(Sqr(a),Sqr(b))),CN1)),x)),Dist(Times(Power(d,C3),Power(Times(b,Plus(m,C1),Subtract(Sqr(a),Sqr(b))),CN1)),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Csc(Plus(e,Times(f,x)))),Subtract(n,C3)),Simp(Subtract(Plus(Times(Sqr(a),Subtract(n,C3)),Times(a,b,Plus(m,C1),Csc(Plus(e,Times(f,x))))),Times(Plus(Times(Sqr(a),Subtract(n,C2)),Times(Sqr(b),Plus(m,C1))),Sqr(Csc(Plus(e,Times(f,x)))))),x)),x),x)),And(FreeQ(List(a,b,d,e,f),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0),LtQ(m,CN1),Or(IGtQ(n,C3),And(IntegersQ(Plus(n,C1D2),Times(C2,m)),GtQ(n,C2)))))),
IIntegrate(3846,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
    Condition(Subtract(Simp(Times(Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Csc(Plus(e,Times(f,x)))),n),Power(Times(a,f,n),CN1)),x),Dist(Power(Times(a,d,n),CN1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,C1)),Simp(Subtract(Subtract(Times(b,Plus(m,n,C1)),Times(a,Plus(n,C1),Csc(Plus(e,Times(f,x))))),Times(b,Plus(m,n,C2),Sqr(Csc(Plus(e,Times(f,x)))))),x)),x),x)),And(FreeQ(List(a,b,d,e,f),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0),ILtQ(Plus(m,C1D2),C0),ILtQ(n,C0)))),
IIntegrate(3847,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
    Condition(Plus(Simp(Times(Sqr(b),Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Csc(Plus(e,Times(f,x)))),n),Power(Times(a,f,Plus(m,C1),Subtract(Sqr(a),Sqr(b))),CN1)),x),Dist(Power(Times(a,Plus(m,C1),Subtract(Sqr(a),Sqr(b))),CN1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Csc(Plus(e,Times(f,x)))),n),Plus(Times(Sqr(a),Plus(m,C1)),Times(CN1,Sqr(b),Plus(m,n,C1)),Times(CN1,a,b,Plus(m,C1),Csc(Plus(e,Times(f,x)))),Times(Sqr(b),Plus(m,n,C2),Sqr(Csc(Plus(e,Times(f,x))))))),x),x)),And(FreeQ(List(a,b,d,e,f,n),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0),LtQ(m,CN1),IntegersQ(Times(C2,m),Times(C2,n))))),
IIntegrate(3848,Int(Times(Sqrt(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT)),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),CN1)),x_Symbol),
    Condition(Dist(Times(Sqrt(Times(d,Sin(Plus(e,Times(f,x))))),Sqrt(Times(d,Csc(Plus(e,Times(f,x))))),Power(d,CN1)),Int(Times(Sqrt(Times(d,Sin(Plus(e,Times(f,x))))),Power(Plus(b,Times(a,Sin(Plus(e,Times(f,x))))),CN1)),x),x),And(FreeQ(List(a,b,d,e,f),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0)))),
IIntegrate(3849,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),QQ(3L,2L)),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),CN1)),x_Symbol),
    Condition(Dist(Times(d,Sqrt(Times(d,Sin(Plus(e,Times(f,x))))),Sqrt(Times(d,Csc(Plus(e,Times(f,x)))))),Int(Power(Times(Sqrt(Times(d,Sin(Plus(e,Times(f,x))))),Plus(b,Times(a,Sin(Plus(e,Times(f,x)))))),CN1),x),x),And(FreeQ(List(a,b,d,e,f),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0)))),
IIntegrate(3850,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),QQ(5L,2L)),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),CN1)),x_Symbol),
    Condition(Subtract(Dist(Times(d,Power(b,CN1)),Int(Power(Times(d,Csc(Plus(e,Times(f,x)))),QQ(3L,2L)),x),x),Dist(Times(a,d,Power(b,CN1)),Int(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),QQ(3L,2L)),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1)),x),x)),And(FreeQ(List(a,b,d,e,f),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0))))
  );
}
