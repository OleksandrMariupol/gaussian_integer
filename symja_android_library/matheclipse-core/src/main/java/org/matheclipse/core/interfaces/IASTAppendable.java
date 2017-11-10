package org.matheclipse.core.interfaces;

import org.matheclipse.core.expression.F;

public interface IASTAppendable extends IASTMutable {

	/**
	 * Adds the specified expression at the end of this {@code List}.
	 * 
	 * @param expr
	 *            the object to add.
	 * @return always true.
	 * @throws UnsupportedOperationException
	 *             if adding to this {@code List} is not supported.
	 * @throws ClassCastException
	 *             if the class of the object is inappropriate for this {@code List}.
	 * @throws IllegalArgumentException
	 *             if the object cannot be added to this {@code List}.
	 */
	public boolean append(IExpr expr);

	/**
	 * Inserts the specified object into this {@code List} at the specified location. The object is inserted before the
	 * current element at the specified location. If the location is equal to the size of this {@code List}, the object
	 * is added at the end. If the location is smaller than the size of this {@code List}, then all elements beyond the
	 * specified location are moved by one position towards the end of the {@code List}.
	 * 
	 * @param location
	 *            the index at which to insert.
	 * @param object
	 *            the object to add.
	 * @throws UnsupportedOperationException
	 *             if adding to this {@code List} is not supported.
	 * @throws ClassCastException
	 *             if the class of the object is inappropriate for this {@code List}.
	 * @throws IllegalArgumentException
	 *             if the object cannot be added to this {@code List}.
	 * @throws IndexOutOfBoundsException
	 *             if {@code location < 0 || location > size()}
	 */
	public void append(int location, IExpr object);

	/**
	 * Appends all of the arguments (starting from offset <code>1</code>) in the specified AST to the end of this AST.
	 * 
	 * @param ast
	 *            AST containing elements to be added to this AST
	 * @return <tt>true</tt> if this AST changed as a result of the call
	 * 
	 */
	public boolean appendArgs(IAST ast);

	default boolean appendPlus(IExpr expr) {
		if (head().equals(F.Plus) && expr.head().equals(F.Plus)) {
			return appendArgs((IAST) expr);
		}
		return append(expr);
	}

	/**
	 * Get the range of elements [1..ast.size()[. These range elements are the arguments of a function (represented as
	 * an AST).
	 * 
	 * @return
	 */
	// public ASTRange args();

	/**
	 * Get the range of elements [0..ast.size()[ of the AST. This range elements are the head of the function prepended
	 * by the arguments of a function.
	 * 
	 * @return
	 */
	// public ASTRange range();

	/**
	 * Get the range of elements [start..sizeOfAST[ of the AST
	 * 
	 * @param start
	 *            the ranges start position (inclusive)
	 * @return
	 */
	// public ASTRange range(int start);

	/**
	 * Get the range of elements [start..end[ of the AST
	 * 
	 * @param start
	 *            the ranges start position ((inclusive)
	 * @param end
	 *            the ranges end position (exclusive)
	 * @return
	 */
	// public ASTRange range(int start, int end);
}
