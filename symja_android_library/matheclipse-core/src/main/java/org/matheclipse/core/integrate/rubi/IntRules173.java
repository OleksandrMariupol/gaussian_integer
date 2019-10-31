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
public class IntRules173 { 
  public static IAST RULES = List( 
IIntegrate(4326,Int(Times(Power(Times($($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),e_DEFAULT),m_),Power(Times(f_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_DEFAULT),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Times(e,Cos(Plus(a,Times(b,x)))),Plus(m,C1)),Power(Times(f,Sin(Plus(a,Times(b,x)))),Plus(n,C1)),Power(Times(g,Sin(Plus(c,Times(d,x)))),p),Power(Times(b,e,f,Plus(m,p,C1)),CN1)),x)),Dist(Times(f,Plus(m,n,Times(C2,p),C2),Power(Times(C2,e,g,Plus(m,p,C1)),CN1)),Int(Times(Power(Times(e,Cos(Plus(a,Times(b,x)))),Plus(m,C1)),Power(Times(f,Sin(Plus(a,Times(b,x)))),Subtract(n,C1)),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,f,g),x),EqQ(Subtract(Times(b,c),Times(a,d)),C0),EqQ(Times(d,Power(b,CN1)),C2),Not(IntegerQ(p)),LtQ(m,CN1),GtQ(n,C0),LtQ(p,CN1),NeQ(Plus(m,n,Times(C2,p),C2),C0),NeQ(Plus(m,p,C1),C0),IntegersQ(Times(C2,m),Times(C2,n),Times(C2,p))))),
IIntegrate(4327,Int(Times(Power(Times($($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),f_DEFAULT),n_DEFAULT),Power(Times(e_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(e,Sin(Plus(a,Times(b,x)))),Plus(m,C1)),Power(Times(f,Cos(Plus(a,Times(b,x)))),Plus(n,C1)),Power(Times(g,Sin(Plus(c,Times(d,x)))),p),Power(Times(b,e,f,Plus(m,p,C1)),CN1)),x),Dist(Times(f,Plus(m,n,Times(C2,p),C2),Power(Times(C2,e,g,Plus(m,p,C1)),CN1)),Int(Times(Power(Times(e,Sin(Plus(a,Times(b,x)))),Plus(m,C1)),Power(Times(f,Cos(Plus(a,Times(b,x)))),Subtract(n,C1)),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,f,g),x),EqQ(Subtract(Times(b,c),Times(a,d)),C0),EqQ(Times(d,Power(b,CN1)),C2),Not(IntegerQ(p)),LtQ(m,CN1),GtQ(n,C0),LtQ(p,CN1),NeQ(Plus(m,n,Times(C2,p),C2),C0),NeQ(Plus(m,p,C1),C0),IntegersQ(Times(C2,m),Times(C2,n),Times(C2,p))))),
IIntegrate(4328,Int(Times(Power(Times($($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),e_DEFAULT),m_),Power(Times(f_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_DEFAULT),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Times(e,Cos(Plus(a,Times(b,x)))),Plus(m,C1)),Power(Times(f,Sin(Plus(a,Times(b,x)))),Plus(n,C1)),Power(Times(g,Sin(Plus(c,Times(d,x)))),p),Power(Times(b,e,f,Plus(m,p,C1)),CN1)),x)),Dist(Times(Plus(m,n,Times(C2,p),C2),Power(Times(Sqr(e),Plus(m,p,C1)),CN1)),Int(Times(Power(Times(e,Cos(Plus(a,Times(b,x)))),Plus(m,C2)),Power(Times(f,Sin(Plus(a,Times(b,x)))),n),Power(Times(g,Sin(Plus(c,Times(d,x)))),p)),x),x)),And(FreeQ(List(a,b,c,d,e,f,g,n,p),x),EqQ(Subtract(Times(b,c),Times(a,d)),C0),EqQ(Times(d,Power(b,CN1)),C2),Not(IntegerQ(p)),LtQ(m,CN1),NeQ(Plus(m,n,Times(C2,p),C2),C0),NeQ(Plus(m,p,C1),C0),IntegersQ(Times(C2,m),Times(C2,n),Times(C2,p))))),
IIntegrate(4329,Int(Times(Power(Times($($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),f_DEFAULT),n_DEFAULT),Power(Times(e_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(e,Sin(Plus(a,Times(b,x)))),Plus(m,C1)),Power(Times(f,Cos(Plus(a,Times(b,x)))),Plus(n,C1)),Power(Times(g,Sin(Plus(c,Times(d,x)))),p),Power(Times(b,e,f,Plus(m,p,C1)),CN1)),x),Dist(Times(Plus(m,n,Times(C2,p),C2),Power(Times(Sqr(e),Plus(m,p,C1)),CN1)),Int(Times(Power(Times(e,Sin(Plus(a,Times(b,x)))),Plus(m,C2)),Power(Times(f,Cos(Plus(a,Times(b,x)))),n),Power(Times(g,Sin(Plus(c,Times(d,x)))),p)),x),x)),And(FreeQ(List(a,b,c,d,e,f,g,n,p),x),EqQ(Subtract(Times(b,c),Times(a,d)),C0),EqQ(Times(d,Power(b,CN1)),C2),Not(IntegerQ(p)),LtQ(m,CN1),NeQ(Plus(m,n,Times(C2,p),C2),C0),NeQ(Plus(m,p,C1),C0),IntegersQ(Times(C2,m),Times(C2,n),Times(C2,p))))),
IIntegrate(4330,Int(Times(Power(Times($($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),e_DEFAULT),m_DEFAULT),Power(Times(f_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_DEFAULT),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Times(g,Sin(Plus(c,Times(d,x)))),p),Power(Times(Power(Times(e,Cos(Plus(a,Times(b,x)))),p),Power(Times(f,Sin(Plus(a,Times(b,x)))),p)),CN1)),Int(Times(Power(Times(e,Cos(Plus(a,Times(b,x)))),Plus(m,p)),Power(Times(f,Sin(Plus(a,Times(b,x)))),Plus(n,p))),x),x),And(FreeQ(List(a,b,c,d,e,f,g,m,n,p),x),EqQ(Subtract(Times(b,c),Times(a,d)),C0),EqQ(Times(d,Power(b,CN1)),C2),Not(IntegerQ(p))))),
IIntegrate(4331,Int(Times(Power(Times($($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),e_DEFAULT),m_DEFAULT),$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Negate(Simp(Times(Plus(m,C2),Power(Times(e,Cos(Plus(a,Times(b,x)))),Plus(m,C1)),Cos(Times(Plus(m,C1),Plus(a,Times(b,x)))),Power(Times(d,e,Plus(m,C1)),CN1)),x)),And(FreeQ(List(a,b,c,d,e,m),x),EqQ(Subtract(Times(b,c),Times(a,d)),C0),EqQ(Times(d,Power(b,CN1)),Abs(Plus(m,C2)))))),
IIntegrate(4332,Int(Power(Times(a_DEFAULT,Power($(F_,Plus(c_DEFAULT,Times(d_DEFAULT,x_))),p_)),n_),x_Symbol),
    Condition(With(List(Set(v,ActivateTrig(F(Plus(c,Times(d,x)))))),Dist(Times(Power(a,IntPart(n)),Power(Times(v,Power(NonfreeFactors(v,x),CN1)),Times(p,IntPart(n))),Power(Times(a,Power(v,p)),FracPart(n)),Power(Power(NonfreeFactors(v,x),Times(p,FracPart(n))),CN1)),Int(Power(NonfreeFactors(v,x),Times(n,p)),x),x)),And(FreeQ(List(a,c,d,n,p),x),InertTrigQ(FSymbol),Not(IntegerQ(n)),IntegerQ(p)))),
IIntegrate(4333,Int(Power(Times(a_DEFAULT,Power(Times(b_DEFAULT,$(F_,Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),n_DEFAULT),x_Symbol),
    Condition(With(List(Set(v,ActivateTrig(F(Plus(c,Times(d,x)))))),Dist(Times(Power(a,IntPart(n)),Power(Times(a,Power(Times(b,v),p)),FracPart(n)),Power(Power(Times(b,v),Times(p,FracPart(n))),CN1)),Int(Power(Times(b,v),Times(n,p)),x),x)),And(FreeQ(List(a,b,c,d,n,p),x),InertTrigQ(FSymbol),Not(IntegerQ(n)),Not(IntegerQ(p))))),
IIntegrate(4334,Int(Times(u_,$(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Sin(Times(c,Plus(a,Times(b,x)))),x))),Condition(Dist(Times(d,Power(Times(b,c),CN1)),Subst(Int(SubstFor(C1,Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x),x),x,Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,CN1))),x),FunctionOfQ(Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x,True))),And(FreeQ(List(a,b,c),x),Or(EqQ(FSymbol,Cos),EqQ(FSymbol,$s("§cos")))))),
IIntegrate(4335,Int(Times(u_,$(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Cos(Times(c,Plus(a,Times(b,x)))),x))),Condition(Negate(Dist(Times(d,Power(Times(b,c),CN1)),Subst(Int(SubstFor(C1,Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x),x),x,Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,CN1))),x)),FunctionOfQ(Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x,True))),And(FreeQ(List(a,b,c),x),Or(EqQ(FSymbol,Sin),EqQ(FSymbol,$s("§sin")))))),
IIntegrate(4336,Int(Times(Cosh(Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),u_),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Sinh(Times(c,Plus(a,Times(b,x)))),x))),Condition(Dist(Times(d,Power(Times(b,c),CN1)),Subst(Int(SubstFor(C1,Times(Sinh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x),x),x,Times(Sinh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1))),x),FunctionOfQ(Times(Sinh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x,True))),FreeQ(List(a,b,c),x))),
IIntegrate(4337,Int(Times(u_,Sinh(Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Cosh(Times(c,Plus(a,Times(b,x)))),x))),Condition(Dist(Times(d,Power(Times(b,c),CN1)),Subst(Int(SubstFor(C1,Times(Cosh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x),x),x,Times(Cosh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1))),x),FunctionOfQ(Times(Cosh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x,True))),FreeQ(List(a,b,c),x))),
IIntegrate(4338,Int(Times(u_,$(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Sin(Times(c,Plus(a,Times(b,x)))),x))),Condition(Dist(Power(Times(b,c),CN1),Subst(Int(SubstFor(Power(x,CN1),Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x),x),x,Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,CN1))),x),FunctionOfQ(Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x,True))),And(FreeQ(List(a,b,c),x),Or(EqQ(FSymbol,Cot),EqQ(FSymbol,$s("§cot")))))),
IIntegrate(4339,Int(Times(u_,$(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Cos(Times(c,Plus(a,Times(b,x)))),x))),Condition(Negate(Dist(Power(Times(b,c),CN1),Subst(Int(SubstFor(Power(x,CN1),Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x),x),x,Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,CN1))),x)),FunctionOfQ(Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x,True))),And(FreeQ(List(a,b,c),x),Or(EqQ(FSymbol,Tan),EqQ(FSymbol,$s("§tan")))))),
IIntegrate(4340,Int(Times(Coth(Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),u_),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Sinh(Times(c,Plus(a,Times(b,x)))),x))),Condition(Dist(Power(Times(b,c),CN1),Subst(Int(SubstFor(Power(x,CN1),Times(Sinh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x),x),x,Times(Sinh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1))),x),FunctionOfQ(Times(Sinh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x,True))),FreeQ(List(a,b,c),x))),
IIntegrate(4341,Int(Times(u_,Tanh(Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Cosh(Times(c,Plus(a,Times(b,x)))),x))),Condition(Dist(Power(Times(b,c),CN1),Subst(Int(SubstFor(Power(x,CN1),Times(Cosh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x),x),x,Times(Cosh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1))),x),FunctionOfQ(Times(Cosh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x,True))),FreeQ(List(a,b,c),x))),
IIntegrate(4342,Int(Times(u_,Sqr($(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Tan(Times(c,Plus(a,Times(b,x)))),x))),Condition(Dist(Times(d,Power(Times(b,c),CN1)),Subst(Int(SubstFor(C1,Times(Tan(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x),x),x,Times(Tan(Times(c,Plus(a,Times(b,x)))),Power(d,CN1))),x),FunctionOfQ(Times(Tan(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x,True))),And(FreeQ(List(a,b,c),x),NonsumQ(u),Or(EqQ(FSymbol,Sec),EqQ(FSymbol,$s("§sec")))))),
IIntegrate(4343,Int(Times(Power($($s("§cos"),Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),CN2),u_),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Tan(Times(c,Plus(a,Times(b,x)))),x))),Condition(Dist(Times(d,Power(Times(b,c),CN1)),Subst(Int(SubstFor(C1,Times(Tan(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x),x),x,Times(Tan(Times(c,Plus(a,Times(b,x)))),Power(d,CN1))),x),FunctionOfQ(Times(Tan(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x,True))),And(FreeQ(List(a,b,c),x),NonsumQ(u)))),
IIntegrate(4344,Int(Times(u_,Sqr($(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Cot(Times(c,Plus(a,Times(b,x)))),x))),Condition(Negate(Dist(Times(d,Power(Times(b,c),CN1)),Subst(Int(SubstFor(C1,Times(Cot(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x),x),x,Times(Cot(Times(c,Plus(a,Times(b,x)))),Power(d,CN1))),x)),FunctionOfQ(Times(Cot(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x,True))),And(FreeQ(List(a,b,c),x),NonsumQ(u),Or(EqQ(FSymbol,Csc),EqQ(FSymbol,$s("§csc")))))),
IIntegrate(4345,Int(Times(u_,Power($($s("§sin"),Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),CN2)),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Cot(Times(c,Plus(a,Times(b,x)))),x))),Condition(Negate(Dist(Times(d,Power(Times(b,c),CN1)),Subst(Int(SubstFor(C1,Times(Cot(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x),x),x,Times(Cot(Times(c,Plus(a,Times(b,x)))),Power(d,CN1))),x)),FunctionOfQ(Times(Cot(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x,True))),And(FreeQ(List(a,b,c),x),NonsumQ(u)))),
IIntegrate(4346,Int(Times(u_,Sqr(Sech(Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Tanh(Times(c,Plus(a,Times(b,x)))),x))),Condition(Dist(Times(d,Power(Times(b,c),CN1)),Subst(Int(SubstFor(C1,Times(Tanh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x),x),x,Times(Tanh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1))),x),FunctionOfQ(Times(Tanh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x,True))),And(FreeQ(List(a,b,c),x),NonsumQ(u)))),
IIntegrate(4347,Int(Times(Sqr(Csch(Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),u_),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Coth(Times(c,Plus(a,Times(b,x)))),x))),Condition(Negate(Dist(Times(d,Power(Times(b,c),CN1)),Subst(Int(SubstFor(C1,Times(Coth(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x),x),x,Times(Coth(Times(c,Plus(a,Times(b,x)))),Power(d,CN1))),x)),FunctionOfQ(Times(Coth(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x,True))),And(FreeQ(List(a,b,c),x),NonsumQ(u)))),
IIntegrate(4348,Int(Times(u_,Power($(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Tan(Times(c,Plus(a,Times(b,x)))),x))),Condition(Dist(Power(Times(b,c,Power(d,Subtract(n,C1))),CN1),Subst(Int(SubstFor(Power(Times(Power(x,n),Plus(C1,Times(Sqr(d),Sqr(x)))),CN1),Times(Tan(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x),x),x,Times(Tan(Times(c,Plus(a,Times(b,x)))),Power(d,CN1))),x),And(FunctionOfQ(Times(Tan(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x,True),TryPureTanSubst(Times(ActivateTrig(u),Power(Cot(Times(c,Plus(a,Times(b,x)))),n)),x)))),And(FreeQ(List(a,b,c),x),IntegerQ(n),Or(EqQ(FSymbol,Cot),EqQ(FSymbol,$s("§cot")))))),
IIntegrate(4349,Int(Times(u_,Power($(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Cot(Times(c,Plus(a,Times(b,x)))),x))),Condition(Negate(Dist(Power(Times(b,c,Power(d,Subtract(n,C1))),CN1),Subst(Int(SubstFor(Power(Times(Power(x,n),Plus(C1,Times(Sqr(d),Sqr(x)))),CN1),Times(Cot(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x),x),x,Times(Cot(Times(c,Plus(a,Times(b,x)))),Power(d,CN1))),x)),And(FunctionOfQ(Times(Cot(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x,True),TryPureTanSubst(Times(ActivateTrig(u),Power(Tan(Times(c,Plus(a,Times(b,x)))),n)),x)))),And(FreeQ(List(a,b,c),x),IntegerQ(n),Or(EqQ(FSymbol,Tan),EqQ(FSymbol,$s("§tan")))))),
IIntegrate(4350,Int(Times(Power(Coth(Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_DEFAULT),u_),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Tanh(Times(c,Plus(a,Times(b,x)))),x))),Condition(Dist(Power(Times(b,c,Power(d,Subtract(n,C1))),CN1),Subst(Int(SubstFor(Power(Times(Power(x,n),Subtract(C1,Times(Sqr(d),Sqr(x)))),CN1),Times(Tanh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x),x),x,Times(Tanh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1))),x),And(FunctionOfQ(Times(Tanh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x,True),TryPureTanSubst(Times(ActivateTrig(u),Power(Coth(Times(c,Plus(a,Times(b,x)))),n)),x)))),And(FreeQ(List(a,b,c),x),IntegerQ(n))))
  );
}
