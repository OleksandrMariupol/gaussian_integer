package org.matheclipse.core.patternmatching;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.matheclipse.core.eval.EvalAttributes;
import org.matheclipse.core.eval.EvalEngine;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.expression.Pattern;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IASTAppendable;
import org.matheclipse.core.interfaces.IASTMutable;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.IPatternObject;
import org.matheclipse.core.interfaces.IPatternSequence;
import org.matheclipse.core.interfaces.ISymbol;
import org.matheclipse.core.visit.VisitorReplaceAllWithPatternFlags;

/**
 * Interface for mapping ISymbol objects to int values.
 * 
 */
public interface IPatternMap extends Cloneable {
	/**
	 * The default priority when associating a new rule to a symbol. Lower values have higher priorities.
	 */
	public final static int DEFAULT_RULE_PRIORITY = Integer.MAX_VALUE;
	public final static PatternMap0 PATTERN_MAP0 = new PatternMap0();

	static final class PatternMap0 implements IPatternMap {
		private final static int SIZE = 0;

		@Override
		public IPatternMap clone() {
			return new PatternMap0();
		};

		@Override
		public IExpr[] copyPattern() {
			return new IExpr[] {};
		}

		@Override
		public void copyPatternValuesFromPatternMatcher(IPatternMap patternMap) {

		}

		public int get(IExpr patternOrSymbol) {
			// compare object references with operator '==' here !
			return -1;
		}

		@Override
		public boolean getRHSEvaluated() {
			return false; // evaluatedRHS;
		}

		@Override
		public IExpr getKey(int index) {
			return null;
		}

		@Override
		public IExpr getValue(int index) {
			return null;
		}

		@Override
		public IExpr getValue(IPatternObject pattern) {
			return null;
		}

		@Override
		public List<IExpr> getValuesAsList() {
			return new ArrayList<IExpr>(1);
		}

		@Override
		public void initPattern() {
		}

		@Override
		public boolean isAllPatternsAssigned() {
			return true;
		}

		public boolean isValueAssigned() {
			return false;
		}

		@Override
		public boolean isFreeOfPatternSymbols(IExpr substitutedExpr) {
			return true;
		}

		@Override
		public boolean isRuleWithoutPatterns() {
			return true;
		}

		@Override
		public void resetPattern(IExpr[] patternValuesArray) {
		}

		@Override
		public void setRHSEvaluated(boolean evaluated) {
		}

		@Override
		public boolean setValue(IPatternObject pattern, IExpr expr) {
			return false;
			// throw new IllegalStateException("Pattern:" + pattern + " is not available");
		}

		@Override
		public boolean setValue(IPatternSequence pattern, IAST sequence) {
			return false;
			// throw new IllegalStateException("Patternsequence:" + pattern + " is not available");
		}

		public int size() {
			return SIZE;
		}

		public IExpr substitute(IExpr symbolOrPatternObject) {
			return F.NIL;
		}

		@Override
		public IExpr substitutePatternOrSymbols(IExpr lhsPatternExpr, boolean onlyNamedPatterns) {
			return lhsPatternExpr;
		}

		@Override
		public IExpr substituteSymbols(IExpr rhsExpr) {
			return rhsExpr;
		};

		@Override
		public String toString() {
			StringBuilder buf = new StringBuilder();
			buf.append("Patterns[");
			buf.append("]");
			return buf.toString();
		}
	}

	static final class PatternMap1 implements IPatternMap {
		private final static int SIZE = 1;

		IExpr fSymbol1;
		IExpr fValue1;
		private transient boolean evaluatedRHS = false;

		@Override
		public IPatternMap clone() {
			PatternMap1 result = new PatternMap1();
			result.evaluatedRHS = false;
			result.fSymbol1 = this.fSymbol1;
			result.fValue1 = this.fValue1;
			return result;
		};

		@Override
		public IExpr[] copyPattern() {
			return new IExpr[] { this.fValue1 };
		}

		@Override
		public void copyPatternValuesFromPatternMatcher(IPatternMap patternMap) {
			for (int i = 0; i < patternMap.size(); i++) {
				// compare object references with operator '==' here !
				if (fSymbol1 == getKey(i)) {
					fValue1 = patternMap.getValue(i);
				}
			}
		}

		public int get(IExpr patternOrSymbol) {
			// compare object references with operator '==' here !
			return (patternOrSymbol == fSymbol1) ? 0 : -1;
		}

		@Override
		public boolean getRHSEvaluated() {
			return evaluatedRHS;
		}

		@Override
		public IExpr getKey(int index) {
			if (index == 0) {
				return fSymbol1;
			}
			return null;
		}

		@Override
		public IExpr getValue(int index) {
			if (index == 0) {
				return fValue1;
			}
			return null;
		}

		@Override
		public IExpr getValue(IPatternObject pattern) {
			IExpr sym = pattern.getSymbol();
			if (sym == null) {
				sym = pattern;
			}
			return (sym == fSymbol1) ? fValue1 : null;
		}

		@Override
		public List<IExpr> getValuesAsList() {
			if (fValue1 == null) {
				return null;
			}
			List<IExpr> args = new ArrayList<IExpr>(1);
			args.add(fValue1);
			return args;
		}

		@Override
		public void initPattern() {
			evaluatedRHS = false;
			fValue1 = null;
		}

		@Override
		public boolean isAllPatternsAssigned() {
			return fValue1 != null;
		}

		public boolean isValueAssigned() {
			if (fValue1 != null) {
				if (fSymbol1 instanceof ISymbol) {
					return true;
				}
			}
			return false;
		}

		@Override
		public boolean isFreeOfPatternSymbols(IExpr substitutedExpr) {
			if (isAllPatternsAssigned()) {
				return true;
			}
			return substitutedExpr.isFree(x -> {
				// compare object references with operator '==' here !
				return (fSymbol1 != x);
			}, true);
		}

