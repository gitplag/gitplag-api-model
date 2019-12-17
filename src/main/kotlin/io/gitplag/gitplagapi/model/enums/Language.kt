package io.gitplag.gitplagapi.model.enums

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import io.gitplag.gitplagapi.model.util.LanguageDeserializer

/**
 * Name of a programming language of a repository.
 */
@JsonDeserialize(using = LanguageDeserializer::class)
enum class Language {
    C,
    CPP,
    JAVA,
    ML,
    PASCAL,
    ADA,
    LISP,
    SCHEME,
    HASKELL,
    FORTRAN,
    ASCII,
    VHDL,
    PERL,
    MATLAB,
    PYTHON,
    MIPS_ASSEMBLY,
    PROLOG,
    SPICE,
    VISUAL_BASIC,
    CSHARP,
    MODULA2,
    A8086_ASSEMBLY,
    JAVASCRIPT,
    PLSQL,
    VERILOG,
    TCL;

    /**
     * To moss name of the language
     */
    fun ofMoss() =
        when (this) {
            CPP -> "cc"
            MIPS_ASSEMBLY -> "mips"
            A8086_ASSEMBLY -> "a8086"
            VISUAL_BASIC -> "vb"
            else -> toString()
        }

    /**
     * To jplag name of the language
     */
    fun ofJPlag() =
        when (this) {
            C, CPP -> "c/c++"
            JAVA -> "java19"
            SCHEME -> "scheme"
            PYTHON -> "python3"
            CSHARP -> "c#-1.2"
            else -> "text"
        }

    override fun toString(): String = name.toLowerCase()
}