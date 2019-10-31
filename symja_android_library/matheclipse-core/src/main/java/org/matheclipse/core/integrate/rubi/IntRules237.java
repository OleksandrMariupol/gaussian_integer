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
public class IntRules237 { 
  public static IAST RULES = List( 
IIntegrate(5926,Int(Times(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_,Times(e_DEFAULT,x_)),q_DEFAULT)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Plus(d,Times(e,x)),Plus(q,C1)),Plus(a,Times(b,ArcTanh(Times(c,x)))),Power(Times(e,Plus(q,C1)),CN1)),x),Dist(Times(b,c,Power(Times(e,Plus(q,C1)),CN1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(q,C1)),Power(Subtract(C1,Times(Sqr(c),Sqr(x))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,q),x),NeQ(q,CN1)))),
IIntegrate(5927,Int(Times(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_,Times(e_DEFAULT,x_)),q_DEFAULT)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Plus(d,Times(e,x)),Plus(q,C1)),Plus(a,Times(b,ArcCoth(Times(c,x)))),Power(Times(e,Plus(q,C1)),CN1)),x),Dist(Times(b,c,Power(Times(e,Plus(q,C1)),CN1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(q,C1)),Power(Subtract(C1,Times(Sqr(c),Sqr(x))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,q),x),NeQ(q,CN1)))),
IIntegrate(5928,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(Plus(d_,Times(e_DEFAULT,x_)),q_DEFAULT)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Plus(d,Times(e,x)),Plus(q,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Times(e,Plus(q,C1)),CN1)),x),Dist(Times(b,c,p,Power(Times(e,Plus(q,C1)),CN1)),Int(ExpandIntegrand(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Subtract(p,C1)),Times(Power(Plus(d,Times(e,x)),Plus(q,C1)),Power(Subtract(C1,Times(Sqr(c),Sqr(x))),CN1)),x),x),x)),And(FreeQ(List(a,b,c,d,e),x),IGtQ(p,C1),IntegerQ(q),NeQ(q,CN1)))),
IIntegrate(5929,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(Plus(d_,Times(e_DEFAULT,x_)),q_DEFAULT)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Plus(d,Times(e,x)),Plus(q,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Power(Times(e,Plus(q,C1)),CN1)),x),Dist(Times(b,c,p,Power(Times(e,Plus(q,C1)),CN1)),Int(ExpandIntegrand(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Subtract(p,C1)),Times(Power(Plus(d,Times(e,x)),Plus(q,C1)),Power(Subtract(C1,Times(Sqr(c),Sqr(x))),CN1)),x),x),x)),And(FreeQ(List(a,b,c,d,e),x),IGtQ(p,C1),IntegerQ(q),NeQ(q,CN1)))),
IIntegrate(5930,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),CN1)),x_Symbol),
    Condition(Subtract(Dist(Times(f,Power(e,CN1)),Int(Times(Power(Times(f,x),Subtract(m,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p)),x),x),Dist(Times(d,f,Power(e,CN1)),Int(Times(Power(Times(f,x),Subtract(m,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Plus(d,Times(e,x)),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(p,C0),EqQ(Subtract(Times(Sqr(c),Sqr(d)),Sqr(e)),C0),GtQ(m,C0)))),
IIntegrate(5931,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),CN1)),x_Symbol),
    Condition(Subtract(Dist(Times(f,Power(e,CN1)),Int(Times(Power(Times(f,x),Subtract(m,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p)),x),x),Dist(Times(d,f,Power(e,CN1)),Int(Times(Power(Times(f,x),Subtract(m,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Power(Plus(d,Times(e,x)),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(p,C0),EqQ(Subtract(Times(Sqr(c),Sqr(d)),Sqr(e)),C0),GtQ(m,C0)))),
IIntegrate(5932,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,CN1),Power(Plus(d_,Times(e_DEFAULT,x_)),CN1)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Log(Subtract(C2,Times(C2,Power(Plus(C1,Times(e,x,Power(d,CN1))),CN1)))),Power(d,CN1)),x),Dist(Times(b,c,p,Power(d,CN1)),Int(Times(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Subtract(p,C1)),Log(Subtract(C2,Times(C2,Power(Plus(C1,Times(e,x,Power(d,CN1))),CN1)))),Power(Subtract(C1,Times(Sqr(c),Sqr(x))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e),x),IGtQ(p,C0),EqQ(Subtract(Times(Sqr(c),Sqr(d)),Sqr(e)),C0)))),
IIntegrate(5933,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,CN1),Power(Plus(d_,Times(e_DEFAULT,x_)),CN1)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Log(Subtract(C2,Times(C2,Power(Plus(C1,Times(e,x,Power(d,CN1))),CN1)))),Power(d,CN1)),x),Dist(Times(b,c,p,Power(d,CN1)),Int(Times(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Subtract(p,C1)),Log(Subtract(C2,Times(C2,Power(Plus(C1,Times(e,x,Power(d,CN1))),CN1)))),Power(Subtract(C1,Times(Sqr(c),Sqr(x))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e),x),IGtQ(p,C0),EqQ(Subtract(Times(Sqr(c),Sqr(d)),Sqr(e)),C0)))),
IIntegrate(5934,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,x_)),CN1)),x_Symbol),
    Condition(Subtract(Dist(Power(d,CN1),Int(Times(Power(Times(f,x),m),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p)),x),x),Dist(Times(e,Power(Times(d,f),CN1)),Int(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Plus(d,Times(e,x)),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(p,C0),EqQ(Subtract(Times(Sqr(c),Sqr(d)),Sqr(e)),C0),LtQ(m,CN1)))),
