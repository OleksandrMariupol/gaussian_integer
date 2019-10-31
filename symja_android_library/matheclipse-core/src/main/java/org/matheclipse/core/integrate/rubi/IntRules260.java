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
public class IntRules260 { 
  public static IAST RULES = List( 
IIntegrate(6501,Int(Times(Power(x_,CN1),SinIntegral(Times(b_DEFAULT,x_))),x_Symbol),
    Condition(Plus(Simp(Times(C1D2,C1,b,x,HypergeometricPFQ(List(C1,C1,C1),List(C2,C2,C2),Times(CN1,CI,b,x))),x),Simp(Times(C1D2,C1,b,x,HypergeometricPFQ(List(C1,C1,C1),List(C2,C2,C2),Times(CI,b,x))),x)),FreeQ(b,x))),
IIntegrate(6502,Int(Times(CosIntegral(Times(b_DEFAULT,x_)),Power(x_,CN1)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(C1D2,CI,b,x,HypergeometricPFQ(List(C1,C1,C1),List(C2,C2,C2),Times(CN1,CI,b,x))),x)),Simp(Times(C1D2,C1,CI,b,x,HypergeometricPFQ(List(C1,C1,C1),List(C2,C2,C2),Times(CI,b,x))),x),Simp(Times(EulerGamma,Log(x)),x),Simp(Times(C1D2,C1,Sqr(Log(Times(b,x)))),x)),FreeQ(b,x))),
IIntegrate(6503,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),SinIntegral(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),SinIntegral(Plus(a,Times(b,x))),Power(Times(d,Plus(m,C1)),CN1)),x),Dist(Times(b,Power(Times(d,Plus(m,C1)),CN1)),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Sin(Plus(a,Times(b,x))),Power(Plus(a,Times(b,x)),CN1)),x),x)),And(FreeQ(List(a,b,c,d,m),x),NeQ(m,CN1)))),
IIntegrate(6504,Int(Times(CosIntegral(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),CosIntegral(Plus(a,Times(b,x))),Power(Times(d,Plus(m,C1)),CN1)),x),Dist(Times(b,Power(Times(d,Plus(m,C1)),CN1)),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Cos(Plus(a,Times(b,x))),Power(Plus(a,Times(b,x)),CN1)),x),x)),And(FreeQ(List(a,b,c,d,m),x),NeQ(m,CN1)))),
IIntegrate(6505,Int(Sqr(SinIntegral(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Subtract(Simp(Times(Plus(a,Times(b,x)),Sqr(SinIntegral(Plus(a,Times(b,x)))),Power(b,CN1)),x),Dist(C2,Int(Times(Sin(Plus(a,Times(b,x))),SinIntegral(Plus(a,Times(b,x)))),x),x)),FreeQ(List(a,b),x))),
IIntegrate(6506,Int(Sqr(CosIntegral(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Subtract(Simp(Times(Plus(a,Times(b,x)),Sqr(CosIntegral(Plus(a,Times(b,x)))),Power(b,CN1)),x),Dist(C2,Int(Times(Cos(Plus(a,Times(b,x))),CosIntegral(Plus(a,Times(b,x)))),x),x)),FreeQ(List(a,b),x))),
IIntegrate(6507,Int(Times(Power(x_,m_DEFAULT),Sqr(SinIntegral(Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Subtract(Simp(Times(Power(x,Plus(m,C1)),Sqr(SinIntegral(Times(b,x))),Power(Plus(m,C1),CN1)),x),Dist(Times(C2,Power(Plus(m,C1),CN1)),Int(Times(Power(x,m),Sin(Times(b,x)),SinIntegral(Times(b,x))),x),x)),And(FreeQ(b,x),IGtQ(m,C0)))),
IIntegrate(6508,Int(Times(Sqr(CosIntegral(Times(b_DEFAULT,x_))),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(x,Plus(m,C1)),Sqr(CosIntegral(Times(b,x))),Power(Plus(m,C1),CN1)),x),Dist(Times(C2,Power(Plus(m,C1),CN1)),Int(Times(Power(x,m),Cos(Times(b,x)),CosIntegral(Times(b,x))),x),x)),And(FreeQ(b,x),IGtQ(m,C0)))),
IIntegrate(6509,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Sqr(SinIntegral(Plus(a_,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(Plus(Simp(Times(Plus(a,Times(b,x)),Power(Plus(c,Times(d,x)),m),Sqr(SinIntegral(Plus(a,Times(b,x)))),Power(Times(b,Plus(m,C1)),CN1)),x),Negate(Dist(Times(C2,Power(Plus(m,C1),CN1)),Int(Times(Power(Plus(c,Times(d,x)),m),Sin(Plus(a,Times(b,x))),SinIntegral(Plus(a,Times(b,x)))),x),x)),Dist(Times(Subtract(Times(b,c),Times(a,d)),m,Power(Times(b,Plus(m,C1)),CN1)),Int(Times(Power(Plus(c,Times(d,x)),Subtract(m,C1)),Sqr(SinIntegral(Plus(a,Times(b,x))))),x),x)),And(FreeQ(List(a,b,c,d),x),IGtQ(m,C0)))),
IIntegrate(6510,Int(Times(Sqr(CosIntegral(Plus(a_,Times(b_DEFAULT,x_)))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Plus(a,Times(b,x)),Power(Plus(c,Times(d,x)),m),Sqr(CosIntegral(Plus(a,Times(b,x)))),Power(Times(b,Plus(m,C1)),CN1)),x),Negate(Dist(Times(C2,Power(Plus(m,C1),CN1)),Int(Times(Power(Plus(c,Times(d,x)),m),Cos(Plus(a,Times(b,x))),CosIntegral(Plus(a,Times(b,x)))),x),x)),Dist(Times(Subtract(Times(b,c),Times(a,d)),m,Power(Times(b,Plus(m,C1)),CN1)),Int(Times(Power(Plus(c,Times(d,x)),Subtract(m,C1)),Sqr(CosIntegral(Plus(a,Times(b,x))))),x),x)),And(FreeQ(List(a,b,c,d),x),IGtQ(m,C0)))),
IIntegrate(6511,Int(Times(Sin(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),SinIntegral(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Cos(Plus(a,Times(b,x))),SinIntegral(Plus(c,Times(d,x))),Power(b,CN1)),x)),Dist(Times(d,Power(b,CN1)),Int(Times(Cos(Plus(a,Times(b,x))),Sin(Plus(c,Times(d,x))),Power(Plus(c,Times(d,x)),CN1)),x),x)),FreeQ(List(a,b,c,d),x))),
IIntegrate(6512,Int(Times(Cos(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),CosIntegral(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Subtract(Simp(Times(Sin(Plus(a,Times(b,x))),CosIntegral(Plus(c,Times(d,x))),Power(b,CN1)),x),Dist(Times(d,Power(b,CN1)),Int(Times(Sin(Plus(a,Times(b,x))),Cos(Plus(c,Times(d,x))),Power(Plus(c,Times(d,x)),CN1)),x),x)),FreeQ(List(a,b,c,d),x))),
IIntegrate(6513,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Sin(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),SinIntegral(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(e,Times(f,x)),m),Cos(Plus(a,Times(b,x))),SinIntegral(Plus(c,Times(d,x))),Power(b,CN1)),x)),Dist(Times(d,Power(b,CN1)),Int(Times(Power(Plus(e,Times(f,x)),m),Cos(Plus(a,Times(b,x))),Sin(Plus(c,Times(d,x))),Power(Plus(c,Times(d,x)),CN1)),x),x),Dist(Times(f,m,Power(b,CN1)),Int(Times(Power(Plus(e,Times(f,x)),Subtract(m,C1)),Cos(Plus(a,Times(b,x))),SinIntegral(Plus(c,Times(d,x)))),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0)))),
IIntegrate(6514,Int(Times(Cos(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),CosIntegral(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(e,Times(f,x)),m),Sin(Plus(a,Times(b,x))),CosIntegral(Plus(c,Times(d,x))),Power(b,CN1)),x),Negate(Dist(Times(d,Power(b,CN1)),Int(Times(Power(Plus(e,Times(f,x)),m),Sin(Plus(a,Times(b,x))),Cos(Plus(c,Times(d,x))),Power(Plus(c,Times(d,x)),CN1)),x),x)),Negate(Dist(Times(f,m,Power(b,CN1)),Int(Times(Power(Plus(e,Times(f,x)),Subtract(m,C1)),Sin(Plus(a,Times(b,x))),CosIntegral(Plus(c,Times(d,x)))),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0)))),
IIntegrate(6515,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_),Sin(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),SinIntegral(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Sin(Plus(a,Times(b,x))),SinIntegral(Plus(c,Times(d,x))),Power(Times(f,Plus(m,C1)),CN1)),x),Negate(Dist(Times(b,Power(Times(f,Plus(m,C1)),CN1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Cos(Plus(a,Times(b,x))),SinIntegral(Plus(c,Times(d,x)))),x),x)),Negate(Dist(Times(d,Power(Times(f,Plus(m,C1)),CN1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Sin(Plus(a,Times(b,x))),Sin(Plus(c,Times(d,x))),Power(Plus(c,Times(d,x)),CN1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),ILtQ(m,CN1)))),
IIntegrate(6516,Int(Times(Cos(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),CosIntegral(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Cos(Plus(a,Times(b,x))),CosIntegral(Plus(c,Times(d,x))),Power(Times(f,Plus(m,C1)),CN1)),x),Dist(Times(b,Power(Times(f,Plus(m,C1)),CN1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Sin(Plus(a,Times(b,x))),CosIntegral(Plus(c,Times(d,x)))),x),x),Negate(Dist(Times(d,Power(Times(f,Plus(m,C1)),CN1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Cos(Plus(a,Times(b,x))),Cos(Plus(c,Times(d,x))),Power(Plus(c,Times(d,x)),CN1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),ILtQ(m,CN1)))),
IIntegrate(6517,Int(Times(Cos(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),SinIntegral(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Subtract(Simp(Times(Sin(Plus(a,Times(b,x))),SinIntegral(Plus(c,Times(d,x))),Power(b,CN1)),x),Dist(Times(d,Power(b,CN1)),Int(Times(Sin(Plus(a,Times(b,x))),Sin(Plus(c,Times(d,x))),Power(Plus(c,Times(d,x)),CN1)),x),x)),FreeQ(List(a,b,c,d),x))),
IIntegrate(6518,Int(Times(CosIntegral(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),Sin(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Cos(Plus(a,Times(b,x))),CosIntegral(Plus(c,Times(d,x))),Power(b,CN1)),x)),Dist(Times(d,Power(b,CN1)),Int(Times(Cos(Plus(a,Times(b,x))),Cos(Plus(c,Times(d,x))),Power(Plus(c,Times(d,x)),CN1)),x),x)),FreeQ(List(a,b,c,d),x))),
IIntegrate(6519,Int(Times(Cos(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),SinIntegral(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(e,Times(f,x)),m),Sin(Plus(a,Times(b,x))),SinIntegral(Plus(c,Times(d,x))),Power(b,CN1)),x),Negate(Dist(Times(d,Power(b,CN1)),Int(Times(Power(Plus(e,Times(f,x)),m),Sin(Plus(a,Times(b,x))),Sin(Plus(c,Times(d,x))),Power(Plus(c,Times(d,x)),CN1)),x),x)),Negate(Dist(Times(f,m,Power(b,CN1)),Int(Times(Power(Plus(e,Times(f,x)),Subtract(m,C1)),Sin(Plus(a,Times(b,x))),SinIntegral(Plus(c,Times(d,x)))),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0)))),
IIntegrate(6520,Int(Times(CosIntegral(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Sin(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(e,Times(f,x)),m),Cos(Plus(a,Times(b,x))),CosIntegral(Plus(c,Times(d,x))),Power(b,CN1)),x)),Dist(Times(d,Power(b,CN1)),Int(Times(Power(Plus(e,Times(f,x)),m),Cos(Plus(a,Times(b,x))),Cos(Plus(c,Times(d,x))),Power(Plus(c,Times(d,x)),CN1)),x),x),Dist(Times(f,m,Power(b,CN1)),Int(Times(Power(Plus(e,Times(f,x)),Subtract(m,C1)),Cos(Plus(a,Times(b,x))),CosIntegral(Plus(c,Times(d,x)))),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),IGtQ(m,C0)))),
IIntegrate(6521,Int(Times(Cos(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),SinIntegral(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Cos(Plus(a,Times(b,x))),SinIntegral(Plus(c,Times(d,x))),Power(Times(f,Plus(m,C1)),CN1)),x),Dist(Times(b,Power(Times(f,Plus(m,C1)),CN1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Sin(Plus(a,Times(b,x))),SinIntegral(Plus(c,Times(d,x)))),x),x),Negate(Dist(Times(d,Power(Times(f,Plus(m,C1)),CN1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Cos(Plus(a,Times(b,x))),Sin(Plus(c,Times(d,x))),Power(Plus(c,Times(d,x)),CN1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),ILtQ(m,CN1)))),
IIntegrate(6522,Int(Times(CosIntegral(Plus(c_DEFAULT,Times(d_DEFAULT,x_))),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_),Sin(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Sin(Plus(a,Times(b,x))),CosIntegral(Plus(c,Times(d,x))),Power(Times(f,Plus(m,C1)),CN1)),x),Negate(Dist(Times(b,Power(Times(f,Plus(m,C1)),CN1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Cos(Plus(a,Times(b,x))),CosIntegral(Plus(c,Times(d,x)))),x),x)),Negate(Dist(Times(d,Power(Times(f,Plus(m,C1)),CN1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Sin(Plus(a,Times(b,x))),Cos(Plus(c,Times(d,x))),Power(Plus(c,Times(d,x)),CN1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),ILtQ(m,CN1)))),
IIntegrate(6523,Int(SinIntegral(Times(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))),b_DEFAULT)),d_DEFAULT)),x_Symbol),
    Condition(Subtract(Simp(Times(x,SinIntegral(Times(d,Plus(a,Times(b,Log(Times(c,Power(x,n)))))))),x),Dist(Times(b,d,n),Int(Times(Sin(Times(d,Plus(a,Times(b,Log(Times(c,Power(x,n))))))),Power(Times(d,Plus(a,Times(b,Log(Times(c,Power(x,n)))))),CN1)),x),x)),FreeQ(List(a,b,c,d,n),x))),
IIntegrate(6524,Int(CosIntegral(Times(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))),b_DEFAULT)),d_DEFAULT)),x_Symbol),
    Condition(Subtract(Simp(Times(x,CosIntegral(Times(d,Plus(a,Times(b,Log(Times(c,Power(x,n)))))))),x),Dist(Times(b,d,n),Int(Times(Cos(Times(d,Plus(a,Times(b,Log(Times(c,Power(x,n))))))),Power(Times(d,Plus(a,Times(b,Log(Times(c,Power(x,n)))))),CN1)),x),x)),FreeQ(List(a,b,c,d,n),x))),
IIntegrate(6525,Int(Times(Power(x_,CN1),$(F_,Times(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))),b_DEFAULT)),d_DEFAULT))),x_Symbol),
    Condition(Dist(Power(n,CN1),Subst(F(Times(d,Plus(a,Times(b,x)))),x,Log(Times(c,Power(x,n)))),x),And(FreeQ(List(a,b,c,d,n),x),MemberQ(List(SinIntegral,CosIntegral),x))))
  );
}