		@Override
		public boolean isRuleWithoutPatterns() {
			return false;
		}

		@Override
		public void resetPattern(IExpr[] patternValuesArray) {
			evaluatedRHS = false;
			fValue1 = patternValuesArray[0];
		}

		@Override
		public void setRHSEvaluated(boolean evaluated) {
			evaluatedRHS = evaluated;
		}

		@Override
		public boolean setValue(IPatternObject pattern, IExpr expr) {
			ISymbol sym = pattern.getSymbol();
			IExpr temp = pattern;
			if (sym != null) {
				temp = sym;
			}
			if (temp == fSymbol1) {
				fValue1 = expr;
				if (fValue1.isOneIdentityAST1()) {
					fValue1 = fValue1.first();
				}
				return true;
			}
			return false;
			// throw new IllegalStateException("Pattern:" + pattern + " is not available");
		}

		@Override
		public boolean setValue(IPatternSequence pattern, IAST sequence) {
			ISymbol sym = pattern.getSymbol();
			IExpr temp = pattern;
			if (sym != null) {
				temp = sym;
			}
			if (temp == fSymbol1) {
				fValue1 = sequence;
				return true;
			}
			return false;
			// throw new IllegalStateException("Patternsequence:" + pattern + " is not available");
		}

		public int size() {
			return SIZE;
		}

		public IExpr substitute(IExpr symbolOrPatternObject) {
			// compare object references with operator '==' here !
			if (symbolOrPatternObject == fSymbol1) {
				return fValue1 != null ? fValue1 : F.NIL;
			}
			return F.NIL;
		}

		@Override
		public IExpr substituteSymbols(IExpr rhsExpr) {
			return rhsExpr.replaceAll((IExpr input) -> {
				if (input.isSymbol()) {
					// compare object references with operator '==' here !
					if ((ISymbol) input == fSymbol1) {
						return fValue1 != null ? fValue1 : F.NIL;
					}
				}
				return F.NIL;
			}).orElse(rhsExpr);
		};

		@Override
		public String toString() {
			StringBuilder buf = new StringBuilder();
			buf.append("Patterns[");
			buf.append(fSymbol1.toString());
			buf.append(" => ");
			if (fValue1 != null) {
				buf.append(fValue1.toString());
			} else {
				buf.append("?");
			}
			buf.append("]");
			return buf.toString();
		}
	}

	static class PatternMap2 implements IPatternMap {
		private final static int SIZE = 2;

		IExpr fSymbol1;
		IExpr fValue1;
		IExpr fSymbol2;
		IExpr fValue2;
		private transient boolean evaluatedRHS = false;

		@Override
		public IPatternMap clone() {
			PatternMap2 result = new PatternMap2();
			result.evaluatedRHS = false;
			result.fSymbol1 = this.fSymbol1;
			result.fValue1 = this.fValue1;
			result.fSymbol2 = this.fSymbol2;
			result.fValue2 = this.fValue2;
			return result;
		};

		@Override
		public IExpr[] copyPattern() {
			return new IExpr[] { this.fValue1, this.fValue2 };
		}

		@Override
		public void copyPatternValuesFromPatternMatcher(IPatternMap patternMap) {
			for (int i = 0; i < patternMap.size(); i++) {
				// compare object references with operator '==' here !
				IExpr temp = getKey(i);
				if (fSymbol1 == temp) {
					fValue1 = patternMap.getValue(i);
				} else if (fSymbol2 == temp) {
					fValue2 = patternMap.getValue(i);
				}
			}
		}

		public int get(IExpr patternOrSymbol) {
			// compare object references with operator '==' here !
			return (patternOrSymbol == fSymbol1) ? 0 : (patternOrSymbol == fSymbol2) ? 1 : -1;
		}

		@Override
		public boolean getRHSEvaluated() {
			return evaluatedRHS;
		}

		@Override
		public IExpr getKey(int index) {
			if (index == 0) {
				return fSymbol1;
			}
			if (index == 1) {
				return fSymbol2;
			}
			return null;
		}

		@Override
		public IExpr getValue(int index) {
			if (index == 0) {
				return fValue1;
			}
			if (index == 1) {
				return fValue2;
			}
			return null;
		}

		@Override
		public IExpr getValue(IPatternObject pattern) {
			IExpr sym = pattern.getSymbol();
			if (sym == null) {
				sym = pattern;
			}
			if (sym == fSymbol1) {
				return fValue1;
			}
			if (sym == fSymbol2) {
				return fValue2;
			}
			return null;
		}

		@Override
		public List<IExpr> getValuesAsList() {
			if (fValue1 == null || fValue2 == null) {
				return null;
			}
			List<IExpr> args = new ArrayList<IExpr>(2);
			args.add(fValue1);
			args.add(fValue2);
			return args;
		}

		@Override
		public void initPattern() {
			evaluatedRHS = false;
			fValue1 = null;
			fValue2 = null;
		}

		@Override
		public boolean isAllPatternsAssigned() {
			return fValue1 != null && fValue2 != null;
		}

		@Override
		public boolean isValueAssigned() {
			if (fValue1 != null) {
				if (fSymbol1 instanceof ISymbol) {
					return true;
				}
			}
			if (fValue2 != null) {
				if (fSymbol2 instanceof ISymbol) {
					return true;
				}
			}
			return false;
		}

		@Override
		public boolean isFreeOfPatternSymbols(IExpr substitutedExpr) {
			if (isAllPatternsAssigned()) {
				return true;
			}
			return substitutedExpr.isFree(x -> {
				// compare object references with operator '==' here !
				return (fSymbol1 != x) && (fSymbol2 != x);
			}, true);
		}

		@Override
		public boolean isRuleWithoutPatterns() {
			return false;
		}

