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
public class IntRules7 { 
  public static IAST RULES = List( 
IIntegrate(176,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),QQ(-3L,2L)),Sqrt(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),CN1D2),Power(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),CN1D2)),x_Symbol),
    Condition(Dist(Times(CN2,Sqrt(Plus(c,Times(d,x))),Sqrt(Times(CN1,Subtract(Times(b,e),Times(a,f)),Plus(g,Times(h,x)),Power(Times(Subtract(Times(f,g),Times(e,h)),Plus(a,Times(b,x))),CN1))),Power(Times(Subtract(Times(b,e),Times(a,f)),Sqrt(Plus(g,Times(h,x))),Sqrt(Times(Subtract(Times(b,e),Times(a,f)),Plus(c,Times(d,x)),Power(Times(Subtract(Times(d,e),Times(c,f)),Plus(a,Times(b,x))),CN1)))),CN1)),Subst(Int(Times(Sqrt(Plus(C1,Times(Subtract(Times(b,c),Times(a,d)),Sqr(x),Power(Subtract(Times(d,e),Times(c,f)),CN1)))),Power(Subtract(C1,Times(Subtract(Times(b,g),Times(a,h)),Sqr(x),Power(Subtract(Times(f,g),Times(e,h)),CN1))),CN1D2)),x),x,Times(Sqrt(Plus(e,Times(f,x))),Power(Plus(a,Times(b,x)),CN1D2))),x),FreeQ(List(a,b,c,d,e,f,g,h),x))),
IIntegrate(177,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),m_),Sqrt(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),CN1D2),Power(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),CN1D2)),x_Symbol),
    Condition(Plus(Simp(Times(b,Power(Plus(a,Times(b,x)),Plus(m,C1)),Sqrt(Plus(c,Times(d,x))),Sqrt(Plus(e,Times(f,x))),Sqrt(Plus(g,Times(h,x))),Power(Times(Plus(m,C1),Subtract(Times(b,e),Times(a,f)),Subtract(Times(b,g),Times(a,h))),CN1)),x),Dist(Power(Times(C2,Plus(m,C1),Subtract(Times(b,e),Times(a,f)),Subtract(Times(b,g),Times(a,h))),CN1),Int(Times(Power(Plus(a,Times(b,x)),Plus(m,C1)),Power(Times(Sqrt(Plus(c,Times(d,x))),Sqrt(Plus(e,Times(f,x))),Sqrt(Plus(g,Times(h,x)))),CN1),Simp(Subtract(Plus(Times(C2,a,c,f,h,Plus(m,C1)),Times(CN1,b,Plus(Times(d,e,g),Times(c,Plus(Times(C2,m),C3),Plus(Times(f,g),Times(e,h))))),Times(C2,Subtract(Times(a,d,f,h,Plus(m,C1)),Times(b,Plus(m,C2),Plus(Times(d,f,g),Times(d,e,h),Times(c,f,h)))),x)),Times(b,d,f,h,Plus(Times(C2,m),C5),Sqr(x))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,g,h,m),x),IntegerQ(Times(C2,m)),LeQ(m,CN2)))),
IIntegrate(178,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),CN1),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),CN1),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),p_),Power(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),q_)),x_Symbol),
    Condition(Subtract(Dist(Times(Subtract(Times(b,e),Times(a,f)),Power(Subtract(Times(b,c),Times(a,d)),CN1)),Int(Times(Power(Plus(e,Times(f,x)),Subtract(p,C1)),Power(Plus(g,Times(h,x)),q),Power(Plus(a,Times(b,x)),CN1)),x),x),Dist(Times(Subtract(Times(d,e),Times(c,f)),Power(Subtract(Times(b,c),Times(a,d)),CN1)),Int(Times(Power(Plus(e,Times(f,x)),Subtract(p,C1)),Power(Plus(g,Times(h,x)),q),Power(Plus(c,Times(d,x)),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f,g,h,q),x),LtQ(C0,p,C1)))),
IIntegrate(179,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),m_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),CN1D2),Power(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),CN1D2)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Times(Sqrt(Plus(c,Times(d,x))),Sqrt(Plus(e,Times(f,x))),Sqrt(Plus(g,Times(h,x)))),CN1),Times(Power(Plus(a,Times(b,x)),m),Power(Plus(c,Times(d,x)),Plus(n,C1D2))),x),x),And(FreeQ(List(a,b,c,d,e,f,g,h),x),IntegerQ(m),IntegerQ(Plus(n,C1D2))))),
IIntegrate(180,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),p_),Power(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),q_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(a,Times(b,x)),m),Power(Plus(c,Times(d,x)),n),Power(Plus(e,Times(f,x)),p),Power(Plus(g,Times(h,x)),q)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,h,m,n),x),IntegersQ(p,q)))),
IIntegrate(181,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),p_),Power(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),q_)),x_Symbol),
    Condition(Plus(Dist(Times(h,Power(b,CN1)),Int(Times(Power(Plus(a,Times(b,x)),Plus(m,C1)),Power(Plus(c,Times(d,x)),n),Power(Plus(e,Times(f,x)),p),Power(Plus(g,Times(h,x)),Subtract(q,C1))),x),x),Dist(Times(Subtract(Times(b,g),Times(a,h)),Power(b,CN1)),Int(Times(Power(Plus(a,Times(b,x)),m),Power(Plus(c,Times(d,x)),n),Power(Plus(e,Times(f,x)),p),Power(Plus(g,Times(h,x)),Subtract(q,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,f,g,h,m,n,p),x),IGtQ(q,C0),Or(SumSimplerQ(m,C1),And(Not(SumSimplerQ(n,C1)),Not(SumSimplerQ(p,C1))))))),
IIntegrate(182,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),m_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),p_DEFAULT),Power(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),q_DEFAULT)),x_Symbol),
    Condition(CannotIntegrate(Times(Power(Plus(a,Times(b,x)),m),Power(Plus(c,Times(d,x)),n),Power(Plus(e,Times(f,x)),p),Power(Plus(g,Times(h,x)),q)),x),FreeQ(List(a,b,c,d,e,f,g,h,m,n,p,q),x))),
