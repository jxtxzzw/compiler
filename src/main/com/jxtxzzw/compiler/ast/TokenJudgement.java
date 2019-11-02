package com.jxtxzzw.compiler.ast;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

public class TokenJudgement {
    public static boolean isToken(ParseTree tree) {
        return tree.getPayload() instanceof Token;
    }

    public static Token getToken(ParseTree tree) {
        assert isToken(tree);
        return (Token)(tree.getPayload());
    }

    public static boolean isEqualTo(Token token, int type) {
        return token.getType() == type;
    }

    public static boolean isTokenAndEqualTo(ParseTree tree, int type) {
        if (!isToken(tree)){
            return false;
        }
        Token token = getToken(tree);
        return isEqualTo(token, type);
    }

    public static boolean isTokenAndEqualTo(ParseTree tree, int[] types) {
        for (int i: types) {
            if (isTokenAndEqualTo(tree, i)) {
                return true;
            }
        }
        return false;
    }





}