		@Override
		public void resetPattern(IExpr[] patternValuesArray) {
			evaluatedRHS = false;
			fValue1 = patternValuesArray[0];
			fValue2 = patternValuesArray[1];
		}

		@Override
		public void setRHSEvaluated(boolean evaluated) {
			evaluatedRHS = evaluated;
		}

		@Override
		public boolean setValue(IPatternObject pattern, IExpr expr) {
			ISymbol sym = pattern.getSymbol();
			IExpr temp = pattern;
			if (sym != null) {
				temp = sym;
			}
			if (temp == fSymbol1) {
				fValue1 = expr;
				if (fValue1.isOneIdentityAST1()) {
					fValue1 = fValue1.first();
				}
				return true;
			}
			if (temp == fSymbol2) {
				fValue2 = expr;
				if (fValue2.isOneIdentityAST1()) {
					fValue2 = fValue2.first();
				}
				return true;
			}
			return false;
			// throw new IllegalStateException("Pattern:" + pattern + " is not available");
		}

		@Override
		public boolean setValue(IPatternSequence pattern, IAST sequence) {
			ISymbol sym = pattern.getSymbol();
			IExpr temp = pattern;
			if (sym != null) {
				temp = sym;
			}
			if (temp == fSymbol1) {
				fValue1 = sequence;
				return true;
			}
			if (temp == fSymbol2) {
				fValue2 = sequence;
				return true;
			}
			return false;
			// throw new IllegalStateException("Patternsequence:" + pattern + " is not available");
		}

		public int size() {
			return SIZE;
		}

		public IExpr substitute(IExpr symbolOrPatternObject) {
			// compare object references with operator '==' here !
			if (symbolOrPatternObject == fSymbol1) {
				return fValue1 != null ? fValue1 : F.NIL;
			}
			if (symbolOrPatternObject == fSymbol2) {
				return fValue2 != null ? fValue2 : F.NIL;
			}
			return F.NIL;
		}

		@Override
		public IExpr substituteSymbols(IExpr rhsExpr) {
			return rhsExpr.replaceAll((IExpr input) -> {
				if (input.isSymbol()) {
					// compare object references with operator '==' here !
					if ((ISymbol) input == fSymbol1) {
						return fValue1 != null ? fValue1 : F.NIL;
					}
					if ((ISymbol) input == fSymbol2) {
						return fValue2 != null ? fValue2 : F.NIL;
					}
				}
				return F.NIL;
			}).orElse(rhsExpr);
		};

		@Override
		public String toString() {
			StringBuilder buf = new StringBuilder();
			buf.append("Patterns[");
			buf.append(fSymbol1.toString());
			buf.append(" => ");
			if (fValue1 != null) {
				buf.append(fValue1.toString());
			} else {
				buf.append("?");
			}

			buf.append(", ");
			buf.append(fSymbol2.toString());
			buf.append(" => ");
			if (fValue2 != null) {
				buf.append(fValue2.toString());
			} else {
				buf.append("?");
			}

			buf.append("]");
			return buf.toString();
		}
	}

	static class PatternMap3 implements IPatternMap {
		private final static int SIZE = 3;

		IExpr fSymbol1;
		IExpr fValue1;
		IExpr fSymbol2;
		IExpr fValue2;
		IExpr fSymbol3;
		IExpr fValue3;
		private transient boolean evaluatedRHS = false;

		@Override
		public IPatternMap clone() {
			PatternMap3 result = new PatternMap3();
			result.evaluatedRHS = false;
			result.fSymbol1 = this.fSymbol1;
			result.fValue1 = this.fValue1;
			result.fSymbol2 = this.fSymbol2;
			result.fValue2 = this.fValue2;
			result.fSymbol3 = this.fSymbol3;
			result.fValue3 = this.fValue3;
			return result;
		};

		@Override
		public IExpr[] copyPattern() {
			return new IExpr[] { this.fValue1, this.fValue2, this.fValue3 };
		}

		@Override
		public void copyPatternValuesFromPatternMatcher(IPatternMap patternMap) {
			for (int i = 0; i < patternMap.size(); i++) {
				// compare object references with operator '==' here !
				IExpr temp = getKey(i);
				if (fSymbol1 == temp) {
					fValue1 = patternMap.getValue(i);
				} else if (fSymbol2 == temp) {
					fValue2 = patternMap.getValue(i);
				} else if (fSymbol3 == temp) {
					fValue3 = patternMap.getValue(i);
				}
			}
		}

		public int get(IExpr patternOrSymbol) {
			// compare object references with operator '==' here !
			return (patternOrSymbol == fSymbol1) ? 0
					: (patternOrSymbol == fSymbol2) ? 1 : (patternOrSymbol == fSymbol3) ? 2 : -1;
		}

		@Override
		public boolean getRHSEvaluated() {
			return evaluatedRHS;
		}

		@Override
		public IExpr getKey(int index) {
			if (index == 0) {
				return fSymbol1;
			}
			if (index == 1) {
				return fSymbol2;
			}
			if (index == 2) {
				return fSymbol3;
			}
			return null;
		}

		@Override
		public IExpr getValue(int index) {
			if (index == 0) {
				return fValue1;
			}
			if (index == 1) {
				return fValue2;
			}
			if (index == 2) {
				return fValue3;
			}
			return null;
		}

		@Override
		public IExpr getValue(IPatternObject pattern) {
			IExpr sym = pattern.getSymbol();
			if (sym == null) {
				sym = pattern;
			}
			if (sym == fSymbol1) {
				return fValue1;
			}
			if (sym == fSymbol2) {
				return fValue2;
			}
			if (sym == fSymbol3) {
				return fValue3;
			}
			return null;
		}

		@Override
		public List<IExpr> getValuesAsList() {
			if (isAllPatternsAssigned()) {
				List<IExpr> args = new ArrayList<IExpr>(2);
				args.add(fValue1);
				args.add(fValue2);
				args.add(fValue3);
				return args;
			} else {
				return null;
			}
		}