IIntegrate(183,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,u_)),m_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,u_)),n_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,u_)),p_DEFAULT),Power(Plus(g_DEFAULT,Times(h_DEFAULT,u_)),q_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Coefficient(u,x,C1),CN1),Subst(Int(Times(Power(Plus(a,Times(b,x)),m),Power(Plus(c,Times(d,x)),n),Power(Plus(e,Times(f,x)),p),Power(Plus(g,Times(h,x)),q)),x),x,u),x),And(FreeQ(List(a,b,c,d,e,f,g,h,m,n,p,q),x),LinearQ(u,x),NeQ(u,x)))),
IIntegrate(184,Int(Power(Times(i_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),p_),Power(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),q_)),r_),x_Symbol),
    Condition(Dist(Times(Power(Times(i,Power(Plus(a,Times(b,x)),m),Power(Plus(c,Times(d,x)),n),Power(Plus(e,Times(f,x)),p),Power(Plus(g,Times(h,x)),q)),r),Power(Times(Power(Plus(a,Times(b,x)),Times(m,r)),Power(Plus(c,Times(d,x)),Times(n,r)),Power(Plus(e,Times(f,x)),Times(p,r)),Power(Plus(g,Times(h,x)),Times(q,r))),CN1)),Int(Times(Power(Plus(a,Times(b,x)),Times(m,r)),Power(Plus(c,Times(d,x)),Times(n,r)),Power(Plus(e,Times(f,x)),Times(p,r)),Power(Plus(g,Times(h,x)),Times(q,r))),x),x),FreeQ(List(a,b,c,d,e,f,g,h,i,m,n,p,q,r),x))),
IIntegrate(185,Int(Power(u_,m_),x_Symbol),
    Condition(Int(Power(ExpandToSum(u,x),m),x),And(FreeQ(m,x),LinearQ(u,x),Not(LinearMatchQ(u,x))))),
IIntegrate(186,Int(Times(Power(u_,m_DEFAULT),Power(v_,n_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(ExpandToSum(u,x),m),Power(ExpandToSum(v,x),n)),x),And(FreeQ(List(m,n),x),LinearQ(List(u,v),x),Not(LinearMatchQ(List(u,v),x))))),
IIntegrate(187,Int(Times(Power(u_,m_DEFAULT),Power(v_,n_DEFAULT),Power(w_,p_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(ExpandToSum(u,x),m),Power(ExpandToSum(v,x),n),Power(ExpandToSum(w,x),p)),x),And(FreeQ(List(m,n,p),x),LinearQ(List(u,v,w),x),Not(LinearMatchQ(List(u,v,w),x))))),
IIntegrate(188,Int(Times(Power(u_,m_DEFAULT),Power(v_,n_DEFAULT),Power(w_,p_DEFAULT),Power(z_,q_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(ExpandToSum(u,x),m),Power(ExpandToSum(v,x),n),Power(ExpandToSum(w,x),p),Power(ExpandToSum(z,x),q)),x),And(FreeQ(List(m,n,p,q),x),LinearQ(List(u,v,w,z),x),Not(LinearMatchQ(List(u,v,w,z),x))))),
IIntegrate(189,Int(Power(Times(b_DEFAULT,Power(x_,n_)),p_),x_Symbol),
    Condition(Dist(Times(Power(b,IntPart(p)),Power(Times(b,Power(x,n)),FracPart(p)),Power(Power(x,Times(n,FracPart(p))),CN1)),Int(Power(x,Times(n,p)),x),x),FreeQ(List(b,n,p),x))),
IIntegrate(190,Int(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),x_Symbol),
    Condition(Dist(Power(n,CN1),Subst(Int(Times(Power(x,Subtract(Power(n,CN1),C1)),Power(Plus(a,Times(b,x)),p)),x),x,Power(x,n)),x),And(FreeQ(List(a,b,p),x),FractionQ(n),IntegerQ(Power(n,CN1))))),
