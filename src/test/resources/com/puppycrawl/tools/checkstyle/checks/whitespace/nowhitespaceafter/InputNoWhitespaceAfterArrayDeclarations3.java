package com.puppycrawl.tools.checkstyle.checks.whitespace.nowhitespaceafter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class InputNoWhitespaceAfterArrayDeclarations3
{
    public void testWithAnnotationInMidle1(final char @NonNull [] a) {}//Correct
    public void testWithAnnotationInMidle2(final char@NonNull [] a) {}//Correct
    public void testWithAnnotationInMidle3(final char @NonNull[] a) {}//Correct
    public void testWithAnnotationInMidle4(final char@NonNull[]a) {}//Correct

    @Target(ElementType.TYPE_USE)
    @interface NonNull {
    }
}