		@Override
		public void initPattern() {
			evaluatedRHS = false;
			fValue1 = null;
			fValue2 = null;
			fValue3 = null;
		}

		@Override
		public boolean isAllPatternsAssigned() {
			return fValue1 != null && fValue2 != null && fValue3 != null;
		}

		@Override
		public boolean isValueAssigned() {
			if (fValue1 != null) {
				if (fSymbol1 instanceof ISymbol) {
					return true;
				}
			}
			if (fValue2 != null) {
				if (fSymbol2 instanceof ISymbol) {
					return true;
				}
			}
			if (fValue3 != null) {
				if (fSymbol3 instanceof ISymbol) {
					return true;
				}
			}
			return false;
		}

		@Override
		public boolean isFreeOfPatternSymbols(IExpr substitutedExpr) {
			if (isAllPatternsAssigned()) {
				return true;
			}
			return substitutedExpr.isFree(x -> {
				// compare object references with operator '==' here !
				return (fSymbol1 != x) && (fSymbol2 != x) && (fSymbol3 != x);
			}, true);
		}

		@Override
		public boolean isRuleWithoutPatterns() {
			return false;
		}

		@Override
		public void resetPattern(IExpr[] patternValuesArray) {
			evaluatedRHS = false;
			fValue1 = patternValuesArray[0];
			fValue2 = patternValuesArray[1];
			fValue3 = patternValuesArray[2];
		}

		@Override
		public void setRHSEvaluated(boolean evaluated) {
			evaluatedRHS = evaluated;
		}

		@Override
		public boolean setValue(IPatternObject pattern, IExpr expr) {
			ISymbol sym = pattern.getSymbol();
			IExpr temp = pattern;
			if (sym != null) {
				temp = sym;
			}
			if (temp == fSymbol1) {
				fValue1 = expr;
				if (fValue1.isOneIdentityAST1()) {
					fValue1 = fValue1.first();
				}
				return true;
			}
			if (temp == fSymbol2) {
				fValue2 = expr;
				if (fValue2.isOneIdentityAST1()) {
					fValue2 = fValue2.first();
				}
				return true;
			}
			if (temp == fSymbol3) {
				fValue3 = expr;
				if (fValue3.isOneIdentityAST1()) {
					fValue3 = fValue3.first();
				}
				return true;
			}
			return false;
			// throw new IllegalStateException("Pattern:" + pattern + " is not available");
		}

		@Override
		public boolean setValue(IPatternSequence pattern, IAST sequence) {
			ISymbol sym = pattern.getSymbol();
			IExpr temp = pattern;
			if (sym != null) {
				temp = sym;
			}
			if (temp == fSymbol1) {
				fValue1 = sequence;
				return true;
			}
			if (temp == fSymbol2) {
				fValue2 = sequence;
				return true;
			}
			if (temp == fSymbol3) {
				fValue3 = sequence;
				return true;
			}
			// throw new IllegalStateException("Patternsequence:" + pattern + " is not available");
			return false;
		}

		public int size() {
			return SIZE;
		}

		public IExpr substitute(IExpr symbolOrPatternObject) {
			// compare object references with operator '==' here !
			if (symbolOrPatternObject == fSymbol1) {
				return fValue1 != null ? fValue1 : F.NIL;
			}
			if (symbolOrPatternObject == fSymbol2) {
				return fValue2 != null ? fValue2 : F.NIL;
			}
			if (symbolOrPatternObject == fSymbol3) {
				return fValue3 != null ? fValue3 : F.NIL;
			}
			return F.NIL;
		}

		@Override
		public IExpr substituteSymbols(IExpr rhsExpr) {
			return rhsExpr.replaceAll((IExpr input) -> {
				if (input.isSymbol()) {
					// compare object references with operator '==' here !
					if ((ISymbol) input == fSymbol1) {
						return fValue1 != null ? fValue1 : F.NIL;
					}
					if ((ISymbol) input == fSymbol2) {
						return fValue2 != null ? fValue2 : F.NIL;
					}
					if ((ISymbol) input == fSymbol3) {
						return fValue3 != null ? fValue3 : F.NIL;
					}
				}
				return F.NIL;
			}).orElse(rhsExpr);
		};

		@Override
		public String toString() {
			StringBuilder buf = new StringBuilder();
			buf.append("Patterns[");
			buf.append(fSymbol1.toString());
			buf.append(" => ");
			if (fValue1 != null) {
				buf.append(fValue1.toString());
			} else {
				buf.append("?");
			}

			buf.append(", ");
			buf.append(fSymbol2.toString());
			buf.append(" => ");
			if (fValue2 != null) {
				buf.append(fValue2.toString());
			} else {
				buf.append("?");
			}

			buf.append(", ");
			buf.append(fSymbol3.toString());
			buf.append(" => ");
			if (fValue3 != null) {
				buf.append(fValue3.toString());
			} else {
				buf.append("?");
			}

			buf.append("]");
			return buf.toString();
		}
	}

	/**
	 * A map from a pattern to a possibly found value during pattern-matching.
	 * 
	 */
	static class PatternMap implements IPatternMap, Serializable {

		private final static IExpr[] EMPTY_ARRAY = {};

		/**
		 * 
		 */
		private static final long serialVersionUID = -5384429232269800438L;

		/**
		 * If <code>true</code> the rule contains no pattern.
		 */
		boolean fRuleWithoutPattern;

		/**
		 * Contains the symbols of the patterns or the pattern objects itself. The corresponding value (or
		 * <code>null</code>) is stored in <code>fSymbolsOrPatternValues</code>.
		 */
		IExpr[] fSymbolsOrPattern;

