public IComplex integerPartDivisionGaussian (final IComplex parm1) 
{ 

    IRational numeratorReal = fReal.multiply(parm1.getRealPart()).subtract(fImaginary.multiply(parm1.getImaginaryPart().negate()));

    IRational numeratorImaginary = fReal.multiply(parm1.getImaginaryPart().negate()).add(parm1.getRealPart().multiply(fImaginary));

    IRational denominator1 = parm1.getRealPart().multiply(parm1.getRealPart()).add(parm1.getImaginaryPart().multiply(parm1.getImaginaryPart()));

    IRational remainderReal = numeratorReal.remainder(denominator1); 
    IRational remainderImaginary = numeratorImaginary.remainder(denominator1);

    if (denominator1.intValue() == 0) {
        return null;
    }

    if (remainderReal.intValue() == 0 && remainderImaginary.intValue() == 0) {
        divisionReal = numeratorReal.divide(denominator1);
        divisionImaginary = numeratorImaginary.divide(denominator1);
        
        return ComplexSym.valueOf(
                remainderReal,
                remainderImaginary
            );
    } else {

        if (denominator1.subtract(remainderReal).compareTo(remainderReal) == -1 || denominator1.subtract(remainderReal).compareTo(remainderReal) == 0) { 
            divisionReal = numeratorReal.divide(denominator1).add(BigInteger.ONE);
        } else {
             divisionReal = numeratorReal.divide(denominator1);
        }

        if (denominator1.subtract(remainderImaginary).compareTo(remainderImaginary) == -1 || denominator1.subtract(remainderImaginary).compareTo(remainderImaginary) == 0) { 
            divisionImaginary = numeratorImaginary.divide(denominator1).add(BigInteger.ONE);
        } else {
            divisionImaginary = numeratorImaginary.divide(denominator1);
        }

        return ComplexSym.valueOf(
                remainderReal,
                remainderImaginary
            );
    } 
} 