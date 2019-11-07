package com.jxtxzzw.compiler.ast;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

class TokenJudgement {
    private static boolean isToken(ParseTree tree) {
        return tree != null && tree.getPayload() instanceof Token;
    }

    static Token getToken(ParseTree tree) {
        assert isToken(tree);
        return (Token) (tree.getPayload());
    }

    private static boolean isEqualTo(Token token, int type) {
        return token.getType() == type;
    }

    static boolean isTokenAndEqualTo(ParseTree tree, int type) {
        if (!isToken(tree)) {
            return false;
        }
        Token token = getToken(tree);
        return isEqualTo(token, type);
    }

    static boolean isTokenAndEqualTo(ParseTree tree, int[] types) {
        for (int i : types) {
            if (isTokenAndEqualTo(tree, i)) {
                return true;
            }
        }
        return false;
    }


}