		/**
		 * Contains the current values (or <code>null</code>) of the symbols of the patterns or the pattern objects
		 * itself. The corresponding symbol or pattern is stored in <code>fSymbolsOrPattern</code>.
		 */
		IExpr[] fSymbolsOrPatternValues;

		private transient boolean evaluatedRHS = false;

		public PatternMap() {
			this(EMPTY_ARRAY);
		}

		private PatternMap(IExpr[] exprArray) {
			this.fRuleWithoutPattern = true;
			this.fSymbolsOrPatternValues = exprArray;
		}

		@Override
		public IPatternMap clone() {
			PatternMap result = new PatternMap(null);
			result.evaluatedRHS = false;
			// don't clone the fSymbolsOrPattern array which is final after the #determinePatterns() method
			result.fSymbolsOrPattern = this.fSymbolsOrPattern;
			// avoid Arrays.copyOf because of Android version
			final int length = this.fSymbolsOrPatternValues.length;
			result.fSymbolsOrPatternValues = new IExpr[length];
			System.arraycopy(this.fSymbolsOrPatternValues, 0, result.fSymbolsOrPatternValues, 0, length);
			result.fRuleWithoutPattern = this.fRuleWithoutPattern;
			return result;
		}

		/**
		 * Copy the current values into a new array.
		 * 
		 * @return
		 * @see PatternMap#resetPattern(IExpr[])
		 */
		public IExpr[] copyPattern() {
			final int length = this.fSymbolsOrPatternValues.length;
			IExpr[] patternValuesArray = new IExpr[length];
			System.arraycopy(this.fSymbolsOrPatternValues, 0, patternValuesArray, 0, length);
			return patternValuesArray;
		}

		/**
		 * Copy the found pattern matches from the given <code>patternMap</code> back to this maps pattern values.
		 * 
		 * @param patternMap
		 */
		public void copyPatternValuesFromPatternMatcher(final IPatternMap patternMap) {
			for (int i = 0; i < patternMap.size(); i++) {
				for (int j = 0; j < fSymbolsOrPattern.length; j++) {
					// compare object references with operator '==' here !
					if (fSymbolsOrPattern[j] == patternMap.getKey(i)) {
						fSymbolsOrPatternValues[j] = patternMap.getValue(i);
					}
				}
			}
		}

		/** {@inheritDoc} */
		@Override
		public int get(IExpr patternOrSymbol) {
			final int length = fSymbolsOrPattern.length;
			for (int i = 0; i < length; i++) {
				// compare object references with operator '==' here !
				if (patternOrSymbol == fSymbolsOrPattern[i]) {
					return i;
				}
			}
			return -1;
		}

		public final boolean getRHSEvaluated() {
			return evaluatedRHS;
		}

		@Override
		public IExpr getKey(int index) {
			if (index < fSymbolsOrPattern.length) {
				return fSymbolsOrPattern[index];
			}
			return null;
		}

		/**
		 * Return the matched value for the given <code>index</code> if possisble.
		 * 
		 * @return <code>null</code> if no matched expression exists
		 */
		public IExpr getValue(int index) {
			if (index < fSymbolsOrPatternValues.length) {
				return fSymbolsOrPatternValues[index];
			}
			return null;
		}

		/**
		 * Return the matched value for the given pattern object
		 * 
		 * @param pattern
		 *            the pattern object
		 * @return <code>null</code> if no matched expression exists
		 */
		public IExpr getValue(IPatternObject pattern) {
			ISymbol sym = pattern.getSymbol();
			if (sym != null) {
				return val(sym);
			}
			IExpr temp = pattern;

			int indx = get(temp);
			return indx >= 0 ? fSymbolsOrPatternValues[indx] : null;
		}

		/**
		 * Return the matched value for the given symbol
		 * 
		 * @param symbol
		 *            the symbol
		 * @return <code>null</code> if no matched expression exists
		 */
		public final IExpr val(ISymbol symbol) {
			int indx = get(symbol);
			return indx >= 0 ? fSymbolsOrPatternValues[indx] : null;
		}

		public List<IExpr> getValuesAsList() {
			final int length = fSymbolsOrPatternValues.length;
			List<IExpr> args = new ArrayList<IExpr>(length);
			for (int i = 0; i < length; i++) {
				IExpr arg = fSymbolsOrPatternValues[i];
				if (arg == null) {
					return null;
				}
				args.add(arg);
			}
			return args;
		}

		/**
		 * Set all pattern values to <code>null</code>;
		 */
		public final void initPattern() {
			evaluatedRHS = false;
			Arrays.fill(fSymbolsOrPatternValues, null);
		}

		/**
		 * Check if all symbols in the symbols array have corresponding values assigned.
		 * 
		 * @return
		 */
		public boolean isAllPatternsAssigned() {
			if (fSymbolsOrPatternValues != null) {
				// all patterns have values assigned?
				final int length = fSymbolsOrPatternValues.length;
				for (int i = length - 1; i >= 0; i--) {
					if (fSymbolsOrPatternValues[i] == null) {
						return false;
					}
				}
			}
			return true;
		}

		public boolean isValueAssigned() {
			if (fSymbolsOrPatternValues != null) {
				// at least one pattern has a value assigned?
				final int length = fSymbolsOrPatternValues.length;
				for (int i = 0; i < length; i++) {
					if (fSymbolsOrPatternValues[i] != null) {
						if (fSymbolsOrPattern[i] instanceof ISymbol) {
							return true;
						}
					}
				}
			}
			return false;
		}

		/**
		 * Returns true if the given expression contains no patterns
		 * 
		 * @return
		 */
		public boolean isRuleWithoutPatterns() {
			return fRuleWithoutPattern;
		}