IIntegrate(5935,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,x_)),CN1)),x_Symbol),
    Condition(Subtract(Dist(Power(d,CN1),Int(Times(Power(Times(f,x),m),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p)),x),x),Dist(Times(e,Power(Times(d,f),CN1)),Int(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Power(Plus(d,Times(e,x)),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(p,C0),EqQ(Subtract(Times(Sqr(c),Sqr(d)),Sqr(e)),C0),LtQ(m,CN1)))),
IIntegrate(5936,Int(Times(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),q_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,x)),q)),x))),Subtract(Dist(Plus(a,Times(b,ArcTanh(Times(c,x)))),u,x),Dist(Times(b,c),Int(SimplifyIntegrand(Times(u,Power(Subtract(C1,Times(Sqr(c),Sqr(x))),CN1)),x),x),x))),And(FreeQ(List(a,b,c,d,e,f,q),x),NeQ(q,CN1),IntegerQ(Times(C2,m)),Or(And(IGtQ(m,C0),IGtQ(q,C0)),And(ILtQ(Plus(m,q,C1),C0),LtQ(Times(m,q),C0)))))),
IIntegrate(5937,Int(Times(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),q_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,x)),q)),x))),Subtract(Dist(Plus(a,Times(b,ArcCoth(Times(c,x)))),u,x),Dist(Times(b,c),Int(SimplifyIntegrand(Times(u,Power(Subtract(C1,Times(Sqr(c),Sqr(x))),CN1)),x),x),x))),And(FreeQ(List(a,b,c,d,e,f,q),x),NeQ(q,CN1),IntegerQ(Times(C2,m)),Or(And(IGtQ(m,C0),IGtQ(q,C0)),And(ILtQ(Plus(m,q,C1),C0),LtQ(Times(m,q),C0)))))),
IIntegrate(5938,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),q_)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,x)),q)),x))),Subtract(Dist(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),u,x),Dist(Times(b,c,p),Int(ExpandIntegrand(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Subtract(p,C1)),Times(u,Power(Subtract(C1,Times(Sqr(c),Sqr(x))),CN1)),x),x),x))),And(FreeQ(List(a,b,c,d,e,f,q),x),IGtQ(p,C1),EqQ(Subtract(Times(Sqr(c),Sqr(d)),Sqr(e)),C0),IntegersQ(m,q),NeQ(m,CN1),NeQ(q,CN1),ILtQ(Plus(m,q,C1),C0),LtQ(Times(m,q),C0)))),
IIntegrate(5939,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),q_)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,x)),q)),x))),Subtract(Dist(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),u,x),Dist(Times(b,c,p),Int(ExpandIntegrand(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Subtract(p,C1)),Times(u,Power(Subtract(C1,Times(Sqr(c),Sqr(x))),CN1)),x),x),x))),And(FreeQ(List(a,b,c,d,e,f,q),x),IGtQ(p,C1),EqQ(Subtract(Times(Sqr(c),Sqr(d)),Sqr(e)),C0),IntegersQ(m,q),NeQ(m,CN1),NeQ(q,CN1),ILtQ(Plus(m,q,C1),C0),LtQ(Times(m,q),C0)))),
IIntegrate(5940,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),q_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Times(Power(Times(f,x),m),Power(Plus(d,Times(e,x)),q)),x),x),And(FreeQ(List(a,b,c,d,e,f,m),x),IGtQ(p,C0),IntegerQ(q),Or(GtQ(q,C0),NeQ(a,C0),IntegerQ(m))))),
IIntegrate(5941,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),q_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Times(Power(Times(f,x),m),Power(Plus(d,Times(e,x)),q)),x),x),And(FreeQ(List(a,b,c,d,e,f,m),x),IGtQ(p,C0),IntegerQ(q),Or(GtQ(q,C0),NeQ(a,C0),IntegerQ(m))))),
IIntegrate(5942,Int(Times(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(b,Power(Plus(d,Times(e,Sqr(x))),q),Power(Times(C2,c,q,Plus(Times(C2,q),C1)),CN1)),x),Dist(Times(C2,d,q,Power(Plus(Times(C2,q),C1),CN1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Subtract(q,C1)),Plus(a,Times(b,ArcTanh(Times(c,x))))),x),x),Simp(Times(x,Power(Plus(d,Times(e,Sqr(x))),q),Plus(a,Times(b,ArcTanh(Times(c,x)))),Power(Plus(Times(C2,q),C1),CN1)),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(q,C0)))),
IIntegrate(5943,Int(Times(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(b,Power(Plus(d,Times(e,Sqr(x))),q),Power(Times(C2,c,q,Plus(Times(C2,q),C1)),CN1)),x),Dist(Times(C2,d,q,Power(Plus(Times(C2,q),C1),CN1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Subtract(q,C1)),Plus(a,Times(b,ArcCoth(Times(c,x))))),x),x),Simp(Times(x,Power(Plus(d,Times(e,Sqr(x))),q),Plus(a,Times(b,ArcCoth(Times(c,x)))),Power(Plus(Times(C2,q),C1),CN1)),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(q,C0)))),
IIntegrate(5944,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(b,p,Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Subtract(p,C1)),Power(Times(C2,c,q,Plus(Times(C2,q),C1)),CN1)),x),Dist(Times(C2,d,q,Power(Plus(Times(C2,q),C1),CN1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Subtract(q,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p)),x),x),Negate(Dist(Times(Sqr(b),d,p,Subtract(p,C1),Power(Times(C2,q,Plus(Times(C2,q),C1)),CN1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Subtract(q,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Subtract(p,C2))),x),x)),Simp(Times(x,Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),p),Power(Plus(Times(C2,q),C1),CN1)),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(q,C0),GtQ(p,C1)))),
IIntegrate(5945,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(b,p,Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Subtract(p,C1)),Power(Times(C2,c,q,Plus(Times(C2,q),C1)),CN1)),x),Dist(Times(C2,d,q,Power(Plus(Times(C2,q),C1),CN1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Subtract(q,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p)),x),x),Negate(Dist(Times(Sqr(b),d,p,Subtract(p,C1),Power(Times(C2,q,Plus(Times(C2,q),C1)),CN1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Subtract(q,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Subtract(p,C2))),x),x)),Simp(Times(x,Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),p),Power(Plus(Times(C2,q),C1),CN1)),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(q,C0),GtQ(p,C1)))),
IIntegrate(5946,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),CN1),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Simp(Times(Log(RemoveContent(Plus(a,Times(b,ArcTanh(Times(c,x)))),x)),Power(Times(b,c,d),CN1)),x),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0)))),
IIntegrate(5947,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),CN1),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Simp(Times(Log(RemoveContent(Plus(a,Times(b,ArcCoth(Times(c,x)))),x)),Power(Times(b,c,d),CN1)),x),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0)))),
IIntegrate(5948,Int(Times(Power(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Simp(Times(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(p,C1)),Power(Times(b,c,d,Plus(p,C1)),CN1)),x),And(FreeQ(List(a,b,c,d,e,p),x),EqQ(Plus(Times(Sqr(c),d),e),C0),NeQ(p,CN1)))),
IIntegrate(5949,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCoth(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Simp(Times(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(p,C1)),Power(Times(b,c,d,Plus(p,C1)),CN1)),x),And(FreeQ(List(a,b,c,d,e,p),x),EqQ(Plus(Times(Sqr(c),d),e),C0),NeQ(p,CN1)))),
IIntegrate(5950,Int(Times(Plus(a_DEFAULT,Times(ArcTanh(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Simp(Times(CN2,Plus(a,Times(b,ArcTanh(Times(c,x)))),ArcTan(Times(Sqrt(Subtract(C1,Times(c,x))),Power(Plus(C1,Times(c,x)),CN1D2))),Power(Times(c,Sqrt(d)),CN1)),x),Negate(Simp(Times(CI,b,PolyLog(C2,Times(CN1,CI,Sqrt(Subtract(C1,Times(c,x))),Power(Plus(C1,Times(c,x)),CN1D2))),Power(Times(c,Sqrt(d)),CN1)),x)),Simp(Times(CI,b,PolyLog(C2,Times(CI,Sqrt(Subtract(C1,Times(c,x))),Power(Plus(C1,Times(c,x)),CN1D2))),Power(Times(c,Sqrt(d)),CN1)),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(d,C0))))
  );
}
