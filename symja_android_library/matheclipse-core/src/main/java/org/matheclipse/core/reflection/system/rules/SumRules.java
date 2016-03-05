package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.<br />
 * See GIT repository at: <a href="https://bitbucket.org/axelclk/symja_android_library">https://bitbucket.org/axelclk/symja_android_library under the tools directory</a>.
 */
public interface SumRules {
  final public static IAST RULES1 = List(
    ISetDelayed(Sum(Power(c_,i_),List(i_Symbol,C1,n_Symbol)),
      Condition(Times(c,Plus(Power(c,n),Negate(C1)),Power(Plus(c,Negate(C1)),-1)),And(FreeQ(c,i),FreeQ(n,i)))),
    ISetDelayed(Sum(Power(i_,k_Symbol),List(i_Symbol,C1,n_Symbol)),
      Condition(HarmonicNumber(n,Negate(k)),And(FreeQ(k,i),FreeQ(n,i)))),
    ISetDelayed(Sum(Ceiling(Log(i_)),List(i_Symbol,C1,n_Symbol)),
      Condition(Plus(Times(Plus(Times(Floor(Log(n)),Power(E,Plus(Floor(Log(n)),C1))),Times(CN1,Plus(Floor(Log(n)),C1),Power(E,Floor(Log(n)))),C1),Power(Plus(E,Negate(C1)),-1)),Times(Plus(n,Negate(Power(E,Floor(Log(n))))),Ceiling(Log(n)))),FreeQ(n,i))),
    ISetDelayed(Sum(Ceiling(Log(a_,i_)),List(i_Symbol,C1,n_Symbol)),
      Condition(Plus(Times(Plus(Times(Floor(Log(a,n)),Power(a,Plus(Floor(Log(a,n)),C1))),Times(CN1,Plus(Floor(Log(a,n)),C1),Power(a,Floor(Log(a,n)))),C1),Power(Plus(a,Negate(C1)),-1)),Times(Plus(n,Negate(Power(a,Floor(Log(a,n))))),Ceiling(Log(a,n)))),And(FreeQ(a,i),FreeQ(n,i)))),
    ISetDelayed(Sum(Factorial(i_),List(i_Symbol,C1,n_Symbol)),
      Condition(Plus(Times(Gamma(Plus(n,C2)),Power(CN1,Plus(n,C1)),Subfactorial(Plus(Negate(n),Negate(C2)))),Negate(Subfactorial(CN1)),Negate(C1)),FreeQ(n,i)))
  );
  final public static IAST RULES2 = List(
    ISetDelayed(Sum(Binomial(n_,i_),List(i_Symbol,C0,n_Symbol)),
      Condition(Power(C2,n),FreeQ(n,i))),
    ISetDelayed(Sum(Times(i_,Binomial(n_,i_)),List(i_Symbol,C0,n_Symbol)),
      Condition(Times(n,Power(C2,Plus(n,Negate(C1)))),FreeQ(n,i)))
  );
}