		/**
		 * Check if the substituted expression still contains a symbol of a pattern expression.
		 * 
		 * @param substitutedExpr
		 * @return
		 */
		public boolean isFreeOfPatternSymbols(IExpr substitutedExpr) {
			if (isAllPatternsAssigned()) {
				return true;
			}
			if (fSymbolsOrPattern != null) {
				return substitutedExpr.isFree(x -> {
					final int length = fSymbolsOrPattern.length;
					for (int i = 0; i < length; i++) {
						// compare object references with operator '==' here !
						if (fSymbolsOrPattern[i] == x) {
							return false;
						}
					}
					return true;
				}, true);

			}
			return true;
		}

		/**
		 * Reset the values to the values in the given array
		 * 
		 * @param patternValuesArray
		 * @see PatternMap#copyPattern()
		 */
		public final void resetPattern(final IExpr[] patternValuesArray) {
			evaluatedRHS = false;
			System.arraycopy(patternValuesArray, 0, fSymbolsOrPatternValues, 0, fSymbolsOrPatternValues.length);
		}

		// public boolean isPatternTest(IExpr expr, IExpr patternTest, EvalEngine engine) {
		// final IExpr temp = substitutePatternOrSymbols(expr).orElse(expr);
		// final IASTMutable test = (IASTMutable) F.unaryAST1(patternTest, null);
		// if (temp.isSequence()) {
		// return ((IAST) temp).forAll((x, i) -> {
		// test.set(1, x);
		// return engine.evalTrue(test);
		// }, 1);
		// }
		// test.set(1, temp);
		// if (!engine.evalTrue(test)) {
		// return false;
		// }
		// return true;
		// }

		public final void setRHSEvaluated(boolean evaluated) {
			evaluatedRHS = evaluated;
		}

		public boolean setValue(IPatternObject pattern, IExpr expr) {
			ISymbol sym = pattern.getSymbol();
			IExpr temp = pattern;
			if (sym != null) {
				temp = sym;
			}
			int indx = get(temp);
			if (indx >= 0) {
				if (expr.isOneIdentityAST1()) {
					fSymbolsOrPatternValues[indx] = expr.first();
				} else {
					fSymbolsOrPatternValues[indx] = expr;
				}
				return true;
			}
			return false;
			// throw new IllegalStateException("Pattern:" + pattern + " is not available");
		}

		public boolean setValue(IPatternSequence pattern, IAST sequence) {
			ISymbol sym = pattern.getSymbol();
			IExpr temp = pattern;
			if (sym != null) {
				temp = sym;
			}
			int indx = get(temp);
			if (indx >= 0) {
				fSymbolsOrPatternValues[indx] = sequence;
				return true;
			}
			return false;
			// throw new IllegalStateException("Patternsequence:" + pattern + " is not available");
		}

		/** {@inheritDoc} */
		@Override
		public int size() {
			if (fSymbolsOrPattern != null) {
				return fSymbolsOrPattern.length;
			}
			return 0;
		}

		public IExpr substitute(IExpr symbolOrPatternObject) {
			final int length = fSymbolsOrPattern.length;
			for (int i = 0; i < length; i++) {
				// compare object references with operator '==' here !
				if (symbolOrPatternObject == fSymbolsOrPattern[i]) {
					return fSymbolsOrPatternValues[i] != null ? fSymbolsOrPatternValues[i] : F.NIL;
				}
			}
			return F.NIL;
		}

		/**
		 * Substitute all symbols in the given expression with the current value of the corresponding internal pattern
		 * values arrays
		 * 
		 * @param rhsExpr
		 *            right-hand-side expression, substitute all symbols from the pattern-matching values
		 * 
		 * @return
		 */
		public IExpr substituteSymbols(final IExpr rhsExpr) {
			if (fSymbolsOrPatternValues != null) {
				return rhsExpr.replaceAll((IExpr input) -> {
					if (input.isSymbol()) {
						final ISymbol symbol = (ISymbol) input;
						final int length = fSymbolsOrPattern.length;
						for (int i = 0; i < length; i++) {
							// compare object references with operator '==' here !
							if (symbol == fSymbolsOrPattern[i]) {
								return fSymbolsOrPatternValues[i] != null ? fSymbolsOrPatternValues[i] : F.NIL;
							}
						}
					}
					return F.NIL;
				}

				).orElse(rhsExpr);
			}
			return rhsExpr;
		}

		@Override
		public String toString() {
			if (fSymbolsOrPattern != null) {
				StringBuilder buf = new StringBuilder();
				buf.append("Patterns[");
				int length = fSymbolsOrPattern.length;
				for (int i = 0; i < length; i++) {
					buf.append(fSymbolsOrPattern[i].toString());
					buf.append(" => ");
					if (fSymbolsOrPatternValues[i] != null) {
						buf.append(fSymbolsOrPatternValues[i].toString());
					} else {
						buf.append("?");
					}
					if (i < length - 1) {
						buf.append(", ");
					}
				}
				buf.append("]");
				return buf.toString();
			}
			return "PatternMap[]";
		}

		public IExpr[] getSymbolsOrPattern() {
			return fSymbolsOrPattern;
		}

		public IExpr[] getSymbolsOrPatternValues() {
			return fSymbolsOrPatternValues;
		}
	}

	/**
	 * Set the index of <code>fPatternSymbolsArray</code> where the <code>pattern</code> stores it's assigned value
	 * during pattern matching.
	 * 
	 * @param patternIndexMap
	 * @param pattern
	 */
	static void addPattern(List<IExpr> patternIndexMap, IPatternObject pattern) {
		ISymbol sym = pattern.getSymbol();
		if (sym != null) {
			for (int i = 0; i < patternIndexMap.size(); i++) {
				if (patternIndexMap.get(i) == sym) {
					return;
				}
			}
			patternIndexMap.add(sym);
			return;
		}
		patternIndexMap.add(pattern);
	}