IIntegrate(191,Int(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),x_Symbol),
    Condition(Simp(Times(x,Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(a,CN1)),x),And(FreeQ(List(a,b,n,p),x),EqQ(Plus(Power(n,CN1),p,C1),C0)))),
IIntegrate(192,Int(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),x_Symbol),
    Condition(Plus(Negate(Simp(Times(x,Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Times(a,n,Plus(p,C1)),CN1)),x)),Dist(Times(Plus(Times(n,Plus(p,C1)),C1),Power(Times(a,n,Plus(p,C1)),CN1)),Int(Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),x),x)),And(FreeQ(List(a,b,n,p),x),ILtQ(Simplify(Plus(Power(n,CN1),p,C1)),C0),NeQ(p,CN1)))),
IIntegrate(193,Int(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),x_Symbol),
    Condition(Int(Times(Power(x,Times(n,p)),Power(Plus(b,Times(a,Power(Power(x,n),CN1))),p)),x),And(FreeQ(List(a,b),x),LtQ(n,C0),IntegerQ(p)))),
IIntegrate(194,Int(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(a,Times(b,Power(x,n))),p),x),x),And(FreeQ(List(a,b),x),IGtQ(n,C0),IGtQ(p,C0)))),
IIntegrate(195,Int(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(Times(n,p),C1),CN1)),x),Dist(Times(a,n,p,Power(Plus(Times(n,p),C1),CN1)),Int(Power(Plus(a,Times(b,Power(x,n))),Subtract(p,C1)),x),x)),And(FreeQ(List(a,b),x),IGtQ(n,C0),GtQ(p,C0),Or(IntegerQ(Times(C2,p)),And(EqQ(n,C2),IntegerQ(Times(C4,p))),And(EqQ(n,C2),IntegerQ(Times(C3,p))),LtQ(Denominator(Plus(p,Power(n,CN1))),Denominator(p)))))),
IIntegrate(196,Int(Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),QQ(-5L,4L)),x_Symbol),
    Condition(Simp(Times(C2,EllipticE(Times(C1D2,C1,ArcTan(Times(Rt(Times(b,Power(a,CN1)),C2),x))),C2),Power(Times(Power(a,QQ(5L,4L)),Rt(Times(b,Power(a,CN1)),C2)),CN1)),x),And(FreeQ(List(a,b),x),GtQ(a,C0),PosQ(Times(b,Power(a,CN1)))))),
IIntegrate(197,Int(Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),QQ(-5L,4L)),x_Symbol),
    Condition(Dist(Times(Power(Plus(C1,Times(b,Sqr(x),Power(a,CN1))),C1D4),Power(Times(a,Power(Plus(a,Times(b,Sqr(x))),C1D4)),CN1)),Int(Power(Plus(C1,Times(b,Sqr(x),Power(a,CN1))),QQ(-5L,4L)),x),x),And(FreeQ(List(a,b),x),PosQ(a),PosQ(Times(b,Power(a,CN1)))))),
IIntegrate(198,Int(Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),QQ(-7L,6L)),x_Symbol),
    Condition(Dist(Power(Times(Power(Plus(a,Times(b,Sqr(x))),QQ(2L,3L)),Power(Times(a,Power(Plus(a,Times(b,Sqr(x))),CN1)),QQ(2L,3L))),CN1),Subst(Int(Power(Subtract(C1,Times(b,Sqr(x))),CN1D3),x),x,Times(x,Power(Plus(a,Times(b,Sqr(x))),CN1D2))),x),FreeQ(List(a,b),x))),
IIntegrate(199,Int(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_),x_Symbol),
    Condition(Plus(Negate(Simp(Times(x,Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Times(a,n,Plus(p,C1)),CN1)),x)),Dist(Times(Plus(Times(n,Plus(p,C1)),C1),Power(Times(a,n,Plus(p,C1)),CN1)),Int(Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),x),x)),And(FreeQ(List(a,b),x),IGtQ(n,C0),LtQ(p,CN1),Or(IntegerQ(Times(C2,p)),And(Equal(n,C2),IntegerQ(Times(C4,p))),And(Equal(n,C2),IntegerQ(Times(C3,p))),Less(Denominator(Plus(p,Power(n,CN1))),Denominator(p)))))),
IIntegrate(200,Int(Power(Plus(a_,Times(b_DEFAULT,Power(x_,C3))),CN1),x_Symbol),
    Condition(Plus(Dist(Power(Times(C3,Sqr(Rt(a,C3))),CN1),Int(Power(Plus(Rt(a,C3),Times(Rt(b,C3),x)),CN1),x),x),Dist(Power(Times(C3,Sqr(Rt(a,C3))),CN1),Int(Times(Subtract(Times(C2,Rt(a,C3)),Times(Rt(b,C3),x)),Power(Plus(Sqr(Rt(a,C3)),Times(CN1,Rt(a,C3),Rt(b,C3),x),Times(Sqr(Rt(b,C3)),Sqr(x))),CN1)),x),x)),FreeQ(List(a,b),x)))
  );
}