	/**
	 * Determine all patterns (i.e. all objects of instance IPattern) in the given expression
	 * 
	 * Increments this classes pattern counter.
	 * 
	 * @param lhsPatternExpr
	 *            the (left-hand-side) expression which could contain pattern objects.
	 * @return the priority of this pattern-matcher
	 */
	static IPatternMap determinePatterns(final IExpr lhsPatternExpr, int[] priority) {
		// int[] priority = new int[] { DEFAULT_RULE_PRIORITY };

		if (lhsPatternExpr instanceof IAST) {
			List<IExpr> patternIndexMap = new ArrayList<IExpr>();
			boolean[] ruleWithoutPattern = new boolean[] { true };
			determinePatternsRecursive(patternIndexMap, (IAST) lhsPatternExpr, priority, ruleWithoutPattern, 1);
			final int size = patternIndexMap.size();
			switch (size) {
			case 1:
				PatternMap1 patternMap1 = new PatternMap1();
				patternMap1.fSymbol1 = patternIndexMap.get(0);
				return patternMap1;
			case 2:
				PatternMap2 patternMap2 = new PatternMap2();
				patternMap2.fSymbol1 = patternIndexMap.get(0);
				patternMap2.fSymbol2 = patternIndexMap.get(1);
				return patternMap2;
			case 3:
				PatternMap3 patternMap3 = new PatternMap3();
				patternMap3.fSymbol1 = patternIndexMap.get(0);
				patternMap3.fSymbol2 = patternIndexMap.get(1);
				patternMap3.fSymbol3 = patternIndexMap.get(2);
				return patternMap3;
			}
			PatternMap patternMap = new PatternMap();
			patternMap.fRuleWithoutPattern = ruleWithoutPattern[0];
			patternMap.fSymbolsOrPattern = new IExpr[size];
			patternMap.fSymbolsOrPatternValues = new IExpr[size];
			int i = 0;
			for (IExpr entry : patternIndexMap) {
				patternMap.fSymbolsOrPattern[i++] = entry;
			}
			return patternMap;
		} else if (lhsPatternExpr instanceof IPatternObject) {
			// patternMap.addSinglePattern((IPatternObject) lhsPatternExpr);
			PatternMap1 patternMap1 = new PatternMap1();
			IPatternObject pattern = (IPatternObject) lhsPatternExpr;
			final ISymbol sym = pattern.getSymbol();
			patternMap1.fSymbol1 = (sym != null) ? sym : pattern;
			return patternMap1;
		}
		return PATTERN_MAP0;
	}

	/**
	 * Determine all patterns (i.e. all objects of instance IPattern) in the given expression
	 * 
	 * Increments this classes pattern counter.
	 * 
	 * @param patternIndexMap
	 * @param lhsPatternExpr
	 *            the (left-hand-side) expression which could contain pattern objects.
	 * @param treeLevel
	 *            the level of the tree where the patterns are determined
	 */
	static int determinePatternsRecursive(List<IExpr> patternIndexMap, final IAST lhsPatternExpr, int[] priority,
			boolean[] ruleWithoutPattern, int treeLevel) {
		if (lhsPatternExpr.isAlternatives() || lhsPatternExpr.isExcept()) {
			ruleWithoutPattern[0] = false;
		}
		int[] listEvalFlags = new int[] { IAST.NO_FLAG };
		lhsPatternExpr.forEach(x -> {
			if (x.isAST()) {
				final IAST lhsPatternAST = (IAST) x;
				if (lhsPatternAST.isPatternMatchingFunction()) {
					listEvalFlags[0] |= IAST.CONTAINS_PATTERN;
				}
				listEvalFlags[0] |= determinePatternsRecursive(patternIndexMap, lhsPatternAST, priority,
						ruleWithoutPattern, treeLevel + 1);
				priority[0] -= 11;
				if (x.isPatternDefault()) {
					listEvalFlags[0] |= IAST.CONTAINS_DEFAULT_PATTERN;
				}
			} else if (x instanceof IPatternObject) {
				ruleWithoutPattern[0] = false;
				int[] result = ((IPatternObject) x).addPattern(patternIndexMap);
				listEvalFlags[0] |= result[0];
				priority[0] -= result[1];
			} else {
				priority[0] -= (50 - treeLevel);
			}
		}, 0);
		lhsPatternExpr.setEvalFlags(listEvalFlags[0]);
		// disable flag "pattern with default value"
		// listEvalFlags &= IAST.CONTAINS_NO_DEFAULT_PATTERN_MASK;
		return listEvalFlags[0];
	}

	public IPatternMap clone();

	/**
	 * Copy the current values into a new array.
	 * 
	 * @return
	 * @see PatternMap#resetPattern(IExpr[])
	 */
	public IExpr[] copyPattern();

	/**
	 * Copy the found pattern matches from the given <code>patternMap</code> back to this maps pattern values.
	 * 
	 * @param patternMap
	 */
	public void copyPatternValuesFromPatternMatcher(final IPatternMap patternMap);

	/**
	 * Get the <code>int</code> value mapped to the given pattern or symbol.
	 * 
	 * @param patternOrSymbol
	 *            the given pattern or symbol
	 * @return <code>-1</code> if the symbol isn't available in this map.
	 */
	public int get(IExpr patternOrSymbol);

	public boolean getRHSEvaluated();

	public IExpr getKey(int index);

	/**
	 * Return the matched value for the given <code>index</code> if possisble.
	 * 
	 * @return <code>null</code> if no matched expression exists
	 */
	public IExpr getValue(int index);

	/**
	 * Return the matched value for the given pattern object
	 * 
	 * @param pattern
	 *            the pattern object
	 * @return <code>null</code> if no matched expression exists
	 */
	public IExpr getValue(IPatternObject pattern);

	public List<IExpr> getValuesAsList();

	/**
	 * Set all pattern values to <code>null</code>;
	 */
	public void initPattern();

	/**
	 * Check if all symbols in the symbols array have corresponding values assigned.
	 * 
	 * @return
	 */
	public boolean isAllPatternsAssigned();

	/**
	 * Check if the substituted expression still contains a symbol of a pattern expression.
	 * 
	 * @param substitutedExpr
	 * @return
	 */
	public boolean isFreeOfPatternSymbols(IExpr substitutedExpr);

	default boolean isPatternTest(IExpr expr, IExpr patternTest, EvalEngine engine) {
		final IExpr temp = substitutePatternOrSymbols(expr, false).orElse(expr);
		final IASTMutable test = (IASTMutable) F.unaryAST1(patternTest, null);
		if (temp.isSequence()) {
			return ((IAST) temp).forAll((x, i) -> {
				test.set(1, x);
				return engine.evalTrue(test);
			}, 1);
		}
		test.set(1, temp);
		if (!engine.evalTrue(test)) {
			return false;
		}
		return true;
	}

	/**
	 * Returns true if the pattern matcher contains no patterns
	 * 
	 * @return
	 */
	public boolean isRuleWithoutPatterns();

	/**
	 * Returns true if the pattern matcher contains at least one value assigned.
	 * 
	 * @return
	 */
	public boolean isValueAssigned();

	/**
	 * Reset the values to the values in the given array
	 * 
	 * @param patternValuesArray
	 * @see PatternMap#copyPattern()
	 */
	public void resetPattern(final IExpr[] patternValuesArray);

	public void setRHSEvaluated(boolean evaluated);

	/**
	 * Assign the value to the pattern.
	 * 
	 * @param pattern
	 *            the pattern expression
	 * @param expr
	 * @return <code>true</code> if assignment was successful, <code>false</code> otherwise.
	 */
	public boolean setValue(IPatternObject pattern, IExpr expr);

	/**
	 * Assign the sequence to the pattern sequence.
	 * 
	 * @param pattern
	 *            the pattern sequence expression
	 * @param sequence
	 * @return <code>true</code> if assignment was successful, <code>false</code> otherwise.
	 */
	public boolean setValue(IPatternSequence pattern, IAST sequence);

	/**
	 * Gives the number of symbols used in this map.
	 * 
	 * @return the number of symbols used in this map.
	 */
	public int size();

	public IExpr substitute(IExpr symbolOrPatternObject);

	/**
	 * Substitute all patterns and symbols in the given expression with the current value of the corresponding internal
	 * pattern values arrays
	 * 
	 * @param lhsPatternExpr
	 *            left-hand-side expression which may contain pattern objects
	 * @param onlyNamedPatterns
	 *            TODO
	 * 
	 * @return <code>F.NIL</code> if substitutions isn't possible
	 */
	default IExpr substitutePatternOrSymbols(final IExpr lhsPatternExpr, boolean onlyNamedPatterns) {
		VisitorReplaceAllWithPatternFlags visitor = new VisitorReplaceAllWithPatternFlags(input -> {
			if (input instanceof IPatternObject) {
				if (onlyNamedPatterns && !(input instanceof Pattern)) {
					return F.NIL;
				}
				IExpr symbolOrPatternObject = ((IPatternObject) input).getSymbol();
				if (symbolOrPatternObject == null) {
					if (onlyNamedPatterns) {
						return F.NIL;
					}
					symbolOrPatternObject = input;
				}
				return substitute(symbolOrPatternObject);
			}
			return F.NIL;
		}, onlyNamedPatterns);
		IExpr result = lhsPatternExpr.accept(visitor);

		if (result.isPresent()) {
			// set the eval flags
			result.isFreeOfPatterns();
			return result;
		}
		return lhsPatternExpr;
	}

	default IExpr substituteASTPatternOrSymbols(final IAST lhsPatternExpr, boolean onlyNamedPatterns) {
		VisitorReplaceAllWithPatternFlags visitor = new VisitorReplaceAllWithPatternFlags(input -> {
			if (input instanceof IPatternObject) {
				if (onlyNamedPatterns && !(input instanceof Pattern)) {
					return F.NIL;
				}
				IExpr symbolOrPatternObject = ((IPatternObject) input).getSymbol();
				if (symbolOrPatternObject == null) {
					if (onlyNamedPatterns) {
						return F.NIL;
					}
					symbolOrPatternObject = input;
				}
				return substitute(symbolOrPatternObject);
			}
			return F.NIL;
		}, onlyNamedPatterns);

		IASTMutable result = F.NIL;
		for (int i = 1; i < lhsPatternExpr.size(); i++) {
			IExpr temp = lhsPatternExpr.get(i).accept(visitor);
			if (temp.isPresent()) {
				if (!result.isPresent()) {
					result = lhsPatternExpr.setAtCopy(i, temp);
					// result.setEvalFlags(lhsPatternExpr.getEvalFlags());
				} else {
					result.set(i, temp);
				}
			}
		}

		if (result.isPresent()) {
			return EvalAttributes.simpleEval(result);

			// if (result.isFlatAST()) {
			// IASTMutable temp = EvalAttributes.flattenDeep((IAST) result);
			// if (temp.isPresent()) {
			// result = temp;
			// }
			// }
			// // don't test for OneIdentity attribute here !
			// if (result.isOrderlessAST()) {
			// EvalAttributes.sort(result);
			// }
			// // set the eval flags
			// result.isFreeOfPatterns();
			// // System.out.println(" " + lhsPatternExpr.toString() + " -> " + result.toString());
			// return result;
		}
		return F.NIL;
	}

	/**
	 * Substitute all symbols in the given expression with the current value of the corresponding internal pattern
	 * values arrays
	 * 
	 * @param rhsExpr
	 *            right-hand-side expression, substitute all symbols from the pattern-matching values
	 * 
	 * @return
	 */
	public IExpr substituteSymbols(final IExpr rhsExpr);

}
